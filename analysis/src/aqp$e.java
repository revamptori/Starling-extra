/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public static class aqp.e
extends aqp.p {
    private static final List<ob> a = Lists.newArrayList((Object[])new ob[]{new ob(zy.aL, 0, 1, 3, 20), new ob(zy.aK, 0, 2, 7, 20), new ob(zy.bV, 0, 1, 1, 1), new ob(zy.aQ, 0, 1, 1, 1)});
    private boolean b;

    public aqp.e() {
    }

    public aqp.e(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
        this.b = aqe2.d() > 6;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Tall", this.b);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.n("Tall");
    }

    public static aqp.e a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -4, -1, 0, 14, 11, 15, cq2);
        if (!(aqp.e.a(aqe2) && aqt.a(list, aqe2) == null || aqp.e.a(aqe2 = aqe.a(n, n2, n3, -4, -1, 0, 14, 6, 15, cq2)) && aqt.a(list, aqe2) == null)) {
            return null;
        }
        return new aqp.e(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        int n2 = 11;
        if (!this.b) {
            n2 = 6;
        }
        this.a(adm2, aqe2, 0, 0, 0, 13, n2 - 1, 14, true, random, e);
        this.a(adm2, random, aqe2, this.d, 4, 1, 0);
        this.a(adm2, aqe2, random, 0.07f, 2, 1, 1, 11, 4, 13, afi.G.Q(), afi.G.Q(), false);
        boolean \u26032 = true;
        \u2603 = 12;
        for (\u2603 = 1; \u2603 <= 13; ++\u2603) {
            if ((\u2603 - 1) % 4 == 0) {
                this.a(adm2, aqe2, 1, 1, \u2603, 1, 4, \u2603, afi.f.Q(), afi.f.Q(), false);
                this.a(adm2, aqe2, 12, 1, \u2603, 12, 4, \u2603, afi.f.Q(), afi.f.Q(), false);
                this.a(adm2, afi.aa.Q(), 2, 3, \u2603, aqe2);
                this.a(adm2, afi.aa.Q(), 11, 3, \u2603, aqe2);
                if (!this.b) continue;
                this.a(adm2, aqe2, 1, 6, \u2603, 1, 9, \u2603, afi.f.Q(), afi.f.Q(), false);
                this.a(adm2, aqe2, 12, 6, \u2603, 12, 9, \u2603, afi.f.Q(), afi.f.Q(), false);
                continue;
            }
            this.a(adm2, aqe2, 1, 1, \u2603, 1, 4, \u2603, afi.X.Q(), afi.X.Q(), false);
            this.a(adm2, aqe2, 12, 1, \u2603, 12, 4, \u2603, afi.X.Q(), afi.X.Q(), false);
            if (!this.b) continue;
            this.a(adm2, aqe2, 1, 6, \u2603, 1, 9, \u2603, afi.X.Q(), afi.X.Q(), false);
            this.a(adm2, aqe2, 12, 6, \u2603, 12, 9, \u2603, afi.X.Q(), afi.X.Q(), false);
        }
        for (\u2603 = 3; \u2603 < 12; \u2603 += 2) {
            this.a(adm2, aqe2, 3, 1, \u2603, 4, 3, \u2603, afi.X.Q(), afi.X.Q(), false);
            this.a(adm2, aqe2, 6, 1, \u2603, 7, 3, \u2603, afi.X.Q(), afi.X.Q(), false);
            this.a(adm2, aqe2, 9, 1, \u2603, 10, 3, \u2603, afi.X.Q(), afi.X.Q(), false);
        }
        if (this.b) {
            this.a(adm2, aqe2, 1, 5, 1, 3, 5, 13, afi.f.Q(), afi.f.Q(), false);
            this.a(adm2, aqe2, 10, 5, 1, 12, 5, 13, afi.f.Q(), afi.f.Q(), false);
            this.a(adm2, aqe2, 4, 5, 1, 9, 5, 2, afi.f.Q(), afi.f.Q(), false);
            this.a(adm2, aqe2, 4, 5, 12, 9, 5, 13, afi.f.Q(), afi.f.Q(), false);
            this.a(adm2, afi.f.Q(), 9, 5, 11, aqe2);
            this.a(adm2, afi.f.Q(), 8, 5, 11, aqe2);
            this.a(adm2, afi.f.Q(), 9, 5, 10, aqe2);
            this.a(adm2, aqe2, 3, 6, 2, 3, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
            this.a(adm2, aqe2, 10, 6, 2, 10, 6, 10, afi.aO.Q(), afi.aO.Q(), false);
            this.a(adm2, aqe2, 4, 6, 2, 9, 6, 2, afi.aO.Q(), afi.aO.Q(), false);
            this.a(adm2, aqe2, 4, 6, 12, 8, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
            this.a(adm2, afi.aO.Q(), 9, 6, 11, aqe2);
            this.a(adm2, afi.aO.Q(), 8, 6, 11, aqe2);
            this.a(adm2, afi.aO.Q(), 9, 6, 10, aqe2);
            \u2603 = this.a(afi.au, 3);
            this.a(adm2, afi.au.a(\u2603), 10, 1, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 2, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 3, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 4, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 5, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 6, 13, aqe2);
            this.a(adm2, afi.au.a(\u2603), 10, 7, 13, aqe2);
            \u2603 = 7;
            \u2603 = 7;
            this.a(adm2, afi.aO.Q(), \u2603 - 1, 9, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603, 9, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 - 1, 8, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603, 8, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 - 1, 7, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603, 7, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 - 2, 7, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 + 1, 7, \u2603, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 - 1, 7, \u2603 - 1, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603 - 1, 7, \u2603 + 1, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603, 7, \u2603 - 1, aqe2);
            this.a(adm2, afi.aO.Q(), \u2603, 7, \u2603 + 1, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603 - 2, 8, \u2603, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603 + 1, 8, \u2603, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603 - 1, 8, \u2603 - 1, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603 - 1, 8, \u2603 + 1, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603, 8, \u2603 - 1, aqe2);
            this.a(adm2, afi.aa.Q(), \u2603, 8, \u2603 + 1, aqe2);
        }
        this.a(adm2, aqe2, random, 3, 3, 5, ob.a(a, zy.cd.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        if (this.b) {
            this.a(adm2, afi.a.Q(), 12, 9, 1, aqe2);
            this.a(adm2, aqe2, random, 12, 8, 1, ob.a(a, zy.cd.a(random, 1, 5, 2)), 1 + random.nextInt(4));
        }
        return true;
    }
}
