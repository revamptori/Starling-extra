/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class aiq
extends afz {
    @Override
    protected zw l() {
        return zy.bS;
    }

    @Override
    protected zw n() {
        return zy.bS;
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, float f, int n) {
        super.a(adm2, cj2, alz2, f, n);
        if (adm2.D) {
            return;
        }
        if (alz2.b(a) >= 7 && adm2.s.nextInt(50) == 0) {
            aiq.a(adm2, cj2, new zx(zy.bU));
        }
    }
}
