/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class wi.a
implements wi.f {
    public zw a;
    public wi.g b;

    public wi.a(zw zw2, wi.g g2) {
        this.a = zw2;
        this.b = g2;
    }

    @Override
    public void a(ada ada2, Random random) {
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        ada2.add(new acz(new zx(this.a, n, 0), zy.bO));
    }
}
