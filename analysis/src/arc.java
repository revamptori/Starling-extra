/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class arc
extends arh {
    private arb[] a;
    private int b;

    public arc(Random random, int n) {
        this.b = n;
        this.a = new arb[n];
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            this.a[\u2603] = new arb(random);
        }
    }

    public double[] a(double[] dArray2, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        if (dArray2 == null) {
            double[] dArray2 = new double[n4 * n5 * n6];
        } else {
            for (int i = 0; i < dArray2.length; ++i) {
                dArray2[i] = 0.0;
            }
        }
        double d4 = 1.0;
        for (int i = 0; i < this.b; ++i) {
            double d5 = (double)n * d4 * d;
            \u2603 = (double)n2 * d4 * d2;
            \u2603 = (double)n3 * d4 * d3;
            long \u26032 = ns.d(d5);
            long \u26033 = ns.d(\u2603);
            d5 -= (double)\u26032;
            \u2603 -= (double)\u26033;
            this.a[i].a(dArray2, d5 += (double)(\u26032 %= 0x1000000L), \u2603, \u2603 += (double)(\u26033 %= 0x1000000L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.0;
        }
        return dArray2;
    }

    public double[] a(double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.a(dArray, n, 10, n2, n3, 1, n4, d, 1.0, d2);
    }
}
