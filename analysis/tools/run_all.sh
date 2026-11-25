#!/bin/bash
cd /home/user/Starling-extra/analysis/tools
mkdir -p /home/user/Starling-extra/analysis/src /home/user/Starling-extra/analysis/logs
for i in 0 1 2 3 4 5 6 7; do
  node decompile_worker.mjs shard_0$i /home/user/Starling-extra/analysis/src > /home/user/Starling-extra/analysis/logs/worker_$i.log 2>&1 &
done
wait
echo ALL_WORKERS_DONE
