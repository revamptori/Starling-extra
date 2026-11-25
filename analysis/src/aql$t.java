/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.t
extends aql.r {
    public aql.t() {
    }

    public aql.t(cq cq2, aql.v v2, Random random) {
        super(1, cq2, v2, 1, 1, 1);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        if (this.k.a / 25 > 0) {
            this.a(adm22, aqe2, 0, 0, this.k.c[cq.a.a()]);
        }
        if (this.k.b[cq.b.a()] == null) {
            this.a(adm22, aqe2, 1, 4, 1, 6, 4, 6, a);
        }
        for (int i2 = 1; i2 <= 6; ++i2) {
            for (\u2603 = 1; \u2603 <= 6; ++\u2603) {
                if (random.nextInt(3) == 0) continue;
                \u2603 = 2 + (random.nextInt(4) == 0 ? 0 : 1);
                this.a(adm22, aqe2, i2, \u2603, \u2603, i2, 3, \u2603, afi.v.a(1), afi.v.a(1), false);
            }
        }
        this.a(adm22, aqe2, 0, 1, 0, 0, 1, 7, b, b, false);
        this.a(adm22, aqe2, 7, 1, 0, 7, 1, 7, b, b, false);
        this.a(adm22, aqe2, 1, 1, 0, 6, 1, 0, b, b, false);
        this.a(adm22, aqe2, 1, 1, 7, 6, 1, 7, b, b, false);
        this.a(adm22, aqe2, 0, 2, 0, 0, 2, 7, c, c, false);
        this.a(adm22, aqe2, 7, 2, 0, 7, 2, 7, c, c, false);
        this.a(adm22, aqe2, 1, 2, 0, 6, 2, 0, c, c, false);
        this.a(adm22, aqe2, 1, 2, 7, 6, 2, 7, c, c, false);
        this.a(adm22, aqe2, 0, 3, 0, 0, 3, 7, b, b, false);
        this.a(adm22, aqe2, 7, 3, 0, 7, 3, 7, b, b, false);
        this.a(adm22, aqe2, 1, 3, 0, 6, 3, 0, b, b, false);
        this.a(adm22, aqe2, 1, 3, 7, 6, 3, 7, b, b, false);
        this.a(adm22, aqe2, 0, 1, 3, 0, 2, 4, c, c, false);
        this.a(adm22, aqe2, 7, 1, 3, 7, 2, 4, c, c, false);
        this.a(adm22, aqe2, 3, 1, 0, 4, 2, 0, c, c, false);
        this.a(adm22, aqe2, 3, 1, 7, 4, 2, 7, c, c, false);
        if (this.k.c[cq.d.a()]) {
            this.a(adm22, aqe2, 3, 1, 0, 4, 2, 0, false);
        }
        return true;
    }
}
