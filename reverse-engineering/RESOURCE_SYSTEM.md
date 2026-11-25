# Resource System — Minecraft 1.8.9

**Verified** from decompiled bytecode (`bng`/SimpleReloadableResourceManager,
`bnm`/ResourcePackRepository, `bna`/DefaultResourcePack, `bmy`/ResourceIndex,
`bns`/LanguageManager, `bnt`/Locale, `bpz`/SoundHandler, `ave`/Minecraft.startGame).

## 1. Stack

```
SimpleReloadableResourceManager (bng)     — domain → List<IResourcePack>
  reload(metadata) → per-domain reload: textures, models, sounds, fonts, languages
ResourcePackRepository (bnm)              — discovers resource packs (dirs/zip),
                                            selected pack in options
  ├── DefaultResourcePack (bna)           — ALWAYS the last fallback layer
  └── server resource pack (1.8: S48PacketResourcePackSend) → downloaded zips
LanguageManager (bns) + Locale (bnt)      — en_US.lang parsing + formatting codes
```

## 2. DefaultResourcePack resolution chain (VERIFIED `bna`)

`getInputStream(ResourceLocation loc)`:
1. `DefaultResourcePack.class.getResourceAsStream("/assets/" + domain + "/" + path)` —
   the resources **inside the client jar** (this is where the 3,090 listed assets come from).
2. Fallback: `mapAssets.get(loc.toString())` → `File` in the launcher assets directory —
   a `Map<String, File>` built by `bmy`/ResourceIndex
   (`new ResourceIndex(assetsDir, assetIndex).getResourceMap()` — constructed in
   `Minecraft.startGame`, `ave` line 241: `new bna(new bmy(cfg.c.c, cfg.c.d).a())`).

**Consequence (previously open question, now verified)**: `sounds.json`, all `.ogg`
sound files, and non-`en_US` languages missing from the jar are served from the
launcher-managed assets dir through the ResourceIndex file map — this is authentic
1.8.9 behavior, not a gap. `resourceExists` (`b`) mirrors the chain (classpath ∨ map).

## 3. Resource pack format (1.8)

- Pack: `pack.mcmeta` (`{"pack":{"pack_format":1,"description":…}}` — 1.8 = format **1**),
  `pack.png`, `assets/<domain>/…` (minecraft domain: `textures/`, `models/`, `blockstates/`,
  `lang/`, `sounds.json`, `font/`, `shaders/`, `texts/`).
- ZIP packs load via `FileResourcePack`-family (`bnl`?/AbstractResourcePack —
  verify obf via catalog when porting); folder packs via `File`.
- `ResourcePackRepository.reloadResourcesSelected` merges: **selected packs first,
  DefaultResourcePack last** (later = lower priority).

## 4. Reload (`bng.reload`)

1. `getResourceDomains` union per pack; per domain: reload listeners fire in fixed order
   (registered in `Minecraft.startGame`): LanguageManager →
   `SimpleReloadableResourceManager`-registered texture managers (`bmh`/TextureMap,
   `bmj`), `bpz`/SoundHandler, `bjh`-model loads (`bou`/ModelManager via
   `IResourceManagerReloadListener`), font renderer.
2. On the client thread via `Minecraft.addScheduledTask`/`Util.runTask` —
   `GAME_LOOP.md` "scheduledExecutables".

## 5. Locale / lang files (`bnt`/Locale)

- `lang/<code>.lang` (1.8 **properties-style** `key=value`, `#` comments);
  `LanguageManager.currentLanguage` (from `options.language`); the code loads
  en_US + selected; **only `en_US.lang` ships in the jar** (verified) — other
  languages come from the asset dir via §2.
- Formatting: `%s/%d` substitution (`String.format`), chat components use
  `I18n.format`; §-color codes handled at render time (`avn`/FontRenderer).

## 6. Textures & atlas loading (ties to `RENDERING.md` §6)

- `TextureMap` (block/item atlases) reads `textures/blocks|items/**` + `.mcmeta`
  animation frames (`bnr`/TextureUtil, `bmi`/TextureAtlasSprite: `AnimationMetadata`
  frames, interpolate, frametime);
- `TextureManager.loadTexture`/`bindTexture` — `TextureObject`s keyed by
  `ResourceLocation`; `TickableTextureObject` animated.
- Player skins (`bnp`/SkinManager) load from **network URLs** (session-server textures)
  with the default fallback `bmz`/DefaultPlayerSkin (`textures/entity/steve.png`
  `alex.png` — verify paths in `bmz` when porting).

## 7. Model loading (ties to `BLOCKS_AND_ITEMS.md` §5)

- `models/block|item/*.json` + `blockstates/*.json` → `bou`/ModelManager bake;
  `bgv`/BlockStateMapper maps states → variant locations (weighted variants,
  multipart); `ItemModelGenerator` (`bgp`) makes models from layer textures when no
  model json exists.

## 8. Fonts (ties to `RENDERING.md` §7)

- `font/glyph_sizes.bin` + `textures/font/ascii.png` from the jar; unicode pages from
  assets dir.

## 9. Clean-room asset policy (per user requirement)

The reimplementation must NOT embed/redistribute proprietary assets. The engine
loads assets from a user-supplied game directory (same layout as the launcher assets
dir + optional resource packs). Implementation: replicate the §2 chain with a
configurable assets root; ship only open-source defaults (e.g. a generated
placeholder texture/font) where legally safe.
