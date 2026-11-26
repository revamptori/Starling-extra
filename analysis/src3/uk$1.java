/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class uk.1
implements Predicate<pk> {
    uk.1() {
    }

    public boolean a(pk pk2) {
        return pk2 instanceof pr && ((pr)pk2).bz() != pw.b;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
