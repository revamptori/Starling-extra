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

public static class aqn.b
extends aqn.c {
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private static final List<ob> i = Lists.newArrayList((Object[])new ob[]{new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1)});
    private static final List<ob> j = Lists.newArrayList((Object[])new ob[]{new ob(zy.g, 0, 2, 7, 30)});
    private static a k = new a();

    public aqn.b() {
    }

    public aqn.b(Random random, int n, int n2) {
        super(random, n, 64, n2, 12, 10, 15);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("placedMainChest", this.e);
        dn2.a("placedHiddenChest", this.f);
        dn2.a("placedTrap1", this.g);
        dn2.a("placedTrap2", this.h);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.e = dn2.n("placedMainChest");
        this.f = dn2.n("placedHiddenChest");
        this.g = dn2.n("placedTrap1");
        this.h = dn2.n("placedTrap2");
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (!this.a(adm2, aqe2, 0)) {
            return false;
        }
        int n = this.a(afi.aw, 3);
        \u2603 = this.a(afi.aw, 2);
        \u2603 = this.a(afi.aw, 0);
        \u2603 = this.a(afi.aw, 1);
        this.a(adm2, aqe2, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, k);
        this.a(adm2, aqe2, 2, 1, 2, 9, 2, 2, false, random, k);
        this.a(adm2, aqe2, 2, 1, 12, 9, 2, 12, false, random, k);
        this.a(adm2, aqe2, 2, 1, 3, 2, 2, 11, false, random, k);
        this.a(adm2, aqe2, 9, 1, 3, 9, 2, 11, false, random, k);
        this.a(adm2, aqe2, 1, 3, 1, 10, 6, 1, false, random, k);
        this.a(adm2, aqe2, 1, 3, 13, 10, 6, 13, false, random, k);
        this.a(adm2, aqe2, 1, 3, 2, 1, 6, 12, false, random, k);
        this.a(adm2, aqe2, 10, 3, 2, 10, 6, 12, false, random, k);
        this.a(adm2, aqe2, 2, 3, 2, 9, 3, 12, false, random, k);
        this.a(adm2, aqe2, 2, 6, 2, 9, 6, 12, false, random, k);
        this.a(adm2, aqe2, 3, 7, 3, 8, 7, 11, false, random, k);
        this.a(adm2, aqe2, 4, 8, 4, 7, 8, 10, false, random, k);
        this.a(adm2, aqe2, 3, 1, 3, 8, 2, 11);
        this.a(adm2, aqe2, 4, 3, 6, 7, 3, 9);
        this.a(adm2, aqe2, 2, 4, 2, 9, 5, 12);
        this.a(adm2, aqe2, 4, 6, 5, 7, 6, 9);
        this.a(adm2, aqe2, 5, 7, 6, 6, 7, 8);
        this.a(adm2, aqe2, 5, 1, 2, 6, 2, 2);
        this.a(adm2, aqe2, 5, 2, 12, 6, 2, 12);
        this.a(adm2, aqe2, 5, 5, 1, 6, 5, 1);
        this.a(adm2, aqe2, 5, 5, 13, 6, 5, 13);
        this.a(adm2, afi.a.Q(), 1, 5, 5, aqe2);
        this.a(adm2, afi.a.Q(), 10, 5, 5, aqe2);
        this.a(adm2, afi.a.Q(), 1, 5, 9, aqe2);
        this.a(adm2, afi.a.Q(), 10, 5, 9, aqe2);
        for (\u2603 = 0; \u2603 <= 14; \u2603 += 14) {
            this.a(adm2, aqe2, 2, 4, \u2603, 2, 5, \u2603, false, random, k);
            this.a(adm2, aqe2, 4, 4, \u2603, 4, 5, \u2603, false, random, k);
            this.a(adm2, aqe2, 7, 4, \u2603, 7, 5, \u2603, false, random, k);
            this.a(adm2, aqe2, 9, 4, \u2603, 9, 5, \u2603, false, random, k);
        }
        this.a(adm2, aqe2, 5, 6, 0, 6, 6, 0, false, random, k);
        for (\u2603 = 0; \u2603 <= 11; \u2603 += 11) {
            for (\u2603 = 2; \u2603 <= 12; \u2603 += 2) {
                this.a(adm2, aqe2, \u2603, 4, \u2603, \u2603, 5, \u2603, false, random, k);
            }
            this.a(adm2, aqe2, \u2603, 6, 5, \u2603, 6, 5, false, random, k);
            this.a(adm2, aqe2, \u2603, 6, 9, \u2603, 6, 9, false, random, k);
        }
        this.a(adm2, aqe2, 2, 7, 2, 2, 9, 2, false, random, k);
        this.a(adm2, aqe2, 9, 7, 2, 9, 9, 2, false, random, k);
        this.a(adm2, aqe2, 2, 7, 12, 2, 9, 12, false, random, k);
        this.a(adm2, aqe2, 9, 7, 12, 9, 9, 12, false, random, k);
        this.a(adm2, aqe2, 4, 9, 4, 4, 9, 4, false, random, k);
        this.a(adm2, aqe2, 7, 9, 4, 7, 9, 4, false, random, k);
        this.a(adm2, aqe2, 4, 9, 10, 4, 9, 10, false, random, k);
        this.a(adm2, aqe2, 7, 9, 10, 7, 9, 10, false, random, k);
        this.a(adm2, aqe2, 5, 9, 7, 6, 9, 7, false, random, k);
        this.a(adm2, afi.aw.a(n), 5, 9, 6, aqe2);
        this.a(adm2, afi.aw.a(n), 6, 9, 6, aqe2);
        this.a(adm2, afi.aw.a(\u2603), 5, 9, 8, aqe2);
        this.a(adm2, afi.aw.a(\u2603), 6, 9, 8, aqe2);
        this.a(adm2, afi.aw.a(n), 4, 0, 0, aqe2);
        this.a(adm2, afi.aw.a(n), 5, 0, 0, aqe2);
        this.a(adm2, afi.aw.a(n), 6, 0, 0, aqe2);
        this.a(adm2, afi.aw.a(n), 7, 0, 0, aqe2);
        this.a(adm2, afi.aw.a(n), 4, 1, 8, aqe2);
        this.a(adm2, afi.aw.a(n), 4, 2, 9, aqe2);
        this.a(adm2, afi.aw.a(n), 4, 3, 10, aqe2);
        this.a(adm2, afi.aw.a(n), 7, 1, 8, aqe2);
        this.a(adm2, afi.aw.a(n), 7, 2, 9, aqe2);
        this.a(adm2, afi.aw.a(n), 7, 3, 10, aqe2);
        this.a(adm2, aqe2, 4, 1, 9, 4, 1, 9, false, random, k);
        this.a(adm2, aqe2, 7, 1, 9, 7, 1, 9, false, random, k);
        this.a(adm2, aqe2, 4, 1, 10, 7, 2, 10, false, random, k);
        this.a(adm2, aqe2, 5, 4, 5, 6, 4, 5, false, random, k);
        this.a(adm2, afi.aw.a(\u2603), 4, 4, 5, aqe2);
        this.a(adm2, afi.aw.a(\u2603), 7, 4, 5, aqe2);
        for (\u2603 = 0; \u2603 < 4; ++\u2603) {
            this.a(adm2, afi.aw.a(\u2603), 5, 0 - \u2603, 6 + \u2603, aqe2);
            this.a(adm2, afi.aw.a(\u2603), 6, 0 - \u2603, 6 + \u2603, aqe2);
            this.a(adm2, aqe2, 5, 0 - \u2603, 7 + \u2603, 6, 0 - \u2603, 9 + \u2603);
        }
        this.a(adm2, aqe2, 1, -3, 12, 10, -1, 13);
        this.a(adm2, aqe2, 1, -3, 1, 3, -1, 13);
        this.a(adm2, aqe2, 1, -3, 1, 9, -1, 5);
        for (\u2603 = 1; \u2603 <= 13; \u2603 += 2) {
            this.a(adm2, aqe2, 1, -3, \u2603, 1, -2, \u2603, false, random, k);
        }
        for (\u2603 = 2; \u2603 <= 12; \u2603 += 2) {
            this.a(adm2, aqe2, 1, -1, \u2603, 3, -1, \u2603, false, random, k);
        }
        this.a(adm2, aqe2, 2, -2, 1, 5, -2, 1, false, random, k);
        this.a(adm2, aqe2, 7, -2, 1, 9, -2, 1, false, random, k);
        this.a(adm2, aqe2, 6, -3, 1, 6, -3, 1, false, random, k);
        this.a(adm2, aqe2, 6, -1, 1, 6, -1, 1, false, random, k);
        this.a(adm2, afi.bR.a(this.a(afi.bR, cq.f.b())).a(akj.N, true), 1, -3, 8, aqe2);
        this.a(adm2, afi.bR.a(this.a(afi.bR, cq.e.b())).a(akj.N, true), 4, -3, 8, aqe2);
        this.a(adm2, afi.bS.Q().a(aki.N, true), 2, -3, 8, aqe2);
        this.a(adm2, afi.bS.Q().a(aki.N, true), 3, -3, 8, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 7, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 6, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 5, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 4, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 3, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 2, aqe2);
        this.a(adm2, afi.af.Q(), 5, -3, 1, aqe2);
        this.a(adm2, afi.af.Q(), 4, -3, 1, aqe2);
        this.a(adm2, afi.Y.Q(), 3, -3, 1, aqe2);
        if (!this.g) {
            this.g = this.a(adm2, aqe2, random, 3, -2, 1, cq.c.a(), j, 2);
        }
        this.a(adm2, afi.bn.a(15), 3, -2, 2, aqe2);
        this.a(adm2, afi.bR.a(this.a(afi.bR, cq.c.b())).a(akj.N, true), 7, -3, 1, aqe2);
        this.a(adm2, afi.bR.a(this.a(afi.bR, cq.d.b())).a(akj.N, true), 7, -3, 5, aqe2);
        this.a(adm2, afi.bS.Q().a(aki.N, true), 7, -3, 2, aqe2);
        this.a(adm2, afi.bS.Q().a(aki.N, true), 7, -3, 3, aqe2);
        this.a(adm2, afi.bS.Q().a(aki.N, true), 7, -3, 4, aqe2);
        this.a(adm2, afi.af.Q(), 8, -3, 6, aqe2);
        this.a(adm2, afi.af.Q(), 9, -3, 6, aqe2);
        this.a(adm2, afi.af.Q(), 9, -3, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 9, -3, 4, aqe2);
        this.a(adm2, afi.af.Q(), 9, -2, 4, aqe2);
        if (!this.h) {
            this.h = this.a(adm2, aqe2, random, 9, -2, 3, cq.e.a(), j, 2);
        }
        this.a(adm2, afi.bn.a(15), 8, -1, 3, aqe2);
        this.a(adm2, afi.bn.a(15), 8, -2, 3, aqe2);
        if (!this.e) {
            this.e = this.a(adm2, aqe2, random, 8, -3, 3, ob.a(i, zy.cd.b(random)), 2 + random.nextInt(5));
        }
        this.a(adm2, afi.Y.Q(), 9, -3, 2, aqe2);
        this.a(adm2, afi.Y.Q(), 8, -3, 1, aqe2);
        this.a(adm2, afi.Y.Q(), 4, -3, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 5, -2, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 5, -1, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 6, -3, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 7, -2, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 7, -1, 5, aqe2);
        this.a(adm2, afi.Y.Q(), 8, -3, 5, aqe2);
        this.a(adm2, aqe2, 9, -1, 1, 9, -1, 5, false, random, k);
        this.a(adm2, aqe2, 8, -3, 8, 10, -1, 10);
        this.a(adm2, afi.bf.a(ajz.P), 8, -2, 11, aqe2);
        this.a(adm2, afi.bf.a(ajz.P), 9, -2, 11, aqe2);
        this.a(adm2, afi.bf.a(ajz.P), 10, -2, 11, aqe2);
        this.a(adm2, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 8, -2, 12, aqe2);
        this.a(adm2, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 9, -2, 12, aqe2);
        this.a(adm2, afi.ay.a(ahu.a(cq.a(this.a(afi.ay, cq.c.a())))), 10, -2, 12, aqe2);
        this.a(adm2, aqe2, 8, -3, 8, 8, -3, 10, false, random, k);
        this.a(adm2, aqe2, 10, -3, 8, 10, -3, 10, false, random, k);
        this.a(adm2, afi.Y.Q(), 10, -2, 9, aqe2);
        this.a(adm2, afi.af.Q(), 8, -2, 9, aqe2);
        this.a(adm2, afi.af.Q(), 8, -2, 10, aqe2);
        this.a(adm2, afi.af.Q(), 10, -1, 9, aqe2);
        this.a(adm2, afi.F.a(cq.b.a()), 9, -2, 8, aqe2);
        this.a(adm2, afi.F.a(this.a(afi.F, cq.e.a())), 10, -2, 8, aqe2);
        this.a(adm2, afi.F.a(this.a(afi.F, cq.e.a())), 10, -1, 8, aqe2);
        this.a(adm2, afi.bb.a(this.a(afi.bb, cq.c.b())), 10, -2, 10, aqe2);
        if (!this.f) {
            this.f = this.a(adm2, aqe2, random, 9, -3, 10, ob.a(i, zy.cd.b(random)), 2 + random.nextInt(5));
        }
        return true;
    }

    static class a
    extends aqt.a {
        private a() {
        }

        @Override
        public void a(Random random, int n, int n2, int n3, boolean bl) {
            this.a = random.nextFloat() < 0.4f ? afi.e.Q() : afi.Y.Q();
        }
    }
}
