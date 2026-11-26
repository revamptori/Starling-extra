/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
static class bgp.a {
    private final bgp.b a;
    private int b;
    private int c;
    private final int d;

    public bgp.a(bgp.b b2, int n, int n2) {
        this.a = b2;
        this.b = n;
        this.c = n;
        this.d = n2;
    }

    public void a(int n) {
        if (n < this.b) {
            this.b = n;
        } else if (n > this.c) {
            this.c = n;
        }
    }

    public bgp.b a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}
