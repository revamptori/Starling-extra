/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class le.1
implements Predicate<pr> {
    le.1() {
    }

    public boolean a(pr pr2) {
        return pr2 != null && pr2.ai() && le.this.i(pr2.c());
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pr)object);
    }
}
