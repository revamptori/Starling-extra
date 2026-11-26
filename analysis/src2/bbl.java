/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbl
extends bbo {
    bct[] a = new bct[8];
    bct b;

    public bbl() {
        for (int i = 0; i < this.a.length; ++i) {
            \u2603 = 0;
            \u2603 = i;
            if (i == 2) {
                \u2603 = 24;
                \u2603 = 10;
            } else if (i == 3) {
                \u2603 = 24;
                \u2603 = 19;
            }
            this.a[i] = new bct(this, \u2603, \u2603);
            this.a[i].a(-4.0f, 16 + i, -4.0f, 8, 1, 8);
        }
        this.b = new bct(this, 0, 16);
        this.b.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void a(pr pr2, float f, float f2, float f3) {
        vu vu2 = (vu)pr2;
        float \u26032 = vu2.c + (vu2.b - vu2.c) * f3;
        if (\u26032 < 0.0f) {
            \u26032 = 0.0f;
        }
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].d = (float)(-(4 - i)) * \u26032 * 1.7f;
        }
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.b.a(f6);
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].a(f6);
        }
    }
}
