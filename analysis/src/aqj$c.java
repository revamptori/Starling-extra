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

public static class aqj.c
extends aqj.m {
    public aqj.c() {
    }

    public aqj.c(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 1, 3, false);
    }

    public static aqj.c a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -3, 0, 5, 10, 19, cq2);
        if (!aqj.c.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.c(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        this.a(adm22, aqe2, 0, 3, 0, 4, 4, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 1, 5, 0, 3, 7, 18, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 5, 0, 0, 5, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 4, 5, 0, 4, 5, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 2, 0, 4, 2, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 2, 13, 4, 2, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 0, 0, 4, 1, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 0, 15, 4, 1, 18, afi.by.Q(), afi.by.Q(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (\u2603 = 0; \u2603 <= 2; ++\u2603) {
                this.b(adm22, afi.by.Q(), i2, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), i2, -1, 18 - \u2603, aqe2);
            }
        }
        this.a(adm22, aqe2, 0, 1, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 0, 3, 4, 0, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 0, 3, 14, 0, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 0, 1, 17, 0, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 4, 1, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 4, 3, 4, 4, 4, 4, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 4, 3, 14, 4, 4, 14, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm22, aqe2, 4, 1, 17, 4, 4, 17, afi.bz.Q(), afi.bz.Q(), false);
        return true;
    }
}
