/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class xr
extends xi {
    private og a;

    public xr(og og2, og og3) {
        int n;
        this.a = og3;
        for (n = 0; n < 3; ++n) {
            for (\u2603 = 0; \u2603 < 3; ++\u2603) {
                this.a(new yg(og3, \u2603 + n * 3, 62 + \u2603 * 18, 17 + n * 18));
            }
        }
        for (n = 0; n < 3; ++n) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                this.a(new yg(og2, \u2603 + n * 9 + 9, 8 + \u2603 * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.a(new yg(og2, n, 8 + n * 18, 142));
        }
    }

    @Override
    public boolean a(wn wn2) {
        return this.a.a(wn2);
    }

    @Override
    public zx b(wn wn2, int n2) {
        zx zx2 = null;
        yg \u26032 = (yg)this.c.get(n2);
        if (\u26032 != null && \u26032.e()) {
            \u2603 = \u26032.d();
            zx2 = \u2603.k();
            if (n2 < 9 ? !this.a(\u2603, 9, 45, true) : !this.a(\u2603, 0, 9, false)) {
                return null;
            }
            if (\u2603.b == 0) {
                \u26032.d(null);
            } else {
                \u26032.f();
            }
            if (\u2603.b == zx2.b) {
                return null;
            }
            \u26032.a(wn2, \u2603);
        }
        return zx2;
    }
}
