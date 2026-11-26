/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class axy.a
extends awi {
    public axy.a() {
        super(axy.this.j, axy.this.l, axy.this.m, 80, axy.this.m - 40, axy.this.q.a + 1);
    }

    @Override
    protected int b() {
        return axy.this.g.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean a(int n) {
        return false;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        axy.this.q.a((String)axy.this.g.get(n), 10, n3, 0xFFFFFF);
        axy.this.q.a((String)axy.this.h.get(n), 230, n3, 0xFFFFFF);
    }

    @Override
    protected int d() {
        return this.b - 10;
    }
}
