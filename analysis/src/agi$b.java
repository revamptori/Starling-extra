/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum agi.b implements nw
{
    a(0, "sunflower"),
    b(1, "syringa"),
    c(2, "double_grass", "grass"),
    d(3, "double_fern", "fern"),
    e(4, "double_rose", "rose"),
    f(5, "paeonia");

    private static final agi.b[] g;
    private final int h;
    private final String i;
    private final String j;

    private agi.b(int n2, String string2) {
        this(n2, string2, string2);
    }

    private agi.b(int n2, String string2, String string3) {
        this.h = n2;
        this.i = string2;
        this.j = string3;
    }

    public int a() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static agi.b a(int n) {
        if (n < 0 || n >= g.length) {
            n = 0;
        }
        return g[n];
    }

    @Override
    public String l() {
        return this.i;
    }

    public String c() {
        return this.j;
    }

    static {
        g = new agi.b[agi.b.values().length];
        agi.b[] bArray = agi.b.values();
        int \u26032 = bArray.length;
        for (int i = 0; i < \u26032; ++i) {
            agi.b.g[\u2603.a()] = \u2603 = bArray[i];
        }
    }
}
