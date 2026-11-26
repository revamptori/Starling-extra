/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  java.lang.Object
 *  java.lang.Override
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

static final class yj.1
extends cn {
    yj.1() {
    }

    @Override
    protected zx b(ck ck2, zx zx2) {
        cj cj2 = ck2.d().a(agg.b(ck2.f()));
        int \u26032 = cj2.n();
        int \u26033 = cj2.o();
        int \u26034 = cj2.p();
        aug \u26035 = new aug(\u26032, \u26033, \u26034, \u26032 + 1, \u26033 + 1, \u26034 + 1);
        Predicate \u26036 = ck2.i().a(pr.class, \u26035, Predicates.and(po.d, (Predicate)new po.a(zx2)));
        if (\u26036.size() > 0) {
            pr pr2 = (pr)\u26036.get(0);
            int \u26037 = pr2 instanceof wn ? 1 : 0;
            int \u26038 = ps.c(zx2);
            zx \u26039 = zx2.k();
            \u26039.b = 1;
            pr2.c(\u26038 - \u26037, \u26039);
            if (pr2 instanceof ps) {
                ((ps)pr2).a(\u26038, 2.0f);
            }
            --zx2.b;
            return zx2;
        }
        return super.b(ck2, zx2);
    }
}
