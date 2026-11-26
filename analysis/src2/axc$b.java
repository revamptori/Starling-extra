/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
class axc.b
extends awi {
    public int u;

    public axc.b() {
        super(axc.this.j, axc.this.l, axc.this.m, 80, axc.this.m - 32, 38);
        this.u = -1;
    }

    @Override
    protected int b() {
        return f.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.u = n;
        axc.this.a();
        axc.this.i.a(((axc.a)f.get((int)((axc)axc.this).g.u)).c.toString());
    }

    @Override
    protected boolean a(int n) {
        return n == this.u;
    }

    @Override
    protected void a() {
    }

    private void a(int n2, int n3, jy jy2) {
        int n4 = n2 + 5;
        \u2603 = n3;
        axc.this.a(n4 - 1, n4 + 32, \u2603 - 1, -2039584);
        axc.this.a(n4 - 1, n4 + 32, \u2603 + 32, -6250336);
        axc.this.b(n4 - 1, \u2603 - 1, \u2603 + 32, -2039584);
        axc.this.b(n4 + 32, \u2603 - 1, \u2603 + 32, -6250336);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.P().a(jy2);
        \u2603 = 32;
        \u2603 = 32;
        bfx \u26032 = bfx.a();
        bfd \u26033 = \u26032.c();
        \u26033.a(7, bms.g);
        \u26033.b((double)(n4 + 0), (double)(\u2603 + 32), 0.0).a(0.0, 1.0).d();
        \u26033.b((double)(n4 + 32), (double)(\u2603 + 32), 0.0).a(1.0, 1.0).d();
        \u26033.b((double)(n4 + 32), (double)(\u2603 + 0), 0.0).a(1.0, 0.0).d();
        \u26033.b((double)(n4 + 0), (double)(\u2603 + 0), 0.0).a(0.0, 0.0).d();
        \u26032.b();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        axc.a a2 = (axc.a)f.get(n2);
        this.a(n3, n4, a2.b);
        axc.this.q.a(a2.a, n3 + 32 + 10, n4 + 14, 0xFFFFFF);
    }
}
