/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aid
extends afm {
    public static final amn a = amn.a("age", 0, 3);

    protected aid() {
        super(arm.k, arn.D);
        this.j(this.M.b().a(a, 0));
        this.a(true);
        float f = 0.5f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.a((yz)null);
    }

    @Override
    protected boolean c(afh afh2) {
        return afh2 == afi.aW;
    }

    @Override
    public boolean f(adm adm2, cj cj2, alz alz2) {
        return this.c(adm2.p(cj2.b()).c());
    }

    @Override
    public void b(adm adm22, cj cj2, alz alz22, Random random) {
        adm adm22;
        int n = alz22.b(a);
        if (n < 3 && random.nextInt(10) == 0) {
            alz alz22 = alz22.a(a, n + 1);
            adm22.a(cj2, alz22, 2);
        }
        super.b(adm22, cj2, alz22, random);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, float f, int n) {
        if (adm2.D) {
            return;
        }
        \u2603 = 1;
        if (alz2.b(a) >= 3) {
            \u2603 = 2 + adm2.s.nextInt(3);
            if (n > 0) {
                \u2603 += adm2.s.nextInt(n + 1);
            }
        }
        for (\u2603 = 0; \u2603 < \u2603; ++\u2603) {
            aid.a(adm2, cj2, new zx(zy.by));
        }
    }

    @Override
    public zw a(alz alz2, Random random, int n) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public zw c(adm adm2, cj cj2) {
        return zy.by;
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
        return new ama(this, a);
    }
}
