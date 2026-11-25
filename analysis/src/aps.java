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

public class aps
extends aoh {
    private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
    private static final alz b = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, false);

    public aps(boolean bl) {
        super(bl);
    }

    @Override
    public boolean b(adm adm22, Random random2, cj cj2) {
        Random random2;
        int \u26037;
        adm adm22;
        int \u26036;
        int n = random2.nextInt(4) + 6;
        \u2603 = 1 + random2.nextInt(2);
        \u2603 = n - \u2603;
        \u2603 = 2 + random2.nextInt(2);
        boolean \u26032 = true;
        if (cj2.o() < 1 || cj2.o() + n + 1 > 256) {
            return false;
        }
        for (\u2603 = cj2.o(); \u2603 <= cj2.o() + 1 + n && \u26032; ++\u2603) {
            \u26034 = 1;
            \u26034 = \u2603 - cj2.o() < \u2603 ? 0 : \u2603;
            cj.a a2 = new cj.a();
            for (\u26036 = cj2.n() - \u26034; \u26036 <= cj2.n() + \u26034 && \u26032; ++\u26036) {
                for (\u26037 = cj2.p() - \u26034; \u26037 <= cj2.p() + \u26034 && \u26032; ++\u26037) {
                    if (\u2603 >= 0 && \u2603 < 256) {
                        afh afh2 = adm22.p(a2.c(\u26036, \u2603, \u26037)).c();
                        if (afh2.t() == arm.a || afh2.t() == arm.j) continue;
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
        if (\u26033 != afi.c && \u26033 != afi.d && \u26033 != afi.ak || cj2.o() >= 256 - n - 1) {
            return false;
        }
        this.a(adm22, cj2.b());
        int \u26034 = random2.nextInt(2);
        int \u26035 = 1;
        \u26036 = 0;
        for (\u26037 = 0; \u26037 <= \u2603; ++\u26037) {
            \u2603 = cj2.o() + n - \u26037;
            for (\u2603 = cj2.n() - \u26034; \u2603 <= cj2.n() + \u26034; ++\u2603) {
                \u2603 = \u2603 - cj2.n();
                for (\u2603 = cj2.p() - \u26034; \u2603 <= cj2.p() + \u26034; ++\u2603) {
                    \u2603 = \u2603 - cj2.p();
                    if (Math.abs((int)\u2603) == \u26034 && Math.abs((int)\u2603) == \u26034 && \u26034 > 0 || adm22.p(\u2603 = new cj(\u2603, \u2603, \u2603)).c().o()) continue;
                    this.a(adm22, \u2603, b);
                }
            }
            if (\u26034 >= \u26035) {
                \u26034 = \u26036;
                \u26036 = 1;
                if (++\u26035 <= \u2603) continue;
                \u26035 = \u2603;
                continue;
            }
            ++\u26034;
        }
        \u26037 = random2.nextInt(3);
        for (int i = 0; i < n - \u26037; ++i) {
            afh afh3 = adm22.p(cj2.b(i)).c();
            if (afh3.t() != arm.a && afh3.t() != arm.j) continue;
            this.a(adm22, cj2.b(i), a);
        }
        return true;
    }
}
