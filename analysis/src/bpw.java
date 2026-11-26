/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bpw {
    private final jy a;
    private final boolean b;
    private double c;
    private double d;

    public bpw(jy jy2, double d, double d2, boolean bl) {
        this.a = jy2;
        this.c = d;
        this.d = d2;
        this.b = bl;
    }

    public bpw(bpw bpw2) {
        this.a = bpw2.a;
        this.c = bpw2.c;
        this.d = bpw2.d;
        this.b = bpw2.b;
    }

    public jy a() {
        return this.a;
    }

    public double b() {
        return this.c;
    }

    public void a(double d) {
        this.c = d;
    }

    public double c() {
        return this.d;
    }

    public void b(double d) {
        this.d = d;
    }

    public boolean d() {
        return this.b;
    }
}
