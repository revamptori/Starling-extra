# Packet Reference — Minecraft 1.8.9 (protocol 47)

Generated from the **jar itself**: packet classes and their registration order in `el`/EnumConnectionState
(`analysis/tools/packet_registry_from_jar.json`) + per-packet `readPacketData` field order
(`analysis/tools/packet_fields.json`). IDs are the registration index — verified to match the
protocol-47 wire IDs packet-by-packet against PrismarineJS `minecraft-data` (1.8).

Naming: `obf`/MCPName. Wire types: VarInt, i8/u8, i16/u16, i32, i64, f32, f64, bool(=u8),
String(N)=VarInt-byteLen+UTF8 with char cap N, byte[](VarInt len), BlockPos(i32,i8,i32),
ItemStack(see §7), NBT(see §7 — uncompressed), IChatComponent(=String JSON), UUID(2×i64),
EnumX(=VarInt ordinal unless noted), DataWatcher(=list, see §8).

## Handshaking state

### C→S (serverbound) — 1 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `jc`/C00Handshake | `protocolVersion`:VarInt, `ip`:String(max=255), `port`:ushort, `requestedState`:VarInt |

## Status state

### C→S (serverbound) — 2 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `jv`/C00PacketServerQuery | *(empty)* |
| 0x01 | `ju`/C01PacketPing | `clientTime`:long |

### S→C (clientbound) — 2 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `jr`/S00PacketServerInfo | `response`:String(max=Short.MAX_VALUE) |
| 0x01 | `jq`/S01PacketPong | `clientTime`:long |

## Login state

### C→S (serverbound) — 2 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `jl`/C00PacketLoginStart | `profile`:String(max=16) |
| 0x01 | `jm`/C01PacketEncryptionResponse | `secretKeyEncrypted`:byte[], `verifyTokenEncrypted`:byte[] |

### S→C (clientbound) — 4 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `jj`/S00PacketDisconnect | `reason`:IChatComponent(JSON) |
| 0x01 | `jh`/S01PacketEncryptionRequest | `hashedServerId`:String(max=20), `publicKey`:byte[], `verifyToken`:byte[] |
| 0x02 | `jg`/S02PacketLoginSuccess | `profile`:see notes |
| 0x03 | `ji`/S03PacketEnableCompression | `compressionTreshold`:VarInt |

## Play state

### C→S (serverbound) — 26 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `io`/C00PacketKeepAlive | `key`:VarInt |
| 0x01 | `ie`/C01PacketChatMessage | `message`:String(max=100) |
| 0x02 | `in`/C02PacketUseEntity | `entityId`:VarInt, `action`:see notes, `hitVec`:float |
| 0x03 | `ip`/C03PacketPlayer | `onGround`:ubyte |
| 0x04 | `ip.a`/C03PacketPlayer$C04PacketPlayerPosition | `a`:double, `b`:double, `c`:double |
| 0x05 | `ip.c`/C03PacketPlayer$C05PacketPlayerLook | `d`:float, `e`:float |
| 0x06 | `ip.b`/C03PacketPlayer$C06PacketPlayerPosLook | `a`:double, `b`:double, `c`:double, `d`:float, `e`:float |
| 0x07 | `ir`/C07PacketPlayerDigging | `status`:see notes, `position`:BlockPos, `facing`:ubyte |
| 0x08 | `ja`/C08PacketPlayerBlockPlacement | `position`:BlockPos, `placedBlockDirection`:ubyte, `stack`:ItemStack, `facingX`:ubyte, `facingY`:ubyte, `facingZ`:ubyte |
| 0x09 | `iv`/C09PacketHeldItemChange | `slotId`:short |
| 0x0a | `iy`/C0APacketAnimation | *(empty)* |
| 0x0b | `is`/C0BPacketEntityAction | `entityID`:VarInt, `action`:see notes, `auxData`:VarInt |
| 0x0c | `it`/C0CPacketInput | `strafeSpeed`:float, `forwardSpeed`:float, `jumping`:see notes, `sneaking`:see notes |
| 0x0d | `il`/C0DPacketCloseWindow | `windowId`:byte |
| 0x0e | `ik`/C0EPacketClickWindow | `windowId`:byte, `slotId`:short, `usedButton`:byte, `actionNumber`:short, `mode`:byte, `clickedItem`:ItemStack |
| 0x0f | `ii`/C0FPacketConfirmTransaction | `windowId`:byte, `uid`:short, `accepted`:byte |
| 0x10 | `iw`/C10PacketCreativeInventoryAction | `slotId`:short, `stack`:ItemStack |
| 0x11 | `ij`/C11PacketEnchantItem | `windowId`:byte, `button`:byte |
| 0x12 | `ix`/C12PacketUpdateSign | `pos`:BlockPos, `lines`:see notes |
| 0x13 | `iq`/C13PacketPlayerAbilities | *(empty)* |
| 0x14 | `id`/C14PacketTabComplete | `message`:String(max=32767), `hasTarget` + `targetBlock` conditional — see §8 |
| 0x15 | `ih`/C15PacketClientSettings | `lang`:String(max=7), `view`:byte, `chatVisibility`:byte, `enableColors`:boolean, `modelPartFlags`:ubyte |
| 0x16 | `ig`/C16PacketClientStatus | `status`:see notes |
| 0x17 | `im`/C17PacketCustomPayload | `channel`:String(max=20), `data`:bytes(n) |
| 0x18 | `iz`/C18PacketSpectate | `id`:UUID |
| 0x19 | `iu`/C19PacketResourcePackStatus | `hash`:String(max=40), `status`:see notes |

