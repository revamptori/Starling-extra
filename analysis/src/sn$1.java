/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class sn.1
implements Predicate<pr> {
    sn.1() {
    }

    public boolean a(pr pr2) {
        double d = sn.this.f();
        if (pr2.av()) {
            d *= (double)0.8f;
        }
        if (pr2.ax()) {
            return false;
        }
        if ((double)pr2.g(sn.this.b) > d) {
            return false;
        }
        return st.a(sn.this.b, pr2, false, true);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pr)object);
    }
}
