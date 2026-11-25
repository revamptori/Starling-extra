# Source Inventory — `original/client.jar.zip`

**Status: COMPLETE (Phase 1).** All claims in this document are **Verified** unless marked.

## 1. Archive identity

| Property | Value |
|---|---|
| Path | `original/client.jar.zip` (kept untouched) |
| Size | 8,461,484 bytes |
| SHA-256 | `14f0d96d1a56fb4f5c3b2233d00699525893fe5ce3dcf181e7de59120595d298` |
| Format | ZIP whose entries are the **contents of the client JAR** (no outer `.jar` file) |
| Entry timestamps | `2015-12-09 10:24` (all entries; consistent with a single build/archive operation) |
| Total entries | 5,597 files |

## 2. Authenticity and integrity — **bit-exact Mojang client**

1. **Signature block**: `META-INF/MOJANGCS.SF` + `META-INF/MOJANGCS.RSA`. The RSA block carries
   the certificate chain `VeriSign Class 3 Public Primary → VeriSign Class 3 Code Signing 2010 CA
   → C=SE, ST=Stockholm, O=Mojang, OU=Digital ID Class 3 - Java Object Signing, CN=Mojang`.
   The SF file's `SHA-256-Digest-Manifest` matches the actual `MANIFEST.MF` hash.
2. **Per-entry digests**: `MANIFEST.MF` lists SHA-256 digests for **5,594 payload entries**.
   Every extracted file was hashed and compared: **5,594 verified, 0 mismatched, 0 missing,
   0 uncovered files** (script: `analysis/` manifest verifier, run 2026-11-25).
3. **Conclusion**: the archive content is **bit-identical to the Mojang-signed 1.8.9 client
   JAR**. There are **no Starling-specific modifications, patches, injected loaders, or added
   classes**. The only packaging quirk is that the ZIP contains raw JAR entries rather than
   the `.jar` file (so ZIP-level CRCs of the original JAR container are not preserved —
   content is nevertheless authenticated by the manifest digests).

## 3. Version verification (1.8.9, not 1.8.8/1.9)

Independent markers (strings recovered from classes):

| Marker | Location | Content |
|---|---|---|
| Window/title | `ave` (Minecraft) | `"Minecraft 1.8.9"` |
| Client version | `ave.getVersion()` (`func_175600_c`) | `"1.8.9"` |
| Realms constant | `net/minecraft/realms/RealmsSharedConstants` | `VERSION_STRING = "1.8.9"` |
| Integrated server log | `bpo` (IntegratedServer) | `"Starting integrated minecraft server version 1.8.9"` |
| Server root | `net/minecraft/server/MinecraftServer` | `"1.8.9"` |
| Handshake mismatch | `ln` (NetHandlerHandshakeTCP) | `"Outdated server! I'm still on 1.8.9"`, `"Outdated client! Please use 1.8.9"` |
| Debug overlay | `avv` (GuiOverlayDebug) | `"Minecraft 1.8.9 (…"` |
| Main menu | `aya` (GuiMainMenu) | `"Minecraft 1.8.9"` |
| Server data default | `bde` (ServerData) | `"1.8.9"` |
| Snooper | `or` (PlayerUsageSnooper) | `"1.8.9"` |

Other fingerprint checks consistent with 1.8.x (not 1.9+):
`assets/minecraft/lang/en_US.lang` (1.8-era `.lang` format; 1.9+ uses JSON),
blockstates/ + models/ JSON system present (1.8+), `log4j2.xml` root config,
`net/minecraft/realms/*` + `net/minecraft/server/MinecraftServer` shipped un-obfuscated
(1.8.x layout). Protocol registry (see below) matches **protocol 47** exactly (1.8–1.8.9).

Note: 1.8.8 and 1.8.9 share protocol 47; the explicit `"1.8.9"` markers distinguish this
build from 1.8.8.

## 4. Manifest quirk

`MANIFEST.MF` declares `Main-Class: net.minecraft.client.Main` — **no such class exists**
(the entry point is `net/minecraft/client/main/Main.class`). This is a genuine Mojang quirk
(the official launcher invokes `net.minecraft.client.main.Main` explicitly). A reimplementation
should use `net.minecraft.client.main.Main` semantics.

## 5. Class inventory

| Category | Count |
|---|---|
| Total `.class` files | **2,507** (all Java 6 classfile major version 50) |
| Obfuscated top-level | 1,586 |
| Obfuscated inner/synthetic (`X$…`) | 888 |
| Un-obfuscated `net/minecraft/**` | 33 |
| Distinct MCP packages (post-mapping) | 250+ (full table in `CLASS_CATALOG.md`) |

Un-obfuscated `net/minecraft/**` classes (33):

