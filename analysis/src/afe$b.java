/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum afe.b implements nw
{
    a(0, "north_south"),
    b(1, "east_west"),
    c(2, "ascending_east"),
    d(3, "ascending_west"),
    e(4, "ascending_north"),
    f(5, "ascending_south"),
    g(6, "south_east"),
    h(7, "south_west"),
    i(8, "north_west"),
    j(9, "north_east");

    private static final afe.b[] k;
    private final int l;
    private final String m;

    private afe.b(int n2, String string2) {
        this.l = n2;
        this.m = string2;
    }

    public int a() {
        return this.l;
    }

    public String toString() {
        return this.m;
    }

    public boolean c() {
        return this == e || this == c || this == f || this == d;
    }

    public static afe.b a(int n) {
        if (n < 0 || n >= k.length) {
            n = 0;
        }
        return k[n];
    }

    @Override
    public String l() {
        return this.m;
    }

    static {
        k = new afe.b[afe.b.values().length];
        afe.b[] bArray = afe.b.values();
        int \u26032 = bArray.length;
        for (int i = 0; i < \u26032; ++i) {
            afe.b.k[\u2603.a()] = \u2603 = bArray[i];
        }
    }
}
