/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bdy
extends beb {
    private float a;

    protected bdy(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3, 0.0, 0.0, 0.0);
        this.v *= (double)0.8f;
        this.w *= (double)0.8f;
        this.x *= (double)0.8f;
        this.w = this.V.nextFloat() * 0.4f + 0.05f;
        this.at = 1.0f;
        this.as = 1.0f;
        this.ar = 1.0f;
        this.h *= this.V.nextFloat() * 2.0f + 0.2f;
        this.a = this.h;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.T = false;
        this.k(49);
    }

    @Override
    public int b(float f) {
        \u2603 = ((float)this.f + f) / (float)this.g;
        \u2603 = ns.a(\u2603, 0.0f, 1.0f);
        int n2 = super.b(f);
        \u2603 = 240;
        \u2603 = n2 >> 16 & 0xFF;
        return \u2603 | \u2603 << 16;
    }

    @Override
    public float c(float f) {
        return 1.0f;
    }

    @Override
    public void a(bfd bfd2, pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        \u2603 = ((float)this.f + f) / (float)this.g;
        this.h = this.a * (1.0f - \u2603 * \u2603);
        super.a(bfd2, pk2, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        float f = (float)this.f / (float)this.g;
        if (this.V.nextFloat() > f) {
            this.o.a(cy.l, this.s, this.t, this.u, this.v, this.w, this.x, new int[0]);
        }
        this.w -= 0.03;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.999f;
        this.w *= (double)0.999f;
        this.x *= (double)0.999f;
        if (this.C) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bdy(adm2, d, d2, d3);
        }
    }
}
