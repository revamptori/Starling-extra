# Network Architecture — Minecraft 1.8.9

All facts **Verified** from decompiled classes unless noted. Class names cited as
`obf`/`MCP` (SRG names where helpful). Packet IDs/structures: `PACKET_REFERENCE.md`.
Wire semantics: `PROTOCOL_1_8_9.md`.

## 1. Stack overview

1.8.9 uses **Netty 4.x** (`io.netty`) with a custom pipeline. The client connects from
`ek`/`NetworkManager.createNetworkManagerAndConnect(InetAddress, int, boolean useEpoll)`
(`func_181124_a`):

```
Bootstrap
  group:    CLIENT_EPOLL_EVENTLOOP if Epoll.isAvailable() && useEpoll
            else CLIENT_NIO_EVENTLOOP            (static no<> wrappers, ek.d/ek.e)
  channel:  EpollSocketChannel | NioSocketChannel
  options:  TCP_NODELAY = true
  pipeline (inbound order):
    "timeout"        ReadTimeoutHandler(30)        [Netty; 30 s]
    "splitter"       eq  MessageDeserializer2      frame decoder  (VarInt length)
    "decrypt"        eg  NettyEncryptingDecoder    [added on enableEncryption]
    "decoder"        en  MessageDeserializer       packet decoder (direction S→C)
    "prepender"      er  MessageSerializer2        frame encoder  (VarInt length)
    "encrypt"        eh  NettyEncryptingEncoder    [added on enableEncryption]
    "encoder"        eo  MessageSerializer         packet encoder (direction C→S)
    "packet_handler" ek  NetworkManager            SimpleChannelInboundHandler<Packet>
```

- The NetworkManager itself is the terminal handler; it implements
  `channelActive/channelInactive/channelReceived/exceptionCaught` and forwards packets to the
  current `packetListener` (`ep`/INetHandler) via `channelRead0` → `processPacket`.
- **Direction**: `fg`/EnumPacketDirection — `fg.a` = CLIENT_TO_SERVER (serverbound),
  `fg.b` = SERVER_TO_CLIENT (clientbound). The decoder is constructed with the *receive*
  direction, the encoder with the *send* direction; both look IDs up in the per-state
  registries held by `el`/EnumConnectionState.
- Integrated-server LAN play uses `NetworkManager.provideLocalClient(SocketAddress)`
  (embedded channel) and a mirrored `provideLocalServer`; compression is skipped on local
  channels (see §4).

## 2. Framing (`eq`/MessageDeserializer2, `er`/MessageSerializer2)

**Frame = VarInt length (1–3 bytes) + payload.**

Inbound (`eq.decode`, verified):
1. `markReaderIndex`, read up to 3 bytes one at a time.
2. First byte with high bit clear completes the VarInt length `n`.
3. If `readableBytes < n` → `resetReaderIndex`, wait for more data (partial frame).
4. Else emit `readBytes(n)` as one frame.
5. If 3 bytes all have the high bit set → `CorruptedFrameException("length wider than 21-bit")`
   (max frame 2,097,151 bytes).

Outbound (`er.encode`): `VarInt(readableBytes)` (≤3 bytes, else
`IllegalArgumentException("unable to fit n into 3")`) + payload copy.

VarInt encoding lives in `em`/PacketBuffer (`e()` = readVarIntFromBuffer `func_179256_i`-family,
`d()` = writeVarIntToBuffer): standard LEB-style 7-bit groups, max 5 bytes
(`VarInt too big` IOException beyond 5 bytes). `em.f()` = readVarLong, `em` also provides
`readStringFromBuffer(int maxChars)` (VarInt byte-length + Modified-UTF-8 decoder with a
3× maxChars byte cap and `String too big` at > maxChars chars), `readBlockPos` (x=Int,
y=Byte, z=Int packed via `aub`/BlockPos), `readUuid` (two longs), `readItemStackFromBuffer`,
`readNBTTagCompoundFromBuffer`, `readChatComponent` (VarInt length + JSON string, Gson
`IChatComponent.Serializer`), `readByteArray` (VarInt length + bytes).

