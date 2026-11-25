# Rendering — Minecraft 1.8.9

**Verified** from decompiled bytecode. Minimum GL functionality to reproduce the original
appearance is listed in §9. Class names `obf`/MCP.

## 1. GL platform

- **LWJGL 2 + desktop OpenGL** (fixed-function + immediate-ish client arrays; *no* GLSL core
  pipeline — shaders only in the optional post-processing chain).
- Init: `bqs`/OpenGlHelper.initializeTextures() — multitexture via
  `GL_TEXTURE0/1` (`OpenGlHelper.lightmapTexUnit`, `defaultTexUnit`), VBO support probe
  (`useVbo()` = `bqs.f()` — `GL_ARB_vertex_buffer_object`), shader probe (`shadersSupported`
  = `bqs.O` — framebuffer+GLSL for post/effects).
- State cache: `bfl`/GlStateManager wraps ~73 state setters (bindTexture, matrix stack
  push/pop/load/translate/rotate/scale, blend/depth/cull/alpha funcs, color, lightmap,
  clear…). A Rust port should keep an equivalent cache to avoid redundant GLES calls.
- Framebuffer: `bfw`/Framebuffer (FBO wrapper: `framebufferRender(w,h)`,
  `bindFramebuffer(boolean setViewport)`, `unbindFramebuffer`, `createBindFramebuffer`,
  `framebufferTexture`); world renders into it; `Minecraft.framebufferMc` (`aF`).

## 2. Vertex pipeline

- `bfx`/Tessellator: **singleton** (`Tessellator.getInstance()`, 2 MiB default) wrapping:
  - `bfd`/WorldRenderer — CPU-side vertex buffer (raw int/float arrays), `begin(glMode, format)`,
    `pos/color/tex/lightmap/normal/endVertex`-style builder (obf `a(...)` families),
    `finishDrawing`/`draw`-family; used both for immediate draws and chunk mesh building.
  - `bfe`/WorldVertexBufferUploader — uploads the finished buffer with
    `VertexFormat`-driven `glVertexPointer/glTexCoordPointer/glColorPointer/glNormalPointer`
    client arrays (or VBO path when `useVbo`).
- `bmu`/VertexFormat + `bmv`/VertexFormatElement. **Formats** (element order verified from
  `bms`/DefaultVertexFormats clinit):

| Format | Elements (order) | stride |
|---|---|---|
| BLOCK | POSITION_3F, COLOR_4UB, TEX_2F, TEX_2S (lightmap) | 28 |
| ITEM | POSITION_3F, COLOR_4UB, TEX_2F, NORMAL_3B, PADDING_1B | 28 |
| OLDMODEL_POSITION_TEX_NORMAL | POSITION_3F, TEX_2F, NORMAL_3B, PADDING_1B | 24 |
| PARTICLE_POSITION_TEX_COLOR_LMAP | POSITION_3F, TEX_2F, COLOR_4UB, TEX_2S | 28 |
| POSITION | POSITION_3F | 12 |
| POSITION_COLOR | POSITION_3F, COLOR_4UB | 16 |
| POSITION_TEX | POSITION_3F, TEX_2F | 20 |
| POSITION_NORMAL | POSITION_3F, NORMAL_3B, PADDING_1B | 16 |
| POSITION_TEX_COLOR | POSITION_3F, TEX_2F, COLOR_4UB | 24 |
| POSITION_TEX_NORMAL | POSITION_3F, TEX_2F, NORMAL_3B, PADDING_1B | 24 |
| POSITION_TEX_LMAP_COLOR | POSITION_3F, TEX_2F, TEX_2S, COLOR_4UB | 28 |
| POSITION_TEX_COLOR_NORMAL | POSITION_3F, TEX_2F, COLOR_4UB, NORMAL_3B, PADDING_1B | 28 |

Elements: POSITION_3F (3×f32), COLOR_4UB (4×u8), TEX_2F (2×f32), TEX_2S (2×i16 lightmap
uv), NORMAL_3B (3×i8), PADDING_1B.

- GL modes used: `GL_TRIANGLES` (models/items), `GL_QUADS` (chunk terrain —1.8 is
  quad-based!), `GL_LINES` (selection box/debug).

## 3. Frame structure (`bfk`/EntityRenderer, verified `updateCameraAndRender`)

1. Focus watchdog: inactive window > 500 ms → `displayInGameMenu()`; mouse-grab fixups.
2. Mouse look (`mouseHelper.mouseXYChange()`): sensitivity `s = opts.sensitivity×0.6+0.2`,
   delta = `s³ × 8`; invert-Y option; **smooth camera** (`opts.smoothCamera`) applies the
   extra lerp state (`smoothCameraYaw/Pitch` accumulators); `thePlayer.turn(dx, dy)`.
