/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.8
extends cn {
    private boolean b = true;

    kb.8() {
    }

    @Override
    protected zx b(ck ck2, zx zx2) {
        adm adm2 = ck2.i();
        cj \u26032 = ck2.d().a(agg.b(ck2.f()));
        aiv \u26033 = (aiv)afi.aU;
        if (adm2.d(\u26032) && \u26033.e(adm2, \u26032)) {
            if (!adm2.D) {
                adm2.a(\u26032, \u26033.Q(), 3);
            }
            --zx2.b;
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
