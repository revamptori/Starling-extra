/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static class vt.b
implements Predicate<pr> {
    private vt a;

    public vt.b(vt vt2) {
        this.a = vt2;
    }

    public boolean a(pr pr2) {
        return (pr2 instanceof wn || pr2 instanceof tx) && pr2.h(this.a) > 9.0;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pr)object);
    }
}
