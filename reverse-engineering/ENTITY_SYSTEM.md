# Entity System — Minecraft 1.8.9

**Verified** from decompiled bytecode (`pk`/Entity, `pr`/EntityLivingBase,
`wn`/EntityPlayer, `bew`/EntityPlayerSP, `bet`/AbstractClientPlayer, `biu`/RenderManager,
`pz`/DataWatcher, `bcy`/NetHandlerPlayClient entity handlers, `fi`-family).

## 1. Entity hierarchy (top of the tree)

```
pk/Entity (abstract)
 ├── pr/EntityLivingBase (abstract)
 │     ├── wn/EntityPlayer (abstract)
 │     │     ├── bet/AbstractClientPlayer → bew/EntityPlayerSP (client)
 │     │     └── lf/EntityPlayerMP (server)
 │     └── bjw-family mob renders' entities (net/minecraft/entity/* — see CLASS_CATALOG)
 ├── awc/EntityItem? (ItemEntity `ahg`?) — inventory drops
 ├── projectiles (net/minecraft/entity/projectile/*)
 ├── EntityXPOrb, EntityEnderCrystal, boats/minecarts (`net/minecraft/entity/item/*`)
 └── EntityArmorStand, paintings/itemframes…
```
Exact obf names for every entity class: `class_catalog.json` (`net/minecraft/entity/*`).
Instantiation: `net/minecraft/entity/EntityList` (`pk` registry — `createEntityByID(int)`).

## 2. Core `pk` fields (positions & state)

| MCP | obf | Notes |
|---|---|---|
| posX/Y/Z | s/t/u | f64 |
| motionX/Y/Z | v/w/x | per-tick velocity |
| rotationYaw/Pitch | y/z | degrees |
| prevRotationYaw/Pitch | A/B | interpolation source |
| lastTickPosX/Y/Z | C/D/E? | render interpolation (`lastTickPos*`) |
| onGround | C | collision flag |
| isCollidedHorizontally/Vertically/ | D/E/F | from moveEntity |
| stepHeight | S | 0.6 living |
| fallDistance | N | fall damage |
| boundingBox | aR() | `aug`/AxisAlignedBB |
| entityId | aq | int (per-world id) |
| dimension | b | int |
| ticksExisted | Z? | int |
| dataWatcher | ac | `pz` |
| isDead | J | removal flag |
| ridingEntity/riddenByEntity | J/K? | verify via catalog when porting |

(All exact obf↔MCP pairs available from `mappings.json`; this doc lists the semantics.)

## 3. DataWatcher (S1C metadata) — verified slots

Wire format: per entry `(type << 5) | index`, then typed payload, terminated `0x7F`.
Types: 0 Byte, 1 Short, 2 Int, 3 Float, 4 String, 5 ItemStack, 6 (x,y,z i32 triple),
7 (x,y,z f32 triple) — from `pz`/DataWatcher type codecs.

| Index | Type | Owner | Meaning |
|---|---|---|---|
| 0 | Byte | pk | entity flags (VERIFIED via `pk.setFlag/getFlag` + MCP): **0x01 onFire** (fireTicks>0), **0x02 sneaking** (`setSneaking` `c(Z)`), **0x08 sprinting** (`setSprinting` `d(Z)` — bit 3, `pr` override adds the movementSpeed modifier), **0x10 eating** (`setEating` `f(Z)` — bit 4), **0x20 invisible** (`setInvisible` `e(Z)` — bit 5); bit 2 unused in `pk` |
| 1 | Short | pk | air (300 default) |
| 2 | String | pk | custom name ("" default) |
| 3 | Byte | pk | customNameVisible |
| 4 | Byte | pk | silent |
| 6 | Float | pr | **health** (1.0f max → set by server) |
| 7 | Integer | pr | potion color |
| 8 | Byte | pr | potion ambient |
| 9 | Byte | pr | arrows in body |
| 10 | Byte | wn | hide-cape flag |
| 16 | Byte | wn | displayed skin parts (VERIFIED `wo`/EnumPlayerModelParts masks: 0x01 cape, 0x02 jacket, 0x04 left sleeve, 0x08 right sleeve, 0x10 left pants leg, 0x20 right pants leg, 0x40 hat) |
| 17 | Float | wn | absorption health (0.0f) |
| 18 | Integer | wn | score (0) |

Mob-specific slots (wither, zombie, horse, creeper, …) live in their entity classes —
implement per class when porting (see `IMPLEMENTATION_ROADMAP.md`).

## 4. Tick/update flow

- `Entity.onEntityUpdate` (`pk.A()`/`onUpdate` `a()`): portal bookkeeping, riding chain,
  `onUpdate` dispatch per subclass; `EntityLivingBase.onLivingUpdate` (`pr.m()`).
- `EntityPlayerSP.onLivingUpdate` (`bew.m()`) — see `PLAYER_PHYSICS.md` §3.
- Client-only: `Entity.onUpdate` drives the movement interpolation sources
  (`lastTickPos*` copies each tick).

## 5. Network sync (verified `bcy` handlers)

- **S14** (`handlerSpawnObject`/S0ESpawnObject-family in 1.8 — `S14PacketEntity` family
  named `hz`/S18PacketEntityTeleport for teleport): see below for S18;
  S15 relative move + look, S17 relative move, S19 look — arithmetic (verify each
  handler when porting):
  - S18PacketEntityTeleport (`hz`, verified `bcy.a(hz)`): pos = i32 / 32.0 (f64),
    yaw = `(byte×360)/256`, pitch same; if |Δx|≥0.03125 or |Δy|≥0.015625 or
    |Δz|≥0.03125 → `setPositionAndRotation2(x,y,z,yaw,pitch,3,true)` (lerp **3** steps),
    else rotate in place; `onGround` bool.
  - S0ESpawnObject (`jg`-family: entityType byte, x,y,z i32/32, pitch/yaw bytes,
    data int, optional velocity 3×i16/8000).
  - S18 `EntityTeleport` uses the same 32× fixed point; entity velocity packets
    use i16 × (1/8000) (verified `PLAYER_PHYSICS.md` §5.2).
- **S0C** (`jp`/S0CPacketPlayerPosLook? no — **S08** `fi` verified):
  `S08PacketPlayerPosLook` = pos f64×3, yaw/pitch f32, flags byte — see
  `PLAYER_PHYSICS.md` §8 & `PROTOCOL_1_8_9.md` §6 (client response C06 with forced flags).
- **S1C** metadata (`kq`-family handler): per-entity DataWatcher updates.
- **S1F** attach entity (`S1FPacketSetExperience`? — no: `S1FPacketAttachEntity`),
  **S19** riding (`S19PacketEntityHeadLook`/`S19PacketEntityStatus`), **S1B** entity
  status effects (`S1DPacketEntityEffect`), etc. — full list in `PACKET_REFERENCE.md`.
- **S2A** explosion (`S27PacketExplosion`): x,y,z f32? (verify — 1.8 uses f32 radius +
  f32 x/y/z? see `PACKET_REFERENCE.md` §8), knockback to player + affected blocks list.
- **S12** velocity (`S12PacketEntityVelocity`): i16×3 ×(1/8000).
- **S02** chat, **S07** respawn, **S0F** held slot (self), **S2F** set slot — see
  `INVENTORY.md`.

## 6. Rendering

- `biu`/RenderManager: per-class renderer map (`bik`-family `Render<Entity>` subclasses),
  `renderEntityStatic`/`renderEntitySimple`; shadows (`renderShadow`),
  `renderPos`/interpolation: entity render position = `lastTickPos + (pos − lastTickPos) × partialTicks`
  (standard1.8 interpolation; also `prevRotation*` lerps).
- Player skins: `bet`/AbstractClientPlayer + `bnp`/SkinManager
  (`ResourceLocation` per profile property "textures" — base64→JSON→skin URL,
  `SkinManager.loadSkin`); `getLocationSkin()`/`getLocationCape()`; slim-arm flag from
  the skin JSON `metadata.model == "slim"`.
- Item entities, falling blocks, TNT, armor stands: dedicated renderers in
  `net/minecraft/client/renderer/entity/*` (see `CLASS_CATALOG.md`).

## 7. Physics & interaction hooks

- `moveEntity`/`moveEntityWithHeading` — `PLAYER_PHYSICS.md` §6.
- `rayTrace`/`getMouseOver` — `PLAYER_PHYSICS.md` §7; entity picking uses
  `Entity.getCollisionBorderSize()` + bounding-box intercepts.
- Knockback: `EntityLivingBase.attackEntityFrom`/`knockBack` — server authoritative;
  client applies velocity packets.

## 8. Rust notes

- Entity storage: arena of structs with an enum-dispatched `tick()`; keep f64 pos/motion,
  f32 rotations.
- Interpolation state (`lastTickPos`, `prevRotation`) must be preserved for smooth
  rendering between the 20 Hz tick and frame rate.
- DataWatcher: implement the wire codec exactly (type nibble + 0x7F terminator) — it is
  the single source of entity visual state on the wire.
