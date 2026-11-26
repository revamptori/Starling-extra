/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Predicate;

static final class o.8
implements Predicate<pk> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    o.8(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public boolean a(pk pk2) {
        if (!(pk2 instanceof pr)) {
            return false;
        }
        pr pr2 = (pr)pk2;
        auq \u26032 = pr2.bO();
        String \u26033 = \u26032 == null ? "" : \u26032.b();
        return \u26033.equals((Object)this.a) != this.b;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
