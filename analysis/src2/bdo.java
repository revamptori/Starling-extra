/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bdo
extends beb {
    private float a;
    private double az;
    private double aA;
    private double aB;

    protected bdo(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2, d, d2, d3, d4, d5, d6);
        this.v = d4;
        this.w = d5;
        this.x = d6;
        this.az = d;
        this.aA = d2;
        this.aB = d3;
        this.s = this.p = d + d4;
        this.t = this.q = d2 + d5;
        this.u = this.r = d3 + d6;
        float f = this.V.nextFloat() * 0.6f + 0.4f;
        this.a = this.h = this.V.nextFloat() * 0.5f + 0.2f;
        this.as = this.at = 1.0f * f;
        this.ar = this.at;
        this.as *= 0.9f;
        this.ar *= 0.9f;
        this.g = (int)(Math.random() * 10.0) + 30;
        this.T = true;
        this.k((int)(Math.random() * 26.0 + 1.0 + 224.0));
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
        \u2603 *= \u2603;
        \u2603 *= \u2603;
        return \u2603 * (1.0f - \u2603) + \u2603;
    }

    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        float f = (float)this.f / (float)this.g;
        f = 1.0f - f;
        \u2603 = 1.0f - f;
        \u2603 *= \u2603;
        \u2603 *= \u2603;
        this.s = this.az + this.v * (double)f;
        this.t = this.aA + this.w * (double)f - (double)(\u2603 * 1.2f);
        this.u = this.aB + this.x * (double)f;
        if (this.f++ >= this.g) {
            this.J();
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bdo(adm2, d, d2, d3, d4, d5, d6);
        }
    }
}