3. If `skipRenderWorld` → return.
4. Scaled resolution (`avr`/ScaledResolution) + scaled mouse coords.
5. If world loaded: **`renderWorld(partialTicks, finishTimeNano)`** with a hand-render
   deadline `finishTimeNano = now + max(1e9/min(debugFPS, limitFramerate)/4 − now-elapsed, 0)`
   (lets the hand render "in time" with the frame budget).
6. Shaders path (`bqs.O`): entity-outline framebuffer pass + active shader
   (`blq`/ShaderManager) matrix work.
7. `framebufferMc.bindFramebuffer(true)`.
8. `GlStateManager.alphaFunc(GL_ALWAYS?, 0.1f)` — verified call `bfl.a(516, 0.1f)`
   (516 = GL_GREATER); `GuiIngame.renderGameOverlay(partialTicks)` unless hideGUI.
9. No world: clear + `renderMainMenuBackground`-family.
10. Open `currentScreen.drawScreen(...)` + tooltip/IME layers.

## 4. World render (`renderWorld`, `bfr`/RenderGlobal)

Order (1.8.9, verified structure):
1. `updateCameraAndRender`-side prep: `setupCameraTransform(partialTicks, pass)` —
   FOV (`fovModifierHand` smoothing + hurt/nausea effects), camera orientation from
   `renderViewEntity`, view bobbing (`setupViewBobbing`), clip planes; `ActiveRenderInfo`
   (`auz`) caches modelview/projection for fog & particle orientation.
2. **Frustum**: `bia`/ICamera (clipping helper + `Frustum` implementation) built from the
   projection×modelview; per-chunk visibility (`RenderChunk.isVisible`) + `Camera`-setup
   in `setupTerrain` (also drives the `renderInfo` global used by block layer sorting).
3. **Terrain** by `EnumWorldBlockLayer` (`arg`): SOLID, CUTOUT_MIPPED, CUTOUT, TRANSLUCENT —
   `renderBlockLayer(layer)` iterates visible `RenderChunk`s and draws their layer VBO/
   display list. Chunk display order: translucency sorted back-to-front by distance
   (1.8 sorts translucent chunk renderers per frame).
4. Clouds (`renderClouds` — fancy/fast; sheet `textures/environment/clouds.png`, height
   108/12?), sky (`renderSky` — sky color → void color, sunrise/sunset gradient, sun/moon
   quads from `textures/environment/sun.png`/`moon_phases.png`, stars VBO, sky VBO
   256-sided cylinder/dome…), weather (`renderRainSnow` — rain/snow using
   `textures/environment/rain.png`/`snow.png`), void fog (par=1.8 "void fog" under y=0? —
   `renderWorld` fog math in `setupFog`).
5. Entities: `RenderManager` (`biu`) per-entity renderers (`bik`-family, see
   `ENTITY_SYSTEM.md`); block entities (`TileEntityRendererDispatcher` `bii`);
   destroy-block progress (`bfr` damage textures), selection box (`drawSelectionBox` GL_LINES),
   hit effect particles.
6. Particles: `bec`/EffectRenderer.renderParticles (layered by texture atlas).
7. Outline pass for glowing/spectator-highlight entities (FBO + `entity_outline` shader).
8. Hand: `renderHand(partialTicks, pass)` → `bfn`/ItemRenderer (first-person items,
   maps, eat/drink progress, equip progress — `ItemRenderer.renderItemInFirstPerson`).

## 5. Chunk rendering & meshing

- `bht`/RenderChunk: 16×16×16 section container; owns `ChunkCompileTaskGenerator`-style
  jobs; static `renderChunksUpdated` counter (`bht.a`) feeds the F3 counter.
- `bho`/ChunkRenderDispatcher: thread pool compiling `RenderChunk` meshes into
  `WorldVertexBufferUploader`-drawable `VertexBuffer`s (VBOs) or display lists per block
  layer; upload on the GL thread.
- `bfd`/WorldRenderer also backs the legacy "WorldRenderer" immediate chunk path
  (`bfd` = WorldRenderer — the1.8 name for the tessellator buffer).
- Visibility: frustum culling + `RenderGlobal.renderInfos` chunk-graph (front-to-back
  ordering for opaque, back-to-front for translucent; occlusion via layer completeness).
- AO: `Minecraft.isAmbientOcclusionEnabled()` (`x`) = AO option × fancy graphics;
  per-vertex AO computed in the block baker (`ao` lightmap from neighbor luminance —
  see `WORLD_SYSTEM.md` §lighting).

## 6. Textures

- `bmj`/TextureManager: `bindTexture(ResourceLocation)` bookkeeping + reload listeners;
  `bmh`/TextureMap (block atlas `textures/blocks`, item atlas `textures/items`,
  stitched at runtime into one GL texture each — 1.8 uses **two** atlases:
  `textureMapBlocks` `textures/blocks` and `textureMapItems` `textures/items`),
  `bmi`/TextureAtlasSprite (animated via `.mcmeta` — `TextureUtil` `bnr` uploads mipmaps,
  `TickableTextureObject`).
