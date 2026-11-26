/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbe
extends bbo {
    private static final int[][] a = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] b = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private static final int c = a.length;
    private final bct[] d = new bct[c];

    public bbe() {
        float f = -3.5f;
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i] = new bct(this, b[i][0], b[i][1]);
            this.d[i].a((float)a[i][0] * -0.5f, 0.0f, (float)a[i][2] * -0.5f, a[i][0], a[i][1], a[i][2]);
            this.d[i].a(0.0f, 24 - a[i][1], f);
            if (i >= this.d.length - 1) continue;
            f += (float)(a[i][2] + a[i + 1][2]) * 0.5f;
        }
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i].a(f6);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i].g = ns.b(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs((int)(i - 2)));
            this.d[i].c = ns.a(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs((int)(i - 2));
        }
    }
}
