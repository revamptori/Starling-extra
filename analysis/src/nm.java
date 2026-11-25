/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
public class nm<V> {
    private transient a<V>[] a = new a[16];
    private transient int b;
    private int c = 12;
    private final float d;

    public nm() {
        this.d = 0.75f;
    }

    private static int g(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private static int a(int n, int n2) {
        return n & n2 - 1;
    }

    public V a(int n) {
        \u2603 = nm.g(n);
        a<V> a2 = this.a[nm.a(\u2603, this.a.length)];
        while (a2 != null) {
            if (a2.a == n) {
                return a2.b;
            }
            a2 = a2.c;
        }
        return null;
    }

    public boolean b(int n) {
        return this.c(n) != null;
    }

    final a<V> c(int n) {
        \u2603 = nm.g(n);
        a<V> a2 = this.a[nm.a(\u2603, this.a.length)];
        while (a2 != null) {
            if (a2.a == n) {
                return a2;
            }
            a2 = a2.c;
        }
        return null;
    }

    public void a(int n, V v) {
        int n2 = nm.g(n);
        \u2603 = nm.a(n2, this.a.length);
        a<V> \u26032 = this.a[\u2603];
        while (\u26032 != null) {
            if (\u26032.a == n) {
                \u26032.b = v;
                return;
            }
            \u26032 = \u26032.c;
        }
        this.a(n2, n, v, \u2603);
    }

    private void h(int n) {
        a<V>[] aArray = this.a;
        int \u26032 = aArray.length;
        if (\u26032 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
            return;
        }
        a[] \u26033 = new a[n];
        this.a(\u26033);
        this.a = \u26033;
        this.c = (int)((float)n * this.d);
    }

    private void a(a<V>[] aArray) {
        \u2603 = this.a;
        int n = aArray.length;
        for (\u2603 = 0; \u2603 < \u2603.length; ++\u2603) {
            a<V> a2 = \u2603[\u2603];
            if (a2 == null) continue;
            \u2603[\u2603] = null;
            do {
                \u2603 = a2.c;
                int n2 = nm.a(a2.d, n);
                a2.c = aArray[n2];
                aArray[n2] = a2;
            } while ((a2 = \u2603) != null);
        }
    }

    public V d(int n) {
        a<V> a2 = this.e(n);
        return a2 == null ? null : (V)a2.b;
    }

    final a<V> e(int n) {
        \u2603 = nm.g(n);
        \u2603 = nm.a(\u2603, this.a.length);
        a<V> a2 = \u2603 = this.a[\u2603];
        while (a2 != null) {
            \u2603 = a2.c;
            if (a2.a == n) {
                --this.b;
                if (\u2603 == a2) {
                    this.a[\u2603] = \u2603;
                } else {
                    \u2603.c = \u2603;
                }
                return a2;
            }
            \u2603 = a2;
            a2 = \u2603;
        }
        return a2;
    }

    public void c() {
        a<V>[] aArray = this.a;
        for (int i = 0; i < aArray.length; ++i) {
            aArray[i] = null;
        }
        this.b = 0;
    }

    private void a(int n, int n2, V v, int n3) {
        a<V> a2 = this.a[n3];
        this.a[n3] = new a<V>(n, n2, v, a2);
        if (this.b++ >= this.c) {
            this.h(2 * this.a.length);
        }
    }

    static class a<V> {
        final int a;
        V b;
        a<V> c;
        final int d;

        a(int n, int n2, V v, a<V> a2) {
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
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
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
}
