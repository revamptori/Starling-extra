/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

public static class po.a
implements Predicate<pk> {
    private final zx a;

    public po.a(zx zx2) {
        this.a = zx2;
    }

    public boolean a(pk pk2) {
        if (!pk2.ai()) {
            return false;
        }
        if (!(pk2 instanceof pr)) {
            return false;
        }
        pr pr2 = (pr)pk2;
        if (pr2.p(ps.c(this.a)) != null) {
            return false;
        }
        if (pr2 instanceof ps) {
            return ((ps)pr2).bY();
        }
        if (pr2 instanceof um) {
            return true;
        }
        return pr2 instanceof wn;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
