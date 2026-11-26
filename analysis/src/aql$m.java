/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.m
extends aql.r {
    public aql.m() {
    }

    public aql.m(cq cq2, aql.v v2, Random random) {
        super(1, cq2, v2, 1, 2, 1);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.k.a / 25 > 0) {
            this.a(adm2, aqe2, 0, 0, this.k.c[cq.a.a()]);
        }
        aql.v v2 = this.k.b[cq.b.a()];
        if (v2.b[cq.b.a()] == null) {
            this.a(adm2, aqe2, 1, 8, 1, 6, 8, 6, a);
        }
        this.a(adm2, aqe2, 0, 4, 0, 0, 4, 7, b, b, false);
        this.a(adm2, aqe2, 7, 4, 0, 7, 4, 7, b, b, false);
        this.a(adm2, aqe2, 1, 4, 0, 6, 4, 0, b, b, false);
        this.a(adm2, aqe2, 1, 4, 7, 6, 4, 7, b, b, false);
        this.a(adm2, aqe2, 2, 4, 1, 2, 4, 2, b, b, false);
        this.a(adm2, aqe2, 1, 4, 2, 1, 4, 2, b, b, false);
        this.a(adm2, aqe2, 5, 4, 1, 5, 4, 2, b, b, false);
        this.a(adm2, aqe2, 6, 4, 2, 6, 4, 2, b, b, false);
        this.a(adm2, aqe2, 2, 4, 5, 2, 4, 6, b, b, false);
        this.a(adm2, aqe2, 1, 4, 5, 1, 4, 5, b, b, false);
        this.a(adm2, aqe2, 5, 4, 5, 5, 4, 6, b, b, false);
        this.a(adm2, aqe2, 6, 4, 5, 6, 4, 5, b, b, false);
        v3 = this.k;
        for (int i2 = 1; i2 <= 5; i2 += 4) {
            \u2603 = 0;
            if (v3.c[cq.d.a()]) {
                this.a(adm2, aqe2, 2, i2, \u2603, 2, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 5, i2, \u2603, 5, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 3, i2 + 2, \u2603, 4, i2 + 2, \u2603, b, b, false);
            } else {
                this.a(adm2, aqe2, 0, i2, \u2603, 7, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 0, i2 + 1, \u2603, 7, i2 + 1, \u2603, a, a, false);
            }
            \u2603 = 7;
            if (v3.c[cq.c.a()]) {
                this.a(adm2, aqe2, 2, i2, \u2603, 2, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 5, i2, \u2603, 5, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 3, i2 + 2, \u2603, 4, i2 + 2, \u2603, b, b, false);
            } else {
                this.a(adm2, aqe2, 0, i2, \u2603, 7, i2 + 2, \u2603, b, b, false);
                this.a(adm2, aqe2, 0, i2 + 1, \u2603, 7, i2 + 1, \u2603, a, a, false);
            }
            \u2603 = 0;
            if (v3.c[cq.e.a()]) {
                this.a(adm2, aqe2, \u2603, i2, 2, \u2603, i2 + 2, 2, b, b, false);
                this.a(adm2, aqe2, \u2603, i2, 5, \u2603, i2 + 2, 5, b, b, false);
                this.a(adm2, aqe2, \u2603, i2 + 2, 3, \u2603, i2 + 2, 4, b, b, false);
            } else {
                this.a(adm2, aqe2, \u2603, i2, 0, \u2603, i2 + 2, 7, b, b, false);
                this.a(adm2, aqe2, \u2603, i2 + 1, 0, \u2603, i2 + 1, 7, a, a, false);
            }
            \u2603 = 7;
            if (v3.c[cq.f.a()]) {
                this.a(adm2, aqe2, \u2603, i2, 2, \u2603, i2 + 2, 2, b, b, false);
                this.a(adm2, aqe2, \u2603, i2, 5, \u2603, i2 + 2, 5, b, b, false);
                this.a(adm2, aqe2, \u2603, i2 + 2, 3, \u2603, i2 + 2, 4, b, b, false);
            } else {
                this.a(adm2, aqe2, \u2603, i2, 0, \u2603, i2 + 2, 7, b, b, false);
                this.a(adm2, aqe2, \u2603, i2 + 1, 0, \u2603, i2 + 1, 7, a, a, false);
            }
            aql.v v3 = v2;
        }
        return true;
    }
}
