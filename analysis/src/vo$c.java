/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class vo.c
extends rd {
    private vo a;

    public vo.c(vo vo2) {
        this.a = vo2;
    }

    @Override
    public boolean a() {
        if (!this.a.o.Q().b("mobGriefing")) {
            return false;
        }
        if (this.a.cm().c().t() != arm.a) {
            return false;
        }
        return this.a.bc().nextInt(20) == 0;
    }

    @Override
    public void e() {
        Random random = this.a.bc();
        adm \u26032 = this.a.o;
        int \u26033 = ns.c(this.a.s - 2.0 + random.nextDouble() * 4.0);
        int \u26034 = ns.c(this.a.t + random.nextDouble() * 3.0);
        int \u26035 = ns.c(this.a.u - 2.0 + random.nextDouble() * 4.0);
        cj \u26036 = new cj(\u26033, \u26034, \u26035);
        alz \u26037 = \u26032.p(\u26036);
        afh \u26038 = \u26037.c();
        if (c.contains((Object)\u26038)) {
            this.a.a(\u26037);
            \u26032.a(\u26036, afi.a.Q());
        }
    }
}
