/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.cache.LoadingCache
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Objects;
import com.google.common.cache.LoadingCache;

public static class amd.b {
    private final cj a;
    private final cq b;
    private final cq c;
    private final LoadingCache<cj, amc> d;
    private final int e;
    private final int f;
    private final int g;

    public amd.b(cj cj2, cq cq2, cq cq3, LoadingCache<cj, amc> loadingCache, int n, int n2, int n3) {
        this.a = cj2;
        this.b = cq2;
        this.c = cq3;
        this.d = loadingCache;
        this.e = n;
        this.f = n2;
        this.g = n3;
    }

    public cj a() {
        return this.a;
    }

    public cq b() {
        return this.b;
    }

    public cq c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public amc a(int n, int n2, int n3) {
        return (amc)this.d.getUnchecked((Object)amd.a(this.a, this.b(), this.c(), n, n2, n3));
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("up", (Object)this.c).add("forwards", (Object)this.b).add("frontTopLeft", (Object)this.a).toString();
    }
}
