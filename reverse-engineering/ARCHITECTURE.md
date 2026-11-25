# Client Architecture — Minecraft 1.8.9

Subsystem map and lifecycle for the whole client. **Verified** from decompiled bytecode
unless noted; per-subsystem deep dives live in the dedicated documents.

## 1. Layered overview

```
net.minecraft.client.main.Main            (un-obfuscated; jopt-simple args)
  └── ave/Minecraft                       game instance singleton ("Client thread")
        ├── avm/Session + authlib          identity (Yggdrasil session, GameProfile)
        ├── bao/GameConfiguration          launcher-supplied config (display, folders, proxy)
        ├── avh/GameSettings + options.txt configuration
        ├── bqs/OpenGlHelper + bfl/GlStateManager + avd/GLAllocation   GL abstraction
        ├── bfw/Framebuffer                off-screen render target
        ├── bfk/EntityRenderer             camera + post-processing + frame orchestration
        │     ├── bfr/RenderGlobal         world render (chunk containers, entities, particles)
        │     │     ├── bht/RenderChunk × N (compiled chunk meshes; VBO/displaylist)
        │     │     ├── bho/ChunkRenderDispatcher (threaded chunk meshing)
        │     │     └── bia/ICamera + culling implementations (frustum)
        │     ├── bfn/ItemRenderer         first-person hand/items
        │     └── blq/ShaderManager + shaders/program  post chain (FXAA, blur, …)
        ├── bda/PlayerControllerMP         client-side game mode (dig/place/use)
        ├── bdb/WorldClient + provider     loaded world view (chunks from server)
        ├── bcy/NetHandlerPlayClient       play-state protocol handler
        ├── bew/EntityPlayerSP             the client player
        ├── bnp/SkinManager, bjh/RenderItem, biu/RenderManager, bgd/BlockRendererDispatcher
        ├── bec/EffectRenderer             particles
        ├── avo/GuiIngame, axu/GuiScreen hierarchy, avn/FontRenderer, ayd/GuiAchievement
        ├── bpx/SoundManager + bpz/SoundHandler + bpn/SoundHandler-registry, bqv/… audio
        ├── bng/SimpleReloadableResourceManager, bnm/ResourcePackRepository, bna/DefaultResourcePack
        ├── bpo/IntegratedServer (own thread) + ll/NetworkSystem + lm/NetHandlerPlayServer…
        ├── or/PlayerUsageSnooper          stats ping
        └── bqm/IStream (TwitchStream)     optional streaming
```

The integrated server (`net/minecraft/server/MinecraftServer` — un-obfuscated — with
`bpo`/IntegratedServer) runs the full single-player server on the "Server thread",
including LAN broadcast (`ll`/NetworkSystem + `NetworkManager.provideLocalServer`).

## 2. Bootstrap sequence (verified `Main.main` + `ave.startGame`)

1. `Main`: parse launcher options (`--gameDir`, `--assetsDir`, `--resourcePackDir`,
   `--accessToken` (required), `--version` (required), `--username/--uuid/--userType`,
   `--width/--height` (854×480), `--fullscreen`, `--demo`, `--server/--port`,
   `--proxy*`, `--userProperties/--profileProperties`, `--assetIndex`, `--checkGlErrors`);
   `System.setProperty("java.net.preferIPv4Stack","true")`; SOCKS proxy + Authenticator.
2. Build `avm`/Session(username, uuid, accessToken, userType) and `bao`/GameConfiguration
   (UserInformation{session,userProperties,profileProperties,proxy}, DisplayInformation,
   FolderInformation, GameInformation{demo,version}, ServerInformation{server,port}).
3. Shutdown hook ("Client Shutdown Thread") → `ave.H()`/stopIntegratedServer.
4. `new ave(config).a()` → `Minecraft.run()` on renamed "Client thread".
5. `startGame()` (`am`): settings load → resource stack init → fonts → GL/textures →
   splash (`drawSplashScreen`) → models → renderers → audio → snooper → `GuiMainMenu`.
   Errors → `CrashReport("Initializing game")` → `displayCrashReport`.
6. `run()`: outer loop (see `GAME_LOOP.md` §2).

## 3. Threading model

