/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import com.google.common.base.Objects;
import java.util.Random;

public class anx
extends any {
    protected void a(long l, int n, int n2, ans ans2, double d, double d2, double d3) {
        this.a(l, n, n2, ans2, d, d2, d3, 1.0f + this.b.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    protected void a(long l, int n, int n2, ans ans2, double d, double d2, double d3, float f, float f2, float \u260352, int n3, int n4, double d4) {
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
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        \u2603 = \u26032.nextInt(n4 / 2) + n4 / 4;
        boolean bl = \u2603 = \u26032.nextInt(6) == 0;
        while (n3 < n4) {
            double d5 = 1.5 + (double)(ns.a((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
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
            if (n5 == 0 && n3 == \u2603 && f > 1.0f && n4 > 0) {
                this.a(\u26032.nextLong(), n, n2, ans2, d, d2, d3, \u26032.nextFloat() * 0.5f + 0.5f, f2 - 1.5707964f, \u260352 / 3.0f, n3, n4, 1.0);
                this.a(\u26032.nextLong(), n, n2, ans2, d, d2, d3, \u26032.nextFloat() * 0.5f + 0.5f, f2 + 1.5707964f, \u260352 / 3.0f, n3, n4, 1.0);
                return;
            }
            if (n5 != 0 || \u26032.nextInt(4) != 0) {
                \u2603 = d - \u2603;
                \u2603 = d3 - \u2603;
                \u2603 = n4 - n3;
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
                    if (\u2603 > 248) {
                        \u2603 = 248;
                    }
                    if (\u2603 < 0) {
                        \u2603 = 0;
                    }
                    if (\u2603 > 16) {
                        \u2603 = 16;
                    }
                    boolean \u26036 = false;
                    for (\u2603 = n6; !\u26036 && \u2603 < \u2603; ++\u2603) {
                        for (i = \u2603; !\u26036 && i < \u2603; ++i) {
                            for (\u26037 = \u2603 + 1; !\u26036 && \u26037 >= \u2603 - 1; --\u26037) {
                                if (\u26037 < 0 || \u26037 >= 256) continue;
                                alz alz2 = ans2.a(\u2603, \u26037, i);
                                if (alz2.c() == afi.i || alz2.c() == afi.j) {
                                    \u26036 = true;
                                }
                                if (\u26037 == \u2603 - 1 || \u2603 == n6 || \u2603 == \u2603 - 1 || i == \u2603 || i == \u2603 - 1) continue;
                                int \u26037 = \u2603;
                            }
                        }
                    }
                    if (!\u26036) {
                        cj.a a2 = new cj.a();
                        for (int i = n6; i < \u2603; ++i) {
                            double d6 = ((double)(i + n * 16) + 0.5 - d) / d5;
                            for (int j = \u2603; j < \u2603; ++j) {
                                double d7 = ((double)(j + n2 * 16) + 0.5 - d3) / d5;
                                boolean \u26038 = false;
                                if (!(d6 * d6 + d7 * d7 < 1.0)) continue;
                                for (int k = \u2603; k > \u2603; --k) {
                                    double d8 = ((double)(k - 1) + 0.5 - d2) / \u2603;
                                    if (!(d8 > -0.7) || !(d6 * d6 + d8 * d8 + d7 * d7 < 1.0)) continue;
                                    alz \u26039 = ans2.a(i, k, j);
                                    alz \u260310 = (alz)Objects.firstNonNull((Object)ans2.a(i, k + 1, j), (Object)afi.a.Q());
                                    if (\u26039.c() == afi.c || \u26039.c() == afi.bw) {
                                        \u26038 = true;
                                    }
                                    if (!this.a(\u26039, \u260310)) continue;
                                    if (k - 1 < 10) {
                                        ans2.a(i, k, j, afi.l.Q());
                                        continue;
                                    }
                                    ans2.a(i, k, j, afi.a.Q());
                                    if (\u260310.c() == afi.m) {
                                        ans2.a(i, k + 1, j, \u260310.b(ajh.a) == ajh.a.b ? afi.cM.Q() : afi.A.Q());
                                    }
                                    if (!\u26038 || ans2.a(i, k - 1, j).c() != afi.d) continue;
                                    a2.c(i + n * 16, 0, j + n2 * 16);
                                    ans2.a(i, k - 1, j, this.c.b((cj)a2).ak.c().Q());
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

    protected boolean a(alz alz2, alz alz3) {
        if (alz2.c() == afi.b) {
            return true;
        }
        if (alz2.c() == afi.d) {
            return true;
        }
        if (alz2.c() == afi.c) {
            return true;
        }
        if (alz2.c() == afi.cz) {
            return true;
        }
        if (alz2.c() == afi.cu) {
            return true;
        }
        if (alz2.c() == afi.A) {
            return true;
        }
        if (alz2.c() == afi.cM) {
            return true;
        }
        if (alz2.c() == afi.bw) {
            return true;
        }
        if (alz2.c() == afi.aH) {
            return true;
        }
        return (alz2.c() == afi.m || alz2.c() == afi.n) && alz3.c().t() != arm.h;
    }

    @Override
    protected void a(adm adm2, int n, int n2, int n3, int n4, ans ans2) {
        int n5 = this.b.nextInt(this.b.nextInt(this.b.nextInt(15) + 1) + 1);
        if (this.b.nextInt(7) != 0) {
            n5 = 0;
        }
        for (\u2603 = 0; \u2603 < n5; ++\u2603) {
            double d = n * 16 + this.b.nextInt(16);
            \u2603 = this.b.nextInt(this.b.nextInt(120) + 8);
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
                if (this.b.nextInt(10) == 0) {
                    \u2603 *= this.b.nextFloat() * this.b.nextFloat() * 3.0f + 1.0f;
                }
                this.a(this.b.nextLong(), n3, n4, ans2, d, \u2603, \u2603, \u2603, f, \u2603, 0, 0, 1.0);
            }
        }
    }
}
