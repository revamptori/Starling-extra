/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class asi
extends ase {
    public asi(long l, ase ase2) {
        super(l);
        this.a = ase2;
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        int[] nArray;
        int[] nArray2 = this.a.a(n, n2, n3, n4);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                this.a((long)(\u2603 + n), (long)(i + n2));
                nArray[\u2603 + i * n3] = nArray2[\u2603 + i * n3] > 0 ? this.a(299999) + 2 : 0;
            }
        }
        return nArray;
    }
}
