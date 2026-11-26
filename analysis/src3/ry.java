/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class ry
extends rd {
    private ps a;
    private double b;
    private double c;
    private int d;

    public ry(ps ps2) {
        this.a = ps2;
        this.a(3);
    }

    @Override
    public boolean a() {
        return this.a.bc().nextFloat() < 0.02f;
    }

    @Override
    public boolean b() {
        return this.d >= 0;
    }

    @Override
    public void c() {
        double d = Math.PI * 2 * this.a.bc().nextDouble();
        this.b = Math.cos((double)d);
        this.c = Math.sin((double)d);
        this.d = 20 + this.a.bc().nextInt(20);
    }

    @Override
    public void e() {
        --this.d;
        this.a.p().a(this.a.s + this.b, this.a.t + (double)this.a.aS(), this.a.u + this.c, 10.0f, this.a.bQ());
    }
}
