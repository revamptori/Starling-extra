/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aom
extends aot {
    private afm a;

    public aom(afm afm2) {
        this.a = afm2;
    }

    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        for (int i = 0; i < 64; ++i) {
            cj cj3 = cj2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!adm2.d(cj3) || adm2.t.o() && cj3.o() >= 255 || !this.a.f(adm2, cj3, this.a.Q())) continue;
            adm2.a(cj3, this.a.Q(), 2);
        }
        return true;
    }
}
