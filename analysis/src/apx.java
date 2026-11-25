/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class apx
extends aot {
    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        for (int i = 0; i < 10; ++i) {
            \u2603 = cj2.n() + random.nextInt(8) - random.nextInt(8);
            if (!adm2.d(new cj(\u2603, \u2603 = cj2.o() + random.nextInt(4) - random.nextInt(4), \u2603 = cj2.p() + random.nextInt(8) - random.nextInt(8))) || !afi.bx.d(adm2, new cj(\u2603, \u2603, \u2603))) continue;
            adm2.a(new cj(\u2603, \u2603, \u2603), afi.bx.Q(), 2);
        }
        return true;
    }
}
