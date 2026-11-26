/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aiw.a implements nw
{
    a(0, "default", "default"),
    b(1, "chiseled", "chiseled"),
    c(2, "lines_y", "lines"),
    d(3, "lines_x", "lines"),
    e(4, "lines_z", "lines");

    private static final aiw.a[] f;
    private final int g;
    private final String h;
    private final String i;

    private aiw.a(int n2, String string2, String string3) {
        this.g = n2;
        this.h = string2;
        this.i = string3;
    }

    public int a() {
        return this.g;
    }

    public String toString() {
        return this.i;
    }

    public static aiw.a a(int n) {
        if (n < 0 || n >= f.length) {
            n = 0;
        }
        return f[n];
    }

    @Override
    public String l() {
        return this.h;
    }

    static {
        f = new aiw.a[aiw.a.values().length];
        aiw.a[] aArray = aiw.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aiw.a.f[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
