/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 */
public class nl {
    private static final Integer[] a = new Integer[65535];

    public static Integer a(int n) {
        if (n > 0 && n < a.length) {
            return a[n];
        }
        return n;
    }

    static {
        int n = a.length;
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            nl.a[\u2603] = \u2603;
        }
    }
}
