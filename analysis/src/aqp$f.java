/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
static class aqp.f {
    public Class<? extends aqp.p> a;
    public final int b;
    public int c;
    public int d;

    public aqp.f(Class<? extends aqp.p> clazz, int n, int n2) {
        this.a = clazz;
        this.b = n;
        this.d = n2;
    }

    public boolean a(int n) {
        return this.d == 0 || this.c < this.d;
    }

    public boolean a() {
        return this.d == 0 || this.c < this.d;
    }
}
