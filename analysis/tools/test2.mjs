import fs from "fs";
import path from "path";
import { createRequire } from "module";
const require = createRequire(import.meta.url);
const { decompile } = require("./node_modules/@run-slicer/cfr/cfr.js");
const ROOT = "/home/user/Starling-extra/analysis/extract";
const t0 = Date.now();
const res = await decompile("net/minecraft/client/main/Main", {
  source: async (name) => {
    const p = path.join(ROOT, name + ".class");
    return fs.existsSync(p) ? fs.readFileSync(p) : null;
  },
  options: {},
});
fs.writeFileSync("/tmp/Main.java", res["net/minecraft/client/main/Main"]);
console.log("done in", (Date.now()-t0)/1000, "s; lines:", res["net/minecraft/client/main/Main"].split("\n").length);
