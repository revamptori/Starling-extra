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

public class aoa
implements amv {
    private Random h;
    private arc i;
    private arc j;
    private arc k;
    private ard l;
    public arc a;
    public arc b;
    public arc c;
    private adm m;
    private final boolean n;
    private adr o;
    private final double[] p;
    private final float[] q;
    private ant r;
    private afh s = afi.j;
    private double[] t = new double[256];
    private any u = new anx();
    private aqo v = new aqo();
    private aqv w = new aqv();
    private aqf x = new aqf();
    private aqm y = new aqm();
    private any z = new anr();
    private aqk A = new aqk();
    private ady[] B;
    double[] d;
    double[] e;
    double[] f;
    double[] g;

    public aoa(adm adm2, long l, boolean bl, String string2) {
        String string2;
        this.m = adm2;
        this.n = bl;
        this.o = adm2.P().u();
        this.h = new Random(l);
        this.i = new arc(this.h, 16);
        this.j = new arc(this.h, 16);
        this.k = new arc(this.h, 8);
        this.l = new ard(this.h, 4);
        this.a = new arc(this.h, 10);
        this.b = new arc(this.h, 16);
        this.c = new arc(this.h, 8);
        this.p = new double[825];
        this.q = new float[25];
        for (int i = -2; i <= 2; ++i) {
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                this.q[i + 2 + (\u2603 + 2) * 5] = \u2603 = 10.0f / ns.c((float)(i * i + \u2603 * \u2603) + 0.2f);
            }
        }
        if (string2 != null) {
            this.r = ant.a.a(string2).b();
            this.s = this.r.E ? afi.l : afi.j;
            adm2.b(this.r.q);
        }
    }

    public void a(int n, int n2, ans ans2) {
        this.B = this.m.v().a(this.B, n * 4 - 2, n2 * 4 - 2, 10, 10);
        this.a(n * 4, 0, n2 * 4);
        for (int i = 0; i < 4; ++i) {
            \u2603 = i * 5;
            \u2603 = (i + 1) * 5;
            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                \u2603 = (\u2603 + \u2603) * 33;
                \u2603 = (\u2603 + \u2603 + 1) * 33;
                \u2603 = (\u2603 + \u2603) * 33;
                \u2603 = (\u2603 + \u2603 + 1) * 33;
                for (\u2603 = 0; \u2603 < 32; ++\u2603) {
                    double d2 = 0.125;
                    \u2603 = this.p[\u2603 + \u2603];
                    \u2603 = this.p[\u2603 + \u2603];
                    \u2603 = this.p[\u2603 + \u2603];
                    \u2603 = this.p[\u2603 + \u2603];
                    d3 = (this.p[\u2603 + \u2603 + 1] - \u2603) * d2;
                    \u2603 = (this.p[\u2603 + \u2603 + 1] - \u2603) * d2;
                    \u2603 = (this.p[\u2603 + \u2603 + 1] - \u2603) * d2;
                    \u2603 = (this.p[\u2603 + \u2603 + 1] - \u2603) * d2;
                    for (int j = 0; j < 8; ++j) {
                        double d3;
                        double d4 = 0.25;
                        \u2603 = \u2603;
                        \u2603 = \u2603;
                        d5 = (\u2603 - \u2603) * d4;
                        \u2603 = (\u2603 - \u2603) * d4;
                        for (int k = 0; k < 4; ++k) {
                            double d5;
                            double d6 = 0.25;
                            \u2603 = \u2603;
                            \u2603 = (\u2603 - \u2603) * d6;
                            \u2603 -= \u2603;
                            for (int i2 = 0; i2 < 4; ++i2) {
                                double d7;
                                \u2603 += \u2603;
                                if (d7 > 0.0) {
                                    ans2.a(i * 4 + k, \u2603 * 8 + j, \u2603 * 4 + i2, afi.b.Q());
                                    continue;
                                }
                                if (\u2603 * 8 + j >= this.r.q) continue;
                                ans2.a(i * 4 + k, \u2603 * 8 + j, \u2603 * 4 + i2, this.s.Q());
                            }
                            \u2603 += d5;
                            \u2603 += \u2603;
                        }
                        \u2603 += d3;
                        \u2603 += \u2603;
                        \u2603 += \u2603;
                        \u2603 += \u2603;
                    }
                }
            }
        }
    }

    public void a(int n, int n2, ans ans2, ady[] adyArray) {
        double d2 = 0.03125;
        this.t = this.l.a(this.t, n * 16, n2 * 16, 16, 16, d2 * 2.0, d2 * 2.0, 1.0);
        for (int i = 0; i < 16; ++i) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                ady ady2 = adyArray[\u2603 + i * 16];
                ady2.a(this.m, this.h, ans2, n * 16 + i, n2 * 16 + \u2603, this.t[\u2603 + i * 16]);
            }
        }
    }

    @Override
    public amy d(int n, int n2) {
        this.h.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        ans ans2 = new ans();
        this.a(n, n2, ans2);
        this.B = this.m.v().b(this.B, n * 16, n2 * 16, 16, 16);
        this.a(n, n2, ans2, this.B);
        if (this.r.r) {
            this.u.a(this, this.m, n, n2, ans2);
        }
        if (this.r.z) {
            this.z.a(this, this.m, n, n2, ans2);
        }
        if (this.r.w && this.n) {
            this.x.a(this, this.m, n, n2, ans2);
        }
        if (this.r.v && this.n) {
            this.w.a(this, this.m, n, n2, ans2);
        }
        if (this.r.u && this.n) {
            this.v.a(this, this.m, n, n2, ans2);
        }
        if (this.r.x && this.n) {
            this.y.a(this, this.m, n, n2, ans2);
        }
        if (this.r.y && this.n) {
            this.A.a(this, this.m, n, n2, ans2);
        }
        amy \u26032 = new amy(this.m, ans2, n, n2);
        byte[] \u26033 = \u26032.k();
        for (int i = 0; i < \u26033.length; ++i) {
            \u26033[i] = (byte)this.B[i].az;
        }
        \u26032.b();
        return \u26032;
    }

    private void a(int \u260332, int n, int \u260322) {
        this.g = this.b.a(this.g, \u260332, \u260322, 5, 5, this.r.e, this.r.f, this.r.g);
        float f = this.r.a;
        \u2603 = this.r.b;
        this.d = this.k.a(this.d, \u260332, n, \u260322, 5, 33, 5, f / this.r.h, \u2603 / this.r.i, f / this.r.j);
        this.e = this.i.a(this.e, \u260332, n, \u260322, 5, 33, 5, f, \u2603, f);
        this.f = this.j.a(this.f, \u260332, n, \u260322, 5, 33, 5, f, \u2603, f);
        int \u260322 = 0;
        int \u260332 = 0;
        int n2 = 0;
        \u2603 = 0;
        for (\u2603 = 0; \u2603 < 5; ++\u2603) {
            for (\u2603 = 0; \u2603 < 5; ++\u2603) {
                float f2 = 0.0f;
                \u2603 = 0.0f;
                \u2603 = 0.0f;
                int \u26034 = 2;
                ady \u26035 = this.B[\u2603 + 2 + (\u2603 + 2) * 10];
                for (int i = -\u26034; i <= \u26034; ++i) {
                    for (\u2603 = -\u26034; \u2603 <= \u26034; ++\u2603) {
                        ady ady2 = this.B[\u2603 + i + 2 + (\u2603 + \u2603 + 2) * 10];
                        float \u26036 = this.r.n + ady2.an * this.r.m;
                        float \u26037 = this.r.p + ady2.ao * this.r.o;
                        if (this.o == adr.e && \u26036 > 0.0f) {
                            \u26036 = 1.0f + \u26036 * 2.0f;
                            \u26037 = 1.0f + \u26037 * 4.0f;
                        }
                        float \u26038 = this.q[i + 2 + (\u2603 + 2) * 5] / (\u26036 + 2.0f);
                        if (ady2.an > \u26035.an) {
                            \u26038 /= 2.0f;
                        }
                        f2 += \u26037 * \u26038;
                        \u2603 += \u26036 * \u26038;
                        \u2603 += \u26038;
                    }
                }
                f2 /= \u2603;
                \u2603 /= \u2603;
                f2 = f2 * 0.9f + 0.1f;
                \u2603 = (\u2603 * 4.0f - 1.0f) / 8.0f;
                double \u26039 = this.g[\u2603] / 8000.0;
                if (\u26039 < 0.0) {
                    \u26039 = -\u26039 * 0.3;
                }
                if ((\u26039 = \u26039 * 3.0 - 2.0) < 0.0) {
                    if ((\u26039 /= 2.0) < -1.0) {
                        \u26039 = -1.0;
                    }
                    \u26039 /= 1.4;
                    \u26039 /= 2.0;
                } else {
                    if (\u26039 > 1.0) {
                        \u26039 = 1.0;
                    }
                    \u26039 /= 8.0;
                }
                ++\u2603;
                double \u260310 = \u2603;
                double \u260311 = f2;
                \u260310 += \u26039 * 0.2;
                \u260310 = \u260310 * (double)this.r.k / 8.0;
                double \u260312 = (double)this.r.k + \u260310 * 4.0;
                for (int i = 0; i < 33; ++i) {
                    double d2 = ((double)i - \u260312) * (double)this.r.l * 128.0 / 256.0 / \u260311;
                    if (d2 < 0.0) {
                        d2 *= 4.0;
                    }
                    \u2603 = this.e[n2] / (double)this.r.d;
                    \u2603 = this.f[n2] / (double)this.r.c;
                    \u2603 = (this.d[n2] / 10.0 + 1.0) / 2.0;
                    \u2603 = ns.b(\u2603, \u2603, \u2603) - d2;
                    if (i > 29) {
                        \u2603 = (float)(i - 29) / 3.0f;
                        \u2603 = \u2603 * (1.0 - \u2603) + -10.0 * \u2603;
                    }
                    this.p[n2] = \u2603;
                    ++n2;
                }
            }
        }
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public void a(amv amv2, int n, int n2) {
        int n3;
        int n4;
        agr.N = true;
        n3 = n * 16;
        \u2603 = n2 * 16;
        cj \u26037 = new cj(n3, 0, \u2603);
        ady \u26032 = this.m.b(\u26037.a(16, 0, 16));
        this.h.setSeed(this.m.J());
        long \u26033 = this.h.nextLong() / 2L * 2L + 1L;
        long \u26034 = this.h.nextLong() / 2L * 2L + 1L;
        this.h.setSeed((long)n * \u26033 + (long)n2 * \u26034 ^ this.m.J());
        boolean \u26035 = false;
        adg \u26036 = new adg(n, n2);
        if (this.r.w && this.n) {
            this.x.a(this.m, this.h, \u26036);
        }
        if (this.r.v && this.n) {
            \u26035 = this.w.a(this.m, this.h, \u26036);
        }
        if (this.r.u && this.n) {
            this.v.a(this.m, this.h, \u26036);
        }
        if (this.r.x && this.n) {
            this.y.a(this.m, this.h, \u26036);
        }
        if (this.r.y && this.n) {
            this.A.a(this.m, this.h, \u26036);
        }
        if (\u26032 != ady.r && \u26032 != ady.G && this.r.A && !\u26035 && this.h.nextInt(this.r.B) == 0) {
            n4 = this.h.nextInt(16) + 8;
            \u2603 = this.h.nextInt(256);
            \u2603 = this.h.nextInt(16) + 8;
            new apc(afi.j).b(this.m, this.h, \u26037.a(n4, \u2603, \u2603));
        }
        if (!\u26035 && this.h.nextInt(this.r.D / 10) == 0 && this.r.C) {
            n4 = this.h.nextInt(16) + 8;
            \u2603 = this.h.nextInt(this.h.nextInt(248) + 8);
            \u2603 = this.h.nextInt(16) + 8;
            if (\u2603 < this.m.F() || this.h.nextInt(this.r.D / 8) == 0) {
                new apc(afi.l).b(this.m, this.h, \u26037.a(n4, \u2603, \u2603));
            }
        }
        if (this.r.s) {
            for (n4 = 0; n4 < this.r.t; ++n4) {
                \u2603 = this.h.nextInt(16) + 8;
                \u2603 = this.h.nextInt(256);
                \u2603 = this.h.nextInt(16) + 8;
                new api().b(this.m, this.h, \u26037.a(\u2603, \u2603, \u2603));
            }
        }
        \u26032.a(this.m, this.h, new cj(n3, 0, \u2603));
        adt.a(this.m, \u26032, n3 + 8, \u2603 + 8, 16, 16, this.h);
        \u26037 = \u26037.a(8, 0, 8);
        for (n4 = 0; n4 < 16; ++n4) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                cj cj2 = this.m.q(\u26037.a(n4, 0, \u2603));
                \u2603 = cj2.b();
                if (this.m.v(\u2603)) {
                    this.m.a(\u2603, afi.aI.Q(), 2);
                }
                if (!this.m.f(cj2, true)) continue;
                this.m.a(cj2, afi.aH.Q(), 2);
            }
        }
        agr.N = false;
    }

    @Override
    public boolean a(amv amv2, amy amy2, int n, int n2) {
        boolean bl = false;
        if (this.r.y && this.n && amy2.w() < 3600L) {
            bl |= this.A.a(this.m, this.h, new adg(n, n2));
        }
        return bl;
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
        ady ady2 = this.m.b(cj2);
        if (this.n) {
            if (pt2 == pt.a && this.y.a(cj2)) {
                return this.y.b();
            }
            if (pt2 == pt.a && this.r.y && this.A.a(this.m, cj2)) {
                return this.A.b();
            }
        }
        return ady2.a(pt2);
    }

    @Override
    public cj a(adm adm2, String string, cj cj2) {
        if ("Stronghold".equals((Object)string) && this.v != null) {
            return this.v.b(adm2, cj2);
        }
        return null;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void a(amy amy2, int n, int n2) {
        if (this.r.w && this.n) {
            this.x.a(this, this.m, n, n2, null);
        }
        if (this.r.v && this.n) {
            this.w.a(this, this.m, n, n2, null);
        }
        if (this.r.u && this.n) {
            this.v.a(this, this.m, n, n2, null);
        }
        if (this.r.x && this.n) {
            this.y.a(this, this.m, n, n2, null);
        }
        if (this.r.y && this.n) {
            this.A.a(this, this.m, n, n2, null);
        }
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }
}
