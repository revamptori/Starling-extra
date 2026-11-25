/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class apf
extends apg {
    private static final alz e = afi.r.Q().a(ail.b, aio.a.b);
    private static final alz f = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, false);
    private static final alz g = afi.d.Q().a(agf.a, agf.a.c);
    private boolean h;

    public apf(boolean bl, boolean bl2) {
        super(bl, 13, 15, e, f);
        this.h = bl2;
    }

    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        int n = this.a(random);
        if (!this.a(adm2, random, cj2, n)) {
            return false;
        }
        this.a(adm2, cj2.n(), cj2.p(), cj2.o() + n, 0, random);
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            afh afh2 = adm2.p(cj2.b(\u2603)).c();
            if (afh2.t() == arm.a || afh2.t() == arm.j) {
                this.a(adm2, cj2.b(\u2603), this.b);
            }
            if (\u2603 >= n - 1) continue;
            afh2 = adm2.p(cj2.a(1, \u2603, 0)).c();
            if (afh2.t() == arm.a || afh2.t() == arm.j) {
                this.a(adm2, cj2.a(1, \u2603, 0), this.b);
            }
            if ((afh2 = adm2.p(cj2.a(1, \u2603, 1)).c()).t() == arm.a || afh2.t() == arm.j) {
                this.a(adm2, cj2.a(1, \u2603, 1), this.b);
            }
            if ((afh2 = adm2.p(cj2.a(0, \u2603, 1)).c()).t() != arm.a && afh2.t() != arm.j) continue;
            this.a(adm2, cj2.a(0, \u2603, 1), this.b);
        }
        return true;
    }

    private void a(adm adm2, int n, int n2, int n3, int n4, Random random) {
        int n5 = random.nextInt(5) + (this.h ? this.a : 3);
        \u2603 = 0;
        for (\u2603 = n3 - n5; \u2603 <= n3; ++\u2603) {
            \u2603 = n3 - \u2603;
            \u2603 = n4 + ns.d((float)\u2603 / (float)n5 * 3.5f);
            this.a(adm2, new cj(n, \u2603, n2), \u2603 + (\u2603 > 0 && \u2603 == \u2603 && (\u2603 & 1) == 0 ? 1 : 0));
            \u2603 = \u2603;
        }
    }

    @Override
    public void a(adm adm2, Random random, cj cj2) {
        this.b(adm2, cj2.e().c());
        this.b(adm2, cj2.g(2).c());
        this.b(adm2, cj2.e().e(2));
        this.b(adm2, cj2.g(2).e(2));
        for (int i = 0; i < 5; ++i) {
            \u2603 = random.nextInt(64);
            \u2603 = \u2603 % 8;
            \u2603 = \u2603 / 8;
            if (\u2603 != 0 && \u2603 != 7 && \u2603 != 0 && \u2603 != 7) continue;
            this.b(adm2, cj2.a(-3 + \u2603, 0, -3 + \u2603));
        }
    }

    private void b(adm adm2, cj cj2) {
        for (int i = -2; i <= 2; ++i) {
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                if (Math.abs((int)i) == 2 && Math.abs((int)\u2603) == 2) continue;
                this.c(adm2, cj2.a(i, 0, \u2603));
            }
        }
    }

    private void c(adm adm2, cj cj2) {
        for (int i = 2; i >= -3; --i) {
            cj cj3 = cj2.b(i);
            afh \u26032 = adm2.p(cj3).c();
            if (\u26032 == afi.c || \u26032 == afi.d) {
                this.a(adm2, cj3, g);
                break;
            }
            if (\u26032.t() != arm.a && i < 0) break;
        }
    }
}
