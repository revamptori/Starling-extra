/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bby
extends bbo {
    private bct[] a;
    private bct[] b;
    private float[] c = new float[7];
    private static final int[][] d = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] e = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public bby() {
        this.a = new bct[7];
        float f = -3.5f;
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = new bct(this, e[i][0], e[i][1]);
            this.a[i].a((float)d[i][0] * -0.5f, 0.0f, (float)d[i][2] * -0.5f, d[i][0], d[i][1], d[i][2]);
            this.a[i].a(0.0f, 24 - d[i][1], f);
            this.c[i] = f;
            if (i >= this.a.length - 1) continue;
            f += (float)(d[i][2] + d[i + 1][2]) * 0.5f;
        }
        this.b = new bct[3];
        this.b[0] = new bct(this, 20, 0);
        this.b[0].a(-5.0f, 0.0f, (float)d[2][2] * -0.5f, 10, 8, d[2][2]);
        this.b[0].a(0.0f, 16.0f, this.c[2]);
        this.b[1] = new bct(this, 20, 11);
        this.b[1].a(-3.0f, 0.0f, (float)d[4][2] * -0.5f, 6, 4, d[4][2]);
        this.b[1].a(0.0f, 20.0f, this.c[4]);
        this.b[2] = new bct(this, 20, 18);
        this.b[2].a(-3.0f, 0.0f, (float)d[4][2] * -0.5f, 6, 5, d[1][2]);
        this.b[2].a(0.0f, 19.0f, this.c[1]);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        int n;
        this.a(f, f2, f3, f4, f5, f6, pk2);
        for (n = 0; n < this.a.length; ++n) {
            this.a[n].a(f6);
        }
        for (n = 0; n < this.b.length; ++n) {
            this.b[n].a(f6);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].g = ns.b(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs((int)(i - 2)));
            this.a[i].c = ns.a(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs((int)(i - 2));
        }
        this.b[0].g = this.a[2].g;
        this.b[1].g = this.a[4].g;
        this.b[1].c = this.a[4].c;
        this.b[2].g = this.a[1].g;
        this.b[2].c = this.a[1].c;
    }
}
