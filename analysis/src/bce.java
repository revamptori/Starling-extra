/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bce
extends bbo {
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;
    public bct h;
    public bct i;
    public bct j;
    public bct k;

    public bce() {
        float f = 0.0f;
        int \u26032 = 15;
        this.a = new bct(this, 32, 4);
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.a.a(0.0f, \u26032, -3.0f);
        this.b = new bct(this, 0, 0);
        this.b.a(-3.0f, -3.0f, -3.0f, 6, 6, 6, f);
        this.b.a(0.0f, \u26032, 0.0f);
        this.c = new bct(this, 0, 12);
        this.c.a(-5.0f, -4.0f, -6.0f, 10, 8, 12, f);
        this.c.a(0.0f, \u26032, 9.0f);
        this.d = new bct(this, 18, 0);
        this.d.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.d.a(-4.0f, \u26032, 2.0f);
        this.e = new bct(this, 18, 0);
        this.e.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.e.a(4.0f, \u26032, 2.0f);
        this.f = new bct(this, 18, 0);
        this.f.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.f.a(-4.0f, \u26032, 1.0f);
        this.g = new bct(this, 18, 0);
        this.g.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.g.a(4.0f, \u26032, 1.0f);
        this.h = new bct(this, 18, 0);
        this.h.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.h.a(-4.0f, \u26032, 0.0f);
        this.i = new bct(this, 18, 0);
        this.i.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.i.a(4.0f, \u26032, 0.0f);
        this.j = new bct(this, 18, 0);
        this.j.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.j.a(-4.0f, \u26032, -1.0f);
        this.k = new bct(this, 18, 0);
        this.k.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.k.a(4.0f, \u26032, -1.0f);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
        this.b.a(f6);
        this.c.a(f6);
        this.d.a(f6);
        this.e.a(f6);
        this.f.a(f6);
        this.g.a(f6);
        this.h.a(f6);
        this.i.a(f6);
        this.j.a(f6);
        this.k.a(f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        this.a.g = f4 / 57.295776f;
        this.a.f = f5 / 57.295776f;
        float f7 = 0.7853982f;
        this.d.h = -f7;
        this.e.h = f7;
        this.f.h = -f7 * 0.74f;
        this.g.h = f7 * 0.74f;
        this.h.h = -f7 * 0.74f;
        this.i.h = f7 * 0.74f;
        this.j.h = -f7;
        this.k.h = f7;
        \u2603 = -0.0f;
        \u2603 = 0.3926991f;
        this.d.g = \u2603 * 2.0f + \u2603;
        this.e.g = -\u2603 * 2.0f - \u2603;
        this.f.g = \u2603 * 1.0f + \u2603;
        this.g.g = -\u2603 * 1.0f - \u2603;
        this.h.g = -\u2603 * 1.0f + \u2603;
        this.i.g = \u2603 * 1.0f - \u2603;
        this.j.g = -\u2603 * 2.0f + \u2603;
        this.k.g = \u2603 * 2.0f - \u2603;
        \u2603 = -(ns.b(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f2;
        \u2603 = -(ns.b(f * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f2;
        \u2603 = -(ns.b(f * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f2;
        \u2603 = -(ns.b(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f2;
        \u2603 = Math.abs((float)(ns.a(f * 0.6662f + 0.0f) * 0.4f)) * f2;
        \u2603 = Math.abs((float)(ns.a(f * 0.6662f + (float)Math.PI) * 0.4f)) * f2;
        \u2603 = Math.abs((float)(ns.a(f * 0.6662f + 1.5707964f) * 0.4f)) * f2;
        \u2603 = Math.abs((float)(ns.a(f * 0.6662f + 4.712389f) * 0.4f)) * f2;
        this.d.g += \u2603;
        this.e.g += -\u2603;
        this.f.g += \u2603;
        this.g.g += -\u2603;
        this.h.g += \u2603;
        this.i.g += -\u2603;
        this.j.g += \u2603;
        this.k.g += -\u2603;
        this.d.h += \u2603;
        this.e.h += -\u2603;
        this.f.h += \u2603;
        this.g.h += -\u2603;
        this.h.h += \u2603;
        this.i.h += -\u2603;
        this.j.h += \u2603;
        this.k.h += -\u2603;
    }
}
