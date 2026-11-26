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

public class anr
extends any {
    private float[] d = new float[1024];

    protected void a(long l, int n, int n2, ans ans2, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        Random random = new Random(l);
        double \u26032 = n * 16 + 8;
        double \u26033 = n2 * 16 + 8;
        float \u26034 = 0.0f;
        float \u26035 = 0.0f;
        if (n4 <= 0) {
            n5 = this.a * 16 - 16;
            n4 = n5 - random.nextInt(n5 / 4);
        }
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        float \u26036 = 1.0f;
        for (\u2603 = 0; \u2603 < 256; ++\u2603) {
            if (\u2603 == 0 || random.nextInt(3) == 0) {
                \u26036 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.d[\u2603] = \u26036 * \u26036;
        }
        while (n3 < n4) {
            double d5 = 1.5 + (double)(ns.a((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
            \u2603 = d5 * d4;
            d5 *= (double)random.nextFloat() * 0.25 + 0.75;
            \u2603 *= (double)random.nextFloat() * 0.25 + 0.75;
            float \u26037 = ns.b(f3);
            float \u26038 = ns.a(f3);
            d += (double)(ns.b(f2) * \u26037);
            d2 += (double)\u26038;
            d3 += (double)(ns.a(f2) * \u26037);
            f3 *= 0.7f;
            f3 += \u26035 * 0.05f;
            f2 += \u26034 * 0.05f;
            \u26035 *= 0.8f;
            \u26034 *= 0.5f;
            \u26035 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            \u26034 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n5 != 0 || random.nextInt(4) != 0) {
                \u2603 = d - \u26032;
                \u2603 = d3 - \u26033;
                \u2603 = n4 - n3;
                \u2603 = f + 2.0f + 16.0f;
                if (\u2603 * \u2603 + \u2603 * \u2603 - \u2603 * \u2603 > \u2603 * \u2603) {
                    return;
                }
                if (!(d < \u26032 - 16.0 - d5 * 2.0 || d3 < \u26033 - 16.0 - d5 * 2.0 || d > \u26032 + 16.0 + d5 * 2.0 || d3 > \u26033 + 16.0 + d5 * 2.0)) {
                    int n6 = ns.c(d - d5) - n * 16 - 1;
                    \u2603 = ns.c(d + d5) - n * 16 + 1;
                    \u2603 = ns.c(d2 - \u2603) - 1;
                    \u2603 = ns.c(d2 + \u2603) + 1;
                    \u2603 = ns.c(d3 - d5) - n2 * 16 - 1;
                    \u2603 = ns.c(d3 + d5) - n2 * 16 + 1;
                    if (n6 < 0) {
                        n6 = 0;
                    }
                    if (\u2603 > 16) {
                        \u2603 = 16;
                    }
                    if (\u2603 < 1) {
                        \u2603 = 1;
                    }
                    if (\u2603 > 248) {
                        \u2603 = 248;
                    }
                    if (\u2603 < 0) {
                        \u2603 = 0;
                    }
                    if (\u2603 > 16) {
                        \u2603 = 16;
                    }
                    boolean \u26039 = false;
                    for (\u2603 = n6; !\u26039 && \u2603 < \u2603; ++\u2603) {
                        for (i = \u2603; !\u26039 && i < \u2603; ++i) {
                            for (\u260310 = \u2603 + 1; !\u26039 && \u260310 >= \u2603 - 1; --\u260310) {
                                if (\u260310 < 0 || \u260310 >= 256) continue;
                                alz alz2 = ans2.a(\u2603, \u260310, i);
                                if (alz2.c() == afi.i || alz2.c() == afi.j) {
                                    \u26039 = true;
                                }
                                if (\u260310 == \u2603 - 1 || \u2603 == n6 || \u2603 == \u2603 - 1 || i == \u2603 || i == \u2603 - 1) continue;
                                int \u260310 = \u2603;
                            }
                        }
                    }
                    if (!\u26039) {
                        cj.a a2 = new cj.a();
                        for (int i = n6; i < \u2603; ++i) {
                            double d6 = ((double)(i + n * 16) + 0.5 - d) / d5;
                            for (int j = \u2603; j < \u2603; ++j) {
                                double d7 = ((double)(j + n2 * 16) + 0.5 - d3) / d5;
                                boolean \u260311 = false;
                                if (!(d6 * d6 + d7 * d7 < 1.0)) continue;
                                for (int k = \u2603; k > \u2603; --k) {
                                    double d8 = ((double)(k - 1) + 0.5 - d2) / \u2603;
                                    if (!((d6 * d6 + d7 * d7) * (double)this.d[k - 1] + d8 * d8 / 6.0 < 1.0)) continue;
                                    alz \u260312 = ans2.a(i, k, j);
                                    if (\u260312.c() == afi.c) {
                                        \u260311 = true;
                                    }
                                    if (\u260312.c() != afi.b && \u260312.c() != afi.d && \u260312.c() != afi.c) continue;
                                    if (k - 1 < 10) {
                                        ans2.a(i, k, j, afi.k.Q());
                                        continue;
                                    }
                                    ans2.a(i, k, j, afi.a.Q());
                                    if (!\u260311 || ans2.a(i, k - 1, j).c() != afi.d) continue;
                                    a2.c(i + n * 16, 0, j + n2 * 16);
                                    ans2.a(i, k - 1, j, this.c.b((cj)a2).ak);
                                }
                            }
                        }
                        if (n5 != 0) break;
                    }
                }
            }
            ++n3;
        }
    }

    @Override
    protected void a(adm adm2, int n, int n2, int n3, int n4, ans ans2) {
        if (this.b.nextInt(50) != 0) {
            return;
        }
        double d = n * 16 + this.b.nextInt(16);
        \u2603 = this.b.nextInt(this.b.nextInt(40) + 8) + 20;
        \u2603 = n2 * 16 + this.b.nextInt(16);
        int \u26032 = 1;
        for (int i = 0; i < \u26032; ++i) {
            float f = this.b.nextFloat() * (float)Math.PI * 2.0f;
            \u2603 = (this.b.nextFloat() - 0.5f) * 2.0f / 8.0f;
            \u2603 = (this.b.nextFloat() * 2.0f + this.b.nextFloat()) * 2.0f;
            this.a(this.b.nextLong(), n3, n4, ans2, d, \u2603, \u2603, \u2603, f, \u2603, 0, 0, 3.0);
        }
    }
}
