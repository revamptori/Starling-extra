/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aia
extends afm
implements afj {
    protected aia() {
        float f = 0.2f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 2.0f, 0.5f + f);
        this.a(true);
    }

    @Override
    public void b(adm adm22, cj cj22, alz alz2, Random random) {
        if (random.nextInt(25) == 0) {
            adm adm22;
            cj cj22;
            int n = 5;
            \u2603 = 4;
            for (cj cj3 : cj.b(cj22.a(-4, -1, -4), cj22.a(4, 1, 4))) {
                if (adm22.p(cj3).c() != this || --n > 0) continue;
                return;
            }
            Object \u26032 = cj22.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (adm22.d((cj)\u26032) && this.f(adm22, (cj)\u26032, this.Q())) {
                    cj22 = \u26032;
                }
                \u26032 = cj22.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (adm22.d((cj)\u26032) && this.f(adm22, (cj)\u26032, this.Q())) {
                adm22.a((cj)\u26032, this.Q(), 2);
            }
        }
    }

    @Override
    public boolean d(adm adm2, cj cj2) {
        return super.d(adm2, cj2) && this.f(adm2, cj2, this.Q());
    }

    @Override
    protected boolean c(afh afh2) {
        return afh2.o();
    }

    @Override
    public boolean f(adm adm2, cj cj2, alz alz2) {
        if (cj2.o() < 0 || cj2.o() >= 256) {
            return false;
        }
        \u2603 = adm2.p(cj2.b());
        if (\u2603.c() == afi.bw) {
            return true;
        }
        if (\u2603.c() == afi.d && \u2603.b(agf.a) == agf.a.c) {
            return true;
        }
        return adm2.k(cj2) < 13 && this.c(\u2603.c());
    }

    public boolean d(adm adm2, cj cj2, alz alz2, Random random) {
        adm2.g(cj2);
        aoz aoz2 = null;
        if (this == afi.P) {
            aoz2 = new aoz(afi.bg);
        } else if (this == afi.Q) {
            aoz2 = new aoz(afi.bh);
        }
        if (aoz2 != null && ((aot)aoz2).b(adm2, random, cj2)) {
            return true;
        }
        adm2.a(cj2, alz2, 3);
        return false;
    }

    @Override
    public boolean a(adm adm2, cj cj2, alz alz2, boolean bl) {
        return true;
    }

    @Override
    public boolean a(adm adm2, Random random, cj cj2, alz alz2) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void b(adm adm2, Random random, cj cj2, alz alz2) {
        this.d(adm2, cj2, alz2, random);
    }
}
