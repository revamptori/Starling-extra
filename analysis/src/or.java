/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.management.ManagementFactory
 *  java.lang.management.RuntimeMXBean
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.UUID
 */
import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class or {
    private final Map<String, Object> a = Maps.newHashMap();
    private final Map<String, Object> b = Maps.newHashMap();
    private final String c = UUID.randomUUID().toString();
    private final URL d;
    private final os e;
    private final Timer f = new Timer("Snooper Timer", true);
    private final Object g = new Object();
    private final long h;
    private boolean i;
    private int j;

    public or(String string, os os2, long l) {
        try {
            this.d = new URL("http://snoop.minecraft.net/" + string + "?version=" + 2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.e = os2;
        this.h = l;
    }

    public void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h();
        this.f.schedule(new TimerTask(){

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
        }, 0L, 900000L);
    }

    private void h() {
        this.i();
        this.a("snooper_token", this.c);
        this.b("snooper_token", this.c);
        this.b("os_name", System.getProperty((String)"os.name"));
        this.b("os_version", System.getProperty((String)"os.version"));
        this.b("os_architecture", System.getProperty((String)"os.arch"));
        this.b("java_version", System.getProperty((String)"java.version"));
        this.a("version", "1.8.9");
        this.e.b(this);
    }

    private void i() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List \u26032 = runtimeMXBean.getInputArguments();
        int \u26033 = 0;
        for (String string : \u26032) {
            if (!string.startsWith("-X")) continue;
            this.a("jvm_arg[" + \u26033++ + "]", string);
        }
        this.a("jvm_args", \u26033);
    }

    public void b() {
        this.b("memory_total", Runtime.getRuntime().totalMemory());
        this.b("memory_max", Runtime.getRuntime().maxMemory());
        this.b("memory_free", Runtime.getRuntime().freeMemory());
        this.b("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.e.a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, Object object) {
        Object object2 = this.g;
        synchronized (object2) {
            this.b.put((Object)string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(String string, Object object) {
        Object object2 = this.g;
        synchronized (object2) {
            this.a.put((Object)string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map<String, String> c() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Object object = this.g;
        synchronized (object) {
            this.b();
            for (Map.Entry entry : this.a.entrySet()) {
                linkedHashMap.put(entry.getKey(), (Object)entry.getValue().toString());
            }
            for (Map.Entry entry : this.b.entrySet()) {
                linkedHashMap.put(entry.getKey(), (Object)entry.getValue().toString());
            }
        }
        return linkedHashMap;
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        this.f.cancel();
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.h;
    }
}
