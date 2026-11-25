#!/bin/bash
cd /home/user/Starling-extra/analysis/tools
for s in rest_a rest_b; do
  node --max-old-space-size=1024 decompile_worker.mjs $s.txt /home/user/Starling-extra/analysis/src >> /home/user/Starling-extra/analysis/logs/worker_$s.log 2>&1 &
done
wait
echo REST_DONE
