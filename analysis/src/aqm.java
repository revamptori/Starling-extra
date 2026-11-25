/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aqm
extends aqq {
    private static final List<ady> d = Arrays.asList((Object[])new ady[]{ady.r, ady.G, ady.K, ady.L, ady.v});
    private List<ady.c> f = Lists.newArrayList();
    private int g = 32;
    private int h = 8;

    public aqm() {
        this.f.add((Object)new ady.c(wd.class, 1, 1, 1));
    }

    public aqm(Map<String, String> map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals((Object)"distance")) continue;
            this.g = ns.a((String)entry.getValue(), this.g, this.h + 1);
        }
    }

    @Override
    public String a() {
        return "Temple";
    }

    @Override
    protected boolean a(int \u260322, int n) {
        int n2;
        \u2603 = \u260322;
        n2 = n;
        if (\u260322 < 0) {
            \u260322 -= this.g - 1;
        }
        if (n < 0) {
            n -= this.g - 1;
        }
        \u2603 = \u260322 / this.g;
        \u2603 = n / this.g;
        Random random = this.c.a(\u2603, \u2603, 14357617);
        \u2603 *= this.g;
        \u2603 *= this.g;
        int \u260322 = \u2603;
        n = n2;
        if (\u260322 == (\u2603 += random.nextInt(this.g - this.h)) && n == (\u2603 += random.nextInt(this.g - this.h))) {
            ady ady2 = this.c.v().a(new cj(\u260322 * 16 + 8, 0, n * 16 + 8));
            if (ady2 == null) {
                return false;
            }
            for (ady ady3 : d) {
                if (ady2 != ady3) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected aqu b(int n, int n2) {
        return new a(this.c, this.b, n, n2);
    }

    public boolean a(cj cj2) {
        aqu aqu2 = this.c(cj2);
        if (aqu2 == null || !(aqu2 instanceof a) || aqu2.a.isEmpty()) {
            return false;
        }
        aqt \u26032 = (aqt)aqu2.a.getFirst();
        return \u26032 instanceof aqn.d;
    }

    public List<ady.c> b() {
        return this.f;
    }

    public static class a
    extends aqu {
        public a() {
        }

        public a(adm adm2, Random random, int n, int n2) {
            super(n, n2);
            ady ady2 = adm2.b(new cj(n * 16 + 8, 0, n2 * 16 + 8));
            if (ady2 == ady.K || ady2 == ady.L) {
                aqn.b b2 = new aqn.b(random, n * 16, n2 * 16);
                this.a.add((Object)b2);
            } else if (ady2 == ady.v) {
                aqn.d d2 = new aqn.d(random, n * 16, n2 * 16);
                this.a.add((Object)d2);
            } else if (ady2 == ady.r || ady2 == ady.G) {
                aqn.a a2 = new aqn.a(random, n * 16, n2 * 16);
                this.a.add((Object)a2);
            }
            this.c();
        }
    }
}
