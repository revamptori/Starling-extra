/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import com.google.common.base.Predicate;
import java.util.Random;

public class apj
extends aot {
    private final alz a;
    private final int b;
    private final Predicate<alz> c;

    public apj(alz alz2, int n) {
        this(alz2, n, amg.a(afi.b));
    }

    public apj(alz alz2, int n, Predicate<alz> predicate) {
        this.a = alz2;
        this.b = n;
        this.c = predicate;
    }

    @Override
    public boolean b(adm adm2, Random random, cj cj2) {
        float f = random.nextFloat() * (float)Math.PI;
        double \u26032 = (float)(cj2.n() + 8) + ns.a(f) * (float)this.b / 8.0f;
        double \u26033 = (float)(cj2.n() + 8) - ns.a(f) * (float)this.b / 8.0f;
        double \u26034 = (float)(cj2.p() + 8) + ns.b(f) * (float)this.b / 8.0f;
        double \u26035 = (float)(cj2.p() + 8) - ns.b(f) * (float)this.b / 8.0f;
        double \u26036 = cj2.o() + random.nextInt(3) - 2;
        double \u26037 = cj2.o() + random.nextInt(3) - 2;
        for (int i = 0; i < this.b; ++i) {
            float f2 = (float)i / (float)this.b;
            double \u26038 = \u26032 + (\u26033 - \u26032) * (double)f2;
            double \u26039 = \u26036 + (\u26037 - \u26036) * (double)f2;
            double \u260310 = \u26034 + (\u26035 - \u26034) * (double)f2;
            double \u260311 = random.nextDouble() * (double)this.b / 16.0;
            double \u260312 = (double)(ns.a((float)Math.PI * f2) + 1.0f) * \u260311 + 1.0;
            double \u260313 = (double)(ns.a((float)Math.PI * f2) + 1.0f) * \u260311 + 1.0;
            int \u260314 = ns.c(\u26038 - \u260312 / 2.0);
            int \u260315 = ns.c(\u26039 - \u260313 / 2.0);
            int \u260316 = ns.c(\u260310 - \u260312 / 2.0);
            int \u260317 = ns.c(\u26038 + \u260312 / 2.0);
            int \u260318 = ns.c(\u26039 + \u260313 / 2.0);
            int \u260319 = ns.c(\u260310 + \u260312 / 2.0);
            for (int j = \u260314; j <= \u260317; ++j) {
                double d = ((double)j + 0.5 - \u26038) / (\u260312 / 2.0);
                if (!(d * d < 1.0)) continue;
                for (int k = \u260315; k <= \u260318; ++k) {
                    double d2 = ((double)k + 0.5 - \u26039) / (\u260313 / 2.0);
                    if (!(d * d + d2 * d2 < 1.0)) continue;
                    for (int i2 = \u260316; i2 <= \u260319; ++i2) {
                        double d3 = ((double)i2 + 0.5 - \u260310) / (\u260312 / 2.0);
                        if (!(d * d + d2 * d2 + d3 * d3 < 1.0) || !this.c.apply((Object)adm2.p(\u2603 = new cj(j, k, i2)))) continue;
                        adm2.a(\u2603, this.a, 2);
                    }
                }
            }
        }
        return true;
    }
}
