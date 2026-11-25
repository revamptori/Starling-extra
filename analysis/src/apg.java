/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public abstract class apg
extends aoh {
    protected final int a;
    protected final alz b;
    protected final alz c;
    protected int d;

    public apg(boolean bl, int n, int n2, alz alz2, alz alz3) {
        super(bl);
        this.a = n;
        this.d = n2;
        this.b = alz2;
        this.c = alz3;
    }

    protected int a(Random random) {
        int n = random.nextInt(3) + this.a;
        if (this.d > 1) {
            n += random.nextInt(this.d);
        }
        return n;
    }

    private boolean c(adm adm2, cj cj2, int n) {
        boolean bl = true;
        if (cj2.o() < 1 || cj2.o() + n + 1 > 256) {
            return false;
        }
        for (int i = 0; i <= 1 + n; ++i) {
            \u2603 = 2;
            if (i == 0) {
                \u2603 = 1;
            } else if (i >= 1 + n - 2) {
                \u2603 = 2;
            }
            for (\u2603 = -\u2603; \u2603 <= \u2603 && bl; ++\u2603) {
                for (\u2603 = -\u2603; \u2603 <= \u2603 && bl; ++\u2603) {
                    if (cj2.o() + i >= 0 && cj2.o() + i < 256 && this.a(adm2.p(cj2.a(\u2603, i, \u2603)).c())) continue;
                    bl = false;
                }
            }
        }
        return bl;
    }

    private boolean a(cj cj2, adm adm2) {
        cj cj3 = cj2.b();
        afh \u26032 = adm2.p(cj3).c();
        if (\u26032 != afi.c && \u26032 != afi.d || cj2.o() < 2) {
            return false;
        }
        this.a(adm2, cj3);
        this.a(adm2, cj3.f());
        this.a(adm2, cj3.d());
        this.a(adm2, cj3.d().f());
        return true;
    }

    protected boolean a(adm adm2, Random random, cj cj2, int n) {
        return this.c(adm2, cj2, n) && this.a(cj2, adm2);
    }

    protected void a(adm adm2, cj cj2, int n) {
        \u2603 = n * n;
        for (\u2603 = -n; \u2603 <= n + 1; ++\u2603) {
            for (\u2603 = -n; \u2603 <= n + 1; ++\u2603) {
                \u2603 = \u2603 - 1;
                \u2603 = \u2603 - 1;
                if (\u2603 * \u2603 + \u2603 * \u2603 > \u2603 && \u2603 * \u2603 + \u2603 * \u2603 > \u2603 && \u2603 * \u2603 + \u2603 * \u2603 > \u2603 && \u2603 * \u2603 + \u2603 * \u2603 > \u2603 || (\u2603 = adm2.p(\u2603 = cj2.a(\u2603, 0, \u2603)).c().t()) != arm.a && \u2603 != arm.j) continue;
                this.a(adm2, \u2603, this.c);
            }
        }
    }

    protected void b(adm adm2, cj cj2, int n) {
        \u2603 = n * n;
        for (\u2603 = -n; \u2603 <= n; ++\u2603) {
            for (\u2603 = -n; \u2603 <= n; ++\u2603) {
                if (\u2603 * \u2603 + \u2603 * \u2603 > \u2603 || (\u2603 = adm2.p(\u2603 = cj2.a(\u2603, 0, \u2603)).c().t()) != arm.a && \u2603 != arm.j) continue;
                this.a(adm2, \u2603, this.c);
            }
        }
    }
}
