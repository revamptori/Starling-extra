/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class arv
extends ase {
    public arv(long l, ase ase2) {
        super(l);
        this.a = ase2;
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        int[] nArray;
        int[] nArray2 = this.a.a(n - 1, n2 - 1, n3 + 2, n4 + 2);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                this.a((long)(\u2603 + n), (long)(i + n2));
                \u2603 = nArray2[\u2603 + 1 + (i + 1) * (n3 + 2)];
                if (this.a(nArray2, nArray, \u2603, i, n3, \u2603, ady.s.az, ady.J.az) || this.b(nArray2, nArray, \u2603, i, n3, \u2603, ady.ab.az, ady.aa.az) || this.b(nArray2, nArray, \u2603, i, n3, \u2603, ady.ac.az, ady.aa.az) || this.b(nArray2, nArray, \u2603, i, n3, \u2603, ady.V.az, ady.u.az)) continue;
                if (\u2603 == ady.r.az) {
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (\u2603 == ady.B.az || \u2603 == ady.B.az || \u2603 == ady.B.az || \u2603 == ady.B.az) {
                        nArray[\u2603 + i * n3] = ady.X.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = \u2603;
                    continue;
                }
                if (\u2603 == ady.v.az) {
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (\u2603 == ady.r.az || \u2603 == ady.r.az || \u2603 == ady.r.az || \u2603 == ady.r.az || \u2603 == ady.T.az || \u2603 == ady.T.az || \u2603 == ady.T.az || \u2603 == ady.T.az || \u2603 == ady.B.az || \u2603 == ady.B.az || \u2603 == ady.B.az || \u2603 == ady.B.az) {
                        nArray[\u2603 + i * n3] = ady.q.az;
                        continue;
                    }
                    if (\u2603 == ady.K.az || \u2603 == ady.K.az || \u2603 == ady.K.az || \u2603 == ady.K.az) {
                        nArray[\u2603 + i * n3] = ady.M.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = \u2603;
                    continue;
                }
                nArray[\u2603 + i * n3] = \u2603;
            }
        }
        return nArray;
    }

    private boolean a(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (arv.a(n4, n5)) {
            \u2603 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
            nArray2[n + n2 * n3] = !this.b(\u2603, n5) || !this.b(\u2603, n5) || !this.b(\u2603, n5) || !this.b(\u2603, n5) ? n6 : n4;
            return true;
        }
        return false;
    }

    private boolean b(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 == n5) {
            \u2603 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
            \u2603 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
            nArray2[n + n2 * n3] = !arv.a(\u2603, n5) || !arv.a(\u2603, n5) || !arv.a(\u2603, n5) || !arv.a(\u2603, n5) ? n6 : n4;
            return true;
        }
        return false;
    }

    private boolean b(int n, int n2) {
        if (arv.a(n, n2)) {
            return true;
        }
        ady ady2 = ady.e(n);
        \u2603 = ady.e(n2);
        if (ady2 != null && \u2603 != null) {
            ady.b b2 = ady2.m();
            return b2 == (\u2603 = \u2603.m()) || b2 == ady.b.c || \u2603 == ady.b.c;
        }
        return false;
    }
}
