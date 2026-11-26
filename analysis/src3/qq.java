/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class qq {
    protected ps a;
    protected double b;
    protected double c;
    protected double d;
    protected double e;
    protected boolean f;

    public qq(ps ps2) {
        this.a = ps2;
        this.b = ps2.s;
        this.c = ps2.t;
        this.d = ps2.u;
    }

    public boolean a() {
        return this.f;
    }

    public double b() {
        return this.e;
    }

    public void a(double d, double d2, double d3, double d4) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = true;
    }

    public void c() {
        this.a.n(0.0f);
        if (!this.f) {
            return;
        }
        this.f = false;
        double d = this.b - this.a.s;
        int \u26032 = ns.c(this.a.aR().b + 0.5);
        \u2603 = this.c - (double)\u26032;
        \u2603 = d * d + \u2603 * \u2603 + (\u2603 = this.d - this.a.u) * \u2603;
        if (\u2603 < 2.500000277905201E-7) {
            return;
        }
        float \u26033 = (float)(ns.b(\u2603, d) * 180.0 / 3.1415927410125732) - 90.0f;
        this.a.y = this.a(this.a.y, \u26033, 30.0f);
        this.a.k((float)(this.e * this.a.a(vy.d).e()));
        if (\u2603 > 0.0 && d * d + \u2603 * \u2603 < 1.0) {
            this.a.r().a();
        }
    }

    protected float a(float f, float f2, float f3) {
        \u2603 = ns.g(f2 - f);
        if (\u2603 > f3) {
            \u2603 = f3;
        }
        if (\u2603 < -f3) {
            \u2603 = -f3;
        }
        if ((\u2603 = f + \u2603) < 0.0f) {
            \u2603 += 360.0f;
        } else if (\u2603 > 360.0f) {
            \u2603 -= 360.0f;
        }
        return \u2603;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }
}
