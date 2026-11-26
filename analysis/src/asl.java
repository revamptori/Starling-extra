/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class asl
extends ase {
    public asl(long l, ase ase2) {
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
                int n5;
                int n6;
                this.a((long)(\u2603 + n), (long)(i + n2));
                n5 = nArray2[\u2603 + 1 + (i + 1) * (n3 + 2)];
                ady ady2 = ady.e(n5);
                if (n5 == ady.D.az) {
                    n6 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n6 == ady.p.az || \u2603 == ady.p.az || \u2603 == ady.p.az || \u2603 == ady.p.az) {
                        nArray[\u2603 + i * n3] = ady.E.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = n5;
                    continue;
                }
                if (ady2 != null && ady2.l() == aej.class) {
                    n6 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (!(this.c(n6) && this.c(\u2603) && this.c(\u2603) && this.c(\u2603))) {
                        nArray[\u2603 + i * n3] = ady.M.az;
                        continue;
                    }
                    if (asl.b(n6) || asl.b(\u2603) || asl.b(\u2603) || asl.b(\u2603)) {
                        nArray[\u2603 + i * n3] = ady.F.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = n5;
                    continue;
                }
                if (n5 == ady.s.az || n5 == ady.X.az || n5 == ady.J.az) {
                    this.a(nArray2, nArray, \u2603, i, n3, n5, ady.O.az);
                    continue;
                }
                if (ady2 != null && ady2.j()) {
                    this.a(nArray2, nArray, \u2603, i, n3, n5, ady.P.az);
                    continue;
                }
                if (n5 == ady.aa.az || n5 == ady.ab.az) {
                    n6 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (asl.b(n6) || asl.b(\u2603) || asl.b(\u2603) || asl.b(\u2603)) {
                        nArray[\u2603 + i * n3] = n5;
                        continue;
                    }
                    if (!(this.d(n6) && this.d(\u2603) && this.d(\u2603) && this.d(\u2603))) {
                        nArray[\u2603 + i * n3] = ady.r.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = n5;
                    continue;
                }
                if (n5 != ady.p.az && n5 != ady.N.az && n5 != ady.w.az && n5 != ady.v.az) {
                    n6 = nArray2[\u2603 + 1 + (i + 1 - 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 - 1 + (i + 1) * (n3 + 2)];
                    \u2603 = nArray2[\u2603 + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (asl.b(n6) || asl.b(\u2603) || asl.b(\u2603) || asl.b(\u2603)) {
                        nArray[\u2603 + i * n3] = ady.F.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = n5;
                    continue;
                }
                nArray[\u2603 + i * n3] = n5;
            }
        }
        return nArray;
    }

    private void a(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5) {
        if (asl.b(n4)) {
            nArray2[n + n2 * n3] = n4;
            return;
        }
        \u2603 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        \u2603 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        \u2603 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        \u2603 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        nArray2[n + n2 * n3] = asl.b(\u2603) || asl.b(\u2603) || asl.b(\u2603) || asl.b(\u2603) ? n5 : n4;
    }

    private boolean c(int n) {
        if (ady.e(n) != null && ady.e(n).l() == aej.class) {
            return true;
        }
        return n == ady.M.az || n == ady.K.az || n == ady.L.az || n == ady.t.az || n == ady.u.az || asl.b(n);
    }

    private boolean d(int n) {
        return ady.e(n) instanceof aek;
    }
}
