/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
public class amw {
    private final byte[] a;

    public amw() {
        this.a = new byte[2048];
    }

    public amw(byte[] byArray) {
        this.a = byArray;
        if (byArray.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + byArray.length);
        }
    }

    public int a(int n, int n2, int n3) {
        return this.a(this.b(n, n2, n3));
    }

    public void a(int n, int n2, int n3, int n4) {
        this.a(this.b(n, n2, n3), n4);
    }

    private int b(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    public int a(int n) {
        \u2603 = this.c(n);
        if (this.b(n)) {
            return this.a[\u2603] & 0xF;
        }
        return this.a[\u2603] >> 4 & 0xF;
    }

    public void a(int n, int n2) {
        \u2603 = this.c(n);
        this.a[\u2603] = this.b(n) ? (byte)(this.a[\u2603] & 0xF0 | n2 & 0xF) : (byte)(this.a[\u2603] & 0xF | (n2 & 0xF) << 4);
    }

    private boolean b(int n) {
        return (n & 1) == 0;
    }

    private int c(int n) {
        return n >> 1;
    }

    public byte[] a() {
        return this.a;
    }
}
