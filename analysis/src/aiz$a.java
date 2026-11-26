/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aiz.a implements nw
{
    a(0, "red_sandstone", "default"),
    b(1, "chiseled_red_sandstone", "chiseled"),
    c(2, "smooth_red_sandstone", "smooth");

    private static final aiz.a[] d;
    private final int e;
    private final String f;
    private final String g;

    private aiz.a(int n2, String string2, String string3) {
        this.e = n2;
        this.f = string2;
        this.g = string3;
    }

    public int a() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static aiz.a a(int n) {
        if (n < 0 || n >= d.length) {
            n = 0;
        }
        return d[n];
    }

    @Override
    public String l() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    static {
        d = new aiz.a[aiz.a.values().length];
        aiz.a[] aArray = aiz.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aiz.a.d[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
