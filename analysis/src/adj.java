/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class adj {
    private static int[] a = new int[65536];

    public static void a(int[] nArray) {
        a = nArray;
    }

    public static int a(double d, double d2) {
        int n = (int)((1.0 - d) * 255.0);
        \u2603 = (int)((1.0 - (d2 *= d)) * 255.0);
        return a[\u2603 << 8 | n];
    }

    public static int a() {
        return 0x619961;
    }

    public static int b() {
        return 8431445;
    }

    public static int c() {
        return 4764952;
    }
}
