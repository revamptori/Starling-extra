/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class xb
extends wy {
    public xb(adm adm2) {
        super(adm2);
    }

    public xb(adm adm2, pr pr2) {
        super(adm2, pr2);
    }

    public xb(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
    }

    @Override
    protected float m() {
        return 0.07f;
    }

    @Override
    protected float j() {
        return 0.7f;
    }

    @Override
    protected float l() {
        return -20.0f;
    }

    @Override
    protected void a(auh auh2) {
        if (!this.o.D) {
            this.o.b(2002, new cj(this), 0);
            for (int i = 3 + this.o.s.nextInt(5) + this.o.s.nextInt(5); i > 0; i -= \u2603) {
                \u2603 = pp.a(i);
                this.o.d(new pp(this.o, this.s, this.t, this.u, \u2603));
            }
            this.J();
        }
    }
}
