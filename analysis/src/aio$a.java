/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aio.a implements nw
{
    a(0, "oak", arn.o),
    b(1, "spruce", arn.J),
    c(2, "birch", arn.d),
    d(3, "jungle", arn.l),
    e(4, "acacia", arn.q),
    f(5, "dark_oak", "big_oak", arn.B);

    private static final aio.a[] g;
    private final int h;
    private final String i;
    private final String j;
    private final arn k;

    private aio.a(int n2, String string2, arn arn2) {
        this(n2, string2, string2, arn2);
    }

    private aio.a(int n2, String string2, String string3, arn arn2) {
        this.h = n2;
        this.i = string2;
        this.j = string3;
        this.k = arn2;
    }

    public int a() {
        return this.h;
    }

    public arn c() {
        return this.k;
    }

    public String toString() {
        return this.i;
    }

    public static aio.a a(int n) {
        if (n < 0 || n >= g.length) {
            n = 0;
        }
        return g[n];
    }

    @Override
    public String l() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    static {
        g = new aio.a[aio.a.values().length];
        aio.a[] aArray = aio.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aio.a.g[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
