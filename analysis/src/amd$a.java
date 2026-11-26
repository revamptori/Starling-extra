/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  java.lang.Exception
 *  java.lang.Object
 */
import com.google.common.cache.CacheLoader;

static class amd.a
extends CacheLoader<cj, amc> {
    private final adm a;
    private final boolean b;

    public amd.a(adm adm2, boolean bl) {
        this.a = adm2;
        this.b = bl;
    }

    public amc a(cj cj2) throws Exception {
        return new amc(this.a, cj2, this.b);
    }

    public /* synthetic */ Object load(Object object) throws Exception {
        return this.a((cj)object);
    }
}
