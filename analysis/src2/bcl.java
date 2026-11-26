/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bcl
extends bbo {
    private bct[] a;
    private bct[] b;

    public bcl(float f) {
        this.t = 64;
        this.u = 64;
        this.a = new bct[3];
        this.a[0] = new bct(this, 0, 16);
        this.a[0].a(-10.0f, 3.9f, -0.5f, 20, 3, 3, f);
        this.a[1] = new bct(this).b(this.t, this.u);
        this.a[1].a(-2.0f, 6.9f, -0.5f);
        this.a[1].a(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3, f);
        this.a[1].a(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2, f);
        this.a[1].a(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2, f);
        this.a[1].a(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2, f);
        this.a[2] = new bct(this, 12, 22);
        this.a[2].a(0.0f, 0.0f, 0.0f, 3, 6, 3, f);
        this.b = new bct[3];
        this.b[0] = new bct(this, 0, 0);
        this.b[0].a(-4.0f, -4.0f, -4.0f, 8, 8, 8, f);
        this.b[1] = new bct(this, 32, 0);
        this.b[1].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f);
        this.b[1].c = -8.0f;
        this.b[1].d = 4.0f;
        this.b[2] = new bct(this, 32, 0);
        this.b[2].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f);
        this.b[2].c = 10.0f;
        this.b[2].d = 4.0f;
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        for (bct bct2 : this.b) {
            bct2.a(f6);
        }
        for (bct bct2 : this.a) {
            bct2.a(f6);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        float f7 = ns.b(f3 * 0.1f);
        this.a[1].f = (0.065f + 0.05f * f7) * (float)Math.PI;
        this.a[2].a(-2.0f, 6.9f + ns.b(this.a[1].f) * 10.0f, -0.5f + ns.a(this.a[1].f) * 10.0f);
        this.a[2].f = (0.265f + 0.1f * f7) * (float)Math.PI;
        this.b[0].g = f4 / 57.295776f;
        this.b[0].f = f5 / 57.295776f;
    }

    @Override
    public void a(pr pr2, float f, float f2, float f3) {
        uk uk2 = (uk)pr2;
        for (int i = 1; i < 3; ++i) {
            this.b[i].g = (uk2.a(i - 1) - pr2.aI) / 57.295776f;
            this.b[i].f = uk2.b(i - 1) / 57.295776f;
        }
    }
}
