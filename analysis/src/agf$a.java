/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum agf.a implements nw
{
    a(0, "dirt", "default", arn.l),
    b(1, "coarse_dirt", "coarse", arn.l),
    c(2, "podzol", arn.J);

    private static final agf.a[] d;
    private final int e;
    private final String f;
    private final String g;
    private final arn h;

    private agf.a(int n2, String string2, arn arn2) {
        this(n2, string2, string2, arn2);
    }

    private agf.a(int n2, String string2, String string3, arn arn2) {
        this.e = n2;
        this.f = string2;
        this.g = string3;
        this.h = arn2;
    }

    public int a() {
        return this.e;
    }

    public String c() {
        return this.g;
    }

    public arn d() {
        return this.h;
    }

    public String toString() {
        return this.f;
    }

    public static agf.a a(int n) {
        if (n < 0 || n >= d.length) {
            n = 0;
        }
        return d[n];
    }

    @Override
    public String l() {
        return this.f;
    }

    static {
        d = new agf.a[agf.a.values().length];
        agf.a[] aArray = agf.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            agf.a.d[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
