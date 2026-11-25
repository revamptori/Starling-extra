# Blocks, Items & Interaction — Minecraft 1.8.9

**Verified** from decompiled bytecode (`afh`/Block, `zw`/Item, `zx`/ItemStack,
`bda`/PlayerControllerMP, `ir`/C07PacketPlayerDigging, `ja`/C08PacketPlayerBlockPlacement,
`yo`/ItemBlock, `adm`/World). Combat notes included (no 1.9 cooldown mechanics).

## 1. Registries (1.8 integer-ID model)

- `Block.blockRegistry` — `RegistryNamespaced` mapping block *name* ↔ int id
  (`afh.r()`? — `blockRegistry` is a static field of `afh`; registered in the static
  initializer with string ids `minecraft:stone`…). ~251 block classes in
  `net/minecraft/block/*` (all listed in `class_catalog.json`).
- `Item.itemRegistry` — same pattern (`zw`); items share the id space with blocks
  (block instances also appear as items via `Item.getItemFromBlock`).
- `ItemStack` (`zx`): **2-byte id, count, 2-byte damage, optional NBT compound**
  (exact wire codec in `PACKET_REFERENCE.md` §7).
- Block state: `(id << 4) | meta` u16 — the 1.8 limit (4096 block types × 16 states);
  `IBlockState` (`alz`) wraps (block, property map); `Block.getStateFromMeta(int)` /
  `getMetaFromState(IBlockState)` convert.

## 2. Block behavior hooks (the ones gameplay depends on)

| Hook | Signature (obf/MCP) | Used for |
|---|---|---|
| hardness | `afh.t()`/`getBlockHardness` | dig time; **−1 (`arm.a`) = unbreakable** |
| dig speed | `afh.a(wn, adm, cj)`/`getPlayerRelativeBlockHardness` | per-tick damage (see §4) |
| activate | `afh.a(adm, cj, alz, wn, cq, float×3)`/`onBlockActivated` | right-click |
| collide | `afh.a(adm, cj, alz, pk)`/`onEntityCollidedWithBlock` | per-tick touch |
| neighbor | `afh.a(adm, cj, alz, afh)`/`onNeighborBlockChange` | redstone/physics |
| break | `afh.a(adm, cj, alz)`/`breakBlock` | drops/TE removal |
| add collision | `afh.a(adm, cj, alz, aug.List)`/`addCollisionBoxesToList` | movement |
| opacity | `afh.o()`/`getLightOpacity`, `p()`/`getLightValue` | lighting |
| slipperiness | `afh.L` (field) | physics (0.98 ice) |

Full behavioral catalog for every block type is mechanical repetition of these hooks;
the 251 classes are listed in `CLASS_CATALOG.md`. Redstone/door/rail logic lives in
their classes (`BlockRedstoneWire`, `BlockRailBase`, …).

## 3. Interaction flow (client, verified `bda`)

### 3.1 Left click (`clickBlock(BlockPos, EnumFacing)`)

1. Adventure-mode tool restriction (if `currentGameType.isAdventure()` and not creative
   bypass: held item must `canHarvestBlock` — `zx.c(afh)`).
2. `world.getWorldBorder().contains(pos)` guard.
3. **Creative**: C07 START_DESTROY_BLOCK + `clickBlockCreative` (instant
   `onPlayerDestroyBlock` + `sendBlockBreakProgress(entityId, pos, -1)` teardown);
   `curBlockDamageMP = 5` (re-swing cooldown).
4. **Survival**: if not already hitting this block: C07 ABORT (old pos) + C07 START;
   then:
   - If `blockHardness != -1` and `getPlayerRelativeBlockHardness(...) ≥ 1.0` →
     instant `onPlayerDestroyBlock` (tool-speed ≥ 1 tick).
   - Else: `isHittingBlock = true`, `currentBlock = pos`, `curBlockDamageMP = 0`,
     `stepSoundTickCounter = 0`, `sendBlockBreakProgress(entityId, pos, -1)`.
5. `onPlayerDamageBlock(pos, face)` per held-input tick: `curBlockDamageMP += block.getPlayerRelativeBlockHardness(player, world, pos)` (creative mode does NOT accumulate damage — it instant-destroys with a 5-tick re-swing cooldown `g = 5`, C07 START each cycle); step sound every 4 ticks: `PositionedSoundRecord(block.stepSound.resource, (volume+1)/8, pitch×0.5, pos+0.5)` (verified); `sendBlockBreakProgress(id, pos, floor(damage × 10) − 1)`; damage ≥ 1.0 → C07 STOP + `onPlayerDestroyBlock` + reset; wrong-block/no-input → `resetBlockRemoving` (C07 ABORT + progress −1)).
6. C07 wire (verified `ir`): `action:VarInt` (0 START, 1 ABORT, 2 STOP, 3 DROP_ALL,
   4 DROP, 5 RELEASE_USE), `position:(i32,i8,i32)`, `face:u8 (EnumFacing.getIndex())`.

### 3.2 Right click (`onPlayerRightClick(EntityPlayerSP, WorldClient, ItemStack, BlockPos, EnumFacing, Vec3)`)

