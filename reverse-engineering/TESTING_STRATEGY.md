# Testing & Validation Strategy — Minecraft 1.8.9 Reimplementation

Goal: prove **exact 1.8.9 compatibility** (protocol + mechanics) for the Rust port,
targeting the Starling Android project. RE phase only — this is the plan the
implementation phase will execute.

## 1. Test layers

| Layer | What | Method |
|---|---|---|
| L1 Codec | every packet field/codec from `PACKET_REFERENCE.md` | golden byte vectors per packet (hand-captured + regenerated from the jar's own read/write code semantics) |
| L2 Protocol state | handshake/status/login/encryption/compression/play transitions | scripted conversation tests against a recorded transcript (from a real 1.8.9 server) + loopback fake-server |
| L3 Mechanics | movement/physics/inventory/combat | deterministic unit tests with the constants from `PLAYER_PHYSICS.md` |
| L4 World | chunk decode/light/mesh | S21 golden vectors (capture from server), lighting snapshots |
| L5 Interop | real servers | integration runs against vanilla 1.8.9 server jars (user-provided), Hypixel-era 1.8 servers |
| L6 Visual | rendering parity | screenshot diffing vs the original client on the same world state |

## 2. Golden cases (minimum set)

### 2.1 Codec goldens (L1)
- VarInt: 0, 1, 127, 128, 255, 2^21−1 (boundary), >3-byte rejection.
- String: empty, 32-char UUID, 16-char username, §-codes, JSON chat with escapes
  and surrogate pairs (chat is UCS-2 on the wire — 1.8 legacy UTF-16; see
  `PROTOCOL_1_8_9.md` §8).
- ItemStack: null (−1), empty (0), full NBT compound (nested), damaged item.
- NBT: every tag type incl. empty compound/list.
- S08 (all flags combos), C03/C04/C05/C06, C08 with `(-1,-1,-1), 255`.
- C0E click modes 0–6 + −999 outside-window + drag phases.

### 2.2 Physics goldens (L3)
- Fall damage: matrix over (fallDistance − 3 − jumpBoost) × 1.0 → ceil table.
- moveFlying: fixed yaw/strafe/forward tuples → expected motionX/Z (using the
  65,536-entry sin table — assert against values precomputed from `MathHelper`).
- moveEntity: corner cases — sneak edge-guard, step-up double-pass choice
  (larger horizontal distance² wins), web friction, ladder clamps.
- S08 response: flags 0x1F at pos → expected C06 echo (bb.minY, onGround=false).
- Jump: 0.42 + (jumpBoost lvl+1)×0.1 + sprint impulse 0.2 (sin/cos exact).

### 2.3 Protocol goldens (L2)
- Login: handshake → login start → (encryption request → AES/CFB8 response) →
  enable compression → login success → PLAY; assert the SHA-1 hex join hash
  (`serverId`, sharedSecret, publicKey) against a known session.
- Keep-alive echo, chunk bulk decode → chunk equality with in-memory `Chunk`.
- Compression: 0-threshold raw, small, >0x200000 rejection.

### 2.4 Interaction goldens (L3)
- Digging: hardness/instant-break matrix (hardness −1, 0.05, 10; tool speeds).
- Placement: C08 cadence (syncCurrentPlayItem → C09 when slot changed).
- Inventory: full slotClick matrix against a scripted container (chest 27 slots),
  transaction numbers, shift-click merge order (per-container `transferStackInSlot`).

## 3. Interop harness (L5)

- **Fake server** (Rust): implements v47 handshake/status/login/play enough to
  drive the client; asserts byte-exact framing from the client.
- **Real server**: run a vanilla 1.8.9 server (user-supplied `minecraft_server.1.8.9.jar`
  — not redistributed); scripted bot: join, move, dig, place, chat, inventory, disconnect.
- Record/replay: capture server→client streams (encryption off in test config) as
  golden transcripts; replay deterministically in CI.

## 4. Visual parity (L6)

- Fixed seed worlds (integrated-server later; for now: externally generated Anvil
  saves) + S08 poses → screenshots from the original client vs the port;
  pixel-diff with a small tolerance for AA.
- Entity skins/models/atlases: verify UV stitching matches 1.8 atlas layout
  (compare UV coordinates numerically, not just pixels).

## 5. Continuous integration

- `cargo test` unit/golden suites on every commit (Linux + Android NDK build).
- Nightly interop job against a vanilla 1.8.9 server container.
- Fuzzing: codec fuzz on packet decode (must reject >0x200000, malformed VarInts,
  bad NBT without panics).

## 6. Performance budgets (initial)

- 20 Hz tick headroom: < 5 ms/tick desktop-class CPU; < 12 ms/tick mid-range Android.
- 60 FPS with render distance 8 desktop / 5 Android, 1000 entities, fancy graphics.
- Memory: < 512 MB resident at render distance 8 (1.8 client baseline reference).

## 7. Compatibility acceptance criteria (from the task)

1. Connect to unmodified vanilla 1.8.9 servers without modification.
2. Movement feel identical (walk 4.317-ish m/s — measured against the original;
   sprint-jump, sneak-edge, ladder clamps exact).
3. Inventory/crafting fully functional with vanilla servers.
4. All 251 blocks and items behave as in 1.8.9 (block break/place rules,
   redstone, containers).
5. No 1.9+ mechanics (attack cooldown, sweep, shields, offhand) anywhere.
