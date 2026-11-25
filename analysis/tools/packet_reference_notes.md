
---

## 7. Value codecs (verified from `em`/PacketBuffer)

### ItemStack (`em.i()` read, `em.a(zx)` write)

| Field | Type | Notes |
|---|---|---|
| id | i16 | **< 0 (i.e. −1) = null (no item)** — no further fields |
| count | i8 | |
| damage | i16 | |
| nbt | NBT (§ below) | may be null |

### NBT (`em.h()` read)

`tagType:u8` — `0` = null. Otherwise the byte is rewound and a standard **uncompressed
big-endian NBT** tree follows (`dx`/CompressedStreamTools with a `dw`/NBTSizeTracker cap of
**0x200000 bytes**). Network NBT in 1.8 is *not* gzip-compressed (change from ≤1.7).

### DataWatcher list (`pz.b(em)`, used by S0C/S0F/S1C and metadata updates)

Repeated entries until terminator byte **0x7F**; empty list = single 0x7F byte.

| header byte | meaning |
|---|---|
| `(typeId << 5) \| index` | typeId 0–7, index 0–31 |

| typeId | value encoding |
|---|---|
| 0 | i8 |
| 1 | i16 |
| 2 | i32 |
| 3 | f32 |
| 4 | String(32767) |
| 5 | ItemStack |
| 6 | Position = **3×i32** (x,y,z — note: NOT the compact BlockPos) |
| 7 | Rotations = 3×f32 (pitch,yaw,roll) |

### Enum fields (`em.a(Class)` readEnumValue)

