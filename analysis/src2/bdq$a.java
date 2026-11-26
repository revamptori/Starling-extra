/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public static class bdq.a
extends beb {
    protected bdq.a(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
        this.g = 4;
    }

    @Override
    public void a(bfd bfd2, pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        \u2603 = 0.25f;
        \u2603 = 0.5f;
        \u2603 = 0.125f;
        \u2603 = 0.375f;
        \u2603 = 7.1f * ns.a(((float)this.f + f - 1.0f) * 0.25f * (float)Math.PI);
        this.au = 0.6f - ((float)this.f + f - 1.0f) * 0.25f * 0.5f;
        \u2603 = (float)(this.p + (this.s - this.p) * (double)f - aw);
        \u2603 = (float)(this.q + (this.t - this.q) * (double)f - ax);
        \u2603 = (float)(this.r + (this.u - this.r) * (double)f - ay);
        int n2 = this.b(f);
        \u2603 = n2 >> 16 & 0xFFFF;
        \u2603 = n2 & 0xFFFF;
        bfd2.b((double)(\u2603 - f2 * \u2603 - f5 * \u2603), (double)(\u2603 - f3 * \u2603), (double)(\u2603 - f4 * \u2603 - f6 * \u2603)).a(0.5, 0.375).a(this.ar, this.as, this.at, this.au).a(\u2603, \u2603).d();
        bfd2.b((double)(\u2603 - f2 * \u2603 + f5 * \u2603), (double)(\u2603 + f3 * \u2603), (double)(\u2603 - f4 * \u2603 + f6 * \u2603)).a(0.5, 0.125).a(this.ar, this.as, this.at, this.au).a(\u2603, \u2603).d();
        bfd2.b((double)(\u2603 + f2 * \u2603 + f5 * \u2603), (double)(\u2603 + f3 * \u2603), (double)(\u2603 + f4 * \u2603 + f6 * \u2603)).a(0.25, 0.125).a(this.ar, this.as, this.at, this.au).a(\u2603, \u2603).d();
        bfd2.b((double)(\u2603 + f2 * \u2603 - f5 * \u2603), (double)(\u2603 - f3 * \u2603), (double)(\u2603 + f4 * \u2603 - f6 * \u2603)).a(0.25, 0.375).a(this.ar, this.as, this.at, this.au).a(\u2603, \u2603).d();
    }
}
