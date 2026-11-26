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

public static class aqp.c
extends aqp.p {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean e;

    public aqp.c() {
    }

    public aqp.c(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
        this.a = random.nextBoolean();
        this.b = random.nextBoolean();
        this.c = random.nextBoolean();
        this.e = random.nextInt(3) > 0;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("leftLow", this.a);
        dn2.a("leftHigh", this.b);
        dn2.a("rightLow", this.c);
        dn2.a("rightHigh", this.e);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.n("leftLow");
        this.b = dn2.n("leftHigh");
        this.c = dn2.n("rightLow");
        this.e = dn2.n("rightHigh");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        int n = 3;
        \u2603 = 5;
        if (this.m == cq.e || this.m == cq.c) {
            n = 8 - n;
            \u2603 = 8 - \u2603;
        }
        this.a((aqp.m)aqt2, list, random, 5, 1);
        if (this.a) {
            this.b((aqp.m)aqt2, list, random, n, 1);
        }
        if (this.b) {
            this.b((aqp.m)aqt2, list, random, \u2603, 7);
        }
        if (this.c) {
            this.c((aqp.m)aqt2, list, random, n, 1);
        }
        if (this.e) {
            this.c((aqp.m)aqt2, list, random, \u2603, 7);
        }
    }

    public static aqp.c a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, cq2);
        if (!aqp.c.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.c(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 9, 8, 10, true, random, e);
        this.a(adm2, random, aqe2, this.d, 4, 3, 0);
        if (this.a) {
            this.a(adm2, aqe2, 0, 3, 1, 0, 5, 3, afi.a.Q(), afi.a.Q(), false);
        }
        if (this.c) {
            this.a(adm2, aqe2, 9, 3, 1, 9, 5, 3, afi.a.Q(), afi.a.Q(), false);
        }
        if (this.b) {
            this.a(adm2, aqe2, 0, 5, 7, 0, 7, 9, afi.a.Q(), afi.a.Q(), false);
        }
        if (this.e) {
            this.a(adm2, aqe2, 9, 5, 7, 9, 7, 9, afi.a.Q(), afi.a.Q(), false);
        }
        this.a(adm2, aqe2, 5, 1, 10, 7, 3, 10, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 2, 1, 8, 2, 6, false, random, e);
        this.a(adm2, aqe2, 4, 1, 5, 4, 4, 9, false, random, e);
        this.a(adm2, aqe2, 8, 1, 5, 8, 4, 9, false, random, e);
        this.a(adm2, aqe2, 1, 4, 7, 3, 4, 9, false, random, e);
        this.a(adm2, aqe2, 1, 3, 5, 3, 3, 6, false, random, e);
        this.a(adm2, aqe2, 1, 3, 4, 3, 3, 4, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 1, 4, 6, 3, 4, 6, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 5, 1, 7, 7, 1, 8, false, random, e);
        this.a(adm2, aqe2, 5, 1, 9, 7, 1, 9, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 5, 2, 7, 7, 2, 7, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 4, 5, 7, 4, 5, 9, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 8, 5, 7, 8, 5, 9, afi.U.Q(), afi.U.Q(), false);
        this.a(adm2, aqe2, 5, 5, 7, 7, 5, 9, afi.T.Q(), afi.T.Q(), false);
        this.a(adm2, afi.aa.Q(), 6, 5, 6, aqe2);
        return true;
    }
}
