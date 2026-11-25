/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class arw
extends ase {
    private ady[] c = new ady[]{ady.r, ady.r, ady.r, ady.Y, ady.Y, ady.q};
    private ady[] d = new ady[]{ady.t, ady.S, ady.s, ady.q, ady.Q, ady.v};
    private ady[] e = new ady[]{ady.t, ady.s, ady.u, ady.q};
    private ady[] f = new ady[]{ady.B, ady.B, ady.B, ady.T};
    private final ant g;

    public arw(long l, ase ase2, adr adr2, String string) {
        super(l);
        this.a = ase2;
        if (adr2 == adr.h) {
            this.c = new ady[]{ady.r, ady.t, ady.s, ady.v, ady.q, ady.u};
            this.g = null;
        } else {
            this.g = adr2 == adr.f ? ant.a.a(string).b() : null;
        }
    }

    @Override
    public int[] a(int n, int n2, int n3, int n4) {
        int[] nArray;
        int[] nArray2 = this.a.a(n, n2, n3, n4);
        nArray = asc.a(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                this.a((long)(\u2603 + n), (long)(i + n2));
                \u2603 = nArray2[\u2603 + i * n3];
                \u2603 = (\u2603 & 0xF00) >> 8;
                \u2603 &= 0xFFFFF0FF;
                if (this.g != null && this.g.F >= 0) {
                    nArray[\u2603 + i * n3] = this.g.F;
                    continue;
                }
                if (arw.b(\u2603)) {
                    nArray[\u2603 + i * n3] = \u2603;
                    continue;
                }
                if (\u2603 == ady.D.az) {
                    nArray[\u2603 + i * n3] = \u2603;
                    continue;
                }
                if (\u2603 == 1) {
                    if (\u2603 > 0) {
                        if (this.a(3) == 0) {
                            nArray[\u2603 + i * n3] = ady.ac.az;
                            continue;
                        }
                        nArray[\u2603 + i * n3] = ady.ab.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = this.c[this.a((int)this.c.length)].az;
                    continue;
                }
                if (\u2603 == 2) {
                    if (\u2603 > 0) {
                        nArray[\u2603 + i * n3] = ady.K.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = this.d[this.a((int)this.d.length)].az;
                    continue;
                }
                if (\u2603 == 3) {
                    if (\u2603 > 0) {
                        nArray[\u2603 + i * n3] = ady.V.az;
                        continue;
                    }
                    nArray[\u2603 + i * n3] = this.e[this.a((int)this.e.length)].az;
                    continue;
                }
                nArray[\u2603 + i * n3] = \u2603 == 4 ? this.f[this.a((int)this.f.length)].az : ady.D.az;
            }
        }
        return nArray;
    }
}
