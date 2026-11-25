/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class wi.e
implements wi.f {
    public zx a;
    public wi.g b;

    public wi.e(zw zw2, wi.g g2) {
        this.a = new zx(zw2);
        this.b = g2;
    }

    public wi.e(zx zx2, wi.g g2) {
        this.a = zx2;
        this.b = g2;
    }

    @Override
    public void a(ada ada2, Random random) {
        zx \u26033;
        zx \u26032;
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        if (n < 0) {
            \u26032 = new zx(zy.bO, 1, 0);
            \u26033 = new zx(this.a.b(), -n, this.a.i());
        } else {
            \u26032 = new zx(zy.bO, n, 0);
            \u26033 = new zx(this.a.b(), 1, this.a.i());
        }
        ada2.add(new acz(\u26032, \u26033));
    }
}
