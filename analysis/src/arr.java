/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class arr
extends ase {
    private final a c;

    public arr(long l, ase ase2, a a2) {
        super(l);
        this.a = ase2;
        this.c = a2;
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        switch (this.c) {
            default: {
                return this.c(n, n2, n3, n4);
            }
            case b: {
                return this.d(n, n2, n3, n4);
            }
            case c: 
        }
        return this.e(n, n2, n3, n4);
    }

    private int[] c(int n, int n2, int n3, int n4) {
        int[] nArray;
        \u2603 = n - 1;
        \u2603 = n2 - 1;
        \u2603 = 1 + n3 + 1;
        \u2603 = 1 + n4 + 1;
        int[] nArray2 = this.a.a(\u2603, \u2603, \u2603, \u2603);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                int n5;
                this.a((long)(\u2603 + n), (long)(i + n2));
                n5 = nArray2[\u2603 + 1 + (i + 1) * \u2603];
                if (n5 == 1) {
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 - 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * \u2603];
                    boolean bl = \u2603 == 3 || \u2603 == 3 || \u2603 == 3 || \u2603 == 3;
                    boolean bl2 = \u2603 = \u2603 == 4 || \u2603 == 4 || \u2603 == 4 || \u2603 == 4;
                    if (bl || \u2603) {
                        n5 = 2;
                    }
                }
                nArray[\u2603 + i * n3] = n5;
            }
        }
        return nArray;
    }

    private int[] d(int n, int n2, int n3, int n4) {
        int[] nArray;
        \u2603 = n - 1;
        \u2603 = n2 - 1;
        \u2603 = 1 + n3 + 1;
        \u2603 = 1 + n4 + 1;
        int[] nArray2 = this.a.a(\u2603, \u2603, \u2603, \u2603);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                int n5;
                n5 = nArray2[\u2603 + 1 + (i + 1) * \u2603];
                if (n5 == 4) {
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 - 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * \u2603];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * \u2603];
                    boolean bl = \u2603 == 2 || \u2603 == 2 || \u2603 == 2 || \u2603 == 2;
                    boolean bl2 = \u2603 = \u2603 == 1 || \u2603 == 1 || \u2603 == 1 || \u2603 == 1;
                    if (\u2603 || bl) {
                        n5 = 3;
                    }
                }
                nArray[\u2603 + i * n3] = n5;
            }
        }
        return nArray;
    }

    private int[] e(int n, int n2, int n3, int n4) {
        int[] nArray;
        int[] nArray2 = this.a.a(n, n2, n3, n4);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                this.a((long)(\u2603 + n), (long)(i + n2));
                \u2603 = nArray2[\u2603 + i * n3];
                if (\u2603 != 0 && this.a(13) == 0) {
                    \u2603 |= 1 + this.a(15) << 8 & 0xF00;
                }
                nArray[\u2603 + i * n3] = \u2603;
            }
        }
        return nArray;
    }

    public static enum a {
        a,
        b,
        c;

    }
}
