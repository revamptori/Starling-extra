/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
static class nm.a<V> {
    final int a;
    V b;
    nm.a<V> c;
    final int d;

    nm.a(int n, int n2, V v, nm.a<V> a2) {
        this.b = v;
        this.c = a2;
        this.a = n2;
        this.d = n;
    }

    public final int a() {
        return this.a;
    }

    public final V b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof nm.a)) {
            return false;
        }
        nm.a a2 = (nm.a)object;
        Integer \u26032 = this.a();
        return (\u26032 == (\u2603 = Integer.valueOf((int)a2.a())) || \u26032 != null && \u26032.equals((Object)\u2603)) && ((\u2603 = this.b()) == (\u2603 = a2.b()) || \u2603 != null && \u2603.equals(\u2603));
    }

    public final int hashCode() {
        return nm.g(this.a);
    }

    public final String toString() {
        return this.a() + "=" + this.b();
    }
}
