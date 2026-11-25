#!/usr/bin/env python3
"""Build MCP mapping tables for 1.8.9 from MCP-919 conf data (joined.srg + CSVs).

joined.srg line formats:
  PK: <obf_pkg> <deobf_pkg>
  CL: <obf_class> <deobf_class>
  FD: <obf_owner>/<obf_name> <deobf_owner>/<srg_name>
  MD: <obf_owner>/<obf_name> <obf_desc> <deobf_owner>/<srg_name> <deobf_desc>
CSVs: searge,name,side,desc  (srg -> MCP name)
"""
import json, csv
from pathlib import Path

CONF = Path("/home/user/Starling-extra/analysis/MCP-919-main/conf")
OUT = Path("/home/user/Starling-extra/analysis/mappings.json")

f_srg2mcp = {}
with open(CONF / "fields.csv", newline="") as f:
    for row in csv.DictReader(f):
        f_srg2mcp[row["searge"]] = row["name"]
m_srg2mcp = {}
with open(CONF / "methods.csv", newline="") as f:
    for row in csv.DictReader(f):
        m_srg2mcp[row["searge"]] = row["name"]

classes = {}
fields = {}
methods = {}
for line in (CONF / "joined.srg").read_text().splitlines():
    parts = line.split(" ")
    if line.startswith("PK:"):
        pass
    elif line.startswith("CL:"):
        classes[parts[1]] = parts[2]
    elif line.startswith("FD:"):
        obf_owner, obf_name = parts[1].rsplit("/", 1)
        deobf_owner, srg_name = parts[2].rsplit("/", 1)
        fields[f"{obf_owner}.{obf_name}"] = {
            "srg": srg_name,
            "mcp": f_srg2mcp.get(srg_name, srg_name),
            "deobf_owner": deobf_owner,
        }
    elif line.startswith("MD:"):
        obf_owner, obf_name = parts[1].rsplit("/", 1)
        obf_desc = parts[2]
        deobf_owner, srg_name = parts[3].rsplit("/", 1)
        methods[f"{obf_owner}.{obf_name}{obf_desc}"] = {
            "srg": srg_name,
            "mcp": m_srg2mcp.get(srg_name, srg_name),
            "desc": obf_desc,
            "deobf_owner": deobf_owner,
        }

OUT.write_text(json.dumps({"classes": classes, "fields": fields, "methods": methods}))
print("classes:", len(classes), "fields:", len(fields), "methods:", len(methods))
