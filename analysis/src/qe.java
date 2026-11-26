/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public abstract class qe
implements qb {
    private final qb a;
    private final String b;
    private final double c;
    private boolean d;

    protected qe(qb qb2, String string, double d) {
        this.a = qb2;
        this.b = string;
        this.c = d;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public double b() {
        return this.c;
    }

    @Override
    public boolean c() {
        return this.d;
    }

    public qe a(boolean bl) {
        this.d = bl;
        return this;
    }

    @Override
    public qb d() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof qb && this.b.equals((Object)((qb)object).a());
    }
}
