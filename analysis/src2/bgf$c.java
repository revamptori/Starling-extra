/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
static enum bgf.c {
    a(0, 1, 2, 3),
    b(2, 3, 0, 1),
    c(3, 0, 1, 2),
    d(0, 1, 2, 3),
    e(3, 0, 1, 2),
    f(1, 2, 3, 0);

    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private static final bgf.c[] k;

    private bgf.c(int n2, int n3, int n4, int n5) {
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.j = n5;
    }

    public static bgf.c a(cq cq2) {
        return k[cq2.a()];
    }

    static /* synthetic */ int a(bgf.c c2) {
        return c2.g;
    }

    static /* synthetic */ int b(bgf.c c2) {
        return c2.h;
    }

    static /* synthetic */ int c(bgf.c c2) {
        return c2.i;
    }

    static /* synthetic */ int d(bgf.c c2) {
        return c2.j;
    }

    static {
        k = new bgf.c[6];
        bgf.c.k[cq.a.a()] = a;
        bgf.c.k[cq.b.a()] = b;
        bgf.c.k[cq.c.a()] = c;
        bgf.c.k[cq.d.a()] = d;
        bgf.c.k[cq.e.a()] = e;
        bgf.c.k[cq.f.a()] = f;
    }
}
