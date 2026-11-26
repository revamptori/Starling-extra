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

public class apk
extends aoh {
    private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
    private static final alz b = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, false);

    public apk() {
        super(false);
    }

    @Override
    public boolean b(adm adm22, Random random, cj cj2) {
        int n;
        adm adm22;
        int n2 = random.nextInt(5) + 7;
        \u2603 = n2 - random.nextInt(2) - 3;
        \u2603 = n2 - \u2603;
        \u2603 = 1 + random.nextInt(\u2603 + 1);
        boolean \u26032 = true;
        if (cj2.o() < 1 || cj2.o() + n2 + 1 > 256) {
            return false;
        }
        for (\u2603 = cj2.o(); \u2603 <= cj2.o() + 1 + n2 && \u26032; ++\u2603) {
            \u26034 = 1;
            \u26034 = \u2603 - cj2.o() < \u2603 ? 0 : \u2603;
            cj.a a2 = new cj.a();
            for (int i = cj2.n() - \u26034; i <= cj2.n() + \u26034 && \u26032; ++i) {
                for (\u2603 = cj2.p() - \u26034; \u2603 <= cj2.p() + \u26034 && \u26032; ++\u2603) {
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
        if (\u26033 != afi.c && \u26033 != afi.d || cj2.o() >= 256 - n2 - 1) {
            return false;
        }
        this.a(adm22, cj2.b());
        int \u26034 = 0;
        for (n = cj2.o() + n2; n >= cj2.o() + \u2603; --n) {
            for (i = cj2.n() - \u26034; i <= cj2.n() + \u26034; ++i) {
                \u2603 = i - cj2.n();
                for (\u2603 = cj2.p() - \u26034; \u2603 <= cj2.p() + \u26034; ++\u2603) {
                    \u2603 = \u2603 - cj2.p();
                    if (Math.abs((int)\u2603) == \u26034 && Math.abs((int)\u2603) == \u26034 && \u26034 > 0 || adm22.p(\u2603 = new cj(i, n, \u2603)).c().o()) continue;
                    this.a(adm22, \u2603, b);
                }
            }
            if (\u26034 >= 1 && n == cj2.o() + \u2603 + 1) {
                --\u26034;
                continue;
            }
            if (\u26034 >= \u2603) continue;
            ++\u26034;
        }
        for (n = 0; n < n2 - 1; ++n) {
            afh afh2 = adm22.p(cj2.b(n)).c();
            if (afh2.t() != arm.a && afh2.t() != arm.j) continue;
            this.a(adm22, cj2.b(n), a);
        }
        return true;
    }
}
