/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
public class avl {
    float a;
    private double f;
    public int b;
    public float c;
    public float d = 1.0f;
    public float e;
    private long g;
    private long h;
    private long i;
    private double j = 1.0;

    public avl(float f) {
        this.a = f;
        this.g = ave.J();
        this.h = System.nanoTime() / 1000000L;
    }

    public void a() {
        long l = ave.J();
        \u2603 = l - this.g;
        l2 = System.nanoTime() / 1000000L;
        double \u26032 = (double)l2 / 1000.0;
        if (\u2603 > 1000L || \u2603 < 0L) {
            this.f = \u26032;
        } else {
            this.i += \u2603;
            if (this.i > 1000L) {
                \u2603 = l2 - this.h;
                double d2 = (double)this.i / (double)\u2603;
                this.j += (d2 - this.j) * (double)0.2f;
                this.h = l2;
                this.i = 0L;
            }
            if (this.i < 0L) {
                long l2;
                this.h = l2;
            }
        }
        this.g = l;
        double \u26033 = (\u26032 - this.f) * this.j;
        this.f = \u26032;
        \u26033 = ns.a(\u26033, 0.0, 1.0);
        this.e = (float)((double)this.e + \u26033 * (double)this.d * (double)this.a);
        this.b = (int)this.e;
        this.e -= (float)this.b;
        if (this.b > 10) {
            this.b = 10;
        }
        this.c = this.e;
    }
}
