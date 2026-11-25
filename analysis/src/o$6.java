/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class o.6
implements Predicate<pk> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    o.6(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(pk pk2) {
        if (!(pk2 instanceof lf)) {
            return false;
        }
        lf lf2 = (lf)pk2;
        return !(this.a > -1 && lf2.bB < this.a || this.b > -1 && lf2.bB > this.b);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
