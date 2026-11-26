/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static final class kb.15
extends cn {
    kb.15() {
    }

    @Override
    public zx b(ck ck2, zx zx2) {
        cq cq2 = agg.b(ck2.f());
        cz \u26032 = agg.a(ck2);
        double \u26033 = \u26032.a() + (double)((float)cq2.g() * 0.3f);
        double \u26034 = \u26032.b() + (double)((float)cq2.h() * 0.3f);
        double \u26035 = \u26032.c() + (double)((float)cq2.i() * 0.3f);
        adm \u26036 = ck2.i();
        Random \u26037 = \u26036.s;
        double \u26038 = \u26037.nextGaussian() * 0.05 + (double)cq2.g();
        double \u26039 = \u26037.nextGaussian() * 0.05 + (double)cq2.h();
        double \u260310 = \u26037.nextGaussian() * 0.05 + (double)cq2.i();
        \u26036.d(new ww(\u26036, \u26033, \u26034, \u26035, \u26038, \u26039, \u260310));
        zx2.a(1);
        return zx2;
    }

    @Override
    protected void a(ck ck2) {
        ck2.i().b(1009, ck2.d(), 0);
    }
}
