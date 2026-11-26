/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public static class bdq.b
extends beb {
    private int a = 160;
    private boolean az;
    private boolean aA;
    private final bec aB;
    private float aC;
    private float aD;
    private float aE;
    private boolean aF;

    public bdq.b(adm adm2, double d, double d2, double d3, double d4, double d5, double d6, bec bec2) {
        super(adm2, d, d2, d3);
        this.v = d4;
        this.w = d5;
        this.x = d6;
        this.aB = bec2;
        this.h *= 0.75f;
        this.g = 48 + this.V.nextInt(12);
        this.T = false;
    }

    public void a(boolean bl) {
        this.az = bl;
    }

    public void i(boolean bl) {
        this.aA = bl;
    }

    public void a(int n2) {
        float f = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        \u2603 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        \u2603 = (float)((n2 & 0xFF) >> 0) / 255.0f;
        \u2603 = 1.0f;
        this.b(f * \u2603, \u2603 * \u2603, \u2603 * \u2603);
    }

    public void b(int n2) {
        this.aC = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
        this.aD = (float)((n2 & 0xFF00) >> 8) / 255.0f;
        this.aE = (float)((n2 & 0xFF) >> 0) / 255.0f;
        this.aF = true;
    }

    @Override
    public aug S() {
        return null;
    }

    @Override
    public boolean ae() {
        return false;
    }

    @Override
    public void a(bfd bfd2, pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!this.aA || this.f < this.g / 3 || (this.f + this.g) / 3 % 2 == 0) {
            super.a(bfd2, pk2, f, f2, f3, f4, f5, f6);
        }
    }

    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        if (this.f > this.g / 2) {
            this.i(1.0f - ((float)this.f - (float)(this.g / 2)) / (float)this.g);
            if (this.aF) {
                this.ar += (this.aC - this.ar) * 0.2f;
                this.as += (this.aD - this.as) * 0.2f;
                this.at += (this.aE - this.at) * 0.2f;
            }
        }
        this.k(this.a + (7 - this.f * 8 / this.g));
        this.w -= 0.004;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.91f;
        this.w *= (double)0.91f;
        this.x *= (double)0.91f;
        if (this.C) {
            this.v *= (double)0.7f;
            this.x *= (double)0.7f;
        }
        if (this.az && this.f < this.g / 2 && (this.f + this.g) % 2 == 0) {
            bdq.b b2 = new bdq.b(this.o, this.s, this.t, this.u, 0.0, 0.0, 0.0, this.aB);
            b2.i(0.99f);
            b2.b(this.ar, this.as, this.at);
            b2.f = b2.g / 2;
            if (this.aF) {
                b2.aF = true;
                b2.aC = this.aC;
                b2.aD = this.aD;
                b2.aE = this.aE;
            }
            b2.aA = this.aA;
            this.aB.a(b2);
        }
    }

    @Override
    public int b(float f) {
        return 0xF000F0;
    }

    @Override
    public float c(float f) {
        return 1.0f;
    }
}
