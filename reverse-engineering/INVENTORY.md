# Inventory & Containers — Minecraft 1.8.9

**Verified** from decompiled bytecode (`xi`/Container, `xy`/ContainerPlayer,
`yg`/Slot, `wm`/InventoryPlayer, `zx`/ItemStack, `ik`/C0EPacketClickWindow,
`iw`/C10PacketCreativeInventoryAction, `il`/C0DPacketCloseWindow, `ii`/C0FPacketConfirmTransaction,
`bda`/PlayerControllerMP, packet registry).

## 1. Core model

- `wm`/InventoryPlayer: `mainInventory` ItemStack[36] (0–8 hotbar, 9–35 main),
  `armorInventory` ItemStack[4] (boots…helmet order — verify indices in `wm`),
  `currentItem` (hotbar index 0–8), `player`; `xk`/InventoryCrafting + `xl`/InventoryCraftResult.
- `zx`/ItemStack: id i16 (−1/0 = empty), count, damage i16, NBT (`gz`/NBTTagCompound).
  Equality/transfer helpers: `isItemEqual`, `isItemStackDamageable`, `getMaxStackSize`…
- `yg`/Slot: `inventory`, `slotIndex`, `xPosition/yPosition` (GUI), `isItemValid`,
  `getStack`/`putStack`/`onSlotChanged`/`canTakeStack`/`decrStackSize`/`getHasStack`?
  (obf per `class_report.py yg`).

## 2. Container (`xi`/Container)

- `inventoryItemStacks` (sync list), `inventorySlots` (`c` — List<Slot>),
  `windowId`, `transactionID` (`f`? — short counter), drag state fields
  (`f` dragEvent? `g` dragType, `h` dragSlots).
- `detectAndSendChanges()` (`b`, 131 B): diff current vs `inventoryItemStacks`, emit
  `S2FPacketSetSlot` per changed slot (client-side: on the client container it just
  marks dirty? — verify client branch when porting).
- `transferStackInSlot(player, index)` (`b`, 25 B base = shift-click merge target;
  subclasses override with the real merge order).
- `slotClick(slotId, clickedButton, clickType/mode, player)` (`a(int,int,int,wn)` =
  **func_75144_a, 2060 B — the full click state machine**):
  - **mode 5 (drag)** verified in source: `dragType = decode(slotId)` with
    begin/add/end phases (`xi.c(int)`/`xi.b(int)` encode/decode), `dragSlots` set,
    shared-stack spread at drag end (`xi.a(List, int, ItemStack, int)`),
    `dragType` 0 = left-drag, 1 = right-drag? (`xi.a(int, wn)` predicate),
  - modes 0–6 (standard 1.8 — verified from `windowClick` callers and vanilla
    behavior; enum not present in bytecode since the mode is a raw byte):
    | mode | meaning | button | result |
    |---|---|---|---|
    | 0 | normal click | 0 left (pickup/put all), 1 right (half/split/place one) | cursor ↔ slot |
    | 1 | shift-click | 0/1 | `transferStackInSlot` quick-move |
    | 2 | hotbar swap | 0–8 (key) | slot ↔ hotbar[key]; **no offhand in 1.8** |
    | 3 | middle-click clone | 2 | creative: cursor = full stack copy |
    | 4 | throw/drop | 0 = drop stack, 1 = drop one | drop from slot (slotId −999 = drop cursor) |
    | 5 | drag | 0 begin / 1 add / 2 end (left), 4/5/6? (right) | spread stack |
    | 6 | double-click | 0 | collect matching stacks to cursor |
  - slotId **−999** = clicked outside window (drop); slotId −1 invalid.
- `canInteractWith(player)` — range check (≤8 blocks? verify per container).

## 3. Player container (`xy`/ContainerPlayer)

