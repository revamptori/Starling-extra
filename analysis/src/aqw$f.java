/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public static class aqw.f
extends aqw.n {
    public aqw.f() {
    }

    public aqw.f(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqw.f a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 9, 7, 11, cq2);
        if (!aqw.f.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.f(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 7 - 1, 0);
        }
        this.a(adm2, aqe2, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 2, 0, 6, 8, 0, 10, afi.d.Q(), afi.d.Q(), false);
        this.a(adm2, afi.e.Q(), 6, 0, 6, aqe2);
        this.a(adm2, aqe2, 2, 1, 6, 2, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
        this.a(adm2, aqe2, 8, 1, 6, 8, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
        this.a(adm2, aqe2, 3, 1, 10, 7, 1, 10, afi.aO.Q(), afi.aO.Q(), false);
        this.a(adm2, aqe2, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 8, 0, 0, 8, 3, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 0, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 0, 5, 7, 1, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 2, 5, 7, 3, 5, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 4, 4, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, afi.f.Q(), 0, 4, 2, aqe2);
        this.a(adm2, afi.f.Q(), 0, 4, 3, aqe2);
        this.a(adm2, afi.f.Q(), 8, 4, 2, aqe2);
        this.a(adm2, afi.f.Q(), 8, 4, 3, aqe2);
        int n2 = this.a(afi.ad, 3);
        \u2603 = this.a(afi.ad, 2);
        for (\u2603 = -1; \u2603 <= 2; ++\u2603) {
            for (\u2603 = 0; \u2603 <= 8; ++\u2603) {
                this.a(adm2, afi.ad.a(n2), \u2603, 4 + \u2603, \u2603, aqe2);
                this.a(adm2, afi.ad.a(\u2603), \u2603, 4 + \u2603, 5 - \u2603, aqe2);
            }
        }
        this.a(adm2, afi.r.Q(), 0, 2, 1, aqe2);
        this.a(adm2, afi.r.Q(), 0, 2, 4, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 1, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 4, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 2, 5, aqe2);
        this.a(adm2, afi.bj.Q(), 3, 2, 5, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 2, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 6, 2, 5, aqe2);
        this.a(adm2, afi.aO.Q(), 2, 1, 3, aqe2);
        this.a(adm2, afi.aB.Q(), 2, 2, 3, aqe2);
        this.a(adm2, afi.f.Q(), 1, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(this.a(afi.ad, 3)), 2, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(this.a(afi.ad, 1)), 1, 1, 3, aqe2);
        this.a(adm2, aqe2, 5, 0, 1, 7, 0, 3, afi.T.Q(), afi.T.Q(), false);
        this.a(adm2, afi.T.Q(), 6, 1, 1, aqe2);
        this.a(adm2, afi.T.Q(), 6, 1, 2, aqe2);
        this.a(adm2, afi.a.Q(), 2, 1, 0, aqe2);
        this.a(adm2, afi.a.Q(), 2, 2, 0, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe2);
        this.a(adm2, aqe2, random, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
        if (this.a(adm2, 2, 0, -1, aqe2).c().t() == arm.a && this.a(adm2, 2, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, aqe2);
        }
        this.a(adm2, afi.a.Q(), 6, 1, 5, aqe2);
        this.a(adm2, afi.a.Q(), 6, 2, 5, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.d()), 6, 3, 4, aqe2);
        this.a(adm2, aqe2, random, 6, 1, 5, cq.b(this.a(afi.ao, 1)));
        for (\u2603 = 0; \u2603 < 5; ++\u2603) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                this.b(adm2, \u2603, 7, \u2603, aqe2);
                this.b(adm2, afi.e.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 4, 1, 2, 2);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        if (n2 == 0) {
            return 4;
        }
        return super.c(n2, n3);
    }
}