- `net/minecraft/client/ClientBrandRetriever`
- `net/minecraft/client/main/Main` (+ `Main$1`, `Main$2`)
- `net/minecraft/realms/*` (26 classes: Realms, RealmsBridge, RealmsConnect, RealmsScreen,
  RealmsServerPing, RealmsSharedConstants, Tezzelator, …)
- `net/minecraft/server/MinecraftServer` (+ `$1`, `$3`, `$4`)

All 1,586 obfuscated top-level classes map to official MCP 9.19 names (**100% coverage**);
888 inner classes map via `joined.srg` `$`-entries or inherit the owner's name.

## 6. Resource inventory (3,090 files)

| Tree | Files | Notes |
|---|---|---|
| `assets/minecraft/blockstates/` | 340 | 1.8 blockstate variant JSON |
| `assets/minecraft/models/block/` + `models/item/` | 1,595 | block + item model JSON |
| `assets/minecraft/textures/` | 1,058 | PNG + `.mcmeta` (see below) |
| `assets/minecraft/shaders/` | 87 | post (`post/`) + `program/` GLSL (`.fsh` 26, `.vsh` 9) + JSON |
| `assets/minecraft/texts/` | 3 | `credits.txt`, `end.txt`, `splashes.txt` |
| `assets/minecraft/font/glyph_sizes.bin` | 1 | 65,536-byte glyph width table (256×256) |
| `assets/minecraft/lang/en_US.lang` | 1 | **only English** in the jar (other languages arrive via the asset index/resource packs) |
| root | 2 | `log4j2.xml`, `pack.png` (27,217 B) |
| `META-INF/` | 3 | manifest + signature block |

Extensions: `.json` 1,987 · `.png` 1,043 · `.mcmeta` 15 · `.fsh` 26 · `.vsh` 9 · `.txt` 3 ·
`.bin` 1 · `.lang` 1.

Texture spot-checks (verified PNG headers):
`textures/font/ascii.png` 128×128 · `textures/gui/icons.png` 256×256 ·
`textures/particle/particles.png` 128×128 · `textures/colormap/grass.png` 256×256 ·
`textures/environment/moon_phases.png` 128×64 · `textures/environment/sun.png` 32×32 ·
`textures/misc/vignette.png` 256×256 · block/item textures 16×16.

**Not present in the jar** (loaded from the launcher's asset-index object store or resource
packs at runtime; loading paths documented in `RESOURCE_SYSTEM.md`):
`sounds.json`, the `.ogg` sound bank, and all non-English `.lang` files.
`SoundHandler` (`bpz`) references `"sounds.json"`; `Locale` (`bnt`) loads
`lang/%s.lang` through the resource stack.

## 7. Embedded dependencies

No bundled third-party libraries (no `org/lwjgl`, `io/netty`, … classes inside the jar) —
all dependencies are provided at runtime by the launcher classpath. Reference footprint
(strings in classfiles): JDK 2,318 classes · Guava 506 · Log4j2 129 · Netty 128 ·
LWJGL 77 (opengl 37, input 24, glu 6, display 5) · Authlib 76 · Gson 64 · Twitch SDK 22 ·
javax 17 · paulscode 4 · ICU 1. Details in `DEPENDENCIES.md`.

## 8. Protocol registry recovered from the jar

`el` (EnumConnectionState) static initialization registers packets in wire-ID order
(see `tools/packet_registry_from_jar.json`): HANDSHAKING 1 serverbound · STATUS 2+2 ·
LOGIN 4 clientbound + 2 serverbound · PLAY **74 clientbound + 26 serverbound** —
an exact match to the protocol-47 reference tables (PrismarineJS `minecraft-data` 1.8),
cross-checked packet-by-packet. Full reference in `PACKET_REFERENCE.md`.

## 9. Working artifacts (analysis/)

| Artifact | Description |
|---|---|
| `analysis/extract/` | extracted archive (ignored by git) |
| `analysis/src/` | CFR 0.152 decompilation of all classes (ignored by git) |
| `analysis/class_index.json` | parsed hierarchy/fields/methods of all 2,507 classes (committed) |
| `analysis/class_catalog.json` | obf→MCP class table (committed) |
| `analysis/mappings.json` | full obf→srg→MCP field/method tables (committed) |
| `analysis/tools/packet_registry_from_jar.json` | packet IDs by state/direction (committed) |
| `analysis/tools/packet_fields.json` | wire field order per packet (committed) |
| `analysis/MCP-919-main/conf/` | MCP 9.19 mappings source (upstream `Marcelektro/MCP-919`) |

## 10. Coverage checklist (Phase 1)

- [x] Archive located, hashed, extracted (original untouched)
- [x] Contents inventoried (classes, resources, manifest, signature)
- [x] Genuine 1.8.9 proven (version markers + protocol registry + asset layout)
- [x] Bit-exact integrity proven (5,594/5,594 manifest digests + SF→manifest digest)
- [x] Modifications check — **none found** (all content is Mojang-signed)
- [x] Dependency footprint recorded
