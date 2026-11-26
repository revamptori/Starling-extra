/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static class aip.a {
    private final adm a;
    private final cq.a b;
    private final cq c;
    private final cq d;
    private int e = 0;
    private cj f;
    private int g;
    private int h;

    public aip.a(adm adm2, cj cj2, cq.a a2) {
        this.a = adm2;
        this.b = a2;
        if (a2 == cq.a.a) {
            this.d = cq.f;
            this.c = cq.e;
        } else {
            this.d = cq.c;
            this.c = cq.d;
        }
        cj cj3 = cj2;
        while (cj2.o() > cj3.o() - 21 && cj2.o() > 0 && this.a(adm2.p(cj2.b()).c())) {
            cj2 = cj2.b();
        }
        int \u26032 = this.a(cj2, this.d) - 1;
        if (\u26032 >= 0) {
            this.f = cj2.a(this.d, \u26032);
            this.h = this.a(this.f, this.c);
            if (this.h < 2 || this.h > 21) {
                this.f = null;
                this.h = 0;
            }
        }
        if (this.f != null) {
            this.g = this.c();
        }
    }

    protected int a(cj cj22, cq cq2) {
        cj cj22;
        for (int i = 0; i < 22 && this.a(this.a.p((cj)(\u26032 = cj22.a(cq2, i))).c()) && this.a.p(((cj)\u26032).b()).c() == afi.Z; ++i) {
        }
        Object \u26032 = this.a.p(cj22.a(cq2, i)).c();
        if (\u26032 == afi.Z) {
            return i;
        }
        return 0;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    protected int c() {
        int n;
        this.g = 0;
        block0: while (this.g < 21) {
            for (n = 0; n < this.h; ++n) {
                cj cj2 = this.f.a(this.c, n).b(this.g);
                afh \u26032 = this.a.p(cj2).c();
                if (!this.a(\u26032)) break block0;
                if (\u26032 == afi.aY) {
                    ++this.e;
                }
                if (n == 0 ? (\u26032 = this.a.p(cj2.a(this.d)).c()) != afi.Z : n == this.h - 1 && (\u26032 = this.a.p(cj2.a(this.c)).c()) != afi.Z) break block0;
            }
            ++this.g;
        }
        for (n = 0; n < this.h; ++n) {
            if (this.a.p(this.f.a(this.c, n).b(this.g)).c() == afi.Z) continue;
            this.g = 0;
            break;
        }
        if (this.g > 21 || this.g < 3) {
            this.f = null;
            this.h = 0;
            this.g = 0;
            return 0;
        }
        return this.g;
    }

    protected boolean a(afh afh2) {
        return afh2.J == arm.a || afh2 == afi.ab || afh2 == afi.aY;
    }

    public boolean d() {
        return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
    }

    public void e() {
        for (int i = 0; i < this.h; ++i) {
            cj cj2 = this.f.a(this.c, i);
            for (int j = 0; j < this.g; ++j) {
                this.a.a(cj2.b(j), afi.aY.Q().a(a, this.b), 2);
            }
        }
    }

    static /* synthetic */ int a(aip.a a2) {
        return a2.e;
    }

    static /* synthetic */ int b(aip.a a2) {
        return a2.h;
    }

    static /* synthetic */ int c(aip.a a2) {
        return a2.g;
    }

    static /* synthetic */ cq d(aip.a a2) {
        return a2.c;
    }

    static /* synthetic */ cj e(aip.a a2) {
        return a2.f;
    }
}
