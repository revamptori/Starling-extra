/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class te {
    private final cj a;
    private final cj b;
    private final cq c;
    private int d;
    private boolean e;
    private int f;

    public te(cj cj2, int n, int n2, int n3) {
        this(cj2, te.a(n, n2), n3);
    }

    private static cq a(int n, int n2) {
        if (n < 0) {
            return cq.e;
        }
        if (n > 0) {
            return cq.f;
        }
        if (n2 < 0) {
            return cq.c;
        }
        return cq.d;
    }

    public te(cj cj2, cq cq2, int n) {
        this.a = cj2;
        this.c = cq2;
        this.b = cj2.a(cq2, 2);
        this.d = n;
    }

    public int b(int n, int n2, int n3) {
        return (int)this.a.c(n, n2, n3);
    }

    public int a(cj cj2) {
        return (int)cj2.i(this.d());
    }

    public int b(cj cj2) {
        return (int)this.b.i(cj2);
    }

    public boolean c(cj cj2) {
        int n = cj2.n() - this.a.n();
        \u2603 = cj2.p() - this.a.o();
        return n * this.c.g() + \u2603 * this.c.i() >= 0;
    }

    public void a() {
        this.f = 0;
    }

    public void b() {
        ++this.f;
    }

    public int c() {
        return this.f;
    }

    public cj d() {
        return this.a;
    }

    public cj e() {
        return this.b;
    }

    public int f() {
        return this.c.g() * 2;
    }

    public int g() {
        return this.c.i() * 2;
    }

    public int h() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    public boolean i() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }
}
