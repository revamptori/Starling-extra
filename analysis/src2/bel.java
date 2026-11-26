/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bel
extends beb {
    protected bel(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2, d, d2 - 0.125, d3, d4, d5, d6);
        this.ar = 0.4f;
        this.as = 0.4f;
        this.at = 0.7f;
        this.k(0);
        this.a(0.01f, 0.01f);
        this.h *= this.V.nextFloat() * 0.6f + 0.2f;
        this.v = d4 * 0.0;
        this.w = d5 * 0.0;
        this.x = d6 * 0.0;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.d(this.v, this.w, this.x);
        if (this.o.p(new cj(this)).c().t() != arm.h) {
            this.J();
        }
        if (this.g-- <= 0) {
            this.J();
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bel(adm2, d, d2, d3, d4, d5, d6);
        }
    }
}
