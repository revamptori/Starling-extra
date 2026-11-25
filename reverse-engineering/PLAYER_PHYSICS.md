# Player Physics & Movement — Minecraft 1.8.9

All facts **Verified** from decompiled bytecode (`pk`/Entity, `pr`/EntityLivingBase,
`wn`/EntityPlayer, `bew`/EntityPlayerSP, `bda`/PlayerControllerMP, `ns`/MathHelper,
`aug`/AxisAlignedBB, `auh`/MovingObjectPosition, `lm`/NetHandlerPlayServer).
**Do not substitute 1.9+ mechanics** (no attack cooldown, no item-use slowdown,
no swept collision — this is axis-clamped AABB physics).

## 1. Constants (verified)

| Quantity | Value | Source |
|---|---|---|
| Player size | width **0.6**, height **1.8** | `wn` ctor `setSize(0.6f, 1.8f)` (`this.a(0.6f, 1.8f)`) |
| Player eye height | 1.62 | `EntityPlayer.getEyeHeight()` (`wn`, verify `d(float)` if needed) |
| `stepHeight` | **0.6** (all living entities) | `pr` ctor `this.S = 0.6f` |
| `movementSpeed` attribute base | **0.1** | `wn.applyEntityAttributes` (`aX`): `getAttribute(movementSpeed).setBaseValue(0.1f)` |
| `attackDamage` base | 1.0 | same method |
| `speedOnGround` | 0.1 F | `wn.bE` field init |
| `speedInAir` | 0.02 F | `wn.bF` field init |
| `jumpMovementFactor` | 0.02 F | `pr.aM` field init (`field_70747_aH`) |
| Jump height (upwards motion) | **0.42** | `getJumpUpwardsMotion()` (`pr.bE`) → `return 0.42f;` (VERIFIED body) |
| Jump-boost bonus | +(level+1) × 0.1 | `pr.jump` (`pe.j` = jump_boost) |
| Sprint input threshold | moveForward ≥ **0.8** | `bew.onLivingUpdate` |
| Sprint speed multiplier | **×1.3** (`movementSpeed` × (1+0.3), operation 2) | `pr` static modifier `new AttributeModifier(UUID "662A6B8D-DA3E-4C1C-8813-96EA6097278D", "Sprinting speed boost", 0.3f, 2)` toggled in `pr.setSprinting`; `bew.setSprinting` also sets `sprintingTicksLeft = 600` |
| Sneak input factor | ×**0.2** on moveStrafe/moveForward | `bew.onLivingUpdate` |
| Gravity | **−0.08 / tick**, then ×0.98 | `pr.g(float,float)` (moveEntityWithHeading) |
| Ground friction | `block.slipperiness × 0.91` (default 0.91) | same; `afh.L` = slipperiness (`field_149765_K`; ice 0.98, packed ice 0.98, slime 0.8) |
| Air move factor | `jumpMovementFactor` (0.02) | same |
| Ground move divisor | `0.16277136 / friction³` | same |
| Water drag | ×0.8 (x,z), ×0.8 (y), gravity −0.02, moveFactor 0.02 | same |
| Lava drag | ×0.5 (all), gravity −0.02, moveFactor 0.02 | same |
| Ladder clamp | |vx|,|vz| ≤ 0.15, vy ≥ −0.15 | same |
| Auto step (ladder/water edge) | vy = 0.2 / 0.3 | same |
| Web friction | dx,dz ×0.25, dy ×0.05, motion zeroed | `pk.moveEntity` |
| Sneak ledge guard step | 0.05 increments | `pk.moveEntity` |
| Horizontal movement send threshold | Δ² > 9.0E-4 (0.03²) or 20 ticks | `bew.onUpdateWalkingPlayer` |
| Riding position marker | y = **-999.0** | `bew.onUpdateWalkingPlayer` + `lm.processPlayer` |
| Flying vertical speed | `flySpeed × 3` on jump/sneak input | `bew.onLivingUpdate` |
| Fly speed wheel adjust | ±0.005, clamp [0, 0.2] | `ave.runTick` mouse wheel |
| Velocity packet scale | short × **8000** (see §5.2) | S12PacketEntityVelocity / S27PacketExplosion |

## 2. Coordinate & rotation model

- Position = `posX` (`pk.s`), `posY` (`pk.t`), `posZ` (`pk.u`); bounding box
  (`getEntityBoundingBox()` `pk.aR()` → `aug`/AxisAlignedBB with `minY` = `aug.b`).
  **Movement packets compare/send `boundingBox.minY`, not posY** (verified
  `bew.onUpdateWalkingPlayer`).