1. `syncCurrentPlayItem()` (sends `C09PacketHeldItemChange` if `currentItem` changed).
2. hit floats = hitVec − blockPos (wire: 3× `u8/16.0` — verified `ja` read; 4-bit precision).
3. WorldBorder guard.
4. If not adventure-mode and player not sneaking-with-empty-hand: `onBlockActivated` —
   true ⇒ done (still sends C08!).
5. Else if `ItemStack.item` is `yo`/ItemBlock and `onItemUse` would fail ⇒ return false.
6. **C08** (`ja`) always sent: `position(i32,i8,i32)`, `face u8`, `heldItem`
   (ItemStack codec — sends the *server* copy slot), `hitX/Y/Z` (3× u8, `/16.0` decode).
7. Else `ItemStack.onItemUse(player, world, pos, face, hitX, hitY, hitZ)`; creative
   saves/restores item damage+count around the call (no stack consumption client-side).

### 3.3 Item use (right click in air / hold)

- `Minecraft.rightClickMouse` (`ax`): `objectMouseOver == null` → `playerController.
  onPlayerRightClick(player, world, stack, null?...)`-family; long-press:
  `rightClickDelayTimer = 4` between uses; `isUsingItem`/`itemInUseCount` →
  `Item.onItemRightClick`/`onItemUseFinish`; bow/sword-block/food use sends
  **C08 with `position = BlockPos(-1,-1,-1)`, `face = 255`** (verified `ja(zx)` ctor:
  `this(new cj(-1,-1,-1), 255, stack, 0f, 0f, 0f)` — the "use item in air" encoding).
- Swing: `C0APacketAnimation` on use/attack (client also plays the arm swing locally).

### 3.4 Attack (combat, 1.8 semantics)

- `Minecraft.clickMouse` (left): `objectMouseOver.entityHit` →
  `playerController.attackEntity(player, entity)` (verified 38 B: delegates to
  `player.attackTargetEntityWithCurrentItem(entity)`) + `swingItem()`.
- **1.8 combat = click spam**: attack damage = `attackDamage attribute (1.0 base) ×
  tool modifiers`, no cooldown timer, no sweeping edge, no shields. Criticals when
  falling (`motionY < 0`, not on ground, not in water/ladder); sprint-hit knockback
  (`knockBack` + `isSprinting` bonus); axe disables shields — **1.9 features do NOT apply**.
  Full damage math (base 1.0 + tool damage + enchantments + potion STRENGTH
  (`pe.c` ×0.5? — 1.8 strength = +130%? — verify `pr.attackTargetEntityWithCurrentItem`-family
  when porting combat; see `UNRESOLVED_QUESTIONS.md` Q-13)).

## 4. Digging math

`getPlayerRelativeBlockHardness(player, world, pos)` (1.8):
```
hardness = block.getBlockHardness(world, pos)          // -1 = unbreakable → 0 speed
if (hardness < 0) return 0
speed = player.canHarvestBlock(block)
      ? player.getDigSpeed(block, pos) : player.getDigSpeed(block, pos) / 100
      (0-based: getDigSpeed covers tool efficiency, haste, water-on-lava, on-ground)
return speed / hardness / (canHarvest ? 30 : 100)      // tick-fraction
```
(Exact `pr`/`wn` methods `a(afh, cj)` getDigSpeed etc. verified in
`PLAYER_PHYSICS.md` §6 hooks; full formula in §dig below — cite when implementing.)

## 5. Block/entity rendering & models (summary)

- Block models: JSON (`assets/minecraft/models/block/*`, blockstates `blockstates/*`)
  baked by `bou`/ModelManager + `bgd`/BlockRendererDispatcher; multipart/variants
  via `bgv`/BlockStateMapper. Render layers (SOLID/CUTOUT_MIPPED/CUTOUT/TRANSLUCENT)
  drive chunk mesh passes (`RENDERING.md` §5).
- Item models: `models/item/*` + `ItemModelGenerator` (`bgp`) for hand-drawn textures;
  inventory rendering `bjh`/RenderItem (`renderItemIntoGUI`, glint effect,
  `renderItemOverlays` durability bar).
- Break animation: `bfr` destroy-stage textures `textures/blocks/destroy_stage_0..8.png`
  rendered as an overlay pass over the target block.

## 6. Redstone & block ticks

- `World.scheduleUpdate`/`scheduleBlockUpdate` (scheduled ticks) + `updateBlockTick` —
  client receives `S23PacketBlockChange`/`S22PacketMultiBlockChange` results only; the
  integrated server runs the full update loop (see `WORLD_SYSTEM.md` §7).
- No client-side prediction of redstone outcomes — only placement/breaking prediction.

## 7. Rust notes

- Item/Block IDs stay u16 `(id<<4)|meta` internally for wire parity; maintain a
  name→id table for future-proofing.
- Reimplement the 251 block classes as data + hooks (behavior enum/trait methods) —
  code-gen from the catalog where possible.
- The interaction state machine (isHittingBlock, curBlockDamageMP, C07/C08 cadence)
  must be reproduced exactly for server compatibility.
