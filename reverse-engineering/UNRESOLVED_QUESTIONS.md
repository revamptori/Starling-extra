# Unresolved Questions & Verification Log — Minecraft 1.8.9 RE

Every claim in this doc set is marked Verified / Assumed / Unresolved. This file is
the single live list of what remains open, plus a log of questions that were closed
during analysis (so they are not re-opened).

## A. Open items (as of documentation completion)

### A1. Legacy server-list ping (`jk.a(ea)` — LegacyPingHandler)
The obf inner `jk` of NetworkSystem handles the **pre-Netty 1.6-era server-list ping**
("§1\u00a7" style handshake byte 0xFE). Body not read line-by-line. Impact: only
ancient pingers. Action: read `jk` before implementing the LAN server-list responder.

### A2. Combat damage math details
Shape verified (1.8 semantics — no cooldown, click spam; `attackDamage` base 1.0,
sprint knockback, `PLAYER_PHYSICS.md`/`BLOCKS_AND_ITEMS.md` §3.4). Exact formulas in
`pr.attackEntityFrom`/`knockBack`, enchantment damage (`net/minecraft/enchantment/*`),
potion STRENGTH scaling, critical-hit multiplier are **Assumed** (classic values:
crit ×1.5, strength +1.3 damage 1.8?) — bodies unread. Action: read
`pr` damage methods + `wn.attackTargetEntityWithCurrentItem` before combat tests.

### A3. Audio distance model constants
`bpx` play path verified (§`AUDIO.md`), but the paulscode `Library` distance model
(rolloff/min-max distance defaults) is Unresolved. Action: capture from a running
original client or read paulscode source when porting positional audio.

### A4. Anvil world save format (`.mca`)
`net/minecraft/world/chunk/storage/*` (AnvilChunkLoader/RegionFile/ExtendedBlockStorage
serialization) unread. Needed only for single-player/integrated server (roadmap phase 8).

### A5. Celestial angle & sky rendering formulas
`adm.getCelestialAngle(partialTicks)` exact smoothing + sunrise/sunset gradient math
unread. Visual-parity polish item (`RENDERING.md` §4).

### A6. Mob AI internals
`net/minecraft/entity/ai/*` (65 classes) — deferred content depth (needed for
single-player; not for multiplayer parity).

### A7. S31 window property index semantics
Wire known (`PACKET_REFERENCE.md` §8). Per-container property slots (furnace
cook/progress, enchanting levels & seed, brewing times, villager trade list NBT via
S3F) map to container-class `updateProgressBar` bodies — content phase.

### A8. Enchanting/villager cost & offer formulas
`wj`/ContainerEnchantment randomness (java.util.Random LCG semantics known;
seed flow via S31 property 0 + C11) and `adt`?/MerchantOffers NBT layout — content phase.

### A9. Minor string literals
Exact server-side kick message for the fly check in `lm` (physics §8 references the
"80 ticks" counter; message text not quoted) and a few GUI strings — copy from source
at port time; no behavioral impact.

## B. Questions closed during this RE (do not re-open)

