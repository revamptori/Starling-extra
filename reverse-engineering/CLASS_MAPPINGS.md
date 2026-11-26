# Class & Name Mappings — Minecraft 1.8.9

## 1. Name spaces

Three name spaces must stay connected at all times:

| Name space | Example | Source |
|---|---|---|
| **Original (obfuscated)** | `ave`, `pk.d(DDD)V` | class/method/field names inside `client.jar` |
| **SRG** | `net/minecraft/client/Minecraft`, `func_70091_d` | MCP-919 `joined.srg` (`analysis/MCP-919-main/conf/`) |
| **MCP (recovered)** | `Minecraft`, `moveEntity` | MCP-919 `methods.csv`/`fields.csv` + class renames |

The jar is the 1.8.9 stable mapping set (verified 100 % MCP coverage:
`analysis/mappings.json` built from `conf/joined.srg` + CSVs by
`analysis/tools/build_mappings.py`).

## 2. Generated artifacts

| File | Content | Built by |
|---|---|---|
| `analysis/class_index.json` | per-class names, members, flags | `tools/class_index.py` |
| `analysis/class_catalog.json` | 2,507 rows: obf, mcp, super, interfaces | python join (this session) |
| `analysis/mappings.json` | cls 2541 / fld 8917 / mth 16426 obf→srg→mcp | `tools/build_mappings.py` |
| `analysis/src{,2,3}/*.java` | complete decompilation (CFR 0.152, 2,507 files; split 825/825/824 across `src`/`src2`/`src3` — GitHub's web UI truncates directories over 1,000 entries) | `tools/run_chunks.sh` |
| `reverse-engineering/CLASS_CATALOG.md` | human-readable catalog (grouped tables) | generator |

## 3. Working with the source

- The decompiled Java is split across **`analysis/src/`** (root files a…~c plus the
  un-obfuscated `net/minecraft/**` tree), **`analysis/src2/`**, and **`analysis/src3/`**
  in alphabetical order — purely for GitHub directory-size limits. To locate a class:
  `find analysis/src analysis/src2 analysis/src3 -name 'pk.java'`, or search across all
  three with `grep -rn ... analysis/src*`.
- Method/field names inside these files are **obfuscated** (e.g. `pk.d(ddd)`).
  Resolve to MCP via `mappings.json`:
  `{"pk.d(DDD)V": {"srg": "func_70091_d", "mcp": "moveEntity", ...}}`.
- Quick member listing with MCP names:
  `python3 analysis/tools/class_report.py <obfClassName>`.
- The constant-pool noise ("log4j2" header lines) in decompiled files is a CFR
  artifact — ignore; the code below is faithful.

## 4. Naming policy for the Rust reimplementation

- Use **MCP names** for all types/functions in the Rust port (e.g. `move_entity`,
  `entity_living_base`), keeping the obf/SRG pair in doc comments:
  `/// obf: pk.d / srg: func_70091_d`.
- Packet classes keep both the protocol name (S08/C06) and MCP name
  (`S08PacketPlayerPosLook`).
- Never invent names: if MCP has no name (unmapped internals), derive from the SRG
  (`func_…`) or the class role, and record the choice in `UNRESOLVED_QUESTIONS.md`.

## 5. Coverage stats (verified)

| Metric | Value |
|---|---|
| Classes in jar | 2,507 (2,474 obf + 33 un-obfuscated `net/minecraft/**`) |
| Classes decompiled | 2,507 / 2,507 (100 %) |
| Classes MCP-named | 2,507 / 2,507 (100 %) |
| SRG class entries | 2,541 (includes `net/minecraft/**` + `arg`? extras) |
| SRG field entries | 8,917 |
| SRG method entries | 16,426 |
| Java bytecode level | major 50 (Java 6) for all classes |

## 6. Inner & synthetic classes

888 inner classes (`Outer$N`, `Outer$1`) — anonymous/synthetic helpers around
obf classes. They are catalogued with their outer's name (`class_catalog.json`);
no separate naming needed beyond `OuterInner`/`Outer::Anonymous` in Rust.

## 7. Un-obfuscated packages (shipped readable in the jar)

`net/minecraft/client/ClientBrandRetriever`,
`net/minecraft/client/main/Main{,$1,$2}`, `net/minecraft/realms/*` (13 classes),
`net/minecraft/server/MinecraftServer{,$1,$2,$3,$4,$5,$6}`-family, and the
`adv`? no — the full 33-class list is in `class_catalog.json` with `mcp == obf path`.
These need no name recovery; behavior analysis still applies.
