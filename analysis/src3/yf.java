/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class yf
extends yg {
    private final xp a;
    private final wn b;
    private int c;

    public yf(wn wn2, xp xp2, og og2, int n, int n2, int n3) {
        super(og2, n, n2, n3);
        this.b = wn2;
        this.a = xp2;
    }

    @Override
    public boolean a(zx zx2) {
        return false;
    }

    @Override
    public zx a(int n) {
        if (this.e()) {
            this.c += Math.min((int)n, (int)this.d().b);
        }
        return super.a(n);
    }

    @Override
    protected void a(zx zx2, int n) {
        this.c += n;
        this.c(zx2);
    }

    @Override
    protected void c(zx zx2) {
        if (this.c > 0) {
            zx2.a(this.b.o, this.b, this.c);
        }
        this.c = 0;
        if (zx2.b() == zw.a(afi.ai)) {
            this.b.b(mr.h);
        }
        if (zx2.b() instanceof aag) {
            this.b.b(mr.i);
        }
        if (zx2.b() == zw.a(afi.al)) {
            this.b.b(mr.j);
        }
        if (zx2.b() instanceof zv) {
            this.b.b(mr.l);
        }
        if (zx2.b() == zy.P) {
            this.b.b(mr.m);
        }
        if (zx2.b() == zy.aZ) {
            this.b.b(mr.n);
        }
        if (zx2.b() instanceof aag && ((aag)zx2.b()).g() != zw.a.a) {
            this.b.b(mr.o);
        }
        if (zx2.b() instanceof aay) {
            this.b.b(mr.r);
        }
        if (zx2.b() == zw.a(afi.bC)) {
            this.b.b(mr.E);
        }
        if (zx2.b() == zw.a(afi.X)) {
            this.b.b(mr.G);
        }
        if (zx2.b() == zy.ao && zx2.i() == 1) {
            this.b.b(mr.M);
        }
    }

    @Override
    public void a(wn wn2, zx zx2) {
        this.c(zx2);
        zx[] zxArray = abt.a().b(this.a, wn2.o);
        for (int i = 0; i < zxArray.length; ++i) {
            zx zx3 = this.a.a(i);
            \u2603 = zxArray[i];
            if (zx3 != null) {
                this.a.a(i, 1);
            }
            if (\u2603 == null) continue;
            if (this.a.a(i) == null) {
                this.a.a(i, \u2603);
                continue;
            }
            if (this.b.bi.a(\u2603)) continue;
            this.b.a(\u2603, false);
        }
    }
}
