/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static enum bgf.d {
    a(cq.a, false),
    b(cq.b, false),
    c(cq.c, false),
    d(cq.d, false),
    e(cq.e, false),
    f(cq.f, false),
    g(cq.a, true),
    h(cq.b, true),
    i(cq.c, true),
    j(cq.d, true),
    k(cq.e, true),
    l(cq.f, true);

    protected final int m;

    private bgf.d(cq cq2, boolean bl) {
        this.m = cq2.a() + (bl ? cq.values().length : 0);
    }
}
