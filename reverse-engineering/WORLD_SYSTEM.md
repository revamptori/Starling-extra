# World & Chunk System — Minecraft 1.8.9

**Verified** from decompiled bytecode (`adm`/World, `bdb`/WorldClient, `amy`/Chunk,
`amz`/ExtendedBlockStorage, `amw`/NibbleArray, `alz`/IBlockState, `cj`/BlockPos,
`go`/S21PacketChunkData, `gp`/S26PacketMapChunkBulk, `le`/WorldServer,
`anm`/WorldProvider family).

## 1. Hierarchy

```
adm/World  (abstract)
 ├── bdb/WorldClient      client-side view (chunks from network; ChunkProviderClient `bcz`)
 └── le/WorldServer       integrated-server worlds (ChunkProviderServer `ld`)
       └── kz/WorldServerMulti, kx/DemoWorldServer
anm/WorldProvider (Surface `ano`, Hell `ann`, End `anp`) — dimension rules
ato/WorldInfo (saved metadata: seed, spawn, time, rain/thunder, difficulty, gamemode,
               world name, border fields, version…) + adp/WorldSettings (creation params)
ams/WorldBorder (1.8 world border; synced with S44PacketWorldBorder `hg`)
```

Client world fields (verify each via `class_catalog.json`): `playerEntities` (`j`),
`loadedEntityList`, weather strengths, `worldBorder`, `provider`, `skylightSubtracted`,
`difficulty`, `isRemote` (`D` — **true on client**; physics uses it, see
`PLAYER_PHYSICS.md` §6).

## 2. Coordinates & block state model (1.8)

- `cj`/BlockPos (immutable x,y,z ints; long packing **verified** `cj` clinit:
  x 26 bits @38, y 12 bits @26, z 26 bits @0 — `toLong = (x&0x3FFFFFF)<<38 | (y&0xFFF)<<26 | (z&0x3FFFFFF)`;
  widths from `1 + ceil(log2(30000000))`).
- `alz`/IBlockState = block + property map (`aly`/BlockStateBase); concrete
  `ama`/BlockState holds the immutable property-value permutations.
  Property types: `PropertyInteger`, `PropertyBool`, `PropertyDirection`… in
  `net/minecraft/block/properties/*` (mapped classes `alw`-family — see catalog).
- Block state ID on the wire = 16-bit `(blockId << 4) | metadata` (4-bit meta — the 1.8
  limit: ≤ 4096 blocks × 16 states; `Block.getStateFromMeta`/`getMetaFromState`).

## 3. Chunk storage (`amy`/Chunk, verified fields)

| Field (MCP) | Type | Meaning |
|---|---|---|
| `storageArrays` | `ExtendedBlockStorage[16]` | sections (y/16); **null = all-air** |
| `blockBiomeArray` | byte[256] | biome ids (z×16+x) |
| `heightMap` | int[256] | highest non-air per column |
| `precipitationHeightMap` | int[256] | highest rain/snow layer |
| `updateSkylightColumns` | boolean[256] | pending skylight columns |
| `chunkTileEntityMap` | Map<BlockPos, TileEntity> | block entities |
| `entityLists` | `List[16]` | entities per y-slice (16 slices) |
| `isTerrainPopulated`/`isLightPopulated`/`isModified`/`hasEntities` | flags | gen/save state |
| `xPosition`/`zPosition` | int | chunk coords |
| `queuedLightChecks` | int | pending light updates |
| `tileEntityPosQueue` | ConcurrentLinkedQueue | TE sync queue |

`amz`/ExtendedBlockStorage (verified):
| Field | Type | Meaning |
|---|---|---|
| `yBase` | int | section y × 16 |
| `blockRefCount`/`tickRefCount` | short-ish ints | non-air / tickable counts |
| `data` | **char[4096]** | block states `(id << 4) \| meta`, index `(y×16+z)×16+x` |
| `blocklightArray` | `amw`/NibbleArray (2048 bytes) | block light 0–15 |
| `skylightArray` | `amw`/NibbleArray | sky light 0–15 |

NibbleArray: 2048 bytes, two nibbles per byte (low = even index).

## 4. Chunk network format (verified `go.a(Chunk, boolean fullChunk, boolean hasSky, int mask)`)

`S21PacketChunkData` fields: `chunkX` i32, `chunkZ` i32, `fullChunk` bool,
`ExtractedData { bitMask: VarInt, data: byte[](VarInt len) }`.

`data` layout (order matters):
1. For each included section (in section order 0..15): **4096 chars, little-endian**
   (low byte then high byte) — the `data` array of `ExtendedBlockStorage`.
2. For each included section: block-light nibbles (2048 B).
3. If `hasSky` (overworld): for each included section: sky-light nibbles (2048 B).
4. If `fullChunk`: biome byte[256] appended.

Included sections: non-null sections with bit set in `bitMask`; when `fullChunk`, empty
(all-air) sections are omitted. Total size formula
`go.a(bitCount, hasSky, full)` = `n×(8192 + 2048 + (hasSky?2048:0)) + (full?256:0)`.

`S26PacketMapChunkBulk` (verified `gp`): `skylightSent` bool, `count` VarInt,
`chunkX[]` i32×count, `chunkZ[]` i32×count, then per-column ExtractedData (bitMask VarInt +
data). (No per-column fullChunk flag — all columns are full.)

Client apply: `WorldClient.doPreChunk(x, z, load)` (`bdb.b(IIZ)`) —
load: `chunkProvider.loadChunk` + `populate`; unload: `doChunkUnload` (drops entities/TEs).

## 5. Lighting (1.8 model)

