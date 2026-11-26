/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ajy.a implements nw
{
    a(0, arn.m, "stone"),
    b(1, arn.l, "granite"),
    c(2, arn.l, "smooth_granite", "graniteSmooth"),
    d(3, arn.p, "diorite"),
    e(4, arn.p, "smooth_diorite", "dioriteSmooth"),
    f(5, arn.m, "andesite"),
    g(6, arn.m, "smooth_andesite", "andesiteSmooth");

    private static final ajy.a[] h;
    private final int i;
    private final String j;
    private final String k;
    private final arn l;

    private ajy.a(int n2, arn arn2, String string2) {
        this(n2, arn2, string2, string2);
    }

    private ajy.a(int n2, arn arn2, String string2, String string3) {
        this.i = n2;
        this.j = string2;
        this.k = string3;
        this.l = arn2;
    }

    public int a() {
        return this.i;
    }

    public arn c() {
        return this.l;
    }

    public String toString() {
        return this.j;
    }

    public static ajy.a a(int n) {
        if (n < 0 || n >= h.length) {
            n = 0;
        }
        return h[n];
    }

    @Override
    public String l() {
        return this.j;
    }

    public String d() {
        return this.k;
    }

    static {
        h = new ajy.a[ajy.a.values().length];
        ajy.a[] aArray = ajy.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            ajy.a.h[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
