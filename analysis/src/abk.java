/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class abk
implements abs {
    @Override
    public boolean a(xp xp2, adm adm2) {
        int n = 0;
        zx \u26032 = null;
        for (\u2603 = 0; \u2603 < xp2.o_(); ++\u2603) {
            zx zx2 = xp2.a(\u2603);
            if (zx2 == null) continue;
            if (zx2.b() == zy.bN) {
                if (\u26032 != null) {
                    return false;
                }
                \u26032 = zx2;
                continue;
            }
            if (zx2.b() == zy.bM) {
                ++n;
                continue;
            }
            return false;
        }
        return \u26032 != null && n > 0;
    }

    @Override
    public zx a(xp xp2) {
        int n = 0;
        zx \u26032 = null;
        for (\u2603 = 0; \u2603 < xp2.o_(); ++\u2603) {
            zx zx2 = xp2.a(\u2603);
            if (zx2 == null) continue;
            if (zx2.b() == zy.bN) {
                if (\u26032 != null) {
                    return null;
                }
                \u26032 = zx2;
                continue;
            }
            if (zx2.b() == zy.bM) {
                ++n;
                continue;
            }
            return null;
        }
        if (\u26032 == null || n < 1 || abd.h(\u26032) >= 2) {
            return null;
        }
        zx \u26033 = new zx(zy.bN, n);
        \u26033.d((dn)\u26032.o().b());
        \u26033.o().a("generation", abd.h(\u26032) + 1);
        if (\u26032.s()) {
            \u26033.c(\u26032.q());
        }
        return \u26033;
    }

    @Override
    public int a() {
        return 9;
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
            if (zx2 == null || !(zx2.b() instanceof abd)) continue;
            zxArray[i] = zx2;
            break;
        }
        return zxArray;
    }
}
