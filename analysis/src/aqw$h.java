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

public static class aqw.h
extends aqw.n {
    private boolean a;
    private int b;

    public aqw.h() {
    }

    public aqw.h(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
        this.a = random.nextBoolean();
        this.b = random.nextInt(3);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("T", this.b);
        dn2.a("C", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.f("T");
        this.a = dn2.n("C");
    }

    public static aqw.h a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, cq2);
        if (!aqw.h.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.h(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        if (this.h < 0) {
            this.h = this.b(adm22, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 6 - 1, 0);
        }
        this.a(adm22, aqe2, 1, 1, 1, 3, 5, 4, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 0, 0, 3, 0, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm22, aqe2, 1, 0, 1, 2, 0, 3, afi.d.Q(), afi.d.Q(), false);
        if (this.a) {
            this.a(adm22, aqe2, 1, 4, 1, 2, 4, 3, afi.r.Q(), afi.r.Q(), false);
        } else {
            this.a(adm22, aqe2, 1, 5, 1, 2, 5, 3, afi.r.Q(), afi.r.Q(), false);
        }
        this.a(adm22, afi.r.Q(), 1, 4, 0, aqe2);
        this.a(adm22, afi.r.Q(), 2, 4, 0, aqe2);
        this.a(adm22, afi.r.Q(), 1, 4, 4, aqe2);
        this.a(adm22, afi.r.Q(), 2, 4, 4, aqe2);
        this.a(adm22, afi.r.Q(), 0, 4, 1, aqe2);
        this.a(adm22, afi.r.Q(), 0, 4, 2, aqe2);
        this.a(adm22, afi.r.Q(), 0, 4, 3, aqe2);
        this.a(adm22, afi.r.Q(), 3, 4, 1, aqe2);
        this.a(adm22, afi.r.Q(), 3, 4, 2, aqe2);
        this.a(adm22, afi.r.Q(), 3, 4, 3, aqe2);
        this.a(adm22, aqe2, 0, 1, 0, 0, 3, 0, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 3, 1, 0, 3, 3, 0, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 0, 1, 4, 0, 3, 4, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 3, 1, 4, 3, 3, 4, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 3, 1, 1, 3, 3, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 1, 1, 4, 2, 3, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm22, afi.bj.Q(), 3, 2, 2, aqe2);
        if (this.b > 0) {
            this.a(adm22, afi.aO.Q(), this.b, 1, 3, aqe2);
            this.a(adm22, afi.aB.Q(), this.b, 2, 3, aqe2);
        }
        this.a(adm22, afi.a.Q(), 1, 1, 0, aqe2);
        this.a(adm22, afi.a.Q(), 1, 2, 0, aqe2);
        this.a(adm22, aqe2, random, 1, 1, 0, cq.b(this.a(afi.ao, 1)));
        if (this.a(adm22, 1, 0, -1, aqe2).c().t() == arm.a && this.a(adm22, 1, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm22, afi.aw.a(this.a(afi.aw, 3)), 1, 0, -1, aqe2);
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                this.b(adm22, \u2603, 6, i2, aqe2);
                this.b(adm22, afi.e.Q(), \u2603, -1, i2, aqe2);
            }
        }
        this.a(adm22, aqe2, 1, 1, 2, 1);
        return true;
    }
}
