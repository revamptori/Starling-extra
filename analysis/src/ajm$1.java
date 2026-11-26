/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class ajm.1
implements Predicate<amc> {
    ajm.1() {
    }

    public boolean a(amc amc2) {
        return amc2.a() != null && amc2.a().c() == afi.ce && amc2.b() instanceof alo && ((alo)amc2.b()).c() == 1;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((amc)object);
    }
}
