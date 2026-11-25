/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbv
extends bbt {
    private float i;

    public bbv() {
        super(12, 0.0f);
        this.a = new bct(this, 0, 0);
        this.a.a(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
        this.a.a(0.0f, 6.0f, -8.0f);
        this.b = new bct(this, 28, 8);
        this.b.a(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
        this.b.a(0.0f, 5.0f, 2.0f);
        float f = 0.5f;
        this.c = new bct(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.c.a(-3.0f, 12.0f, 7.0f);
        this.d = new bct(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.d.a(3.0f, 12.0f, 7.0f);
        this.e = new bct(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.e.a(-3.0f, 12.0f, -5.0f);
        this.f = new bct(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.f.a(3.0f, 12.0f, -5.0f);
    }

    @Override
    public void a(pr pr2, float f, float f2, float f3) {
        super.a(pr2, f, f2, f3);
        this.a.d = 6.0f + ((tv)pr2).p(f3) * 9.0f;
        this.i = ((tv)pr2).q(f3);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.f = this.i;
    }
}
