/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class aru
extends ase {
    public aru(long l, ase ase2) {
        super(l);
        this.a = ase2;
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        int[] nArray;
        \u2603 = n - 1;
        \u2603 = n2 - 1;
        \u2603 = n3 + 2;
        \u2603 = n4 + 2;
        int[] nArray2 = this.a.a(\u2603, \u2603, \u2603, \u2603);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                \u2603 = nArray2[\u2603 + 1 + (i + 1) * \u2603];
                this.a((long)(\u2603 + n), (long)(i + n2));
                if (\u2603 == 0) {
                    nArray[\u2603 + i * n3] = 0;
                    continue;
                }
                \u2603 = this.a(6);
                \u2603 = \u2603 == 0 ? 4 : (\u2603 <= 1 ? 3 : 1);
                nArray[\u2603 + i * n3] = \u2603;
            }
        }
        return nArray;
    }
}
