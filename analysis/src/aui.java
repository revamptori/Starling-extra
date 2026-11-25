/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class aui {
    public final double a;
    public final double b;
    public final double c;

    public aui(double d, double d2, double d3) {
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public aui(df df2) {
        this(df2.n(), df2.o(), df2.p());
    }

    public aui a(aui aui2) {
        return new aui(aui2.a - this.a, aui2.b - this.b, aui2.c - this.c);
    }

    public aui a() {
        double d = ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
        if (d < 1.0E-4) {
            return new aui(0.0, 0.0, 0.0);
        }
        return new aui(this.a / d, this.b / d, this.c / d);
    }

    public double b(aui aui2) {
        return this.a * aui2.a + this.b * aui2.b + this.c * aui2.c;
    }

    public aui c(aui aui2) {
        return new aui(this.b * aui2.c - this.c * aui2.b, this.c * aui2.a - this.a * aui2.c, this.a * aui2.b - this.b * aui2.a);
    }

    public aui d(aui aui2) {
        return this.a(aui2.a, aui2.b, aui2.c);
    }

    public aui a(double d, double d2, double d3) {
        return this.b(-d, -d2, -d3);
    }

    public aui e(aui aui2) {
        return this.b(aui2.a, aui2.b, aui2.c);
    }

    public aui b(double d, double d2, double d3) {
        return new aui(this.a + d, this.b + d2, this.c + d3);
    }

    public double f(aui aui2) {
        double d = aui2.a - this.a;
        \u2603 = aui2.b - this.b;
        \u2603 = aui2.c - this.c;
        return ns.a(d * d + \u2603 * \u2603 + \u2603 * \u2603);
    }

    public double g(aui aui2) {
        double d = aui2.a - this.a;
        \u2603 = aui2.b - this.b;
        \u2603 = aui2.c - this.c;
        return d * d + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public double b() {
        return ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
    }

    public aui a(aui aui2, double d) {
        \u2603 = aui2.a - this.a;
        \u2603 = aui2.b - this.b;
        \u2603 = aui2.c - this.c;
        if (\u2603 * \u2603 < (double)1.0E-7f) {
            return null;
        }
        \u2603 = (d - this.a) / \u2603;
        if (\u2603 < 0.0 || \u2603 > 1.0) {
            return null;
        }
        return new aui(this.a + \u2603 * \u2603, this.b + \u2603 * \u2603, this.c + \u2603 * \u2603);
    }

    public aui b(aui aui2, double d) {
        \u2603 = aui2.a - this.a;
        \u2603 = aui2.b - this.b;
        \u2603 = aui2.c - this.c;
        if (\u2603 * \u2603 < (double)1.0E-7f) {
            return null;
        }
        \u2603 = (d - this.b) / \u2603;
        if (\u2603 < 0.0 || \u2603 > 1.0) {
            return null;
        }
        return new aui(this.a + \u2603 * \u2603, this.b + \u2603 * \u2603, this.c + \u2603 * \u2603);
    }

    public aui c(aui aui2, double d) {
        \u2603 = aui2.a - this.a;
        \u2603 = aui2.b - this.b;
        \u2603 = aui2.c - this.c;
        if (\u2603 * \u2603 < (double)1.0E-7f) {
            return null;
        }
        \u2603 = (d - this.c) / \u2603;
        if (\u2603 < 0.0 || \u2603 > 1.0) {
            return null;
        }
        return new aui(this.a + \u2603 * \u2603, this.b + \u2603 * \u2603, this.c + \u2603 * \u2603);
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public aui a(float f) {
        \u2603 = ns.b(f);
        \u2603 = ns.a(f);
        double d = this.a;
        \u2603 = this.b * (double)\u2603 + this.c * (double)\u2603;
        \u2603 = this.c * (double)\u2603 - this.b * (double)\u2603;
        return new aui(d, \u2603, \u2603);
    }

    public aui b(float f) {
        \u2603 = ns.b(f);
        \u2603 = ns.a(f);
        double d = this.a * (double)\u2603 + this.c * (double)\u2603;
        \u2603 = this.b;
        \u2603 = this.c * (double)\u2603 - this.a * (double)\u2603;
        return new aui(d, \u2603, \u2603);
    }
}
