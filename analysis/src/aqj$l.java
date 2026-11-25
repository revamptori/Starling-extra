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

public static class aqj.l
extends aqj.m {
    private boolean b;

    public aqj.l() {
    }

    public aqj.l(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.n("Mob");
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Mob", this.b);
    }

    public static aqj.l a(List<aqt> list, Random random, int n2, int n3, int n4, int n5, cq cq2) {
        aqe aqe2 = aqe.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, cq2);
        if (!aqj.l.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.l(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 2, 0, 6, 7, 7, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 0, 0, 5, 1, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 2, 1, 5, 2, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 3, 2, 5, 3, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 4, 3, 5, 4, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 2, 0, 1, 4, 2, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 5, 2, 0, 5, 4, 2, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 5, 2, 1, 5, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 5, 5, 2, 5, 5, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 5, 3, 0, 5, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 5, 3, 6, 5, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 5, 8, 5, 5, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, afi.bz.Q(), 1, 6, 3, aqe2);
        this.a(adm2, afi.bz.Q(), 5, 6, 3, aqe2);
        this.a(adm2, aqe2, 0, 6, 3, 0, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 6, 6, 3, 6, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 1, 6, 8, 5, 7, 8, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 2, 8, 8, 4, 8, 8, afi.bz.Q(), afi.bz.Q(), false);
        if (!this.b && aqe2.b(\u2603 = new cj(this.a(3, 5), this.d(5), this.b(3, 5)))) {
            this.b = true;
            adm2.a(\u2603, afi.ac.Q(), 2);
            akw akw2 = adm2.s(\u2603);
            if (akw2 instanceof all) {
                ((all)akw2).b().a("Blaze");
            }
        }
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (\u2603 = 0; \u2603 <= 6; ++\u2603) {
                this.b(adm2, afi.by.Q(), i2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
