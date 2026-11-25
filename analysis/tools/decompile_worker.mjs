// Batch decompiler worker: decompiles a list of obfuscated class names using the CFR JS port.
// Usage: node decompile_worker.mjs <classlist-file> <src-out-dir>
import fs from "fs";
import path from "path";
import { createRequire } from "module";
const require = createRequire(import.meta.url);
const { decompile } = require("./node_modules/@run-slicer/cfr/cfr.js");

const ROOT = "/home/user/Starling-extra/analysis/extract";
const listFile = process.argv[2];
const outDir = process.argv[3];
const names = fs.readFileSync(listFile, "utf8").split("\n").map(s => s.trim()).filter(Boolean);
const log = (m) => process.stderr.write(m + "\n");

for (const name of names) {
  const outPath = path.join(outDir, name + ".java");
  if (fs.existsSync(outPath) && fs.statSync(outPath).size > 0) continue;
  try {
    const t0 = Date.now();
    const res = await decompile(name, {
      source: async (n) => {
        const p = path.join(ROOT, n + ".class");
        return fs.existsSync(p) ? fs.readFileSync(p) : null;
      },
      options: {},
    });
    let src = res[name];
    if (typeof src !== "string") {
      // fall back to first value
      const vals = Object.values(res);
      src = vals.find(v => typeof v === "string") || "";
    }
    fs.mkdirSync(path.dirname(outPath), { recursive: true });
    fs.writeFileSync(outPath, src);
    log(`OK ${name} ${((Date.now()-t0)/1000).toFixed(1)}s ${src.split("\n").length}L`);
  } catch (e) {
    log(`FAIL ${name}: ${e && e.message ? e.message : e}`);
    try { fs.writeFileSync(outPath, "// DECOMPILE FAILED: " + e + "\n"); } catch {}
  }
}
log("WORKER DONE");
