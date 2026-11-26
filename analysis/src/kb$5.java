/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.5
extends cn {
    private boolean b = true;

    kb.5() {
    }

    @Override
    protected zx b(ck ck22, zx zx2) {
        ck ck22;
        if (zd.a == zd.a(zx2.i())) {
            adm adm2 = ck22.i();
            if (ze.a(zx2, adm2, \u2603 = ck22.d().a(agg.b(ck22.f())))) {
                if (!adm2.D) {
                    adm2.b(2005, \u2603, 0);
                }
            } else {
                this.b = false;
            }
            return zx2;
        }
        return super.b(ck22, zx2);
    }

    @Override
    protected void a(ck ck2) {
        if (this.b) {
            ck2.i().b(1000, ck2.d(), 0);
        } else {
            ck2.i().b(1001, ck2.d(), 0);
        }
    }
}
