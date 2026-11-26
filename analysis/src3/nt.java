/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Comparable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nt {
    private static final Logger b = LogManager.getLogger();
    private final List<String> c = Lists.newArrayList();
    private final List<Long> d = Lists.newArrayList();
    public boolean a;
    private String e = "";
    private final Map<String, Long> f = Maps.newHashMap();

    public void a() {
        this.f.clear();
        this.e = "";
        this.c.clear();
    }

    public void a(String string) {
        if (!this.a) {
            return;
        }
        if (this.e.length() > 0) {
            this.e = this.e + ".";
        }
        this.e = this.e + string;
        this.c.add((Object)this.e);
        this.d.add((Object)System.nanoTime());
    }

    public void b() {
        if (!this.a) {
            return;
        }
        long l = System.nanoTime();
        \u2603 = (Long)this.d.remove(this.d.size() - 1);
        this.c.remove(this.c.size() - 1);
        \u2603 = l - \u2603;
        if (this.f.containsKey((Object)this.e)) {
            this.f.put((Object)this.e, (Object)((Long)this.f.get((Object)this.e) + \u2603));
        } else {
            this.f.put((Object)this.e, (Object)\u2603);
        }
        if (\u2603 > 100000000L) {
            b.warn("Something's taking too long! '" + this.e + "' took aprox " + (double)\u2603 / 1000000.0 + " ms");
        }
        this.e = !this.c.isEmpty() ? (String)this.c.get(this.c.size() - 1) : "";
    }

    public List<a> b(String string2) {
        if (!this.a) {
            return null;
        }
        \u2603 = string2;
        long l = this.f.containsKey((Object)"root") ? (Long)this.f.get((Object)"root") : 0L;
        \u2603 = this.f.containsKey((Object)string2) ? (Long)this.f.get((Object)string2) : -1L;
        ArrayList \u26032 = Lists.newArrayList();
        if (string2.length() > 0) {
            String string2 = string2 + ".";
        }
        long l2 = 0L;
        for (String string3 : this.f.keySet()) {
            if (string3.length() <= string2.length() || !string3.startsWith(string2) || string3.indexOf(".", string2.length() + 1) >= 0) continue;
            l2 += ((Long)this.f.get((Object)string3)).longValue();
        }
        float \u26033 = l2;
        if (l2 < \u2603) {
            l2 = \u2603;
        }
        if (l < l2) {
            l = l2;
        }
        for (String string4 : this.f.keySet()) {
            if (string4.length() <= string2.length() || !string4.startsWith(string2) || string4.indexOf(".", string2.length() + 1) >= 0) continue;
            long l3 = (Long)this.f.get((Object)string4);
            double \u26034 = (double)l3 * 100.0 / (double)l2;
            double \u26035 = (double)l3 * 100.0 / (double)l;
            String \u26036 = string4.substring(string2.length());
            \u26032.add((Object)new a(\u26036, \u26034, \u26035));
        }
        for (String string4 : this.f.keySet()) {
            this.f.put((Object)string4, (Object)((Long)this.f.get((Object)string4) * 999L / 1000L));
        }
        if ((float)l2 > \u26033) {
            \u26032.add((Object)new a("unspecified", (double)((float)l2 - \u26033) * 100.0 / (double)l2, (double)((float)l2 - \u26033) * 100.0 / (double)l));
        }
        Collections.sort((List)\u26032);
        \u26032.add(0, (Object)new a(\u2603, 100.0, (double)l2 * 100.0 / (double)l));
        return \u26032;
    }

    public void c(String string) {
        this.b();
        this.a(string);
    }

    public String c() {
        return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
    }

    public static final class a
    implements Comparable<a> {
        public double a;
        public double b;
        public String c;

        public a(String string, double d, double d2) {
            this.c = string;
            this.a = d;
            this.b = d2;
        }

        public int a(a a2) {
            if (a2.a < this.a) {
                return -1;
            }
            if (a2.a > this.a) {
                return 1;
            }
            return a2.c.compareTo(this.c);
        }

        public int a() {
            return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
        }

        public /* synthetic */ int compareTo(Object object) {
            return this.a((a)object);
        }
    }
}
