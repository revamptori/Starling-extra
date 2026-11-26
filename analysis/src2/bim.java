/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bim
extends bjo<tn> {
    private static final jy a = new jy("textures/entity/chicken.png");

    public bim(biu biu2, bbo bbo2, float f) {
        super(biu2, bbo2, f);
    }

    @Override
    protected jy a(tn tn2) {
        return a;
    }

    protected float a(tn tn2, float f) {
        \u2603 = tn2.bq + (tn2.bm - tn2.bq) * f;
        \u2603 = tn2.bp + (tn2.bo - tn2.bp) * f;
        return (ns.a(\u2603) + 1.0f) * \u2603;
    }

    @Override
    protected /* synthetic */ float b(pr pr2, float f) {
        return this.a((tn)pr2, f);
    }
}
