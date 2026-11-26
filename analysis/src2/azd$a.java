/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class azd.a
extends avs {
    private final boolean o;

    public azd.a(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 12, 19, "");
        this.o = bl;
    }

    @Override
    public void a(ave ave2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        ave2.P().a(v);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        boolean bl = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        int \u26032 = 0;
        int \u26033 = 176;
        if (!this.l) {
            \u26033 += this.f * 2;
        } else if (bl) {
            \u26033 += this.f;
        }
        if (!this.o) {
            \u26032 += this.g;
        }
        this.b(this.h, this.i, \u26033, \u26032, this.f, this.g);
    }
}
