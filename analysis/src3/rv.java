/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class rv
extends rd {
    private py b;
    protected double a;
    private double c;
    private double d;
    private double e;

    public rv(py py2, double d) {
        this.b = py2;
        this.a = d;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.b.bd() == null && !this.b.at()) {
            return false;
        }
        aui aui2 = tc.a(this.b, 5, 4);
        if (aui2 == null) {
            return false;
        }
        this.c = aui2.a;
        this.d = aui2.b;
        this.e = aui2.c;
        return true;
    }

    @Override
    public void c() {
        this.b.s().a(this.c, this.d, this.e, this.a);
    }

    @Override
    public boolean b() {
        return !this.b.s().m();
    }
}
