/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class amc.1
implements Predicate<amc> {
    final /* synthetic */ Predicate a;

    amc.1(Predicate predicate) {
        this.a = predicate;
    }

    public boolean a(amc amc2) {
        return amc2 != null && this.a.apply((Object)amc2.a());
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((amc)object);
    }
}
