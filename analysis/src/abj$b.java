/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class abj.b
implements abs {
    private abj.b() {
    }

    @Override
    public boolean a(xp xp2, adm adm2) {
        zx zx2 = null;
        \u2603 = null;
        for (int i = 0; i < xp2.o_(); ++i) {
            zx zx3 = xp2.a(i);
            if (zx3 == null) continue;
            if (zx3.b() != zy.cE) {
                return false;
            }
            if (zx2 != null && \u2603 != null) {
                return false;
            }
            int \u26032 = aku.b(zx3);
            boolean bl = \u2603 = aku.c(zx3) > 0;
            if (zx2 != null) {
                if (\u2603) {
                    return false;
                }
                if (\u26032 != aku.b(zx2)) {
                    return false;
                }
                \u2603 = zx3;
                continue;
            }
            if (\u2603 != null) {
                if (!\u2603) {
                    return false;
                }
                if (\u26032 != aku.b(\u2603)) {
                    return false;
                }
                zx2 = zx3;
                continue;
            }
            if (\u2603) {
                zx2 = zx3;
                continue;
            }
            \u2603 = zx3;
        }
        return zx2 != null && \u2603 != null;
    }

    @Override
    public zx a(xp xp2) {
        for (int i = 0; i < xp2.o_(); ++i) {
            zx zx2 = xp2.a(i);
            if (zx2 == null || aku.c(zx2) <= 0) continue;
            \u2603 = zx2.k();
            \u2603.b = 1;
            return \u2603;
        }
        return null;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public zx b() {
        return null;
    }

    @Override
    public zx[] b(xp xp2) {
        zx[] zxArray = new zx[xp2.o_()];
        for (int i = 0; i < zxArray.length; ++i) {
            zx zx2 = xp2.a(i);
            if (zx2 == null) continue;
            if (zx2.b().r()) {
                zxArray[i] = new zx(zx2.b().q());
                continue;
            }
            if (!zx2.n() || aku.c(zx2) <= 0) continue;
            zxArray[i] = zx2.k();
            zxArray[i].b = 1;
        }
        return zxArray;
    }
}
