/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class ayo.a
extends avs {
    private final boolean o;

    public ayo.a(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 23, 13, "");
        this.o = bl;
    }

    @Override
    public void a(ave ave2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        boolean bl = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        ave2.P().a(f);
        int \u26032 = 0;
        int \u26033 = 192;
        if (bl) {
            \u26032 += 23;
        }
        if (!this.o) {
            \u26033 += 13;
        }
        this.b(this.h, this.i, \u26032, \u26033, 23, 13);
    }
}
