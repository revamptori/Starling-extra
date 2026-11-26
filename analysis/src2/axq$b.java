/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
class axq.b
extends awi {
    public int u;

    public axq.b() {
        super(axq.this.j, axq.this.l, axq.this.m, 80, axq.this.m - 37, 24);
        this.u = -1;
    }

    private void a(int n2, int n3, zw zw2, int n4) {
        this.e(n2 + 1, n3 + 1);
        bfl.B();
        avc.c();
        axq.this.k.a(new zx(zw2, 1, n4), n2 + 2, n3 + 2);
        avc.a();
        bfl.C();
    }

    private void e(int n2, int n3) {
        this.d(n2, n3, 0, 0);
    }

    private void d(int n2, int n3, int n4, int n5) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.P().a(avp.c);
        float f2 = 0.0078125f;
        \u2603 = 0.0078125f;
        int \u26032 = 18;
        int \u26033 = 18;
        bfx \u26034 = bfx.a();
        bfd \u26035 = \u26034.c();
        \u26035.a(7, bms.g);
        \u26035.b((double)(n2 + 0), (double)(n3 + 18), (double)axq.this.e).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        \u26035.b((double)(n2 + 18), (double)(n3 + 18), (double)axq.this.e).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        \u26035.b((double)(n2 + 18), (double)(n3 + 0), (double)axq.this.e).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        \u26035.b((double)(n2 + 0), (double)(n3 + 0), (double)axq.this.e).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        \u26034.b();
    }

    @Override
    protected int b() {
        return a.size();
    }

    @Override
    protected void a(int n2, boolean bl, int n3, int n4) {
        this.u = n2;
        axq.this.a();
        axq.this.t.a(((axq.a)a.get((int)((axq)axq.this).r.u)).d);
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.u;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        axq.a a2 = (axq.a)a.get(n2);
        this.a(n3, n4, a2.a, a2.b);
        axq.this.q.a(a2.c, n3 + 18 + 5, n4 + 6, 0xFFFFFF);
    }
}
