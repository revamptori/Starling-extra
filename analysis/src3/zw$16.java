/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Function;

static final class zw.16
implements Function<zx, String> {
    zw.16() {
    }

    public String a(zx zx2) {
        return (zx2.i() & 1) == 1 ? "wet" : "dry";
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((zx)object);
    }
}
