/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class qp {
    private ps a;
    private float b;
    private float c;
    private boolean d;
    private double e;
    private double f;
    private double g;

    public qp(ps ps2) {
        this.a = ps2;
    }

    public void a(pk pk2, float f, float f2) {
        this.e = pk2.s;
        this.f = pk2 instanceof pr ? pk2.t + (double)pk2.aS() : (pk2.aR().b + pk2.aR().e) / 2.0;
        this.g = pk2.u;
        this.b = f;
        this.c = f2;
        this.d = true;
    }

    public void a(double d, double d2, double d3, float f, float f2) {
        this.e = d;
        this.f = d2;
        this.g = d3;
        this.b = f;
        this.c = f2;
        this.d = true;
    }

    public void a() {
        this.a.z = 0.0f;
        if (this.d) {
            this.d = false;
            double d = this.e - this.a.s;
            \u2603 = this.f - (this.a.t + (double)this.a.aS());
            \u2603 = this.g - this.a.u;
            \u2603 = ns.a(d * d + \u2603 * \u2603);
            float \u26032 = (float)(ns.b(\u2603, d) * 180.0 / 3.1415927410125732) - 90.0f;
            float \u26033 = (float)(-(ns.b(\u2603, \u2603) * 180.0 / 3.1415927410125732));
            this.a.z = this.a(this.a.z, \u26033, this.c);
            this.a.aK = this.a(this.a.aK, \u26032, this.b);
        } else {
            this.a.aK = this.a(this.a.aK, this.a.aI, 10.0f);
        }
        float f = ns.g(this.a.aK - this.a.aI);
        if (!this.a.s().m()) {
            if (f < -75.0f) {
                this.a.aK = this.a.aI - 75.0f;
            }
            if (f > 75.0f) {
                this.a.aK = this.a.aI + 75.0f;
            }
        }
    }

    private float a(float f, float f2, float f3) {
        \u2603 = ns.g(f2 - f);
        if (\u2603 > f3) {
            \u2603 = f3;
        }
        if (\u2603 < -f3) {
            \u2603 = -f3;
        }
        return f + \u2603;
    }

    public boolean b() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public double g() {
        return this.g;
    }
}
