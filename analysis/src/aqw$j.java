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

public static class aqw.j
extends aqw.n {
    private static final List<ob> a = Lists.newArrayList((Object[])new ob[]{new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zw.a(afi.Z), 0, 3, 7, 5), new ob(zw.a(afi.g), 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1)});
    private boolean b;

    public aqw.j() {
    }

    public aqw.j(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqw.j a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, cq2);
        if (!aqw.j.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.j(k2, n5, random, aqe2, cq2);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Chest", this.b);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.n("Chest");
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        int n2;
        if (this.h < 0) {
            this.h = this.b(adm22, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 6 - 1, 0);
        }
        this.a(adm22, aqe2, 0, 1, 0, 9, 4, 6, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 0, 0, 9, 0, 6, afi.e.Q(), afi.e.Q(), false);
        this.a(adm22, aqe2, 0, 4, 0, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
        this.a(adm22, aqe2, 0, 5, 0, 9, 5, 6, afi.U.Q(), afi.U.Q(), false);
        this.a(adm22, aqe2, 1, 5, 1, 8, 5, 5, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 0, 1, 0, 0, 4, 0, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 3, 1, 0, 3, 4, 0, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 0, 1, 6, 0, 4, 6, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, afi.f.Q(), 3, 3, 1, aqe2);
        this.a(adm22, aqe2, 3, 1, 2, 3, 3, 2, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 4, 1, 3, 5, 3, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 0, 1, 1, 0, 3, 5, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 1, 1, 6, 5, 3, 6, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 5, 1, 0, 5, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
        this.a(adm22, aqe2, 9, 1, 0, 9, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
        this.a(adm22, aqe2, 6, 1, 4, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
        this.a(adm22, afi.k.Q(), 7, 1, 5, aqe2);
        this.a(adm22, afi.k.Q(), 8, 1, 5, aqe2);
        this.a(adm22, afi.bi.Q(), 9, 2, 5, aqe2);
        this.a(adm22, afi.bi.Q(), 9, 2, 4, aqe2);
        this.a(adm22, aqe2, 7, 2, 4, 8, 2, 5, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, afi.e.Q(), 6, 1, 3, aqe2);
        this.a(adm22, afi.al.Q(), 6, 2, 3, aqe2);
        this.a(adm22, afi.al.Q(), 6, 3, 3, aqe2);
        this.a(adm22, afi.T.Q(), 8, 1, 1, aqe2);
        this.a(adm22, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm22, afi.bj.Q(), 0, 2, 4, aqe2);
        this.a(adm22, afi.bj.Q(), 2, 2, 6, aqe2);
        this.a(adm22, afi.bj.Q(), 4, 2, 6, aqe2);
        this.a(adm22, afi.aO.Q(), 2, 1, 4, aqe2);
        this.a(adm22, afi.aB.Q(), 2, 2, 4, aqe2);
        this.a(adm22, afi.f.Q(), 1, 1, 5, aqe2);
        this.a(adm22, afi.ad.a(this.a(afi.ad, 3)), 2, 1, 5, aqe2);
        this.a(adm22, afi.ad.a(this.a(afi.ad, 1)), 1, 1, 4, aqe2);
        if (!this.b && aqe2.b(new cj(this.a(5, 5), this.d(1), this.b(5, 5)))) {
            this.b = true;
            this.a(adm22, aqe2, random, 5, 1, 5, a, 3 + random.nextInt(6));
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.a(adm22, n2, 0, -1, aqe2).c().t() != arm.a || this.a(adm22, n2, -1, -1, aqe2).c().t() == arm.a) continue;
            this.a(adm22, afi.aw.a(this.a(afi.aw, 3)), n2, 0, -1, aqe2);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (\u2603 = 0; \u2603 < 10; ++\u2603) {
                this.b(adm22, \u2603, 6, n2, aqe2);
                this.b(adm22, afi.e.Q(), \u2603, -1, n2, aqe2);
            }
        }
        this.a(adm22, aqe2, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 3;
    }
}
