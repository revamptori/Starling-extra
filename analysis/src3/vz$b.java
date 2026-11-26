/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class vz.b
extends rd {
    private vz a;
    private int b;

    public vz.b(vz vz2) {
        this.a = vz2;
    }

    public void f() {
        if (this.b == 0) {
            this.b = 20;
        }
    }

    @Override
    public boolean a() {
        return this.b > 0;
    }

    @Override
    public void e() {
        --this.b;
        if (this.b <= 0) {
            adm adm2 = this.a.o;
            Random \u26032 = this.a.bc();
            cj \u26033 = new cj(this.a);
            int \u26034 = 0;
            block0: while (\u26034 <= 5 && \u26034 >= -5) {
                int n2 = 0;
                while (n2 <= 10 && n2 >= -10) {
                    \u26036 = 0;
                    while (\u26036 <= 10 && \u26036 >= -10) {
                        cj cj2 = \u26033.a(n2, \u26034, \u26036);
                        alz \u26035 = adm2.p(cj2);
                        if (\u26035.c() == afi.be) {
                            if (adm2.Q().b("mobGriefing")) {
                                adm2.b(cj2, true);
                            } else {
                                adm2.a(cj2, \u26035.b(ahz.a).d(), 3);
                            }
                            if (\u26032.nextBoolean()) break block0;
                        }
                        int \u26036 = \u26036 <= 0 ? 1 - \u26036 : 0 - \u26036;
                    }
                    n2 = n2 <= 0 ? 1 - n2 : 0 - n2;
                }
                \u26034 = \u26034 <= 0 ? 1 - \u26034 : 0 - \u26034;
            }
        }
    }
}
