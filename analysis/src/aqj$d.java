/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public static class aqj.d
extends aqj.m {
    public aqj.d() {
    }

    public aqj.d(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 1, 0, true);
    }

    public static aqj.d a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, cq2);
        if (!aqj.d.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.d(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n2 = this.a(afi.bA, 2);
        for (\u2603 = 0; \u2603 <= 9; ++\u2603) {
            \u2603 = Math.max((int)1, (int)(7 - \u2603));
            \u2603 = Math.min((int)Math.max((int)(\u2603 + 5), (int)(14 - \u2603)), (int)13);
            \u2603 = \u2603;
            this.a(adm2, aqe2, 0, 0, \u2603, 4, \u2603, \u2603, afi.by.Q(), afi.by.Q(), false);
            this.a(adm2, aqe2, 1, \u2603 + 1, \u2603, 3, \u2603 - 1, \u2603, afi.a.Q(), afi.a.Q(), false);
            if (\u2603 <= 6) {
                this.a(adm2, afi.bA.a(n2), 1, \u2603 + 1, \u2603, aqe2);
                this.a(adm2, afi.bA.a(n2), 2, \u2603 + 1, \u2603, aqe2);
                this.a(adm2, afi.bA.a(n2), 3, \u2603 + 1, \u2603, aqe2);
            }
            this.a(adm2, aqe2, 0, \u2603, \u2603, 4, \u2603, \u2603, afi.by.Q(), afi.by.Q(), false);
            this.a(adm2, aqe2, 0, \u2603 + 1, \u2603, 0, \u2603 - 1, \u2603, afi.by.Q(), afi.by.Q(), false);
            this.a(adm2, aqe2, 4, \u2603 + 1, \u2603, 4, \u2603 - 1, \u2603, afi.by.Q(), afi.by.Q(), false);
            if ((\u2603 & 1) == 0) {
                this.a(adm2, aqe2, 0, \u2603 + 2, \u2603, 0, \u2603 + 3, \u2603, afi.bz.Q(), afi.bz.Q(), false);
                this.a(adm2, aqe2, 4, \u2603 + 2, \u2603, 4, \u2603 + 3, \u2603, afi.bz.Q(), afi.bz.Q(), false);
            }
            for (\u2603 = 0; \u2603 <= 4; ++\u2603) {
                this.b(adm2, afi.by.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
