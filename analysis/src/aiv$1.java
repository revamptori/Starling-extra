/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class aiv.1
implements Predicate<alz> {
    aiv.1() {
    }

    public boolean a(alz alz2) {
        return alz2 != null && (alz2.c() == afi.aU || alz2.c() == afi.aZ);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((alz)object);
    }
}
