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

public static class aqp.g
extends aqp.p {
    private boolean a;

    public aqp.g() {
    }

    public aqp.g(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Mob", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.n("Mob");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        if (aqt2 != null) {
            ((aqp.m)aqt2).b = this;
        }
    }

    public static aqp.g a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -4, -1, 0, 11, 8, 16, cq2);
        if (!aqp.g.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.g(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 10, 7, 15, false, random, e);
        this.a(adm2, random, aqe2, aqp.p.a.c, 4, 1, 0);
        int n2 = 6;
        this.a(adm2, aqe2, 1, n2, 1, 1, n2, 14, false, random, e);
        this.a(adm2, aqe2, 9, n2, 1, 9, n2, 14, false, random, e);
        this.a(adm2, aqe2, 2, n2, 1, 8, n2, 2, false, random, e);
        this.a(adm2, aqe2, 2, n2, 14, 8, n2, 14, false, random, e);
        this.a(adm2, aqe2, 1, 1, 1, 2, 1, 4, false, random, e);
        this.a(adm2, aqe2, 8, 1, 1, 9, 1, 4, false, random, e);
        this.a(adm2, aqe2, 1, 1, 1, 1, 1, 3, afi.k.Q(), afi.k.Q(), false);
        this.a(adm2, aqe2, 9, 1, 1, 9, 1, 3, afi.k.Q(), afi.k.Q(), false);
        this.a(adm2, aqe2, 3, 1, 8, 7, 1, 12, false, random, e);
        this.a(adm2, aqe2, 4, 1, 9, 6, 1, 11, afi.k.Q(), afi.k.Q(), false);
        for (\u2603 = 3; \u2603 < 14; \u2603 += 2) {
            this.a(adm2, aqe2, 0, 3, \u2603, 0, 4, \u2603, afi.bi.Q(), afi.bi.Q(), false);
            this.a(adm2, aqe2, 10, 3, \u2603, 10, 4, \u2603, afi.bi.Q(), afi.bi.Q(), false);
        }
        for (\u2603 = 2; \u2603 < 9; \u2603 += 2) {
            this.a(adm2, aqe2, \u2603, 3, 15, \u2603, 4, 15, afi.bi.Q(), afi.bi.Q(), false);
        }
        \u2603 = this.a(afi.bv, 3);
        this.a(adm2, aqe2, 4, 1, 5, 6, 1, 7, false, random, e);
        this.a(adm2, aqe2, 4, 2, 6, 6, 2, 7, false, random, e);
        this.a(adm2, aqe2, 4, 3, 7, 6, 3, 7, false, random, e);
        for (\u2603 = 4; \u2603 <= 6; ++\u2603) {
            this.a(adm2, afi.bv.a(\u2603), \u2603, 1, 4, aqe2);
            this.a(adm2, afi.bv.a(\u2603), \u2603, 2, 5, aqe2);
            this.a(adm2, afi.bv.a(\u2603), \u2603, 3, 6, aqe2);
        }
        \u2603 = cq.c.b();
        \u2603 = cq.d.b();
        \u2603 = cq.f.b();
        \u2603 = cq.e.b();
        if (this.m != null) {
            switch (this.m) {
                case d: {
                    \u2603 = cq.d.b();
                    \u2603 = cq.c.b();
                    break;
                }
                case f: {
                    \u2603 = cq.f.b();
                    \u2603 = cq.e.b();
                    \u2603 = cq.d.b();
                    \u2603 = cq.c.b();
                    break;
                }
                case e: {
                    \u2603 = cq.e.b();
                    \u2603 = cq.f.b();
                    \u2603 = cq.d.b();
                    \u2603 = cq.c.b();
                }
            }
        }
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 4, 3, 8, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 5, 3, 8, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 6, 3, 8, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 4, 3, 12, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 5, 3, 12, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 6, 3, 12, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 3, 3, 9, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 3, 3, 10, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 3, 3, 11, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 7, 3, 9, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 7, 3, 10, aqe2);
        this.a(adm2, afi.bG.a(\u2603).a(ago.b, random.nextFloat() > 0.9f), 7, 3, 11, aqe2);
        if (!this.a) {
            n2 = this.d(3);
            cj cj2 = new cj(this.a(5, 6), n2, this.b(5, 6));
            if (aqe2.b(cj2)) {
                this.a = true;
                adm2.a(cj2, afi.ac.Q(), 2);
                akw akw2 = adm2.s(cj2);
                if (akw2 instanceof all) {
                    ((all)akw2).b().a("Silverfish");
                }
            }
        }
        return true;
    }
}
