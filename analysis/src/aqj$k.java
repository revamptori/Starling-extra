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

public static class aqj.k
extends aqj.m {
    public aqj.k() {
    }

    public aqj.k(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 5, 3, true);
        this.a((aqj.q)aqt2, list, random, 5, 11, true);
    }

    public static aqj.k a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, cq2);
        if (!aqj.k.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.k(n5, random, aqe2, cq2);
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
        n2 = this.a(afi.bA, 3);
        for (\u2603 = 0; \u2603 <= 6; ++\u2603) {
            \u2603 = \u2603 + 4;
            for (\u2603 = 5; \u2603 <= 7; ++\u2603) {
                this.a(adm22, afi.bA.a(n2), \u2603, 5 + \u2603, \u2603, aqe2);
            }
            if (\u2603 >= 5 && \u2603 <= 8) {
                this.a(adm22, aqe2, 5, 5, \u2603, 7, \u2603 + 4, \u2603, afi.by.Q(), afi.by.Q(), false);
            } else if (\u2603 >= 9 && \u2603 <= 10) {
                this.a(adm22, aqe2, 5, 8, \u2603, 7, \u2603 + 4, \u2603, afi.by.Q(), afi.by.Q(), false);
            }
            if (\u2603 < 1) continue;
            this.a(adm22, aqe2, 5, 6 + \u2603, \u2603, 7, 9 + \u2603, \u2603, afi.a.Q(), afi.a.Q(), false);
        }
        for (\u2603 = 5; \u2603 <= 7; ++\u2603) {
            this.a(adm22, afi.bA.a(n2), \u2603, 12, 11, aqe2);
        }
        this.a(adm22, aqe2, 5, 6, 7, 5, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 7, 6, 7, 7, 7, 7, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 5, 13, 12, 7, 13, 12, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 2, 5, 2, 3, 5, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 2, 5, 9, 3, 5, 10, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 2, 5, 4, 2, 5, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 9, 5, 2, 10, 5, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 9, 5, 9, 10, 5, 10, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 10, 5, 4, 10, 5, 8, afi.by.Q(), afi.by.Q(), false);
        \u2603 = this.a(afi.bA, 0);
        \u2603 = this.a(afi.bA, 1);
        this.a(adm22, afi.bA.a(\u2603), 4, 5, 2, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 4, 5, 3, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 4, 5, 9, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 4, 5, 10, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 8, 5, 2, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 8, 5, 3, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 8, 5, 9, aqe2);
        this.a(adm22, afi.bA.a(\u2603), 8, 5, 10, aqe2);
        this.a(adm22, aqe2, 3, 4, 4, 4, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
        this.a(adm22, aqe2, 8, 4, 4, 9, 4, 8, afi.aW.Q(), afi.aW.Q(), false);
        this.a(adm22, aqe2, 3, 5, 4, 4, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
        this.a(adm22, aqe2, 8, 5, 4, 9, 5, 8, afi.bB.Q(), afi.bB.Q(), false);
        this.a(adm22, aqe2, 4, 2, 0, 8, 2, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 2, 4, 12, 2, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 4, 0, 0, 8, 1, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 4, 0, 9, 8, 1, 12, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 0, 4, 3, 1, 8, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 9, 0, 4, 12, 1, 8, afi.by.Q(), afi.by.Q(), false);
        for (\u2603 = 4; \u2603 <= 8; ++\u2603) {
            for (\u2603 = 0; \u2603 <= 2; ++\u2603) {
                this.b(adm22, afi.by.Q(), \u2603, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), \u2603, -1, 12 - \u2603, aqe2);
            }
        }
        for (\u2603 = 0; \u2603 <= 2; ++\u2603) {
            for (\u2603 = 4; \u2603 <= 8; ++\u2603) {
                this.b(adm22, afi.by.Q(), \u2603, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), 12 - \u2603, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
