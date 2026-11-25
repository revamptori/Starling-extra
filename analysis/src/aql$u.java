/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.u
extends aql.r {
    private int o;

    public aql.u() {
    }

    public aql.u(cq cq2, aqe aqe2, int n) {
        super(cq2, aqe2);
        this.o = n & 1;
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        if (this.o == 0) {
            int n;
            for (n = 0; n < 4; ++n) {
                this.a(adm22, aqe2, 10 - n, 3 - n, 20 - n, 12 + n, 3 - n, 20, b, b, false);
            }
            this.a(adm22, aqe2, 7, 0, 6, 15, 0, 16, b, b, false);
            this.a(adm22, aqe2, 6, 0, 6, 6, 3, 20, b, b, false);
            this.a(adm22, aqe2, 16, 0, 6, 16, 3, 20, b, b, false);
            this.a(adm22, aqe2, 7, 1, 7, 7, 1, 20, b, b, false);
            this.a(adm22, aqe2, 15, 1, 7, 15, 1, 20, b, b, false);
            this.a(adm22, aqe2, 7, 1, 6, 9, 3, 6, b, b, false);
            this.a(adm22, aqe2, 13, 1, 6, 15, 3, 6, b, b, false);
            this.a(adm22, aqe2, 8, 1, 7, 9, 1, 7, b, b, false);
            this.a(adm22, aqe2, 13, 1, 7, 14, 1, 7, b, b, false);
            this.a(adm22, aqe2, 9, 0, 5, 13, 0, 5, b, b, false);
            this.a(adm22, aqe2, 10, 0, 7, 12, 0, 7, c, c, false);
            this.a(adm22, aqe2, 8, 0, 10, 8, 0, 12, c, c, false);
            this.a(adm22, aqe2, 14, 0, 10, 14, 0, 12, c, c, false);
            for (n = 18; n >= 7; n -= 3) {
                this.a(adm22, e, 6, 3, n, aqe2);
                this.a(adm22, e, 16, 3, n, aqe2);
            }
            this.a(adm22, e, 10, 0, 10, aqe2);
            this.a(adm22, e, 12, 0, 10, aqe2);
            this.a(adm22, e, 10, 0, 12, aqe2);
            this.a(adm22, e, 12, 0, 12, aqe2);
            this.a(adm22, e, 8, 3, 6, aqe2);
            this.a(adm22, e, 14, 3, 6, aqe2);
            this.a(adm22, b, 4, 2, 4, aqe2);
            this.a(adm22, e, 4, 1, 4, aqe2);
            this.a(adm22, b, 4, 0, 4, aqe2);
            this.a(adm22, b, 18, 2, 4, aqe2);
            this.a(adm22, e, 18, 1, 4, aqe2);
            this.a(adm22, b, 18, 0, 4, aqe2);
            this.a(adm22, b, 4, 2, 18, aqe2);
            this.a(adm22, e, 4, 1, 18, aqe2);
            this.a(adm22, b, 4, 0, 18, aqe2);
            this.a(adm22, b, 18, 2, 18, aqe2);
            this.a(adm22, e, 18, 1, 18, aqe2);
            this.a(adm22, b, 18, 0, 18, aqe2);
            this.a(adm22, b, 9, 7, 20, aqe2);
            this.a(adm22, b, 13, 7, 20, aqe2);
            this.a(adm22, aqe2, 6, 0, 21, 7, 4, 21, b, b, false);
            this.a(adm22, aqe2, 15, 0, 21, 16, 4, 21, b, b, false);
            this.a(adm22, aqe2, 11, 2, 16);
        } else if (this.o == 1) {
            int n;
            this.a(adm22, aqe2, 9, 3, 18, 13, 3, 20, b, b, false);
            this.a(adm22, aqe2, 9, 0, 18, 9, 2, 18, b, b, false);
            this.a(adm22, aqe2, 13, 0, 18, 13, 2, 18, b, b, false);
            int \u26032 = 9;
            int \u26033 = 20;
            int \u26034 = 5;
            for (n = 0; n < 2; ++n) {
                this.a(adm22, b, \u26032, \u26034 + 1, \u26033, aqe2);
                this.a(adm22, e, \u26032, \u26034, \u26033, aqe2);
                this.a(adm22, b, \u26032, \u26034 - 1, \u26033, aqe2);
                \u26032 = 13;
            }
            this.a(adm22, aqe2, 7, 3, 7, 15, 3, 14, b, b, false);
            \u26032 = 10;
            for (n = 0; n < 2; ++n) {
                this.a(adm22, aqe2, \u26032, 0, 10, \u26032, 6, 10, b, b, false);
                this.a(adm22, aqe2, \u26032, 0, 12, \u26032, 6, 12, b, b, false);
                this.a(adm22, e, \u26032, 0, 10, aqe2);
                this.a(adm22, e, \u26032, 0, 12, aqe2);
                this.a(adm22, e, \u26032, 4, 10, aqe2);
                this.a(adm22, e, \u26032, 4, 12, aqe2);
                \u26032 = 12;
            }
            \u26032 = 8;
            for (n = 0; n < 2; ++n) {
                this.a(adm22, aqe2, \u26032, 0, 7, \u26032, 2, 7, b, b, false);
                this.a(adm22, aqe2, \u26032, 0, 14, \u26032, 2, 14, b, b, false);
                \u26032 = 14;
            }
            this.a(adm22, aqe2, 8, 3, 8, 8, 3, 13, c, c, false);
            this.a(adm22, aqe2, 14, 3, 8, 14, 3, 13, c, c, false);
            this.a(adm22, aqe2, 11, 5, 13);
        }
        return true;
    }
}
