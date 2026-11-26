/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.16
extends cn {
    private final cn b = new cn();

    kb.16() {
    }

    @Override
    public zx b(ck ck22, zx zx2) {
        double d;
        cq cq2 = agg.b(ck22.f());
        adm \u26032 = ck22.i();
        double \u26033 = ck22.a() + (double)((float)cq2.g() * 1.125f);
        double \u26034 = ck22.b() + (double)((float)cq2.h() * 1.125f);
        double \u26035 = ck22.c() + (double)((float)cq2.i() * 1.125f);
        cj \u26036 = ck22.d().a(cq2);
        arm \u26037 = \u26032.p(\u26036).c().t();
        if (arm.h.equals(\u26037)) {
            d = 1.0;
        } else if (arm.a.equals(\u26037) && arm.h.equals(\u26032.p(\u26036.b()).c().t())) {
            d = 0.0;
        } else {
            ck ck22;
            return this.b.a(ck22, zx2);
        }
        ux \u26038 = new ux(\u26032, \u26033, \u26034 + d, \u26035);
        \u26032.d(\u26038);
        zx2.a(1);
        return zx2;
    }

    @Override
    protected void a(ck ck2) {
        ck2.i().b(1000, ck2.d(), 0);
    }
}
