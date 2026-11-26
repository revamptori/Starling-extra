/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
static class vt.c
extends qq {
    private vt g;

    public vt.c(vt vt2) {
        super(vt2);
        this.g = vt2;
    }

    @Override
    public void c() {
        if (!this.f || this.g.s().m()) {
            this.g.k(0.0f);
            this.g.l(false);
            return;
        }
        double d = this.b - this.g.s;
        \u2603 = this.c - this.g.t;
        \u2603 = this.d - this.g.u;
        \u2603 = d * d + \u2603 * \u2603 + \u2603 * \u2603;
        \u2603 = ns.a(\u2603);
        \u2603 /= \u2603;
        float \u26032 = (float)(ns.b(\u2603, d) * 180.0 / 3.1415927410125732) - 90.0f;
        this.g.aI = this.g.y = this.a(this.g.y, \u26032, 30.0f);
        float \u26033 = (float)(this.e * this.g.a(vy.d).e());
        this.g.k(this.g.bI() + (\u26033 - this.g.bI()) * 0.125f);
        \u2603 = Math.sin((double)((double)(this.g.W + this.g.F()) * 0.5)) * 0.05;
        \u2603 = Math.cos((double)(this.g.y * (float)Math.PI / 180.0f));
        \u2603 = Math.sin((double)(this.g.y * (float)Math.PI / 180.0f));
        this.g.v += \u2603 * \u2603;
        this.g.x += \u2603 * \u2603;
        \u2603 = Math.sin((double)((double)(this.g.W + this.g.F()) * 0.75)) * 0.05;
        this.g.w += \u2603 * (\u2603 + \u2603) * 0.25;
        this.g.w += (double)this.g.bI() * \u2603 * 0.1;
        qp \u26034 = this.g.p();
        \u2603 = this.g.s + d / \u2603 * 2.0;
        \u2603 = (double)this.g.aS() + this.g.t + \u2603 / \u2603 * 1.0;
        \u2603 = this.g.u + \u2603 / \u2603 * 2.0;
        \u2603 = \u26034.e();
        \u2603 = \u26034.f();
        \u2603 = \u26034.g();
        if (!\u26034.b()) {
            \u2603 = \u2603;
            \u2603 = \u2603;
            \u2603 = \u2603;
        }
        this.g.p().a(\u2603 + (\u2603 - \u2603) * 0.125, \u2603 + (\u2603 - \u2603) * 0.125, \u2603 + (\u2603 - \u2603) * 0.125, 10.0f, 40.0f);
        this.g.l(true);
    }
}
