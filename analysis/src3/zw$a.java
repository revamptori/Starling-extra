/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static enum zw.a {
    a(0, 59, 2.0f, 0.0f, 15),
    b(1, 131, 4.0f, 1.0f, 5),
    c(2, 250, 6.0f, 2.0f, 14),
    d(3, 1561, 8.0f, 3.0f, 10),
    e(0, 32, 12.0f, 0.0f, 22);

    private final int f;
    private final int g;
    private final float h;
    private final float i;
    private final int j;

    private zw.a(int n2, int n3, float f, float f2, int n4) {
        this.f = n2;
        this.g = n3;
        this.h = f;
        this.i = f2;
        this.j = n4;
    }

    public int a() {
        return this.g;
    }

    public float b() {
        return this.h;
    }

    public float c() {
        return this.i;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    public zw f() {
        if (this == a) {
            return zw.a(afi.f);
        }
        if (this == b) {
            return zw.a(afi.e);
        }
        if (this == e) {
            return zy.k;
        }
        if (this == c) {
            return zy.j;
        }
        if (this == d) {
            return zy.i;
        }
        return null;
    }
}
