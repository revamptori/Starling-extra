/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.Override
 */
import com.google.common.base.Predicate;

public class ais
extends afe {
    public static final amm<afe.b> b = amm.a("shape", afe.b.class, new Predicate<afe.b>(){

        public boolean a(afe.b b2) {
            return b2 != afe.b.j && b2 != afe.b.i && b2 != afe.b.g && b2 != afe.b.h;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((afe.b)object);
        }
    });
    public static final amk N = amk.a("powered");

    protected ais() {
        super(true);
        this.j(this.M.b().a(b, afe.b.a).a(N, false));
    }

    protected boolean a(adm adm2, cj cj2, alz alz2, boolean bl, int n) {
        if (n >= 8) {
            return false;
        }
        \u2603 = cj2.n();
        \u2603 = cj2.o();
        \u2603 = cj2.p();
        boolean bl2 = true;
        afe.b \u26032 = alz2.b(b);
        switch (\u26032) {
            case a: {
                if (bl) {
                    ++\u2603;
                    break;
                }
                --\u2603;
                break;
            }
            case b: {
                if (bl) {
                    --\u2603;
                    break;
                }
                ++\u2603;
                break;
            }
            case c: {
                if (bl) {
                    --\u2603;
                } else {
                    ++\u2603;
                    ++\u2603;
                    bl2 = false;
                }
                \u26032 = afe.b.b;
                break;
            }
            case d: {
                if (bl) {
                    --\u2603;
                    ++\u2603;
                    bl2 = false;
                } else {
                    ++\u2603;
                }
                \u26032 = afe.b.b;
                break;
            }
            case e: {
                if (bl) {
                    ++\u2603;
                } else {
                    --\u2603;
                    ++\u2603;
                    bl2 = false;
                }
                \u26032 = afe.b.a;
                break;
            }
            case f: {
                if (bl) {
                    ++\u2603;
                    ++\u2603;
                    bl2 = false;
                } else {
                    --\u2603;
                }
                \u26032 = afe.b.a;
            }
        }
        if (this.a(adm2, new cj(\u2603, \u2603, \u2603), bl, n, \u26032)) {
            return true;
        }
        return bl2 && this.a(adm2, new cj(\u2603, \u2603 - 1, \u2603), bl, n, \u26032);
    }

    protected boolean a(adm adm2, cj cj2, boolean bl, int n, afe.b b2) {
        alz alz2 = adm2.p(cj2);
        if (alz2.c() != this) {
            return false;
        }
        afe.b \u26032 = alz2.b(b);
        if (b2 == afe.b.b && (\u26032 == afe.b.a || \u26032 == afe.b.e || \u26032 == afe.b.f)) {
            return false;
        }
        if (b2 == afe.b.a && (\u26032 == afe.b.b || \u26032 == afe.b.c || \u26032 == afe.b.d)) {
            return false;
        }
        if (alz2.b(N).booleanValue()) {
            if (adm2.z(cj2)) {
                return true;
            }
            return this.a(adm2, cj2, alz2, bl, n + 1);
        }
        return false;
    }

    @Override
    protected void b(adm adm2, cj cj2, alz alz2, afh afh2) {
        boolean bl = alz2.b(N);
        boolean bl2 = \u2603 = adm2.z(cj2) || this.a(adm2, cj2, alz2, true, 0) || this.a(adm2, cj2, alz2, false, 0);
        if (\u2603 != bl) {
            adm2.a(cj2, alz2.a(N, \u2603), 3);
            adm2.c(cj2.b(), this);
            if (alz2.b(b).c()) {
                adm2.c(cj2.a(), this);
            }
        }
    }

    @Override
    public amo<afe.b> n() {
        return b;
    }

    @Override
    public alz a(int n) {
        return this.Q().a(b, afe.b.a(n & 7)).a(N, (n & 8) > 0);
    }

    @Override
    public int c(alz alz2) {
        int n = 0;
        n |= alz2.b(b).a();
        if (alz2.b(N).booleanValue()) {
            n |= 8;
        }
        return n;
    }

    @Override
    protected ama e() {
        return new ama(this, b, N);
    }
}
