/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ajh.a implements nw
{
    a(0, "sand", "default", arn.d),
    b(1, "red_sand", "red", arn.q);

    private static final ajh.a[] c;
    private final int d;
    private final String e;
    private final arn f;
    private final String g;

    private ajh.a(int n2, String string2, String string3, arn arn2) {
        this.d = n2;
        this.e = string2;
        this.f = arn2;
        this.g = string3;
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public arn c() {
        return this.f;
    }

    public static ajh.a a(int n) {
        if (n < 0 || n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    @Override
    public String l() {
        return this.e;
    }

    public String d() {
        return this.g;
    }

    static {
        c = new ajh.a[ajh.a.values().length];
        ajh.a[] aArray = ajh.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            ajh.a.c[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
