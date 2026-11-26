/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

static class ayu.a
extends xi {
    public List<zx> a = Lists.newArrayList();

    public ayu.a(wn wn2) {
        int n;
        wm wm2 = wn2.bi;
        for (n = 0; n < 5; ++n) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                this.a(new yg(v, n * 9 + \u2603, 9 + \u2603 * 18, 18 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.a(new yg(wm2, n, 9 + n * 18, 112));
        }
        this.a(0.0f);
    }

    @Override
    public boolean a(wn wn2) {
        return true;
    }

    public void a(float f) {
        int n = (this.a.size() + 9 - 1) / 9 - 5;
        \u2603 = (int)((double)(f * (float)n) + 0.5);
        if (\u2603 < 0) {
            \u2603 = 0;
        }
        for (\u2603 = 0; \u2603 < 5; ++\u2603) {
            for (\u2603 = 0; \u2603 < 9; ++\u2603) {
                \u2603 = \u2603 + (\u2603 + \u2603) * 9;
                if (\u2603 >= 0 && \u2603 < this.a.size()) {
                    v.a(\u2603 + \u2603 * 9, (zx)this.a.get(\u2603));
                    continue;
                }
                v.a(\u2603 + \u2603 * 9, null);
            }
        }
    }

    public boolean e() {
        return this.a.size() > 45;
    }

    @Override
    protected void a(int n, int n2, boolean bl, wn wn2) {
    }

    @Override
    public zx b(wn wn2, int n) {
        if (n >= this.c.size() - 9 && n < this.c.size() && (\u2603 = (yg)this.c.get(n)) != null && \u2603.e()) {
            \u2603.d(null);
        }
        return null;
    }

    @Override
    public boolean a(zx zx2, yg yg2) {
        return yg2.g > 90;
    }

    @Override
    public boolean b(yg yg2) {
        return yg2.d instanceof wm || yg2.g > 90 && yg2.f <= 162;
    }
}
