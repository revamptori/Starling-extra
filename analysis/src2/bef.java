/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bef
extends beb {
    private float a;
    private double az;
    private double aA;
    private double aB;

    protected bef(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2, d, d2, d3, d4, d5, d6);
        this.v = d4;
        this.w = d5;
        this.x = d6;
        this.az = this.s = d;
        this.aA = this.t = d2;
        this.aB = this.u = d3;
        float f = this.V.nextFloat() * 0.6f + 0.4f;
        this.a = this.h = this.V.nextFloat() * 0.2f + 0.5f;
        this.as = this.at = 1.0f * f;
        this.ar = this.at;
        this.as *= 0.3f;
        this.ar *= 0.9f;
        this.g = (int)(Math.random() * 10.0) + 40;
        this.T = true;
        this.k((int)(Math.random() * 8.0));
    }

    @Override
    public void a(bfd bfd2, pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        \u2603 = ((float)this.f + f) / (float)this.g;
        \u2603 = 1.0f - \u2603;
        \u2603 *= \u2603;
        \u2603 = 1.0f - \u2603;
        this.h = this.a * \u2603;
        super.a(bfd2, pk2, f, f2, f3, f4, f5, f6);
    }

    @Override
    public int b(float f) {
        int n2 = super.b(f);
        float \u26032 = (float)this.f / (float)this.g;
        \u26032 *= \u26032;
        \u26032 *= \u26032;
        \u2603 = n2 & 0xFF;
        \u2603 = n2 >> 16 & 0xFF;
        if ((\u2603 += (int)(\u26032 * 15.0f * 16.0f)) > 240) {
            \u2603 = 240;
        }
        return \u2603 | \u2603 << 16;
    }

    @Override
    public float c(float f) {
        \u2603 = super.c(f);
        \u2603 = (float)this.f / (float)this.g;
        \u2603 = \u2603 * \u2603 * \u2603 * \u2603;
        return \u2603 * (1.0f - \u2603) + \u2603;
    }

    @Override
    public void t_() {
        float f;
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        \u2603 = f = (float)this.f / (float)this.g;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.s = this.az + this.v * (double)f;
        this.t = this.aA + this.w * (double)f + (double)(1.0f - \u2603);
        this.u = this.aB + this.x * (double)f;
        if (this.f++ >= this.g) {
            this.J();
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bef(adm2, d, d2, d3, d4, d5, d6);
        }
    }
}
