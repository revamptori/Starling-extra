/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class wb.d
extends qq {
    private float g;
    private int h;
    private wb i;
    private boolean j;

    public wb.d(wb wb2) {
        super(wb2);
        this.i = wb2;
    }

    public void a(float f, boolean bl) {
        this.g = f;
        this.j = bl;
    }

    public void a(double d2) {
        this.e = d2;
        this.f = true;
    }

    @Override
    public void c() {
        this.a.aK = this.a.y = this.a(this.a.y, this.g, 30.0f);
        this.a.aI = this.a.y;
        if (!this.f) {
            this.a.n(0.0f);
            return;
        }
        this.f = false;
        if (this.a.C) {
            this.a.k((float)(this.e * this.a.a(vy.d).e()));
            if (this.h-- <= 0) {
                this.h = this.i.cg();
                if (this.j) {
                    this.h /= 3;
                }
                this.i.r().a();
                if (this.i.cn()) {
                    this.i.a(this.i.ck(), this.i.bB(), ((this.i.bc().nextFloat() - this.i.bc().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                }
            } else {
                this.i.ba = 0.0f;
                this.i.aZ = 0.0f;
                this.a.k(0.0f);
            }
        } else {
            this.a.k((float)(this.e * this.a.a(vy.d).e()));
        }
    }
}
