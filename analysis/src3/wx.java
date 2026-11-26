/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class wx
extends wy {
    public wx(adm adm2) {
        super(adm2);
    }

    public wx(adm adm2, pr pr2) {
        super(adm2, pr2);
    }

    public wx(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
    }

    @Override
    protected void a(auh auh2) {
        int n2;
        if (auh2.d != null) {
            n2 = 0;
            if (auh2.d instanceof vl) {
                n2 = 3;
            }
            auh2.d.a(ow.a(this, (pk)this.n()), (float)n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.o.a(cy.F, this.s, this.t, this.u, 0.0, 0.0, 0.0, new int[0]);
        }
        if (!this.o.D) {
            this.J();
        }
    }
}
