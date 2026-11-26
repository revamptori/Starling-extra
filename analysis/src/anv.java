/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class anv
implements amv {
    private adm a;
    private Random b;
    private final alz[] c = new alz[256];
    private final apz d;
    private final List<aqq> e = Lists.newArrayList();
    private final boolean f;
    private final boolean g;
    private apc h;
    private apc i;

    public anv(adm adm2, long l, boolean bl, String string) {
        this.a = adm2;
        this.b = new Random(l);
        this.d = apz.a(string);
        if (bl) {
            Map<String, Map<String, String>> map = this.d.b();
            if (map.containsKey((Object)"village")) {
                Map map2 = (Map)map.get((Object)"village");
                if (!map2.containsKey((Object)"size")) {
                    map2.put((Object)"size", (Object)"1");
                }
                this.e.add((Object)new aqv((Map<String, String>)map2));
            }
            if (map.containsKey((Object)"biome_1")) {
                this.e.add((Object)new aqm((Map<String, String>)((Map)map.get((Object)"biome_1"))));
            }
            if (map.containsKey((Object)"mineshaft")) {
                this.e.add((Object)new aqf((Map<String, String>)((Map)map.get((Object)"mineshaft"))));
            }
            if (map.containsKey((Object)"stronghold")) {
                this.e.add((Object)new aqo((Map<String, String>)((Map)map.get((Object)"stronghold"))));
            }
            if (map.containsKey((Object)"oceanmonument")) {
                this.e.add((Object)new aqk((Map<String, String>)((Map)map.get((Object)"oceanmonument"))));
            }
        }
        if (this.d.b().containsKey((Object)"lake")) {
            this.h = new apc(afi.j);
        }
        if (this.d.b().containsKey((Object)"lava_lake")) {
            this.i = new apc(afi.l);
        }
        this.g = this.d.b().containsKey((Object)"dungeon");
        int n = 0;
        \u26033 = 0;
        boolean \u26032 = true;
        for (aqa aqa22 : this.d.c()) {
            aqa aqa22;
            for (int i = aqa22.d(); i < aqa22.d() + aqa22.b(); ++i) {
                alz alz2 = aqa22.c();
                if (alz2.c() == afi.a) continue;
                \u26032 = false;
                this.c[i] = alz2;
            }
            if (aqa22.c().c() == afi.a) {
                \u26033 += aqa22.b();
                continue;
            }
            n += aqa22.b() + \u26033;
            int \u26033 = 0;
        }
        adm2.b(n);
        this.f = \u26032 ? false : this.d.b().containsKey((Object)"decoration");
    }

    @Override
    public amy d(int n, int n2) {
        Object \u260332;
        ans ans2 = new ans();
        for (int i = 0; i < this.c.length; ++i) {
            \u260332 = this.c[i];
            if (\u260332 == null) continue;
            for (int j = 0; j < 16; ++j) {
                for (i = 0; i < 16; ++i) {
                    ans2.a(j, i, i, (alz)\u260332);
                }
            }
        }
        for (Object \u260332 : this.e) {
            \u260332.a(this, this.a, n, n2, ans2);
        }
        amy \u26032 = new amy(this.a, ans2, n, n2);
        \u260332 = this.a.v().b(null, n * 16, n2 * 16, 16, 16);
        byte[] \u26034 = \u26032.k();
        for (int i = 0; i < \u26034.length; ++i) {
            \u26034[i] = (byte)\u260332[i].az;
        }
        \u26032.b();
        return \u26032;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public void a(amv amv2, int n, int n2) {
        \u2603 = n * 16;
        \u2603 = n2 * 16;
        cj cj2 = new cj(\u2603, 0, \u2603);
        ady \u26032 = this.a.b(new cj(\u2603 + 16, 0, \u2603 + 16));
        boolean \u26033 = false;
        this.b.setSeed(this.a.J());
        long \u26034 = this.b.nextLong() / 2L * 2L + 1L;
        long \u26035 = this.b.nextLong() / 2L * 2L + 1L;
        this.b.setSeed((long)n * \u26034 + (long)n2 * \u26035 ^ this.a.J());
        adg \u26036 = new adg(n, n2);
        Object \u26037 = this.e.iterator();
        while (\u26037.hasNext()) {
            aqq aqq2 = (aqq)\u26037.next();
            boolean \u26038 = aqq2.a(this.a, this.b, \u26036);
            if (!(aqq2 instanceof aqv)) continue;
            \u26033 |= \u26038;
        }
        if (this.h != null && !\u26033 && this.b.nextInt(4) == 0) {
            this.h.b(this.a, this.b, cj2.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
        }
        if (!(this.i == null || \u26033 || this.b.nextInt(8) != 0 || ((df)(\u26037 = cj2.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8))).o() >= this.a.F() && this.b.nextInt(10) != 0)) {
            this.i.b(this.a, this.b, (cj)\u26037);
        }
        if (this.g) {
            for (int i = 0; i < 8; ++i) {
                new api().b(this.a, this.b, cj2.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
            }
        }
        if (this.f) {
            \u26032.a(this.a, this.b, cj2);
        }
    }

    @Override
    public boolean a(amv amv2, amy amy2, int n, int n2) {
        return false;
    }

    @Override
    public boolean a(boolean bl, nu nu2) {
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public String f() {
        return "FlatLevelSource";
    }

    @Override
    public List<ady.c> a(pt pt2, cj cj2) {
        ady ady2 = this.a.b(cj2);
        return ady2.a(pt2);
    }

    @Override
    public cj a(adm adm2, String string, cj cj2) {
        if ("Stronghold".equals((Object)string)) {
            for (aqq aqq2 : this.e) {
                if (!(aqq2 instanceof aqo)) continue;
                return aqq2.b(adm2, cj2);
            }
        }
        return null;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void a(amy amy2, int n, int n2) {
        for (aqq aqq2 : this.e) {
            aqq2.a(this, this.a, n, n2, null);
        }
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }
}
