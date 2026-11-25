#!/usr/bin/env python3
"""Extract packet field structures from decompiled packet sources (mapping-aware v2).

Builds an obf-callname -> wire-type table for PacketBuffer (owner `em`) from
mappings.json, then parses each packet's readPacketData body (a(Lem;)V) for
field assignments in wire order. Writes tools/packet_fields.json.
"""
import json, re
from pathlib import Path

A = Path("/home/user/Starling-extra/analysis")
SRC = A / "src"
maps = json.load(open(A / "mappings.json"))
fmap, mmap = maps["fields"], maps["methods"]
registry = json.load(open(A / "tools/packet_registry_from_jar.json"))

TYPE_BY_MCP = {
    "readVarIntFromBuffer": "VarInt",
    "readStringFromBuffer": "String",
    "readBoolean": "boolean",
    "readByte": "byte",
    "readUnsignedByte": "ubyte",
    "readShort": "short",
    "readUnsignedShort": "ushort",
    "readInt": "int",
    "readLong": "long",
    "readFloat": "float",
    "readDouble": "double",
    "readByteArray": "byte[]",
    "readLongArray": "long[]",
    "readUUID": "UUID",
    "readUuid": "UUID",
    "readVarLong": "VarLong",
    "readBlockPos": "BlockPos",
    "readChatComponent": "IChatComponent(JSON)",
    "readItemStackFromBuffer": "ItemStack",
    "readNBTTagCompoundFromBuffer": "NBT",
    "readBytes": "bytes",
    "readChar": "char",
}

# obf call name -> canonical wire type name (PacketBuffer `em` methods)
call2type = {}
for key, e in mmap.items():
    if key.startswith("em."):
        m = re.match(r'em\.(\w+)(\(.*\))', key)
        if m and e["mcp"] in TYPE_BY_MCP:
            call2type[(m.group(1), m.group(2))] = (e["mcp"], TYPE_BY_MCP[e["mcp"]])
# un-obfuscated Netty ByteBuf names already appear literally in source
netty = {"readBoolean":"boolean","readByte":"byte","readUnsignedByte":"ubyte",
         "readShort":"short","readUnsignedShort":"ushort","readInt":"int",
         "readLong":"long","readFloat":"float","readDouble":"double",
         "readChar":"char"}

def find_method(src, sig_re):
    m = re.search(sig_re, src)
    if not m: return None
    j = src.find("{", m.start())
    depth = 0; k = j
    while k < len(src):
        if src[k] == "{": depth += 1
        elif src[k] == "}":
            depth -= 1
            if depth == 0: break
        k += 1
    return src[j:k+1]

def desc_argc(desc):
    m = re.match(r'\((.*)\)', desc)
    inner = m.group(1) if m else ''
    n = 0
    i = 0
    while i < len(inner):
        if inner[i] == '[': i += 1; continue
        if inner[i] == 'L':
            i = inner.index(';', i) + 1; n += 1; continue
        i += 1; n += 1
    return n

def resolve_call(name, args):
    argc = 0 if not args.strip() else len(args.split(','))
    for (oname, odesc), (mcp, typ) in call2type.items():
        if oname == name and desc_argc(odesc) == argc:
            if typ == "String" and args:
                return f"String(max={args})"
            if typ == "byte[]" and args:
                return f"byte[len={args}]"
            if typ == "bytes" and args:
                return f"bytes({args})"
            return typ
    if name in netty:
        return netty[name]
    return None

def parse_reads(body, owner_obf):
    if body is None: return []
    out = []
    for line in body.splitlines():
        line = line.strip()
        m = re.match(r'this\.(\w+)\s*=\s*(.+);', line)
        if not m: continue
        field, expr = m.group(1), m.group(2)
        wire = None
        for cm in re.finditer(r'\.(\w+)\s*\(([^()]*)\)', expr):
            wire = resolve_call(cm.group(1), cm.group(2))
            if wire: break
        fkey = f"{owner_obf.replace('$','.')}.{field}"
        finfo = fmap.get(fkey) or fmap.get(f"{owner_obf}.{field}")
        out.append({"obf": field,
                    "mcp": finfo["mcp"] if finfo else "?",
                    "type": wire or f"??({expr[:70]})"})
    return out

result = {}
missing_src = []
for state, dirs in registry.items():
    result[state] = {}
    for direction, pkts in dirs.items():
        result[state][direction] = {}
        for pid, info in pkts.items():
            obf_dollar = info["obf"].replace(".", "$")
            src_path = SRC / (obf_dollar + ".java")
            if not src_path.exists():
                missing_src.append(info["obf"]); continue
            src = src_path.read_text(errors="replace")
            body = find_method(src, r'public void a\(em \w+\)') or find_method(src, r'void a\(em \w+\)')
            reads = parse_reads(body, obf_dollar)
            result[state][direction][pid] = {"obf": info["obf"], "mcp": info["mcp"], "fields": reads}

json.dump(result, open(A / "tools/packet_fields.json", "w"), indent=1)
n = sum(len(v2) for s in result.values() for v2 in s.values())
unk = 0
for s in result.values():
    for v2 in s.values():
        for p in v2.values():
            for f in p["fields"]:
                if f["type"].startswith("??"): unk += 1
print("packets analyzed:", n, "missing src:", len(missing_src), "unresolved field types:", unk)
for m in missing_src[:40]: print("  missing:", m)
