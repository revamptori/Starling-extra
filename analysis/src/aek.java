/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Arrays
 *  java.util.Random
 */
import java.util.Arrays;
import java.util.Random;

public class aek
extends ady {
    private alz[] aD;
    private long aE;
    private ard aF;
    private ard aG;
    private ard aH;
    private boolean aI;
    private boolean aJ;

    public aek(int n, boolean bl, boolean bl2) {
        super(n);
        this.aI = bl;
        this.aJ = bl2;
        this.b();
        this.a(2.0f, 0.0f);
        this.au.clear();
        this.ak = afi.m.Q().a(ajh.a, ajh.a.b);
        this.al = afi.cu.Q();
        this.as.A = -999;
        this.as.D = 20;
        this.as.F = 3;
        this.as.G = 5;
        this.as.B = 0;
        this.au.clear();
        if (bl2) {
            this.as.A = 5;
        }
    }

    @Override
    public aoh a(Random random) {
        return this.aA;
    }

    @Override
    public int c(cj cj2) {
        return 10387789;
    }

    @Override
    public int b(cj cj2) {
        return 9470285;
    }

    @Override
    public void a(adm adm2, Random random, cj cj2) {
        super.a(adm2, random, cj2);
    }

    @Override
    public void a(adm adm22, Random random, ans ans22, int n3, int n2, double d) {
        int n3;
        adm adm22;
        if (this.aD == null || this.aE != adm22.J()) {
            this.a(adm22.J());
        }
        if (this.aF == null || this.aG == null || this.aE != adm22.J()) {
            Random random2 = new Random(this.aE);
            this.aF = new ard(random2, 4);
            this.aG = new ard(random2, 1);
        }
        this.aE = adm22.J();
        double \u26032 = 0.0;
        if (this.aI) {
            int n4 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
            \u2603 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
            double \u26033 = Math.min((double)Math.abs((double)d), (double)this.aF.a((double)n4 * 0.25, (double)\u2603 * 0.25));
            if (\u26033 > 0.0) {
                \u26032 = \u26033 * \u26033 * 2.5;
                double d2 = 0.001953125;
                \u2603 = Math.abs((double)this.aG.a((double)n4 * d2, (double)\u2603 * d2));
                \u2603 = Math.ceil((double)(\u2603 * 50.0)) + 14.0;
                if (\u26032 > \u2603) {
                    \u26032 = \u2603;
                }
                \u26032 += 64.0;
            }
        }
        n4 = n3 & 0xF;
        \u2603 = n2 & 0xF;
        \u2603 = adm22.F();
        alz \u26034 = afi.cu.Q();
        alz \u26035 = this.al;
        \u2603 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean \u26036 = Math.cos((double)(d / 3.0 * Math.PI)) > 0.0;
        n5 = -1;
        boolean \u26037 = false;
        for (\u2603 = 255; \u2603 >= 0; --\u2603) {
            alz \u26038;
            int n5;
            if (ans22.a(\u2603, \u2603, n4).c().t() == arm.a && \u2603 < (int)\u26032) {
                ans22.a(\u2603, \u2603, n4, afi.b.Q());
            }
            if (\u2603 <= random.nextInt(5)) {
                ans22.a(\u2603, \u2603, n4, afi.h.Q());
                continue;
            }
            alz alz2 = ans22.a(\u2603, \u2603, n4);
            if (alz2.c().t() == arm.a) {
                n5 = -1;
                continue;
            }
            if (alz2.c() != afi.b) continue;
            if (n5 == -1) {
                ans ans22;
                \u26037 = false;
                if (\u2603 <= 0) {
                    \u26034 = null;
                    \u26035 = afi.b.Q();
                } else if (\u2603 >= \u2603 - 4 && \u2603 <= \u2603 + 1) {
                    \u26034 = afi.cu.Q();
                    \u26035 = this.al;
                }
                if (\u2603 < \u2603 && (\u26034 == null || \u26034.c().t() == arm.a)) {
                    \u26034 = afi.j.Q();
                }
                n5 = \u2603 + Math.max((int)0, (int)(\u2603 - \u2603));
                if (\u2603 >= \u2603 - 1) {
                    if (this.aJ && \u2603 > 86 + \u2603 * 2) {
                        if (\u26036) {
                            ans22.a(\u2603, \u2603, n4, afi.d.Q().a(agf.a, agf.a.b));
                            continue;
                        }
                        ans22.a(\u2603, \u2603, n4, afi.c.Q());
                        continue;
                    }
                    if (\u2603 > \u2603 + 3 + \u2603) {
                        \u26038 = \u2603 < 64 || \u2603 > 127 ? afi.cu.Q().a(afv.a, zd.b) : (\u26036 ? afi.cz.Q() : this.a(n3, \u2603, n2));
                        ans22.a(\u2603, \u2603, n4, \u26038);
                        continue;
                    }
                    ans22.a(\u2603, \u2603, n4, this.ak);
                    \u26037 = true;
                    continue;
                }
                ans22.a(\u2603, \u2603, n4, \u26035);
                if (\u26035.c() != afi.cu) continue;
                ans22.a(\u2603, \u2603, n4, \u26035.c().Q().a(afv.a, zd.b));
                continue;
            }
            if (n5 <= 0) continue;
            --n5;
            if (\u26037) {
                ans22.a(\u2603, \u2603, n4, afi.cu.Q().a(afv.a, zd.b));
                continue;
            }
            \u26038 = this.a(n3, \u2603, n2);
            ans22.a(\u2603, \u2603, n4, \u26038);
        }
    }

    private void a(long l) {
        int \u26035;
        int \u26034;
        int \u26033;
        int \u26032;
        this.aD = new alz[64];
        Arrays.fill((Object[])this.aD, (Object)afi.cz.Q());
        Random random = new Random(l);
        this.aH = new ard(random, 1);
        for (\u26032 = 0; \u26032 < 64; ++\u26032) {
            if ((\u26032 += random.nextInt(5) + 1) >= 64) continue;
            this.aD[\u26032] = afi.cu.Q().a(afv.a, zd.b);
        }
        \u26032 = random.nextInt(4) + 2;
        for (\u26033 = 0; \u26033 < \u26032; ++\u26033) {
            \u26034 = random.nextInt(3) + 1;
            \u26035 = random.nextInt(64);
            for (\u26036 = 0; \u26035 + \u26036 < 64 && \u26036 < \u26034; ++\u26036) {
                this.aD[\u26035 + \u26036] = afi.cu.Q().a(afv.a, zd.e);
            }
        }
        \u26033 = random.nextInt(4) + 2;
        for (\u26034 = 0; \u26034 < \u26033; ++\u26034) {
            \u26035 = random.nextInt(3) + 2;
            \u26036 = random.nextInt(64);
            for (i = 0; \u26036 + i < 64 && i < \u26035; ++i) {
                this.aD[\u26036 + i] = afi.cu.Q().a(afv.a, zd.m);
            }
        }
        \u26034 = random.nextInt(4) + 2;
        for (\u26035 = 0; \u26035 < \u26034; ++\u26035) {
            \u26036 = random.nextInt(3) + 1;
            i = random.nextInt(64);
            for (\u2603 = 0; i + \u2603 < 64 && \u2603 < \u26036; ++\u2603) {
                this.aD[i + \u2603] = afi.cu.Q().a(afv.a, zd.o);
            }
        }
        \u26035 = random.nextInt(3) + 3;
        int \u26036 = 0;
        for (int i = 0; i < \u26035; ++i) {
            \u2603 = 1;
            \u26036 += random.nextInt(16) + 4;
            for (\u2603 = 0; \u26036 + \u2603 < 64 && \u2603 < \u2603; ++\u2603) {
                this.aD[\u26036 + \u2603] = afi.cu.Q().a(afv.a, zd.a);
                if (\u26036 + \u2603 > 1 && random.nextBoolean()) {
                    this.aD[\u26036 + \u2603 - 1] = afi.cu.Q().a(afv.a, zd.i);
                }
                if (\u26036 + \u2603 >= 63 || !random.nextBoolean()) continue;
                this.aD[\u26036 + \u2603 + 1] = afi.cu.Q().a(afv.a, zd.i);
            }
        }
    }

    private alz a(int n, int n2, int n3) {
        \u2603 = (int)Math.round((double)(this.aH.a((double)n * 1.0 / 512.0, (double)n * 1.0 / 512.0) * 2.0));
        return this.aD[(n2 + \u2603 + 64) % 64];
    }

    @Override
    protected ady d(int n) {
        boolean bl = this.az == ady.aa.az;
        aek \u26032 = new aek(n, bl, this.aJ);
        if (!bl) {
            \u26032.a(g);
            \u26032.a(this.ah + " M");
        } else {
            \u26032.a(this.ah + " (Bryce)");
        }
        \u26032.a(this.ai, true);
        return \u26032;
    }
}