| Thread | Owner | Work |
|---|---|---|
| Client thread | `ave` | ticks, rendering, packet *handling*, scheduled tasks |
| Server thread | `bpo`/MinecraftServer.run | integrated-server tick |
| Netty NIO/Epoll event loops | `ek.d/e/f` | socket I/O, codec |
| Chunk worker pool | `bho`/ChunkRenderDispatcher | chunk mesh building (queues of `bht` compile tasks) |
| Sound | paulscode + OpenAL | playback |
| Snooper | `or`/PlayerUsageSnooper | periodic HTTP stats |
| Resource IO | `g`/Util thread pool (`Minecraft.addScheduledTask` + background `Util.runTask`) | resource reload |
| Timer hack | `ave.at` | LWJGL timer keep-alive (obsolete; drop in Rust) |
| Twitch | `bqm` | stream encode (optional) |

Cross-thread contracts:
- `Minecraft.addScheduledTask(Runnable/Callable)` (`a`) — queue drained in `runGameLoop`
  ("scheduledExecutables"); `isCallingFromMinecraftThread()` (`aJ`) gates direct calls.
- Network inbound packets are queued (`NetworkManager.outboundPacketsQueue`/received queue)
  and pumped with `processReceivedPackets()` every tick ("pendingConnection"/handler pump).
- `IThreadListener` (`od`) is the interface both Minecraft and MinecraftServer implement
  for this marshalling.

## 4. Subsystem reference (document → classes)

| Subsystem | Primary classes (obf/MCP) | Document |
|---|---|---|
| Game loop/timing | `ave`/Minecraft, `avl`/Timer, `nt`/Profiler | `GAME_LOOP.md` |
| Rendering core | `bfl`/GlStateManager, `bqs`/OpenGlHelper, `bfx`/Tessellator, `bfe`/WorldVertexBufferUploader, `bms`/DefaultVertexFormats, `bfw`/Framebuffer, `avd`/GLAllocation | `RENDERING.md` |
| World render | `bfk`/EntityRenderer, `bfr`/RenderGlobal, `bfd`/WorldRenderer, `bht`/RenderChunk, `bho`/ChunkRenderDispatcher, `bia`/ICamera | `RENDERING.md` §world |
| Textures | `bmj`/TextureManager, `bmh`/TextureMap, `bmi`/TextureAtlasSprite, `bnr`/TextureUtil | `RENDERING.md` §textures, `RESOURCE_SYSTEM.md` |
| Models | `bou`/ModelManager, `boq`/IBakedModel, `bog`-family block model JSON, `bgp`/ItemModelGenerator | `BLOCKS_AND_ITEMS.md` §models |
| World/chunks | `adm`/World, `bdb`/WorldClient, `amy`/Chunk, `aqj`-family lighting (`SkyLightBlockStorage`? — see `WORLD_SYSTEM.md`), `alo`/BlockPos-neighborhood | `WORLD_SYSTEM.md` |
| Entities | `pk`/Entity, `pr`/EntityLivingBase, `wn`/EntityPlayer, `bew`/EntityPlayerSP, `lf`/EntityPlayerMP, `pz`/DataWatcher, `biu`/RenderManager + `bik`-family renderers | `ENTITY_SYSTEM.md` |
| Physics | `pk.moveEntity`, `pr.moveEntityWithHeading`, `aug`/AxisAlignedBB, `ns`/MathHelper | `PLAYER_PHYSICS.md` |
| Blocks/items | `afh`/Block (251 classes in `net/minecraft/block`), `zw`/Item, `zx`/ItemStack, `alz`/IBlockState + `ala`-family properties | `BLOCKS_AND_ITEMS.md` |
| Inventory | `xi`/Container (+ `xk`,`xl`…), `xy`/ContainerPlayer, `zx`/ItemStack, `aoo`-family containers | `INVENTORY.md` |
| GUI | `axu`/GuiScreen, `avo`/GuiIngame, `axh`/GuiDisconnected, `avn`/FontRenderer, `avt`/GuiNewChat | `GUI_AND_HUD.md` |
| Audio | `bpx`/SoundManager, `bpz`/SoundHandler, `bpf`/PositionedSoundRecord, `bql`-family registry | `AUDIO.md` |
| Resources | `bng`/SimpleReloadableResourceManager, `bnm`/ResourcePackRepository, `bna`/DefaultResourcePack, `bns`/LanguageManager, `bnt`/Locale | `RESOURCE_SYSTEM.md` |
| Network | `ek`/NetworkManager, `el`/EnumConnectionState, `em`/PacketBuffer, `eq/en/er/eo` codecs, `bcx`/NetHandlerLoginClient, `bcy`/NetHandlerPlayClient, `fh`/PacketThreadUtil | `NETWORK_ARCHITECTURE.md`, `PROTOCOL_1_8_9.md`, `PACKET_REFERENCE.md` |
| Server (integrated) | `bpo`/IntegratedServer, `MinecraftServer` (unobf), `ll`/NetworkSystem, `ln`/NetHandlerHandshakeTCP, `lp`/NetHandlerStatusServer, `lo`/NetHandlerLoginServer, `lm`/NetHandlerPlayServer | `WORLD_SYSTEM.md` §server, `PLAYER_PHYSICS.md` §8 |
| Auth | authlib (`MinecraftSessionService`, `GameProfile`, `PropertyMap`), `avm`/Session, `bnp`/SkinManager | `DEPENDENCIES.md` |
| Crash | `b`/CrashReport, `e`/ReportedException, `avk` (OOM marker), crash GUI `axo`? | §7 below |

