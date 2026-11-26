/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public class agf
extends afh {
    public static final amm<a> a = amm.a("variant", a.class);
    public static final amk b = amk.a("snowy");

    protected agf() {
        super(arm.c);
        this.j(this.M.b().a(a, agf$a.a).a(b, false));
        this.a(yz.b);
    }

    @Override
    public arn g(alz alz2) {
        return alz2.b(a).d();
    }

    @Override
    public alz a(alz \u260322, adq adq2, cj cj2) {
        alz \u260322;
        if (\u260322.b(a) == agf$a.c) {
            afh afh2 = adq2.p(cj2.a()).c();
            \u260322 = \u260322.a(b, afh2 == afi.aJ || afh2 == afi.aH);
        }
        return \u260322;
    }

    @Override
    public void a(zw zw2, yz yz2, List<zx> list) {
        list.add((Object)new zx(this, 1, agf$a.a.a()));
        list.add((Object)new zx(this, 1, agf$a.b.a()));
        list.add((Object)new zx(this, 1, agf$a.c.a()));
    }

    @Override
    public int j(adm adm2, cj cj2) {
        alz alz2 = adm2.p(cj2);
        if (alz2.c() != this) {
            return 0;
        }
        return alz2.b(a).a();
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, agf$a.a(n));
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a).a();
    }

    @Override
    protected ama e() {
        return new ama(this, a, b);
    }

    @Override
    public int a(alz alz2) {
        a a2 = alz2.b(a);
        if (a2 == agf$a.c) {
            a2 = agf$a.a;
        }
        return a2.a();
    }

    public static enum a implements nw
    {
        a(0, "dirt", "default", arn.l),
        b(1, "coarse_dirt", "coarse", arn.l),
        c(2, "podzol", arn.J);

        private static final a[] d;
        private final int e;
        private final String f;
        private final String g;
        private final arn h;

        private a(int n2, String string2, arn arn2) {
            this(n2, string2, string2, arn2);
        }

        private a(int n2, String string2, String string3, arn arn2) {
            this.e = n2;
            this.f = string2;
            this.g = string3;
            this.h = arn2;
        }

        public int a() {
            return this.e;
        }

        public String c() {
            return this.g;
        }

        public arn d() {
            return this.h;
        }

        public String toString() {
            return this.f;
        }

        public static a a(int n) {
            if (n < 0 || n >= d.length) {
                n = 0;
            }
            return d[n];
        }

        @Override
        public String l() {
            return this.f;
        }

        static {
            d = new a[agf$a.values().length];
            a[] aArray = agf$a.values();
            int \u26032 = aArray.length;
            for (int i = 0; i < \u26032; ++i) {
                agf$a.d[\u2603.a()] = \u2603 = aArray[i];
            }
        }
    }
}
