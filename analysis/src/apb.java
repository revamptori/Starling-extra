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

public class apb
extends aot {
    @Override
    public boolean b(adm adm2, Random random, cj cj22) {
        int \u26032;
        int n;
        while (adm2.d(cj22) && cj22.o() > 2) {
            cj22 = cj22.b();
        }
        if (adm2.p(cj22).c() != afi.aJ) {
            return false;
        }
        cj22 = cj22.b(random.nextInt(4));
        int n2 = random.nextInt(4) + 7;
        \u2603 = n2 / 4 + random.nextInt(2);
        if (\u2603 > 1 && random.nextInt(60) == 0) {
            cj cj22 = cj22.b(10 + random.nextInt(30));
        }
        for (n = 0; n < n2; ++n) {
            float f = (1.0f - (float)n / (float)n2) * (float)\u2603;
            \u26032 = ns.f(f);
            for (int i = -\u26032; i <= \u26032; ++i) {
                float f2 = (float)ns.a(i) - 0.25f;
                for (int j = -\u26032; j <= \u26032; ++j) {
                    float f3 = (float)ns.a(j) - 0.25f;
                    if ((i != 0 || j != 0) && f2 * f2 + f3 * f3 > f * f || (i == -\u26032 || i == \u26032 || j == -\u26032 || j == \u26032) && random.nextFloat() > 0.75f) continue;
                    afh \u26033 = adm2.p(cj22.a(i, n, j)).c();
                    if (\u26033.t() == arm.a || \u26033 == afi.d || \u26033 == afi.aJ || \u26033 == afi.aI) {
                        this.a(adm2, cj22.a(i, n, j), afi.cB.Q());
                    }
                    if (n == 0 || \u26032 <= 1 || (\u26033 = adm2.p(cj22.a(i, -n, j)).c()).t() != arm.a && \u26033 != afi.d && \u26033 != afi.aJ && \u26033 != afi.aI) continue;
                    this.a(adm2, cj22.a(i, -n, j), afi.cB.Q());
                }
            }
        }
        n = \u2603 - 1;
        if (n < 0) {
            n = 0;
        } else if (n > 1) {
            n = 1;
        }
        for (\u2603 = -n; \u2603 <= n; ++\u2603) {
            for (\u26032 = -n; \u26032 <= n; ++\u26032) {
                cj cj3 = cj22.a(\u2603, -1, \u26032);
                int \u26034 = 50;
                if (Math.abs((int)\u2603) == 1 && Math.abs((int)\u26032) == 1) {
                    \u26034 = random.nextInt(5);
                }
                while (cj3.o() > 50 && ((\u2603 = adm2.p(cj3).c()).t() == arm.a || \u2603 == afi.d || \u2603 == afi.aJ || \u2603 == afi.aI || \u2603 == afi.cB)) {
                    this.a(adm2, cj3, afi.cB.Q());
                    cj3 = cj3.b();
                    if (--\u26034 > 0) continue;
                    cj3 = cj3.c(random.nextInt(5) + 1);
                    \u26034 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}
