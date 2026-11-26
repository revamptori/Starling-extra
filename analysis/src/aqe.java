/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Objects;

public class aqe {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public aqe() {
    }

    public aqe(int[] nArray) {
        if (nArray.length == 6) {
            this.a = nArray[0];
            this.b = nArray[1];
            this.c = nArray[2];
            this.d = nArray[3];
            this.e = nArray[4];
            this.f = nArray[5];
        }
    }

    public static aqe a() {
        return new aqe(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static aqe a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, cq cq2) {
        switch (cq2) {
            default: {
                return new aqe(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case c: {
                return new aqe(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case d: {
                return new aqe(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case e: {
                return new aqe(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case f: 
        }
        return new aqe(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
    }

    public static aqe a(int n, int n2, int n3, int n4, int n5, int n6) {
        return new aqe(Math.min((int)n, (int)n4), Math.min((int)n2, (int)n5), Math.min((int)n3, (int)n6), Math.max((int)n, (int)n4), Math.max((int)n2, (int)n5), Math.max((int)n3, (int)n6));
    }

    public aqe(aqe aqe2) {
        this.a = aqe2.a;
        this.b = aqe2.b;
        this.c = aqe2.c;
        this.d = aqe2.d;
        this.e = aqe2.e;
        this.f = aqe2.f;
    }

    public aqe(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
    }

    public aqe(df df2, df df3) {
        this.a = Math.min((int)df2.n(), (int)df3.n());
        this.b = Math.min((int)df2.o(), (int)df3.o());
        this.c = Math.min((int)df2.p(), (int)df3.p());
        this.d = Math.max((int)df2.n(), (int)df3.n());
        this.e = Math.max((int)df2.o(), (int)df3.o());
        this.f = Math.max((int)df2.p(), (int)df3.p());
    }

    public aqe(int n, int n2, int n3, int n4) {
        this.a = n;
        this.c = n2;
        this.d = n3;
        this.f = n4;
        this.b = 1;
        this.e = 512;
    }

    public boolean a(aqe aqe2) {
        return this.d >= aqe2.a && this.a <= aqe2.d && this.f >= aqe2.c && this.c <= aqe2.f && this.e >= aqe2.b && this.b <= aqe2.e;
    }

    public boolean a(int n, int n2, int n3, int n4) {
        return this.d >= n && this.a <= n3 && this.f >= n2 && this.c <= n4;
    }

    public void b(aqe aqe2) {
        this.a = Math.min((int)this.a, (int)aqe2.a);
        this.b = Math.min((int)this.b, (int)aqe2.b);
        this.c = Math.min((int)this.c, (int)aqe2.c);
        this.d = Math.max((int)this.d, (int)aqe2.d);
        this.e = Math.max((int)this.e, (int)aqe2.e);
        this.f = Math.max((int)this.f, (int)aqe2.f);
    }

    public void a(int n, int n2, int n3) {
        this.a += n;
        this.b += n2;
        this.c += n3;
        this.d += n;
        this.e += n2;
        this.f += n3;
    }

    public boolean b(df df2) {
        return df2.n() >= this.a && df2.n() <= this.d && df2.p() >= this.c && df2.p() <= this.f && df2.o() >= this.b && df2.o() <= this.e;
    }

    public df b() {
        return new df(this.d - this.a, this.e - this.b, this.f - this.c);
    }

    public int c() {
        return this.d - this.a + 1;
    }

    public int d() {
        return this.e - this.b + 1;
    }

    public int e() {
        return this.f - this.c + 1;
    }

    public df f() {
        return new cj(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
    }

    public ds g() {
        return new ds(new int[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}
