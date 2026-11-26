/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public class aob
implements amv {
    private Random h;
    private arc i;
    private arc j;
    private arc k;
    public arc a;
    public arc b;
    private adm l;
    private double[] m;
    private ady[] n;
    double[] c;
    double[] d;
    double[] e;
    double[] f;
    double[] g;

    public aob(adm adm2, long l) {
        this.l = adm2;
        this.h = new Random(l);
        this.i = new arc(this.h, 16);
        this.j = new arc(this.h, 16);
        this.k = new arc(this.h, 8);
        this.a = new arc(this.h, 10);
        this.b = new arc(this.h, 16);
    }

    public void a(int n, int n2, ans ans2) {
        int n3 = 2;
        \u2603 = n3 + 1;
        \u2603 = 33;
        \u2603 = n3 + 1;
        this.m = this.a(this.m, n * n3, 0, n2 * n3, \u2603, \u2603, \u2603);
        for (\u2603 = 0; \u2603 < n3; ++\u2603) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                for (\u2603 = 0; \u2603 < 32; ++\u2603) {
                    double d = 0.25;
                    \u2603 = this.m[((\u2603 + 0) * \u2603 + \u2603 + 0) * \u2603 + \u2603 + 0];
                    \u2603 = this.m[((\u2603 + 0) * \u2603 + \u2603 + 1) * \u2603 + \u2603 + 0];
                    \u2603 = this.m[((\u2603 + 1) * \u2603 + \u2603 + 0) * \u2603 + \u2603 + 0];
                    \u2603 = this.m[((\u2603 + 1) * \u2603 + \u2603 + 1) * \u2603 + \u2603 + 0];
                    \u2603 = (this.m[((\u2603 + 0) * \u2603 + \u2603 + 0) * \u2603 + \u2603 + 1] - \u2603) * d;
                    \u2603 = (this.m[((\u2603 + 0) * \u2603 + \u2603 + 1) * \u2603 + \u2603 + 1] - \u2603) * d;
                    \u2603 = (this.m[((\u2603 + 1) * \u2603 + \u2603 + 0) * \u2603 + \u2603 + 1] - \u2603) * d;
                    \u2603 = (this.m[((\u2603 + 1) * \u2603 + \u2603 + 1) * \u2603 + \u2603 + 1] - \u2603) * d;
                    for (int i = 0; i < 4; ++i) {
                        double d2 = 0.125;
                        \u2603 = \u2603;
                        \u2603 = \u2603;
                        \u2603 = (\u2603 - \u2603) * d2;
                        \u2603 = (\u2603 - \u2603) * d2;
                        for (int j = 0; j < 8; ++j) {
                            double d3 = 0.125;
                            \u2603 = \u2603;
                            \u2603 = (\u2603 - \u2603) * d3;
                            for (int k = 0; k < 8; ++k) {
                                alz alz2 = null;
                                if (\u2603 > 0.0) {
                                    alz2 = afi.bH.Q();
                                }
                                int \u26032 = j + \u2603 * 8;
                                int \u26033 = i + \u2603 * 4;
                                int \u26034 = k + \u2603 * 8;
                                ans2.a(\u26032, \u26033, \u26034, alz2);
                                \u2603 += \u2603;
                            }
                            \u2603 += \u2603;
                            \u2603 += \u2603;
                        }
                        \u2603 += \u2603;
                        \u2603 += \u2603;
                        \u2603 += \u2603;
                        \u2603 += \u2603;
                    }
                }
            }
        }
    }

    public void a(ans ans2) {
        for (int i = 0; i < 16; ++i) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                \u2603 = 1;
                n = -1;
                alz alz2 = afi.bH.Q();
                \u2603 = afi.bH.Q();
                for (int j = 127; j >= 0; --j) {
                    int n;
                    alz alz3 = ans2.a(i, j, \u2603);
                    if (alz3.c().t() == arm.a) {
                        n = -1;
                        continue;
                    }
                    if (alz3.c() != afi.b) continue;
                    if (n == -1) {
                        if (\u2603 <= 0) {
                            alz2 = afi.a.Q();
                            \u2603 = afi.bH.Q();
                        }
                        n = \u2603;
                        if (j >= 0) {
                            ans2.a(i, j, \u2603, alz2);
                            continue;
                        }
                        ans2.a(i, j, \u2603, \u2603);
                        continue;
                    }
                    if (n <= 0) continue;
                    --n;
                    ans2.a(i, j, \u2603, \u2603);
                }
            }
        }
    }

    @Override
    public amy d(int n, int n2) {
        this.h.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        ans ans2 = new ans();
        this.n = this.l.v().b(this.n, n * 16, n2 * 16, 16, 16);
        this.a(n, n2, ans2);
        this.a(ans2);
        amy \u26032 = new amy(this.l, ans2, n, n2);
        byte[] \u26033 = \u26032.k();
        for (int i = 0; i < \u26033.length; ++i) {
            \u26033[i] = (byte)this.n[i].az;
        }
        \u26032.b();
        return \u26032;
    }

    private double[] a(double[] dArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (dArray2 == null) {
            double[] dArray2 = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        \u2603 = 684.412;
        this.f = this.a.a(this.f, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.g = this.b.a(this.g, n, n3, n4, n6, 200.0, 200.0, 0.5);
        this.c = this.k.a(this.c, n, n2, n3, n4, n5, n6, (d *= 2.0) / 80.0, \u2603 / 160.0, d / 80.0);
        this.d = this.i.a(this.d, n, n2, n3, n4, n5, n6, d, \u2603, d);
        this.e = this.j.a(this.e, n, n2, n3, n4, n5, n6, d, \u2603, d);
        int \u26032 = 0;
        for (int i = 0; i < n4; ++i) {
            for (\u2603 = 0; \u2603 < n6; ++\u2603) {
                float f = (float)(i + n) / 1.0f;
                \u2603 = (float)(\u2603 + n3) / 1.0f;
                \u2603 = 100.0f - ns.c(f * f + \u2603 * \u2603) * 8.0f;
                if (\u2603 > 80.0f) {
                    \u2603 = 80.0f;
                }
                if (\u2603 < -100.0f) {
                    \u2603 = -100.0f;
                }
                for (int j = 0; j < n5; ++j) {
                    double d2 = 0.0;
                    \u2603 = this.d[\u26032] / 512.0;
                    \u2603 = this.e[\u26032] / 512.0;
                    \u2603 = (this.c[\u26032] / 10.0 + 1.0) / 2.0;
                    d2 = \u2603 < 0.0 ? \u2603 : (\u2603 > 1.0 ? \u2603 : \u2603 + (\u2603 - \u2603) * \u2603);
                    d2 -= 8.0;
                    d2 += (double)\u2603;
                    int \u26033 = 2;
                    if (j > n5 / 2 - \u26033) {
                        \u2603 = (float)(j - (n5 / 2 - \u26033)) / 64.0f;
                        \u2603 = ns.a(\u2603, 0.0, 1.0);
                        d2 = d2 * (1.0 - \u2603) + -3000.0 * \u2603;
                    }
                    if (j < (\u26033 = 8)) {
                        \u2603 = (float)(\u26033 - j) / ((float)\u26033 - 1.0f);
                        d2 = d2 * (1.0 - \u2603) + -30.0 * \u2603;
                    }
                    dArray2[\u26032] = d2;
                    ++\u26032;
                }
            }
        }
        return dArray2;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public void a(amv amv2, int n, int n2) {
        agr.N = true;
        cj cj2 = new cj(n * 16, 0, n2 * 16);
        this.l.b(cj2.a(16, 0, 16)).a(this.l, this.l.s, cj2);
        agr.N = false;
    }

    @Override
    public boolean a(amv amv2, amy amy2, int n, int n2) {
        return false;
    }

    @Override
    public boolean a(boolean bl, nu nu2) {
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public String f() {
        return "RandomLevelSource";
    }

    @Override
    public List<ady.c> a(pt pt2, cj cj2) {
        return this.l.b(cj2).a(pt2);
    }

    @Override
    public cj a(adm adm2, String string, cj cj2) {
        return null;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void a(amy amy2, int n, int n2) {
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }
}
