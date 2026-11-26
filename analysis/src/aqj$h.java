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

public static class aqj.h
extends aqj.m {
    private boolean b;

    public aqj.h() {
    }

    public aqj.h(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
        this.b = random.nextInt(3) == 0;
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.n("Chest");
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Chest", this.b);
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.b((aqj.q)aqt2, list, random, 0, 1, true);
    }

    public static aqj.h a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, cq2);
        if (!aqj.h.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.h(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        this.a(adm2, aqe2, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 4, 2, 0, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 4, 3, 1, 4, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 4, 3, 3, 4, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
        this.a(adm2, aqe2, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 0, 2, 4, 3, 5, 4, afi.by.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
        this.a(adm2, aqe2, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
        if (this.b && aqe2.b(new cj(this.a(3, 3), this.d(2), this.b(3, 3)))) {
            this.b = false;
            this.a(adm2, aqe2, random, 3, 2, 3, (List<ob>)a, 2 + random.nextInt(4));
        }
        this.a(adm2, aqe2, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (\u2603 = 0; \u2603 <= 4; ++\u2603) {
                this.b(adm2, afi.by.Q(), i2, -1, \u2603, aqe2);
            }
        }
        return true;
    }
}
