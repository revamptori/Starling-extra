/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Objects;

public class df
implements Comparable<df> {
    public static final df b = new df(0, 0, 0);
    private final int a;
    private final int c;
    private final int d;

    public df(int n, int n2, int n3) {
        this.a = n;
        this.c = n2;
        this.d = n3;
    }

    public df(double d, double d2, double d3) {
        this(ns.c(d), ns.c(d2), ns.c(d3));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof df)) {
            return false;
        }
        df df2 = (df)object;
        if (this.n() != df2.n()) {
            return false;
        }
        if (this.o() != df2.o()) {
            return false;
        }
        return this.p() == df2.p();
    }

    public int hashCode() {
        return (this.o() + this.p() * 31) * 31 + this.n();
    }

    public int g(df df2) {
        if (this.o() == df2.o()) {
            if (this.p() == df2.p()) {
                return this.n() - df2.n();
            }
            return this.p() - df2.p();
        }
        return this.o() - df2.o();
    }

    public int n() {
        return this.a;
    }

    public int o() {
        return this.c;
    }

    public int p() {
        return this.d;
    }

    public df d(df df2) {
        return new df(this.o() * df2.p() - this.p() * df2.o(), this.p() * df2.n() - this.n() * df2.p(), this.n() * df2.o() - this.o() * df2.n());
    }

    public double c(double d, double d2, double d3) {
        \u2603 = (double)this.n() - d;
        \u2603 = (double)this.o() - d2;
        \u2603 = (double)this.p() - d3;
        return \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public double d(double d, double d2, double d3) {
        \u2603 = (double)this.n() + 0.5 - d;
        \u2603 = (double)this.o() + 0.5 - d2;
        \u2603 = (double)this.p() + 0.5 - d3;
        return \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public double i(df df2) {
        return this.c(df2.n(), df2.o(), df2.p());
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("x", this.n()).add("y", this.o()).add("z", this.p()).toString();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.g((df)object);
    }
}
