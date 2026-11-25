/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbm
extends bbo {
    public bct a;

    public bbm() {
        this(0, 0, 32, 32);
    }

    public bbm(int n, int n2, int n3, int n4) {
        this.t = n3;
        this.u = n4;
        this.a = new bct(this, n, n2);
        this.a.a(-3.0f, -6.0f, -3.0f, 6, 8, 6, 0.0f);
        this.a.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.a(f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
        this.a.g = f4 / 57.295776f;
        this.a.f = f5 / 57.295776f;
    }
}
