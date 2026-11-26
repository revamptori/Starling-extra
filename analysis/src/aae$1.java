/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Function;

static class aae.1
implements Function<zx, String> {
    final /* synthetic */ String[] a;

    aae.1(String[] stringArray) {
        this.a = stringArray;
    }

    public String a(zx zx2) {
        int n = zx2.i();
        if (n < 0 || n >= this.a.length) {
            n = 0;
        }
        return this.a[n];
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((zx)object);
    }
}
