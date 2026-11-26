/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aih.a implements nw
{
    a(0, "red_sandstone", ajh.a.b.c());

    private static final aih.a[] b;
    private final int c;
    private final String d;
    private final arn e;

    private aih.a(int n2, String string2, arn arn2) {
        this.c = n2;
        this.d = string2;
        this.e = arn2;
    }

    public int a() {
        return this.c;
    }

    public arn c() {
        return this.e;
    }

    public String toString() {
        return this.d;
    }

    public static aih.a a(int n) {
        if (n < 0 || n >= b.length) {
            n = 0;
        }
        return b[n];
    }

    @Override
    public String l() {
        return this.d;
    }

    public String d() {
        return this.d;
    }

    static {
        b = new aih.a[aih.a.values().length];
        aih.a[] aArray = aih.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            aih.a.b[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