| # | Question | Resolution (evidence) |
|---|---|---|
| 1 | Does `original/client.jar.zip` contain Starling modifications? | **No** — bit-exact Mojang 1.8.9 (MANIFEST 5594/5594 SHA-256 verified + MOJANGCS.SF + Mojang/VeriSign cert; `SOURCE_INVENTORY.md` §2) |
| 2 | Which protocol version? | **47** (`ln` handshake check strings; `el` registry vs Prismarine; `PROTOCOL_1_8_9.md` §2) |
| 3 | What is `getJumpUpwardsMotion`? | **0.42f** — verified `pr.bE()` body |
| 4 | Where do sounds.json / non-en_US langs come from (absent from jar)? | DefaultResourcePack chain verified: jar classpath → `ResourceIndex` asset-index File map (`bna.d/c` + `bmy`, `ave` L241; `RESOURCE_SYSTEM.md` §2) |
| 5 | Block/creative reach distances? | **5.0 creative / 4.5 survival** — verified `bda.d()` |
| 6 | Player movementSpeed base? | **0.1** (attribute), sprint modifier ×1.3 op-2 UUID 662A6B8D… (`wn.aX`, `pr` static; `PLAYER_PHYSICS.md` §1) |
| 7 | Entity flags byte (DataWatcher 0) bit layout? | 0x01 onFire, 0x02 sneaking, 0x08 sprinting (bit 3), 0x10 eating (bit 4), 0x20 invisible (bit 5) — verified `pk` setters + MCP (`ENTITY_SYSTEM.md` §3) |
| 8 | C15 skin-parts bitmask? | `wo`/EnumPlayerModelParts: 0x01 cape … 0x40 hat (verified; `PACKET_REFERENCE.md` §8) |
| 9 | C08 "use item in air" encoding? | position **(-1,-1,-1)**, face **255** — verified `ja(zx)` ctor |
| 10 | MC|PickItem channel format? | **Absent from the 1.8.9 client** (string not in any of the 2507 decompiled classes) — not part of this protocol |
| 11 | S29 sound scaling? | pos = i32/8.0, **pitch = u8/63.0** — verified `gs` getters; volume = f32 raw |
| 12 | Keep-alive cadence/timeout? | server sends S00 every **40 ticks** (id = millis int) — verified `lm.c()`; timeout = Netty ReadTimeoutHandler 30 s (`NETWORK_ARCHITECTURE.md` §3) |
| 13 | S46 SetCompressionLevel client behavior? | applied immediately: `NetworkManager.setCompressionTreshold` — verified `bcy.a(gl)` |
| 14 | S18 entity teleport smoothing? | /32.0 fixed point, rotation ×360/256, lerp **3** steps if Δ>0.03125/0.015625 — verified `bcy.a(hz)` |
| 15 | S08 forced response? | C06(posX, bb.minY, posZ, yaw, pitch, onGround=false) always — verified `fi.a(fj)` |
| 16 | C0E click-window wire/modes? | windowId i8, slot i16, button i8, actionNumber i16, mode i8, ItemStack; modes 0–6 + −999 — verified `ik` + `xi.a(4-arg)` |
| 17 | BlockPos long packing? | x 26b@38, y 12b@26, z 26b@0 — verified `cj` clinit |
| 18 | Sin/cos LUT size? | **65,536 entries**, `sin[(int)(f×10430.378f)&0xFFFF]` — verified `ns.a(float)` |
| 19 | GUI scale rule? | `avr` loop ≥320×240 per level, unicode forces even scale — verified |
| 20 | S21 chunk data byte order? | LE chars (states), block light, sky light, biome256 — verified `go.a(...)` |
| 21 | C09/C10/S09 held-slot widths? | C09 = i16, C10 = i16 + ItemStack, S09 = i8 — verified read bodies |
| 22 | sendSlotPacket behavior? | C10 in creative only — verified `bda.a(zx,int)` |
| 23 | Dig step sounds? | every 4 ticks: pitch = `(vol+1)/8? no — (stepSound.volume+1)/8 × …` — verified `bda.c(cj,cq)` body (see `BLOCKS_AND_ITEMS.md` §4) |
| 24 | Sprint-jump impulse? | `motionX -= sin(yaw)×0.2; motionZ += cos(yaw)×0.2` — verified `pr.jump` tail |
| 25 | S0C position scaling (entity moves)? | S15/S17/S19 byte deltas ×(1/32); S18 i32 ×(1/32); S12 velocity i16 ×(1/8000) — verified handlers |

## C. Methodology note

All resolutions cite obf class + method (with SRG) from `analysis/src/` (complete
decompilation, 2507/2507). Where MCP names appear without source quotes (content-depth
block/item behavior), the mapping itself is verified (`mappings.json`) but per-class
behavior should be read from `analysis/src/<obf>.java` during implementation — this is
a depth/defer decision recorded in A2/A6/A7/A8, not a knowledge gap hidden as fact.
