/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class avo.1
implements Predicate<aum> {
    avo.1() {
    }

    public boolean a(aum aum2) {
        return aum2.e() != null && !aum2.e().startsWith("#");
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((aum)object);
    }
}
