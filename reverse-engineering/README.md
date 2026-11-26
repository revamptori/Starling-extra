# Minecraft 1.8.9 Client — Reverse Engineering

Reverse-engineering and reimplementation specification of the original Minecraft Java
Edition 1.8.9 client (`original/client.jar.zip`) for the **Starling Android project**
(native Rust reimplementation). **Reverse-engineering phase only — the Rust
implementation has not been started** (per scope).

## Provenance (verified)

- **Source**: `original/client.jar.zip` (8,461,484 bytes) — kept untouched.
- **SHA-256**: `14f0d96d1a56fb4f5c3b2233d00699525893fe5ce3dcf181e7de59120595d298`
- **Integrity**: BIT-EXACT Mojang 1.8.9 build — 5,594/5,594 payload entries match the
  JAR's own MANIFEST SHA-256 digests, `META-INF/MOJANGCS.SF` + Mojang/VeriSign code
  signing present. **No Starling modifications were found.**
- **Version**: Minecraft 1.8.9 (protocol **47**) — proven from in-class version strings
  and the login-state version check.
- **Decompilation**: 2,507/2,507 classes (100 %) recovered as Java in `analysis/src/`
  (CFR 0.152, batched runs); 100 % MCP-919 name coverage.

## Deliverables (`reverse-engineering/`)

- [x] **README.md** — this file: provenance, index, coverage report.
- [x] **SOURCE_INVENTORY.md** — SHA-256, jar/class/resource counts, signing chain,
  version evidence, dependency footprint, assets policy.
- [x] **ARCHITECTURE.md** — subsystem map, bootstrap, threads, lifecycle, crashes.
- [x] **CLASS_CATALOG.md** — all 2,507 classes (obf ↔ MCP), grouped by package.
- [x] **CLASS_MAPPINGS.md** — name spaces, tooling (`class_report.py`), naming policy.
- [x] **GAME_LOOP.md** — `run`/`runGameLoop`/`runTick` phase order, Timer, input polls.
- [x] **RENDERING.md** — GL layer, vertex formats (12 verified), world/entity/GUI
  passes, chunk meshing, fonts, shaders, GLES notes.
- [x] **WORLD_SYSTEM.md** — world/chunk storage, S21 byte layout, lighting, weather
  timers, block updates, world border.
- [x] **ENTITY_SYSTEM.md** — entity tree, DataWatcher slots, sync handlers, rendering.
- [x] **PLAYER_PHYSICS.md** — movement pipeline, collision/step-up, digging/raycast,
  server validation, all constants with sources.
- [x] **BLOCKS_AND_ITEMS.md** — registries, block hooks, dig/place/use flows,
  C07/C08 semantics, combat notes (1.8 semantics).
- [x] **INVENTORY.md** — containers, slotClick modes 0–6, C0E wire, transactions.
- [x] **GUI_AND_HUD.md** — screen model, ScaledResolution, HUD elements, options.
- [x] **AUDIO.md** — SoundManager/paulscode architecture, sounds.json, categories.
- [x] **RESOURCE_SYSTEM.md** — pack stack, DefaultResourcePack asset-index chain,
  locale, clean-room asset policy.
- [x] **NETWORK_ARCHITECTURE.md** — Netty pipeline, framing, compression, encryption,
  auth flow, packet thread discipline.
- [x] **PROTOCOL_1_8_9.md** — state transitions, VarInt, all packet ID tables,
  key wire formats, anti-cheat interactions.
- [x] **PACKET_REFERENCE.md** — per-packet field codecs (111 from bytecode), value
  codecs (ItemStack/NBT/DataWatcher), conditionals, behavior notes.
- [x] **DEPENDENCIES.md** — bundled libs → Rust/Android replacements.
- [x] **ANDROID_COMPATIBILITY.md** — platform map, touch input design, GLES checklist.
- [x] **JAVA_TO_RUST_MAPPING.md** — runtime/type/codec/crate mapping.
- [x] **TESTING_STRATEGY.md** — golden cases, interop harness, visual parity, budgets.
- [x] **IMPLEMENTATION_ROADMAP.md** — phases 0–9 with risks (implementation not started).
- [x] **UNRESOLVED_QUESTIONS.md** — open items A1–A9 + closed-question log (25 entries).

Supporting evidence (not deliverables): `analysis/` — extraction, complete
decompilation (`src/`, 2,507 Java files, CFR 0.152 — versioned in this private repo
per maintainer request), mapping tables (`mappings.json`, MCP-919 conf), packet
registry/field extraction (`tools/`), generated tables.

## Evidence conventions

- **Verified** = read from decompiled bytecode (cited `obf`/MCP + SRG).
- **Assumed** = standard/expected value not yet read from this jar's code (marked inline).
- **Unresolved** = tracked in `UNRESOLVED_QUESTIONS.md`.
- Never invent: every packet ID/field, constant, and formula in these docs traces to
  `analysis/src/` or `analysis/mappings.json`.

