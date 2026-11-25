# Android Compatibility — Minecraft 1.8.9 → Starling (Rust)

Design constraints for running the reimplementation on Android (Starling project).
Built on verified 1.8.9 behavior documented elsewhere in this set.

## 1. Platform mapping

| 1.8.9 (Java/PC) | Android target | Notes |
|---|---|---|
| LWJGL 2 Display | `NativeActivity`/`GameActivity` + EGL surface | recreate on resume; GL context loss handling (1.8 has none — must add) |
| Desktop GL 2.x/3.x compat | OpenGL ES 2.0 minimum / ES 3.0 preferred | ES3 for VBO/multisample; ES2 fallback with triangle-split quads |
| LWJGL Mouse/Keyboard | touch + IME + gamepad | see §3 |
| OpenAL (paulscode) | AAudio (via `oboe`) | positional audio, 9 categories (see `AUDIO.md`) |
| `java.io.File` gameDir | app-specific external dir + SAF picker | resource packs & saves; asset root configurable (see `RESOURCE_SYSTEM.md` §9) |
| Netty NIO threads | `tokio` runtime (multi-thread) | network + disk IO on background threads; GL only on main |
| `Sys.getTimerResolution`/`getTime` | `CLOCK_MONOTONIC` ns | fixed 50 ms tick with accumulator (see `GAME_LOOP.md` §2) |
| Screenshot (PNG via ImageIO) | `image`/`png` crate to MediaStore | |
| Crash reports | files + optional upload | `CrashReport` structure preserved (`ARCHITECTURE.md` §7) |

## 2. Performance envelope

1.8.9 client on PC: ~20 ticks/s + render; Android budget (typical mid-range 2025):
- Keep chunk meshing on a worker pool (`ChunkRenderDispatcher` analog); cap concurrent
  compile jobs to (cores − 1).
- Draw-call discipline: GlStateManager-style state cache is essential on GLES.
- Render distance: default 4–6 chunks on mobile (1.8 PC default 8–12).
- Particles/weather: scale counts by a perf setting; keep exact behavior as an option.

## 3. Input mapping (design; 1.8 has no touch support)

- Touch drag on right half → look (yaw/pitch deltas through the same
  sensitivity formula as `RENDERING.md` §3).
- Tap left half → interact? (place/use), long-press → break (hold = `onPlayerDamageBlock`
  loop); double-tap-drag → sprint (double-tap W analog).
- Virtual joystick (left) → `MovementInput` (`beu`) values in [-1,1];
  jump/sneak/fly buttons feed `jump`/`sneak` fields.
- Gamepad: map to 1.8 key bindings (`KeyBinding` table).
- Keep raw mouse/keyboard events in the codebase for desktop parity testing.

## 4. Networking on Android

- The 1.8.9 protocol (`PROTOCOL_1_8_9.md`) runs unchanged over TCP — works on Android.
- TLS not used by MC 1.8 TCP; encryption is AES/CFB8 in-protocol (verified
  `NETWORK_ARCHITECTURE.md` §5) — fine on mobile.
- Join-server auth (Yggdrasil) needs internet permission + modern Mojang endpoints
  (the session host `session.minecraft.net` in 1.8 is legacy — the modern
  `api.minecraftservices.com` session endpoint accepts the same
  SHA-1(serverId, sharedSecret, publicKey) join; the hash algorithm is protocol-fixed).

## 5. Lifecycle

- Pause: `Minecraft.pause()`-equivalent (1.8 pauses on focus loss — `GAME_LOOP.md` §2);
  `SoundManager.pauseAllSounds` on `onPause`, resume on `onResume`.
- Context loss: rebuild GL resources from `ResourceLocation` keys (texture manager
  already abstracts this — port the bookkeeping).
- Background network: keep the connection with a keep-alive watchdog (1.8 keep-alive
  window ~20 s tolerance); disconnect on `onStop` if the OS kills the socket.

## 6. Storage & assets (legal)

- No proprietary assets in the APK (user constraint): the app downloads/loads assets
  from a user-provided location; a minimal open placeholder set can ship for first-run
  UX (generated textures only).
- Saves: Anvil format (`net/minecraft/world/chunk/storage` family) if integrated-server
  support lands; single-player is roadmap-phase-later than multiplayer (see
  `IMPLEMENTATION_ROADMAP.md`).

## 7. GLES parity checklist

- [ ] quads → triangles at mesh build (identical vertex data otherwise),
- [ ] lightmap second texture unit (modulate),
- [ ] alpha func → discard in shader (cutout),
- [ ] FBO for world render + entity outline (or reorder to direct render + overlay),
- [ ] `glTexSubImage2D` lightmap upload per frame (16×16),
- [ ] point sprites? (1.8 particles are quads — fine),
- [ ] `GL_QUADS`-based debug draw (F3) → lines/triangles.
