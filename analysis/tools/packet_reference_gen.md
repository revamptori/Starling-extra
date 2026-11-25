# Packet Reference — Minecraft 1.8.9 (protocol 47)

Generated from the **jar itself**: packet classes and their registration order in `el`/EnumConnectionState
(`analysis/tools/packet_registry_from_jar.json`) + per-packet `readPacketData` field order
(`analysis/tools/packet_fields.json`). IDs are the registration index — verified to match the
protocol-47 wire IDs packet-by-packet against PrismarineJS `minecraft-data` (1.8).

Naming: `obf`/MCPName. Wire types: VarInt, i8/u8, i16/u16, i32, i64, f32, f64, bool(=u8),
String(N)=VarInt-byteLen+UTF8 with char cap N, byte[](VarInt len), BlockPos(i32,i8,i32),
ItemStack(see §7), NBT(VarInt-len gzip? see §7), IChatComponent(=String JSON), UUID(2×i64),
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
| 0x14 | `id`/C14PacketTabComplete | `message`:String(max=Short.MAX_VALUE), `targetBlock`:BlockPos |
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
