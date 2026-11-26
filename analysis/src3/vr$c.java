/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class vr.c
extends rd {
    private vr b;
    public int a;

    public vr.c(vr vr2) {
        this.b = vr2;
    }

    @Override
    public boolean a() {
        return this.b.u() != null;
    }

    @Override
    public void c() {
        this.a = 0;
    }

    @Override
    public void d() {
        this.b.a(false);
    }

    @Override
    public void e() {
        pr pr2 = this.b.u();
        double \u26032 = 64.0;
        if (pr2.h(this.b) < \u26032 * \u26032 && this.b.t(pr2)) {
            adm adm2 = this.b.o;
            ++this.a;
            if (this.a == 10) {
                adm2.a(null, 1007, new cj(this.b), 0);
            }
            if (this.a == 20) {
                double d2 = 4.0;
                aui \u26033 = this.b.d(1.0f);
                \u2603 = pr2.s - (this.b.s + \u26033.a * d2);
                \u2603 = pr2.aR().b + (double)(pr2.K / 2.0f) - (0.5 + this.b.t + (double)(this.b.K / 2.0f));
                \u2603 = pr2.u - (this.b.u + \u26033.c * d2);
                adm2.a(null, 1008, new cj(this.b), 0);
                wu \u26034 = new wu(adm2, this.b, \u2603, \u2603, \u2603);
                \u26034.e = this.b.cf();
                \u26034.s = this.b.s + \u26033.a * d2;
                \u26034.t = this.b.t + (double)(this.b.K / 2.0f) + 0.5;
                \u26034.u = this.b.u + \u26033.c * d2;
                adm2.d(\u26034);
                this.a = -40;
            }
        } else if (this.a > 0) {
            --this.a;
        }
        this.b.a(this.a > 10);
    }
}
