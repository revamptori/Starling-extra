/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import com.google.common.base.Predicates;
import java.util.Random;

public class aor
extends aot {
    private static final amh a = amh.a(afi.m).a(ajh.a, Predicates.equalTo((Object)ajh.a.a));
    private final alz b = afi.U.Q().a(akb.N, akb.a.b).a(ahh.a, ahh.a.b);
    private final alz c = afi.A.Q();
    private final alz d = afi.i.Q();

    @Override
    public boolean b(adm adm22, Random random, cj cj2) {
        int n;
        adm adm22;
        int n2;
        while (adm22.d(cj2) && cj2.o() > 2) {
            cj2 = cj2.b();
        }
        if (!a.a(adm22.p(cj2))) {
            return false;
        }
        for (n2 = -2; n2 <= 2; ++n2) {
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                if (!adm22.d(cj2.a(n2, -1, \u2603)) || !adm22.d(cj2.a(n2, -2, \u2603))) continue;
                return false;
            }
        }
        for (n2 = -1; n2 <= 0; ++n2) {
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                    adm22.a(cj2.a(\u2603, n2, \u2603), this.c, 2);
                }
            }
        }
        adm22.a(cj2, this.d, 2);
        for (cq cq2 : cq.c.a) {
            adm22.a(cj2.a(cq2), this.d, 2);
        }
        for (n = -2; n <= 2; ++n) {
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                if (n != -2 && n != 2 && \u2603 != -2 && \u2603 != 2) continue;
                adm22.a(cj2.a(n, 1, \u2603), this.c, 2);
            }
        }
        adm22.a(cj2.a(2, 1, 0), this.b, 2);
        adm22.a(cj2.a(-2, 1, 0), this.b, 2);
        adm22.a(cj2.a(0, 1, 2), this.b, 2);
        adm22.a(cj2.a(0, 1, -2), this.b, 2);
        for (n = -1; n <= 1; ++n) {
            for (\u2603 = -1; \u2603 <= 1; ++\u2603) {
                if (n == 0 && \u2603 == 0) {
                    adm22.a(cj2.a(n, 4, \u2603), this.c, 2);
                    continue;
                }
                adm22.a(cj2.a(n, 4, \u2603), this.b, 2);
            }
        }
        for (n = 1; n <= 3; ++n) {
            adm22.a(cj2.a(-1, n, -1), this.c, 2);
            adm22.a(cj2.a(-1, n, 1), this.c, 2);
            adm22.a(cj2.a(1, n, -1), this.c, 2);
            adm22.a(cj2.a(1, n, 1), this.c, 2);
        }
        return true;
    }
}
