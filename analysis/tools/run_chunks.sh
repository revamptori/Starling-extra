#!/bin/bash
# Run decompilation in small chunks with fresh node processes (bounds memory).
cd /home/user/Starling-extra/analysis/tools
python3 - <<'PYEOF'
from pathlib import Path
src = Path('/home/user/Starling-extra/analysis/src')
allc = Path('all_classes.txt').read_text().split()
todo = [c for c in allc if not (src / (c + '.java')).exists() or (src / (c + '.java')).stat().st_size == 0]
CH = 25
chunks = [todo[i:i+CH] for i in range(0, len(todo), CH)]
Path('chunks').mkdir(exist_ok=True)
for f in Path('chunks').glob('chunk_*'): f.unlink()
for i, c in enumerate(chunks):
    Path(f'chunks/chunk_{i:04d}').write_text('\n'.join(c))
print('chunks:', len(chunks), 'classes:', len(todo))
PYEOF
for f in chunks/chunk_*; do
  b=$(basename $f)
  node --max-old-space-size=768 decompile_worker.mjs $f /home/user/Starling-extra/analysis/src >> /home/user/Starling-extra/analysis/logs/chunks_${b}.log 2>&1 &
  # two lanes
  if (( $(jobs -r | wc -l) >= 2 )); then wait -n; fi
done
wait
echo CHUNKS_DONE
