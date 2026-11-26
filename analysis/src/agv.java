/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 *  java.util.Random
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class agv
extends afh {
    public static final amn a = amn.a("age", 0, 15);
    public static final amk b = amk.a("flip");
    public static final amk N = amk.a("alt");
    public static final amk O = amk.a("north");
    public static final amk P = amk.a("east");
    public static final amk Q = amk.a("south");
    public static final amk R = amk.a("west");
    public static final amn S = amn.a("upper", 0, 2);
    private final Map<afh, Integer> T = Maps.newIdentityHashMap();
    private final Map<afh, Integer> U = Maps.newIdentityHashMap();

    @Override
    public alz a(alz alz2, adq adq2, cj cj2) {
        int n = cj2.n();
        \u2603 = cj2.o();
        \u2603 = cj2.p();
        if (adm.a(adq2, cj2.b()) || afi.ab.e(adq2, cj2.b())) {
            return this.Q();
        }
        boolean \u26032 = (n + \u2603 + \u2603 & 1) == 1;
        boolean \u26033 = (n / 2 + \u2603 / 2 + \u2603 / 2 & 1) == 1;
        \u2603 = 0;
        if (this.e(adq2, cj2.a())) {
            \u2603 = \u26032 ? 1 : 2;
        }
        return alz2.a(O, this.e(adq2, cj2.c())).a(P, this.e(adq2, cj2.f())).a(Q, this.e(adq2, cj2.d())).a(R, this.e(adq2, cj2.e())).a(S, \u2603).a(b, \u26033).a(N, \u26032);
    }

    protected agv() {
        super(arm.o);
        this.j(this.M.b().a(a, 0).a(b, false).a(N, false).a(O, false).a(P, false).a(Q, false).a(R, false).a(S, 0));
        this.a(true);
    }

    public static void l() {
        afi.ab.a(afi.f, 5, 20);
        afi.ab.a(afi.bL, 5, 20);
        afi.ab.a(afi.bM, 5, 20);
        afi.ab.a(afi.bo, 5, 20);
        afi.ab.a(afi.bp, 5, 20);
        afi.ab.a(afi.bq, 5, 20);
        afi.ab.a(afi.br, 5, 20);
        afi.ab.a(afi.bs, 5, 20);
        afi.ab.a(afi.bt, 5, 20);
        afi.ab.a(afi.aO, 5, 20);
        afi.ab.a(afi.aP, 5, 20);
        afi.ab.a(afi.aQ, 5, 20);
        afi.ab.a(afi.aR, 5, 20);
        afi.ab.a(afi.aS, 5, 20);
        afi.ab.a(afi.aT, 5, 20);
        afi.ab.a(afi.ad, 5, 20);
        afi.ab.a(afi.bV, 5, 20);
        afi.ab.a(afi.bU, 5, 20);
        afi.ab.a(afi.bW, 5, 20);
        afi.ab.a(afi.r, 5, 5);
        afi.ab.a(afi.s, 5, 5);
        afi.ab.a(afi.t, 30, 60);
        afi.ab.a(afi.u, 30, 60);
        afi.ab.a(afi.X, 30, 20);
        afi.ab.a(afi.W, 15, 100);
        afi.ab.a(afi.H, 60, 100);
        afi.ab.a(afi.cF, 60, 100);
        afi.ab.a(afi.N, 60, 100);
        afi.ab.a(afi.O, 60, 100);
        afi.ab.a(afi.I, 60, 100);
        afi.ab.a(afi.L, 30, 60);
        afi.ab.a(afi.bn, 15, 100);
        afi.ab.a(afi.cA, 5, 5);
        afi.ab.a(afi.cx, 60, 20);
        afi.ab.a(afi.cy, 60, 20);
    }

    public void a(afh afh2, int n, int n2) {
        this.T.put((Object)afh2, (Object)n);
        this.U.put((Object)afh2, (Object)n2);
    }

    @Override
    public aug a(adm adm2, cj cj2, alz alz2) {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int a(adm adm2) {
        return 30;
    }

    @Override
    public void b(adm adm22, cj cj2, alz alz22, Random random) {
        adm adm22;
        boolean bl;
        if (!adm22.Q().b("doFireTick")) {
            return;
        }
        if (!this.d(adm22, cj2)) {
            adm22.g(cj2);
        }
        boolean bl2 = bl = (\u2603 = adm22.p(cj2.b()).c()) == afi.aV;
        if (adm22.t instanceof anp && \u2603 == afi.h) {
            bl = true;
        }
        if (!bl && adm22.S() && this.e(adm22, cj2)) {
            adm22.g(cj2);
            return;
        }
        int \u26032 = alz22.b(a);
        if (\u26032 < 15) {
            alz alz22 = alz22.a(a, \u26032 + random.nextInt(3) / 2);
            adm22.a(cj2, alz22, 4);
        }
        adm22.a(cj2, (afh)this, this.a(adm22) + random.nextInt(10));
        if (!bl) {
            if (!this.f(adm22, cj2)) {
                if (!adm.a(adm22, cj2.b()) || \u26032 > 3) {
                    adm22.g(cj2);
                }
                return;
            }
            if (!this.e((adq)adm22, cj2.b()) && \u26032 == 15 && random.nextInt(4) == 0) {
                adm22.g(cj2);
                return;
            }
        }
        boolean \u26033 = adm22.D(cj2);
        int \u26034 = 0;
        if (\u26033) {
            \u26034 = -50;
        }
        this.a(adm22, cj2.f(), 300 + \u26034, random, \u26032);
        this.a(adm22, cj2.e(), 300 + \u26034, random, \u26032);
        this.a(adm22, cj2.b(), 250 + \u26034, random, \u26032);
        this.a(adm22, cj2.a(), 250 + \u26034, random, \u26032);
        this.a(adm22, cj2.c(), 300 + \u26034, random, \u26032);
        this.a(adm22, cj2.d(), 300 + \u26034, random, \u26032);
        for (int i = -1; i <= 1; ++i) {
            for (\u2603 = -1; \u2603 <= 1; ++\u2603) {
                for (\u2603 = -1; \u2603 <= 4; ++\u2603) {
                    if (i == 0 && \u2603 == 0 && \u2603 == 0) continue;
                    \u2603 = 100;
                    if (\u2603 > 1) {
                        \u2603 += (\u2603 - 1) * 100;
                    }
                    if ((\u2603 = this.m(adm22, \u2603 = cj2.a(i, \u2603, \u2603))) <= 0) continue;
                    \u2603 = (\u2603 + 40 + adm22.aa().a() * 7) / (\u26032 + 30);
                    if (\u26033) {
                        \u2603 /= 2;
                    }
                    if (\u2603 <= 0 || random.nextInt(\u2603) > \u2603 || adm22.S() && this.e(adm22, \u2603)) continue;
                    \u2603 = \u26032 + random.nextInt(5) / 4;
                    if (\u2603 > 15) {
                        \u2603 = 15;
                    }
                    adm22.a(\u2603, alz22.a(a, \u2603), 3);
                }
            }
        }
    }

    protected boolean e(adm adm2, cj cj2) {
        return adm2.C(cj2) || adm2.C(cj2.e()) || adm2.C(cj2.f()) || adm2.C(cj2.c()) || adm2.C(cj2.d());
    }

    @Override
    public boolean N() {
        return false;
    }

    private int c(afh afh2) {
        Integer n = (Integer)this.U.get((Object)afh2);
        return n == null ? 0 : n;
    }

    private int d(afh afh2) {
        Integer n = (Integer)this.T.get((Object)afh2);
        return n == null ? 0 : n;
    }

    private void a(adm adm22, cj cj2, int n, Random random, int n2) {
        \u2603 = this.c(adm22.p(cj2).c());
        if (random.nextInt(n) < \u2603) {
            alz alz2 = adm22.p(cj2);
            if (random.nextInt(n2 + 10) < 5 && !adm22.C(cj2)) {
                int n3 = n2 + random.nextInt(5) / 4;
                if (n3 > 15) {
                    n3 = 15;
                }
                adm22.a(cj2, this.Q().a(a, n3), 3);
            } else {
                adm adm22;
                adm22.g(cj2);
            }
            if (alz2.c() == afi.W) {
                afi.W.d(adm22, cj2, alz2.a(ake.a, true));
            }
        }
    }

    private boolean f(adm adm2, cj cj2) {
        for (cq cq2 : cq.values()) {
            if (!this.e((adq)adm2, cj2.a(cq2))) continue;
            return true;
        }
        return false;
    }

    private int m(adm adm2, cj cj2) {
        if (!adm2.d(cj2)) {
            return 0;
        }
        int n = 0;
        for (cq cq2 : cq.values()) {
            n = Math.max((int)this.d(adm2.p(cj2.a(cq2)).c()), (int)n);
        }
        return n;
    }

    @Override
    public boolean A() {
        return false;
    }

    public boolean e(adq adq2, cj cj2) {
        return this.d(adq2.p(cj2).c()) > 0;
    }

    @Override
    public boolean d(adm adm2, cj cj2) {
        return adm.a(adm2, cj2.b()) || this.f(adm2, cj2);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, afh afh2) {
        if (!adm.a(adm2, cj2.b()) && !this.f(adm2, cj2)) {
            adm2.g(cj2);
        }
    }

    @Override
    public void c(adm adm2, cj cj2, alz alz2) {
        if (adm2.t.q() <= 0 && afi.aY.e(adm2, cj2)) {
            return;
        }
        if (!adm.a(adm2, cj2.b()) && !this.f(adm2, cj2)) {
            adm2.g(cj2);
            return;
        }
        adm2.a(cj2, (afh)this, this.a(adm2) + adm2.s.nextInt(10));
    }

    @Override
    public void c(adm adm22, cj cj2, alz alz2, Random random) {
        block12: {
            double d;
            int n;
            adm adm22;
            block11: {
                if (random.nextInt(24) == 0) {
                    adm22.a((double)((float)cj2.n() + 0.5f), (double)((float)cj2.o() + 0.5f), (double)((float)cj2.p() + 0.5f), "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (!adm.a(adm22, cj2.b()) && !afi.ab.e((adq)adm22, cj2.b())) break block11;
                for (int i = 0; i < 3; ++i) {
                    double d2 = (double)cj2.n() + random.nextDouble();
                    \u2603 = (double)cj2.o() + random.nextDouble() * 0.5 + 0.5;
                    \u2603 = (double)cj2.p() + random.nextDouble();
                    adm22.a(cy.m, d2, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
                }
                break block12;
            }
            if (afi.ab.e((adq)adm22, cj2.e())) {
                for (n = 0; n < 2; ++n) {
                    d = (double)cj2.n() + random.nextDouble() * (double)0.1f;
                    \u2603 = (double)cj2.o() + random.nextDouble();
                    \u2603 = (double)cj2.p() + random.nextDouble();
                    adm22.a(cy.m, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)adm22, cj2.f())) {
                for (n = 0; n < 2; ++n) {
                    d = (double)(cj2.n() + 1) - random.nextDouble() * (double)0.1f;
                    \u2603 = (double)cj2.o() + random.nextDouble();
                    \u2603 = (double)cj2.p() + random.nextDouble();
                    adm22.a(cy.m, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)adm22, cj2.c())) {
                for (n = 0; n < 2; ++n) {
                    d = (double)cj2.n() + random.nextDouble();
                    \u2603 = (double)cj2.o() + random.nextDouble();
                    \u2603 = (double)cj2.p() + random.nextDouble() * (double)0.1f;
                    adm22.a(cy.m, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)adm22, cj2.d())) {
                for (n = 0; n < 2; ++n) {
                    d = (double)cj2.n() + random.nextDouble();
                    \u2603 = (double)cj2.o() + random.nextDouble();
                    \u2603 = (double)(cj2.p() + 1) - random.nextDouble() * (double)0.1f;
                    adm22.a(cy.m, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (!afi.ab.e((adq)adm22, cj2.a())) break block12;
            for (n = 0; n < 2; ++n) {
                d = (double)cj2.n() + random.nextDouble();
                \u2603 = (double)(cj2.o() + 1) - random.nextDouble() * (double)0.1f;
                \u2603 = (double)cj2.p() + random.nextDouble();
                adm22.a(cy.m, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    @Override
    public arn g(alz alz2) {
        return arn.f;
    }

    @Override
    public adf m() {
        return adf.c;
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, n);
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a);
    }

    @Override
    protected ama e() {
        return new ama(this, a, O, P, Q, R, S, b, N);
    }
}
