/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class kw {
    private final int a;
    private final cj b;
    private int c;
    private int d;

    public kw(int n, cj cj2) {
        this.a = n;
        this.b = cj2;
    }

    public cj b() {
        return this.b;
    }

    public void a(int n) {
        if (n > 10) {
            n = 10;
        }
        this.c = n;
    }

    public int c() {
        return this.c;
    }

    public void b(int n) {
        this.d = n;
    }

    public int d() {
        return this.d;
    }
}
