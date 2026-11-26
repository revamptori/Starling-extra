/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class wz
extends wy {
    public wz(adm adm2) {
        super(adm2);
    }

    public wz(adm adm2, pr pr2) {
        super(adm2, pr2);
    }

    public wz(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
    }

    @Override
    protected void a(auh auh2) {
        if (auh2.d != null) {
            auh2.d.a(ow.a(this, (pk)this.n()), 0.0f);
        }
        if (!this.o.D && this.V.nextInt(8) == 0) {
            int n2 = 1;
            if (this.V.nextInt(32) == 0) {
                n2 = 4;
            }
            for (\u2603 = 0; \u2603 < n2; ++\u2603) {
                tn tn2 = new tn(this.o);
                tn2.b(-24000);
                tn2.b(this.s, this.t, this.u, this.y, 0.0f);
                this.o.d(tn2);
            }
        }
        double d = 0.08;
        for (int i = 0; i < 8; ++i) {
            this.o.a(cy.K, this.s, this.t, this.u, ((double)this.V.nextFloat() - 0.5) * 0.08, ((double)this.V.nextFloat() - 0.5) * 0.08, ((double)this.V.nextFloat() - 0.5) * 0.08, zw.b(zy.aP));
        }
        if (!this.o.D) {
            this.J();
        }
    }
}
