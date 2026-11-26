/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class apm
extends aot {
    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        for (int i = 0; i < 20; ++i) {
            cj cj3 = cj2.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            if (!adm2.d(cj3) || adm2.p((\u2603 = cj3.b()).e()).c().t() != arm.h && adm2.p(\u2603.f()).c().t() != arm.h && adm2.p(\u2603.c()).c().t() != arm.h && adm2.p(\u2603.d()).c().t() != arm.h) continue;
            int \u26032 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int j = 0; j < \u26032; ++j) {
                if (!afi.aM.e(adm2, cj3)) continue;
                adm2.a(cj3.b(j), afi.aM.Q(), 2);
            }
        }
        return true;
    }
}
