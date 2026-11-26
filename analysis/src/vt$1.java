/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class vt.1
implements Predicate<lf> {
    vt.1() {
    }

    public boolean a(lf lf2) {
        return vt.this.h(lf2) < 2500.0 && lf2.c.c();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((lf)object);
    }
}
