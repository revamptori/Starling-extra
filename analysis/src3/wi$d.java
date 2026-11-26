/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class wi.d
implements wi.f {
    public zx a;
    public wi.g b;
    public zx c;
    public wi.g d;

    public wi.d(zw zw2, wi.g g2, zw zw3, wi.g g3) {
        this.a = new zx(zw2);
        this.b = g2;
        this.c = new zx(zw3);
        this.d = g3;
    }

    @Override
    public void a(ada ada2, Random random) {
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        \u2603 = 1;
        if (this.d != null) {
            \u2603 = this.d.a(random);
        }
        ada2.add(new acz(new zx(this.a.b(), n, this.a.i()), new zx(zy.bO), new zx(this.c.b(), \u2603, this.c.i())));
    }
}