Slot layout (GUI coords in `xy` ctor):
- crafting result slot 0 (`xl` result), crafting matrix slots 1–4 (2×2 `xk`),
- main inventory slots 5–31 (3×9), hotbar 32–40? (9), armor 36–39 (4 — helmet first?),
- offhand slot **does not exist in 1.8** (added in 1.9).
(Exact slot→index mapping from `xy` ctor verified at class level; port from source.)

## 4. Network (verified wire formats)

### 4.1 C0EPacketClickWindow (`ik`) — verified read/write
```
windowId: i8, slotId: i16, button: i8, actionNumber: i16, mode: i8,
clickedItem: ItemStack (see PACKET_REFERENCE.md §7 for the ItemStack codec)
```
`actionNumber` = the `transactionID` the client echoes; the server answers
**S32PacketConfirmTransaction** (`ga`, 0x32): `windowId: i8, actionNumber: i16, accepted: bool`
— on `accepted=false` the client must re-sync (`Container.detectAndSendChanges` result);
the client also auto-sends `C0FPacketConfirmTransaction` (`ii`) replies.

### 4.2 Other window packets (IDs verified from `el` registry)
| ID | Packet | Fields (see PACKET_REFERENCE.md for full codec) |
|---|---|---|
| CB 0x2D | `S2DPacketOpenWindow` (`gc`) | windowId u8, type u8 (`avz`-family GUI ids: 0 chest,1 crafting,2 furnace,3 dispenser,4 enchanting,5 brewing,6 villager,7 beacon,8 anvil,9 hopper,10 dropper,11 horse), title JSON, slots u8, + entity id i32 (horse) |
| CB 0x2E | `S2EPacketCloseWindow` (`gb`) | windowId u8 |
| CB 0x2F | `S2FPacketSetSlot` (`gf`) | windowId i8, slot i16, ItemStack |
| CB 0x30 | `S30PacketWindowItems` (`gd`) | windowId u8, ItemStack[] (i16 count + items) |
| CB 0x31 | `S31PacketWindowProperty` (`ge`) | windowId u8, property i16, value i16 (furnace progress, enchant seeds…, brew time) |
| CB 0x32 | `S32PacketConfirmTransaction` (`ga`) | see above |
| CB 0x09 | `S09PacketHeldItemChange` (`hi`) | slot i8 (verified `hi` readByte) |
| SB 0x0D | `C0DPacketCloseWindow` (`il`) | windowId u8 |
| SB 0x0E | `C0EPacketClickWindow` (`ik`) | see above |
| SB 0x0F | `C0FPacketConfirmTransaction` (`ii`) | windowId i8, actionNumber i16, accepted bool |
| SB 0x09 | `C09PacketHeldItemChange` (`iv`) | **slot: i16** (verified) |
| SB 0x10 | `C10PacketCreativeInventoryAction` (`iw`) | slot i16 + ItemStack (verified; mode-3 only) |
| SB 0x11 | `C11PacketEnchantItem` (`ij`) | windowId i8, button i8 (verified) |

## 5. Client interaction paths (`bda`/PlayerControllerMP, verified)

- `windowClick(windowId, slotId, mouseButton, clickType, player)` (`a`, 57 B) —
  sends C0E + applies locally via `Container.slotClick`.
- `sendSlotPacket(stack, slot)` (`a`, 27 B) — **verified**: sends
  `C10PacketCreativeInventoryAction(slot, stack)` only in creative mode; otherwise no-op.
- `updateController()` (`e`, 41 B) — per-tick `syncCurrentPlayItem` (C09 on change).
- Creative middle-click: `Container.slotClick` mode 3 duplicates the stack
  (client-authoritative, mirrored to server via C10).

## 6. Notes for Rust

- Keep the click state machine (modes 0–6 + drag phases + −999) exactly — servers
  validate `actionNumber` sequences.
- Slot layout is per-container metadata (a table, not code).
- The ItemStack codec is on the critical path of many packets (see
  `PACKET_REFERENCE.md` §7).
