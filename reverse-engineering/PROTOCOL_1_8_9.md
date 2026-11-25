# Protocol 1.8.9 (Java Edition) — Wire Specification

**Protocol version: 47.** Every fact below is **Verified** from the decompiled client jar
unless tagged otherwise. Packet tables: `PACKET_REFERENCE.md`. Pipeline: `NETWORK_ARCHITECTURE.md`.

## 1. Transport and framing

TCP stream. Each frame:

```
frame    := length:VarInt(1..3 bytes, max 2^21-1) payload:byte[length]
payload  := packetId:VarInt fields...
```

VarInt = 7-bit groups, little-endian, high bit = continuation, max 5 bytes for packet data
(fields), max 3 bytes for the frame length. VarLong exists (`readVarLong`, used by
S44PacketWorldBorder `timeUntilTarget`). Strings on the wire = `VarInt byteLength` +
Modified-UTF-8 bytes; every string field has a character limit (see `PACKET_REFERENCE.md`).

When compression is enabled (login-time negotiation): `payload := dataLength:VarInt data…`
where `dataLength=0` means `data` is an uncompressed packet body, else `data` inflates to
exactly `dataLength` bytes (2 MiB cap). When encryption is enabled, the whole frame stream is
wrapped in AES-128-CFB8 (continuous stream cipher).

## 2. Connection state machine

States (`el`/EnumConnectionState, ids): `HANDSHAKING (-1)`, `PLAY (0)`, `STATUS (1)`, `LOGIN (2)`.

```
TCP connect
   │  C→S 0x00 Handshake {protocolVersion=47, ip, port, requestedState}
   ├──────────── requestedState = STATUS (1) ────► STATUS state
   │                                                  C→S 0x00 ServerQuery (empty)
   │                                                  S→C 0x00 ServerInfo {json}
   │                                                  C→S 0x01 Ping {clientTime:i64}
   │                                                  S→C 0x01 Pong {clientTime:i64}
   │                                                  (connection closed)
   └──────────── requestedState = LOGIN (2) ─────► LOGIN state
                                                      C→S 0x00 LoginStart {name}
                                                      [if server requires auth]
                                                      S→C 0x01 EncryptionRequest {hashedServerId, publicKey, verifyToken}
                                                      C→S 0x01 EncryptionResponse {secretKeyEncrypted, verifyTokenEncrypted}
                                                      both sides enable AES-CFB8
                                                      [optional] S→C 0x03 SetCompression {threshold}
                                                      both sides enable compression (except local-channel)
                                                      S→C 0x02 LoginSuccess {uuidString(36), name(16)}
                                                      ►► PLAY state (server switches right after sending; client after receiving)
```

Handshake version check (server side, `ln`/NetHandlerHandshakeTCP.processHandshake, verified):

| received protocolVersion | server action |
|---|---|
| > 47 | login state + `S00PacketDisconnect("Outdated server! I'm still on 1.8.9")`, close |
| < 47 | login state + `S00PacketDisconnect("Outdated client! Please use 1.8.9")`, close |
| = 47 | `setNetHandler(NetHandlerLoginServer)` proceed |

Note the asymmetry: the version-mismatch disconnect is sent **in the LOGIN state** (state is
switched before the check) — a Rust client should accept `S00PacketDisconnect` early in login.

## 3. Status protocol

| Dir | ID | Packet | Fields |
|---|---|---|---|
| C→S | 0x00 | `jv` C00PacketServerQuery | *(empty)* |
| S→C | 0x00 | `jr` S00PacketServerInfo | `response`: String(≤32767) = JSON `ServerStatusResponse` |
| C→S | 0x01 | `ju` C01PacketPing | `clientTime`: int64 |
| S→C | 0x01 | `jq` S01PacketPong | `clientTime`: int64 (echo) |

`ServerStatusResponse` JSON (Gson, custom serializers `js$b`, `js$a$a`, `js$c$a` — verified class
`js`): `{"description": IChatComponent, "players": {"max": int, "online": int, "sample": [{"name","id"}]}, "version": {"name": string, "protocol": int}, "favicon": "data:image/png;base64,…"}`.
The client-side pinger (`avo`-family GUI `ServerListEntryNormal`/`ServerStatusPinger`) computes
latency from the ping round trip.

## 4. Login protocol (detail)

