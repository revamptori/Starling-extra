/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class ayf.b
extends awi {
    public ayf.b(ave ave2) {
        super(ave2, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, 10);
        this.b(false);
    }

    @Override
    protected int b() {
        return na.c.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean a(int n) {
        return false;
    }

    @Override
    protected int k() {
        return this.b() * 10;
    }

    @Override
    protected void a() {
        ayf.this.c();
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        mw mw2 = (mw)na.c.get(n);
        ayf.this.c(ayf.this.q, mw2.e().c(), n2 + 2, n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
        String \u26032 = mw2.a(ayf.this.s.a(mw2));
        ayf.this.c(ayf.this.q, \u26032, n2 + 2 + 213 - ayf.this.q.a(\u26032), n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}
