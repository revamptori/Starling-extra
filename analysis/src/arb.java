/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class arb
extends arh {
    private int[] d = new int[512];
    public double a;
    public double b;
    public double c;
    private static final double[] e = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] f = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
    private static final double[] g = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    private static final double[] h = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] i = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};

    public arb() {
        this(new Random());
    }

    public arb(Random random) {
        int n;
        this.a = random.nextDouble() * 256.0;
        this.b = random.nextDouble() * 256.0;
        this.c = random.nextDouble() * 256.0;
        for (n = 0; n < 256; ++n) {
            this.d[n] = n;
        }
        for (n = 0; n < 256; ++n) {
            \u2603 = random.nextInt(256 - n) + n;
            \u2603 = this.d[n];
            this.d[n] = this.d[\u2603];
            this.d[\u2603] = \u2603;
            this.d[n + 256] = this.d[n];
        }
    }

    public final double b(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public final double a(int n, double d, double d2) {
        int n2 = n & 0xF;
        return h[n2] * d + i[n2] * d2;
    }

    public final double a(int n, double d, double d2, double d3) {
        int n2 = n & 0xF;
        return e[n2] * d + f[n2] * d2 + g[n2] * d3;
    }

    public void a(double[] dArray, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (n2 == 1) {
            int \u26039 = 0;
            \u260310 = 0;
            \u260311 = 0;
            \u260312 = 0;
            double \u26032 = 0.0;
            double \u26033 = 0.0;
            \u2603 = 0;
            double \u26034 = 1.0 / d7;
            for (\u2603 = 0; \u2603 < n; ++\u2603) {
                double d8 = d + (double)\u2603 * d4 + this.a;
                int \u26035 = (int)d8;
                if (d8 < (double)\u26035) {
                    --\u26035;
                }
                int \u26036 = \u26035 & 0xFF;
                \u2603 = (d8 -= (double)\u26035) * d8 * d8 * (d8 * (d8 * 6.0 - 15.0) + 10.0);
                for (int i = 0; i < n3; ++i) {
                    double d9 = d3 + (double)i * d6 + this.c;
                    int \u26037 = (int)d9;
                    if (d9 < (double)\u26037) {
                        --\u26037;
                    }
                    int \u26038 = \u26037 & 0xFF;
                    \u2603 = (d9 -= (double)\u26037) * d9 * d9 * (d9 * (d9 * 6.0 - 15.0) + 10.0);
                    \u26039 = this.d[\u26036] + 0;
                    int \u260310 = this.d[\u26039] + \u26038;
                    int \u260311 = this.d[\u26036 + 1] + 0;
                    int \u260312 = this.d[\u260311] + \u26038;
                    \u26032 = this.b(\u2603, this.a(this.d[\u260310], d8, d9), this.a(this.d[\u260312], d8 - 1.0, 0.0, d9));
                    \u26033 = this.b(\u2603, this.a(this.d[\u260310 + 1], d8, 0.0, d9 - 1.0), this.a(this.d[\u260312 + 1], d8 - 1.0, 0.0, d9 - 1.0));
                    \u2603 = this.b(\u2603, \u26032, \u26033);
                    int n4 = \u2603++;
                    dArray[n4] = dArray[n4] + \u2603 * \u26034;
                }
            }
            return;
        }
        int n5 = 0;
        double \u260313 = 1.0 / d7;
        n6 = -1;
        \u2603 = 0;
        \u2603 = 0;
        \u2603 = 0;
        \u2603 = 0;
        \u2603 = 0;
        \u2603 = 0;
        double \u260314 = 0.0;
        double \u260315 = 0.0;
        double \u260316 = 0.0;
        double \u260317 = 0.0;
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            double d10 = d + (double)\u2603 * d4 + this.a;
            int \u260318 = (int)d10;
            if (d10 < (double)\u260318) {
                --\u260318;
            }
            int \u260319 = \u260318 & 0xFF;
            \u2603 = (d10 -= (double)\u260318) * d10 * d10 * (d10 * (d10 * 6.0 - 15.0) + 10.0);
            for (int i = 0; i < n3; ++i) {
                double d11 = d3 + (double)i * d6 + this.c;
                int \u260320 = (int)d11;
                if (d11 < (double)\u260320) {
                    --\u260320;
                }
                int \u260321 = \u260320 & 0xFF;
                \u2603 = (d11 -= (double)\u260320) * d11 * d11 * (d11 * (d11 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n2; ++j) {
                    double d12;
                    double d13 = d2 + (double)j * d5 + this.b;
                    int \u260322 = (int)d13;
                    if (d13 < (double)\u260322) {
                        --\u260322;
                    }
                    int \u260323 = \u260322 & 0xFF;
                    d12 = (d13 -= (double)\u260322) * d13 * d13 * (d13 * (d13 * 6.0 - 15.0) + 10.0);
                    if (j == 0 || \u260323 != n6) {
                        int n6 = \u260323;
                        \u2603 = this.d[\u260319] + \u260323;
                        \u2603 = this.d[\u2603] + \u260321;
                        \u2603 = this.d[\u2603 + 1] + \u260321;
                        \u2603 = this.d[\u260319 + 1] + \u260323;
                        \u2603 = this.d[\u2603] + \u260321;
                        \u2603 = this.d[\u2603 + 1] + \u260321;
                        \u260314 = this.b(\u2603, this.a(this.d[\u2603], d10, d13, d11), this.a(this.d[\u2603], d10 - 1.0, d13, d11));
                        \u260315 = this.b(\u2603, this.a(this.d[\u2603], d10, d13 - 1.0, d11), this.a(this.d[\u2603], d10 - 1.0, d13 - 1.0, d11));
                        \u260316 = this.b(\u2603, this.a(this.d[\u2603 + 1], d10, d13, d11 - 1.0), this.a(this.d[\u2603 + 1], d10 - 1.0, d13, d11 - 1.0));
                        \u260317 = this.b(\u2603, this.a(this.d[\u2603 + 1], d10, d13 - 1.0, d11 - 1.0), this.a(this.d[\u2603 + 1], d10 - 1.0, d13 - 1.0, d11 - 1.0));
                    }
                    \u2603 = this.b(d12, \u260314, \u260315);
                    \u2603 = this.b(d12, \u260316, \u260317);
                    \u2603 = this.b(\u2603, \u2603, \u2603);
                    int n7 = n5++;
                    dArray[n7] = dArray[n7] + \u2603 * \u260313;
                }
            }
        }
    }
}
