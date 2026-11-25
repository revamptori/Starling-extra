/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class anp
extends anm {
    @Override
    public void b() {
        this.c = new aef(ady.y, 0.0f);
        this.g = 1;
        this.e = true;
    }

    @Override
    public amv c() {
        return new aob(this.b, this.b.J());
    }

    @Override
    public float a(long l, float f) {
        return 0.0f;
    }

    @Override
    public float[] a(float f, float f2) {
        return null;
    }

    @Override
    public aui b(float f, float f2) {
        int n = 0xA080A0;
        float \u26032 = ns.b(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        \u26032 = ns.a(\u26032, 0.0f, 1.0f);
        float \u26033 = (float)(n >> 16 & 0xFF) / 255.0f;
        float \u26034 = (float)(n >> 8 & 0xFF) / 255.0f;
        float \u26035 = (float)(n & 0xFF) / 255.0f;
        return new aui(\u26033 *= \u26032 * 0.0f + 0.15f, \u26034 *= \u26032 * 0.0f + 0.15f, \u26035 *= \u26032 * 0.0f + 0.15f);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public float f() {
        return 8.0f;
    }

    @Override
    public boolean a(int n, int n2) {
        return this.b.c(new cj(n, 0, n2)).t().c();
    }

    @Override
    public cj h() {
        return new cj(100, 50, 0);
    }

    @Override
    public int i() {
        return 50;
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public String k() {
        return "The End";
    }

    @Override
    public String l() {
        return "_end";
    }
}
