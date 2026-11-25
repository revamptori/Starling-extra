import fs from "fs";
import path from "path";
import { createRequire } from "module";
const require = createRequire(import.meta.url);
const { decompile } = require("./node_modules/@run-slicer/cfr/cfr.js");

const ROOT = "/home/user/Starling-extra/analysis/extract";
const data = fs.readFileSync(path.join(ROOT, "ave.class"));
const out = await decompile("ave", {
  source: async (name) => {
    const p = path.join(ROOT, name + ".class");
    return fs.existsSync(p) ? fs.readFileSync(p) : null;
  },
  options: { comments: "false" },
});
console.log(out["ave"].slice(0, 3000));