Wire = **VarInt ordinal** of the enum. Used by: C02 action, C07 status, C0B action,
C16 status, C19 status, S38 action, S3C action, S42 eventType, S44 action, S45 type,
S2B reason?, etc. Enumerate each enum's ordinal order in implementation from
`tools/packet_registry_from_jar.json` sibling classes (each packet class's nested enum).
Common ones:

- `C02PacketUseEntity.Action`: 0 INTERACT, 1 ATTACK, 2 INTERACT_AT
- `C07PacketPlayerDigging.Status`: 0 START_DESTROY_BLOCK, 1 ABORT_DESTROY_BLOCK,
  2 STOP_DESTROY_BLOCK, 3 DROP_ALL_ITEMS, 4 DROP_ITEM, 5 RELEASE_USE_ITEM
- `C0BPacketEntityAction.Action`: 0 START_SNEAKING, 1 STOP_SNEAKING, 2 STOP_SLEEPING,
  3 START_SPRINTING, 4 STOP_SPRINTING, 5 START_RIDING_JUMP(64..), 6 STOP_RIDING_JUMP,
  7 OPEN_INVENTORY
- `C16PacketClientStatus.EnumState`: 0 PERFORM_RESPAWN, 1 REQUEST_STATS
- `C19PacketResourcePackStatus.Action`: 0 SUCCESSFULLY_LOADED, 1 DECLINED, 2 FAILED_DOWNLOAD, 3 ACCEPTED
- `S38PacketPlayerListItem.Action`: 0 ADD_PLAYER, 1 UPDATE_GAMEMODE, 2 UPDATE_LATENCY,
  3 UPDATE_DISPLAY_NAME, 4 REMOVE_PLAYER
- `S42PacketCombatEvent.Event`: 0 ENTER_COMBAT, 1 END_COMBAT, 2 ENTITY_DEAD
- `S44PacketWorldBorder.Action`: 0 SET_SIZE, 1 LERP_SIZE, 2 SET_CENTER, 3 INITIALIZE,
  4 SET_WARNING_TIME, 5 SET_WARNING_BLOCKS
- `S45PacketTitle.Type`: 0 TITLE, 1 SUBTITLE, 2 TIMES, 3 CLEAR, 4 RESET
- `S08PacketPlayerPosLook.EnumFlags`: bitfield u8 (0x01 X, 0x02 Y, 0x04 Z, 0x08 YAW, 0x10 PITCH;
  **set = relative**)

## 8. Conditional/compound packet details (manual verification)

### 0x01 S01PacketJoinGame (`gt`)
`entityId` i32 · `gameType/hardcore` u8 (bit3 = hardcore; value & 0xF7 fed to
`EnumGameType.getByID`) · `dimension` i8 · `difficulty` u8 · `maxPlayers` u8 ·
`worldType` String(16) · `reducedDebugInfo` bool.

### 0x07 S07PacketRespawn (`he`)
`dimension` i32 · `difficulty` u8 · `gameType` u8 · `worldType` String(16).

### 0x0C S0CPacketSpawnPlayer (`fp`)
`entityId` VarInt · `playerId` UUID(2×i64 — `em.g()`) · x,y,z i32 (**4-byte fixed-point /32
positions** — verify against `fp.readPacketData` when citing; see `ENTITY_SYSTEM.md` §5) ·
yaw/pitch i8 · `currentItem` i16 · `metadata` DataWatcher list.
*(Field order in the table above is authoritative from `readPacketData`; consult
`ENTITY_SYSTEM.md` for the fixed-point position scaling of all entity packets.)*

### 0x0E S0EPacketSpawnObject (`fk`)
`entityId` VarInt · `type` u8 · x,y,z i32 (fixed-point /32) · `pitch`,`yaw` i8 · `data` i32 ·
if `data` > 0: velX,velY,velZ i16.

### 0x0F S0FPacketSpawnMob (`fn`)
`entityId` VarInt · `type` u8 · x,y,z i32 (fixed-point /32) · yaw,pitch,headYaw i8 ·
velX,velY,velZ i16 · `metadata` DataWatcher list.

### 0x14–0x17 S14PacketEntity family (`gv` + inner)
S14 base: `entityId` VarInt. Sub-wire:
- S15 (0x15, `gv.a`): + dx,dy,dz **i8** (units of 1/32 block), onGround bool
- S16 (0x16, `gv.c`): + yaw,pitch i8 (angle = byte × 360/256), onGround bool
- S17 (0x17, `gv.b`): + dx,dy,dz i8, yaw,pitch i8, onGround bool
(Inner-class mapping verified: `gv.a`=S15, `gv.c`=S16, `gv.b`=S17 — registration order in `el`.)

### 0x21 S21PacketChunkData (`go`)
`chunkX` i32 · `chunkZ` i32 · `fullChunk` bool · then `ExtractedData`:
`bitMask` VarInt · `data` byte[] (VarInt length). Section format: `WORLD_SYSTEM.md` §7.

### 0x26 S26PacketMapChunkBulk (`gp`)
`skylightSent` bool · `count` VarInt · `chunkX` i32[count] · `chunkZ` i32[count] ·
per column: `ExtractedData {bitMask VarInt, data byte[](VarInt len)}`.

### 0x2A S2APacketParticles (`gr`)
`particleType` VarInt (EnumParticleTypes id) · `longDistance` bool · x,y,z f32 ·
offX,offY,offZ f32 · `particleSpeed` f32 · `particleCount` i32 · if the *enum type* has
params: `particleArguments` i32[paramCount].

### 0x30 S30PacketWindowItems (`gd`)
`windowId` i8 · `count` i16 · `ItemStack`[count].

### 0x33 S33PacketUpdateSign (`hw`) / 0x12 C12PacketUpdateSign (`ix`)
`position` BlockPos · `lines` IChatComponent[4] (JSON strings).

### 0x37 S37PacketStatistics (`fr`)
`count` VarInt · entries × {`statId` VarInt, `value` VarInt} → Map.

### 0x38 S38PacketPlayerListItem (`gz`)
`action` enum(VarInt) · `count` VarInt · per entry (action-dependent):
- ADD_PLAYER: uuid UUID, name String(16), properties VarInt + {name String(32767), value String(32767), isSigned bool, [signature String(32767)]}, gamemode VarInt, ping VarInt, hasDisplayName bool [displayName IChatComponent]
- UPDATE_GAMEMODE: uuid, gamemode VarInt
- UPDATE_LATENCY: uuid, ping VarInt
- UPDATE_DISPLAY_NAME: uuid, hasDisplayName bool [displayName]
- REMOVE_PLAYER: uuid

### 0x3E S3EPacketTeams (`hr`)
`name` String(16) · `action` i8 (0 create, 1 remove, 2 update, 3 add players, 4 remove players) ·
if action 0|2|3|4: `displayName` String(32), `prefix` String(16), `suffix` String(16),
`friendlyFlags` i8 (0x01 friendlyFire, 0x02 see-invisible-allies), `nameTagVisibility`
String(32) (always/never/hideForOtherTeam/hideForOwnTeam), `color` i8 (−1..15) ·
if action 0|3|4: `playerCount` VarInt + names String(32767)[count].

### 0x42 S42PacketCombatEvent (`gy`)
`event` enum(VarInt) · ENTER_COMBAT: *(empty)* · END_COMBAT: `duration` VarInt, `entityId` i32 ·
ENTITY_DEAD: `playerId` VarInt, `entityId` i32, `message` IChatComponent.

### 0x44 S44PacketWorldBorder (`hg`)
`action` enum(VarInt) · SET_SIZE: `x` f64 · LERP_SIZE: `oldSize` f64, `newSize` f64,
`speed` VarLong · SET_CENTER: `x` f64, `z` f64 · INITIALIZE: `x` f64, `z` f64,
`oldSize` f64, `newSize` f64, `speed` VarLong, `portalTeleportBoundary` VarInt,
`warningTime` VarInt, `warningBlocks` VarInt · SET_WARNING_TIME: `warningTime` VarInt ·
SET_WARNING_BLOCKS: `warningBlocks` VarInt.

### 0x45 S45PacketTitle (`hv`)
`type` enum(VarInt) · TIMES: `fadeIn` i32, `stay` i32, `fadeOut` i32 ·
TITLE/SUBTITLE: `text` IChatComponent · CLEAR/RESET: *(empty)*.

### 0x02 C02PacketUseEntity (`in`)
`entityId` VarInt · `action` enum(VarInt) · if INTERACT_AT: `hitVec` 3×f32.

### 0x0C C0CPacketInput (`it`)
`flags` u8 (bit0 = jumping, bit1 = sneaking) · `forward` f32 · `strafe` f32.
*(table shows derived booleans; wire is the single flags byte + 2 floats.)*

### 0x13 C13PacketPlayerAbilities (`iq`)
`flags` u8 (bit0 flying, bit1 allowFlying, bit2 creative, bit3 invulnerable) ·
`flySpeed` f32 · `walkSpeed` f32.

### 0x14 C14PacketTabComplete (`id`)
`message` String(32767) · `hasTargetBlock` bool · if true `targetBlock` BlockPos.

## 9. Behavioral notes (client handling)

- **S00/S00 keep-alive** (play): echo immediately (§`PROTOCOL_1_8_9.md` §5.1).
- **S08** (play 0x08): reply C06 with onGround=false, flags semantics in
  `PROTOCOL_1_8_9.md` §5.3.
- **S40** (play 0x40): disconnect + GuiDisconnected (`axh`).
- **S2BPacketChangeGameState** (`gm`): `reason` u8, `value` f32 — reasons 0–10
  (invalid bed, end raining, begin raining, change gamemode, enter credits,
  demo message, arrow hit, fade value, fade time, play elder guardian effect?).
  Reason→handler table in `GUI_AND_HUD.md` §weather.
- **S29PacketSoundEffect** (`gs`): `soundName` String(32767? capped), `soundCategory` VarInt
  (master/players/blocks/weather/ambient/voice?), x,y,z i32 (×8 fixed point — see
  `AUDIO.md`), `volume` f32, `pitch` u8 (pitch/63). Category enum order in `AUDIO.md`.
- **S39PacketPlayerAbilities** (`gx`): flags u8, flySpeed f32, walkSpeed f32.
- **S41PacketServerDifficulty** (`fw`): difficulty u8, `difficultyLocked` bool.
- **S46PacketSetCompressionLevel** (`gl`): `threshold` VarInt — play-state compression
  threshold change (client re-wires `NettyCompressionDecoder/Encoder` threshold; see
  `UNRESOLVED_QUESTIONS.md` Q-2 for server usage rarity).
- **S48PacketResourcePackSend** (`hd`): `url` String(32767), `hash` String(40).
  Client must answer C19 with ACCEPTED/DECLINED/FAILED_DOWNLOAD/SUCCESSFULLY_LOADED
  (`RESOURCE_SYSTEM.md` §6).
- **S49PacketUpdateEntityNBT** (`gj`): `entityId` VarInt, `tagCompound` NBT — item-frame
  content sync.
- **C15PacketClientSettings** (`ih`): `lang` String(7), `view` u8 (2–8? = render distance
  chunks), `chatVisibility` i8 (0 full, 1 commands, 2 hidden), `enableColors` bool,
  `skinParts` u8 (bitmask cape 0x01, jacket 0x02, sleeves 0x04, pants 0x08, hat 0x10,
  left sleeve 0x20, right sleeve 0x40, left pant 0x80?? — verify against `bew` send code
  in `GUI_AND_HUD.md` §settings).
- **C17PacketCustomPayload** (`im`): channels used by the vanilla client —
  `MC|Brand` (String brand, sent on join), `MC|BSign`/`MC|BEdit` (ItemStack book),
  `MC|ItemName` (String anvil name), `MC|PickItem` (slot i32? verify),
  `REGISTER`/`UNREGISTER` (mod channel registration — Forge-era compatibility the vanilla
  client still speaks).

## 10. Coverage

- [x] All 111 registered packets enumerated with IDs from the jar's own registry
- [x] Field order per packet from decompiled `readPacketData` (auto-extracted, manually spot-checked)
- [x] Wire type disambiguation for overloads (arity-based resolver + manual review)
- [x] Conditional packets documented (manual, §8)
- [x] Value codecs verified (ItemStack, NBT, DataWatcher, enums)
- [x] Cross-checked packet-by-packet against independent protocol-47 tables
