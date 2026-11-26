/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bcf
extends bbo {
    bct a;
    bct[] b = new bct[8];

    public bcf() {
        int n = -16;
        this.a = new bct(this, 0, 0);
        this.a.a(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.a.d += (float)(24 + n);
        for (\u2603 = 0; \u2603 < this.b.length; ++\u2603) {
            this.b[\u2603] = new bct(this, 48, 0);
            double d = (double)\u2603 * Math.PI * 2.0 / (double)this.b.length;
            float \u26032 = (float)Math.cos((double)d) * 5.0f;
            float \u26033 = (float)Math.sin((double)d) * 5.0f;
            this.b[\u2603].a(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.b[\u2603].c = \u26032;
            this.b[\u2603].e = \u26033;
            this.b[\u2603].d = 31 + n;
            d = (double)\u2603 * Math.PI * -2.0 / (double)this.b.length + 1.5707963267948966;
            this.b[\u2603].g = (float)d;
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        for (bct bct2 : this.b) {
            bct2.f = f3;
        }
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i].a(f6);
        }
    }
}
