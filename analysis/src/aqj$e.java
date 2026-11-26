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

public static class aqj.e
extends aqj.m {
    public aqj.e() {
    }

    public aqj.e(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        int n2 = 1;
        if (this.m == cq.e || this.m == cq.c) {
            n2 = 5;
        }
        this.b((aqj.q)aqt2, list, random, 0, n2, random.nextInt(8) > 0);
        this.c((aqj.q)aqt2, list, random, 0, n2, random.nextInt(8) > 0);
    }

    public static aqj.e a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, cq2);
        if (!aqj.e.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.e(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 8, 1, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 8, 5, 8, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 6, 0, 8, 6, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 2, 5, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 2, 0, 8, 5, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 3, 0, 1, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 7, 3, 0, 7, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 0, 2, 4, 8, 2, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 1, 4, 2, 2, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 6, 1, 4, 7, 2, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 3, 8, 8, 3, 8, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 0, 3, 6, 0, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 8, 3, 6, 8, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 0, 3, 4, 0, 5, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 8, 3, 4, 8, 5, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 3, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 3, 5, 7, 5, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 4, 5, 1, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 7, 4, 5, 7, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (\u2603 = 0; \u2603 <= 8; ++\u2603) {
                this.b(adm2, afi.by.Q(), \u2603, -1, i2, aqe2);
            }
        }
        return true;
    }
}
