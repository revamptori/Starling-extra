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

public static class aqw.i
extends aqw.n {
    public aqw.i() {
    }

    public aqw.i(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqw.i a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, cq2);
        if (!aqw.i.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.i(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 12 - 1, 0);
        }
        this.a(adm2, aqe2, 1, 1, 1, 3, 3, 7, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 5, 1, 3, 9, 3, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 0, 0, 3, 0, 8, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 1, 0, 3, 10, 0, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 1, 1, 0, 10, 3, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 4, 1, 1, 4, 10, 3, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 0, 4, 0, 4, 7, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 4, 0, 4, 4, 4, 7, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 1, 8, 3, 4, 8, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 5, 4, 3, 10, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 1, 5, 5, 3, 5, 7, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 9, 0, 4, 9, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, aqe2, 0, 4, 0, 4, 4, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm2, afi.e.Q(), 0, 11, 2, aqe2);
        this.a(adm2, afi.e.Q(), 4, 11, 2, aqe2);
        this.a(adm2, afi.e.Q(), 2, 11, 0, aqe2);
        this.a(adm2, afi.e.Q(), 2, 11, 4, aqe2);
        this.a(adm2, afi.e.Q(), 1, 1, 6, aqe2);
        this.a(adm2, afi.e.Q(), 1, 1, 7, aqe2);
        this.a(adm2, afi.e.Q(), 2, 1, 7, aqe2);
        this.a(adm2, afi.e.Q(), 3, 1, 6, aqe2);
        this.a(adm2, afi.e.Q(), 3, 1, 7, aqe2);
        this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 1, 1, 5, aqe2);
        this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 2, 1, 6, aqe2);
        this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 3, 1, 5, aqe2);
        this.a(adm2, afi.aw.a(this.a(afi.aw, 1)), 1, 2, 7, aqe2);
        this.a(adm2, afi.aw.a(this.a(afi.aw, 0)), 3, 2, 7, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 3, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 2, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 3, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 6, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 7, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 6, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 7, 2, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 6, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 7, 0, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 6, 4, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 7, 4, aqe2);
        this.a(adm2, afi.bj.Q(), 0, 3, 6, aqe2);
        this.a(adm2, afi.bj.Q(), 4, 3, 6, aqe2);
        this.a(adm2, afi.bj.Q(), 2, 3, 8, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.d()), 2, 4, 7, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.e()), 1, 4, 6, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.f()), 3, 4, 6, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m), 2, 4, 5, aqe2);
        int n2 = this.a(afi.au, 4);
        for (\u2603 = 1; \u2603 <= 9; ++\u2603) {
            this.a(adm2, afi.au.a(n2), 3, \u2603, 3, aqe2);
        }
        this.a(adm2, afi.a.Q(), 2, 1, 0, aqe2);
        this.a(adm2, afi.a.Q(), 2, 2, 0, aqe2);
        this.a(adm2, aqe2, random, 2, 1, 0, cq.b(this.a(afi.ao, 1)));
        if (this.a(adm2, 2, 0, -1, aqe2).c().t() == arm.a && this.a(adm2, 2, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm2, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, aqe2);
        }
        for (\u2603 = 0; \u2603 < 9; ++\u2603) {
            for (\u2603 = 0; \u2603 < 5; ++\u2603) {
                this.b(adm2, \u2603, 12, \u2603, aqe2);
                this.b(adm2, afi.e.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        this.a(adm2, aqe2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 2;
    }
}