## 5. Lifecycle state (client)

- `Minecraft.running` (`B`) — outer loop flag.
- `hasCrashed`/`crashReporter` (`V`/`W`) — crash escalation (any `CrashReport` →
  `crashed()` → loop exits → `displayCrashReport`).
- World attach: `loadWorld(WorldClient[, String])` (`a`) — tears down previous world
  (`renderGlobal`, `effectRenderer`, `thePlayer`, GC), sets `renderViewEntity = thePlayer`;
  `setDimensionAndSpawnPlayer(int)` handles dimension switches (respawn packet flow).
- GUI: `displayGuiScreen(GuiScreen|null)` (`a`) — focus/mouse-grab transitions
  (`setIngameFocus` `n`, `setIngameNotInFocus` `o`); null screen = in-game.
- Pause: `isGamePaused` (`af`) — true only in single-player with an open non-narrating GUI;
  freezes `runTick` world phases but not GUI/render.

## 6. Configuration (`avh`/GameSettings)

- Persisted to `options.txt` in `mcDataDir` (`v`); keys `key_*`, `mouseSensitivity`,
  `fov`, `gamma`, `renderDistance`, `graphics` (fancy/fast), `mipmapLevels`, `fboEnable`? —
  full option list in `GUI_AND_HUD.md` §options.
- `KeyBinding` (`avb`) maps GLFW-like key codes (LWJGL Keyboard/Mouse constants,
  mouse buttons = button-100 trick as in `GAME_LOOP.md` §5.7).
- `EnumOptions`-driven GUI widgets (`avh.a` family — sliders/buttons per option).

## 7. Error handling & crashes

- `b`/CrashReport: category + `c`/CrashReportCategory trees; `Minecraft.addGraphicsAndWorldToCrashReport`
  (`b`) attaches GL/level/texture state; `getCrashEnvironment`-style sections include
  JVM, LWJGL, GL caps (via snooper data).
- `e`/ReportedException wraps a CrashReport through the call stack.
- `displayCrashReport` (`c`): writes `crash-reports/crash-YYYY-MM-DD_HH.mm.ss-client.txt`,
  shows `axo`/… crash screen (1.8 client shows `GuiErrorScreen`-ish; details in
  `GUI_AND_HUD.md`).
- Fatal-but-recoverable: `OutOfMemoryError` in the loop → `freeMemory()` +
  `GuiOutOfMemory` screen (verified `run()`).

## 8. Performance & memory (1.8.9 specifics)

- Chunk render: per-`RenderChunk` compiled display lists or **VBOs**
  (`OpenGlHelper.useVbo()` — ARB_vertex_buffer_object path; default on modern GPUs),
  rebuilt on the `ChunkRenderDispatcher` thread pool; `renderChunksMany` (`G`)
  = the "render chunks many/multidraw" experimental flag in options.
- `memoryReserve` (`b`, a 10 MB byte[]) held to make OOM recoverable (`freeMemory` frees it).
- The profiler (`nt`) is always on (per-frame section timing).
- `GlStateManager` caches GL state (texture binds, blend funcs, matrix stack) to reduce
  redundant GL calls — a Rust renderer should keep a similar state cache.
- Frame buffer object path: `Framebuffer` (`bfw`) for world rendering (post-processing),
  resized on window resize.

## 9. Java→Rust architecture summary

See `JAVA_TO_RUST_MAPPING.md` for the full mapping. Skeleton:

- `Client` struct owning all subsystems; tick method = `runTick` phase order;
  render method = `runGameLoop` render sections.
- ECS *not* required — vanilla's inheritance-heavy entity model maps better to a trait-object
  or enum-dispatch design; keep `Entity` data in a slab/arena with typed components.
- Deterministic fixed tick (50 ms) + interpolation; sim and render decoupled by
  `renderPartialTicks`.
