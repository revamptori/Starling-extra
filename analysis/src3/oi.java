/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class oi {
    private static final Random a = new Random();

    public static void a(adm adm2, cj cj2, og og2) {
        oi.a(adm2, (double)cj2.n(), (double)cj2.o(), (double)cj2.p(), og2);
    }

    public static void a(adm adm2, pk pk2, og og2) {
        oi.a(adm2, pk2.s, pk2.t, pk2.u, og2);
    }

    private static void a(adm adm2, double d, double d2, double d3, og og2) {
        for (int i = 0; i < og2.o_(); ++i) {
            zx zx2 = og2.a(i);
            if (zx2 == null) continue;
            oi.a(adm2, d, d2, d3, zx2);
        }
    }

    private static void a(adm adm2, double d, double d2, double d3, zx zx2) {
        float f = a.nextFloat() * 0.8f + 0.1f;
        \u2603 = a.nextFloat() * 0.8f + 0.1f;
        \u2603 = a.nextFloat() * 0.8f + 0.1f;
        while (zx2.b > 0) {
            int n2 = a.nextInt(21) + 10;
            if (n2 > zx2.b) {
                n2 = zx2.b;
            }
            zx2.b -= n2;
            uz \u26032 = new uz(adm2, d + (double)f, d2 + (double)\u2603, d3 + (double)\u2603, new zx(zx2.b(), n2, zx2.i()));
            if (zx2.n()) {
                \u26032.l().d((dn)zx2.o().b());
            }
            float \u26033 = 0.05f;
            \u26032.v = a.nextGaussian() * (double)\u26033;
            \u26032.w = a.nextGaussian() * (double)\u26033 + (double)0.2f;
            \u26032.x = a.nextGaussian() * (double)\u26033;
            adm2.d(\u26032);
        }
    }
}
