/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bcd
extends bbo {
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;

    public bcd() {
        float f = 4.0f;
        \u2603 = 0.0f;
        this.c = new bct(this, 0, 0).b(64, 64);
        this.c.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603 - 0.5f);
        this.c.a(0.0f, 0.0f + f, 0.0f);
        this.d = new bct(this, 32, 0).b(64, 64);
        this.d.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, \u2603 - 0.5f);
        this.d.a(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.e = new bct(this, 32, 0).b(64, 64);
        this.e.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, \u2603 - 0.5f);
        this.e.a(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.a = new bct(this, 0, 16).b(64, 64);
        this.a.a(-5.0f, -10.0f, -5.0f, 10, 10, 10, \u2603 - 0.5f);
        this.a.a(0.0f, 0.0f + f + 9.0f, 0.0f);
        this.b = new bct(this, 0, 36).b(64, 64);
        this.b.a(-6.0f, -12.0f, -6.0f, 12, 12, 12, \u2603 - 0.5f);
        this.b.a(0.0f, 0.0f + f + 20.0f, 0.0f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
        this.c.g = f4 / 57.295776f;
        this.c.f = f5 / 57.295776f;
        this.a.g = f4 / 57.295776f * 0.25f;
        float f7 = ns.a(this.a.g);
        \u2603 = ns.b(this.a.g);
        this.d.h = 1.0f;
        this.e.h = -1.0f;
        this.d.g = 0.0f + this.a.g;
        this.e.g = (float)Math.PI + this.a.g;
        this.d.c = \u2603 * 5.0f;
        this.d.e = -f7 * 5.0f;
        this.e.c = -\u2603 * 5.0f;
        this.e.e = f7 * 5.0f;
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
        this.b.a(f6);
        this.c.a(f6);
        this.d.a(f6);
        this.e.a(f6);
    }
}
