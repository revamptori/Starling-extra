/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import com.google.common.base.Predicate;
import java.util.Random;

public class ajx
extends afm
implements afj {
    public static final amn a = amn.a("age", 0, 7);
    public static final aml b = aml.a("facing", new Predicate<cq>(){

        public boolean a(cq cq2) {
            return cq2 != cq.a;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((cq)object);
        }
    });
    private final afh N;

    protected ajx(afh afh2) {
        this.j(this.M.b().a(a, 0).a(b, cq.b));
        this.N = afh2;
        this.a(true);
        float f = 0.125f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.a((yz)null);
    }

    @Override
    public alz a(alz alz22, adq adq2, cj cj2) {
        alz alz22 = alz22.a(b, cq.b);
        for (cq cq2 : cq.c.a) {
            if (adq2.p(cj2.a(cq2)).c() != this.N) continue;
            alz22 = alz22.a(b, cq2);
            break;
        }
        return alz22;
    }

    @Override
    protected boolean c(afh afh2) {
        return afh2 == afi.ak;
    }

    @Override
    public void b(adm adm2, cj cj22, alz alz22, Random random) {
        super.b(adm2, cj22, alz22, random);
        if (adm2.l(cj22.a()) < 9) {
            return;
        }
        float f = afz.a(this, adm2, cj22);
        if (random.nextInt((int)(25.0f / f) + 1) == 0) {
            int n = alz22.b(a);
            if (n < 7) {
                alz alz22 = alz22.a(a, n + 1);
                adm2.a(cj22, alz22, 2);
            } else {
                cj cj22;
                for (cq cq2 : cq.c.a) {
                    if (adm2.p(cj22.a(cq2)).c() != this.N) continue;
                    return;
                }
                cj22 = cj22.a(cq.c.a.a(random));
                Object \u26032 = adm2.p(cj22.b()).c();
                if (adm2.p((cj)cj22).c().J == arm.a && (\u26032 == afi.ak || \u26032 == afi.d || \u26032 == afi.c)) {
                    adm2.a(cj22, this.N.Q());
                }
            }
        }
    }

    public void g(adm adm2, cj cj2, alz alz2) {
        int n = alz2.b(a) + ns.a(adm2.s, 2, 5);
        adm2.a(cj2, alz2.a(a, Math.min((int)7, (int)n)), 2);
    }

    @Override
    public int h(alz alz2) {
        if (alz2.c() != this) {
            return super.h(alz2);
        }
        int n = alz2.b(a);
        \u2603 = n * 32;
        \u2603 = 255 - n * 8;
        \u2603 = n * 4;
        return \u2603 << 16 | \u2603 << 8 | \u2603;
    }

    @Override
    public int a(adq adq2, cj cj2, int n) {
        return this.h(adq2.p(cj2));
    }

    @Override
    public void j() {
        float f = 0.125f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
    }

    @Override
    public void a(adq adq2, cj cj2) {
        this.F = (float)(adq2.p(cj2).b(a) * 2 + 2) / 16.0f;
        float f = 0.125f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, (float)this.F, 0.5f + f);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, float f, int n) {
        super.a(adm2, cj2, alz2, f, n);
        if (adm2.D) {
            return;
        }
        zw zw2 = this.l();
        if (zw2 == null) {
            return;
        }
        int \u26032 = alz2.b(a);
        for (int i = 0; i < 3; ++i) {
            if (adm2.s.nextInt(15) > \u26032) continue;
            ajx.a(adm2, cj2, new zx(zw2));
        }
    }

    protected zw l() {
        if (this.N == afi.aU) {
            return zy.bg;
        }
        if (this.N == afi.bk) {
            return zy.bh;
        }
        return null;
    }

    @Override
    public zw a(alz alz2, Random random, int n) {
        return null;
    }

    @Override
    public zw c(adm adm2, cj cj2) {
        zw zw2 = this.l();
        return zw2 != null ? zw2 : null;
    }

    @Override
    public boolean a(adm adm2, cj cj2, alz alz2, boolean bl) {
        return alz2.b(a) != 7;
    }

    @Override
    public boolean a(adm adm2, Random random, cj cj2, alz alz2) {
        return true;
    }

    @Override
    public void b(adm adm2, Random random, cj cj2, alz alz2) {
        this.g(adm2, cj2, alz2);
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, n);
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a);
    }

    @Override
    protected ama e() {
        return new ama(this, a, b);
    }
}