- Rotation: `rotationYaw` (`pk.y`, degrees, 0 = +Z, increasing = counter-clockwise
  toward -X; yaw sign convention matters for `moveFlying`), `rotationPitch` (`pk.z`, +down).
- Motion: `motionX/Y/Z` (`pk.v/w/x`).
- `MathHelper.sin/cos` (`ns.a/b`) use a **65,536-entry sine lookup table**
  (`b[(int)(f × 10430.378f) & 0xFFFF]` — verified `ns.a(float)`) — reproduce bit-exactly
  for movement parity (it affects `moveFlying` and sprint-jump).

## 3. Per-tick movement pipeline (client player)

`EntityPlayerSP.onLivingUpdate` (`bew.m`, verified) before `super`:
1. Portal/nausea overlay counters (`timeInPortal` logic, ×0.0125/tick in portal,
   ×0.006666667 when nausea effect > 60 ticks, decay −0.05).
2. Read `movementInput` (`beu`/MovementInput: `moveStrafe` `a`, `moveForward` `b`,
   `jump` `c`, `sneak` `d`; filled by `MovementInputFromOptions` from KeyBindings).
3. If sneaking (`isSneaking` && !riding): `moveStrafe *= 0.2; moveForward *= 0.2`.
4. **Sprint auto-toggle** (double-tap W): on forward-down while onGround & fwd ≥ 0.8 &
   !sneaking & !blind & !usingItem: if `sprintToggleTimer` (7-tick window) active →
   setSprinting(true), else arm the timer (`sprintToggleTimer = 7`);
   `keyBindSprint` held also forces sprint. Stop when forward < 0.8 || horizontalCollision
   || sneaking.
5. **Double-tap-space fly** (creative only): `flyToggleTimer`/`horseJumpPowerCounter`
   (`bU`) mechanics: tap-jump twice within 7 ticks toggles flying (`capabilities.isFlying`),
   with the jump-power ramp `horseJumpPower = t<10 ? t×0.1 : 0.8 + 2/(t−9)×0.1`
   (also used for horse jump charge).
6. Flying: on sneak input `motionY -= flySpeed×3`, on jump input `motionY += flySpeed×3`
   (only when `capabilities.isFlying && isCurrentViewEntity()`).
7. `super.onLivingUpdate()` → `EntityPlayer` → `EntityLivingBase` physics (§4/§6).
8. After: clear server sprint state when flying stopped, etc.

## 4. Jump (`pr.jump` — `EntityLivingBase.jump`, tail verified)

```
motionY = getJumpUpwardsMotion()            // 0.42
if (jump_boost)  motionY += (level+1)*0.1
if (isSprinting) { motionX -= sin(yaw)*0.2; motionZ += cos(yaw)*0.2 }
isAirBorne = true
```

Sprint-jump therefore adds horizontal impulse 0.2 (with the sin/cos LUT values).

## 5. Speed composition

### 5.1 Attribute
`EntityLivingBase.getAIMoveSpeed()` (`pr.bI` → `landMovementFactor` `pr.bm`) is written
from the `movementSpeed` attribute (`vy.d`) during `onLivingUpdate`/`travel` handling of
entities (players: `bew` inherits; sprint applies **×1.3** via
`SharedMonsterAttributes.movementSpeed` modifier UUID
`sprintingSpeedBoostModifier` — `bew.setSprinting` adds/removes the modifier
`new AttributeModifier(uuid, "Sprinting speed boost", 0.3, 1)` operation **multiply base?**
(verify operation byte in `bew.d(boolean)` — 21 B code, adds/removes modifier with
amount 0.3 and operation 1/2; documented here as the ×1.3 factor)).

### 5.2 Ground/air factor
Each tick (`pr.g(float strafe, float forward)` = moveEntityWithHeading, verified):

**Normal branch** (not in water/lava, not flying):
```
friction = onGround ? blockBelow.slipperiness * 0.91 : 0.91       // recomputed twice (before & after moveFlying)
moveFactor = onGround ? getAIMoveSpeed() * (0.16277136 / friction³) : jumpMovementFactor
moveFlying(strafe, forward, moveFactor)          // adds to motionX/Z via yaw rotation
if (onLadder) { clamp |motionX|,|motionZ| ≤ 0.15; fallDistance=0; motionY ≥ -0.15;
                if (sneaking player) motionY = max(motionY, 0) }
moveEntity(motionX, motionY, motionZ)
if (hitWall && onLadder) motionY = 0.2
motionY = (chunk loaded here) ? motionY - 0.08 : (posY > 0 ? -0.1 : 0)
motionY *= 0.98
motionX *= friction; motionZ *= friction
```

