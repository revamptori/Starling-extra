# Implementation Roadmap — Minecraft 1.8.9 in Rust (Starling)

Sequencing for the implementation phase (NOT started — per task, analysis/docs only).
Order optimized for early interoperability (multiplayer-first) and testability.

## Phase 0 — Foundations (1–2 weeks)
1. Crate skeleton (`JAVA_TO_RUST_MAPPING.md` §6), CI, golden-test harness.
2. Protocol codecs (VarInt, String, ItemStack, NBT, BlockPos, DataWatcher) —
   port from `PACKET_REFERENCE.md` §7 verbatim; codec fuzzing from day one.
3. Packet enum + state machine (4 states, IDs exactly as `PROTOCOL_1_8_9.md` §3).

## Phase 1 — Network & session (1 week)
4. Framing + compression + AES/CFB8 (verified `NETWORK_ARCHITECTURE.md` §3/§5).
5. Handshake/status/login incl. Yggdrasil `joinServer` hash (offline-mode first,
   online auth when credentials flow exists).
6. `NetHandlerPlayClient` skeleton: keep-alive, chat, disconnect, compression.

## Phase 2 — World & entities (2–3 weeks)
7. Chunk decode (S21/S26 exact byte order), `Chunk`/`ExtendedBlockStorage` structs.
8. Entity spawn/metadata/teleport/velocity handlers; `Entity` arena + interpolation.
9. S08 + movement sync (`bew.p`-equivalent) + server movement echo handling.

## Phase 3 — Physics & interaction (2 weeks)
10. `moveEntity`/`moveEntityWithHeading`/`moveFlying` bit-exact (sin LUT).
11. `PlayerControllerMP` flows: dig/place/use, C07/C08/C0B/C09 cadence.
12. Inventory containers + C0E click machine + transactions.

## Phase 4 — Rendering core (3–4 weeks)
13. GL abstraction (GLES2/3 + desktop), GlStateManager cache, matrix stack.
14. Textures: two atlases + lightmap + font renderer.
15. Chunk meshing pipeline (worker pool, BLOCK vertex format, AO) + frustum.
16. Entity/item/block rendering; GUI/HUD layer.

## Phase 5 — Audio & polish (1–2 weeks)
17. Sound engine (9 categories, sounds.json events) + music ticker.
18. Particles, weather, sky/clouds/fog, world border visuals.

## Phase 6 — Android hardening (2 weeks)
19. Touch/gamepad input layer, lifecycle, context loss, scoped storage.
20. Perf passes (draw-call reduction, meshing budget, memory caps).

## Phase 7 — Content depth (iterative, parallelizable)
21. All 251 blocks + 380+ items behavior tables (codegen from `CLASS_CATALOG.md`).
22. Tile entities, GUIs per container, enchanting/anvil/brewing rules.
23. Mob AI (needed for single-player; minimal for multiplayer-only).

## Phase 8 — Integrated server (optional, later)
24. `MinecraftServer` port: chunks, generation (LCG-exact), Anvil save, LAN.

## Phase 9 — Validation (continuous)
25. Golden suites from `TESTING_STRATEGY.md`; interop vs vanilla 1.8.9 servers;
    visual parity passes.

## Dependency notes
- Phases 0–3 give a usable multiplayer "wire bot"; phases 4–6 make it playable.
- Rendering can proceed against recorded world states (no server needed).
- Block/item tables (21) can be generated early from the catalog to unblock content.

## Risk register
| Risk | Mitigation |
|---|---|
| GL parity on GLES | state-cache + golden screenshots early (phase 4) |
| Protocol edge cases (compression, encryption interplay) | transcripts captured from real servers in phase 1 |
| Physics bit-exactness | golden vectors from the decompiled Java (phase 3) |
| Scope of 251 blocks/items | codegen + per-class hook table |
| Android perf | budgets in TESTING §6, perf jobs from phase 4 |
