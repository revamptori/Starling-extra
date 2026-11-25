/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import com.google.common.base.Objects;
import java.util.Random;

public class akj
extends afh {
    public static final aml a = aml.a("facing", cq.c.a);
    public static final amk b = amk.a("powered");
    public static final amk N = amk.a("attached");
    public static final amk O = amk.a("suspended");

    public akj() {
        super(arm.q);
        this.j(this.M.b().a(a, cq.c).a(b, false).a(N, false).a(O, false));
        this.a(yz.d);
        this.a(true);
    }

    @Override
    public alz a(alz alz2, adq adq2, cj cj2) {
        return alz2.a(O, !adm.a(adq2, cj2.b()));
    }

    @Override
    public aug a(adm adm2, cj cj2, alz alz2) {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean b(adm adm2, cj cj2, cq cq2) {
        return cq2.k().c() && adm2.p(cj2.a(cq2.d())).c().v();
    }

    @Override
    public boolean d(adm adm2, cj cj2) {
        for (cq cq2 : cq.c.a) {
            if (!adm2.p(cj2.a(cq2)).c().v()) continue;
            return true;
        }
        return false;
    }

    @Override
    public alz a(adm adm2, cj cj2, cq cq2, float f, float f2, float f3, int n, pr pr2) {
        alz alz2 = this.Q().a(b, false).a(N, false).a(O, false);
        if (cq2.k().c()) {
            alz2 = alz2.a(a, cq2);
        }
        return alz2;
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, pr pr2, zx zx2) {
        this.a(adm2, cj2, alz2, false, false, -1, null);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, afh afh2) {
        if (afh2 == this) {
            return;
        }
        if (this.e(adm2, cj2, alz2) && !adm2.p(cj2.a((\u2603 = alz2.b(a)).d())).c().v()) {
            this.b(adm2, cj2, alz2, 0);
            adm2.g(cj2);
        }
    }

    public void a(adm adm22, cj cj2, alz alz2, boolean bl, boolean bl2, int n, alz alz3) {
        adm adm22;
        Object \u26039;
        cj cj3;
        cq cq2 = alz2.b(a);
        boolean \u26032 = alz2.b(N);
        boolean \u26033 = alz2.b(b);
        boolean \u26034 = !adm.a(adm22, cj2.b());
        boolean \u26035 = !bl;
        boolean \u26036 = false;
        int \u26037 = 0;
        alz[] \u26038 = new alz[42];
        for (int i = 1; i < 42; ++i) {
            cj3 = cj2.a(cq2, i);
            \u26039 = adm22.p(cj3);
            if (\u26039.c() == afi.bR) {
                if (\u26039.b(a) != cq2.d()) break;
                \u26037 = i;
                break;
            }
            if (\u26039.c() == afi.bS || i == n) {
                if (i == n) {
                    \u26039 = (alz)Objects.firstNonNull((Object)alz3, (Object)\u26039);
                }
                boolean bl3 = \u26039.b(aki.O) == false;
                \u2603 = \u26039.b(aki.a);
                \u2603 = \u26039.b(aki.b);
                \u26035 &= \u2603 == \u26034;
                \u26036 |= bl3 && \u2603;
                \u26038[i] = \u26039;
                if (i != n) continue;
                adm22.a(cj2, (afh)this, this.a(adm22));
                \u26035 &= bl3;
                continue;
            }
            \u26038[i] = null;
            \u26035 = false;
        }
        alz alz4 = this.Q().a(N, \u26035).a(b, \u26036 &= (\u26035 &= \u26037 > 1));
        if (\u26037 > 0) {
            cj3 = cj2.a(cq2, \u26037);
            \u26039 = cq2.d();
            adm22.a(cj3, alz4.a(a, \u26039), 3);
            this.a(adm22, cj3, (cq)\u26039);
            this.a(adm22, cj3, \u26035, \u26036, \u26032, \u26033);
        }
        this.a(adm22, cj2, \u26035, \u26036, \u26032, \u26033);
        if (!bl) {
            adm22.a(cj2, alz4.a(a, cq2), 3);
            if (bl2) {
                this.a(adm22, cj2, cq2);
            }
        }
        if (\u26032 != \u26035) {
            for (int i = 1; i < \u26037; ++i) {
                \u26039 = cj2.a(cq2, i);
                alz alz5 = \u26038[i];
                if (alz5 == null || adm22.p((cj)\u26039).c() == afi.a) continue;
                adm22.a((cj)\u26039, alz5.a(N, \u26035), 3);
            }
        }
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, Random random) {
    }

    @Override
    public void b(adm adm2, cj cj2, alz alz2, Random random) {
        this.a(adm2, cj2, alz2, false, true, -1, null);
    }

    private void a(adm adm2, cj cj2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            adm2.a((double)cj2.n() + 0.5, (double)cj2.o() + 0.1, (double)cj2.p() + 0.5, "random.click", 0.4f, 0.6f);
        } else if (!bl2 && bl4) {
            adm2.a((double)cj2.n() + 0.5, (double)cj2.o() + 0.1, (double)cj2.p() + 0.5, "random.click", 0.4f, 0.5f);
        } else if (bl && !bl3) {
            adm2.a((double)cj2.n() + 0.5, (double)cj2.o() + 0.1, (double)cj2.p() + 0.5, "random.click", 0.4f, 0.7f);
        } else if (!bl && bl3) {
            adm2.a((double)cj2.n() + 0.5, (double)cj2.o() + 0.1, (double)cj2.p() + 0.5, "random.bowhit", 0.4f, 1.2f / (adm2.s.nextFloat() * 0.2f + 0.9f));
        }
    }

    private void a(adm adm2, cj cj2, cq cq2) {
        adm2.c(cj2, this);
        adm2.c(cj2.a(cq2.d()), this);
    }

    private boolean e(adm adm2, cj cj2, alz alz2) {
        if (!this.d(adm2, cj2)) {
            this.b(adm2, cj2, alz2, 0);
            adm2.g(cj2);
            return false;
        }
        return true;
    }

    @Override
    public void a(adq adq2, cj cj2) {
        float f = 0.1875f;
        switch (adq2.p(cj2).b(a)) {
            case f: {
                this.a(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
                break;
            }
            case e: {
                this.a(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
                break;
            }
            case d: {
                this.a(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
                break;
            }
            case c: {
                this.a(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
            }
        }
    }

    @Override
    public void b(adm adm2, cj cj2, alz alz2) {
        boolean bl = alz2.b(N);
        \u2603 = alz2.b(b);
        if (bl || \u2603) {
            this.a(adm2, cj2, alz2, true, false, -1, null);
        }
        if (\u2603) {
            adm2.c(cj2, this);
            adm2.c(cj2.a(alz2.b(a).d()), this);
        }
        super.b(adm2, cj2, alz2);
    }

    @Override
    public int a(adq adq2, cj cj2, alz alz2, cq cq2) {
        return alz2.b(b) != false ? 15 : 0;
    }

    @Override
    public int b(adq adq2, cj cj2, alz alz2, cq cq2) {
        if (!alz2.b(b).booleanValue()) {
            return 0;
        }
        if (alz2.b(a) == cq2) {
            return 15;
        }
        return 0;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public adf m() {
        return adf.b;
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, cq.b(n & 3)).a(b, (n & 8) > 0).a(N, (n & 4) > 0);
    }

    @Override
    public int c(alz alz2) {
        int n = 0;
        n |= alz2.b(a).b();
        if (alz2.b(b).booleanValue()) {
            n |= 8;
        }
        if (alz2.b(N).booleanValue()) {
            n |= 4;
        }
        return n;
    }

    @Override
    protected ama e() {
        return new ama(this, a, b, N, O);
    }
}
