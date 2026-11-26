/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
static final class aad.1
extends cn {
    private final cn b = new cn();

    aad.1() {
    }

    @Override
    public zx b(ck ck2, zx zx2) {
        double \u26038;
        cq cq2 = agg.b(ck2.f());
        adm \u26032 = ck2.i();
        double \u26033 = ck2.a() + (double)cq2.g() * 1.125;
        double \u26034 = Math.floor((double)ck2.b()) + (double)cq2.h();
        double \u26035 = ck2.c() + (double)cq2.i() * 1.125;
        cj \u26036 = ck2.d().a(cq2);
        alz \u26037 = \u26032.p(\u26036);
        afe.b b2 = \u2603 = \u26037.c() instanceof afe ? \u26037.b(((afe)\u26037.c()).n()) : afe.b.a;
        if (afe.d(\u26037)) {
            \u26038 = \u2603.c() ? 0.6 : 0.1;
        } else if (\u26037.c().t() == arm.a && afe.d(\u26032.p(\u26036.b()))) {
            Object object = \u26032.p(\u26036.b());
            afe.b b3 = \u2603 = object.c() instanceof afe ? object.b(((afe)object.c()).n()) : afe.b.a;
            \u26038 = cq2 == cq.a || !\u2603.c() ? -0.9 : -0.4;
        } else {
            return this.b.a(ck2, zx2);
        }
        object = va.a(\u26032, \u26033, \u26034 + \u26038, \u26035, ((aad)zx2.b()).b);
        if (zx2.s()) {
            ((va)object).a(zx2.q());
        }
        \u26032.d((pk)object);
        zx2.a(1);
        return zx2;
    }

    @Override
    protected void a(ck ck2) {
        ck2.i().b(1000, ck2.d(), 0);
    }
}
