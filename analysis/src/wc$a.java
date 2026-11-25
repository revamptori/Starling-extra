/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 */
static class wc.a
extends rl {
    public wc.a(wc wc2, Class<? extends pk> clazz) {
        super(wc2, clazz, 1.0, true);
    }

    @Override
    public boolean b() {
        float f = this.b.c(1.0f);
        if (f >= 0.5f && this.b.bc().nextInt(100) == 0) {
            this.b.d((pr)null);
            return false;
        }
        return super.b();
    }

    @Override
    protected double a(pr pr2) {
        return 4.0f + pr2.J;
    }
}
