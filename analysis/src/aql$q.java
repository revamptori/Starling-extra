/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.q
extends aql.r {
    public aql.q() {
    }

    public aql.q(cq cq2, aqe aqe2) {
        super(cq2, aqe2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        int \u26032;
        this.a(adm22, aqe2, 2, -1, 2, 11, -1, 11, b, b, false);
        this.a(adm22, aqe2, 0, -1, 0, 1, -1, 11, a, a, false);
        this.a(adm22, aqe2, 12, -1, 0, 13, -1, 11, a, a, false);
        this.a(adm22, aqe2, 2, -1, 0, 11, -1, 1, a, a, false);
        this.a(adm22, aqe2, 2, -1, 12, 11, -1, 13, a, a, false);
        this.a(adm22, aqe2, 0, 0, 0, 0, 0, 13, b, b, false);
        this.a(adm22, aqe2, 13, 0, 0, 13, 0, 13, b, b, false);
        this.a(adm22, aqe2, 1, 0, 0, 12, 0, 0, b, b, false);
        this.a(adm22, aqe2, 1, 0, 13, 12, 0, 13, b, b, false);
        for (\u26032 = 2; \u26032 <= 11; \u26032 += 3) {
            this.a(adm22, e, 0, 0, \u26032, aqe2);
            this.a(adm22, e, 13, 0, \u26032, aqe2);
            this.a(adm22, e, \u26032, 0, 0, aqe2);
        }
        this.a(adm22, aqe2, 2, 0, 3, 4, 0, 9, b, b, false);
        this.a(adm22, aqe2, 9, 0, 3, 11, 0, 9, b, b, false);
        this.a(adm22, aqe2, 4, 0, 9, 9, 0, 11, b, b, false);
        this.a(adm22, b, 5, 0, 8, aqe2);
        this.a(adm22, b, 8, 0, 8, aqe2);
        this.a(adm22, b, 10, 0, 10, aqe2);
        this.a(adm22, b, 3, 0, 10, aqe2);
        this.a(adm22, aqe2, 3, 0, 3, 3, 0, 7, c, c, false);
        this.a(adm22, aqe2, 10, 0, 3, 10, 0, 7, c, c, false);
        this.a(adm22, aqe2, 6, 0, 10, 7, 0, 10, c, c, false);
        \u26032 = 3;
        for (int i = 0; i < 2; ++i) {
            for (\u2603 = 2; \u2603 <= 8; \u2603 += 3) {
                this.a(adm22, aqe2, \u26032, 0, \u2603, \u26032, 2, \u2603, b, b, false);
            }
            \u26032 = 10;
        }
        this.a(adm22, aqe2, 5, 0, 10, 5, 2, 10, b, b, false);
        this.a(adm22, aqe2, 8, 0, 10, 8, 2, 10, b, b, false);
        this.a(adm22, aqe2, 6, -1, 7, 7, -1, 8, c, c, false);
        this.a(adm22, aqe2, 6, -1, 3, 7, -1, 4, false);
        this.a(adm22, aqe2, 6, 1, 6);
        return true;
    }
}
