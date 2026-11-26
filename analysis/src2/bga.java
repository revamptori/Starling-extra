/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bga {
    protected final bfr a;
    protected final adm b;
    protected int c;
    protected int d;
    protected int e;
    public bht[] f;

    public bga(adm adm2, int n, bfr bfr2, bhu bhu2) {
        this.a = bfr2;
        this.b = adm2;
        this.a(n);
        this.a(bhu2);
    }

    protected void a(bhu bhu2) {
        int n = this.d * this.c * this.e;
        this.f = new bht[n];
        \u2603 = 0;
        for (\u2603 = 0; \u2603 < this.d; ++\u2603) {
            for (\u2603 = 0; \u2603 < this.c; ++\u2603) {
                for (\u2603 = 0; \u2603 < this.e; ++\u2603) {
                    \u2603 = (\u2603 * this.c + \u2603) * this.d + \u2603;
                    cj cj2 = new cj(\u2603 * 16, \u2603 * 16, \u2603 * 16);
                    this.f[\u2603] = bhu2.a(this.b, this.a, cj2, \u2603++);
                }
            }
        }
    }

    public void a() {
        for (bht bht2 : this.f) {
            bht2.a();
        }
    }

    protected void a(int n) {
        this.d = \u2603 = n * 2 + 1;
        this.c = 16;
        this.e = \u2603;
    }

    public void a(double d, double d2) {
        int n = ns.c(d) - 8;
        \u2603 = ns.c(d2) - 8;
        \u2603 = this.d * 16;
        for (\u2603 = 0; \u2603 < this.d; ++\u2603) {
            \u2603 = this.a(n, \u2603, \u2603);
            for (\u2603 = 0; \u2603 < this.e; ++\u2603) {
                \u2603 = this.a(\u2603, \u2603, \u2603);
                for (\u2603 = 0; \u2603 < this.c; ++\u2603) {
                    \u2603 = \u2603 * 16;
                    cj cj2 = new cj(\u2603, \u2603, \u2603);
                    bht \u26032 = this.f[(\u2603 * this.c + \u2603) * this.d + \u2603];
                    if (cj2.equals(\u26032.j())) continue;
                    \u26032.a(cj2);
                }
            }
        }
    }

    private int a(int n, int n2, int n3) {
        \u2603 = n3 * 16;
        \u2603 = \u2603 - n + n2 / 2;
        if (\u2603 < 0) {
            \u2603 -= n2 - 1;
        }
        return \u2603 - \u2603 / n2 * n2;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        \u2603 = ns.a(n, 16);
        \u2603 = ns.a(n2, 16);
        \u2603 = ns.a(n3, 16);
        \u2603 = ns.a(n4, 16);
        \u2603 = ns.a(n5, 16);
        \u2603 = ns.a(n6, 16);
        for (\u2603 = \u2603; \u2603 <= \u2603; ++\u2603) {
            \u2603 = \u2603 % this.d;
            if (\u2603 < 0) {
                \u2603 += this.d;
            }
            for (\u2603 = \u2603; \u2603 <= \u2603; ++\u2603) {
                \u2603 = \u2603 % this.c;
                if (\u2603 < 0) {
                    \u2603 += this.c;
                }
                for (\u2603 = \u2603; \u2603 <= \u2603; ++\u2603) {
                    \u2603 = \u2603 % this.e;
                    if (\u2603 < 0) {
                        \u2603 += this.e;
                    }
                    \u2603 = (\u2603 * this.c + \u2603) * this.d + \u2603;
                    bht bht2 = this.f[\u2603];
                    bht2.a(true);
                }
            }
        }
    }

    protected bht a(cj cj2) {
        int n = ns.a(cj2.n(), 16);
        \u2603 = ns.a(cj2.o(), 16);
        \u2603 = ns.a(cj2.p(), 16);
        if (\u2603 < 0 || \u2603 >= this.c) {
            return null;
        }
        if ((n %= this.d) < 0) {
            n += this.d;
        }
        if ((\u2603 %= this.e) < 0) {
            \u2603 += this.e;
        }
        \u2603 = (\u2603 * this.c + \u2603) * this.d + n;
        return this.f[\u2603];
    }
}
