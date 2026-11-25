/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class adz.a {
    public float[] a = new float[256];
    public ady[] b = new ady[256];
    public int c;
    public int d;
    public long e;

    public adz.a(int n, int n2) {
        this.c = n;
        this.d = n2;
        adz.this.a.a(this.a, n << 4, n2 << 4, 16, 16);
        adz.this.a.a(this.b, n << 4, n2 << 4, 16, 16, false);
    }

    public ady a(int n, int n2) {
        return this.b[n & 0xF | (n2 & 0xF) << 4];
    }
}
