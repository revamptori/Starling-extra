/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class aqk
extends aqq {
    private int f = 32;
    private int g = 5;
    public static final List<ady> d = Arrays.asList((Object[])new ady[]{ady.p, ady.N, ady.w, ady.z, ady.A});
    private static final List<ady.c> h = Lists.newArrayList();

    public aqk() {
    }

    public aqk(Map<String, String> map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals((Object)"spacing")) {
                this.f = ns.a((String)entry.getValue(), this.f, 1);
                continue;
            }
            if (!((String)entry.getKey()).equals((Object)"separation")) continue;
            this.g = ns.a((String)entry.getValue(), this.g, 1);
        }
    }

    @Override
    public String a() {
        return "Monument";
    }

    @Override
    protected boolean a(int \u260322, int n) {
        int n2;
        \u2603 = \u260322;
        n2 = n;
        if (\u260322 < 0) {
            \u260322 -= this.f - 1;
        }
        if (n < 0) {
            n -= this.f - 1;
        }
        \u2603 = \u260322 / this.f;
        \u2603 = n / this.f;
        Random random = this.c.a(\u2603, \u2603, 10387313);
        \u2603 *= this.f;
        \u2603 *= this.f;
        int \u260322 = \u2603;
        n = n2;
        if (\u260322 == (\u2603 += (random.nextInt(this.f - this.g) + random.nextInt(this.f - this.g)) / 2) && n == (\u2603 += (random.nextInt(this.f - this.g) + random.nextInt(this.f - this.g)) / 2)) {
            if (this.c.v().a(new cj(\u260322 * 16 + 8, 64, n * 16 + 8), null) != ady.N) {
                return false;
            }
            boolean bl = this.c.v().a(\u260322 * 16 + 8, n * 16 + 8, 29, d);
            if (bl) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected aqu b(int n, int n2) {
        return new a(this.c, this.b, n, n2);
    }

    public List<ady.c> b() {
        return h;
    }

    static {
        h.add((Object)new ady.c(vt.class, 1, 2, 4));
    }

    public static class a
    extends aqu {
        private Set<adg> c = Sets.newHashSet();
        private boolean d;

        public a() {
        }

        public a(adm adm2, Random random, int n, int n2) {
            super(n, n2);
            this.b(adm2, random, n, n2);
        }

        private void b(adm adm2, Random random, int n, int n2) {
            random.setSeed(adm2.J());
            long l = random.nextLong();
            \u2603 = random.nextLong();
            \u2603 = (long)n * l;
            \u2603 = (long)n2 * \u2603;
            random.setSeed(\u2603 ^ \u2603 ^ adm2.J());
            int \u26032 = n * 16 + 8 - 29;
            int \u26033 = n2 * 16 + 8 - 29;
            cq \u26034 = cq.c.a.a(random);
            this.a.add((Object)new aql.h(random, \u26032, \u26033, \u26034));
            this.c();
            this.d = true;
        }

        @Override
        public void a(adm adm2, Random random, aqe aqe2) {
            if (!this.d) {
                this.a.clear();
                this.b(adm2, random, this.e(), this.f());
            }
            super.a(adm2, random, aqe2);
        }

        @Override
        public boolean a(adg adg2) {
            if (this.c.contains((Object)adg2)) {
                return false;
            }
            return super.a(adg2);
        }

        @Override
        public void b(adg adg2) {
            super.b(adg2);
            this.c.add((Object)adg2);
        }

        @Override
        public void a(dn dn22) {
            dn dn22;
            super.a(dn22);
            du du2 = new du();
            for (adg adg2 : this.c) {
                dn dn3 = new dn();
                dn3.a("X", adg2.a);
                dn3.a("Z", adg2.b);
                du2.a(dn3);
            }
            dn22.a("Processed", du2);
        }

        @Override
        public void b(dn dn2) {
            super.b(dn2);
            if (dn2.b("Processed", 9)) {
                du du2 = dn2.c("Processed", 10);
                for (int k = 0; k < du2.c(); ++k) {
                    dn dn3 = du2.b(k);
                    this.c.add((Object)new adg(dn3.f("X"), dn3.f("Z")));
                }
            }
        }
    }
}
