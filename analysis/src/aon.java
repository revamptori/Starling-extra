/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aon
extends aot {
    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        for (int i = 0; i < 10; ++i) {
            cj cj3 = cj2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!adm2.d(cj3)) continue;
            int \u26032 = 1 + random.nextInt(random.nextInt(3) + 1);
            for (int j = 0; j < \u26032; ++j) {
                if (!afi.aK.e(adm2, cj3)) continue;
                adm2.a(cj3.b(j), afi.aK.Q(), 2);
            }
        }
        return true;
    }
}
