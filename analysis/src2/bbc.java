/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbc
extends bbo {
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;

    public bbc() {
        this(0.0f);
    }

    public bbc(float f) {
        int n = 6;
        this.a = new bct(this, 0, 0);
        this.a.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        this.a.a(0.0f, n, 0.0f);
        this.b = new bct(this, 32, 0);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        this.b.a(0.0f, n, 0.0f);
        this.c = new bct(this, 16, 16);
        this.c.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        this.c.a(0.0f, n, 0.0f);
        this.d = new bct(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.d.a(-2.0f, 12 + n, 4.0f);
        this.e = new bct(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.e.a(2.0f, 12 + n, 4.0f);
        this.f = new bct(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.f.a(-2.0f, 12 + n, -4.0f);
        this.g = new bct(this, 0, 16);
        this.g.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.g.a(2.0f, 12 + n, -4.0f);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
        this.c.a(f6);
        this.d.a(f6);
        this.e.a(f6);
        this.f.a(f6);
        this.g.a(f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        this.a.g = f4 / 57.295776f;
        this.a.f = f5 / 57.295776f;
        this.d.f = ns.b(f * 0.6662f) * 1.4f * f2;
        this.e.f = ns.b(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.f.f = ns.b(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.g.f = ns.b(f * 0.6662f) * 1.4f * f2;
    }
}