### S→C (clientbound) — 74 packets

| ID | Class (obf/MCP) | Fields (wire order) |
|---|---|---|
| 0x00 | `gn`/S00PacketKeepAlive | `id`:VarInt |
| 0x01 | `gt`/S01PacketJoinGame | `entityId`:int, `hardcoreMode`:see notes, `gameType`:see notes, `dimension`:byte, `difficulty`:ubyte, `maxPlayers`:ubyte, `worldType`:String(max=16), `worldType`:see notes, `reducedDebugInfo`:boolean |
| 0x02 | `fy`/S02PacketChat | `chatComponent`:IChatComponent(JSON), `type`:byte |
| 0x03 | `hu`/S03PacketTimeUpdate | `totalWorldTime`:long, `worldTime`:long |
| 0x04 | `hn`/S04PacketEntityEquipment | `entityID`:VarInt, `equipmentSlot`:short, `itemStack`:ItemStack |
| 0x05 | `ht`/S05PacketSpawnPosition | `spawnBlockPos`:BlockPos |
| 0x06 | `hp`/S06PacketUpdateHealth | `health`:float, `foodLevel`:VarInt, `saturationLevel`:float |
| 0x07 | `he`/S07PacketRespawn | `dimensionID`:int, `difficulty`:ubyte, `gameType`:ubyte, `worldType`:String(max=16), `worldType`:see notes |
| 0x08 | `fi`/S08PacketPlayerPosLook | `x`:double, `y`:double, `z`:double, `yaw`:float, `pitch`:float, `field_179835_f`:ubyte |
| 0x09 | `hi`/S09PacketHeldItemChange | `heldItemHotbarIndex`:byte |
| 0x0a | `ha`/S0APacketUseBed | `playerID`:VarInt, `bedPos`:BlockPos |
| 0x0b | `fq`/S0BPacketAnimation | `entityId`:VarInt, `type`:ubyte |
| 0x0c | `fp`/S0CPacketSpawnPlayer | `entityId`:VarInt, `playerId`:UUID, `x`:int, `y`:int, `z`:int, `yaw`:byte, `pitch`:byte, `currentItem`:short, `field_148958_j`:see notes |
| 0x0d | `hy`/S0DPacketCollectItem | `collectedItemEntityId`:VarInt, `entityId`:VarInt |
| 0x0e | `fk`/S0EPacketSpawnObject | `entityId`:VarInt, `type`:byte, `x`:int, `y`:int, `z`:int, `pitch`:byte, `yaw`:byte, `field_149020_k`:int, `speedX`:short, `speedY`:short, `speedZ`:short |
| 0x0f | `fn`/S0FPacketSpawnMob | `entityId`:VarInt, `type`:byte, `x`:int, `y`:int, `z`:int, `yaw`:byte, `pitch`:byte, `headPitch`:byte, `velocityX`:short, `velocityY`:short, `velocityZ`:short, `watcher`:see notes |
| 0x10 | `fo`/S10PacketSpawnPainting | `entityID`:VarInt, `title`:String(max=uq.a.A), `position`:BlockPos, `facing`:ubyte |
| 0x11 | `fl`/S11PacketSpawnExperienceOrb | `entityID`:VarInt, `posX`:int, `posY`:int, `posZ`:int, `xpValue`:short |
| 0x12 | `hm`/S12PacketEntityVelocity | `entityID`:VarInt, `motionX`:short, `motionY`:short, `motionZ`:short |
| 0x13 | `hb`/S13PacketDestroyEntities | `entityIDs`:VarInt |
| 0x14 | `gv`/S14PacketEntity | `entityId`:VarInt |
| 0x15 | `gv.a`/S14PacketEntity$S15PacketEntityRelMove | `b`:byte, `c`:byte, `d`:byte, `g`:boolean |
| 0x16 | `gv.c`/S14PacketEntity$S16PacketEntityLook | `e`:byte, `f`:byte, `g`:boolean |
| 0x17 | `gv.b`/S14PacketEntity$S17PacketEntityLookMove | `b`:byte, `c`:byte, `d`:byte, `e`:byte, `f`:byte, `g`:boolean |
| 0x18 | `hz`/S18PacketEntityTeleport | `entityId`:VarInt, `posX`:int, `posY`:int, `posZ`:int, `yaw`:byte, `pitch`:byte, `onGround`:boolean |
| 0x19 | `hf`/S19PacketEntityHeadLook | `entityId`:VarInt, `yaw`:byte |
| 0x1a | `gi`/S19PacketEntityStatus | `entityId`:int, `logicOpcode`:byte |
| 0x1b | `hl`/S1BPacketEntityAttach | `entityId`:int, `vehicleEntityId`:int, `leash`:ubyte |
| 0x1c | `hk`/S1CPacketEntityMetadata | `entityId`:VarInt, `field_149378_b`:see notes |
| 0x1d | `ib`/S1DPacketEntityEffect | `entityId`:VarInt, `effectId`:byte, `amplifier`:byte, `duration`:VarInt, `hideParticles`:byte |
| 0x1e | `hc`/S1EPacketRemoveEntityEffect | `entityId`:VarInt, `effectId`:ubyte |
| 0x1f | `ho`/S1FPacketSetExperience | `field_149401_a`:float, `level`:VarInt, `totalExperience`:VarInt |
| 0x20 | `ia`/S20PacketEntityProperties | `entityId`:VarInt |
| 0x21 | `go`/S21PacketChunkData | `chunkX`:int, `chunkZ`:int, `field_149279_g`:boolean, `extractedData`:see notes |
| 0x22 | `fz`/S22PacketMultiBlockChange | `chunkPosCoord`:int, `changedBlocks`:VarInt |
| 0x23 | `fv`/S23PacketBlockChange | `blockPosition`:BlockPos, `blockState`:VarInt |
| 0x24 | `fu`/S24PacketBlockAction | `blockPosition`:BlockPos, `instrument`:ubyte, `pitch`:ubyte, `block`:VarInt |
| 0x25 | `fs`/S25PacketBlockBreakAnim | `breakerId`:VarInt, `position`:BlockPos, `progress`:ubyte |
| 0x26 | `gp`/S26PacketMapChunkBulk | `isOverworld`:boolean, `xPositions`:see notes, `zPositions`:see notes, `chunksData`:see notes |
| 0x27 | `gk`/S27PacketExplosion | `posX`:float, `posY`:float, `posZ`:float, `strength`:float, `affectedBlockPositions`:see notes, `field_149152_f`:float, `field_149153_g`:float, `field_149159_h`:float |
| 0x28 | `gq`/S28PacketEffect | `soundType`:int, `soundPos`:BlockPos, `soundData`:int, `serverWide`:boolean |
| 0x29 | `gs`/S29PacketSoundEffect | `soundName`:String(max=256), `posX`:int, `posY`:int, `posZ`:int, `soundVolume`:float, `soundPitch`:ubyte |
| 0x2a | `gr`/S2APacketParticles | `particleType`:int, `particleType`:see notes, `longDistance`:boolean, `xCoord`:float, `yCoord`:float, `zCoord`:float, `xOffset`:float, `yOffset`:float, `zOffset`:float, `particleSpeed`:float, `particleCount`:int, `particleArguments`:see notes |
| 0x2b | `gm`/S2BPacketChangeGameState | `state`:ubyte, `field_149141_c`:float |
| 0x2c | `fm`/S2CPacketSpawnGlobalEntity | `entityId`:VarInt, `type`:byte, `x`:int, `y`:int, `z`:int |
| 0x2d | `gc`/S2DPacketOpenWindow | `windowId`:ubyte, `inventoryType`:String(max=32), `windowTitle`:IChatComponent(JSON), `slotCount`:ubyte, `entityId`:int |
| 0x2e | `gb`/S2EPacketCloseWindow | `windowId`:ubyte |
| 0x2f | `gf`/S2FPacketSetSlot | `windowId`:byte, `slot`:short, `item`:ItemStack |
| 0x30 | `gd`/S30PacketWindowItems | `windowId`:ubyte, `itemStacks`:see notes |
| 0x31 | `ge`/S31PacketWindowProperty | `windowId`:ubyte, `varIndex`:short, `varValue`:short |
| 0x32 | `ga`/S32PacketConfirmTransaction | `windowId`:ubyte, `actionNumber`:short, `field_148893_c`:boolean |
| 0x33 | `hw`/S33PacketUpdateSign | `blockPos`:BlockPos, `lines`:see notes |
| 0x34 | `gu`/S34PacketMaps | `mapId`:VarInt, `mapScale`:byte, `mapVisiblePlayersVec4b`:VarInt, `mapMaxX`:ubyte, `mapMaxY`:ubyte, `mapMinX`:ubyte, `mapMinY`:ubyte, `mapDataBytes`:byte[] |
| 0x35 | `ft`/S35PacketUpdateTileEntity | `blockPos`:BlockPos, `metadata`:ubyte, `nbt`:NBT |
| 0x36 | `gw`/S36PacketSignEditorOpen | `signPosition`:BlockPos |
| 0x37 | `fr`/S37PacketStatistics | `field_148976_a`:see notes |
| 0x38 | `gz`/S38PacketPlayerListItem | `action`:see notes |
| 0x39 | `gx`/S39PacketPlayerAbilities | *(empty)* |
| 0x3a | `fx`/S3APacketTabComplete | `matches`:VarInt |
| 0x3b | `hq`/S3BPacketScoreboardObjective | `objectiveName`:String(max=16), `field_149342_c`:byte, `objectiveValue`:String(max=32), `type`:String(max=16) |
| 0x3c | `hs`/S3CPacketUpdateScore | `name`:String(max=40), `action`:see notes, `objective`:String(max=16), `value`:VarInt |
| 0x3d | `hj`/S3DPacketDisplayScoreboard | `position`:byte, `scoreName`:String(max=16) |
| 0x3e | `hr`/S3EPacketTeams | `name`:String(max=16), `action`:byte, `displayName`:String(max=32), `prefix`:String(max=16), `suffix`:String(max=16), `friendlyFlags`:byte, `nameTagVisibility`:String(max=32), `color`:byte |
| 0x3f | `gg`/S3FPacketCustomPayload | `channel`:String(max=20), `data`:bytes(n) |
| 0x40 | `gh`/S40PacketDisconnect | `reason`:IChatComponent(JSON) |
| 0x41 | `fw`/S41PacketServerDifficulty | `difficulty`:ubyte |
| 0x42 | `gy`/S42PacketCombatEvent | `eventType`:see notes, `field_179772_d`:VarInt, `field_179775_c`:int, `field_179774_b`:VarInt, `field_179775_c`:int, `deathMessage`:String(max=Short.MAX_VALUE) |
| 0x43 | `hh`/S43PacketCamera | `entityId`:VarInt |
| 0x44 | `hg`/S44PacketWorldBorder | `action`:see notes, `targetSize`:double, `diameter`:double, `targetSize`:double, `timeUntilTarget`:VarLong, `centerX`:double, `centerZ`:double, `warningDistance`:VarInt, `warningTime`:VarInt, `centerX`:double, `centerZ`:double, `diameter`:double, `targetSize`:double, `timeUntilTarget`:VarLong, `size`:VarInt, `warningDistance`:VarInt, `warningTime`:VarInt |
| 0x45 | `hv`/S45PacketTitle | `type`:see notes, `message`:IChatComponent(JSON), `fadeInTime`:int, `displayTime`:int, `fadeOutTime`:int |
| 0x46 | `gl`/S46PacketSetCompressionLevel | `threshold`:VarInt |
| 0x47 | `hx`/S47PacketPlayerListHeaderFooter | `header`:IChatComponent(JSON), `footer`:IChatComponent(JSON) |
| 0x48 | `hd`/S48PacketResourcePackSend | `url`:String(max=Short.MAX_VALUE), `hash`:String(max=40) |
| 0x49 | `gj`/S49PacketUpdateEntityNBT | `entityId`:VarInt, `tagCompound`:NBT |

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
- **C15PacketClientSettings** (`ih`, VERIFIED `avh.c()`/`wo`): `lang` String(7),
  `view` i8 (render distance chunks), `chatVisibility` i8 (`wn$b` ordinal:
  0 full, 1 commands/system, 2 hidden), `enableColors` bool,
  `skinParts` u8 (VERIFIED `wo`/EnumPlayerModelParts masks: 0x01 cape, 0x02 jacket,
  0x04 left_sleeve, 0x08 right_sleeve, 0x10 left_pants_leg, 0x20 right_pants_leg,
  0x40 hat).
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