**Packet layout inside a frame**: `VarInt packetId` + packet-specific fields.
Unknown id → `IOException("Bad packet id N")`; trailing bytes after packet body →
`IOException("Packet STATE/ID (SimpleName) was larger than I expected, found N bytes extra whilst reading packet ID")`
(all verified in `en`/MessageDeserializer.decode).

## 3. Packet codec (`en`, `eo`)

- Decode: read VarInt id → `EnumConnectionState.getPacket(direction, id)` (`el.a(fg,int)`)
  → instantiate via no-arg ctor (validated at clinit time! every registered class must have a
  working public no-arg constructor) → `readPacketData(buf)`.
- Encode: `EnumConnectionState.getPacketId(direction, packet)` (`el.a(fg,Packet)`) →
  `IOException("Can't serialize unregistered packet")` if missing → write VarInt id →
  `writePacketData(buf)`.
- Debug logging via markers `logMarkerNetwork`/`logMarkerPackets` (`ek.a`, `ek.b`);
  `" IN: [state:id] class"` / `"OUT: [state:id] class"`.

## 4. Compression (`ei`/NettyCompressionDecoder, `ej`/NettyCompressionEncoder)

Enabled after login (server sends `ji`/S03PacketEnableCompression, threshold VarInt).
`NetworkManager.setCompressionTreshold(int)` (`func_179289_a`) inserts `ei` before
"splitter" and `ej` before "prepender" (i.e. inside the framing stage).

Frame payload format after enabling:

| Field | Type | Notes |
|---|---|---|
| dataLength | VarInt | 0 = packet sent uncompressed; else uncompressed size |
| data | bytes | raw (when dataLength=0) or zlib/Deflate stream |

Decoder rules (verified `ei.decode`):
- empty buffer → return (wait).
- `dataLength == 0` → pass remaining bytes through untouched.
- else require `dataLength >= threshold` (`DecoderException "Badly compressed packet - size of N is below server threshold of T"`);
  `dataLength > 0x200000` (2 MiB) → `DecoderException "…larger than protocol maximum of 2097152"`.
- inflate into exactly `dataLength` bytes; `Inflater.reset()` after each packet.

Encoder rules (verified `ej.encode`):
- payload < threshold → write VarInt 0 + raw payload.
- else → write VarInt payloadLen + `Deflater` output (default zlib wrapper, streamed via a
  scratch buffer; `Deflater.reset()` after each packet).

**Local-channel exception** (verified `bcx`/NetHandlerLoginClient.handleCompression):
`if (!netManager.isLocalChannel()) netManager.setCompressionTreshold(threshold)` —
integrated-server connections never enable compression.

## 5. Encryption (`eg`, `eh`, `ng`/CryptManager)

Negotiated in the LOGIN state (see `PROTOCOL_1_8_9.md`). `NetworkManager.enableEncryption(SecretKey)`
(`func_150727_a`) inserts `NettyEncryptingDecoder` before "splitter" and
`NettyEncryptingEncoder` before "prepender", each wrapping a `javax.crypto.Cipher` in
**`AES/CFB8/NoPadding`** mode (verified constant in `ng.class`; `ng.a(1|2, key)` builds
ENCRYPT/DECRYPT ciphers). Because CFB8 is a stream cipher with per-byte feedback, the
encrypted stream is continuous across frames — a Rust implementation must apply the cipher
to the raw TCP stream, not per-frame. Crypto helpers in `ng`/CryptManager:

| Method (MCP) | SRG | Purpose |
|---|---|---|
| `generateKeyPair()` | func_75891_b | RSA keypair (server) |
| `getServerIdHash(serverId, pubKey, secretKey)` | func_75895_a | SHA-1 digest → BigInt hex (login join hash) |
| `decodePublicKey(bytes)` | func_75896_a | X.509 → PublicKey |
| `encryptData/decryptData(key, bytes)` | func_75894_a/func_75889_b | RSA wrap/unwrap |
| `createNewKey()` (obf `a`) | — | 128-bit AES SecretKey (`AES` keygen) |