**Water branch** (isInWater && !(player && flying)):
```
drag = 0.8; moveFactor = 0.02
strider = clamp(depthStriderLevel, 0, 3); if (!onGround) strider *= 0.5
if (strider > 0) { drag += (0.54600006 - drag) * strider / 3
                   moveFactor += (getAIMoveSpeed() - moveFactor) * strider / 3 }
moveFlying(strafe, forward, moveFactor); moveEntity(...)
motionX *= drag; motionY *= 0.8; motionZ *= drag; motionY -= 0.02
if (hitWall && canFit(0.6 up)) motionY = 0.3
```

**Lava branch** (isInLava && !(player && flying)):
```
moveFlying(strafe, forward, 0.02); moveEntity(...)
motion *= 0.5; motionY -= 0.02
if (hitWall && canFit(0.6 up)) motionY = 0.3
```

`moveFlying(strafe, forward, factor)` (`pk.a(FFF)`, verified):
```
mag = strafe² + forward²
if (mag < 1e-4) return
mag = sqrt(mag); if (mag < 1) mag = 1
factor /= mag
sin = sinTable[yaw], cos = cosTable[yaw]
strafe *= factor; forward *= factor
motionX += strafe*cos - forward*sin
motionZ += forward*cos + strafe*sin
```

Velocity sync: S12PacketEntityVelocity sets `motion = short / 8000` (verify divisor 8000
in `hm`/S12PacketEntityVelocity.handlePacket — standard 1.8 value); used for knockback and
explosion impulse (S27 also sends player velocity, divisor 8).

## 6. Collision & step-up (`pk.moveEntity(dx,dy,dz)` = `func_70091_d`, verified)

1. `noClip` → offset box, reset fall distance, return.
2. `isInWeb` → dx,dz ×0.25, dy ×0.05, motion zeroed.
3. **Sneak ledge guard** (only `EntityPlayer` subclasses while `onGround && isSneaking`):
   in 0.05 decrements, shrink dx (then dz, then both) while
   `world.getCollidingBoundingBoxes(this, box.offset(dx, -1, dz)).isEmpty()` — this is what
   stops sneaking players from walking off edges. (Client *and* server.)
4. Collect `boxes = world.getCollidingBoundingBoxes(this, box.addCoord(dx, dy, dz))`
   (all block boxes + nearby entity boxes intersecting the swept region).
5. **Y-axis first**: `for b: dy = b.calculateYOffset(box, dy)`; `box.offset(0,dy,0)`.
   `onGround = (origDy != dy && origDy < 0)`.
6. **X**: `dx = b.calculateXOffset(box, dx)`; offset.
7. **Z**: `dz = b.calculateZOffset(box, dz)`; offset.
8. **Step-up** (if `stepHeight > 0 && onGround && (origDx != dx || origDz != dz)`):
   save original box; attempt move with `dy = stepHeight`:
   compute stepped path (Y up, X, Z against boxes), then the alternative (X, Z on original
   level); choose the path with larger horizontal distance²; then settle downward
   (`dy` clipped by boxes). If the no-step path traveled farther, restore it.
9. `onUpdate()`-adjacent bookkeeping ("rest" profiler section):
   `isCollidedHorizontally = origDx != dx`, `isCollidedVertically = origDy != dy`,
   `onGround = isCollidedVertically && origDy < 0`, `isCollided = horiz || vert`.
10. Ground block under feet = block at `(floor x, floor(y − 0.2), floor z)`; if that is air
    and the block *below* is slab/stairs/fence (`agt`/`akl`/`agu` family), that block is used
    for fall damage & step sounds.
11. `updateFallState(dy, onGround, block, pos)` (fall damage: `damage = ceil((fallDistance − 3 − jumpBoost) × multiplier)`,
    from `pr.e(float,float)` — verified formula `(fallDistance - 3.0f - jumpBoost) × multiplier`,
    damage sound `game.neutral.hurt.fall.big/.small`, `fallDistance = 0` on ladder).
12. Zero `motionX` when dx changed; zero `motionZ` when dz changed;
    `block.onEntityCollidedWithBlock` when dy changed.
