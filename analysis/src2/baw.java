/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class baw
extends bbo {
    private bct[] a = new bct[12];
    private bct b;

    public baw() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = new bct(this, 0, 16);
            this.a[i].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.b = new bct(this, 0, 0);
        this.b.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.b.a(f6);
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].a(f6);
        }
    }

    @Override
    public void a(float f, float f2, float f32, float f42, float f5, float f6, pk pk2) {
        float f42;
        float f32;
        int n;
        float f7 = f32 * (float)Math.PI * -0.1f;
        for (n = 0; n < 4; ++n) {
            this.a[n].d = -2.0f + ns.b(((float)(n * 2) + f32) * 0.25f);
            this.a[n].c = ns.b(f7) * 9.0f;
            this.a[n].e = ns.a(f7) * 9.0f;
            f7 += 1.5707964f;
        }
        f7 = 0.7853982f + f32 * (float)Math.PI * 0.03f;
        for (n = 4; n < 8; ++n) {
            this.a[n].d = 2.0f + ns.b(((float)(n * 2) + f32) * 0.25f);
            this.a[n].c = ns.b(f7) * 7.0f;
            this.a[n].e = ns.a(f7) * 7.0f;
            f7 += 1.5707964f;
        }
        f7 = 0.47123894f + f32 * (float)Math.PI * -0.05f;
        for (n = 8; n < 12; ++n) {
            this.a[n].d = 11.0f + ns.b(((float)n * 1.5f + f32) * 0.5f);
            this.a[n].c = ns.b(f7) * 5.0f;
            this.a[n].e = ns.a(f7) * 5.0f;
            f7 += 1.5707964f;
        }
        this.b.g = f42 / 57.295776f;
        this.b.f = f5 / 57.295776f;
    }
}
