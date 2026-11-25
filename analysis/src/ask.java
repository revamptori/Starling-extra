/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class ask
extends ase {
    private ase c;
    private ase d;

    public ask(long l, ase ase2, ase ase3) {
        super(l);
        this.c = ase2;
        this.d = ase3;
    }

    @Override
    public void a(long l) {
        this.c.a(l);
        this.d.a(l);
        super.a(l);
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        int[] nArray;
        int[] nArray2 = this.c.a(n, n2, n3, n4);
        \u2603 = this.d.a(n, n2, n3, n4);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n3 * n4; ++i) {
            if (nArray2[i] == ady.p.az || nArray2[i] == ady.N.az) {
                nArray[i] = nArray2[i];
                continue;
            }
            if (\u2603[i] == ady.w.az) {
                if (nArray2[i] == ady.B.az) {
                    nArray[i] = ady.A.az;
                    continue;
                }
                if (nArray2[i] == ady.D.az || nArray2[i] == ady.E.az) {
                    nArray[i] = ady.E.az;
                    continue;
                }
                nArray[i] = \u2603[i] & 0xFF;
                continue;
            }
            nArray[i] = nArray2[i];
        }
        return nArray;
    }
}
