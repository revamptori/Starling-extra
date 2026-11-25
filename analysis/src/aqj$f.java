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

public static class aqj.f
extends aqj.m {
    public aqj.f() {
    }

    public aqj.f(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 5, 3, true);
    }

    public static aqj.f a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, cq2);
        if (!aqj.f.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.f(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        int n2;
        this.a(adm22, aqe2, 0, 3, 0, 12, 4, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 5, 0, 12, 13, 12, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 5, 0, 1, 12, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 11, 5, 0, 12, 12, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 2, 5, 11, 4, 12, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 8, 5, 11, 10, 12, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 5, 9, 11, 7, 12, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 2, 5, 0, 4, 12, 1, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 8, 5, 0, 10, 12, 1, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 5, 9, 0, 7, 12, 1, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 2, 11, 2, 10, 12, 10, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 5, 8, 0, 7, 8, 0, afi.bz.Q(), afi.bz.Q(), false);
        for (n2 = 1; n2 <= 11; n2 += 2) {
            this.a(adm22, aqe2, n2, 10, 0, n2, 11, 0, afi.bz.Q(), afi.bz.Q(), false);
            this.a(adm22, aqe2, n2, 10, 12, n2, 11, 12, afi.bz.Q(), afi.bz.Q(), false);
            this.a(adm22, aqe2, 0, 10, n2, 0, 11, n2, afi.bz.Q(), afi.bz.Q(), false);
            this.a(adm22, aqe2, 12, 10, n2, 12, 11, n2, afi.bz.Q(), afi.bz.Q(), false);
            this.a(adm22, afi.by.Q(), n2, 13, 0, aqe2);
            this.a(adm22, afi.by.Q(), n2, 13, 12, aqe2);
            this.a(adm22, afi.by.Q(), 0, 13, n2, aqe2);
            this.a(adm22, afi.by.Q(), 12, 13, n2, aqe2);
            this.a(adm22, afi.bz.Q(), n2 + 1, 13, 0, aqe2);
            this.a(adm22, afi.bz.Q(), n2 + 1, 13, 12, aqe2);
            this.a(adm22, afi.bz.Q(), 0, 13, n2 + 1, aqe2);
            this.a(adm22, afi.bz.Q(), 12, 13, n2 + 1, aqe2);
        }
        this.a(adm22, afi.bz.Q(), 0, 13, 0, aqe2);
        this.a(adm22, afi.bz.Q(), 0, 13, 12, aqe2);
        this.a(adm22, afi.bz.Q(), 0, 13, 0, aqe2);
        this.a(adm22, afi.bz.Q(), 12, 13, 0, aqe2);
        for (n2 = 3; n2 <= 9; n2 += 2) {
            this.a(adm22, aqe2, 1, 7, n2, 1, 8, n2, afi.bz.Q(), afi.bz.Q(), false);
            this.a(adm22, aqe2, 11, 7, n2, 11, 8, n2, afi.bz.Q(), afi.bz.Q(), false);
        }
        this.a(adm22, aqe2, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
        for (n2 = 4; n2 <= 8; ++n2) {
            for (\u2603 = 0; \u2603 <= 2; ++\u2603) {
                this.b(adm22, afi.by.Q(), n2, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), n2, -1, 12 - \u2603, aqe2);
            }
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (\u2603 = 4; \u2603 <= 8; ++\u2603) {
                this.b(adm22, afi.by.Q(), n2, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), 12 - n2, -1, \u2603, aqe2);
            }
        }
        this.a(adm22, aqe2, 5, 5, 5, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 6, 1, 6, 6, 4, 6, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, afi.by.Q(), 6, 0, 6, aqe2);
        this.a(adm22, afi.k.Q(), 6, 5, 6, aqe2);
        cj \u26032 = new cj(this.a(6, 6), this.d(5), this.b(6, 6));
        if (aqe2.b(\u26032)) {
            adm22.a(afi.k, \u26032, random);
        }
        return true;
    }
}
