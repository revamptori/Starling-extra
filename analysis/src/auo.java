/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class auo {
    private final Map<String, auk> a = Maps.newHashMap();
    private final Map<auu, List<auk>> b = Maps.newHashMap();
    private final Map<String, Map<auk, aum>> c = Maps.newHashMap();
    private final auk[] d = new auk[19];
    private final Map<String, aul> e = Maps.newHashMap();
    private final Map<String, aul> f = Maps.newHashMap();
    private static String[] g = null;

    public auk b(String string) {
        return (auk)this.a.get((Object)string);
    }

    public auk a(String string, auu auu2) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        auk auk2 = this.b(string);
        if (auk2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        auk2 = new auk(this, string, auu2);
        List \u26032 = (List)this.b.get((Object)auu2);
        if (\u26032 == null) {
            \u26032 = Lists.newArrayList();
            this.b.put((Object)auu2, (Object)\u26032);
        }
        \u26032.add((Object)auk2);
        this.a.put((Object)string, (Object)auk2);
        this.a(auk2);
        return auk2;
    }

    public Collection<auk> a(auu auu2) {
        Collection collection = (Collection)this.b.get((Object)auu2);
        return collection == null ? Lists.newArrayList() : Lists.newArrayList((Iterable)collection);
    }

    public boolean b(String string, auk auk2) {
        Map map = (Map)this.c.get((Object)string);
        if (map == null) {
            return false;
        }
        aum \u26032 = (aum)map.get((Object)auk2);
        return \u26032 != null;
    }

    public aum c(String string, auk auk2) {
        aum aum2;
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        Map map = (Map)this.c.get((Object)string);
        if (map == null) {
            map = Maps.newHashMap();
            this.c.put((Object)string, (Object)map);
        }
        if ((aum2 = (aum)map.get((Object)auk2)) == null) {
            aum2 = new aum(this, auk2, string);
            map.put((Object)auk2, (Object)aum2);
        }
        return aum2;
    }

    public Collection<aum> i(auk auk2) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map map : this.c.values()) {
            aum aum2 = (aum)map.get((Object)auk2);
            if (aum2 == null) continue;
            arrayList.add((Object)aum2);
        }
        Collections.sort((List)arrayList, aum.a);
        return arrayList;
    }

    public Collection<auk> c() {
        return this.a.values();
    }

    public Collection<String> d() {
        return this.c.keySet();
    }

    public void d(String string2, auk auk2) {
        if (auk2 == null) {
            Map map = (Map)this.c.remove((Object)string2);
            if (map != null) {
                this.a(string2);
            }
        } else {
            String string2;
            Map \u26032 = (Map)this.c.get((Object)string2);
            if (\u26032 != null) {
                aum aum2 = (aum)\u26032.remove((Object)auk2);
                if (\u26032.size() < 1) {
                    Map map = (Map)this.c.remove((Object)string2);
                    if (map != null) {
                        this.a(string2);
                    }
                } else if (aum2 != null) {
                    this.a(string2, auk2);
                }
            }
        }
    }

    public Collection<aum> e() {
        Collection collection = this.c.values();
        ArrayList \u26032 = Lists.newArrayList();
        for (Map map : collection) {
            \u26032.addAll(map.values());
        }
        return \u26032;
    }

    public Map<auk, aum> c(String string) {
        Map map = (Map)this.c.get((Object)string);
        if (map == null) {
            map = Maps.newHashMap();
        }
        return map;
    }

    public void k(auk auk22) {
        auk auk22;
        this.a.remove((Object)auk22.b());
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) != auk22) continue;
            this.a(i, null);
        }
        List \u26032 = (List)this.b.get((Object)auk22.c());
        if (\u26032 != null) {
            \u26032.remove((Object)auk22);
        }
        for (Map map : this.c.values()) {
            map.remove((Object)auk22);
        }
        this.c(auk22);
    }

    public void a(int n, auk auk2) {
        this.d[n] = auk2;
    }

    public auk a(int n) {
        return this.d[n];
    }

    public aul d(String string) {
        return (aul)this.e.get((Object)string);
    }

    public aul e(String string) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        aul aul2 = this.d(string);
        if (aul2 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        aul2 = new aul(this, string);
        this.e.put((Object)string, (Object)aul2);
        this.a(aul2);
        return aul2;
    }

    public void d(aul aul22) {
        aul aul22;
        this.e.remove((Object)aul22.b());
        for (String string : aul22.d()) {
            this.f.remove((Object)string);
        }
        this.c(aul22);
    }

    public boolean a(String string, String string2) {
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (!this.e.containsKey((Object)string2)) {
            return false;
        }
        aul aul2 = this.d(string2);
        if (this.h(string) != null) {
            this.f(string);
        }
        this.f.put((Object)string, (Object)aul2);
        aul2.d().add((Object)string);
        return true;
    }

    public boolean f(String string) {
        aul aul2 = this.h(string);
        if (aul2 != null) {
            this.a(string, aul2);
            return true;
        }
        return false;
    }

    public void a(String string, aul aul2) {
        if (this.h(string) != aul2) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + aul2.b() + "'.");
        }
        this.f.remove((Object)string);
        aul2.d().remove((Object)string);
    }

    public Collection<String> f() {
        return this.e.keySet();
    }

    public Collection<aul> g() {
        return this.e.values();
    }

    public aul h(String string) {
        return (aul)this.f.get((Object)string);
    }

    public void a(auk auk2) {
    }

    public void b(auk auk2) {
    }

    public void c(auk auk2) {
    }

    public void a(aum aum2) {
    }

    public void a(String string) {
    }

    public void a(String string, auk auk2) {
    }

    public void a(aul aul2) {
    }

    public void b(aul aul2) {
    }

    public void c(aul aul2) {
    }

    public static String b(int n) {
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if (n >= 3 && n <= 18 && (\u2603 = a.a(n - 3)) != null && \u2603 != a.v) {
            return "sidebar.team." + \u2603.e();
        }
        return null;
    }

    public static int i(String string) {
        if (string.equalsIgnoreCase("list")) {
            return 0;
        }
        if (string.equalsIgnoreCase("sidebar")) {
            return 1;
        }
        if (string.equalsIgnoreCase("belowName")) {
            return 2;
        }
        if (string.startsWith("sidebar.team.") && (\u2603 = a.b(\u2603 = string.substring("sidebar.team.".length()))) != null && \u2603.b() >= 0) {
            return \u2603.b() + 3;
        }
        return -1;
    }

    public static String[] h() {
        if (g == null) {
            g = new String[19];
            for (int i = 0; i < 19; ++i) {
                auo.g[i] = auo.b(i);
            }
        }
        return g;
    }

    public void a(pk pk2) {
        if (pk2 == null || pk2 instanceof wn || pk2.ai()) {
            return;
        }
        String string = pk2.aK().toString();
        this.d(string, null);
        this.f(string);
    }
}
