/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 */
public class asq
extends ase {
    public asq(long l, ase ase2) {
        super(l);
        this.a = ase2;
    }

    @Override
    public int[] a(int n, int n2, int n32, int n4) {
        int n32;
        \u2603 = (n -= 2) >> 2;
        \u2603 = (n2 -= 2) >> 2;
        \u2603 = (n32 >> 2) + 2;
        \u2603 = (n4 >> 2) + 2;
        int[] nArray = this.a.a(\u2603, \u2603, \u2603, \u2603);
        int \u26032 = \u2603 - 1 << 2;
        int \u26033 = \u2603 - 1 << 2;
        \u2603 = asc.a(\u26032 * \u26033);
        for (int i = 0; i < \u2603 - 1; ++i) {
            n5 = nArray[\u2603 + 0 + (i + 0) * \u2603];
            \u2603 = nArray[\u2603 + 0 + (i + 1) * \u2603];
            for (\u2603 = 0; \u2603 < \u2603 - 1; ++\u2603) {
                double d = 3.6;
                this.a((long)(\u2603 + \u2603 << 2), (long)(i + \u2603 << 2));
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                this.a((long)(\u2603 + \u2603 + 1 << 2), (long)(i + \u2603 << 2));
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                this.a((long)(\u2603 + \u2603 << 2), (long)(i + \u2603 + 1 << 2));
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                this.a((long)(\u2603 + \u2603 + 1 << 2), (long)(i + \u2603 + 1 << 2));
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                \u2603 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                int \u26034 = nArray[\u2603 + 1 + (i + 0) * \u2603] & 0xFF;
                int \u26035 = nArray[\u2603 + 1 + (i + 1) * \u2603] & 0xFF;
                for (int j = 0; j < 4; ++j) {
                    \u2603 = ((i << 2) + j) * \u26032 + (\u2603 << 2);
                    for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                        double d2 = ((double)j - \u2603) * ((double)j - \u2603) + ((double)\u2603 - \u2603) * ((double)\u2603 - \u2603);
                        \u2603 = ((double)j - \u2603) * ((double)j - \u2603) + ((double)\u2603 - \u2603) * ((double)\u2603 - \u2603);
                        \u2603 = ((double)j - \u2603) * ((double)j - \u2603) + ((double)\u2603 - \u2603) * ((double)\u2603 - \u2603);
                        \u2603 = ((double)j - \u2603) * ((double)j - \u2603) + ((double)\u2603 - \u2603) * ((double)\u2603 - \u2603);
                        \u2603[\u2603++] = d2 < \u2603 && d2 < \u2603 && d2 < \u2603 ? n5 : (\u2603 < d2 && \u2603 < \u2603 && \u2603 < \u2603 ? \u26034 : (\u2603 < d2 && \u2603 < \u2603 && \u2603 < \u2603 ? \u2603 : \u26035));
                    }
                }
                int n5 = \u26034;
                \u2603 = \u26035;
            }
        }
        int[] \u26036 = asc.a(n32 * n4);
        for (\u2603 = 0; \u2603 < n4; ++\u2603) {
            System.arraycopy((Object)\u2603, (int)((\u2603 + (n2 & 3)) * \u26032 + (n & 3)), (Object)\u26036, (int)(\u2603 * n32), (int)n32);
        }
        return \u26036;
    }
}
