/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
public class asr
extends ase {
    public asr(long l, ase ase2) {
        super(l);
        this.a = ase2;
    }

    @Override
    public int[] a(int n, int n2, int n32, int n4) {
        int n32;
        \u2603 = n >> 1;
        \u2603 = n2 >> 1;
        \u2603 = (n32 >> 1) + 2;
        \u2603 = (n4 >> 1) + 2;
        int[] nArray = this.a.a(\u2603, \u2603, \u2603, \u2603);
        int \u26032 = \u2603 - 1 << 1;
        int \u26033 = \u2603 - 1 << 1;
        \u2603 = asc.a(\u26032 * \u26033);
        for (int i = 0; i < \u2603 - 1; ++i) {
            \u2603 = (i << 1) * \u26032;
            \u2603 = nArray[\u2603 + 0 + (i + 0) * \u2603];
            \u2603 = nArray[\u2603 + 0 + (i + 1) * \u2603];
            for (\u2603 = 0; \u2603 < \u2603 - 1; ++\u2603) {
                this.a((long)(\u2603 + \u2603 << 1), (long)(i + \u2603 << 1));
                \u2603 = nArray[\u2603 + 1 + (i + 0) * \u2603];
                \u2603 = nArray[\u2603 + 1 + (i + 1) * \u2603];
                \u2603[\u2603] = \u2603;
                \u2603[\u2603++ + \u26032] = this.a(\u2603, \u2603);
                \u2603[\u2603] = this.a(\u2603, \u2603);
                \u2603[\u2603++ + \u26032] = this.b(\u2603, \u2603, \u2603, \u2603);
                \u2603 = \u2603;
                \u2603 = \u2603;
            }
        }
        int[] \u26034 = asc.a(n32 * n4);
        for (\u2603 = 0; \u2603 < n4; ++\u2603) {
            System.arraycopy((Object)\u2603, (int)((\u2603 + (n2 & 1)) * \u26032 + (n & 1)), (Object)\u26034, (int)(\u2603 * n32), (int)n32);
        }
        return \u26034;
    }

    public static ase b(long l, ase ase2, int n) {
        ase ase3 = ase2;
        for (int i = 0; i < n; ++i) {
            ase3 = new asr(l + (long)i, ase3);
        }
        return ase3;
    }
}
