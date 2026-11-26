/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum akb.a implements nw
{
    a(0, arn.m, "stone"),
    b(1, arn.d, "sandstone", "sand"),
    c(2, arn.o, "wood_old", "wood"),
    d(3, arn.m, "cobblestone", "cobble"),
    e(4, arn.D, "brick"),
    f(5, arn.m, "stone_brick", "smoothStoneBrick"),
    g(6, arn.K, "nether_brick", "netherBrick"),
    h(7, arn.p, "quartz");

    private static final akb.a[] i;
    private final int j;
    private final arn k;
    private final String l;
    private final String m;

    private akb.a(int n2, arn arn2, String string2) {
        this(n2, arn2, string2, string2);
    }

    private akb.a(int n2, arn arn2, String string2, String string3) {
        this.j = n2;
        this.k = arn2;
        this.l = string2;
        this.m = string3;
    }

    public int a() {
        return this.j;
    }

    public arn c() {
        return this.k;
    }

    public String toString() {
        return this.l;
    }

    public static akb.a a(int n) {
        if (n < 0 || n >= i.length) {
            n = 0;
        }
        return i[n];
    }

    @Override
    public String l() {
        return this.l;
    }

    public String d() {
        return this.m;
    }

    static {
        i = new akb.a[akb.a.values().length];
        akb.a[] aArray = akb.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            akb.a.i[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
