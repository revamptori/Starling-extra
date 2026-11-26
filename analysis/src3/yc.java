/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class yc
extends yg {
    private final ya a;
    private wn b;
    private int c;
    private final acy h;

    public yc(wn wn2, acy acy2, ya ya2, int n, int n2, int n3) {
        super(ya2, n, n2, n3);
        this.b = wn2;
        this.h = acy2;
        this.a = ya2;
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
        zx2.a(this.b.o, this.b, this.c);
        this.c = 0;
    }

    @Override
    public void a(wn wn2, zx zx2) {
        this.c(zx2);
        acz acz2 = this.a.i();
        if (acz2 != null && (this.a(acz2, zx4 = this.a.a(0), zx3 = this.a.a(1)) || this.a(acz2, zx3, zx4))) {
            zx zx3;
            this.h.a(acz2);
            wn2.b(na.G);
            if (zx4 != null && zx4.b <= 0) {
                zx zx4 = null;
            }
            if (zx3 != null && zx3.b <= 0) {
                zx3 = null;
            }
            this.a.a(0, zx4);
            this.a.a(1, zx3);
        }
    }

    private boolean a(acz acz2, zx zx2, zx zx3) {
        \u2603 = acz2.a();
        \u2603 = acz2.b();
        if (zx2 != null && zx2.b() == \u2603.b()) {
            if (\u2603 != null && zx3 != null && \u2603.b() == zx3.b()) {
                zx2.b -= \u2603.b;
                zx3.b -= \u2603.b;
                return true;
            }
            if (\u2603 == null && zx3 == null) {
                zx2.b -= \u2603.b;
                return true;
            }
        }
        return false;
    }
}
