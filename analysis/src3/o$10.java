/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Predicate;

static final class o.10
implements Predicate<pk> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    o.10(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public boolean a(pk pk2) {
        return pk2.e_().equals((Object)this.a) != this.b;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
