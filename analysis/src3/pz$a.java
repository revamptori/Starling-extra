/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static class pz.a {
    private final int a;
    private final int b;
    private Object c;
    private boolean d;

    public pz.a(int n, int n2, Object object) {
        this.b = n2;
        this.c = object;
        this.a = n;
        this.d = true;
    }

    public int a() {
        return this.b;
    }

    public void a(Object object) {
        this.c = object;
    }

    public Object b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    static /* synthetic */ boolean a(pz.a a2, boolean bl) {
        a2.d = bl;
        return a2.d;
    }
}
