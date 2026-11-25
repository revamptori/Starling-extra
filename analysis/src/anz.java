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

public class anz
extends any {
    protected void a(long l, int n, int n2, ans ans2, double d, double d2, double d3) {
        this.a(l, n, n2, ans2, d, d2, d3, 1.0f + this.b.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    protected void a(long l, int n, int n2, ans ans2, double d, double d2, double d3, float f, float f2, float \u260352, int n32, int n4, double d4) {
        int n5;
        \u2603 = n * 16 + 8;
        \u2603 = n2 * 16 + 8;
        float f3 = 0.0f;
        \u2603 = 0.0f;
        Random \u26032 = new Random(l);
        if (n4 <= 0) {
            n5 = this.a * 16 - 16;
            n4 = n5 - \u26032.nextInt(n5 / 4);
        }
        n5 = 0;
        if (n32 == -1) {
            n32 = n4 / 2;
            n5 = 1;
        }
        \u2603 = \u26032.nextInt(n4 / 2) + n4 / 4;
        boolean bl = \u2603 = \u26032.nextInt(6) == 0;
        while (n32 < n4) {
            int n32;
            double d5 = 1.5 + (double)(ns.a((float)n32 * (float)Math.PI / (float)n4) * f * 1.0f);
            \u2603 = d5 * d4;
            float \u26033 = ns.b(\u260352);
            float \u26034 = ns.a(\u260352);
            d += (double)(ns.b(f2) * \u26033);
            d2 += (double)\u26034;
            d3 += (double)(ns.a(f2) * \u26033);
            float \u260352 = \u2603 ? (\u260352 *= 0.92f) : (\u260352 *= 0.7f);
            \u260352 += \u2603 * 0.1f;
            f2 += f3 * 0.1f;
            \u2603 *= 0.9f;
            f3 *= 0.75f;
            \u2603 += (\u26032.nextFloat() - \u26032.nextFloat()) * \u26032.nextFloat() * 2.0f;
            f3 += (\u26032.nextFloat() - \u26032.nextFloat()) * \u26032.nextFloat() * 4.0f;
            if (n5 == 0 && n32 == \u2603 && f > 1.0f) {
                this.a(\u26032.nextLong(), n, n2, ans2, d, d2, d3, \u26032.nextFloat() * 0.5f + 0.5f, f2 - 1.5707964f, \u260352 / 3.0f, n32, n4, 1.0);
                this.a(\u26032.nextLong(), n, n2, ans2, d, d2, d3, \u26032.nextFloat() * 0.5f + 0.5f, f2 + 1.5707964f, \u260352 / 3.0f, n32, n4, 1.0);
                return;
            }
            if (n5 != 0 || \u26032.nextInt(4) != 0) {
                \u2603 = d - \u2603;
                \u2603 = d3 - \u2603;
                \u2603 = n4 - n32;
                \u2603 = f + 2.0f + 16.0f;
                if (\u2603 * \u2603 + \u2603 * \u2603 - \u2603 * \u2603 > \u2603 * \u2603) {
                    return;
                }
                if (!(d < \u2603 - 16.0 - d5 * 2.0 || d3 < \u2603 - 16.0 - d5 * 2.0 || d > \u2603 + 16.0 + d5 * 2.0 || d3 > \u2603 + 16.0 + d5 * 2.0)) {
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
                    if (\u2603 > 120) {
                        \u2603 = 120;
                    }
                    if (\u2603 < 0) {
                        \u2603 = 0;
                    }
                    if (\u2603 > 16) {
                        \u2603 = 16;
                    }
                    boolean \u26036 = false;
                    for (i = n6; !\u26036 && i < \u2603; ++i) {
                        for (\u2603 = \u2603; !\u26036 && \u2603 < \u2603; ++\u2603) {
                            for (\u26037 = \u2603 + 1; !\u26036 && \u26037 >= \u2603 - 1; --\u26037) {
                                if (\u26037 < 0 || \u26037 >= 128) continue;
                                alz alz2 = ans2.a(i, \u26037, \u2603);
                                if (alz2.c() == afi.k || alz2.c() == afi.l) {
                                    \u26036 = true;
                                }
                                if (\u26037 == \u2603 - 1 || i == n6 || i == \u2603 - 1 || \u2603 == \u2603 || \u2603 == \u2603 - 1) continue;
                                int \u26037 = \u2603;
                            }
                        }
                    }
                    if (!\u26036) {
                        for (int i = n6; i < \u2603; ++i) {
                            double d6 = ((double)(i + n * 16) + 0.5 - d) / d5;
                            for (int j = \u2603; j < \u2603; ++j) {
                                double d7 = ((double)(j + n2 * 16) + 0.5 - d3) / d5;
                                for (int k = \u2603; k > \u2603; --k) {
                                    double d8 = ((double)(k - 1) + 0.5 - d2) / \u2603;
                                    if (!(d8 > -0.7) || !(d6 * d6 + d8 * d8 + d7 * d7 < 1.0) || (\u2603 = ans2.a(i, k, j)).c() != afi.aV && \u2603.c() != afi.d && \u2603.c() != afi.c) continue;
                                    ans2.a(i, k, j, afi.a.Q());
                                }
                            }
                        }
                        if (n5 != 0) break;
                    }
                }
            }
            ++n32;
        }
    }

    @Override
    protected void a(adm adm2, int n, int n2, int n3, int n4, ans ans2) {
        int n5 = this.b.nextInt(this.b.nextInt(this.b.nextInt(10) + 1) + 1);
        if (this.b.nextInt(5) != 0) {
            n5 = 0;
        }
        for (\u2603 = 0; \u2603 < n5; ++\u2603) {
            double d = n * 16 + this.b.nextInt(16);
            \u2603 = this.b.nextInt(128);
            \u2603 = n2 * 16 + this.b.nextInt(16);
            int \u26032 = 1;
            if (this.b.nextInt(4) == 0) {
                this.a(this.b.nextLong(), n3, n4, ans2, d, \u2603, \u2603);
                \u26032 += this.b.nextInt(4);
            }
            for (int i = 0; i < \u26032; ++i) {
                float f = this.b.nextFloat() * (float)Math.PI * 2.0f;
                \u2603 = (this.b.nextFloat() - 0.5f) * 2.0f / 8.0f;
                \u2603 = this.b.nextFloat() * 2.0f + this.b.nextFloat();
                this.a(this.b.nextLong(), n3, n4, ans2, d, \u2603, \u2603, \u2603 * 2.0f, f, \u2603, 0, 0, 0.5);
            }
        }
    }
}
