/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class o.11
implements Predicate<pk> {
    final /* synthetic */ cj a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    o.11(cj cj2, int n2, int n3, int n4, int n5) {
        this.a = cj2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public boolean a(pk pk2) {
        int n2 = (int)pk2.c(this.a);
        return !(this.b >= 0 && n2 < this.c || this.d >= 0 && n2 > this.e);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
