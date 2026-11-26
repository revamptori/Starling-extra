/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
public class nq<V> {
    private transient a<V>[] a = new a[4096];
    private transient int b;
    private int c = this.a.length - 1;
    private int d = 3072;
    private final float e;
    private volatile transient int f;

    public nq() {
        this.e = 0.75f;
    }

    private static int g(long l) {
        return nq.a((int)(l ^ l >>> 32));
    }

    private static int a(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private static int a(int n, int n2) {
        return n & n2;
    }

    public int a() {
        return this.b;
    }

    public V a(long l) {
        int n = nq.g(l);
        a<V> \u26032 = this.a[nq.a(n, this.c)];
        while (\u26032 != null) {
            if (\u26032.a == l) {
                return \u26032.b;
            }
            \u26032 = \u26032.c;
        }
        return null;
    }

    public boolean b(long l) {
        return this.c(l) != null;
    }

    final a<V> c(long l) {
        int n = nq.g(l);
        a<V> \u26032 = this.a[nq.a(n, this.c)];
        while (\u26032 != null) {
            if (\u26032.a == l) {
                return \u26032;
            }
            \u26032 = \u26032.c;
        }
        return null;
    }

    public void a(long l, V v) {
        int n = nq.g(l);
        \u2603 = nq.a(n, this.c);
        a<V> \u26032 = this.a[\u2603];
        while (\u26032 != null) {
            if (\u26032.a == l) {
                \u26032.b = v;
                return;
            }
            \u26032 = \u26032.c;
        }
        ++this.f;
        this.a(n, l, v, \u2603);
    }

    private void b(int n) {
        a<V>[] aArray = this.a;
        int \u26032 = aArray.length;
        if (\u26032 == 0x40000000) {
            this.d = Integer.MAX_VALUE;
            return;
        }
        a[] \u26033 = new a[n];
        this.a(\u26033);
        this.a = \u26033;
        this.c = this.a.length - 1;
        this.d = (int)((float)n * this.e);
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
                int n2 = nq.a(a2.d, n - 1);
                a2.c = aArray[n2];
                aArray[n2] = a2;
            } while ((a2 = \u2603) != null);
        }
    }

    public V d(long l) {
        a<V> a2 = this.e(l);
        return a2 == null ? null : (V)a2.b;
    }

    final a<V> e(long l) {
        int n = nq.g(l);
        \u2603 = nq.a(n, this.c);
        a<V> \u26032 = \u2603 = this.a[\u2603];
        while (\u26032 != null) {
            a a2 = \u26032.c;
            if (\u26032.a == l) {
                ++this.f;
                --this.b;
                if (\u2603 == \u26032) {
                    this.a[\u2603] = a2;
                } else {
                    \u2603.c = a2;
                }
                return \u26032;
            }
            \u2603 = \u26032;
            \u26032 = a2;
        }
        return \u26032;
    }

    private void a(int n, long l, V v, int n2) {
        a<V> a2 = this.a[n2];
        this.a[n2] = new a<V>(n, l, v, a2);
        if (this.b++ >= this.d) {
            this.b(2 * this.a.length);
        }
    }

    static class a<V> {
        final long a;
        V b;
        a<V> c;
        final int d;

        a(int n, long l, V v, a<V> a2) {
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
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
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
}