| Dir | ID | Packet | Fields (wire order) |
|---|---|---|---|
| C→S | 0x00 | `jl` C00PacketLoginStart | `name`: String(16) |
| S→C | 0x01 | `jh` S01PacketEncryptionRequest | `hashedServerId`: String(20), `publicKey`: byte[] (VarInt len + X.509), `verifyToken`: byte[] (VarInt len, 4 bytes) |
| C→S | 0x01 | `jm` C01PacketEncryptionResponse | `secretKeyEncrypted`: byte[] (RSA-wrapped AES key), `verifyTokenEncrypted`: byte[] (RSA-wrapped token) |
| S→C | 0x03 | `ji` S03PacketEnableCompression | `compressionTreshold`: VarInt |
| S→C | 0x02 | `jg` S02PacketLoginSuccess | `uuid`: String(36) ("xxxxxxxx-xxxx-…"), `name`: String(16) |
| S→C | 0x00 | `jj` S00PacketDisconnect | `reason`: String = IChatComponent JSON |

Client processing (verified `bcx`/NetHandlerLoginClient):

1. **On EncryptionRequest**: generate 128-bit AES `SecretKey` (`ng.createNewKey()`); compute
   the session-join hash: `new BigInteger(SHA1(serverIdBytes(ISO-8859-1) + secretKey.encoded + publicKey.encoded)).toString(16)`
   (`ng.getServerIdHash`, digest constant `SHA-1` verified; big-endian two's-complement hex
   with no leading zero suppression beyond BigInteger semantics — this exact string is what
   session servers validate); call Yggdrasil `MinecraftSessionService.joinServer(accessToken, profileId, hash)`.
   On `AuthenticationUnavailableException` → disconnect
   `"disconnect.loginFailedInfo.serversUnavailable"`; `InvalidCredentialsException` →
   `"disconnect.loginFailedInfo.invalidSession"`; other auth errors → message.
   (LAN-server exception: if `currentServerData.isLanServer()` auth failure is only warned
   `"Couldn't connect to auth servers but will continue to join LAN"`.)
2. Send `C01PacketEncryptionResponse` (constructed with (secretKey, publicKey, verifyToken):
   the packet encrypts with the server's RSA key: RSA/ECB/PKCS1Padding wrapping of
   secretKey.encoded and verifyToken), then on write-completion enables AES-CFB8 on the
   pipeline (`NetworkManager.enableEncryption`).
3. **On SetCompression**: `if (!isLocalChannel()) setCompressionTreshold(threshold)`.
4. **On LoginSuccess**: store GameProfile, `setConnectionState(PLAY)`, install
   `NetHandlerPlayClient`.

## 5. PLAY state — synchronization semantics

### 5.1 Keep-alive

- Server sends `S00PacketKeepAlive {id: VarInt}`; client **immediately echoes**
  `C00PacketKeepAlive {id: VarInt}` (verified `bcy.handleKeepAlive`).
- Server side (`lm`): keep-alive sent every 900 ticks (~45 s) with a random id; if no echo
  within 6000 ticks? — see `UNRESOLVED_QUESTIONS.md` Q-4 for the exact counter constants
  (read from `lm` tick()); a connection that stays silent for the timeout is dropped
  ("disconnect.timeout").
- No play-state ping/pong equivalent.

### 5.2 Player movement sync (client → server)

Per tick, `bew.onUpdateWalkingPlayer` (`func_175161_p`, verified) sends **exactly one** of:

| Condition | Packet | Fields |
|---|---|---|
| pos moved² > 9.0E-4 **or** 20 ticks since last pos send | and rot changed → `C06` (0x06) | x:f64, y:f64 (boundingBox.minY), z:f64, yaw:f32, pitch:f32, onGround:u8 |
| pos changed only | `C04` (0x04) | x, y, z, onGround |
| rot changed only | `C05` (0x05) | yaw, pitch, onGround |
| neither | `C03` (0x03) | onGround:u8 |

- Position delta measured against `lastReportedPosX/Y/Z` (Y compared against
  `getEntityBoundingBox().minY`); rotation delta against last reported yaw/pitch.
- `positionUpdateTicks` resets to 0 on position sends (hence a forced position send every
  20 ticks even when standing still — important for server-side idle checks).
- **While riding** (`ridingEntity != null`): always send `C06` with
  `(motionX, -999.0, motionZ, yaw, pitch, onGround)` and suppress the pos-changed flag.
  Server (`lm.processPlayer`, verified): `if (packet.moving && packet.y == -999.0) packet.setMoving(false)` —
  the `-999.0` Y is the riding marker.
- Sneak/sprint changes → `C0BPacketEntityAction` START/STOP_SNEAKING(0/1) and
  START/STOP_SPRINTING(4/5) (verified enum use `is.a.a/b/d/e`).

Server-side validation (verified `lm.processPlayer`, for integrated-server parity):
NaN/infinite coords → kick "Invalid move packet received"; |x| or |z| > 3.0E7 →
"Illegal position"; displacement² − velocity² > 100 → warn "moved too quickly!" + snap back;
collision "moved wrongly!" check with 0.0625 expansion; floating check (expanded box minus
0.55 below) > 80 missed ticks → anti-fly kick.

