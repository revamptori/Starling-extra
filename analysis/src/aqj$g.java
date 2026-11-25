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

public static class aqj.g
extends aqj.m {
    public aqj.g() {
    }

    public aqj.g(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 1, 0, true);
        this.b((aqj.q)aqt2, list, random, 0, 1, true);
        this.c((aqj.q)aqt2, list, random, 0, 1, true);
    }

    public static aqj.g a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, cq2);
        if (!aqj.g.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.g(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 4, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 4, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (\u2603 = 0; \u2603 <= 4; ++\u2603) {
                this.b(adm2, afi.by.Q(), i2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
