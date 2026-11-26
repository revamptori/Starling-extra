/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class wi.c
implements wi.f {
    public zx a;
    public wi.g b;

    public wi.c(zw zw2, wi.g g2) {
        this.a = new zx(zw2);
        this.b = g2;
    }

    @Override
    public void a(ada ada2, Random random) {
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        zx \u26032 = new zx(zy.bO, n, 0);
        zx \u26033 = new zx(this.a.b(), 1, this.a.i());
        \u26033 = ack.a(random, \u26033, 5 + random.nextInt(15));
        ada2.add(new acz(\u26032, \u26033));
    }
}
