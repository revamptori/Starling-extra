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

public class apt
extends aoh {
    private static final alz a = afi.r.Q().a(ail.b, aio.a.a);
    private static final alz b = afi.t.Q().a(aik.Q, aio.a.a).a(aik.b, false);

    public apt() {
        super(false);
    }

    @Override
    public boolean b(adm adm2, Random random, cj cj22) {
        int n;
        int n2 = random.nextInt(4) + 5;
        while (adm2.p(cj22.b()).c().t() == arm.h) {
            cj cj22 = cj22.b();
        }
        boolean bl = true;
        if (cj22.o() < 1 || cj22.o() + n2 + 1 > 256) {
            return false;
        }
        for (int i = cj22.o(); i <= cj22.o() + 1 + n2; ++i) {
            n = 1;
            if (i == cj22.o()) {
                n = 0;
            }
            if (i >= cj22.o() + 1 + n2 - 2) {
                n = 3;
            }
            cj.a a2 = new cj.a();
            for (int j = cj22.n() - n; j <= cj22.n() + n && bl; ++j) {
                for (\u2603 = cj22.p() - n; \u2603 <= cj22.p() + n && bl; ++\u2603) {
                    if (i >= 0 && i < 256) {
                        afh afh2 = adm2.p(a2.c(j, i, \u2603)).c();
                        if (afh2.t() == arm.a || afh2.t() == arm.j) continue;
                        if (afh2 == afi.j || afh2 == afi.i) {
                            if (i <= cj22.o()) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                        continue;
                    }
                    bl = false;
                }
            }
        }
        if (!bl) {
            return false;
        }
        afh \u26032 = adm2.p(cj22.b()).c();
        if (\u26032 != afi.c && \u26032 != afi.d || cj22.o() >= 256 - n2 - 1) {
            return false;
        }
        this.a(adm2, cj22.b());
        for (n = cj22.o() - 3 + n2; n <= cj22.o() + n2; ++n) {
            \u2603 = n - (cj22.o() + n2);
            j = 2 - \u2603 / 2;
            for (\u2603 = cj22.n() - j; \u2603 <= cj22.n() + j; ++\u2603) {
                \u2603 = \u2603 - cj22.n();
                for (\u2603 = cj22.p() - j; \u2603 <= cj22.p() + j; ++\u2603) {
                    \u2603 = \u2603 - cj22.p();
                    if (Math.abs((int)\u2603) == j && Math.abs((int)\u2603) == j && (random.nextInt(2) == 0 || \u2603 == 0) || adm2.p(\u2603 = new cj(\u2603, n, \u2603)).c().o()) continue;
                    this.a(adm2, \u2603, b);
                }
            }
        }
        for (n = 0; n < n2; ++n) {
            afh afh3 = adm2.p(cj22.b(n)).c();
            if (afh3.t() != arm.a && afh3.t() != arm.j && afh3 != afi.i && afh3 != afi.j) continue;
            this.a(adm2, cj22.b(n), a);
        }
        for (n = cj22.o() - 3 + n2; n <= cj22.o() + n2; ++n) {
            \u2603 = n - (cj22.o() + n2);
            j = 2 - \u2603 / 2;
            cj.a a3 = new cj.a();
            for (int i = cj22.n() - j; i <= cj22.n() + j; ++i) {
                for (\u2603 = cj22.p() - j; \u2603 <= cj22.p() + j; ++\u2603) {
                    a3.c(i, n, \u2603);
                    if (adm2.p(a3).c().t() != arm.j) continue;
                    cj cj3 = a3.e();
                    \u2603 = a3.f();
                    \u2603 = a3.c();
                    \u2603 = a3.d();
                    if (random.nextInt(4) == 0 && adm2.p(cj3).c().t() == arm.a) {
                        this.a(adm2, cj3, akk.N);
                    }
                    if (random.nextInt(4) == 0 && adm2.p(\u2603).c().t() == arm.a) {
                        this.a(adm2, \u2603, akk.P);
                    }
                    if (random.nextInt(4) == 0 && adm2.p(\u2603).c().t() == arm.a) {
                        this.a(adm2, \u2603, akk.O);
                    }
                    if (random.nextInt(4) != 0 || adm2.p(\u2603).c().t() != arm.a) continue;
                    this.a(adm2, \u2603, akk.b);
                }
            }
        }
        return true;
    }

    private void a(adm adm2, cj \u260322, amk amk2) {
        alz alz2 = afi.bn.Q().a(amk2, true);
        this.a(adm2, \u260322, alz2);
        cj \u260322 = \u260322.b();
        for (int i = 4; adm2.p(\u260322).c().t() == arm.a && i > 0; --i) {
            this.a(adm2, \u260322, alz2);
            \u260322 = \u260322.b();
        }
    }
}
