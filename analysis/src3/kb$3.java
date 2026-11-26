/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.3
extends cn {
    private final cn b = new cn();

    kb.3() {
    }

    @Override
    public zx b(ck ck22, zx zx2) {
        zw zw2;
        adm adm2 = ck22.i();
        alz \u26032 = adm2.p(\u2603 = ck22.d().a(agg.b(ck22.f())));
        afh \u26033 = \u26032.c();
        arm \u26034 = \u26033.t();
        if (arm.h.equals(\u26034) && \u26033 instanceof ahv && \u26032.b(ahv.b) == 0) {
            zw2 = zy.ax;
        } else if (arm.i.equals(\u26034) && \u26033 instanceof ahv && \u26032.b(ahv.b) == 0) {
            zw2 = zy.ay;
        } else {
            ck ck22;
            return super.b(ck22, zx2);
        }
        adm2.g(\u2603);
        if (--zx2.b == 0) {
            zx2.a(zw2);
            zx2.b = 1;
        } else if (((alc)ck22.h()).a(new zx(zw2)) < 0) {
            this.b.a(ck22, new zx(zw2));
        }
        return zx2;
    }
}
