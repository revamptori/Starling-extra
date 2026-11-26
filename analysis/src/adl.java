/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class adl {
    private static int[] a = new int[65536];

    public static void a(int[] nArray) {
        a = nArray;
    }

    public static int a(double d, double d2) {
        int n = (int)((1.0 - (d2 *= d)) * 255.0);
        \u2603 = (int)((1.0 - d) * 255.0);
        \u2603 = n << 8 | \u2603;
        if (\u2603 > a.length) {
            return -65281;
        }
        return a[\u2603];
    }
}