### 5.3 Server → client absolute correction

`S08PacketPlayerPosLook` (0x08): x:f64, y:f64, z:f64, yaw:f32, pitch:f32, flags:u8.
Flags enum `S08PacketPlayerPosLook.EnumFlags` (bit per axis; **SET = value is relative**):

| bit | flag | set → | clear → |
|---|---|---|---|
| 0x01 | X | x += player.posX | player.motionX = 0 |
| 0x02 | Y | y += player.posY | player.motionY = 0 |
| 0x04 | Z | z += player.posZ | player.motionZ = 0 |
| 0x08 | YAW | yaw += player.rotationYaw | — |
| 0x10 | PITCH | pitch += player.rotationPitch | — |

(Verified in `bcy.handlePlayerPosLook`.) After applying, the client **always replies**
`C06PacketPlayerPosLook(posX, boundingBox.minY, posZ, yaw, pitch, onGround=false)` and, on
the first such packet, sets `doneLoadingTerrain` and closes the terrain-loading GUI.

### 5.4 Chunk & world sync

- `S21PacketChunkData` (0x21): chunkX:i32, chunkZ:i32, fullChunk:bool,
  primaryBitMask:VarInt (in the *extracted data* struct — see `PACKET_REFERENCE.md`),
  data:byte[] — 1.8 nibble-packed sections (block ids 12 bits? no — 1.8 uses 2 bytes/block
  + nibble arrays; exact layout in `WORLD_SYSTEM.md` §7).
- `S26PacketMapChunkBulk` (0x26): skylightSent:bool, columnCount:VarInt, x[], z[],
  extracted[] — batched variant.
- Block changes: `S23PacketBlockChange` (0x23) pos + blockstate (VarInt), `S22PacketMultiBlockChange`
  (0x22) chunkX:i32 chunkZ:i32 count + (u16 encoded pos, VarInt state)[].

### 5.5 Chat

- `S02PacketChat` (0x02): component JSON String, type:u8 (0=chat, 1=system, 2=actionbar).
- `C01PacketChatMessage` (0x01): message String(100).

### 5.6 Inventory sync

`S2DPacketOpenWindow`, `S30PacketWindowItems`, `S2FPacketSetSlot`, `S31PacketWindowProperty`,
`S32PacketConfirmTransaction`, `S2EPacketCloseWindow` ↔ `C0EPacketClickWindow`,
`C0FPacketConfirmTransaction`, `C0DPacketCloseWindow`, `C11PacketEnchantItem`,
`C10PacketCreativeInventoryAction`. Transaction protocol (windowId:i8, uid:i16, accepted:bool)
mirrors vanilla click handling — detail in `INVENTORY.md`.

## 6. Chat components

`eu`/IChatComponent is serialized as JSON (Gson `IChatComponent.Serializer`): `{"text","extra",
"color","bold","italic","underlined","obfuscated","strikethrough","clickEvent":{"action","value"},
"hoverEvent":{"action","value"},"insertion"}` — used in S00PacketServerInfo (status),
S00PacketDisconnect (login + play 0x40), S02PacketChat, S02PacketTabComplete?, sign text
(S33PacketUpdateSign / C12PacketUpdateSign use IChatComponent[4]), scoreboard
(S3B/S3C/S3D/S3E display names), S2DPacketOpenWindow? (window title).

## 7. Custom payloads

`S3FPacketCustomPayload` (0x3F): channel:String(20), data:byte[] (VarInt len).
`C17PacketCustomPayload` (0x17): channel:String(20), data:byte[].
Standard channels in 1.8.9: `MC|Brand` (client→server, brand string), `MC|BSign`/`MC|BEdit`
(book NBT), `MC|ItemName` (anvil rename), `MC|AdvCdm`? (no — 1.9+), `MC|PickItem` (server→client? no —
C17 client→server pick-block with NBT). Full list in `PACKET_REFERENCE.md` §custom.

## 8. Disconnects

- Login & play: `S00PacketDisconnect`/`S40PacketDisconnect {reason: IChatComponent JSON}`.
- Client handles by closing the channel and showing `GuiDisconnected`
  (`axh`/GuiDisconnected, verified `bcx.handleDisconnect`).
- Timeout: `ReadTimeoutHandler(30 s)` on the client pipeline; server keep-alive timeout
  (see §5.1).

## 9. Version discipline

1.8.8 and 1.8.9 share protocol 47 and are wire-identical; 1.8.9 is a bugfix release whose
markers are the string constants in §2. This specification targets **1.8.9**; no 1.9
mechanics (combat cooldowns, item-durability sync changes, 3D-hunger, recipe book,
command changes, block-state VarInts >1.8 range) appear anywhere in this client.
