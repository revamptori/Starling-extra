/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
public class aug {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public aug(double d, double d2, double d3, double d4, double d5, double d6) {
        this.a = Math.min((double)d, (double)d4);
        this.b = Math.min((double)d2, (double)d5);
        this.c = Math.min((double)d3, (double)d6);
        this.d = Math.max((double)d, (double)d4);
        this.e = Math.max((double)d2, (double)d5);
        this.f = Math.max((double)d3, (double)d6);
    }

    public aug(cj cj2, cj cj3) {
        this.a = cj2.n();
        this.b = cj2.o();
        this.c = cj2.p();
        this.d = cj3.n();
        this.e = cj3.o();
        this.f = cj3.p();
    }

    public aug a(double d, double d2, double d3) {
        \u2603 = this.a;
        \u2603 = this.b;
        \u2603 = this.c;
        \u2603 = this.d;
        \u2603 = this.e;
        \u2603 = this.f;
        if (d < 0.0) {
            \u2603 += d;
        } else if (d > 0.0) {
            \u2603 += d;
        }
        if (d2 < 0.0) {
            \u2603 += d2;
        } else if (d2 > 0.0) {
            \u2603 += d2;
        }
        if (d3 < 0.0) {
            \u2603 += d3;
        } else if (d3 > 0.0) {
            \u2603 += d3;
        }
        return new aug(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public aug b(double d, double d2, double d3) {
        \u2603 = this.a - d;
        \u2603 = this.b - d2;
        \u2603 = this.c - d3;
        \u2603 = this.d + d;
        \u2603 = this.e + d2;
        \u2603 = this.f + d3;
        return new aug(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public aug a(aug aug2) {
        double d = Math.min((double)this.a, (double)aug2.a);
        \u2603 = Math.min((double)this.b, (double)aug2.b);
        \u2603 = Math.min((double)this.c, (double)aug2.c);
        \u2603 = Math.max((double)this.d, (double)aug2.d);
        \u2603 = Math.max((double)this.e, (double)aug2.e);
        \u2603 = Math.max((double)this.f, (double)aug2.f);
        return new aug(d, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public static aug a(double d, double d2, double d3, double d4, double d5, double d6) {
        \u2603 = Math.min((double)d, (double)d4);
        \u2603 = Math.min((double)d2, (double)d5);
        \u2603 = Math.min((double)d3, (double)d6);
        \u2603 = Math.max((double)d, (double)d4);
        \u2603 = Math.max((double)d2, (double)d5);
        \u2603 = Math.max((double)d3, (double)d6);
        return new aug(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public aug c(double d, double d2, double d3) {
        return new aug(this.a + d, this.b + d2, this.c + d3, this.d + d, this.e + d2, this.f + d3);
    }

    public double a(aug aug2, double d) {
        if (aug2.e <= this.b || aug2.b >= this.e || aug2.f <= this.c || aug2.c >= this.f) {
            return d;
        }
        if (d > 0.0 && aug2.d <= this.a) {
            \u2603 = this.a - aug2.d;
            if (\u2603 < d) {
                d = \u2603;
            }
        } else if (d < 0.0 && aug2.a >= this.d && (\u2603 = this.d - aug2.a) > d) {
            d = \u2603;
        }
        return d;
    }

    public double b(aug aug2, double d) {
        if (aug2.d <= this.a || aug2.a >= this.d || aug2.f <= this.c || aug2.c >= this.f) {
            return d;
        }
        if (d > 0.0 && aug2.e <= this.b) {
            \u2603 = this.b - aug2.e;
            if (\u2603 < d) {
                d = \u2603;
            }
        } else if (d < 0.0 && aug2.b >= this.e && (\u2603 = this.e - aug2.b) > d) {
            d = \u2603;
        }
        return d;
    }

    public double c(aug aug2, double d) {
        if (aug2.d <= this.a || aug2.a >= this.d || aug2.e <= this.b || aug2.b >= this.e) {
            return d;
        }
        if (d > 0.0 && aug2.f <= this.c) {
            \u2603 = this.c - aug2.f;
            if (\u2603 < d) {
                d = \u2603;
            }
        } else if (d < 0.0 && aug2.c >= this.f && (\u2603 = this.f - aug2.c) > d) {
            d = \u2603;
        }
        return d;
    }

    public boolean b(aug aug2) {
        if (aug2.d <= this.a || aug2.a >= this.d) {
            return false;
        }
        if (aug2.e <= this.b || aug2.b >= this.e) {
            return false;
        }
        return !(aug2.f <= this.c) && !(aug2.c >= this.f);
    }

    public boolean a(aui aui2) {
        if (aui2.a <= this.a || aui2.a >= this.d) {
            return false;
        }
        if (aui2.b <= this.b || aui2.b >= this.e) {
            return false;
        }
        return !(aui2.c <= this.c) && !(aui2.c >= this.f);
    }

    public double a() {
        double d = this.d - this.a;
        \u2603 = this.e - this.b;
        \u2603 = this.f - this.c;
        return (d + \u2603 + \u2603) / 3.0;
    }

    public aug d(double d, double d2, double d3) {
        \u2603 = this.a + d;
        \u2603 = this.b + d2;
        \u2603 = this.c + d3;
        \u2603 = this.d - d;
        \u2603 = this.e - d2;
        \u2603 = this.f - d3;
        return new aug(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public auh a(aui aui2, aui aui3) {
        \u2603 = aui2.a(aui3, this.a);
        \u2603 = aui2.a(aui3, this.d);
        \u2603 = aui2.b(aui3, this.b);
        \u2603 = aui2.b(aui3, this.e);
        \u2603 = aui2.c(aui3, this.c);
        \u2603 = aui2.c(aui3, this.f);
        if (!this.b(\u2603)) {
            \u2603 = null;
        }
        if (!this.b(\u2603)) {
            \u2603 = null;
        }
        if (!this.c(\u2603)) {
            \u2603 = null;
        }
        if (!this.c(\u2603)) {
            \u2603 = null;
        }
        if (!this.d(\u2603)) {
            \u2603 = null;
        }
        if (!this.d(\u2603)) {
            \u2603 = null;
        }
        \u2603 = null;
        if (\u2603 != null) {
            \u2603 = \u2603;
        }
        if (\u2603 != null && (\u2603 == null || aui2.g(\u2603) < aui2.g(\u2603))) {
            \u2603 = \u2603;
        }
        if (\u2603 != null && (\u2603 == null || aui2.g(\u2603) < aui2.g(\u2603))) {
            \u2603 = \u2603;
        }
        if (\u2603 != null && (\u2603 == null || aui2.g(\u2603) < aui2.g(\u2603))) {
            \u2603 = \u2603;
        }
        if (\u2603 != null && (\u2603 == null || aui2.g(\u2603) < aui2.g(\u2603))) {
            \u2603 = \u2603;
        }
        if (\u2603 != null && (\u2603 == null || aui2.g(\u2603) < aui2.g(\u2603))) {
            \u2603 = \u2603;
        }
        if (\u2603 == null) {
            return null;
        }
        cq cq2 = null;
        cq2 = \u2603 == \u2603 ? cq.e : (\u2603 == \u2603 ? cq.f : (\u2603 == \u2603 ? cq.a : (\u2603 == \u2603 ? cq.b : (\u2603 == \u2603 ? cq.c : cq.d))));
        return new auh(\u2603, cq2);
    }

    private boolean b(aui aui2) {
        if (aui2 == null) {
            return false;
        }
        return aui2.b >= this.b && aui2.b <= this.e && aui2.c >= this.c && aui2.c <= this.f;
    }

    private boolean c(aui aui2) {
        if (aui2 == null) {
            return false;
        }
        return aui2.a >= this.a && aui2.a <= this.d && aui2.c >= this.c && aui2.c <= this.f;
    }

    private boolean d(aui aui2) {
        if (aui2 == null) {
            return false;
        }
        return aui2.a >= this.a && aui2.a <= this.d && aui2.b >= this.b && aui2.b <= this.e;
    }

    public String toString() {
        return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
    }

    public boolean b() {
        return Double.isNaN((double)this.a) || Double.isNaN((double)this.b) || Double.isNaN((double)this.c) || Double.isNaN((double)this.d) || Double.isNaN((double)this.e) || Double.isNaN((double)this.f);
    }
}
