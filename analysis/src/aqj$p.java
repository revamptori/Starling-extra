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

public static class aqj.p
extends aqj.m {
    public aqj.p() {
    }

    public aqj.p(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.c((aqj.q)aqt2, list, random, 6, 2, false);
    }

    public static aqj.p a(List<aqt> list, Random random, int n2, int n3, int n4, int n5, cq cq2) {
        aqe aqe2 = aqe.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, cq2);
        if (!aqj.p.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.p(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 6, 10, 6, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 1, 8, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 5, 2, 0, 6, 8, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 1, 0, 8, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 2, 1, 6, 8, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 2, 6, 5, 8, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 3, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 6, 3, 2, 6, 5, 2, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 6, 3, 4, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, afi.by.Q(), 5, 2, 5, aqe2);
        this.a(adm2, aqe2, 4, 2, 5, 4, 3, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 3, 2, 5, 3, 4, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 2, 2, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 2, 5, 1, 6, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 7, 1, 5, 7, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 8, 2, 6, 8, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 2, 6, 0, 4, 8, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (\u2603 = 0; \u2603 <= 6; ++\u2603) {
                this.b(adm2, afi.by.Q(), i2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
