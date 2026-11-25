# Dependencies — Minecraft 1.8.9 client → Rust/Android

## 1. Bundled libraries (verified via constant-pool scan of `client.jar`)

The 1.8.9 client ships its dependencies **relocated/shaded inside the jar** (no external
jars). Constant-pool reference counts (class references mentioning each namespace):

| Library | Refs | Role in 1.8.9 | Rust/Android replacement |
|---|---|---|---|
| JDK (`java.*`, `javax.*`) | 2,318 | core runtime, NIO, crypto, ZIP | Rust std + `tokio` (net), `flate2`, `zip` |
| Guava | 506 | collections, caching, event bus | `std` + small helper crates (no full port needed) |
| Log4j2 | 129 | logging (`log4j2.xml`) | `tracing` / `log` + `env_logger` |
| Netty | 128 | TCP pipeline (framing/codec/handlers) | `tokio` + hand-rolled codecs (packet framing is small) |
| LWJGL 2 | 77 | OpenGL, OpenAL, Display/Mouse/Keyboard, Sys | Android: GLES3 via `glow` + `ndk`/`winit`-less custom surface; desktop: `glutin`/`winit` for parity tests |
| Authlib | 76 | Yggdrasil auth, GameProfile, session join | `reqwest` + hand-rolled Yggdrasil calls (Mojang API) |
| Gson | 64 | JSON (chat components, skins, servers, resource packs) | `serde_json` |
| Twitch SDK | 22 | streaming (optional feature) | **drop** (feature-gate out) |
| Paulscode sound | 4 refs (plus API surface) | audio playback | `cpal`/`rodio` or AAudio via `oboe` |
| ICU (`java.text` bidi) | 1 | RTL text in chat | `unicode-bidi` crate or manual shaping |

Note: Log4j2 2.0-rc1 — historical CVE-2021-44228 surface exists in the original;
the Rust port must not re-introduce message-lookup behavior (it won't).

## 2. Java SE API surface actually used (from constant-pool classes)

- `java.lang` (String/Thread/Math/…), `java.util` (collections, Random — **LCG
  `java.util.Random` semantics needed for world-gen parity**), `java.io`, `java.nio`
  (ByteOrder LITTLE_ENDIAN everywhere), `java.net` (URL for skins/servers),
  `java.security` (MessageDigest SHA-1, RSA/Cipher AES/CFB8), `java.text`, `java.util.zip` (GZIP),
  `javax.imageio` (screenshots PNG), `java.awt`? (headless-safe usage only).
- `java.util.Random` next-int semantics (48-bit LCG) must be bit-matched for
  any ported generation code.

## 3. Android constraints (for the Starling target)

| Java/PC feature | Android reality | Strategy |
|---|---|---|
| LWJGL Display + OpenGL desktop profile | SurfaceView/Activity + GLES 2/3 | `glow`-style loader + EGL; fixed-function calls emulated in a state-cache layer (`bfl`/GlStateManager maps directly) |
| Immediate quads | GLES: triangles only | split at mesh build |
| OpenAL (paulscode) | AAudio/OpenSL | `oboe`/`cpal` Android backend |
| Keyboard/mouse | touch + optional gamepad | input layer maps taps to left/right click, virtual joystick (see `ANDROID_COMPATIBILITY.md`) |
| File paths (gameDir, saves, resource packs) | scoped storage | SAF + app-private dirs; asset root configurable |
| `Display.setFullscreen`, vsync | window flags / surface | platform glue |
| Threads (Netty, chunk pool) | same | `tokio` + rayon-style pool; respect lifecycle (pause/resume → `pauseAllSounds`, GC pressure) |
| Auth (Yggdrasil, device code) | mobile OAuth flow | keep 1.8.9 `joinServer` SHA-1 hash protocol — works from any platform |

## 4. Maven-style manifest (informational)

The jar's manifest + constant pool imply these exact original versions (best-known):
LWJGL 2.9.4 (2015-02-25? — verify `org/lwjgl` version strings when needed), Guava 17/18,
Gson 2.2.4, Netty 4.0.x, Log4j2 2.0-beta9/rc1, Authlib 1.5.21/1.6.x, Paulscode 20120417,
Twitch 6.5?, jopt-simple 4.6 (launcher args in `net/minecraft/client/main/Main`).

## 5. Licensing note (per user constraint)

Mojang's code/assets are proprietary. The reimplementation replaces **all** dependencies
with clean-room Rust equivalents and must not bundle LWJGL/Authlib/Twitch binaries or
Mojang textures. Mapping tables (MCP) are community-derived and kept in
`analysis/` as analysis tooling only, not shipped product code.
