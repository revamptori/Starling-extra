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

public static class aqw.m
extends aqw.n {
    public aqw.m() {
    }

    public aqw.m(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqw.m a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 9, 7, 12, cq2);
        if (!aqw.m.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.m(k2, n5, random, aqe2, cq2);
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
        this.a(adm2, aqe2, 2, 0, 5, 8, 0, 10, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 8, 0, 0, 8, 3, 10, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 0, 0, 7, 2, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 0, 5, 2, 1, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 2, 0, 6, 2, 3, 10, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 3, 0, 10, 7, 3, 10, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 2, 5, 2, 3, 5, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 4, 4, 3, 4, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, afi.f.Q(), 0, 4, 2, aqe2);
        this.a(adm2, afi.f.Q(), 0, 4, 3, aqe2);
        this.a(adm2, afi.f.Q(), 8, 4, 2, aqe2);
        this.a(adm2, afi.f.Q(), 8, 4, 3, aqe2);
        this.a(adm2, afi.f.Q(), 8, 4, 4, aqe2);
        int n2 = this.a(afi.ad, 3);
        \u2603 = this.a(afi.ad, 2);
        for (\u2603 = -1; \u2603 <= 2; ++\u2603) {
            for (\u2603 = 0; \u2603 <= 8; ++\u2603) {
                this.a(adm2, afi.ad.a(n2), \u2603, 4 + \u2603, \u2603, aqe2);
                if (\u2603 <= -1 && \u2603 > 1 || \u2603 <= 0 && \u2603 > 3 || \u2603 <= 1 && \u2603 > 4 && \u2603 < 6) continue;
                this.a(adm2, afi.ad.a(\u2603), \u2603, 4 + \u2603, 5 - \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 3, 4, 5, 3, 4, 10, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 7, 4, 2, 7, 4, 10, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 4, 5, 4, 4, 5, 10, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 6, 5, 4, 6, 5, 10, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 5, 6, 3, 5, 6, 10, afi.f.Q(), afi.f.Q(), false);
        \u2603 = this.a(afi.ad, 0);
        for (\u2603 = 4; \u2603 >= 1; --\u2603) {
            this.a(adm2, afi.f.Q(), \u2603, 2 + \u2603, 7 - \u2603, aqe2);
            for (\u2603 = 8 - \u2603; \u2603 <= 10; ++\u2603) {
                this.a(adm2, afi.ad.a(\u2603), \u2603, 2 + \u2603, \u2603, aqe2);
            }
        }
        \u2603 = this.a(afi.ad, 1);
        this.a(adm2, afi.f.Q(), 6, 6, 3, aqe2);
        this.a(adm2, afi.f.Q(), 7, 5, 4, aqe2);
        this.a(adm2, afi.ad.a(\u2603), 6, 6, 4, aqe2);
        for (\u2603 = 6; \u2603 <= 8; ++\u2603) {
            for (\u2603 = 5; \u2603 <= 10; ++\u2603) {
                this.a(adm2, afi.ad.a(\u2603), \u2603, 12 - \u2603, \u2603, aqe2);
            }
        }
        this.a(adm2, afi.r.Q(), 0, 2, 1, aqe2);
        this.a(adm2, afi.r.Q(), 0, 2, 4, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 3, aqe2);
        this.a(adm2, afi.r.Q(), 4, 2, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 2, 0, aqe2);
        this.a(adm2, afi.r.Q(), 6, 2, 0, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 1, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 3, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 4, aqe2);
        this.a(adm2, afi.f.Q(), 8, 2, 5, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 6, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 7, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 8, aqe2);
        this.a(adm2, afi.r.Q(), 8, 2, 9, aqe2);
        this.a(adm2, afi.r.Q(), 2, 2, 6, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 2, 7, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 2, 8, aqe2);
        this.a(adm2, afi.r.Q(), 2, 2, 9, aqe2);
        this.a(adm2, afi.r.Q(), 4, 4, 10, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 4, 10, aqe2);
        this.a(adm2, afi.r.Q(), 6, 4, 10, aqe2);
        this.a(adm2, afi.f.Q(), 5, 5, 10, aqe2);
        this.a(adm2, afi.a.Q(), 2, 1, 0, aqe2);
        this.a(adm2, afi.a.Q(), 2, 2, 0, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe2);
        this.a(adm2, aqe2, random, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
        this.a(adm2, aqe2, 1, 0, -1, 3, 2, -1, afi.a.Q(), afi.a.Q(), false);
        if (this.a(adm2, 2, 0, -1, aqe2).c().t() == arm.a && this.a(adm2, 2, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, aqe2);
        }
        for (\u2603 = 0; \u2603 < 5; ++\u2603) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                this.b(adm2, \u2603, 7, \u2603, aqe2);
                this.b(adm2, afi.e.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        for (\u2603 = 5; \u2603 < 11; ++\u2603) {
            for (\u2603 = 2; \u2603 < 9; ++\u2603) {
                this.b(adm2, \u2603, 7, \u2603, aqe2);
                this.b(adm2, afi.e.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 4, 1, 2, 2);
        return true;
    }
}
