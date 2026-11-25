/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class ajn
extends ahj {
    public ajn() {
        super(arm.B, false, arn.c);
        this.a(yz.c);
        this.L = 0.8f;
    }

    @Override
    public adf m() {
        return adf.d;
    }

    @Override
    public void a(adm adm2, cj cj2, pk pk2, float f) {
        if (pk2.av()) {
            super.a(adm2, cj2, pk2, f);
        } else {
            pk2.e(f, 0.0f);
        }
    }

    @Override
    public void a(adm adm2, pk pk2) {
        if (pk2.av()) {
            super.a(adm2, pk2);
        } else if (pk2.w < 0.0) {
            pk2.w = -pk2.w;
        }
    }

    @Override
    public void a(adm adm22, cj cj2, pk pk2) {
        adm adm22;
        if (Math.abs((double)pk2.w) < 0.1 && !pk2.av()) {
            double d = 0.4 + Math.abs((double)pk2.w) * 0.2;
            pk2.v *= d;
            pk2.x *= d;
        }
        super.a(adm22, cj2, pk2);
    }
}
