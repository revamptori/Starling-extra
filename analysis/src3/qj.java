/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class qj
extends qe {
    private final double a;
    private final double b;
    private String c;

    public qj(qb qb2, String string, double d, double d2, double d3) {
        super(qb2, string, d);
        this.a = d2;
        this.b = d3;
        if (d2 > d3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d < d2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d > d3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public qj a(String string) {
        this.c = string;
        return this;
    }

    public String g() {
        return this.c;
    }

    @Override
    public double a(double d) {
        d = ns.a(d, this.a, this.b);
        return d;
    }
}
