/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class ana {
    public final byte[] a;
    private final int b;
    private final int c;

    public ana(byte[] byArray, int n) {
        this.a = byArray;
        this.b = n;
        this.c = n + 4;
    }

    public int a(int n, int n2, int n3) {
        \u2603 = n << this.c | n3 << this.b | n2;
        \u2603 = \u2603 >> 1;
        \u2603 = \u2603 & 1;
        if (\u2603 == 0) {
            return this.a[\u2603] & 0xF;
        }
        return this.a[\u2603] >> 4 & 0xF;
    }
}
