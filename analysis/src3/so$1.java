/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class so.1
implements Predicate<pk> {
    so.1() {
    }

    public boolean a(pk pk22) {
        pk pk22;
        if (!(pk22 instanceof wn)) {
            return false;
        }
        if (((wn)pk22).bA.a) {
            return false;
        }
        double d = so.this.f();
        if (pk22.av()) {
            d *= (double)0.8f;
        }
        if (pk22.ax()) {
            float f = ((wn)pk22).bY();
            if (f < 0.1f) {
                f = 0.1f;
            }
            d *= (double)(0.7f * f);
        }
        if ((double)pk22.g(so.this.b) > d) {
            return false;
        }
        return st.a(so.this.b, (pr)pk22, false, true);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
