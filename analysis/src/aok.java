/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aok
extends aot {
    private final afh a;
    private final int b;

    public aok(afh afh2, int n) {
        super(false);
        this.a = afh2;
        this.b = n;
    }

    @Override
    public boolean b(adm adm2, Random random, cj cj22) {
        while (cj22.o() > 3 && (adm2.d(cj22.b()) || (\u2603 = adm2.p(cj22.b()).c()) != afi.c && \u2603 != afi.d && \u2603 != afi.b)) {
            cj22 = cj22.b();
        }
        if (cj22.o() <= 3) {
            return false;
        }
        int n = this.b;
        for (\u2603 = 0; n >= 0 && \u2603 < 3; ++\u2603) {
            cj cj22;
            \u2603 = n + random.nextInt(2);
            \u2603 = n + random.nextInt(2);
            \u2603 = n + random.nextInt(2);
            float f = (float)(\u2603 + \u2603 + \u2603) * 0.333f + 0.5f;
            for (cj cj3 : cj.a(cj22.a(-\u2603, -\u2603, -\u2603), cj22.a(\u2603, \u2603, \u2603))) {
                if (!(cj3.i(cj22) <= (double)(f * f))) continue;
                adm2.a(cj3, this.a.Q(), 4);
            }
            cj22 = cj22.a(-(n + 1) + random.nextInt(2 + n * 2), 0 - random.nextInt(2), -(n + 1) + random.nextInt(2 + n * 2));
        }
        return true;
    }
}
