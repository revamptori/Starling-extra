/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aho.a implements nw
{
    a(1, "north_west"),
    b(2, "north"),
    c(3, "north_east"),
    d(4, "west"),
    e(5, "center"),
    f(6, "east"),
    g(7, "south_west"),
    h(8, "south"),
    i(9, "south_east"),
    j(10, "stem"),
    k(0, "all_inside"),
    l(14, "all_outside"),
    m(15, "all_stem");

    private static final aho.a[] n;
    private final int o;
    private final String p;

    private aho.a(int n2, String string2) {
        this.o = n2;
        this.p = string2;
    }

    public int a() {
        return this.o;
    }

    public String toString() {
        return this.p;
    }

    public static aho.a a(int n) {
        if (n < 0 || n >= aho.a.n.length) {
            n = 0;
        }
        return (\u2603 = aho.a.n[n]) == null ? aho.a.n[0] : \u2603;
    }

    @Override
    public String l() {
        return this.p;
    }

    static {
        n = new aho.a[16];
        aho.a[] aArray = aho.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aho.a.n[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
