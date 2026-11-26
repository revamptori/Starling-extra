/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class ty.a.1
implements Predicate<T> {
    final /* synthetic */ Predicate a;
    final /* synthetic */ py b;

    ty.a.1(Predicate predicate, py py2) {
        this.a = predicate;
        this.b = py2;
    }

    public boolean a(T t2) {
        Object t2;
        if (this.a != null && !this.a.apply(t2)) {
            return false;
        }
        if (t2 instanceof vn) {
            return false;
        }
        if (t2 instanceof wn) {
            double d = a.this.f();
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
            if ((double)((pk)t2).g(this.b) > d) {
                return false;
            }
        }
        return a.this.a(t2, false);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pr)object);
    }
}
