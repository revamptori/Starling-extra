/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class vr.b
extends qq {
    private vr g;
    private int h;

    public vr.b(vr vr2) {
        super(vr2);
        this.g = vr2;
    }

    @Override
    public void c() {
        if (!this.f) {
            return;
        }
        double d2 = this.b - this.g.s;
        \u2603 = this.c - this.g.t;
        \u2603 = this.d - this.g.u;
        \u2603 = d2 * d2 + \u2603 * \u2603 + \u2603 * \u2603;
        if (this.h-- <= 0) {
            this.h += this.g.bc().nextInt(5) + 2;
            if (this.b(this.b, this.c, this.d, \u2603 = (double)ns.a(\u2603))) {
                this.g.v += d2 / \u2603 * 0.1;
                this.g.w += \u2603 / \u2603 * 0.1;
                this.g.x += \u2603 / \u2603 * 0.1;
            } else {
                this.f = false;
            }
        }
    }

    private boolean b(double d2, double d3, double d4, double d5) {
        \u2603 = (d2 - this.g.s) / d5;
        \u2603 = (d3 - this.g.t) / d5;
        \u2603 = (d4 - this.g.u) / d5;
        aug aug2 = this.g.aR();
        int \u26032 = 1;
        while ((double)\u26032 < d5) {
            if (!this.g.o.a((pk)this.g, aug2 = aug2.c(\u2603, \u2603, \u2603)).isEmpty()) {
                return false;
            }
            ++\u26032;
        }
        return true;
    }
}
