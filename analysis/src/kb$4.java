/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.4
extends cn {
    private boolean b = true;

    kb.4() {
    }

    @Override
    protected zx b(ck ck2, zx zx2) {
        adm adm2 = ck2.i();
        if (adm2.d(\u2603 = ck2.d().a(agg.b(ck2.f())))) {
            adm2.a(\u2603, afi.ab.Q());
            if (zx2.a(1, adm2.s)) {
                zx2.b = 0;
            }
        } else if (adm2.p(\u2603).c() == afi.W) {
            afi.W.d(adm2, \u2603, afi.W.Q().a(ake.a, true));
            adm2.g(\u2603);
        } else {
            this.b = false;
        }
        return zx2;
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
