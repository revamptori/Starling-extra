/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public enum bfj {
    a(new b(bfj$a.f, bfj$a.e, bfj$a.a), new b(bfj$a.f, bfj$a.e, bfj$a.d), new b(bfj$a.c, bfj$a.e, bfj$a.d), new b(bfj$a.c, bfj$a.e, bfj$a.a)),
    b(new b(bfj$a.f, bfj$a.b, bfj$a.d), new b(bfj$a.f, bfj$a.b, bfj$a.a), new b(bfj$a.c, bfj$a.b, bfj$a.a), new b(bfj$a.c, bfj$a.b, bfj$a.d)),
    c(new b(bfj$a.c, bfj$a.b, bfj$a.d), new b(bfj$a.c, bfj$a.e, bfj$a.d), new b(bfj$a.f, bfj$a.e, bfj$a.d), new b(bfj$a.f, bfj$a.b, bfj$a.d)),
    d(new b(bfj$a.f, bfj$a.b, bfj$a.a), new b(bfj$a.f, bfj$a.e, bfj$a.a), new b(bfj$a.c, bfj$a.e, bfj$a.a), new b(bfj$a.c, bfj$a.b, bfj$a.a)),
    e(new b(bfj$a.f, bfj$a.b, bfj$a.d), new b(bfj$a.f, bfj$a.e, bfj$a.d), new b(bfj$a.f, bfj$a.e, bfj$a.a), new b(bfj$a.f, bfj$a.b, bfj$a.a)),
    f(new b(bfj$a.c, bfj$a.b, bfj$a.a), new b(bfj$a.c, bfj$a.e, bfj$a.a), new b(bfj$a.c, bfj$a.e, bfj$a.d), new b(bfj$a.c, bfj$a.b, bfj$a.d));

    private static final bfj[] g;
    private final b[] h;

    public static bfj a(cq cq2) {
        return g[cq2.a()];
    }

    private bfj(b ... bArray) {
        this.h = bArray;
    }

    public b a(int n) {
        return this.h[n];
    }

    static {
        g = new bfj[6];
        bfj.g[bfj$a.e] = a;
        bfj.g[bfj$a.b] = b;
        bfj.g[bfj$a.d] = c;
        bfj.g[bfj$a.a] = d;
        bfj.g[bfj$a.f] = e;
        bfj.g[bfj$a.c] = f;
    }

    public static class b {
        public final int a;
        public final int b;
        public final int c;

        private b(int n, int n2, int n3) {
            this.a = n;
            this.b = n2;
            this.c = n3;
        }
    }

    public static final class a {
        public static final int a = cq.d.a();
        public static final int b = cq.b.a();
        public static final int c = cq.f.a();
        public static final int d = cq.c.a();
        public static final int e = cq.a.a();
        public static final int f = cq.e.a();
    }
}
