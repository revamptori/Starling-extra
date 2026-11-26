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

public class aoj
extends aoh {
    private static final alz a = afi.r.Q().a(ail.b, aio.a.c);
    private static final alz b = afi.t.Q().a(aik.Q, aio.a.c).a(aik.b, false);
    private boolean c;

    public aoj(boolean bl, boolean bl2) {
        super(bl);
        this.c = bl2;
    }

    @Override
    public boolean b(adm adm22, Random random, cj cj2) {
        int n;
        adm adm22;
        int n2 = random.nextInt(3) + 5;
        if (this.c) {
            n2 += random.nextInt(7);
        }
        boolean \u26032 = true;
        if (cj2.o() < 1 || cj2.o() + n2 + 1 > 256) {
            return false;
        }
        for (\u2603 = cj2.o(); \u2603 <= cj2.o() + 1 + n2; ++\u2603) {
            n = 1;
            if (\u2603 == cj2.o()) {
                n = 0;
            }
            if (\u2603 >= cj2.o() + 1 + n2 - 2) {
                n = 2;
            }
            cj.a a2 = new cj.a();
            for (int i = cj2.n() - n; i <= cj2.n() + n && \u26032; ++i) {
                for (\u2603 = cj2.p() - n; \u2603 <= cj2.p() + n && \u26032; ++\u2603) {
                    if (\u2603 >= 0 && \u2603 < 256) {
                        if (this.a(adm22.p(a2.c(i, \u2603, \u2603)).c())) continue;
                        \u26032 = false;
                        continue;
                    }
                    \u26032 = false;
                }
            }
        }
        if (!\u26032) {
            return false;
        }
        afh \u26033 = adm22.p(cj2.b()).c();
        if (\u26033 != afi.c && \u26033 != afi.d && \u26033 != afi.ak || cj2.o() >= 256 - n2 - 1) {
            return false;
        }
        this.a(adm22, cj2.b());
        for (n = cj2.o() - 3 + n2; n <= cj2.o() + n2; ++n) {
            \u2603 = n - (cj2.o() + n2);
            i = 1 - \u2603 / 2;
            for (\u2603 = cj2.n() - i; \u2603 <= cj2.n() + i; ++\u2603) {
                \u2603 = \u2603 - cj2.n();
                for (\u2603 = cj2.p() - i; \u2603 <= cj2.p() + i; ++\u2603) {
                    \u2603 = \u2603 - cj2.p();
                    if (Math.abs((int)\u2603) == i && Math.abs((int)\u2603) == i && (random.nextInt(2) == 0 || \u2603 == 0) || (\u2603 = adm22.p(\u2603 = new cj(\u2603, n, \u2603)).c()).t() != arm.a && \u2603.t() != arm.j) continue;
                    this.a(adm22, \u2603, b);
                }
            }
        }
        for (n = 0; n < n2; ++n) {
            afh afh2 = adm22.p(cj2.b(n)).c();
            if (afh2.t() != arm.a && afh2.t() != arm.j) continue;
            this.a(adm22, cj2.b(n), a);
        }
        return true;
    }
}
