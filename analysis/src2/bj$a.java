/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

static class bj.a {
    double a;
    double b;

    bj.a() {
    }

    bj.a(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    double a(bj.a a2) {
        double d = this.a - a2.a;
        \u2603 = this.b - a2.b;
        return Math.sqrt((double)(d * d + \u2603 * \u2603));
    }

    void a() {
        double d = this.b();
        this.a /= d;
        this.b /= d;
    }

    float b() {
        return ns.a(this.a * this.a + this.b * this.b);
    }

    public void b(bj.a a2) {
        this.a -= a2.a;
        this.b -= a2.b;
    }

    public boolean a(double d, double d2, double d3, double d4) {
        boolean bl = false;
        if (this.a < d) {
            this.a = d;
            bl = true;
        } else if (this.a > d3) {
            this.a = d3;
            bl = true;
        }
        if (this.b < d2) {
            this.b = d2;
            bl = true;
        } else if (this.b > d4) {
            this.b = d4;
            bl = true;
        }
        return bl;
    }

    public int a(adm adm2) {
        cj cj2 = new cj(this.a, 256.0, this.b);
        while (cj2.o() > 0) {
            if (adm2.p(cj2 = cj2.b()).c().t() == arm.a) continue;
            return cj2.o() + 1;
        }
        return 257;
    }

    public boolean b(adm adm2) {
        cj cj2 = new cj(this.a, 256.0, this.b);
        while (cj2.o() > 0) {
            arm arm2 = adm2.p(cj2 = cj2.b()).c().t();
            if (arm2 == arm.a) continue;
            return !arm2.d() && arm2 != arm.o;
        }
        return false;
    }

    public void a(Random random, double d, double d2, double d3, double d4) {
        this.a = ns.a(random, d, d3);
        this.b = ns.a(random, d2, d4);
    }
}
