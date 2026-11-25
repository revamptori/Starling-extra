/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class aif.1
implements Predicate<aio.a> {
    aif.1() {
    }

    public boolean a(aio.a a2) {
        return a2.a() >= 4;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((aio.a)object);
    }
}
