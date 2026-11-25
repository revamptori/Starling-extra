/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class sp.1
implements Predicate<T> {
    final /* synthetic */ Predicate a;

    sp.1(Predicate predicate) {
        this.a = predicate;
    }

    public boolean a(T t2) {
        Object t2;
        if (this.a != null && !this.a.apply(t2)) {
            return false;
        }
        if (t2 instanceof wn) {
            double d = sp.this.f();
            if (((pk)t2).av()) {
                d *= (double)0.8f;
            }
            if (((pk)t2).ax()) {
                float f = ((wn)t2).bY();
                if (f < 0.1f) {
                    f = 0.1f;
                }
                d *= (double)(0.7f * f);
            }
            if ((double)((pk)t2).g(sp.this.e) > d) {
                return false;
            }
        }
        return sp.this.a((pr)t2, false);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pr)object);
    }
}
