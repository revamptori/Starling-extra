#!/usr/bin/env python3
"""Parse all class files in analysis/extract into a JSON index with hierarchy info."""
import os, json, struct, sys
from pathlib import Path

EXTRACT = Path("/home/user/Starling-extra/analysis/extract")

# --- minimal class file parser ---
class Reader:
    def __init__(self, data):
        self.d = data
        self.p = 0
    def u1(self):
        v = self.d[self.p]; self.p += 1; return v
    def u2(self):
        v = struct.unpack_from(">H", self.d, self.p)[0]; self.p += 2; return v
    def u4(self):
        v = struct.unpack_from(">I", self.d, self.p)[0]; self.p += 4; return v
    def bytes(self, n):
        v = self.d[self.p:self.p+n]; self.p += n; return v

def parse_class(data):
    r = Reader(data)
    magic = r.u4()
    assert magic == 0xCAFEBABE, "bad magic"
    minor, major = r.u2(), r.u2()
    cp_count = r.u2()
    cp = [None] * cp_count
    i = 1
    while i < cp_count:
        tag = r.u1()
        if tag == 1:  # Utf8
            ln = r.u2(); cp[i] = ("utf8", r.bytes(ln).decode("utf-8", "replace"))
        elif tag in (7, 8, 16, 19, 20):  # Class, String, MethodType, Module, Package
            cp[i] = (tag, r.u2())
        elif tag in (3, 4):  # Integer, Float
            cp[i] = (tag, r.u4())
        elif tag in (5, 6):  # Long, Double (takes two slots)
            hi, lo = r.u4(), r.u4(); cp[i] = (tag, (hi, lo)); i += 1
        elif tag in (9, 10, 11, 12, 18):  # Fieldref, Methodref, InterfaceMethodref, NameAndType, InvokeDynamic
            cp[i] = (tag, r.u2(), r.u2())
        elif tag == 15:  # MethodHandle
            cp[i] = (tag, r.u1(), r.u2())
        else:
            raise ValueError(f"unknown cp tag {tag}")
        i += 1

    def utf8(idx):
        e = cp[idx]
        return e[1] if e and e[0] == "utf8" else ""
    def cls(idx):
        if idx == 0: return None
        e = cp[idx]
        return utf8(e[1]) if e and e[0] == 7 else None

    access = r.u2()
    this = cls(r.u2())
    super_ = cls(r.u2())
    ifc_count = r.u2()
    ifaces = [cls(r.u2()) for _ in range(ifc_count)]

    def parse_members():
        n = r.u2()
        out = []
        for _ in range(n):
            acc = r.u2(); name = utf8(r.u2()); desc = utf8(r.u2())
            attr_n = r.u2()
            code_len = 0
            for _ in range(attr_n):
                an = utf8(r.u2()); al = r.u4()
                if an == "Code":
                    # skip max_stack, max_locals; get code length
                    p0 = r.p
                    r.u2(); r.u2()
                    code_len = r.u4()
                    r.p = p0 + al
                else:
                    r.bytes(al)
            out.append({"name": name, "desc": desc, "acc": acc, "code_len": code_len})
        return out

    fields = parse_members()
    methods = parse_members()
    src = None
    attr_n = r.u2()
    for _ in range(attr_n):
        an = utf8(r.u2()); al = r.u4()
        if an == "SourceFile":
            src = utf8(r.u2())
        else:
            r.bytes(al)
    return {
        "name": this, "super": super_, "ifaces": ifaces,
        "acc": access, "major": major, "minor": minor,
        "fields": fields, "methods": methods, "source": src,
    }

def main():
    index = {}
    errors = []
    for p in sorted(EXTRACT.rglob("*.class")):
        rel = str(p.relative_to(EXTRACT))
        key = rel[:-6]  # strip .class
        try:
            info = parse_class(p.read_bytes())
            index[key] = info
        except Exception as e:
            errors.append((key, str(e)))
    out = Path("/home/user/Starling-extra/analysis/class_index.json")
    out.write_text(json.dumps(index))
    print(f"parsed {len(index)} classes, {len(errors)} errors")
    for k, e in errors[:20]:
        print("ERR", k, e)

if __name__ == "__main__":
    main()
