# Game Loop & Frame Scheduling — Minecraft 1.8.9

All facts **Verified** from decompiled `ave`/Minecraft (`func_99999_d` = run,
`func_71411_J` = runGameLoop, `func_71407_l` = runTick), `avl`/Timer, `nt`/Profiler.

## 1. Thread model

- `net.minecraft.client.main.Main` (`Main.main`): sets `java.net.preferIPv4Stack=true`,
  parses launcher args (jopt-simple), builds `avm`/Session + `bao`/GameConfiguration,
  registers a shutdown hook thread ("Client Shutdown Thread" → `ave.H()`
  = `stopIntegratedServer`), renames the current thread **"Client thread"**, then runs
  `new ave(config).a()` — `Minecraft.run()`.
- Everything in `run`/`runGameLoop`/`runTick` executes on that single "Client thread".
  Worker threads: Netty event loops (network), `IntegratedServer` thread ("Server thread"),
  Resource loading (Minecraft's `Util` executor, `g`/Util.runTask), chunk render threads
  (`bho`/ChunkRenderDispatcher pool), sound (paulscode + OpenAL), Twitch stream (optional),
  Snooper (`or`/PlayerUsageSnooper timer thread), "Timer hack" thread
  (`startTimerHackThread`, LWJGL timer workaround).

## 2. `Minecraft.run()` (obf `a`, 211 B) — outer loop

```
running = true
try startGame() catch → CrashReport("Initializing game") + displayCrashReport, return
try:
  while running:
    if hasCrashed && crashReporter != null: displayCrashReport(crashReporter); return
    try runGameLoop()
    catch OutOfMemoryError: freeMemory(); displayGuiScreen(new GuiOutOfMemory()); System.gc()
catch OutOfMemoryError-continued (obf avk = the OOM 'kick' throwable marker): swallow
catch ReportedException(e): displayCrashReport(e.getCrashReport()); freeMemory(); log "Reported exception thrown!"
catch Throwable: wrap in CrashReport("Unexpected error"); freeMemory(); log "Unreported exception thrown!"
finally shutdownMinecraftApplet()
```

- `hasCrashed`/`crashReporter` are set by `Minecraft.crashed(CrashReport)` (`func_71404_a`),
  which is how any subsystem escalates a fatal error (see `WORLD_SYSTEM.md` crash path).
- `freeMemory()` (`l()`): drops world (`loadWorld(null)`), System.gc(), re-displays
  `GuiOutOfMemory` if allocation still fails.

## 3. `runGameLoop()` (obf `av`, 965 B) — one frame

Profiler sections (in order; `nt`/Profiler, `A.a(name)` = startSection, `A.b()` = endSection,
`A.c(name)` = endStartSection):

| Section | Work |
|---|---|
| `root` | if `Display.isCreated() && Display.isCloseRequested()` → `shutdown()` |
| (timer) | `timer.updateTimer()` (`Y.a()`); paused-singleplayer quirk: when `isGamePaused && theWorld != null`, save+restore `renderPartialTicks` across the call (so the pause menu keeps smooth GUI animation while the world freezes) |
| `scheduledExecutables` | drain `scheduledTasks` queue (`aM`, `Queue<FutureTask<?>>`) via `g.a(FutureTask, logger)` — `Minecraft.addScheduledTask` work runs here |
| `tick` | `for i in 0..timer.elapsedTicks: runTick()` — 0 ticks on slow frames, up to **10** (Timer clamp) on catch-up |
| `preRenderErrors` | `checkGLError("Pre render")` (only when `enableGLErrorChecking`) |
| `sound` | `mcSoundHandler.update(thePlayer, renderPartialTicks)` (`aH.a(h, Y.c)`) — positional audio update |
| `render` | `GlStateManager.pushMatrix`+`clear(16640 = COLOR\|DEPTH)`; `framebufferMc.framebufferRender(displayWidth, displayHeight)`?? — see note; `GlStateManager.enableAlpha/alphaFunc` sequencing via `bfl` calls (`m(16640)` = clear) |
| `display` | `GlStateManager.flush()`; if player in bed (`thePlayer.isPlayerSleeping()` = `h.aj()`) → reset `entityRenderer.camRoll`-family counter (`t.aB = 0`) |
| `gameRenderer` | if not `skipRenderWorld`: `entityRenderer.updateCameraAndRender(renderPartialTicks, frameStartNanos)` (`o.a(Y.c, l2)`) |
| (debug) | if F3-shown (`t.aC && t.aD && !t.aA` = gameSettings.showDebugInfo…): profiler collect + `displayDebugInfo(delta)` — else reset `prevFrameTime` |
| (gui achievement) | `guiAchievement.updateAchievementWindow()` (`p.a()`) |
| (stream) | `framebufferMc.unbindFramebuffer(); framebufferMc.framebufferRender?` — the sequence `aF.e(); bfl.E/F(); aF.c(d,e); o.b(Y.c)` = unbind FB, render FB to screen, `entityRenderer.renderStreamIndicator(partialTicks)` |
| `display_update` | `Display.update()` + `checkWindowResize()` (`i()`) — handles `Display.wasResized`, clamps w/h ≥ 1, `resize(w,h)` |
| `stream` | `stream.update()` (`aE.g()`) + `stream.submitFrame()` (`aE.h()`) — Twitch |
| `fpslimit_wait` | if `isFramerateLimitBelowMax()`: `Display.sync(getLimitFramerate())` — **the frame cap** |
| (fps) | `fpsCounter++`; each second: `debugFPS` updated, `debug` string built `"%d fps (%d chunk update%s) T: %s%s%s%s%s"` (chunk updates from `bht.a` = RenderChunk.renderChunksUpdated; T: framerate-limit label, vsync/`fast`/clouds labels, `vbo` when `OpenGlHelper.useVbo()`), snooper bookkeeping (`usageSnooper`), `frameTimer.addFrame(nanos)` (`y.a`) |

Ordering guarantee: **game logic ticks run before rendering in the same frame**;
`renderPartialTicks` is the Timer's fractional accumulator (0..1) used to interpolate.

Note (verified string): the FPS label formats the current limit as
`Integer((int) gameSettings.limitFramerate)` or `"inf"` when the `Limit framerate` option
is at its max value (`avh.a.i.f()`), plus `" vsync"` when `gameSettings.vsync`,
`"" | " fast" | " fast-clouds" | " fancy-clouds"` from graphics settings, and `" vbo"`.

## 4. `Timer` (`avl`) — time base (verified)

| Field (MCP) | Meaning |
|---|---|
| `ticksPerSecond` | 20.0 F constant |
| `timerSpeed` | game-speed multiplier (options; default 1.0) |
| `elapsedTicks` | whole ticks to run this frame (int, clamped ≤ 10) |
| `elapsedPartialTicks` | fractional accumulator |
| `renderPartialTicks` | value for rendering interpolation |
| `timeSyncAdjustment` | EMA'd ms→s drift factor (init 1.0) |

`updateTimer()`:
1. `sysMs = Minecraft.getSystemTime()` = **`org.lwjgl.Sys.getTime() * 1000 / Sys.getTimerResolution()`**
   (monotonic ms — Rust: `std::time::Instant`-derived ms).
2. `elapsedSys = sysMs - lastSyncSysClock`; `hrSec = (nanoTime()/1e6)/1000`.
3. If `elapsedSys > 1000 || < 0` → resync `lastHRTime = hrSec` (clock jump).
4. Else accumulate `counter += elapsedSys`; when `counter > 1000`:
   `timeSyncAdjustment += (counter / (hrMs - lastSyncHRClock) - timeSyncAdjustment) * 0.2`.
5. `delta = clamp((hrSec - lastHRTime) * timeSyncAdjustment, 0, 1)`.
6. `elapsedPartialTicks += delta * timerSpeed * 20`; `elapsedTicks = (int)elapsedPartialTicks`
   (fraction kept); clamp `elapsedTicks ≤ 10`; `renderPartialTicks = elapsedPartialTicks`.

## 5. `runTick()` (obf `s`, 2,301 B) — one game tick (20 Hz logical)

Phases via profiler (verified order):

1. `rightClickDelayTimer` decrement (`ap`).
2. `gui` — `ingameGUI.updateTick()` (`q.c()`) — HUD animations, title timers, vignette.
3. `gameRenderer` — `entityRenderer.updateRenderer()` (`o.e(1.0f)` arg unused) — camera
   smoothing when not paused.
4. `gameMode` — `playerController.updateController()` (`c.e()`) — block-dig progress,
   delayed creative destroy (`leftClickCounter`), etc.
5. `textures` — `renderEngine.tick()` (`R.e()`) — animated texture atlas ticks
   (TextureMap.updateAnimations).
6. (gui screens) — `currentScreen.updateScreen()`? no — the running tick first handles
   `checkGlError` bookkeeping + **fullscreen toggle** (`toggleFullscreen` on F11-style key
   via `dispatchKeypresses`).
7. `mouse` — pump `Mouse.next()`:
   - `KeyBinding.setKeyBindState(button-100+…)` for mouse-button binds (`avb.a(n2-100, state)`),
     press events `avb.a(n2-100)`.
   - middle-click while spectator (`thePlayer.isSpectator() && button==2`) → pick spectated
     entity (`ingameGUI` spectator picker `q.g().b()`).
   - wheel within 200 ms of last tick end: spectator → spectate-scroll or
     `capabilities.setFlySpeed(clamp(flySpeed + wheel*0.005, 0.0, 0.2))`;
     otherwise `thePlayer.inventory.changeCurrentItem(wheel)` (`wn.bi.d`).
   - click-to-close-GUI focus logic + `currentScreen.handleMouseInput()` (`m.k()`).
   - `leftClickCounter` decrement.
8. `keyboard` — pump `Keyboard.next()`: `KeyBinding` state+press hooks; **F3+F4-hold debug
   crash** (≥ 6 s holding F3+F4(F?) keys 46+61 → `ReportedException("Manually triggered debug crash")`);
   `dispatchKeypresses()` (`Z()` — F1 hide GUI, F3 debug, F5 perspective, F8 smooth mouse,
   F11 fullscreen, screenshot key…); `currentScreen.handleKeyboardInput()`.
9. World-connected branch (else skip to `pendingConnection`):
   - `gameRenderer` — `entityRenderer.updateRenderer()`… (see 3.)
   - `levelRenderer` — `renderGlobal.updateClouds()` (`g.j()`).
   - `level` — difficulty-locked countdown (`theWorld.setDifficultyLock?` `f.d(f.ac()-1)`)
     + `theWorld.tick()` (`f.c()`).
   - after: `mcMusicTicker.update()` (`aI.c()`), `mcSoundHandler.update()` (`aH.c()`)
     (2-arg variants here are the per-tick no-arg updates).
   - `theWorld.updateEntities()`? — `f.c()` is World.tick; entity ticking occurs inside it
     (`WORLD_SYSTEM.md`).
   - `animateTick` — `theWorld.doVoidFogParticles(floor(player x/y/z))` (`f.b`).
   - `particles` — `effectRenderer.updateEffects()` (`j.a()`).
10. else if `myNetworkManager != null` — `pendingConnection` —
    `networkManager.processReceivedPackets()` (`av.a()`) — pumps queued inbound packets on
    the client thread.
11. Tail: `systemTime = getSystemTime()` (`this.x`) — used by the 200 ms input gate in 7.

Mouse/keyboard gating detail (verified): inside the Mouse pump,
`if (getSystemTime() - systemTime > 200) continue` skips wheel+click processing when the
previous frame ended more than 200 ms ago (input suppression after stalls).

## 6. Frame pacing

- `getLimitFramerate()`: returns the `Limit framerate` setting value (up to 260 in the
  options list; option value `i` = "inf" is *not* synced) when `isFramerateLimitBelowMax()`,
  else 0/uncapped; `Display.sync(fps)` (LWJGL) sleeps to cap.
- Vsync (`gameSettings.vsync`) handled by the GL driver via `Display` (LWJGL swap interval).
- The integrated-server tick runs on its own thread ("Server thread", `bpo`/IntegratedServer
  `run()`); client and server tick independently; `Minecraft.addScheduledTask` marshals
  server→client work (used by `launchIntegratedServer` etc.).

## 7. Splash / startup (verified `startGame`, `am`, 1,094 B summary)

`startGame` order (high level; details in subsystem docs):
1. `gameSettings` load (`avh` from options.txt), `checkGLError("Pre startup")`.
2. `defaultResourcePacks` = `[mcDefaultResourcePack (jar)]`; `mcResourcePackRepository`
   (`bnm`) init; `refreshResources()` → `SimpleReloadableResourceManager` (`bng`) reload
   pipeline (`RESOURCE_SYSTEM.md`).
3. `mcLanguageManager` (`bns`) load; `fontRendererObj`/`standardGalacticFontRenderer`
   (`avn` ×2, second with `forceUnicode`/galactic flag).
4. `OpenGlHelper.initializeTextures()` (`bqs`), `GlStateManager` init, `TextureManager`
   (`bmj`) + `textureMapBlocks` (`bmh`) + `textureMapItems`, `drawSplashScreen`.
5. `modelManager` (`bou`) load + `blockRenderDispatcher` (`bgd`), `renderItem` (`bjh`),
   `entityRenderer` (`bfk`), `renderGlobal` (`bfr`), `effectRenderer` (`bec`),
   `guiAchievement`, `ingameGUI`, `sessionService` (Yggdrasil `MinecraftSessionService`),
   `skinManager` (`bnp`), `mcSoundHandler` + `mcMusicTicker`, `PlayerUsageSnooper` start,
   `IntegratedServer` prep, `Framebuffer` (`bfw`) create/`resize`, `displayGuiScreen(new GuiMainMenu)`.
6. `checkGLError("Post startup")`; `startTimerHackThread()` (a daemon that keeps the LWJGL
   timer ticking — obsolete on modern platforms; a Rust port should skip it).

## 8. Rust port notes

- Single "client thread" with a `VecDeque<Runnable>` for `addScheduledTask`;
  async runtime (tokio) only for network/audio decode workers; packet *handling* must be
  marshalled onto the client tick thread (NetHandler-style `processReceivedPackets` pump or
  an mpsc into the tick).
- Deterministic tick = 50 ms; `elapsedTicks ≤ 10` clamp must be preserved (anti spiral).
- `renderPartialTicks` interpolation is the only render-clock; physics is strictly
  tick-based — never integrate movement per-frame (this is the #1 behavioral trap).
