/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
static class nq.a<V> {
    final long a;
    V b;
    nq.a<V> c;
    final int d;

    nq.a(int n, long l, V v, nq.a<V> a2) {
        this.b = v;
        this.c = a2;
        this.a = l;
        this.d = n;
    }

    public final long a() {
        return this.a;
    }

    public final V b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof nq.a)) {
            return false;
        }
        nq.a a2 = (nq.a)object;
        Long \u26032 = this.a();
        return (\u26032 == (\u2603 = Long.valueOf((long)a2.a())) || \u26032 != null && \u26032.equals((Object)\u2603)) && ((\u2603 = this.b()) == (\u2603 = a2.b()) || \u2603 != null && \u2603.equals(\u2603));
    }

    public final int hashCode() {
        return nq.g(this.a);
    }

    public final String toString() {
        return this.a() + "=" + this.b();
    }
}