- Lightmap: 16×16 texture rebuilt each frame (`EntityRenderer.updateLightmap`, 851 B):
  sky+block light colors with gamma; torch flicker (`updateTorchFlicker` — sine wobble on
  the lightmap); bound to texture unit 1 (`lightmapTexUnit`).
- Misc textures: `textures/misc/*` (vignette, pumpkin blur, shadow, forcefield, enchanted
  glint, underwater), `textures/environment/*`, colormap grass/foliage
  (`textures/colormap/*`), font `textures/font/ascii.png` + `font/glyph_sizes.bin`.

## 7. Fonts

- `avn`/FontRenderer: 128×128 glyph sheet, 16×16 glyph cells; widths from
  `glyph_sizes.bin` (256×256 nibbles? — 65,536 bytes = per-pixel widths for two pages);
  Unicode mode loads `textures/font/ascii_unicode.png`-family per page via `FontTextureCache`
  (`avo`? — `bnu`/FontTextureCache — verify obf in `CLASS_CATALOG.md`).
- Rendering: immediate quads via Tessellator (POSITION_TEX), `drawString(str, x, y, color,
  shadow)` with the 25%-dark shadow offset (1 px down/right); bold/italic/obfuscated
  styling per chat-component segment (`renderStringAtPos` walks IChatComponents);
  width = max of glyph advances + kerning pairs (from the sheet's last row).
- `standardGalacticFontRenderer` (`l`) — the enchantment-table font (different widths,
  same class, `unicodeFlag`-style flag — galactic glyphs replace A–Z).

## 8. GUI rendering

- `axu`/GuiScreen.drawScreen + `drawDefaultBackground` (darkened panorama/dirt);
  widgets in `avp`-family (buttons, sliders `avq`/GuiSlider, text fields `avw`/GuiTextField…).
- `avo`/GuiIngame: crosshair (`icons.png`), hotbar+hearts+armor+food+air+xp bar+mount
  health, boss bar? (1.8 no), titles/timers, vignette (auto/`vignette.png`), pumpkin
  overlay, hurt flash, portal overlay (timeInPortal), debug F3 (`avv`/GuiOverlayDebug:
  fps, chunk updates, XYZ chunk-relative, block-under, facing, biome, memory graph,
  shader label…), spectator GUI, stream indicator (`renderStreamIndicator`).
- Scale factor: `avr`/ScaledResolution (GUI scale 0=auto → `ceil(min(w,h)/240)` clamped ≤3
  factor... verify exact rule in `GUI_AND_HUD.md` §scale).

## 9. Post-processing (optional)

- `assets/minecraft/shaders/post/*.json` + `program/*.json|fsh|vsh` — the Super-Secret
  Settings chain (blur, blob, antialias/FXAA, bits, bumpy, color_convolve, deconverge,
  flip, fxaa, invert, notch, ntsc, outline, overlay, phosphor, scan_pincushion, sobel,
  spy, wobble). Managed by `blq`/ShaderManager + `bls`/ShaderGroup; driven when
  `gameSettings.entityShadows`? no — the chain is selected by the F3-screen shaders list
  (`EntityRenderer.loadEntityShader(ResourceLocation)`); entity outline shader
  `entity_outline` always used for glowing entities.
- Minimum reproduction: implement FBO world target + the **entity outline** pass; the
  exotic chains are optional cosmetics.

## 10. Minimum GL/GLES2 feature set for parity

- Quad drawing (emulate with triangles), client-state-equivalent vertex attribs
  (pos/color/uv/lightmap/normal).
- 2D texture arrays + mipmaps (`glGenerateMipmap`), texture wrap REPEAT for terrain,
  clamp for GUI; NPOT-safe sizes (atlases are POT).
- Blend (src-alpha), depth test, cull toggle per-block-layer, alpha func GREATER 0.1
  (cutout), polygon offset (selection box/destroy overlay).
- FBOs (world + outline), scissor (video settings preview?), `glReadPixels` (screenshots).
- Immediate-mode matrices (perspective/ortho) — reproduce with a small matrix stack.
- Lightmap as second texture unit (modulate combine).

## 11. Rust/Android notes

- Map to OpenGL ES 2/3 via `glow`/`gl-rs` or wgpu with a compatibility layer; ES2 lacks
  quad primitives → split quads into triangles at mesh-build time (chunk meshes become
  triangle lists; visual output identical).
- Keep the1.8 **two-atlas** design (blocks/items) to match UV coordinates bit-for-bit.
- Parallel chunk meshing: port `ChunkRenderDispatcher` semantics (worker builds vertex
  arrays; main thread uploads).
- The sin/cos LUT and color-float conversions (u8 colors in vertex data) affect visual
  parity — reuse `MathHelper` conventions.
