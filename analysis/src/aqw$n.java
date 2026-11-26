/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

static abstract class aqw.n
extends aqt {
    protected int h = -1;
    private int a;
    private boolean b;

    public aqw.n() {
    }

    protected aqw.n(aqw.k k2, int n2) {
        super(n2);
        if (k2 != null) {
            this.b = k2.b;
        }
    }

    @Override
    protected void a(dn dn2) {
        dn2.a("HPos", this.h);
        dn2.a("VCount", this.a);
        dn2.a("Desert", this.b);
    }

    @Override
    protected void b(dn dn2) {
        this.h = dn2.f("HPos");
        this.a = dn2.f("VCount");
        this.b = dn2.n("Desert");
    }

    protected aqt a(aqw.k k2, List<aqt> list, Random random, int n2, int n3) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d());
                }
                case d: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d());
                }
                case e: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d());
                }
                case f: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d());
                }
            }
        }
        return null;
    }

    protected aqt b(aqw.k k2, List<aqt> list, Random random, int n2, int n3) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d());
                }
                case d: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d());
                }
                case e: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d());
                }
                case f: {
                    return aqw.d(k2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d());
                }
            }
        }
        return null;
    }

    protected int b(adm adm2, aqe aqe2) {
        int n2 = 0;
        \u2603 = 0;
        cj.a \u26032 = new cj.a();
        for (\u2603 = this.l.c; \u2603 <= this.l.f; ++\u2603) {
            for (\u2603 = this.l.a; \u2603 <= this.l.d; ++\u2603) {
                \u26032.c(\u2603, 64, \u2603);
                if (!aqe2.b(\u26032)) continue;
                n2 += Math.max((int)adm2.r(\u26032).o(), (int)adm2.t.i());
                ++\u2603;
            }
        }
        if (\u2603 == 0) {
            return -1;
        }
        return n2 / \u2603;
    }

    protected static boolean a(aqe aqe2) {
        return aqe2 != null && aqe2.b > 10;
    }

    protected void a(adm adm2, aqe aqe2, int n2, int n3, int n4, int n5) {
        if (this.a >= n5) {
            return;
        }
        for (\u2603 = this.a; \u2603 < n5 && aqe2.b(new cj(\u2603 = this.a(n2 + \u2603, n4), \u2603 = this.d(n3), \u2603 = this.b(n2 + \u2603, n4))); ++\u2603) {
            ++this.a;
            wi wi2 = new wi(adm2);
            wi2.b((double)\u2603 + 0.5, \u2603, (double)\u2603 + 0.5, 0.0f, 0.0f);
            wi2.a(adm2.E(new cj(wi2)), null);
            wi2.r(this.c(\u2603, wi2.cl()));
            adm2.d(wi2);
        }
    }

    protected int c(int n2, int n3) {
        return n3;
    }

    protected alz a(alz alz2) {
        if (this.b) {
            if (alz2.c() == afi.r || alz2.c() == afi.s) {
                return afi.A.Q();
            }
            if (alz2.c() == afi.e) {
                return afi.A.a(aji.a.a.a());
            }
            if (alz2.c() == afi.f) {
                return afi.A.a(aji.a.c.a());
            }
            if (alz2.c() == afi.ad) {
                return afi.bO.Q().a(aju.a, alz2.b(aju.a));
            }
            if (alz2.c() == afi.aw) {
                return afi.bO.Q().a(aju.a, alz2.b(aju.a));
            }
            if (alz2.c() == afi.n) {
                return afi.A.Q();
            }
        }
        return alz2;
    }

    @Override
    protected void a(adm adm2, alz alz2, int n2, int n3, int n4, aqe aqe2) {
        alz alz3 = this.a(alz2);
        super.a(adm2, alz3, n2, n3, n4, aqe2);
    }

    @Override
    protected void a(adm adm2, aqe aqe2, int n2, int n3, int n4, int n5, int n6, int n7, alz alz2, alz alz3, boolean bl) {
        alz alz4 = this.a(alz2);
        \u2603 = this.a(alz3);
        super.a(adm2, aqe2, n2, n3, n4, n5, n6, n7, alz4, \u2603, bl);
    }

    @Override
    protected void b(adm adm2, alz alz2, int n2, int n3, int n4, aqe aqe2) {
        alz alz3 = this.a(alz2);
        super.b(adm2, alz3, n2, n3, n4, aqe2);
    }

    protected void a(boolean bl) {
        this.b = bl;
    }
}
