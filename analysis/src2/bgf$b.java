/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.BitSet
 */
import java.util.BitSet;

class bgf.b {
    private final float[] b = new float[4];
    private final int[] c = new int[4];

    public void a(adq adq2, afh afh2, cj cj2, cq cq2, float[] fArray, BitSet bitSet) {
        int \u260319;
        int \u260318;
        int \u260317;
        cj \u260316;
        int \u260315;
        cj cj3 = bitSet.get(0) ? cj2.a(cq2) : cj2;
        bgf.a \u26032 = bgf.a.a(cq2);
        \u2603 = cj3.a(\u26032.g[0]);
        \u2603 = cj3.a(\u26032.g[1]);
        \u2603 = cj3.a(\u26032.g[2]);
        \u2603 = cj3.a(\u26032.g[3]);
        int \u26033 = afh2.c(adq2, \u2603);
        int \u26034 = afh2.c(adq2, \u2603);
        int \u26035 = afh2.c(adq2, \u2603);
        int \u26036 = afh2.c(adq2, \u2603);
        float \u26037 = adq2.p(\u2603).c().h();
        float \u26038 = adq2.p(\u2603).c().h();
        float \u26039 = adq2.p(\u2603).c().h();
        float \u260310 = adq2.p(\u2603).c().h();
        boolean \u260311 = adq2.p(\u2603.a(cq2)).c().q();
        boolean \u260312 = adq2.p(\u2603.a(cq2)).c().q();
        boolean \u260313 = adq2.p(\u2603.a(cq2)).c().q();
        boolean \u260314 = adq2.p(\u2603.a(cq2)).c().q();
        if (\u260313 || \u260311) {
            \u260316 = \u2603.a(\u26032.g[2]);
            float f = adq2.p(\u260316).c().h();
            \u260315 = afh2.c(adq2, \u260316);
        } else {
            f = \u26037;
            \u260315 = \u26033;
        }
        if (\u260314 || \u260311) {
            \u260316 = \u2603.a(\u26032.g[3]);
            f = adq2.p(\u260316).c().h();
            \u260317 = afh2.c(adq2, \u260316);
        } else {
            f = \u26037;
            \u260317 = \u26033;
        }
        if (\u260313 || \u260312) {
            \u260316 = \u2603.a(\u26032.g[2]);
            \u2603 = adq2.p(\u260316).c().h();
            \u260318 = afh2.c(adq2, \u260316);
        } else {
            \u2603 = \u26038;
            \u260318 = \u26034;
        }
        if (\u260314 || \u260312) {
            \u260316 = \u2603.a(\u26032.g[3]);
            \u2603 = adq2.p(\u260316).c().h();
            \u260319 = afh2.c(adq2, \u260316);
        } else {
            \u2603 = \u26038;
            \u260319 = \u26034;
        }
        int n = afh2.c(adq2, cj2);
        if (bitSet.get(0) || !adq2.p(cj2.a(cq2)).c().c()) {
            n = afh2.c(adq2, cj2.a(cq2));
        }
        float \u260320 = bitSet.get(0) ? adq2.p(cj3).c().h() : adq2.p(cj2).c().h();
        bgf.c \u260321 = bgf.c.a(cq2);
        if (!bitSet.get(1) || !\u26032.i) {
            float f = (\u260310 + \u26037 + f + \u260320) * 0.25f;
            \u2603 = (\u26039 + \u26037 + f + \u260320) * 0.25f;
            \u2603 = (\u26039 + \u26038 + \u2603 + \u260320) * 0.25f;
            \u2603 = (\u260310 + \u26038 + \u2603 + \u260320) * 0.25f;
            this.c[((bgf.c)\u260321).g] = this.a(\u26036, \u26033, \u260317, n);
            this.c[((bgf.c)\u260321).h] = this.a(\u26035, \u26033, \u260315, n);
            this.c[((bgf.c)\u260321).i] = this.a(\u26035, \u26034, \u260318, n);
            this.c[((bgf.c)\u260321).j] = this.a(\u26036, \u26034, \u260319, n);
            this.b[((bgf.c)\u260321).g] = f;
            this.b[((bgf.c)\u260321).h] = \u2603;
            this.b[((bgf.c)\u260321).i] = \u2603;
            this.b[((bgf.c)\u260321).j] = \u2603;
        } else {
            float f;
            \u2603 = (\u260310 + \u26037 + f + \u260320) * 0.25f;
            \u2603 = (\u26039 + \u26037 + f + \u260320) * 0.25f;
            \u2603 = (\u26039 + \u26038 + \u2603 + \u260320) * 0.25f;
            \u2603 = (\u260310 + \u26038 + \u2603 + \u260320) * 0.25f;
            \u2603 = fArray[\u26032.j[0].m] * fArray[\u26032.j[1].m];
            \u2603 = fArray[\u26032.j[2].m] * fArray[\u26032.j[3].m];
            \u2603 = fArray[\u26032.j[4].m] * fArray[\u26032.j[5].m];
            \u2603 = fArray[\u26032.j[6].m] * fArray[\u26032.j[7].m];
            \u2603 = fArray[\u26032.k[0].m] * fArray[\u26032.k[1].m];
            \u2603 = fArray[\u26032.k[2].m] * fArray[\u26032.k[3].m];
            \u2603 = fArray[\u26032.k[4].m] * fArray[\u26032.k[5].m];
            \u2603 = fArray[\u26032.k[6].m] * fArray[\u26032.k[7].m];
            \u2603 = fArray[\u26032.l[0].m] * fArray[\u26032.l[1].m];
            \u2603 = fArray[\u26032.l[2].m] * fArray[\u26032.l[3].m];
            \u2603 = fArray[\u26032.l[4].m] * fArray[\u26032.l[5].m];
            \u2603 = fArray[\u26032.l[6].m] * fArray[\u26032.l[7].m];
            \u2603 = fArray[\u26032.m[0].m] * fArray[\u26032.m[1].m];
            \u2603 = fArray[\u26032.m[2].m] * fArray[\u26032.m[3].m];
            \u2603 = fArray[\u26032.m[4].m] * fArray[\u26032.m[5].m];
            \u2603 = fArray[\u26032.m[6].m] * fArray[\u26032.m[7].m];
            this.b[((bgf.c)\u260321).g] = \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
            this.b[((bgf.c)\u260321).h] = \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
            this.b[((bgf.c)\u260321).i] = \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
            this.b[((bgf.c)\u260321).j] = \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
            int \u260322 = this.a(\u26036, \u26033, \u260317, n);
            int \u260323 = this.a(\u26035, \u26033, \u260315, n);
            int \u260324 = this.a(\u26035, \u26034, \u260318, n);
            int \u260325 = this.a(\u26036, \u26034, \u260319, n);
            this.c[((bgf.c)\u260321).g] = this.a(\u260322, \u260323, \u260324, \u260325, \u2603, \u2603, \u2603, \u2603);
            this.c[((bgf.c)\u260321).h] = this.a(\u260322, \u260323, \u260324, \u260325, \u2603, \u2603, \u2603, \u2603);
            this.c[((bgf.c)\u260321).i] = this.a(\u260322, \u260323, \u260324, \u260325, \u2603, \u2603, \u2603, \u2603);
            this.c[((bgf.c)\u260321).j] = this.a(\u260322, \u260323, \u260324, \u260325, \u2603, \u2603, \u2603, \u2603);
        }
    }

    private int a(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    private int a(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> 16 & 0xFF) * f + (float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4) & 0xFF;
        \u2603 = (int)((float)(n & 0xFF) * f + (float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4) & 0xFF;
        return n5 << 16 | \u2603;
    }

    static /* synthetic */ int[] a(bgf.b b2) {
        return b2.c;
    }

    static /* synthetic */ float[] b(bgf.b b2) {
        return b2.b;
    }
}
