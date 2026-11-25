/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.j
extends aql.r {
    public aql.j() {
    }

    public aql.j(cq cq2, aql.v v2, Random random) {
        super(1, cq2, v2, 2, 2, 2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 1, 8, 0, 14, 8, 14, a);
        int n = 7;
        alz \u26032 = b;
        this.a(adm2, aqe2, 0, n, 0, 0, n, 15, \u26032, \u26032, false);
        this.a(adm2, aqe2, 15, n, 0, 15, n, 15, \u26032, \u26032, false);
        this.a(adm2, aqe2, 1, n, 0, 15, n, 0, \u26032, \u26032, false);
        this.a(adm2, aqe2, 1, n, 15, 14, n, 15, \u26032, \u26032, false);
        for (n = 1; n <= 6; ++n) {
            \u26032 = b;
            if (n == 2 || n == 6) {
                \u26032 = a;
            }
            for (\u2603 = 0; \u2603 <= 15; \u2603 += 15) {
                this.a(adm2, aqe2, \u2603, n, 0, \u2603, n, 1, \u26032, \u26032, false);
                this.a(adm2, aqe2, \u2603, n, 6, \u2603, n, 9, \u26032, \u26032, false);
                this.a(adm2, aqe2, \u2603, n, 14, \u2603, n, 15, \u26032, \u26032, false);
            }
            this.a(adm2, aqe2, 1, n, 0, 1, n, 0, \u26032, \u26032, false);
            this.a(adm2, aqe2, 6, n, 0, 9, n, 0, \u26032, \u26032, false);
            this.a(adm2, aqe2, 14, n, 0, 14, n, 0, \u26032, \u26032, false);
            this.a(adm2, aqe2, 1, n, 15, 14, n, 15, \u26032, \u26032, false);
        }
        this.a(adm2, aqe2, 6, 3, 6, 9, 6, 9, c, c, false);
        this.a(adm2, aqe2, 7, 4, 7, 8, 5, 8, afi.R.Q(), afi.R.Q(), false);
        for (n = 3; n <= 6; n += 3) {
            for (\u2603 = 6; \u2603 <= 9; \u2603 += 3) {
                this.a(adm2, e, \u2603, n, 6, aqe2);
                this.a(adm2, e, \u2603, n, 9, aqe2);
            }
        }
        this.a(adm2, aqe2, 5, 1, 6, 5, 2, 6, b, b, false);
        this.a(adm2, aqe2, 5, 1, 9, 5, 2, 9, b, b, false);
        this.a(adm2, aqe2, 10, 1, 6, 10, 2, 6, b, b, false);
        this.a(adm2, aqe2, 10, 1, 9, 10, 2, 9, b, b, false);
        this.a(adm2, aqe2, 6, 1, 5, 6, 2, 5, b, b, false);
        this.a(adm2, aqe2, 9, 1, 5, 9, 2, 5, b, b, false);
        this.a(adm2, aqe2, 6, 1, 10, 6, 2, 10, b, b, false);
        this.a(adm2, aqe2, 9, 1, 10, 9, 2, 10, b, b, false);
        this.a(adm2, aqe2, 5, 2, 5, 5, 6, 5, b, b, false);
        this.a(adm2, aqe2, 5, 2, 10, 5, 6, 10, b, b, false);
        this.a(adm2, aqe2, 10, 2, 5, 10, 6, 5, b, b, false);
        this.a(adm2, aqe2, 10, 2, 10, 10, 6, 10, b, b, false);
        this.a(adm2, aqe2, 5, 7, 1, 5, 7, 6, b, b, false);
        this.a(adm2, aqe2, 10, 7, 1, 10, 7, 6, b, b, false);
        this.a(adm2, aqe2, 5, 7, 9, 5, 7, 14, b, b, false);
        this.a(adm2, aqe2, 10, 7, 9, 10, 7, 14, b, b, false);
        this.a(adm2, aqe2, 1, 7, 5, 6, 7, 5, b, b, false);
        this.a(adm2, aqe2, 1, 7, 10, 6, 7, 10, b, b, false);
        this.a(adm2, aqe2, 9, 7, 5, 14, 7, 5, b, b, false);
        this.a(adm2, aqe2, 9, 7, 10, 14, 7, 10, b, b, false);
        this.a(adm2, aqe2, 2, 1, 2, 2, 1, 3, b, b, false);
        this.a(adm2, aqe2, 3, 1, 2, 3, 1, 2, b, b, false);
        this.a(adm2, aqe2, 13, 1, 2, 13, 1, 3, b, b, false);
        this.a(adm2, aqe2, 12, 1, 2, 12, 1, 2, b, b, false);
        this.a(adm2, aqe2, 2, 1, 12, 2, 1, 13, b, b, false);
        this.a(adm2, aqe2, 3, 1, 13, 3, 1, 13, b, b, false);
        this.a(adm2, aqe2, 13, 1, 12, 13, 1, 13, b, b, false);
        this.a(adm2, aqe2, 12, 1, 13, 12, 1, 13, b, b, false);
        return true;
    }
}
