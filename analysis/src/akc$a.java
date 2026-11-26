/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum akc.a implements nw
{
    a(0, "dead_bush"),
    b(1, "tall_grass"),
    c(2, "fern");

    private static final akc.a[] d;
    private final int e;
    private final String f;

    private akc.a(int n2, String string2) {
        this.e = n2;
        this.f = string2;
    }

    public int a() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static akc.a a(int n) {
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
        d = new akc.a[akc.a.values().length];
        akc.a[] aArray = akc.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            akc.a.d[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
