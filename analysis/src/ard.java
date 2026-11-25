/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class ard
extends arh {
    private arg[] a;
    private int b;

    public ard(Random random, int n) {
        this.b = n;
        this.a = new arg[n];
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            this.a[\u2603] = new arg(random);
        }
    }

    public double a(double d, double d2) {
        double d3;
        d3 = 0.0;
        \u2603 = 1.0;
        for (int i = 0; i < this.b; ++i) {
            d3 += this.a[i].a(d * \u2603, d2 * \u2603) / \u2603;
            \u2603 /= 2.0;
        }
        return d3;
    }

    public double[] a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        return this.a(dArray, d, d2, n, n2, d3, d4, d5, 0.5);
    }

    public double[] a(double[] dArray2, double d, double d2, int n, int n2, double d3, double d4, double d5, double d6) {
        double[] dArray2;
        if (dArray2 == null || dArray2.length < n * n2) {
            dArray2 = new double[n * n2];
        } else {
            for (int i = 0; i < dArray2.length; ++i) {
                dArray2[i] = 0.0;
            }
        }
        double d7 = 1.0;
        \u2603 = 1.0;
        for (int i = 0; i < this.b; ++i) {
            this.a[i].a(dArray2, d, d2, n, n2, d3 * \u2603 * d7, d4 * \u2603 * d7, 0.55 / d7);
            \u2603 *= d5;
            d7 *= d6;
        }
        return dArray2;
    }
}
