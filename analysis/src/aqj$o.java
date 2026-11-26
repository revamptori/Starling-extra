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

public static class aqj.o
extends aqj.m {
    public aqj.o() {
    }

    public aqj.o(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 2, 0, false);
        this.b((aqj.q)aqt2, list, random, 0, 2, false);
        this.c((aqj.q)aqt2, list, random, 0, 2, false);
    }

    public static aqj.o a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, cq2);
        if (!aqj.o.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.o(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 6, 1, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 6, 7, 6, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 1, 6, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 6, 1, 6, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 5, 2, 0, 6, 6, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 5, 2, 6, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 0, 6, 1, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 5, 0, 6, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 2, 0, 6, 6, 1, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 2, 5, 6, 6, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 2, 6, 0, 4, 6, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 2, 5, 0, 4, 5, 0, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 2, 6, 6, 4, 6, 6, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 2, 5, 6, 4, 5, 6, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 0, 6, 2, 0, 6, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 5, 2, 0, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 6, 6, 2, 6, 6, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 6, 5, 2, 6, 5, 4, afi.bz.Q(), afi.bz.Q(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (\u2603 = 0; \u2603 <= 6; ++\u2603) {
                this.b(adm2, afi.by.Q(), i2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
