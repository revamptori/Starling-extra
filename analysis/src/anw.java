/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public class anw
implements amv {
    private final adm h;
    private final boolean i;
    private final Random j;
    private double[] k = new double[256];
    private double[] l = new double[256];
    private double[] m = new double[256];
    private double[] n;
    private final arc o;
    private final arc p;
    private final arc q;
    private final arc r;
    private final arc s;
    public final arc a;
    public final arc b;
    private final aow t = new aow();
    private final apd u = new apd();
    private final aox v = new aox();
    private final aot w = new apj(afi.co.Q(), 14, amg.a(afi.aV));
    private final aoy x = new aoy(afi.k, true);
    private final aoy y = new aoy(afi.k, false);
    private final aom z = new aom(afi.P);
    private final aom A = new aom(afi.Q);
    private final aqi B = new aqi();
    private final any C = new anz();
    double[] c;
    double[] d;
    double[] e;
    double[] f;
    double[] g;

    public anw(adm adm2, boolean bl, long l) {
        this.h = adm2;
        this.i = bl;
        this.j = new Random(l);
        this.o = new arc(this.j, 16);
        this.p = new arc(this.j, 16);
        this.q = new arc(this.j, 8);
        this.r = new arc(this.j, 4);
        this.s = new arc(this.j, 4);
        this.a = new arc(this.j, 10);
        this.b = new arc(this.j, 16);
        adm2.b(63);
    }

    public void a(int n, int n2, ans ans2) {
        int n3 = 4;
        \u2603 = this.h.F() / 2 + 1;
        \u2603 = n3 + 1;
        \u2603 = 17;
        \u2603 = n3 + 1;
        this.n = this.a(this.n, n * n3, 0, n2 * n3, \u2603, \u2603, \u2603);
        for (\u2603 = 0; \u2603 < n3; ++\u2603) {
            for (\u2603 = 0; \u2603 < n3; ++\u2603) {
                for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                    double d = 0.125;
                    \u2603 = this.n[((\u2603 + 0) * \u2603 + (\u2603 + 0)) * \u2603 + (\u2603 + 0)];
                    \u2603 = this.n[((\u2603 + 0) * \u2603 + (\u2603 + 1)) * \u2603 + (\u2603 + 0)];
                    \u2603 = this.n[((\u2603 + 1) * \u2603 + (\u2603 + 0)) * \u2603 + (\u2603 + 0)];
                    \u2603 = this.n[((\u2603 + 1) * \u2603 + (\u2603 + 1)) * \u2603 + (\u2603 + 0)];
                    \u2603 = (this.n[((\u2603 + 0) * \u2603 + (\u2603 + 0)) * \u2603 + (\u2603 + 1)] - \u2603) * d;
                    \u2603 = (this.n[((\u2603 + 0) * \u2603 + (\u2603 + 1)) * \u2603 + (\u2603 + 1)] - \u2603) * d;
                    \u2603 = (this.n[((\u2603 + 1) * \u2603 + (\u2603 + 0)) * \u2603 + (\u2603 + 1)] - \u2603) * d;
                    \u2603 = (this.n[((\u2603 + 1) * \u2603 + (\u2603 + 1)) * \u2603 + (\u2603 + 1)] - \u2603) * d;
                    for (int i = 0; i < 8; ++i) {
                        double d2 = 0.25;
                        \u2603 = \u2603;
                        \u2603 = \u2603;
                        \u2603 = (\u2603 - \u2603) * d2;
                        \u2603 = (\u2603 - \u2603) * d2;
                        for (int j = 0; j < 4; ++j) {
                            double d3 = 0.25;
                            \u2603 = \u2603;
                            \u2603 = (\u2603 - \u2603) * d3;
                            for (int k = 0; k < 4; ++k) {
                                alz alz2 = null;
                                if (\u2603 * 8 + i < \u2603) {
                                    alz2 = afi.l.Q();
                                }
                                if (\u2603 > 0.0) {
                                    alz2 = afi.aV.Q();
                                }
                                int \u26032 = j + \u2603 * 4;
                                int \u26033 = i + \u2603 * 8;
                                int \u26034 = k + \u2603 * 4;
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

    public void b(int n, int n2, ans ans2) {
        int n3 = this.h.F() + 1;
        double \u26032 = 0.03125;
        this.k = this.r.a(this.k, n * 16, n2 * 16, 0, 16, 16, 1, \u26032, \u26032, 1.0);
        this.l = this.r.a(this.l, n * 16, 109, n2 * 16, 16, 1, 16, \u26032, 1.0, \u26032);
        this.m = this.s.a(this.m, n * 16, n2 * 16, 0, 16, 16, 1, \u26032 * 2.0, \u26032 * 2.0, \u26032 * 2.0);
        for (\u2603 = 0; \u2603 < 16; ++\u2603) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                boolean bl = this.k[\u2603 + \u2603 * 16] + this.j.nextDouble() * 0.2 > 0.0;
                \u2603 = this.l[\u2603 + \u2603 * 16] + this.j.nextDouble() * 0.2 > 0.0;
                int \u26033 = (int)(this.m[\u2603 + \u2603 * 16] / 3.0 + 3.0 + this.j.nextDouble() * 0.25);
                int \u26034 = -1;
                alz \u26035 = afi.aV.Q();
                alz \u26036 = afi.aV.Q();
                for (int i = 127; i >= 0; --i) {
                    if (i >= 127 - this.j.nextInt(5) || i <= this.j.nextInt(5)) {
                        ans2.a(\u2603, i, \u2603, afi.h.Q());
                        continue;
                    }
                    alz alz2 = ans2.a(\u2603, i, \u2603);
                    if (alz2.c() == null || alz2.c().t() == arm.a) {
                        \u26034 = -1;
                        continue;
                    }
                    if (alz2.c() != afi.aV) continue;
                    if (\u26034 == -1) {
                        if (\u26033 <= 0) {
                            \u26035 = null;
                            \u26036 = afi.aV.Q();
                        } else if (i >= n3 - 4 && i <= n3 + 1) {
                            \u26035 = afi.aV.Q();
                            \u26036 = afi.aV.Q();
                            if (\u2603) {
                                \u26035 = afi.n.Q();
                                \u26036 = afi.aV.Q();
                            }
                            if (bl) {
                                \u26035 = afi.aW.Q();
                                \u26036 = afi.aW.Q();
                            }
                        }
                        if (i < n3 && (\u26035 == null || \u26035.c().t() == arm.a)) {
                            \u26035 = afi.l.Q();
                        }
                        \u26034 = \u26033;
                        if (i >= n3 - 1) {
                            ans2.a(\u2603, i, \u2603, \u26035);
                            continue;
                        }
                        ans2.a(\u2603, i, \u2603, \u26036);
                        continue;
                    }
                    if (\u26034 <= 0) continue;
                    --\u26034;
                    ans2.a(\u2603, i, \u2603, \u26036);
                }
            }
        }
    }

    @Override
    public amy d(int n, int n2) {
        this.j.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        ans ans2 = new ans();
        this.a(n, n2, ans2);
        this.b(n, n2, ans2);
        this.C.a(this, this.h, n, n2, ans2);
        if (this.i) {
            this.B.a(this, this.h, n, n2, ans2);
        }
        amy \u26032 = new amy(this.h, ans2, n, n2);
        ady[] \u26033 = this.h.v().b(null, n * 16, n2 * 16, 16, 16);
        byte[] \u26034 = \u26032.k();
        for (int i = 0; i < \u26034.length; ++i) {
            \u26034[i] = (byte)\u26033[i].az;
        }
        \u26032.l();
        return \u26032;
    }

    private double[] a(double[] dArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        double[] dArray2;
        if (dArray2 == null) {
            dArray2 = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        \u2603 = 2053.236;
        this.f = this.a.a(this.f, n, n2, n3, n4, 1, n6, 1.0, 0.0, 1.0);
        this.g = this.b.a(this.g, n, n2, n3, n4, 1, n6, 100.0, 0.0, 100.0);
        this.c = this.q.a(this.c, n, n2, n3, n4, n5, n6, d / 80.0, \u2603 / 60.0, d / 80.0);
        this.d = this.o.a(this.d, n, n2, n3, n4, n5, n6, d, \u2603, d);
        this.e = this.p.a(this.e, n, n2, n3, n4, n5, n6, d, \u2603, d);
        int \u26032 = 0;
        double[] \u26033 = new double[n5];
        for (n7 = 0; n7 < n5; ++n7) {
            \u26033[n7] = Math.cos((double)((double)n7 * Math.PI * 6.0 / (double)n5)) * 2.0;
            double d2 = n7;
            if (n7 > n5 / 2) {
                d2 = n5 - 1 - n7;
            }
            if (!(d2 < 4.0)) continue;
            d2 = 4.0 - d2;
            int n8 = n7;
            \u26033[n8] = \u26033[n8] - d2 * d2 * d2 * 10.0;
        }
        for (n7 = 0; n7 < n4; ++n7) {
            for (\u2603 = 0; \u2603 < n6; ++\u2603) {
                double d3 = 0.0;
                for (int i = 0; i < n5; ++i) {
                    double d4 = 0.0;
                    \u2603 = \u26033[i];
                    \u2603 = this.d[\u26032] / 512.0;
                    \u2603 = this.e[\u26032] / 512.0;
                    \u2603 = (this.c[\u26032] / 10.0 + 1.0) / 2.0;
                    d4 = \u2603 < 0.0 ? \u2603 : (\u2603 > 1.0 ? \u2603 : \u2603 + (\u2603 - \u2603) * \u2603);
                    d4 -= \u2603;
                    if (i > n5 - 4) {
                        \u2603 = (float)(i - (n5 - 4)) / 3.0f;
                        d4 = d4 * (1.0 - \u2603) + -10.0 * \u2603;
                    }
                    if ((double)i < d3) {
                        \u2603 = (d3 - (double)i) / 4.0;
                        \u2603 = ns.a(\u2603, 0.0, 1.0);
                        d4 = d4 * (1.0 - \u2603) + -10.0 * \u2603;
                    }
                    dArray2[\u26032] = d4;
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
        int n3;
        agr.N = true;
        cj cj2 = new cj(n * 16, 0, n2 * 16);
        adg \u26032 = new adg(n, n2);
        this.B.a(this.h, this.j, \u26032);
        for (n3 = 0; n3 < 8; ++n3) {
            this.y.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (n3 = 0; n3 < this.j.nextInt(this.j.nextInt(10) + 1) + 1; ++n3) {
            this.t.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (n3 = 0; n3 < this.j.nextInt(this.j.nextInt(10) + 1); ++n3) {
            this.u.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (n3 = 0; n3 < 10; ++n3) {
            this.v.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        if (this.j.nextBoolean()) {
            this.z.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        if (this.j.nextBoolean()) {
            this.A.b(this.h, this.j, cj2.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        for (n3 = 0; n3 < 16; ++n3) {
            this.w.b(this.h, this.j, cj2.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
        }
        for (n3 = 0; n3 < 16; ++n3) {
            this.x.b(this.h, this.j, cj2.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
        }
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
        return "HellRandomLevelSource";
    }

    @Override
    public List<ady.c> a(pt pt2, cj cj2) {
        if (pt2 == pt.a) {
            if (this.B.b(cj2)) {
                return this.B.b();
            }
            if (this.B.a(this.h, cj2) && this.h.p(cj2.b()).c() == afi.by) {
                return this.B.b();
            }
        }
        ady ady2 = this.h.b(cj2);
        return ady2.a(pt2);
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
        this.B.a(this, this.h, n, n2, null);
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }
}
