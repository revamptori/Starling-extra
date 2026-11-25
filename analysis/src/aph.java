/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aph
extends aot {
    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        for (int i = 0; i < 64; ++i) {
            cj cj3 = cj2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!afi.bk.d(adm2, cj3) || adm2.p(cj3.b()).c() != afi.c) continue;
            adm2.a(cj3, afi.bk.Q(), 2);
        }
        return true;
    }
}
