/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class vr.d
extends rd {
    private vr a;

    public vr.d(vr vr2) {
        this.a = vr2;
        this.a(1);
    }

    @Override
    public boolean a() {
        qq qq2 = this.a.q();
        if (!qq2.a()) {
            return true;
        }
        double \u26032 = qq2.d() - this.a.s;
        double \u26033 = \u26032 * \u26032 + (\u2603 = qq2.e() - this.a.t) * \u2603 + (\u2603 = qq2.f() - this.a.u) * \u2603;
        return \u26033 < 1.0 || \u26033 > 3600.0;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void c() {
        Random random = this.a.bc();
        double \u26032 = this.a.s + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double \u26033 = this.a.t + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double \u26034 = this.a.u + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.a.q().a(\u26032, \u26033, \u26034, 1.0);
    }
}
