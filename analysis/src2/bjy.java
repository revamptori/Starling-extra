/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bjy
extends bjo<wb> {
    private static final jy a = new jy("textures/entity/slime/slime.png");

    public bjy(biu biu2, bbo bbo2, float f) {
        super(biu2, bbo2, f);
        this.a(new bld(this));
    }

    @Override
    public void a(wb wb2, double d2, double d3, double d4, float f, float f2) {
        this.c = 0.25f * (float)wb2.cm();
        super.a(wb2, d2, d3, d4, f, f2);
    }

    @Override
    protected void a(wb wb2, float f2) {
        \u2603 = wb2.cm();
        \u2603 = (wb2.c + (wb2.b - wb2.c) * f2) / (\u2603 * 0.5f + 1.0f);
        \u2603 = 1.0f / (\u2603 + 1.0f);
        bfl.a(\u2603 * \u2603, 1.0f / \u2603 * \u2603, \u2603 * \u2603);
    }

    @Override
    protected jy a(wb wb2) {
        return a;
    }
}
