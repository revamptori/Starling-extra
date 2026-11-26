/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class vq.2
implements Predicate<pk> {
    vq.2() {
    }

    public boolean a(pk pk2) {
        return pk2 instanceof vq && !pk2.ax();
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
