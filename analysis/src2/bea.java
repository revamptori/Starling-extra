/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bea
extends beb {
    float a;

    protected bea(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        this(adm2, d, d2, d3, d4, d5, d6, 2.0f);
    }

    protected bea(adm adm2, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(adm2, d, d2, d3, 0.0, 0.0, 0.0);
        this.v *= (double)0.01f;
        this.w *= (double)0.01f;
        this.x *= (double)0.01f;
        this.w += 0.2;
        this.ar = ns.a(((float)d4 + 0.0f) * (float)Math.PI * 2.0f) * 0.65f + 0.35f;
        this.as = ns.a(((float)d4 + 0.33333334f) * (float)Math.PI * 2.0f) * 0.65f + 0.35f;
        this.at = ns.a(((float)d4 + 0.6666667f) * (float)Math.PI * 2.0f) * 0.65f + 0.35f;
        this.h *= 0.75f;
        this.h *= f;
        this.a = this.h;
        this.g = 6;
        this.T = false;
        this.k(64);
    }

    @Override
    public void a(bfd bfd2, pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        \u2603 = ((float)this.f + f) / (float)this.g * 32.0f;
        \u2603 = ns.a(\u2603, 0.0f, 1.0f);
        this.h = this.a * \u2603;
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
        this.d(this.v, this.w, this.x);
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= (double)0.66f;
        this.w *= (double)0.66f;
        this.x *= (double)0.66f;
        if (this.C) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bea(adm2, d, d2, d3, d4, d5, d6);
        }
    }
}
