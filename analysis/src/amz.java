/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class amz {
    private int a;
    private int b;
    private int c;
    private char[] d;
    private amw e;
    private amw f;

    public amz(int n, boolean bl) {
        this.a = n;
        this.d = new char[4096];
        this.e = new amw();
        if (bl) {
            this.f = new amw();
        }
    }

    public alz a(int n, int n2, int n3) {
        alz alz2 = afh.d.a(this.d[n2 << 8 | n3 << 4 | n]);
        if (alz2 != null) {
            return alz2;
        }
        return afi.a.Q();
    }

    public void a(int n, int n2, int n3, alz alz2) {
        \u2603 = this.a(n, n2, n3);
        afh afh2 = \u2603.c();
        \u2603 = alz2.c();
        if (afh2 != afi.a) {
            --this.b;
            if (afh2.y()) {
                --this.c;
            }
        }
        if (\u2603 != afi.a) {
            ++this.b;
            if (\u2603.y()) {
                ++this.c;
            }
        }
        this.d[n2 << 8 | n3 << 4 | n] = (char)afh.d.b(alz2);
    }

    public afh b(int n, int n2, int n3) {
        return this.a(n, n2, n3).c();
    }

    public int c(int n, int n2, int n3) {
        alz alz2 = this.a(n, n2, n3);
        return alz2.c().c(alz2);
    }

    public boolean a() {
        return this.b == 0;
    }

    public boolean b() {
        return this.c > 0;
    }

    public int d() {
        return this.a;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.f.a(n, n2, n3, n4);
    }

    public int d(int n, int n2, int n3) {
        return this.f.a(n, n2, n3);
    }

    public void b(int n, int n2, int n3, int n4) {
        this.e.a(n, n2, n3, n4);
    }

    public int e(int n, int n2, int n3) {
        return this.e.a(n, n2, n3);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
        for (int i = 0; i < 16; ++i) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                    afh afh2 = this.b(i, \u2603, \u2603);
                    if (afh2 == afi.a) continue;
                    ++this.b;
                    if (!afh2.y()) continue;
                    ++this.c;
                }
            }
        }
    }

    public char[] g() {
        return this.d;
    }

    public void a(char[] cArray) {
        this.d = cArray;
    }

    public amw h() {
        return this.e;
    }

    public amw i() {
        return this.f;
    }

    public void a(amw amw2) {
        this.e = amw2;
    }

    public void b(amw amw2) {
        this.f = amw2;
    }
}
