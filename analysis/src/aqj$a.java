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

public static class aqj.a
extends aqj.m {
    public aqj.a() {
    }

    public aqj.a(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
    }

    protected aqj.a(Random random, int n2, int n3) {
        super(0);
        this.m = cq.c.a.a(random);
        switch (this.m) {
            case c: 
            case d: {
                this.l = new aqe(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
                break;
            }
            default: {
                this.l = new aqe(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
            }
        }
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqj.q)aqt2, list, random, 8, 3, false);
        this.b((aqj.q)aqt2, list, random, 3, 8, false);
        this.c((aqj.q)aqt2, list, random, 3, 8, false);
    }

    public static aqj.a a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, cq2);
        if (!aqj.a.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.a(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        int n2;
        this.a(adm22, aqe2, 7, 3, 0, 11, 4, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 3, 7, 18, 4, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 8, 5, 0, 10, 7, 18, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 5, 8, 18, 7, 10, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 7, 5, 0, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 7, 5, 11, 7, 5, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 11, 5, 0, 11, 5, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 11, 5, 11, 11, 5, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 5, 7, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 11, 5, 7, 18, 5, 7, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 5, 11, 7, 5, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 11, 5, 11, 18, 5, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 7, 2, 0, 11, 2, 5, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 7, 2, 13, 11, 2, 18, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 7, 0, 0, 11, 1, 3, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 7, 0, 15, 11, 1, 18, afi.by.Q(), afi.by.Q(), false);
        for (n2 = 7; n2 <= 11; ++n2) {
            for (\u2603 = 0; \u2603 <= 2; ++\u2603) {
                this.b(adm22, afi.by.Q(), n2, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), n2, -1, 18 - \u2603, aqe2);
            }
        }
        this.a(adm22, aqe2, 0, 2, 7, 5, 2, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 13, 2, 7, 18, 2, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 0, 0, 7, 3, 1, 11, afi.by.Q(), afi.by.Q(), false);
        this.a(adm22, aqe2, 15, 0, 7, 18, 1, 11, afi.by.Q(), afi.by.Q(), false);
        for (n2 = 0; n2 <= 2; ++n2) {
            for (\u2603 = 7; \u2603 <= 11; ++\u2603) {
                this.b(adm22, afi.by.Q(), n2, -1, \u2603, aqe2);
                this.b(adm22, afi.by.Q(), 18 - n2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
