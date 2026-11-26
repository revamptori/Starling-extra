/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
static class vr.a
extends rd {
    private vr a;

    public vr.a(vr vr2) {
        this.a = vr2;
        this.a(2);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void e() {
        if (this.a.u() == null) {
            this.a.aI = this.a.y = -((float)ns.b(this.a.v, this.a.x)) * 180.0f / (float)Math.PI;
        } else {
            pr pr2 = this.a.u();
            double \u26032 = 64.0;
            if (pr2.h(this.a) < \u26032 * \u26032) {
                double d2 = pr2.s - this.a.s;
                \u2603 = pr2.u - this.a.u;
                this.a.aI = this.a.y = -((float)ns.b(d2, \u2603)) * 180.0f / (float)Math.PI;
            }
        }
    }
}
