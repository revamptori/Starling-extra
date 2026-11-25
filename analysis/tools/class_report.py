#!/usr/bin/env python3
"""Print a full member listing for one or more classes with MCP-resolved names.

Usage: python3 class_report.py <obf_or_mcp_name> [...]
"""
import json, sys, re
from pathlib import Path

A = Path("/home/user/Starling-extra/analysis")
idx = json.load(open(A / "class_index.json"))
maps = json.load(open(A / "mappings.json"))
cls_map, fld_map, mth_map = maps["classes"], maps["fields"], maps["methods"]

def mcp_cls(name):
    return cls_map.get(name, name)

def reverse_lookup_mcp(name):
    """Allow input as MCP name; return obf."""
    if name in idx:
        return name
    for obf, m in cls_map.items():
        if m == name or m.rsplit("/", 1)[-1] == name:
            return obf
    return None

def describe(desc):
    # human-friendly descriptor
    def conv(d):
        prim = {"I": "int", "J": "long", "F": "float", "D": "double", "Z": "boolean",
                "B": "byte", "C": "char", "S": "short", "V": "void"}
        out = ""
        while d:
            c = d[0]
            if c == "[":
                out += "[]"; d = d[1:]
                continue
            if c == "L":
                end = d.index(";")
                out = mcp_cls(d[1:end]).rsplit("/", 1)[-1] + out
                d = d[end + 1:]
                continue
            out = prim.get(c, c) + out
            d = d[1:]
        return out
    m = re.match(r"\((.*)\)(.*)", desc)
    if not m: return desc
    params, ret = m.group(1), m.group(2)
    ps = []
    i = 0
    while i < len(params):
        start = i
        while params[i] == "[": i += 1
        if params[i] == "L":
            i = params.index(";", i) + 1
        else:
            i += 1
        ps.append(conv(params[start:i]))
    return f"({', '.join(ps)}) -> {conv(ret)}"

ACC = {0x1:"public",0x2:"private",0x4:"protected",0x8:"static",0x10:"final",
       0x20:"synchronized/super",0x40:"volatile/bridge",0x80:"transient/varargs",
       0x100:"native",0x400:"abstract",0x1000:"synthetic",0x4000:"enum"}

def flags(a):
    return " ".join(v for k, v in sorted(ACC.items()) if a & k)

def report(name):
    obf = reverse_lookup_mcp(name)
    if not obf or obf not in idx:
        print(f"!! not found: {name}")
        return
    info = idx[obf]
    print(f"=== {obf}  (MCP: {mcp_cls(obf)}) ===")
    print(f"    super: {info['super']}  (MCP: {mcp_cls(info['super']) if info['super'] else '-'})")
    if info["ifaces"]:
        print(f"    ifaces: [{', '.join(mcp_cls(i) for i in info['ifaces'])}]")
    print(f"    access: {flags(info['acc'])}  major: {info['major']}  source: {info.get('source')}")
    print(f"    fields ({len(info['fields'])}):")
    for f in info["fields"]:
        key = f"{obf}.{f['name']}"
        m = fld_map.get(key)
        mcp = m["mcp"] if m else "?"
        srg = m["srg"] if m else "?"
        print(f"      {flags(f['acc']):30s} {f['name']:12s} -> {mcp:28s} [{srg}]  {describe(f['desc'])}")
    print(f"    methods ({len(info['methods'])}):")
    for m_ in info["methods"]:
        key = f"{obf}.{m_['name']}{m_['desc']}"
        m = mth_map.get(key)
        mcp = m["mcp"] if m else "?"
        srg = m["srg"] if m else "?"
        print(f"      {flags(m_['acc']):30s} {m_['name']:8s} -> {mcp:32s} [{srg}]  {describe(m_['desc'])}  (code {m_['code_len']}B)")

if __name__ == "__main__":
    for a in sys.argv[1:]:
        report(a)
        print()
