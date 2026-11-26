/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class arg {
    private static int[][] e = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
    public static final double a = Math.sqrt((double)3.0);
    private int[] f = new int[512];
    public double b;
    public double c;
    public double d;
    private static final double g = 0.5 * (a - 1.0);
    private static final double h = (3.0 - a) / 6.0;

    public arg() {
        this(new Random());
    }

    public arg(Random random) {
        int n;
        this.b = random.nextDouble() * 256.0;
        this.c = random.nextDouble() * 256.0;
        this.d = random.nextDouble() * 256.0;
        for (n = 0; n < 256; ++n) {
            this.f[n] = n;
        }
        for (n = 0; n < 256; ++n) {
            \u2603 = random.nextInt(256 - n) + n;
            \u2603 = this.f[n];
            this.f[n] = this.f[\u2603];
            this.f[\u2603] = \u2603;
            this.f[n + 256] = this.f[n];
        }
    }

    private static int a(double d) {
        return d > 0.0 ? (int)d : (int)d - 1;
    }

    private static double a(int[] nArray, double d, double d2) {
        return (double)nArray[0] * d + (double)nArray[1] * d2;
    }

    public double a(double d, double d2) {
        double \u26039;
        \u2603 = 0.5 * (a - 1.0);
        \u2603 = (d + d2) * \u2603;
        int n = arg.a(d + \u2603);
        double \u26032 = (double)n - (\u2603 = (double)(n + (\u2603 = arg.a(d2 + \u2603))) * (\u2603 = (3.0 - a) / 6.0));
        double \u26033 = d - \u26032;
        if (\u26033 > (\u2603 = d2 - (\u2603 = (double)\u2603 - \u2603))) {
            \u2603 = 1;
            \u2603 = 0;
        } else {
            \u2603 = 0;
            \u2603 = 1;
        }
        double \u26034 = \u26033 - (double)\u2603 + \u2603;
        double \u26035 = \u2603 - (double)\u2603 + \u2603;
        double \u26036 = \u26033 - 1.0 + 2.0 * \u2603;
        double \u26037 = \u2603 - 1.0 + 2.0 * \u2603;
        \u2603 = n & 0xFF;
        \u2603 = \u2603 & 0xFF;
        n2 = this.f[\u2603 + this.f[\u2603]] % 12;
        \u2603 = this.f[\u2603 + \u2603 + this.f[\u2603 + \u2603]] % 12;
        \u2603 = this.f[\u2603 + 1 + this.f[\u2603 + 1]] % 12;
        double \u26038 = 0.5 - \u26033 * \u26033 - \u2603 * \u2603;
        if (\u26038 < 0.0) {
            \u26039 = 0.0;
        } else {
            int n2;
            \u26038 *= \u26038;
            \u26039 = \u26038 * \u26038 * arg.a(e[n2], \u26033, \u2603);
        }
        double d3 = 0.5 - \u26034 * \u26034 - \u26035 * \u26035;
        if (d3 < 0.0) {
            \u2603 = 0.0;
        } else {
            d3 *= d3;
            \u2603 = d3 * d3 * arg.a(e[\u2603], \u26034, \u26035);
        }
        \u2603 = 0.5 - \u26036 * \u26036 - \u26037 * \u26037;
        if (\u2603 < 0.0) {
            \u2603 = 0.0;
        } else {
            \u2603 *= \u2603;
            \u2603 = \u2603 * \u2603 * arg.a(e[\u2603], \u26036, \u26037);
        }
        return 70.0 * (\u26039 + \u2603 + \u2603);
    }

    public void a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        int n3 = 0;
        for (\u2603 = 0; \u2603 < n2; ++\u2603) {
            double d6 = (d2 + (double)\u2603) * d4 + this.c;
            for (int i = 0; i < n; ++i) {
                double d7;
                int n4;
                double d8 = (d + (double)i) * d3 + this.b;
                \u2603 = (d8 + d6) * g;
                int \u26032 = arg.a(d8 + \u2603);
                \u2603 = (double)\u26032 - (\u2603 = (double)(\u26032 + (\u2603 = arg.a(d6 + \u2603))) * h);
                d7 = d8 - \u2603;
                if (d7 > (\u2603 = d6 - (\u2603 = (double)\u2603 - \u2603))) {
                    n4 = 1;
                    \u2603 = 0;
                } else {
                    n4 = 0;
                    \u2603 = 1;
                }
                \u2603 = d7 - (double)n4 + h;
                \u2603 = \u2603 - (double)\u2603 + h;
                \u2603 = d7 - 1.0 + 2.0 * h;
                \u2603 = \u2603 - 1.0 + 2.0 * h;
                int \u26033 = \u26032 & 0xFF;
                int \u26034 = \u2603 & 0xFF;
                int \u26035 = this.f[\u26033 + this.f[\u26034]] % 12;
                int \u26036 = this.f[\u26033 + n4 + this.f[\u26034 + \u2603]] % 12;
                int \u26037 = this.f[\u26033 + 1 + this.f[\u26034 + 1]] % 12;
                \u2603 = 0.5 - d7 * d7 - \u2603 * \u2603;
                if (\u2603 < 0.0) {
                    \u2603 = 0.0;
                } else {
                    \u2603 *= \u2603;
                    \u2603 = \u2603 * \u2603 * arg.a(e[\u26035], d7, \u2603);
                }
                \u2603 = 0.5 - \u2603 * \u2603 - \u2603 * \u2603;
                if (\u2603 < 0.0) {
                    \u2603 = 0.0;
                } else {
                    \u2603 *= \u2603;
                    \u2603 = \u2603 * \u2603 * arg.a(e[\u26036], \u2603, \u2603);
                }
                \u2603 = 0.5 - \u2603 * \u2603 - \u2603 * \u2603;
                if (\u2603 < 0.0) {
                    \u2603 = 0.0;
                } else {
                    \u2603 *= \u2603;
                    \u2603 = \u2603 * \u2603 * arg.a(e[\u26037], \u2603, \u2603);
                }
                int n5 = n3++;
                dArray[n5] = dArray[n5] + 70.0 * (\u2603 + \u2603 + \u2603) * d5;
            }
        }
    }
}
