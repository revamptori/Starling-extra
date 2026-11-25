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

public static class aqn.a
extends aqn.c {
    private boolean[] e = new boolean[4];
    private static final List<ob> f = Lists.newArrayList((Object[])new ob[]{new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1)});

    public aqn.a() {
    }

    public aqn.a(Random random, int n, int n2) {
        super(random, n, 64, n2, 21, 15, 21);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("hasPlacedChest0", this.e[0]);
        dn2.a("hasPlacedChest1", this.e[1]);
        dn2.a("hasPlacedChest2", this.e[2]);
        dn2.a("hasPlacedChest3", this.e[3]);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.e[0] = dn2.n("hasPlacedChest0");
        this.e[1] = dn2.n("hasPlacedChest1");
        this.e[2] = dn2.n("hasPlacedChest2");
        this.e[3] = dn2.n("hasPlacedChest3");
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n;
        this.a(adm2, aqe2, 0, -4, 0, this.a - 1, 0, this.c - 1, afi.A.Q(), afi.A.Q(), false);
        for (n = 1; n <= 9; ++n) {
            this.a(adm2, aqe2, n, n, n, this.a - 1 - n, n, this.c - 1 - n, afi.A.Q(), afi.A.Q(), false);
            this.a(adm2, aqe2, n + 1, n, n + 1, this.a - 2 - n, n, this.c - 2 - n, afi.a.Q(), afi.a.Q(), false);
        }
        for (n = 0; n < this.a; ++n) {
            for (\u2603 = 0; \u2603 < this.c; ++\u2603) {
                \u2603 = -5;
                this.b(adm2, afi.A.Q(), n, \u2603, \u2603, aqe2);
            }
        }
        n = this.a(afi.bO, 3);
        \u2603 = this.a(afi.bO, 2);
        \u2603 = this.a(afi.bO, 0);
        \u2603 = this.a(afi.bO, 1);
        \u2603 = ~zd.b.b() & 0xF;
        \u2603 = ~zd.l.b() & 0xF;
        this.a(adm2, aqe2, 0, 0, 0, 4, 9, 4, afi.A.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 10, 1, 3, 10, 3, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, afi.bO.a(n), 2, 10, 0, aqe2);
        this.a(adm2, afi.bO.a(\u2603), 2, 10, 4, aqe2);
        this.a(adm2, afi.bO.a(\u2603), 0, 10, 2, aqe2);
        this.a(adm2, afi.bO.a(\u2603), 4, 10, 2, aqe2);
        this.a(adm2, aqe2, this.a - 5, 0, 0, this.a - 1, 9, 4, afi.A.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.a - 4, 10, 1, this.a - 2, 10, 3, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, afi.bO.a(n), this.a - 3, 10, 0, aqe2);
        this.a(adm2, afi.bO.a(\u2603), this.a - 3, 10, 4, aqe2);
        this.a(adm2, afi.bO.a(\u2603), this.a - 5, 10, 2, aqe2);
        this.a(adm2, afi.bO.a(\u2603), this.a - 1, 10, 2, aqe2);
        this.a(adm2, aqe2, 8, 0, 0, 12, 4, 4, afi.A.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 9, 1, 0, 11, 3, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, afi.A.a(aji.a.c.a()), 9, 1, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 9, 2, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 9, 3, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 10, 3, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 11, 3, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 11, 2, 1, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 11, 1, 1, aqe2);
        this.a(adm2, aqe2, 4, 1, 1, 8, 3, 3, afi.A.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 4, 1, 2, 8, 2, 2, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 12, 1, 1, 16, 3, 3, afi.A.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 12, 1, 2, 16, 2, 2, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 5, 4, 5, this.a - 6, 4, this.c - 6, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, 9, 4, 9, 11, 4, 11, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 8, 1, 8, 8, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 12, 1, 8, 12, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 8, 1, 12, 8, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 12, 1, 12, 12, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 1, 1, 5, 4, 4, 11, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, this.a - 5, 1, 5, this.a - 2, 4, 11, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, 6, 7, 9, 6, 7, 11, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, this.a - 7, 7, 9, this.a - 7, 7, 11, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, 5, 5, 9, 5, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, this.a - 6, 5, 9, this.a - 6, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, afi.a.Q(), 5, 5, 10, aqe2);
        this.a(adm2, afi.a.Q(), 5, 6, 10, aqe2);
        this.a(adm2, afi.a.Q(), 6, 6, 10, aqe2);
        this.a(adm2, afi.a.Q(), this.a - 6, 5, 10, aqe2);
        this.a(adm2, afi.a.Q(), this.a - 6, 6, 10, aqe2);
        this.a(adm2, afi.a.Q(), this.a - 7, 6, 10, aqe2);
        this.a(adm2, aqe2, 2, 4, 4, 2, 6, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.a - 3, 4, 4, this.a - 3, 6, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, afi.bO.a(n), 2, 4, 5, aqe2);
        this.a(adm2, afi.bO.a(n), 2, 3, 4, aqe2);
        this.a(adm2, afi.bO.a(n), this.a - 3, 4, 5, aqe2);
        this.a(adm2, afi.bO.a(n), this.a - 3, 3, 4, aqe2);
        this.a(adm2, aqe2, 1, 1, 3, 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, this.a - 3, 1, 3, this.a - 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, afi.bO.Q(), 1, 1, 2, aqe2);
        this.a(adm2, afi.bO.Q(), this.a - 2, 1, 2, aqe2);
        this.a(adm2, afi.U.a(akb.a.b.a()), 1, 2, 2, aqe2);
        this.a(adm2, afi.U.a(akb.a.b.a()), this.a - 2, 2, 2, aqe2);
        this.a(adm2, afi.bO.a(\u2603), 2, 1, 2, aqe2);
        this.a(adm2, afi.bO.a(\u2603), this.a - 3, 1, 2, aqe2);
        this.a(adm2, aqe2, 4, 3, 5, 4, 3, 18, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, this.a - 5, 3, 5, this.a - 5, 3, 17, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, 3, 1, 5, 4, 2, 16, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.a - 6, 1, 5, this.a - 5, 2, 16, afi.a.Q(), afi.a.Q(), false);
        for (\u2603 = 5; \u2603 <= 17; \u2603 += 2) {
            this.a(adm2, afi.A.a(aji.a.c.a()), 4, 1, \u2603, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), 4, 2, \u2603, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), this.a - 5, 1, \u2603, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), this.a - 5, 2, \u2603, aqe2);
        }
        this.a(adm2, afi.cu.a(\u2603), 10, 0, 7, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 10, 0, 8, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 9, 0, 9, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 11, 0, 9, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 8, 0, 10, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 12, 0, 10, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 7, 0, 10, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 13, 0, 10, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 9, 0, 11, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 11, 0, 11, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 10, 0, 12, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 10, 0, 13, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 10, 0, 10, aqe2);
        for (\u2603 = 0; \u2603 <= this.a - 1; \u2603 += this.a - 1) {
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 2, 1, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 2, 2, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 2, 3, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 3, 1, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 3, 2, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 3, 3, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 4, 1, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), \u2603, 4, 2, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 4, 3, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 5, 1, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 5, 2, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 5, 3, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 6, 1, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), \u2603, 6, 2, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 6, 3, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 7, 1, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 7, 2, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 7, 3, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 8, 1, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 8, 2, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 8, 3, aqe2);
        }
        for (\u2603 = 2; \u2603 <= this.a - 3; \u2603 += this.a - 3 - 2) {
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 - 1, 2, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 2, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 + 1, 2, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 - 1, 3, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 3, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 + 1, 3, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 - 1, 4, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), \u2603, 4, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 + 1, 4, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 - 1, 5, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 5, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 + 1, 5, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 - 1, 6, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.b.a()), \u2603, 6, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 + 1, 6, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 - 1, 7, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603, 7, 0, aqe2);
            this.a(adm2, afi.cu.a(\u2603), \u2603 + 1, 7, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 - 1, 8, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603, 8, 0, aqe2);
            this.a(adm2, afi.A.a(aji.a.c.a()), \u2603 + 1, 8, 0, aqe2);
        }
        this.a(adm2, aqe2, 8, 4, 0, 12, 6, 0, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, afi.a.Q(), 8, 6, 0, aqe2);
        this.a(adm2, afi.a.Q(), 12, 6, 0, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 9, 5, 0, aqe2);
        this.a(adm2, afi.A.a(aji.a.b.a()), 10, 5, 0, aqe2);
        this.a(adm2, afi.cu.a(\u2603), 11, 5, 0, aqe2);
        this.a(adm2, aqe2, 8, -14, 8, 12, -11, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 8, -10, 8, 12, -10, 12, afi.A.a(aji.a.b.a()), afi.A.a(aji.a.b.a()), false);
        this.a(adm2, aqe2, 8, -9, 8, 12, -9, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
        this.a(adm2, aqe2, 8, -8, 8, 12, -1, 12, afi.A.Q(), afi.A.Q(), false);
        this.a(adm2, aqe2, 9, -11, 9, 11, -1, 11, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, afi.az.Q(), 10, -11, 10, aqe2);
        this.a(adm2, aqe2, 9, -13, 9, 11, -13, 11, afi.W.Q(), afi.a.Q(), false);
        this.a(adm2, afi.a.Q(), 8, -11, 10, aqe2);
        this.a(adm2, afi.a.Q(), 8, -10, 10, aqe2);
        this.a(adm2, afi.A.a(aji.a.b.a()), 7, -10, 10, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 7, -11, 10, aqe2);
        this.a(adm2, afi.a.Q(), 12, -11, 10, aqe2);
        this.a(adm2, afi.a.Q(), 12, -10, 10, aqe2);
        this.a(adm2, afi.A.a(aji.a.b.a()), 13, -10, 10, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 13, -11, 10, aqe2);
        this.a(adm2, afi.a.Q(), 10, -11, 8, aqe2);
        this.a(adm2, afi.a.Q(), 10, -10, 8, aqe2);
        this.a(adm2, afi.A.a(aji.a.b.a()), 10, -10, 7, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 10, -11, 7, aqe2);
        this.a(adm2, afi.a.Q(), 10, -11, 12, aqe2);
        this.a(adm2, afi.a.Q(), 10, -10, 12, aqe2);
        this.a(adm2, afi.A.a(aji.a.b.a()), 10, -10, 13, aqe2);
        this.a(adm2, afi.A.a(aji.a.c.a()), 10, -11, 13, aqe2);
        for (cq cq2 : cq.c.a) {
            if (this.e[cq2.b()]) continue;
            int n2 = cq2.g() * 2;
            \u2603 = cq2.i() * 2;
            this.e[cq2.b()] = this.a(adm2, aqe2, random, 10 + n2, -11, 10 + \u2603, ob.a(f, zy.cd.b(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}