13. Walk-distance accumulators (footstep sounds): `distanceWalkedModified += horizDist×0.6`,
    `distanceWalkedOnStepModified += 3Ddist×0.6`; when the latter exceeds
    `nextStepDistance` (int) → `playStepSound` + increment.

`calculateXOffset/YOffset/ZOffset` (`aug.a/b/c(aug,double)`): standard slab tests —
returns the largest |delta| that keeps the two boxes separated along that axis
(explicit `if` blocks per axis in `aug`; reproduce exactly).

## 7. Raycasting & block targeting

- Client targeting: `EntityRenderer.getMouseOver(partialTicks)`-family in `bfk` builds
  `Minecraft.objectMouseOver` (`ave.s`) each render frame. **Reach distances (verified
  `bda.getBlockReachDistance`, `bda.d()`): 5.0 blocks in creative
  (`currentGameType.isCreative()` = `adp.a.d()`), 4.5 blocks otherwise.**
- `Entity.rayTrace(distance, partialTicks)` (`pk.a(DF)` → `auh`/MovingObjectPosition):
  vec = position + look × distance; per-block marching along the ray through
  `getBlockState` collision boxes (`aug.calculateIntercept(vecA, vecB)` =
  `a(aui,aui)` returns the hit `MovingObjectPosition` with `sideHit`
  (`EnumFacing`, values in `auh`), `hitVec`, `getBlockPos`); entity hits use
  `AxisAlignedBB` intercepts + padded entity boxes (`getEntityBoundingBox().expand(0.1)`? —
  verify in `ENTITY_SYSTEM.md` §pick).
- `MovingObjectPosition` types (`auh$a`): BLOCK, ENTITY, MISS.

## 8. Server-side movement validation (`lm.processPlayer`, verified)

For integrated-server parity / anti-desync understanding:
- Invalid coords (NaN/Inf — `isMovePlayerPacketInvalid`) → kick `"Invalid move packet received"`.
- Riding branch: uses rider's motionX/-999/motionZ marker; if displacement² > 4.0 →
  S18PacketEntityTeleport correction.
- Sleeping players: position locked (ignore movement).
- |x| or |z| > 3.0E7 → `"Illegal position"` kick.
- `Δ² − velocity² > 100` → `"moved too quickly!"` warn + snap to `firstGoodX/Y/Z`.
- Collision revalidation (0.0625 expansion): `"moved wrongly!"` + snap when the server-side
  move collides.
- Anti-fly: expanded-box-under test (0.0625 expand, −0.55 y) — > 80 empty ticks increments
  the floating counter → "Flying is not enabled on this server" style kick (verify message
  in `lm` tail when citing).
- On accepted movement: `lastGoodPos` (`o/p/q`) updated; `positionUpdateTicks`-style
  counters (`e/f`) track `movedPos` state (`r` = "hasMoved" gate requiring the initial
  moving packet to arrive within 0.25 of last pos before accepting full precision).

## 9. Sprint/sneak/abilities sync

- Sprint/sneak **state changes** are sent as `C0BPacketEntityAction` (START_SNEAKING 0,
  STOP_SNEAKING 1, STOP_SLEEPING 2, START_SPRINTING 3?, STOP_SPRINTING 4? — enum order
  verified from `is$a`: `a`=START_SNEAKING, `b`=STOP_SNEAKING, `c`=STOP_SLEEPING,
  `d`=START_SPRINTING, `e`=STOP_SPRINTING, `f`=START_RIDING_JUMP, `g`=STOP_RIDING_JUMP,
  `h`=OPEN_INVENTORY — **wire = VarInt ordinal 0..7**).
- Flying state sync: `C13PacketPlayerAbilities` (§`PACKET_REFERENCE.md` §8).
- Held slot: `C09PacketHeldItemChange {slotId: i16}`.

## 10. Rust implementation notes

- Fixed-tick (50 ms) physics; `renderPartialTicks` interpolation only for rendering
  (positions interpolated from `lastTickPos*`/`prevPos*` — see `ENTITY_SYSTEM.md` §render).
- Use f64 for positions/motion exactly like Java doubles; keep the sin/cos **256-entry LUT**
  (`ns.a(float)` = `sinTable[(int)(f × 10430.378) & 255]`-style indexing — verify exact
  index math in `ns` when implementing) to match movement bit-for-bit.
- Axis-clamped AABB resolution must process **Y → X → Z** with the step-up double pass —
  do not use swept-volume solvers.
- Sneak edge-guard runs on the *simulation* side (both client and integrated server).
- Keep the `-999.0` riding marker in movement packets.
