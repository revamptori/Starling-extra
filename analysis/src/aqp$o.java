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

public static class aqp.o
extends aqp.p {
    public aqp.o() {
    }

    public aqp.o(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqp.m)aqt2, list, random, 1, 1);
    }

    public static aqp.o a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -1, -7, 0, 5, 11, 8, cq2);
        if (!aqp.o.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.o(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 4, 10, 7, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 7, 0);
        this.a(adm2, random, aqe2, aqp.p.a.a, 1, 1, 7);
        int n2 = this.a(afi.aw, 2);
        for (\u2603 = 0; \u2603 < 6; ++\u2603) {
            this.a(adm2, afi.aw.a(n2), 1, 6 - \u2603, 1 + \u2603, aqe2);
            this.a(adm2, afi.aw.a(n2), 2, 6 - \u2603, 1 + \u2603, aqe2);
            this.a(adm2, afi.aw.a(n2), 3, 6 - \u2603, 1 + \u2603, aqe2);
            if (\u2603 >= 5) continue;
            this.a(adm2, afi.bf.Q(), 1, 5 - \u2603, 1 + \u2603, aqe2);
            this.a(adm2, afi.bf.Q(), 2, 5 - \u2603, 1 + \u2603, aqe2);
            this.a(adm2, afi.bf.Q(), 3, 5 - \u2603, 1 + \u2603, aqe2);
        }
        return true;
    }
}
