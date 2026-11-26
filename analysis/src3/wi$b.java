/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class wi.b
implements wi.f {
    @Override
    public void a(ada ada2, Random random) {
        aci aci2 = aci.b[random.nextInt(aci.b.length)];
        int \u26032 = ns.a(random, aci2.e(), aci2.b());
        zx \u26033 = zy.cd.a(new acl(aci2, \u26032));
        int \u26034 = 2 + random.nextInt(5 + \u26032 * 10) + 3 * \u26032;
        if (\u26034 > 64) {
            \u26034 = 64;
        }
        ada2.add(new acz(new zx(zy.aL), new zx(zy.bO, \u26034), \u26033));
    }
}
