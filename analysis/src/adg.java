/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class adg {
    public final int a;
    public final int b;

    public adg(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public static long a(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        int n = 1664525 * this.a + 1013904223;
        \u2603 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
        return n ^ \u2603;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof adg) {
            adg adg2 = (adg)object;
            return this.a == adg2.a && this.b == adg2.b;
        }
        return false;
    }

    public int a() {
        return (this.a << 4) + 8;
    }

    public int b() {
        return (this.b << 4) + 8;
    }

    public int c() {
        return this.a << 4;
    }

    public int d() {
        return this.b << 4;
    }

    public int e() {
        return (this.a << 4) + 15;
    }

    public int f() {
        return (this.b << 4) + 15;
    }

    public cj a(int n, int n2, int n3) {
        return new cj((this.a << 4) + n, n2, (this.b << 4) + n3);
    }

    public cj a(int n) {
        return new cj(this.a(), n, this.b());
    }

    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}