Digest algorithm confirmed in constants: `SHA-1`. (Formula detail in `PROTOCOL_1_8_9.md` §4.)

## 6. NetworkManager semantics (`ek`)

| Behavior | Implementation (verified) |
|---|---|
| State machine | `setConnectionState(EnumConnectionState)` (`func_150723_a`) stores state in channel attribute `attrKeyConnectionState` (`ek.c`) and rebuilds the packet-listener as needed |
| Listener swap | `setNetHandler(INetHandler)` (`func_150719_a`) |
| Inbound dispatch | `channelRead0` → `packet.processPacket(packetListener)`; scheduling handled per-handler (`fh`/PacketThreadUtil.checkThreadAndEnqueue on server handlers; client handlers marshal to the client thread in `processReceivedPackets`) |
| Outbound | `sendPacket` → `dispatchPacket`: if channel writable → write+flush; else queue in `outboundPacketsQueue` (`flushOutboundQueue` drains on writability) |
| Receive pump | `processReceivedPackets()` (`func_74428_b`) called each tick from the game loop to run queued inbound packets on the main thread |
| Disconnect | `closeChannel(IChatComponent)` (`func_150718_a`) → channel close, `terminationReason` (`eu`/IChatComponent) retained; `checkDisconnected()` raises `checkDisconnected` on the listener |
| Read stop | `disableAutoRead()` (`func_150721_g`) — used while awaiting login continuation |
| Timeout | Netty `ReadTimeoutHandler(30)` — 30 s without inbound data kills the connection (fires `ReadTimeoutException` → `exceptionCaught` → disconnect) |

Threading: Netty event-loop threads own socket I/O; the client thread (game loop) owns
packet *handling* for the play state (NetHandlerPlayClient enqueues via
`PacketThreadUtil`/`fh`-style checks and `networkManager.processReceivedPackets()`).

## 7. Server side (integrated server; for parity)

`ll`/NetworkSystem accepts connections with a mirrored pipeline (ping-responder
`PingResponseHandler`-style handler for legacy pings — `jk`-family, see
`UNRESOLVED_QUESTIONS.md` Q-1). `ln`/NetHandlerHandshakeTCP performs the protocol-version
check (exact strings in `PROTOCOL_1_8_9.md`); `lp`/NetHandlerStatusServer answers status;
`lo`/NetHandlerLoginServer runs encryption/compression negotiation; `lm`/NetHandlerPlayServer
handles play traffic (movement validation detailed in `PLAYER_PHYSICS.md` §7).

## 8. Rust mapping notes

- **tokio** + `tokio-util::codec`: `LengthDelimitedCodec`-style framing must be replaced by
  a custom VarInt-length codec (max 3 length bytes, 21-bit max frame).
- Encryption as a stream cipher layer (`AES-CFB8` via `aes` + `cfb8` crates) wrapped around
  the TCP stream (not per-frame).
- Compression: `flate2` (zlib) with the exact threshold semantics of §4.
- Packet enum → `(state, direction, id)` registry mirroring `el`'s static init order
  (`tools/packet_registry_from_jar.json` is the ground-truth table).
- Serialize/deserialize traits modeled on `ff`/Packet (`readPacketData`, `writePacketData`,
  `processPacket`) with `BytesMut` buffers; enforce the trailing-bytes check for parity with
  the Java client (it is what vanilla does, even though strictness differs across versions).

## 9. External interfaces

- **Authlib** (`com.mojang.authlib`): `MinecraftSessionService.joinServer` (session join hash),
  `GameProfile`, `PropertyMap` (used by `bcx` and login). Rust replacement: direct HTTPS to
  `authserver.mojang.com`/`sessionserver.mojang.com` (see `DEPENDENCIES.md`).
- **Gson**: `IChatComponent` JSON, status JSON (`js`/ServerStatusResponse with custom
  serializers `js$a$a`, `js$b`, `js$c$a`), `User`-related JSON.
- **Netty** semantics above.
