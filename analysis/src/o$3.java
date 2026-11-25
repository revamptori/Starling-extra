/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class o.3
implements Predicate<pk> {
    final /* synthetic */ aug a;

    o.3(aug aug2) {
        this.a = aug2;
    }

    public boolean a(pk pk2) {
        if (pk2.s < this.a.a || pk2.t < this.a.b || pk2.u < this.a.c) {
            return false;
        }
        return !(pk2.s >= this.a.d) && !(pk2.t >= this.a.e) && !(pk2.u >= this.a.f);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
