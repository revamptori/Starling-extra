/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aiu.a implements nw
{
    a(0, "prismarine", "rough"),
    b(1, "prismarine_bricks", "bricks"),
    c(2, "dark_prismarine", "dark");

    private static final aiu.a[] d;
    private final int e;
    private final String f;
    private final String g;

    private aiu.a(int n2, String string2, String string3) {
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

    public static aiu.a a(int n) {
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
        d = new aiu.a[aiu.a.values().length];
        aiu.a[] aArray = aiu.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aiu.a.d[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
