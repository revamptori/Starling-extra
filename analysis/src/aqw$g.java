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

public static class aqw.g
extends aqw.n {
    private boolean a;

    public aqw.g() {
    }

    public aqw.g(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
        this.a = random.nextBoolean();
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Terrace", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.n("Terrace");
    }

    public static aqw.g a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, cq2);
        if (aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqw.g(k2, n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        adm adm22;
        int n2;
        if (this.h < 0) {
            this.h = this.b(adm22, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 6 - 1, 0);
        }
        this.a(adm22, aqe2, 0, 0, 0, 4, 0, 4, afi.e.Q(), afi.e.Q(), false);
        this.a(adm22, aqe2, 0, 4, 0, 4, 4, 4, afi.r.Q(), afi.r.Q(), false);
        this.a(adm22, aqe2, 1, 4, 1, 3, 4, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, afi.e.Q(), 0, 1, 0, aqe2);
        this.a(adm22, afi.e.Q(), 0, 2, 0, aqe2);
        this.a(adm22, afi.e.Q(), 0, 3, 0, aqe2);
        this.a(adm22, afi.e.Q(), 4, 1, 0, aqe2);
        this.a(adm22, afi.e.Q(), 4, 2, 0, aqe2);
        this.a(adm22, afi.e.Q(), 4, 3, 0, aqe2);
        this.a(adm22, afi.e.Q(), 0, 1, 4, aqe2);
        this.a(adm22, afi.e.Q(), 0, 2, 4, aqe2);
        this.a(adm22, afi.e.Q(), 0, 3, 4, aqe2);
        this.a(adm22, afi.e.Q(), 4, 1, 4, aqe2);
        this.a(adm22, afi.e.Q(), 4, 2, 4, aqe2);
        this.a(adm22, afi.e.Q(), 4, 3, 4, aqe2);
        this.a(adm22, aqe2, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 4, 1, 1, 4, 3, 3, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, aqe2, 1, 1, 4, 3, 3, 4, afi.f.Q(), afi.f.Q(), false);
        this.a(adm22, afi.bj.Q(), 0, 2, 2, aqe2);
        this.a(adm22, afi.bj.Q(), 2, 2, 4, aqe2);
        this.a(adm22, afi.bj.Q(), 4, 2, 2, aqe2);
        this.a(adm22, afi.f.Q(), 1, 1, 0, aqe2);
        this.a(adm22, afi.f.Q(), 1, 2, 0, aqe2);
        this.a(adm22, afi.f.Q(), 1, 3, 0, aqe2);
        this.a(adm22, afi.f.Q(), 2, 3, 0, aqe2);
        this.a(adm22, afi.f.Q(), 3, 3, 0, aqe2);
        this.a(adm22, afi.f.Q(), 3, 2, 0, aqe2);
        this.a(adm22, afi.f.Q(), 3, 1, 0, aqe2);
        if (this.a(adm22, 2, 0, -1, aqe2).c().t() == arm.a && this.a(adm22, 2, -1, -1, aqe2).c().t() != arm.a) {
            this.a(adm22, afi.aw.a(this.a(afi.aw, 3)), 2, 0, -1, aqe2);
        }
        this.a(adm22, aqe2, 1, 1, 1, 3, 3, 3, afi.a.Q(), afi.a.Q(), false);
        if (this.a) {
            this.a(adm22, afi.aO.Q(), 0, 5, 0, aqe2);
            this.a(adm22, afi.aO.Q(), 1, 5, 0, aqe2);
            this.a(adm22, afi.aO.Q(), 2, 5, 0, aqe2);
            this.a(adm22, afi.aO.Q(), 3, 5, 0, aqe2);
            this.a(adm22, afi.aO.Q(), 4, 5, 0, aqe2);
            this.a(adm22, afi.aO.Q(), 0, 5, 4, aqe2);
            this.a(adm22, afi.aO.Q(), 1, 5, 4, aqe2);
            this.a(adm22, afi.aO.Q(), 2, 5, 4, aqe2);
            this.a(adm22, afi.aO.Q(), 3, 5, 4, aqe2);
            this.a(adm22, afi.aO.Q(), 4, 5, 4, aqe2);
            this.a(adm22, afi.aO.Q(), 4, 5, 1, aqe2);
            this.a(adm22, afi.aO.Q(), 4, 5, 2, aqe2);
            this.a(adm22, afi.aO.Q(), 4, 5, 3, aqe2);
            this.a(adm22, afi.aO.Q(), 0, 5, 1, aqe2);
            this.a(adm22, afi.aO.Q(), 0, 5, 2, aqe2);
            this.a(adm22, afi.aO.Q(), 0, 5, 3, aqe2);
        }
        if (this.a) {
            n2 = this.a(afi.au, 3);
            this.a(adm22, afi.au.a(n2), 3, 1, 3, aqe2);
            this.a(adm22, afi.au.a(n2), 3, 2, 3, aqe2);
            this.a(adm22, afi.au.a(n2), 3, 3, 3, aqe2);
            this.a(adm22, afi.au.a(n2), 3, 4, 3, aqe2);
        }
        this.a(adm22, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, aqe2);
        for (n2 = 0; n2 < 5; ++n2) {
            for (\u2603 = 0; \u2603 < 5; ++\u2603) {
                this.b(adm22, \u2603, 6, n2, aqe2);
                this.b(adm22, afi.e.Q(), \u2603, -1, n2, aqe2);
            }
        }
        this.a(adm22, aqe2, 1, 1, 2, 1);
        return true;
    }
}
