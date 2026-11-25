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

public static class aqw.c
extends aqw.n {
    private afh a;
    private afh b;

    public aqw.c() {
    }

    public aqw.c(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
        this.a = this.a(random);
        this.b = this.a(random);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("CA", afh.c.b(this.a));
        dn2.a("CB", afh.c.b(this.b));
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = afh.c(dn2.f("CA"));
        this.b = afh.c(dn2.f("CB"));
    }

    private afh a(Random random) {
        switch (random.nextInt(5)) {
            default: {
                return afi.aj;
            }
            case 0: {
                return afi.cb;
            }
            case 1: 
        }
        return afi.cc;
    }

    public static aqw.c a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 7, 4, 9, cq2);
        if (!aqw.c.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.c(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n2;
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 4 - 1, 0);
        }
        this.a(adm2, aqe2, 0, 1, 0, 6, 4, 8, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
        this.a(adm2, aqe2, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
        this.a(adm2, aqe2, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 1, 0, 0, 5, 0, 0, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 1, 0, 8, 5, 0, 8, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
        for (n2 = 1; n2 <= 7; ++n2) {
            this.a(adm2, this.a.a(ns.a(random, 2, 7)), 1, 1, n2, aqe2);
            this.a(adm2, this.a.a(ns.a(random, 2, 7)), 2, 1, n2, aqe2);
            this.a(adm2, this.b.a(ns.a(random, 2, 7)), 4, 1, n2, aqe2);
            this.a(adm2, this.b.a(ns.a(random, 2, 7)), 5, 1, n2, aqe2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (\u2603 = 0; \u2603 < 7; ++\u2603) {
                this.b(adm2, \u2603, 4, n2, aqe2);
                this.b(adm2, afi.d.Q(), \u2603, -1, n2, aqe2);
            }
        }
        return true;
    }
}
