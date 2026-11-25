/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class axa.a
extends awi {
    public int u;

    public axa.a() {
        super(axa.this.j, axa.this.l, axa.this.m, 43, axa.this.m - 60, 24);
        this.u = -1;
    }

    private void a(int n2, int n3, zx zx2) {
        this.e(n2 + 1, n3 + 1);
        bfl.B();
        if (zx2 != null && zx2.b() != null) {
            avc.c();
            axa.this.k.a(zx2, n2 + 2, n3 + 2);
            avc.a();
        }
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
        \u26035.b((double)(n2 + 0), (double)(n3 + 18), (double)axa.this.e).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        \u26035.b((double)(n2 + 18), (double)(n3 + 18), (double)axa.this.e).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        \u26035.b((double)(n2 + 18), (double)(n3 + 0), (double)axa.this.e).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        \u26035.b((double)(n2 + 0), (double)(n3 + 0), (double)axa.this.e).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        \u26034.b();
    }

    @Override
    protected int b() {
        return axa.this.f.c().size();
    }

    @Override
    protected void a(int n2, boolean bl, int n3, int n4) {
        this.u = n2;
        axa.this.f();
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.u;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n32, int n4, int n5, int n6, int n7) {
        int n32;
        aqa aqa2 = (aqa)axa.this.f.c().get(axa.this.f.c().size() - n2 - 1);
        alz \u26032 = aqa2.c();
        afh \u26033 = \u26032.c();
        zw \u26034 = zw.a(\u26033);
        zx \u26035 = \u26033 == afi.a || \u26034 == null ? null : new zx(\u26034, 1, \u26033.c(\u26032));
        String string = string2 = \u26035 == null ? "Air" : \u26034.a(\u26035);
        if (\u26034 == null) {
            if (\u26033 == afi.j || \u26033 == afi.i) {
                \u26034 = zy.ax;
            } else if (\u26033 == afi.l || \u26033 == afi.k) {
                \u26034 = zy.ay;
            }
            if (\u26034 != null) {
                \u26035 = new zx(\u26034, 1, \u26033.c(\u26032));
                String string2 = \u26033.f();
            }
        }
        this.a(n32, n4, \u26035);
        axa.this.q.a(string2, n32 + 18 + 5, n4 + 3, 0xFFFFFF);
        String \u26036 = n2 == 0 ? bnq.a("createWorld.customize.flat.layer.top", aqa2.b()) : (n2 == axa.this.f.c().size() - 1 ? bnq.a("createWorld.customize.flat.layer.bottom", aqa2.b()) : bnq.a("createWorld.customize.flat.layer", aqa2.b()));
        axa.this.q.a(\u26036, n32 + 2 + 213 - axa.this.q.a(\u26036), n4 + 3, 0xFFFFFF);
    }

    @Override
    protected int d() {
        return this.b - 70;
    }
}
