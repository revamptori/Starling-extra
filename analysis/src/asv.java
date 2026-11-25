/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 */
public class asv {
    public final int a;
    public final int b;
    public final int c;
    private final int j;
    int d = -1;
    float e;
    float f;
    float g;
    asv h;
    public boolean i;

    public asv(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.j = asv.a(n, n2, n3);
    }

    public static int a(int n, int n2, int n3) {
        return n2 & 0xFF | (n & Short.MAX_VALUE) << 8 | (n3 & Short.MAX_VALUE) << 24 | (n < 0 ? Integer.MIN_VALUE : 0) | (n3 < 0 ? 32768 : 0);
    }

    public float a(asv asv2) {
        float f = asv2.a - this.a;
        \u2603 = asv2.b - this.b;
        \u2603 = asv2.c - this.c;
        return ns.c(f * f + \u2603 * \u2603 + \u2603 * \u2603);
    }

    public float b(asv asv2) {
        float f = asv2.a - this.a;
        \u2603 = asv2.b - this.b;
        \u2603 = asv2.c - this.c;
        return f * f + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public boolean equals(Object object) {
        if (object instanceof asv) {
            asv asv2 = (asv)object;
            return this.j == asv2.j && this.a == asv2.a && this.b == asv2.b && this.c == asv2.c;
        }
        return false;
    }

    public int hashCode() {
        return this.j;
    }

    public boolean a() {
        return this.d >= 0;
    }

    public String toString() {
        return this.a + ", " + this.b + ", " + this.c;
    }
}
