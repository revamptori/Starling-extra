/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class ayn.d
extends avs {
    private final jy o;
    private final int p;
    private final int q;
    private boolean r;

    protected ayn.d(int n, int n2, int n3, jy jy2, int n4, int n5) {
        super(n, n2, n3, 22, 22, "");
        this.o = jy2;
        this.p = n4;
        this.q = n5;
    }

    @Override
    public void a(ave ave2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        ave2.P().a(v);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        \u2603 = 219;
        \u2603 = 0;
        if (!this.l) {
            \u2603 += this.f * 2;
        } else if (this.r) {
            \u2603 += this.f * 1;
        } else if (this.n) {
            \u2603 += this.f * 3;
        }
        this.b(this.h, this.i, \u2603, \u2603, this.f, this.g);
        if (!v.equals(this.o)) {
            ave2.P().a(this.o);
        }
        this.b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
    }

    public boolean c() {
        return this.r;
    }

    public void b(boolean bl) {
        this.r = bl;
    }
}
