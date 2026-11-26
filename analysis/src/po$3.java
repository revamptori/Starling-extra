/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class po.3
implements Predicate<pk> {
    po.3() {
    }

    public boolean a(pk pk2) {
        return pk2 instanceof og && pk2.ai();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
