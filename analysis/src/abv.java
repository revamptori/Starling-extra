/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 */
public class abv
implements abs {
    private final int a;
    private final int b;
    private final zx[] c;
    private final zx d;
    private boolean e;

    public abv(int n, int n2, zx[] zxArray, zx zx2) {
        this.a = n;
        this.b = n2;
        this.c = zxArray;
        this.d = zx2;
    }

    @Override
    public zx b() {
        return this.d;
    }

    @Override
    public zx[] b(xp xp2) {
        zx[] zxArray = new zx[xp2.o_()];
        for (int i = 0; i < zxArray.length; ++i) {
            zx zx2 = xp2.a(i);
            if (zx2 == null || !zx2.b().r()) continue;
            zxArray[i] = new zx(zx2.b().q());
        }
        return zxArray;
    }

    @Override
    public boolean a(xp xp2, adm adm2) {
        for (int i = 0; i <= 3 - this.a; ++i) {
            for (\u2603 = 0; \u2603 <= 3 - this.b; ++\u2603) {
                if (this.a(xp2, i, \u2603, true)) {
                    return true;
                }
                if (!this.a(xp2, i, \u2603, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(xp xp2, int n, int n2, boolean bl) {
        for (int i = 0; i < 3; ++i) {
            for (\u2603 = 0; \u2603 < 3; ++\u2603) {
                \u2603 = i - n;
                \u2603 = \u2603 - n2;
                zx zx2 = null;
                if (\u2603 >= 0 && \u2603 >= 0 && \u2603 < this.a && \u2603 < this.b) {
                    zx2 = bl ? this.c[this.a - \u2603 - 1 + \u2603 * this.a] : this.c[\u2603 + \u2603 * this.a];
                }
                if ((\u2603 = xp2.c(i, \u2603)) == null && zx2 == null) continue;
                if (\u2603 == null && zx2 != null || \u2603 != null && zx2 == null) {
                    return false;
                }
                if (zx2.b() != \u2603.b()) {
                    return false;
                }
                if (zx2.i() == Short.MAX_VALUE || zx2.i() == \u2603.i()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public zx a(xp xp2) {
        zx zx2 = this.b().k();
        if (this.e) {
            for (int i = 0; i < xp2.o_(); ++i) {
                zx zx3 = xp2.a(i);
                if (zx3 == null || !zx3.n()) continue;
                zx2.d((dn)zx3.o().b());
            }
        }
        return zx2;
    }

    @Override
    public int a() {
        return this.a * this.b;
    }
}
