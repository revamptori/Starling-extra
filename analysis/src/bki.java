/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bki
extends bjo<wd> {
    private static final jy a = new jy("textures/entity/witch.png");

    public bki(biu biu2) {
        super(biu2, new bck(0.0f), 0.5f);
        this.a(new bli(this));
    }

    @Override
    public void a(wd wd2, double d, double d2, double d3, float f, float f2) {
        ((bck)this.f).g = wd2.bA() != null;
        super.a(wd2, d, d2, d3, f, f2);
    }

    @Override
    protected jy a(wd wd2) {
        return a;
    }

    @Override
    public void C_() {
        bfl.b(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected void a(wd wd2, float f2) {
        \u2603 = 0.9375f;
        bfl.a(\u2603, \u2603, \u2603);
    }
}