---

## Coverage Report (end of reverse-engineering phase)

### Classes
| Metric | Count | % |
|---|---|---|
| Classes in `client.jar` | 2,507 (2,474 obf + 33 un-obfuscated `net/minecraft/**`) | 100 |
| Decompiled (readable Java in `analysis/src/`) | 2,507 | **100** |
| MCP-named (obf↔MCP↔SRG) | 2,507 | **100** |
| Packet classes wire-decoded field-by-field | 111 (all PLAY/LG/ST/HK core + key ones) | see `PACKET_REFERENCE.md` |
| Subsystems covered by dedicated docs | 23 (per task §3 list) | 100 |

### Subsystems completed (all 23)
lifecycle • game loop • input • GL rendering • world/chunks • entities • blocks/items •
inventory • physics • collision/raycast • camera • lighting/textures/models •
particles • sound • GUI/HUD • chat • resources • options • world loading/multiplayer •
networking • auth/session • crash handling • performance.

### Analyzed-package checklist (behavioral depth per package)
"Deep" = methods read line-by-line and documented; "Catalogued" = class list + mappings
complete, behavior to be read per-class from `analysis/src/` during implementation
(deferred items are tracked in `UNRESOLVED_QUESTIONS.md` §A).

| Package (MCP root) | Classes | Status |
|---|---|---|
| `network`, `network/play/{client,server}`, `network/login`, `network/status`, handshake | 115 | **Deep** (all wire codecs, states, handlers) |
| `client` (Minecraft, main, util core) | 22 | **Deep** (loop, startup, crash, settings send) |
| `client/multiplayer` | 21 | **Deep** (WorldClient, PlayerControllerMP, NetHandlerPlayClient) |
| `world` + `world/chunk` + `world/border` + `world/storage/WorldInfo` | 42+ | **Deep** (chunk storage, S21, weather, light model) |
| `world/chunk/storage` (Anvil/RegionFile) | ~8 | Catalogued (A4) |
| `entity` + `entity/player` | 36 | **Deep** (Entity, LivingBase, Player, PlayerSP physics/sync) |
| `entity/{ai,monster,passive,item,projectile,effect}` | ~200 | Catalogued (A6 — content phase) |
| `block` | 251 | Hooks + core flows **Deep**; per-block behavior Catalogued (content phase) |
| `item` + `item/crafting` | 119 | Core flows **Deep**; per-item Catalogued |
| `inventory` | 41 | **Deep** (Container, slotClick, transactions, player container) |
| `client/renderer` (+entity, +block/model, +texture, +chunk) | ~250 | **Deep** pipeline; per-model/per-renderer Catalogued |
| `client/gui` | 118 | Screen model + HUD + options **Deep**; per-screen Catalogued |
| `client/audio` | 31 | **Deep** (SoundManager, categories, sounds.json) except A3 rolloff |
| `client/resources` | 38 | **Deep** (pack stack, ResourceIndex chain, locale) |
| `client/particle` | 83 | Catalogued (uniform EffectRenderer model documented) |
| `client/model` | 52 | Catalogued (bake pipeline documented) |
| `client/stream` (Twitch) | 30 | Catalogued — **dropped from port** (optional) |
| `tileentity` | 36 | Catalogued (content phase) |
| `nbt`, `util` | 140 | **Deep** (NBT codec, BlockPos, MathHelper, Vec, Direction) |
| `enchantment`, `potion`, `stat`, `command`, `realms`, `server/management`, `world/gen*`, `world/biome`, `scoreboard`, `crash` | ~450 | Catalogued (mapped; server/SP phases) |

### Uncertainties (remaining, all tracked)
Content-depth reads deferred with explicit tracking (not knowledge gaps): combat/enchant
formulas (A2), audio rolloff (A3), Anvil save (A4), sky math (A5), mob AI (A6), container
property semantics (A7), enchant/trade formulas (A8), legacy ping body (A1), minor
strings (A9) — details in `UNRESOLVED_QUESTIONS.md` §A. 25 earlier questions resolved
and logged in §B (jump 0.42, asset-index fallback, reach 5.0/4.5, movementSpeed 0.1,
flag bits, C15 masks, MC|PickItem absent, S29 /63, keep-alive 40 t, S46, S18 /32,
S08 echo, C0E modes, BlockPos packing, sin LUT 65536, S21 order, …).

### Recommended implementation order (summary of `IMPLEMENTATION_ROADMAP.md`)
**0** foundations/codecs → **1** network+session → **2** world+entities →
**3** physics+interaction → **4** rendering core → **5** audio → **6** Android
hardening → **7** content depth (251 blocks/items, TEs, GUIs) → **8** integrated
server → **9** continuous validation. Multiplayer-first: phases 0–3 yield a wire-accurate
bot; 4–6 make it playable; exact 1.8.9 (never 1.8.8/1.9) compatibility is the acceptance
criterion throughout.
