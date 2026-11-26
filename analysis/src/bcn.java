/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bcn
extends bbj {
    public bcn() {
        this(0.0f, false);
    }

    protected bcn(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

    public bcn(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
        float f7 = ns.a(this.p * (float)Math.PI);
        \u2603 = ns.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * (float)Math.PI);
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.h.g = -(0.1f - f7 * 0.6f);
        this.i.g = 0.1f - f7 * 0.6f;
        this.h.f = -1.5707964f;
        this.i.f = -1.5707964f;
        this.h.f -= f7 * 1.2f - \u2603 * 0.4f;
        this.i.f -= f7 * 1.2f - \u2603 * 0.4f;
        this.h.h += ns.b(f3 * 0.09f) * 0.05f + 0.05f;
        this.i.h -= ns.b(f3 * 0.09f) * 0.05f + 0.05f;
        this.h.f += ns.a(f3 * 0.067f) * 0.05f;
        this.i.f -= ns.a(f3 * 0.067f) * 0.05f;
    }
}
