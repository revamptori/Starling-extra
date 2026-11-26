/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aja
extends afh {
    private final boolean a;

    public aja(boolean bl) {
        super(arm.e);
        if (bl) {
            this.a(true);
        }
        this.a = bl;
    }

    @Override
    public int a(adm adm2) {
        return 30;
    }

    @Override
    public void a(adm adm2, cj cj2, wn wn2) {
        this.e(adm2, cj2);
        super.a(adm2, cj2, wn2);
    }

    @Override
    public void a(adm adm2, cj cj2, pk pk2) {
        this.e(adm2, cj2);
        super.a(adm2, cj2, pk2);
    }

    @Override
    public boolean a(adm adm2, cj cj2, alz alz2, wn wn2, cq cq2, float f, float f2, float f3) {
        this.e(adm2, cj2);
        return super.a(adm2, cj2, alz2, wn2, cq2, f, f2, f3);
    }

    private void e(adm adm2, cj cj2) {
        this.f(adm2, cj2);
        if (this == afi.aC) {
            adm2.a(cj2, afi.aD.Q());
        }
    }

    @Override
    public void b(adm adm2, cj cj2, alz alz2, Random random) {
        if (this == afi.aD) {
            adm2.a(cj2, afi.aC.Q());
        }
    }

    @Override
    public zw a(alz alz2, Random random, int n2) {
        return zy.aC;
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, float f, int n2) {
        super.a(adm2, cj2, alz2, f, n2);
        if (this.a(alz2, adm2.s, n2) != zw.a(this)) {
            \u2603 = 1 + adm2.s.nextInt(5);
            this.b(adm2, cj2, \u2603);
        }
    }

    @Override
    public void c(adm adm2, cj cj2, alz alz2, Random random) {
        if (this.a) {
            this.f(adm2, cj2);
        }
    }

    private void f(adm adm2, cj cj2) {
        Random random = adm2.s;
        double \u26032 = 0.0625;
        for (int i = 0; i < 6; ++i) {
            double d = (float)cj2.n() + random.nextFloat();
            \u2603 = (float)cj2.o() + random.nextFloat();
            \u2603 = (float)cj2.p() + random.nextFloat();
            if (i == 0 && !adm2.p(cj2.a()).c().c()) {
                \u2603 = (double)cj2.o() + \u26032 + 1.0;
            }
            if (i == 1 && !adm2.p(cj2.b()).c().c()) {
                \u2603 = (double)cj2.o() - \u26032;
            }
            if (i == 2 && !adm2.p(cj2.d()).c().c()) {
                \u2603 = (double)cj2.p() + \u26032 + 1.0;
            }
            if (i == 3 && !adm2.p(cj2.c()).c().c()) {
                \u2603 = (double)cj2.p() - \u26032;
            }
            if (i == 4 && !adm2.p(cj2.f()).c().c()) {
                d = (double)cj2.n() + \u26032 + 1.0;
            }
            if (i == 5 && !adm2.p(cj2.e()).c().c()) {
                d = (double)cj2.n() - \u26032;
            }
            if (!(d < (double)cj2.n() || d > (double)(cj2.n() + 1) || \u2603 < 0.0 || \u2603 > (double)(cj2.o() + 1) || \u2603 < (double)cj2.p()) && !(\u2603 > (double)(cj2.p() + 1))) continue;
            adm2.a(cy.E, d, \u2603, \u2603, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected zx i(alz alz2) {
        return new zx(afi.aC);
    }
}
