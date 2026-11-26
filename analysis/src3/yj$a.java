/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum yj.a {
    a("leather", 5, new int[]{1, 3, 2, 1}, 15),
    b("chainmail", 15, new int[]{2, 5, 4, 1}, 12),
    c("iron", 15, new int[]{2, 6, 5, 2}, 9),
    d("gold", 7, new int[]{2, 5, 3, 1}, 25),
    e("diamond", 33, new int[]{3, 8, 6, 3}, 10);

    private final String f;
    private final int g;
    private final int[] h;
    private final int i;

    private yj.a(String string2, int n2, int[] nArray, int n3) {
        this.f = string2;
        this.g = n2;
        this.h = nArray;
        this.i = n3;
    }

    public int a(int n) {
        return k[n] * this.g;
    }

    public int b(int n) {
        return this.h[n];
    }

    public int a() {
        return this.i;
    }

    public zw b() {
        if (this == a) {
            return zy.aF;
        }
        if (this == b) {
            return zy.j;
        }
        if (this == d) {
            return zy.k;
        }
        if (this == c) {
            return zy.j;
        }
        if (this == e) {
            return zy.i;
        }
        return null;
    }

    public String c() {
        return this.f;
    }
}
