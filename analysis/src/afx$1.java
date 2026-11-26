/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class afx.1
implements Predicate<pk> {
    final /* synthetic */ cq a;

    afx.1(cq cq2) {
        this.a = cq2;
    }

    public boolean a(pk pk2) {
        return pk2 != null && pk2.aP() == this.a;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
