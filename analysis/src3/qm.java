/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
public class qm {
    private pr a;
    private int b;
    private float c;

    public qm(pr pr2) {
        this.a = pr2;
    }

    public void a() {
        double d = this.a.s - this.a.p;
        \u2603 = this.a.u - this.a.r;
        if (d * d + \u2603 * \u2603 > 2.500000277905201E-7) {
            this.a.aI = this.a.y;
            this.c = this.a.aK = this.a(this.a.aI, this.a.aK, 75.0f);
            this.b = 0;
            return;
        }
        float \u26032 = 75.0f;
        if (Math.abs((float)(this.a.aK - this.c)) > 15.0f) {
            this.b = 0;
            this.c = this.a.aK;
        } else {
            ++this.b;
            int n = 10;
            if (this.b > 10) {
                \u26032 = Math.max((float)(1.0f - (float)(this.b - 10) / 10.0f), (float)0.0f) * 75.0f;
            }
        }
        this.a.aI = this.a(this.a.aK, this.a.aI, \u26032);
    }

    private float a(float f, float f2, float f3) {
        \u2603 = ns.g(f - f2);
        if (\u2603 < -f3) {
            \u2603 = -f3;
        }
        if (\u2603 >= f3) {
            \u2603 = f3;
        }
        return f - \u2603;
    }
}
