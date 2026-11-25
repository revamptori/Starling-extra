/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class po.2
implements Predicate<pk> {
    po.2() {
    }

    public boolean a(pk pk2) {
        return pk2.ai() && pk2.l == null && pk2.m == null;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
