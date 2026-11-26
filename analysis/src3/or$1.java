/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.TimerTask
 */
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;

class or.1
extends TimerTask {
    or.1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        HashMap hashMap;
        if (!or.this.e.ad()) {
            return;
        }
        Object object = or.this.g;
        synchronized (object) {
            hashMap = Maps.newHashMap((Map)or.this.b);
            if (or.this.j == 0) {
                hashMap.putAll(or.this.a);
            }
            hashMap.put((Object)"snooper_count", (Object)or.this.j++);
            hashMap.put((Object)"snooper_token", (Object)or.this.c);
        }
        nj.a(or.this.d, (Map<String, Object>)hashMap, true);
    }
}
