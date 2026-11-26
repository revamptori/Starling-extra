/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class tp.1
implements Predicate<pk> {
    tp.1() {
    }

    public boolean a(pk pk2) {
        return pk2 instanceof tp && ((tp)pk2).cA();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
