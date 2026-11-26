/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbt
extends bbo {
    public bct a = new bct(this, 0, 0);
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    protected float g = 8.0f;
    protected float h = 4.0f;

    public bbt(int n, float f) {
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.a.a(0.0f, 18 - n, -6.0f);
        this.b = new bct(this, 28, 8);
        this.b.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f);
        this.b.a(0.0f, 17 - n, 2.0f);
        this.c = new bct(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.c.a(-3.0f, 24 - n, 7.0f);
        this.d = new bct(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.d.a(3.0f, 24 - n, 7.0f);
        this.e = new bct(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.e.a(-3.0f, 24 - n, -5.0f);
        this.f = new bct(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, n, 4, f);
        this.f.a(3.0f, 24 - n, -5.0f);
    }

    @Override
    public void a(pk pk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, pk2);
        if (this.r) {
            \u2603 = 2.0f;
            bfl.E();
            bfl.b(0.0f, this.g * f7, this.h * f7);
            this.a.a(f7);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / \u2603, 1.0f / \u2603, 1.0f / \u2603);
            bfl.b(0.0f, 24.0f * f7, 0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            bfl.F();
        } else {
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, pk pk2) {
        float f8 = 57.295776f;
        this.a.f = f6 / 57.295776f;
        this.a.g = f5 / 57.295776f;
        this.b.f = 1.5707964f;
        this.c.f = ns.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.f = ns.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.f = ns.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.f.f = ns.b(f2 * 0.6662f) * 1.4f * f3;
    }
}
