/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class ais.1
implements Predicate<afe.b> {
    ais.1() {
    }

    public boolean a(afe.b b2) {
        return b2 != afe.b.j && b2 != afe.b.i && b2 != afe.b.g && b2 != afe.b.h;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((afe.b)object);
    }
}
