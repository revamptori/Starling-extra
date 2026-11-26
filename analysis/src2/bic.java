/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bic
implements bia {
    private bid a;
    private double b;
    private double c;
    private double d;

    public bic() {
        this(bib.a());
    }

    public bic(bid bid2) {
        this.a = bid2;
    }

    @Override
    public void a(double d, double d2, double d3) {
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    public boolean b(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.a.b(d - this.b, d2 - this.c, d3 - this.d, d4 - this.b, d5 - this.c, d6 - this.d);
    }

    @Override
    public boolean a(aug aug2) {
        return this.b(aug2.a, aug2.b, aug2.c, aug2.d, aug2.e, aug2.f);
    }
}
