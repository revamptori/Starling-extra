/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class ua.1
implements Predicate<pk> {
    ua.1() {
    }

    public boolean a(pk pk2) {
        return pk2 instanceof tv || pk2 instanceof tu;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