- Sky light: computed at load (`Chunk.generateSkylightMap` — column height-map sweep with
  the 15-decay flood), block light: `World.checkLightFor(EnumSkyBlock, BlockPos)`
  (`adm.a(...)`) — BFS with 15→(14 per step) decay over 16 Chebyshev? (1.8 uses the classic
  `checkLightFor` flood: `canBlockSeeSky`, neighbor max-1 propagation).
- `skylightSubtracted` = height-based daylight reduction (`World.computeSkylightSubtracted`,
  smooth via `provider.calcLightSubtractions`).
- Client receives light in chunk data; on block changes re-runs the local light BFS
  (S23/S22 apply + `World.setBlockState` → `markAndNotifyBlock` → `checkLight`).
- Light values feed: block brightness `getCombinedLight(pos, light)` = `(sky<<20)|(block<<4)`
  (the `TEX_2S` lightmap uv; verify packing in `alz`/World `getCombinedLight`),
  AO in mesh building, and the lightmap texture (`RENDERING.md` §6).

## 6. World tick (`adm.p` = updateWeatherBody + `World.tick` phases)

`World.tick()` (`adm.c()` → `p()`):
1. **Weather** (verified): difficulty-lock countdown; rain timer: when expired, toggle
  `isRaining` and schedule next: raining→`rand(12000)+3600`, clear→`rand(168000)+12000`;
  thunder timer: toggle with raining→`rand(12000)+12000`, clear→`rand(168000)+12000`;
  `rainStrength`/`thunderStrength` lerp ±0.01 per tick (clamped 0..1), with `prev*` copies.
2. `updateBlocks()`/`D()`: "buildList" — for each player, chunks within view radius
   (`q()` = view distance) enter the tick list; scheduled block ticks
   (`pendingTickListEntries` sorted by due time + priority), random block ticks
   (1.8: per-chunk 3 random ticks per sub-chunk-tile? — `WorldServer.tickBlocks` picks
   random blocks in loaded chunks; client `animateTick` does particles only),
   block events, thunder/lightning (`WorldServer`), snow/ice formation rules.
3. `updateEntities()` (in `World.tick` body after weather): all `entityLists` entries
   `onUpdate`/`onEntityUpdate`; `loadedTileEntityList` tick; remove invalid.

Client (`bdb`): skips server-side weather randomization (game state packets drive
rain/thunder strength), entity list = server-synced set only.

Time: `worldInfo.getWorldTime` (`totalWorldTime`, `worldTime`) synced by S03PacketTimeUpdate
(every 20 ticks the client also asks? — S03 sets both; day-time for sky angle =
`(worldTime % 24000)` → sun angle `world.getCelestialAngle(partialTicks)` (`adm.a(F)`) —
verify exact formula `(worldTime%24000)/24000` + smooth angle math when porting sky).

## 7. Block updates & interaction

- `World.setBlockState(pos, state[, flags])` (`adm.a(cj,alz,int)`): stores state, updates
  height maps, `markAndNotifyBlock` (neighbor `onNeighborBlockChange`, TE attach/remove),
  light updates, `markChunkDirty`.
- Update flags (int bitfield): 1 = send block update (client re-render), 2 = don't re-render
  (server-side only flag), 4 = prevent re-render, 8 = force re-render / update observers
  (verify `World` constants `a/b/c/d`? — standard 1.8 flags: `UPDATE_NEIGHBORS=1,
  SEND_TO_CLIENT=2, NO_RERENDER=4, RERENDER_MAIN_THREAD=8` — confirm names in
  `CLASS_CATALOG.md` when implementing).
- Scheduled ticks: `scheduleUpdate`/`scheduleBlockUpdate` (tick rate per block —
  redstone/repeater specifics in `BLOCKS_AND_ITEMS.md`).
- Client-side gameplay edits go through `bda`/PlayerControllerMP (see
  `BLOCKS_AND_ITEMS.md` §interaction), which sends C07/C08 and predicts locally.

## 8. Chunk loading (client)

- `bcz`/ChunkProviderClient: `loadChunk(x,z)` allocates empty `Chunk`, `unloadChunk` drops
  it; the *server* drives load/unload via S21/S26 + `WorldClient.doPreChunk`.
- Render-side loading is independent (`RenderChunk` per 16³; see `RENDERING.md` §5).
- The integrated server (`ld`/ChunkProviderServer + `anw`/ChunkLoaderAnvil-family
  `net/minecraft/world/chunk/storage/*`) generates/saves chunks; generation pipeline
  (`net/minecraft/world/gen/*` — `IChunkProvider` implementations, biome providers
  `net/minecraft/world/biome/*`) is out of scope for a multiplayer-first client but is
  required for integrated-server parity — see `IMPLEMENTATION_ROADMAP.md` phase ordering.

## 9. World border (`ams`/WorldBorder)

Fields (verify in `ams`): center (x,z), `diameter`, `targetSize`, `timeUntilTarget`,
`damageBuffer`? (`portalTeleportBoundary`), `warningDistance`, `warningTime` —
synced via S44PacketWorldBorder actions (see `PACKET_REFERENCE.md` §8). Affects fog
(dark red at edges), movement clamping (server-side) and teleport rules.

## 10. Rust mapping notes

- Chunk = `Box<[Option<Section>; 16]>`; Section = `Box<[u16; 4096]>` + two `NibbleArray`
  (or packed `u64` words). Store states as `(id<<4)|meta` u16 exactly for wire parity.
- Biomes: `[u8; 256]`.
- Lighting: port the 1.8 BFS (`checkLightFor`) — do **not** use the modern heightmap light;
  visual parity (dark spots under overhangs etc.) depends on the old algorithm.
- Keep the S21 byte order verbatim (LE chars, block-light pass, sky-light pass, biome).
