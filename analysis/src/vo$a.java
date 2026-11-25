/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class vo.a
extends rd {
    private vo a;

    public vo.a(vo vo2) {
        this.a = vo2;
    }

    @Override
    public boolean a() {
        if (!this.a.o.Q().b("mobGriefing")) {
            return false;
        }
        if (this.a.cm().c().t() == arm.a) {
            return false;
        }
        return this.a.bc().nextInt(2000) == 0;
    }

    @Override
    public void e() {
        Random random = this.a.bc();
        adm \u26032 = this.a.o;
        int \u26033 = ns.c(this.a.s - 1.0 + random.nextDouble() * 2.0);
        int \u26034 = ns.c(this.a.t + random.nextDouble() * 2.0);
        int \u26035 = ns.c(this.a.u - 1.0 + random.nextDouble() * 2.0);
        cj \u26036 = new cj(\u26033, \u26034, \u26035);
        afh \u26037 = \u26032.p(\u26036).c();
        afh \u26038 = \u26032.p(\u26036.b()).c();
        if (this.a(\u26032, \u26036, this.a.cm().c(), \u26037, \u26038)) {
            \u26032.a(\u26036, this.a.cm(), 3);
            this.a.a(afi.a.Q());
        }
    }

    private boolean a(adm adm2, cj cj2, afh afh2, afh afh3, afh afh4) {
        if (!afh2.d(adm2, cj2)) {
            return false;
        }
        if (afh3.t() != arm.a) {
            return false;
        }
        if (afh4.t() == arm.a) {
            return false;
        }
        return afh4.d();
    }
}
