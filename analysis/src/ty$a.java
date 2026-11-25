/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Class
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static class ty.a<T extends pr>
extends sp<T> {
    public ty.a(final py py2, Class<T> clazz, int n2, boolean bl, boolean bl2, final Predicate<? super T> predicate) {
        super(py2, clazz, n2, bl, bl2, predicate);
        this.c = new Predicate<T>(){

            public boolean a(T t2) {
                Object t2;
                if (predicate != null && !predicate.apply(t2)) {
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
                    if ((double)((pk)t2).g(py2) > d) {
                        return false;
                    }
                }
                return a.this.a(t2, false);
            }

            public /* synthetic */ boolean apply(Object object) {
                return this.a((pr)object);
            }
        };
    }
}
