/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static enum bgf.a {
    a(new cq[]{cq.e, cq.f, cq.c, cq.d}, 0.5f, false, new bgf.d[0], new bgf.d[0], new bgf.d[0], new bgf.d[0]),
    b(new cq[]{cq.f, cq.e, cq.c, cq.d}, 1.0f, false, new bgf.d[0], new bgf.d[0], new bgf.d[0], new bgf.d[0]),
    c(new cq[]{cq.b, cq.a, cq.f, cq.e}, 0.8f, true, new bgf.d[]{bgf.d.b, bgf.d.k, bgf.d.b, bgf.d.e, bgf.d.h, bgf.d.e, bgf.d.h, bgf.d.k}, new bgf.d[]{bgf.d.b, bgf.d.l, bgf.d.b, bgf.d.f, bgf.d.h, bgf.d.f, bgf.d.h, bgf.d.l}, new bgf.d[]{bgf.d.a, bgf.d.l, bgf.d.a, bgf.d.f, bgf.d.g, bgf.d.f, bgf.d.g, bgf.d.l}, new bgf.d[]{bgf.d.a, bgf.d.k, bgf.d.a, bgf.d.e, bgf.d.g, bgf.d.e, bgf.d.g, bgf.d.k}),
    d(new cq[]{cq.e, cq.f, cq.a, cq.b}, 0.8f, true, new bgf.d[]{bgf.d.b, bgf.d.k, bgf.d.h, bgf.d.k, bgf.d.h, bgf.d.e, bgf.d.b, bgf.d.e}, new bgf.d[]{bgf.d.a, bgf.d.k, bgf.d.g, bgf.d.k, bgf.d.g, bgf.d.e, bgf.d.a, bgf.d.e}, new bgf.d[]{bgf.d.a, bgf.d.l, bgf.d.g, bgf.d.l, bgf.d.g, bgf.d.f, bgf.d.a, bgf.d.f}, new bgf.d[]{bgf.d.b, bgf.d.l, bgf.d.h, bgf.d.l, bgf.d.h, bgf.d.f, bgf.d.b, bgf.d.f}),
    e(new cq[]{cq.b, cq.a, cq.c, cq.d}, 0.6f, true, new bgf.d[]{bgf.d.b, bgf.d.d, bgf.d.b, bgf.d.j, bgf.d.h, bgf.d.j, bgf.d.h, bgf.d.d}, new bgf.d[]{bgf.d.b, bgf.d.c, bgf.d.b, bgf.d.i, bgf.d.h, bgf.d.i, bgf.d.h, bgf.d.c}, new bgf.d[]{bgf.d.a, bgf.d.c, bgf.d.a, bgf.d.i, bgf.d.g, bgf.d.i, bgf.d.g, bgf.d.c}, new bgf.d[]{bgf.d.a, bgf.d.d, bgf.d.a, bgf.d.j, bgf.d.g, bgf.d.j, bgf.d.g, bgf.d.d}),
    f(new cq[]{cq.a, cq.b, cq.c, cq.d}, 0.6f, true, new bgf.d[]{bgf.d.g, bgf.d.d, bgf.d.g, bgf.d.j, bgf.d.a, bgf.d.j, bgf.d.a, bgf.d.d}, new bgf.d[]{bgf.d.g, bgf.d.c, bgf.d.g, bgf.d.i, bgf.d.a, bgf.d.i, bgf.d.a, bgf.d.c}, new bgf.d[]{bgf.d.h, bgf.d.c, bgf.d.h, bgf.d.i, bgf.d.b, bgf.d.i, bgf.d.b, bgf.d.c}, new bgf.d[]{bgf.d.h, bgf.d.d, bgf.d.h, bgf.d.j, bgf.d.b, bgf.d.j, bgf.d.b, bgf.d.d});

    protected final cq[] g;
    protected final float h;
    protected final boolean i;
    protected final bgf.d[] j;
    protected final bgf.d[] k;
    protected final bgf.d[] l;
    protected final bgf.d[] m;
    private static final bgf.a[] n;

    private bgf.a(cq[] cqArray, float f, boolean bl, bgf.d[] dArray, bgf.d[] dArray2, bgf.d[] dArray3, bgf.d[] dArray4) {
        this.g = cqArray;
        this.h = f;
        this.i = bl;
        this.j = dArray;
        this.k = dArray2;
        this.l = dArray3;
        this.m = dArray4;
    }

    public static bgf.a a(cq cq2) {
        return n[cq2.a()];
    }

    static {
        n = new bgf.a[6];
        bgf.a.n[cq.a.a()] = a;
        bgf.a.n[cq.b.a()] = b;
        bgf.a.n[cq.c.a()] = c;
        bgf.a.n[cq.d.a()] = d;
        bgf.a.n[cq.e.a()] = e;
        bgf.a.n[cq.f.a()] = f;
    }
}
