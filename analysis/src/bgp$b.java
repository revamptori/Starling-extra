/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
static enum bgp.b {
    a(cq.b, 0, -1),
    b(cq.a, 0, 1),
    c(cq.f, -1, 0),
    d(cq.e, 1, 0);

    private final cq e;
    private final int f;
    private final int g;

    private bgp.b(cq cq2, int n2, int n3) {
        this.e = cq2;
        this.f = n2;
        this.g = n3;
    }

    public cq a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    private boolean d() {
        return this == b || this == a;
    }

    static /* synthetic */ boolean a(bgp.b b2) {
        return b2.d();
    }
}
