/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aql.n
extends aql.r {
    public aql.n() {
    }

    public aql.n(cq cq2, aql.v v2, Random random) {
        super(1, cq2, v2, 1, 2, 2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        aql.v v2;
        alz alz2;
        int n2;
        aql.v v3 = this.k.b[cq.c.a()];
        v2 = this.k;
        \u2603 = v3.b[cq.b.a()];
        \u2603 = v2.b[cq.b.a()];
        if (this.k.a / 25 > 0) {
            this.a(adm2, aqe2, 0, 8, v3.c[cq.a.a()]);
            this.a(adm2, aqe2, 0, 0, v2.c[cq.a.a()]);
        }
        if (\u2603.b[cq.b.a()] == null) {
            this.a(adm2, aqe2, 1, 8, 1, 6, 8, 7, a);
        }
        if (\u2603.b[cq.b.a()] == null) {
            this.a(adm2, aqe2, 1, 8, 8, 6, 8, 14, a);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            alz2 = b;
            if (n2 == 2 || n2 == 6) {
                alz2 = a;
            }
            this.a(adm2, aqe2, 0, n2, 0, 0, n2, 15, alz2, alz2, false);
            this.a(adm2, aqe2, 7, n2, 0, 7, n2, 15, alz2, alz2, false);
            this.a(adm2, aqe2, 1, n2, 0, 6, n2, 0, alz2, alz2, false);
            this.a(adm2, aqe2, 1, n2, 15, 6, n2, 15, alz2, alz2, false);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            alz2 = c;
            if (n2 == 2 || n2 == 6) {
                alz2 = e;
            }
            this.a(adm2, aqe2, 3, n2, 7, 4, n2, 8, alz2, alz2, false);
        }
        if (v2.c[cq.d.a()]) {
            this.a(adm2, aqe2, 3, 1, 0, 4, 2, 0, false);
        }
        if (v2.c[cq.f.a()]) {
            this.a(adm2, aqe2, 7, 1, 3, 7, 2, 4, false);
        }
        if (v2.c[cq.e.a()]) {
            this.a(adm2, aqe2, 0, 1, 3, 0, 2, 4, false);
        }
        if (v3.c[cq.c.a()]) {
            this.a(adm2, aqe2, 3, 1, 15, 4, 2, 15, false);
        }
        if (v3.c[cq.e.a()]) {
            this.a(adm2, aqe2, 0, 1, 11, 0, 2, 12, false);
        }
        if (v3.c[cq.f.a()]) {
            this.a(adm2, aqe2, 7, 1, 11, 7, 2, 12, false);
        }
        if (\u2603.c[cq.d.a()]) {
            this.a(adm2, aqe2, 3, 5, 0, 4, 6, 0, false);
        }
        if (\u2603.c[cq.f.a()]) {
            this.a(adm2, aqe2, 7, 5, 3, 7, 6, 4, false);
            this.a(adm2, aqe2, 5, 4, 2, 6, 4, 5, b, b, false);
            this.a(adm2, aqe2, 6, 1, 2, 6, 3, 2, b, b, false);
            this.a(adm2, aqe2, 6, 1, 5, 6, 3, 5, b, b, false);
        }
        if (\u2603.c[cq.e.a()]) {
            this.a(adm2, aqe2, 0, 5, 3, 0, 6, 4, false);
            this.a(adm2, aqe2, 1, 4, 2, 2, 4, 5, b, b, false);
            this.a(adm2, aqe2, 1, 1, 2, 1, 3, 2, b, b, false);
            this.a(adm2, aqe2, 1, 1, 5, 1, 3, 5, b, b, false);
        }
        if (\u2603.c[cq.c.a()]) {
            this.a(adm2, aqe2, 3, 5, 15, 4, 6, 15, false);
        }
        if (\u2603.c[cq.e.a()]) {
            this.a(adm2, aqe2, 0, 5, 11, 0, 6, 12, false);
            this.a(adm2, aqe2, 1, 4, 10, 2, 4, 13, b, b, false);
            this.a(adm2, aqe2, 1, 1, 10, 1, 3, 10, b, b, false);
            this.a(adm2, aqe2, 1, 1, 13, 1, 3, 13, b, b, false);
        }
        if (\u2603.c[cq.f.a()]) {
            this.a(adm2, aqe2, 7, 5, 11, 7, 6, 12, false);
            this.a(adm2, aqe2, 5, 4, 10, 6, 4, 13, b, b, false);
            this.a(adm2, aqe2, 6, 1, 10, 6, 3, 10, b, b, false);
            this.a(adm2, aqe2, 6, 1, 13, 6, 3, 13, b, b, false);
        }
        return true;
    }
}
