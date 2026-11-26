/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ann
extends anm {
    @Override
    public void b() {
        this.c = new aef(ady.x, 0.0f);
        this.d = true;
        this.e = true;
        this.g = -1;
    }

    @Override
    public aui b(float f, float f2) {
        return new aui(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void a() {
        float f = 0.1f;
        for (int i = 0; i <= 15; ++i) {
            float f2 = 1.0f - (float)i / 15.0f;
            this.f[i] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    @Override
    public amv c() {
        return new anw(this.b, this.b.P().s(), this.b.J());
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean a(int n, int n2) {
        return false;
    }

    @Override
    public float a(long l, float f) {
        return 0.5f;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public String k() {
        return "Nether";
    }

    @Override
    public String l() {
        return "_nether";
    }

    @Override
    public ams r() {
        return new ams(){

            @Override
            public double f() {
                return super.f() / 8.0;
            }

            @Override
            public double g() {
                return super.g() / 8.0;
            }
        };
    }
}
