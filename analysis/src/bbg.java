/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbg
extends bbo {
    private bct a;
    private bct b;
    private bct[] c;
    private bct[] d;

    public bbg() {
        this.t = 64;
        this.u = 64;
        this.c = new bct[12];
        this.a = new bct(this);
        this.a.a(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.a.a(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.a.a(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.a.a(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.a.a(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i = 0; i < this.c.length; ++i) {
            this.c[i] = new bct(this, 0, 0);
            this.c[i].a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.a.a(this.c[i]);
        }
        this.b = new bct(this, 8, 0);
        this.b.a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.a.a(this.b);
        this.d = new bct[3];
        this.d[0] = new bct(this, 40, 0);
        this.d[0].a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        this.d[1] = new bct(this, 0, 54);
        this.d[1].a(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.d[2] = new bct(this);
        this.d[2].a(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.d[2].a(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.a.a(this.d[0]);
        this.d[0].a(this.d[1]);
        this.d[1].a(this.d[2]);
    }

    public int a() {
        return 54;
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        vt vt2 = (vt)pk2;
        float \u26032 = f3 - (float)vt2.W;
        this.a.g = f4 / 57.295776f;
        this.a.f = f5 / 57.295776f;
        float[] \u26033 = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
        float[] \u26034 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] \u26035 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
        float[] \u26036 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
        float[] \u26037 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        float[] \u26038 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
        float \u26039 = (1.0f - vt2.p(\u26032)) * 0.55f;
        for (int i = 0; i < 12; ++i) {
            this.c[i].f = (float)Math.PI * \u26033[i];
            this.c[i].g = (float)Math.PI * \u26034[i];
            this.c[i].h = (float)Math.PI * \u26035[i];
            this.c[i].c = \u26036[i] * (1.0f + ns.b(f3 * 1.5f + (float)i) * 0.01f - \u26039);
            this.c[i].d = 16.0f + \u26037[i] * (1.0f + ns.b(f3 * 1.5f + (float)i) * 0.01f - \u26039);
            this.c[i].e = \u26038[i] * (1.0f + ns.b(f3 * 1.5f + (float)i) * 0.01f - \u26039);
        }
        this.b.e = -8.25f;
        pk pk3 = ave.A().ac();
        if (vt2.cp()) {
            pk3 = vt2.cq();
        }
        if (pk3 != null) {
            aui aui2 = pk3.e(0.0f);
            \u2603 = pk2.e(0.0f);
            double \u260310 = aui2.b - \u2603.b;
            this.b.d = \u260310 > 0.0 ? 0.0f : 1.0f;
            \u2603 = pk2.d(0.0f);
            \u2603 = new aui(\u2603.a, 0.0, \u2603.c);
            \u2603 = new aui(\u2603.a - aui2.a, 0.0, \u2603.c - aui2.c).a().b(1.5707964f);
            double \u260311 = \u2603.b(\u2603);
            this.b.c = ns.c((float)Math.abs((double)\u260311)) * 2.0f * (float)Math.signum((double)\u260311);
        }
        this.b.j = true;
        float f7 = vt2.a(\u26032);
        this.d[0].g = ns.a(f7) * (float)Math.PI * 0.05f;
        this.d[1].g = ns.a(f7) * (float)Math.PI * 0.1f;
        this.d[1].c = -1.5f;
        this.d[1].d = 0.5f;
        this.d[1].e = 14.0f;
        this.d[2].g = ns.a(f7) * (float)Math.PI * 0.15f;
        this.d[2].c = 0.5f;
        this.d[2].d = 0.5f;
        this.d[2].e = 6.0f;
    }
}
