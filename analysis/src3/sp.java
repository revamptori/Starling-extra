/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sp<T extends pr>
extends st {
    protected final Class<T> a;
    private final int g;
    protected final a b;
    protected Predicate<? super T> c;
    protected pr d;

    public sp(py py2, Class<T> clazz, boolean bl) {
        this(py2, clazz, bl, false);
    }

    public sp(py py2, Class<T> clazz, boolean bl, boolean bl2) {
        this(py2, clazz, 10, bl, bl2, null);
    }

    public sp(py py2, Class<T> clazz, int n2, boolean bl, boolean bl2, final Predicate<? super T> predicate) {
        super(py2, bl, bl2);
        this.a = clazz;
        this.g = n2;
        this.b = new a(py2);
        this.a(1);
        this.c = new Predicate<T>(){

            public boolean a(T t2) {
                Object t2;
                if (predicate != null && !predicate.apply(t2)) {
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
        };
    }

    @Override
    public boolean a() {
        if (this.g > 0 && this.e.bc().nextInt(this.g) != 0) {
            return false;
        }
        double d = this.f();
        Predicate \u26032 = this.e.o.a(this.a, this.e.aR().b(d, 4.0, d), Predicates.and(this.c, po.d));
        Collections.sort((List)\u26032, (Comparator)this.b);
        if (\u26032.isEmpty()) {
            return false;
        }
        this.d = (pr)\u26032.get(0);
        return true;
    }

    @Override
    public void c() {
        this.e.d(this.d);
        super.c();
    }

    public static class a
    implements Comparator<pk> {
        private final pk a;

        public a(pk pk2) {
            this.a = pk2;
        }

        public int a(pk pk2, pk pk3) {
            double d = this.a.h(pk2);
            if (d < (\u2603 = this.a.h(pk3))) {
                return -1;
            }
            if (d > \u2603) {
                return 1;
            }
            return 0;
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((pk)object, (pk)object2);
        }
    }
}
