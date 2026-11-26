/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Math
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class o.2
implements Predicate<pk> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    o.2(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(pk pk2) {
        int n2 = o.a((int)Math.floor((double)pk2.z));
        if (this.a > this.b) {
            return n2 >= this.a || n2 <= this.b;
        }
        return n2 >= this.a && n2 <= this.b;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
