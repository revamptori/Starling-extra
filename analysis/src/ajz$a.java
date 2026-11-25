/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ajz.a implements nw
{
    a(0, "stonebrick", "default"),
    b(1, "mossy_stonebrick", "mossy"),
    c(2, "cracked_stonebrick", "cracked"),
    d(3, "chiseled_stonebrick", "chiseled");

    private static final ajz.a[] e;
    private final int f;
    private final String g;
    private final String h;

    private ajz.a(int n2, String string2, String string3) {
        this.f = n2;
        this.g = string2;
        this.h = string3;
    }

    public int a() {
        return this.f;
    }

    public String toString() {
        return this.g;
    }

    public static ajz.a a(int n) {
        if (n < 0 || n >= e.length) {
            n = 0;
        }
        return e[n];
    }

    @Override
    public String l() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    static {
        e = new ajz.a[ajz.a.values().length];
        ajz.a[] aArray = ajz.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            ajz.a.e[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
