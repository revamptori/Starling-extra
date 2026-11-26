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

public static class aqw.a
extends aqw.n {
    public aqw.a() {
    }

    public aqw.a(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqw.a a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, cq2);
        if (!aqw.a.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.a(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 9 - 1, 0);
        }
        this.a(adm2, aqe2, 1, 1, 1, 7, 5, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 0, 0, 8, 0, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 5, 0, 8, 5, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 6, 1, 8, 6, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 7, 2, 8, 7, 3, afi.e.Q(), afi.e.Q(), false);
        int n2 = this.a(afi.ad, 3);
        \u2603 = this.a(afi.ad, 2);
        for (\u2603 = -1; \u2603 <= 2; ++\u2603) {
            for (\u2603 = 0; \u2603 <= 8; ++\u2603) {
                this.a(adm2, afi.ad.a(n2), \u2603, 6 + \u2603, \u2603, aqe2);
                this.a(adm2, afi.ad.a(\u2603), \u2603, 6 + \u2603, 5 - \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 0, 1, 0, 0, 1, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 1, 5, 8, 1, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 8, 1, 0, 8, 1, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 2, 1, 0, 7, 1, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 0, 4, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 2, 5, 0, 4, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 8, 2, 5, 8, 4, 5, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 8, 2, 0, 8, 4, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 2, 1, 0, 4, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 2, 5, 7, 4, 5, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 8, 2, 1, 8, 4, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 2, 0, 7, 4, 0, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, afi.bj.Q(), 4, 2, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 2, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 6, 2, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 3, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 3, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 6, 3, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 3, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 3, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 2, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 3, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 8, 3, 3, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 2, 5, aqe2);
        this.a(adm2, afi.bj.Q(), 3, 2, 5, aqe2);
        this.a(adm2, afi.bj.Q(), 5, 2, 5, aqe2);
        this.a(adm2, afi.bj.Q(), 6, 2, 5, aqe2);
        this.a(adm2, aqe2, 1, 4, 1, 7, 4, 1, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 4, 4, 7, 4, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm2, aqe2, 1, 3, 4, 7, 3, 4, afi.X.Q(), afi.X.Q(), false);
        this.a(adm2, afi.f.Q(), 7, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(this.a(afi.ad, 0)), 7, 1, 3, aqe2);
        \u2603 = this.a(afi.ad, 3);
        this.a(adm2, afi.ad.a(\u2603), 6, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(\u2603), 5, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(\u2603), 4, 1, 4, aqe2);
        this.a(adm2, afi.ad.a(\u2603), 3, 1, 4, aqe2);
        this.a(adm2, afi.aO.Q(), 6, 1, 3, aqe2);
        this.a(adm2, afi.aB.Q(), 6, 2, 3, aqe2);
        this.a(adm2, afi.aO.Q(), 4, 1, 3, aqe2);
        this.a(adm2, afi.aB.Q(), 4, 2, 3, aqe2);
        this.a(adm2, afi.ai.Q(), 7, 1, 1, aqe2);
        this.a(adm2, afi.a.Q(), 1, 1, 0, aqe2);
        this.a(adm2, afi.a.Q(), 1, 2, 0, aqe2);
        this.a(adm2, aqe2, random, 1, 1, 0, cq.b(this.a(afi.ao, 1)));
        if (this.a(adm2, 1, 0, -1, aqe2).c().t() == arm.a && this.a(adm2, 1, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 1, 0, -1, aqe2);
        }
        for (\u2603 = 0; \u2603 < 6; ++\u2603) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                this.b(adm2, \u2603, 9, \u2603, aqe2);
                this.b(adm2, afi.e.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 1;
    }
}
