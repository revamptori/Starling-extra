/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum akl.a implements nw
{
    a(0, "cobblestone", "normal"),
    b(1, "mossy_cobblestone", "mossy");

    private static final akl.a[] c;
    private final int d;
    private final String e;
    private String f;

    private akl.a(int n2, String string2, String string3) {
        this.d = n2;
        this.e = string2;
        this.f = string3;
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public static akl.a a(int n) {
        if (n < 0 || n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    @Override
    public String l() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    static {
        c = new akl.a[akl.a.values().length];
        akl.a[] aArray = akl.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            akl.a.c[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
