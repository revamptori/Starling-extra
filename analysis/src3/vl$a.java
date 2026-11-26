/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class vl.a
extends rd {
    private vl a;
    private int b;
    private int c;

    public vl.a(vl vl2) {
        this.a = vl2;
        this.a(3);
    }

    @Override
    public boolean a() {
        pr pr2 = this.a.u();
        return pr2 != null && pr2.ai();
    }

    @Override
    public void c() {
        this.b = 0;
    }

    @Override
    public void d() {
        this.a.a(false);
    }

    @Override
    public void e() {
        --this.c;
        pr pr2 = this.a.u();
        double \u26032 = this.a.h(pr2);
        if (\u26032 < 4.0) {
            if (this.c <= 0) {
                this.c = 20;
                this.a.r(pr2);
            }
            this.a.q().a(pr2.s, pr2.t, pr2.u, 1.0);
        } else if (\u26032 < 256.0) {
            double d = pr2.s - this.a.s;
            \u2603 = pr2.aR().b + (double)(pr2.K / 2.0f) - (this.a.t + (double)(this.a.K / 2.0f));
            \u2603 = pr2.u - this.a.u;
            if (this.c <= 0) {
                ++this.b;
                if (this.b == 1) {
                    this.c = 60;
                    this.a.a(true);
                } else if (this.b <= 4) {
                    this.c = 6;
                } else {
                    this.c = 100;
                    this.b = 0;
                    this.a.a(false);
                }
                if (this.b > 1) {
                    float f = ns.c(ns.a(\u26032)) * 0.5f;
                    this.a.o.a(null, 1009, new cj((int)this.a.s, (int)this.a.t, (int)this.a.u), 0);
                    for (int i = 0; i < 1; ++i) {
                        ww ww2 = new ww(this.a.o, this.a, d + this.a.bc().nextGaussian() * (double)f, \u2603, \u2603 + this.a.bc().nextGaussian() * (double)f);
                        ww2.t = this.a.t + (double)(this.a.K / 2.0f) + 0.5;
                        this.a.o.d(ww2);
                    }
                }
            }
            this.a.p().a(pr2, 10.0f, 10.0f);
        } else {
            this.a.s().n();
            this.a.q().a(pr2.s, pr2.t, pr2.u, 1.0);
        }
        super.e();
    }
}
