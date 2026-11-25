# Java → Rust Architecture Mapping — Minecraft 1.8.9

How the verified 1.8.9 client structure maps onto the Starling Rust codebase.
Principles: keep behavior parity first (bit-exact where the protocol demands it),
idiomatic Rust second.

## 1. Runtime shape

| Java (1.8.9) | Rust (Starling) |
|---|---|
| `Minecraft` singleton + "Client thread" | `Client` struct owned by the main task; `tick()` + `render()` methods |
| 20 Hz tick + render loop (`run`/`runGameLoop`) | same structure (`GAME_LOOP.md` §2): accumulator over `Instant` |
| Netty event loops | `tokio` runtime; `NetworkConnection` task with channel + codec |
| `addScheduledTask` + `scheduledExecutables` | `crossbeam`/`tokio` mpsc queue drained at tick start |
| Server thread (integrated) | `tokio` task with fixed tick (phase 8+ of roadmap) |
| `ChunkRenderDispatcher` pool | `rayon`/custom thread pool + vertex buffers uploaded on GL thread |
| java inheritance (Entity→Living→Player) | structs + `trait`s (`trait EntityBehaviour`), or enum-dispatch; keep a per-entity `EntityKind` |
| DataWatcher | `MetadataStore` with wire codec (type nibble + 0x7F) |
| Guava Multimap / collections | `Vec`/`HashMap` + small helpers |
| `java.util.Random` | port the 48-bit LCG exactly (world gen parity) |
| GC (EntityList churn) | arena/slotmap (`EntityId(u32)`) + generational recycle |

## 2. Type mapping

| Java | Rust |
|---|---|
| `double` pos/motion | `f64` |
| `float` rotations, brightness | `f32` |
| `String` (UTF-16) | `String`/`&str` (UTF-8) — chat JSON uses `\uXXXX` escapes on the wire; decode to `char` |
| `byte[]` NBT | `Vec<u8>` + `nbt` crate-style parser (exact 1.8 NBT grammar) |
| `ItemStack` null | `Option<ItemStack>` (wire id −1/0 + count 0 encodings) |
| `EnumX` | Rust `enum` with `from_ordinal`/`to_ordinal` for VarInt codecs |
| `BlockPos` (immutable) | `BlockPos(i32,i32,i32)` Copy + `BlockPos::from_long` packing (verify 1.8 packing in `cj`) |
| `AxisAlignedBB` | `struct Aabb { min: Vec3d, max: Vec3d }` with the 3 axis-offset methods |
| `IBlockState` | `BlockState { block: &'static Block, props: StateProps }` interned (u16 id) |

## 3. Networking layer

```
tokio TcpStream
 └── codec task (framing: VarInt length prefix ≤3B, 21-bit cap — verified NETWORK_ARCHITECTURE.md §3)
      ├── optional AES/CFB8 stream cipher (inserted before decode — verified §5)
      ├── optional compression (dataLength:VarInt(0=raw)+data, ≤0x200000 — verified §3)
      ├── Packet enum (Play state: 74 cb / 26 sb — verified PROTOCOL_1_8_9.md §3)
      └── handler trait (NetHandlerPlayClient analog) → Client event queue
```
- Packet structs mirror `PACKET_REFERENCE.md` codecs exactly (field order = wire order).
- `fh.a`-style **thread jump** (PacketThreadUtil.scheduleTask) → all handlers run on the
  client task via the scheduled-task queue.

## 4. World & chunks

- `Chunk` storage identical to `WORLD_SYSTEM.md` §3 (`u16` states `(id<<4)|meta`,
  nibble arrays) — required for S21 round-trips.
- Lighting: port `checkLightFor` BFS (old algorithm — visual parity).
- Meshing: worker builds per-layer vertex arrays (BLOCK format 28B stride), main thread
  uploads; visibility via frustum +1.8 translucency sort.

## 5. Rendering

- `GlStateManager` port = a `GlState` cache struct (bindings, blend, matrix stack).
- Matrix stack: small hand-rolled `Mat4` stack matching GL semantics
  (load/translate/rotate/scale/push/pop).
- Tessellator/WorldRenderer port: `VertexBuf` with `VertexFormat` descriptor table
  (the 12 formats from `RENDERING.md` §2).
- Shaders: GLES2-compatible for the entity-outline pass; fancy post chains optional.

## 6. Game logic modules (crate layout proposal)

```
starling/
  protocol/      — packets, codecs, registry (from PACKET_REFERENCE.md)
  net/           — connection, auth (Yggdrasil join)
  world/         — chunks, lighting, block states, ticks
  entity/        — entities, metadata, physics (PLAYER_PHYSICS.md)
  blocks/        — 251 block behaviours (data + hooks)
  items/         — items, stacks, NBT
  inventory/     — containers, slot logic
  client/        — loop, input, GUI, render (RENDERING.md)
  render/        — GL/GLES abstraction, atlas, meshing
  audio/         — sound engine
  resources/     — packs, locale, textures
  server/        — integrated server (later phase)
```

## 7. Determinism & parity testing

- Fixed-point conversions (S18 ×32, S12 ×8000, rotations ×256/360) are shared constants.
- `MathHelper` sin/cos 65,536-entry LUT ported verbatim (movement parity).
- Golden tests: `TESTING_STRATEGY.md`.
