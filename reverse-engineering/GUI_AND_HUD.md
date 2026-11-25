# GUI & HUD — Minecraft 1.8.9

**Verified** anchors from decompiled bytecode (`axu`/GuiScreen, `avo`/GuiIngame,
`avv`/GuiOverlayDebug, `avn`/FontRenderer, `avt`/GuiNewChat, `avr`/ScaledResolution,
`avh`/GameSettings, `ave`/Minecraft). Widget classes in
`net/minecraft/client/gui/*` (all listed in `class_catalog.json`).

## 1. Screen model (`axu`/GuiScreen)

- `drawScreen(mouseX, mouseY, partialTicks)`; `initGui` on resize/open;
  `mouseClicked/mouseReleased/mouseClickMove/keyTyped/handleInput/updateScreen`.
- `drawDefaultBackground()` — darkened dirt/panorama background.
- `doesGuiPauseGame()` — 1.8: false for chat/inventory, true for pause menu (single-player).
- Focus contract (verified `GAME_LOOP.md` §5.4): `setWorldAndResolution` +
  `Minecraft.displayGuiScreen` null ⇒ in-game grab; GUI open ⇒ ungrabbed mouse.
- Chat text input: `GuiTextField` (`avw`); Unicode IME via LWJGL `Keyboard` +
  `awm`-family helpers (verify obf when porting).

## 2. Scaled resolution (verified `avr` ctor)

```
scale = guiScale option (0 = auto → 1000)
while scale < guiScale && width/(scale+1) >= 320 && height/(scale+1) >= 240: scale++
if (mc.isUnicode() && scale % 2 == 0? — verified: scale odd && != 1 → scale--) scale--
scaledWidth  = ceil(width / scale)
scaledHeight = ceil(height / scale)
```
(Unicode font forces an even scale factor for pixel alignment.)

## 3. In-game HUD (`avo`/GuiIngame)

Rendered every frame (`updateCameraAndRender` "gui" section, verified):
- crosshair (`icons.png` 0,0 16×16 — additive blend),
- hotbar (selector highlight), item icons + durability bars (`bjh`/RenderItem),
- hearts (normal/hardcore/absorption yellow — `icons.png` rows), armor, food, air bubbles,
- mount health, experience bar + level text, potion-effect icons + timers,
- title/subtitle (`setTitle` —1.8 titles exist via S45PacketTitle), action-bar text,
- vignette (strength from `fov`/light), pumpkin blur, water overlay, portal overlay
  (uses `timeInPortal`), hurt flash (red overlay), boss bar (1.8 none),
- debug F3 overlay (`avv`/GuiOverlayDebug): FPS, "E: a/b" entity counts, "C: x/y/z" chunk
  updates, "P: particles", "T: tiles", "XYZ / Block / Chunk / Facing / Biome / Light",
  memory graph, server brand, sound system label, shader name;
- spectator hotbar + teleport menu, stream indicator (Twitch),
- chat (`avt`/GuiNewChat + `ayr`/ChatLine? — verify obf: `avt` draws `ChatComponentText`
  lines with chat opacity/height options, `/` prefix, tab-complete highlights).

## 4. Key screens (1.8 set)

| Screen | Class | Notes |
|---|---|---|
| Title | `ayb`/GuiMainMenu (verify obf in catalog) | panorama, splash texts, Realms button |
| Pause | `aye`/GuiIngameMenu | |
| Options | `avh`-driven `ayd`?/GuiOptions + video settings | sliders per `EnumOptions` |
| Video settings | `bae`?/GuiVideoSettings | |
| Controls | `GuiControls`-family | |
| Inventory | `axp`/GuiContainerPlayer? + `axq`/GuiChest… — container GUIs (`GuiContainer` subclass per container type) | 2×2 craft, armor slots |
| Chat | `avt` overlay + `GuiChat` | |
| Multiplayer | `ayh`/GuiMultiplayer + server list (`ayk`/ServerList, `ServerData`) | |
| Direct connect | `GuiScreenAddServer`-family | |
| Disconnect | `axh`/GuiDisconnected | shows reason component |
| Download terrain | `DownloadingTerrainGui`-family | on respawn |
| Game menu F3 debug text | `avv` | |
| Achievements | `ayd`/GuiAchievement (toast, top-right) | |
| Book/sign | `GuiEditSign`, `GuiScreenBook` | |
| Anvil/enchanting/beacon/trading | per-container GUIs | |
| Resource packs | `GuiScreenResourcePacks`-family | |
| Skin customization | `GuiCustomizeSkin`-family | 1.8 skin-part toggles (C15!) |

Exact obf names for each screen: `class_catalog.json` (`net/minecraft/client/gui/*`).

## 5. Chat components

- `fk`-family `IChatComponent` (`net/minecraft/util/IChatComponent`): `ChatComponentText`,
  `ChatComponentTranslation`, `ChatComponentScore`, `ChatComponentSelector`,
  siblings + `ChatStyle` (color `EnumChatFormatting` `cj.a?`, bold/italic/underlined/
  obfuscated/strikethrough, clickEvent `ClickEvent` (open_url, run_command, suggest_command),
  hoverEvent (show_text, show_item, show_entity)). Serialization: JSON via Gson
  (`IChatComponent.Serializer` `gb`? — verify obf when porting; wire format covered in
  `PROTOCOL_1_8_9.md` §8 chat JSON).

## 6. Options (`avh`/GameSettings) — verified option keys subset

`options.txt` key list (from `avh` save/load methods): `mouseSensitivity`, `fov`,
`gamma`, `renderDistance`, `guiScale`, `particles`, `bobbing`, `anaglyph3d?`,
`maxFps` (`limitFramerate`), `fboEnable?`, `difficulty`, `fancyGraphics`,
`ao`, `renderClouds`, `chatColours`, `chatLinks`, `chatLinksPrompt`,
`chatOpacity`, `chatVisibility`, `chatHeightFocused/unfocused`, `chatScale`,
`mipmapLevels`, `forceUnicodeFont`, `blockAlternatives`, `hideGUI`, `advancedItemTooltips`,
`pauseOnLostFocus`, `touchscreen`, `overrideWidth/Height`, `heldItemTooltips`,
`chatBackground`, `snooperEnabled`, `useVbo?` (1.8.9 `useVbo` exists in options),
`entityShadows`, `key_*` key bindings + `profile`-scoped options. (Full key table
from `avh` when porting; this list is Verified-by-presence in `avh` field init.)

## 7. Rust/Android notes

- Immediate-mode GUI rendering maps well to a retained widget tree — but keep the
  1.8 draw-call conventions (icons.png UVs are fixed crops).
- The scaled-resolution math must be bit-identical or HUD elements drift on odd sizes.
- Touch: 1.8 has no touch GUI; the Starling port must add input mapping (see
  `ANDROID_COMPATIBILITY.md`), keeping keyboard/mouse semantics for parity tests.
