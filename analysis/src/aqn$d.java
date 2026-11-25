/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aqn.d
extends aqn.c {
    private boolean e;

    public aqn.d() {
    }

    public aqn.d(Random random, int n, int n2) {
        super(random, n, 64, n2, 7, 7, 9);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Witch", this.e);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.e = dn2.n("Witch");
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (!this.a(adm2, aqe2, 0)) {
            return false;
        }
        this.a(adm2, aqe2, 1, 1, 1, 5, 1, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 1, 4, 2, 5, 4, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 2, 1, 0, 4, 1, 0, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 2, 2, 2, 3, 3, 2, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 1, 2, 3, 1, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 5, 2, 3, 5, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 2, 2, 7, 4, 3, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
        this.a(adm2, aqe2, 1, 0, 2, 1, 3, 2, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 5, 0, 2, 5, 3, 2, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 1, 0, 7, 1, 3, 7, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, aqe2, 5, 0, 7, 5, 3, 7, afi.r.Q(), afi.r.Q(), false);
        this.a(adm2, afi.aO.Q(), 2, 3, 2, aqe2);
        this.a(adm2, afi.aO.Q(), 3, 3, 7, aqe2);
        this.a(adm2, afi.a.Q(), 1, 3, 4, aqe2);
        this.a(adm2, afi.a.Q(), 5, 3, 4, aqe2);
        this.a(adm2, afi.a.Q(), 5, 3, 5, aqe2);
        this.a(adm2, afi.ca.Q().a(agx.b, agx.a.r), 1, 3, 5, aqe2);
        this.a(adm2, afi.ai.Q(), 3, 2, 6, aqe2);
        this.a(adm2, afi.bE.Q(), 4, 2, 6, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 2, 1, aqe2);
        this.a(adm2, afi.aO.Q(), 5, 2, 1, aqe2);
        int n2 = this.a(afi.ad, 3);
        \u2603 = this.a(afi.ad, 1);
        \u2603 = this.a(afi.ad, 0);
        \u2603 = this.a(afi.ad, 2);
        this.a(adm2, aqe2, 0, 4, 1, 6, 4, 1, afi.bU.a(n2), afi.bU.a(n2), false);
        this.a(adm2, aqe2, 0, 4, 2, 0, 4, 7, afi.bU.a(\u2603), afi.bU.a(\u2603), false);
        this.a(adm2, aqe2, 6, 4, 2, 6, 4, 7, afi.bU.a(\u2603), afi.bU.a(\u2603), false);
        this.a(adm2, aqe2, 0, 4, 8, 6, 4, 8, afi.bU.a(\u2603), afi.bU.a(\u2603), false);
        for (\u2603 = 2; \u2603 <= 7; \u2603 += 5) {
            for (\u2603 = 1; \u2603 <= 5; \u2603 += 4) {
                this.b(adm2, afi.r.Q(), \u2603, -1, \u2603, aqe2);
            }
        }
        if (!this.e && aqe2.b(new cj(\u2603 = this.a(2, 5), \u2603 = this.d(2), \u2603 = this.b(2, 5)))) {
            this.e = true;
            wd wd2 = new wd(adm2);
            wd2.b((double)\u2603 + 0.5, \u2603, (double)\u2603 + 0.5, 0.0f, 0.0f);
            wd2.a(adm2.E(new cj(\u2603, \u2603, \u2603)), null);
            adm2.d(wd2);
        }
        return true;
    }
}
