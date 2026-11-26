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

public static class aqg.b
extends aqt {
    private cq a;
    private boolean b;

    public aqg.b() {
    }

    @Override
    protected void a(dn dn2) {
        dn2.a("tf", this.b);
        dn2.a("D", this.a.b());
    }

    @Override
    protected void b(dn dn2) {
        this.b = dn2.n("tf");
        this.a = cq.b(dn2.f("D"));
    }

    public aqg.b(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.a = cq2;
        this.l = aqe2;
        this.b = aqe2.d() > 3;
    }

    public static aqe a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2) {
        aqe aqe2 = new aqe(n, n2, n3, n, n2 + 2, n3);
        if (random.nextInt(4) == 0) {
            aqe2.e += 4;
        }
        switch (cq2) {
            case c: {
                aqe2.a = n - 1;
                aqe2.d = n + 3;
                aqe2.c = n3 - 4;
                break;
            }
            case d: {
                aqe2.a = n - 1;
                aqe2.d = n + 3;
                aqe2.f = n3 + 4;
                break;
            }
            case e: {
                aqe2.a = n - 4;
                aqe2.c = n3 - 1;
                aqe2.f = n3 + 3;
                break;
            }
            case f: {
                aqe2.d = n + 4;
                aqe2.c = n3 - 1;
                aqe2.f = n3 + 3;
            }
        }
        if (aqt.a(list, aqe2) != null) {
            return null;
        }
        return aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        int n = this.d();
        switch (this.a) {
            case c: {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, n);
                break;
            }
            case d: {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, n);
                break;
            }
            case e: {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, n);
                break;
            }
            case f: {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, n);
                aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, n);
            }
        }
        if (this.b) {
            if (random.nextBoolean()) {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cq.c, n);
            }
            if (random.nextBoolean()) {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cq.e, n);
            }
            if (random.nextBoolean()) {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cq.f, n);
            }
            if (random.nextBoolean()) {
                aqg.b(aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cq.d, n);
            }
        }
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        if (this.b) {
            this.a(adm2, aqe2, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, afi.a.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
        } else {
            this.a(adm2, aqe2, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
        }
        this.a(adm2, aqe2, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
        for (int i = this.l.a; i <= this.l.d; ++i) {
            for (\u2603 = this.l.c; \u2603 <= this.l.f; ++\u2603) {
                if (this.a(adm2, i, this.l.b - 1, \u2603, aqe2).c().t() != arm.a) continue;
                this.a(adm2, afi.f.Q(), i, this.l.b - 1, \u2603, aqe2);
            }
        }
        return true;
    }
}
