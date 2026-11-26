/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Date
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

class axv.a
extends awi {
    public axv.a(ave ave2) {
        super(ave2, axv.this.l, axv.this.m, 32, axv.this.m - 64, 36);
    }

    @Override
    protected int b() {
        return axv.this.s.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        axv.this.r = n;
        ((axv)axv.this).z.l = \u2603 = axv.this.r >= 0 && axv.this.r < this.b();
        ((axv)axv.this).y.l = \u2603;
        ((axv)axv.this).A.l = \u2603;
        ((axv)axv.this).B.l = \u2603;
        if (bl && \u2603) {
            axv.this.i(n);
        }
    }

    @Override
    protected boolean a(int n) {
        return n == axv.this.r;
    }

    @Override
    protected int k() {
        return axv.this.s.size() * 36;
    }

    @Override
    protected void a() {
        axv.this.c();
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        ats ats2 = (ats)axv.this.s.get(n);
        String \u26032 = ats2.b();
        if (StringUtils.isEmpty((CharSequence)\u26032)) {
            \u26032 = axv.this.u + " " + (n + 1);
        }
        String \u26033 = ats2.a();
        \u26033 = \u26033 + " (" + axv.this.h.format(new Date(ats2.e()));
        \u26033 = \u26033 + ")";
        String \u26034 = "";
        if (ats2.d()) {
            \u26034 = axv.this.v + " " + \u26034;
        } else {
            \u26034 = axv.this.w[ats2.f().a()];
            if (ats2.g()) {
                \u26034 = (Object)((Object)a.e) + bnq.a("gameMode.hardcore", new Object[0]) + (Object)((Object)a.v);
            }
            if (ats2.h()) {
                \u26034 = \u26034 + ", " + bnq.a("selectWorld.cheats", new Object[0]);
            }
        }
        axv.this.c(axv.this.q, \u26032, n2 + 2, n3 + 1, 0xFFFFFF);
        axv.this.c(axv.this.q, \u26033, n2 + 2, n3 + 12, 0x808080);
        axv.this.c(axv.this.q, \u26034, n2 + 2, n3 + 12 + 10, 0x808080);
    }
}
