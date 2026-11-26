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

public class aiw
extends afh {
    public static final amm<a> a = amm.a("variant", a.class);

    public aiw() {
        super(arm.e);
        this.j(this.M.b().a(a, aiw$a.a));
        this.a(yz.b);
    }

    @Override
    public alz a(adm adm2, cj cj2, cq cq2, float f, float f2, float f3, int n, pr pr2) {
        if (n == aiw$a.c.a()) {
            switch (cq2.k()) {
                case c: {
                    return this.Q().a(a, aiw$a.e);
                }
                case a: {
                    return this.Q().a(a, aiw$a.d);
                }
            }
            return this.Q().a(a, aiw$a.c);
        }
        if (n == aiw$a.b.a()) {
            return this.Q().a(a, aiw$a.b);
        }
        return this.Q().a(a, aiw$a.a);
    }

    @Override
    public int a(alz alz2) {
        a a2 = alz2.b(a);
        if (a2 == aiw$a.d || a2 == aiw$a.e) {
            return aiw$a.c.a();
        }
        return a2.a();
    }

    @Override
    protected zx i(alz alz2) {
        a a2 = alz2.b(a);
        if (a2 == aiw$a.d || a2 == aiw$a.e) {
            return new zx(zw.a(this), 1, aiw$a.c.a());
        }
        return super.i(alz2);
    }

    @Override
    public void a(zw zw2, yz yz2, List<zx> list) {
        list.add((Object)new zx(zw2, 1, aiw$a.a.a()));
        list.add((Object)new zx(zw2, 1, aiw$a.b.a()));
        list.add((Object)new zx(zw2, 1, aiw$a.c.a()));
    }

    @Override
    public arn g(alz alz2) {
        return arn.p;
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, aiw$a.a(n));
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a).a();
    }

    @Override
    protected ama e() {
        return new ama(this, a);
    }

    public static enum a implements nw
    {
        a(0, "default", "default"),
        b(1, "chiseled", "chiseled"),
        c(2, "lines_y", "lines"),
        d(3, "lines_x", "lines"),
        e(4, "lines_z", "lines");

        private static final a[] f;
        private final int g;
        private final String h;
        private final String i;

        private a(int n2, String string2, String string3) {
            this.g = n2;
            this.h = string2;
            this.i = string3;
        }

        public int a() {
            return this.g;
        }

        public String toString() {
            return this.i;
        }

        public static a a(int n) {
            if (n < 0 || n >= f.length) {
                n = 0;
            }
            return f[n];
        }

        @Override
        public String l() {
            return this.h;
        }

        static {
            f = new a[aiw$a.values().length];
            a[] aArray = aiw$a.values();
            int \u26032 = aArray.length;
            for (int i = 0; i < \u26032; ++i) {
                aiw$a.f[\u2603.a()] = \u2603 = aArray[i];
            }
        }
    }
}
