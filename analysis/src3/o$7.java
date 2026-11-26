/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class o.7
implements Predicate<pk> {
    final /* synthetic */ int a;

    o.7(int n2) {
        this.a = n2;
    }

    public boolean a(pk pk2) {
        if (!(pk2 instanceof lf)) {
            return false;
        }
        lf lf2 = (lf)pk2;
        return lf2.c.b().a() == this.a;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
