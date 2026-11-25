/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class asd
extends ase {
    public asd(long l) {
        super(l);
    }

    @Override
    public int[] a(int n5, int n2, int n3, int n4) {
        int n5;
        int[] nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                this.a((long)(n5 + \u2603), (long)(n2 + i));
                nArray[\u2603 + i * n3] = this.a(10) == 0 ? 1 : 0;
            }
        }
        if (n5 > -n3 && n5 <= 0 && n2 > -n4 && n2 <= 0) {
            nArray[-n5 + -n2 * n3] = 1;
        }
        return nArray;
    }
}
