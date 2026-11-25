/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class adu {
    private final le a;
    private final Random b;
    private final nq<a> c = new nq();
    private final List<Long> d = Lists.newArrayList();

    public adu(le le2) {
        this.a = le2;
        this.b = new Random(le2.J());
    }

    public void a(pk pk22, float f) {
        pk pk22;
        if (this.a.t.q() == 1) {
            int n2 = ns.c(pk22.s);
            \u2603 = ns.c(pk22.t) - 1;
            \u2603 = ns.c(pk22.u);
            \u2603 = 1;
            \u2603 = 0;
            for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                for (\u2603 = -2; \u2603 <= 2; ++\u2603) {
                    for (\u2603 = -1; \u2603 < 3; ++\u2603) {
                        \u2603 = n2 + \u2603 * \u2603 + \u2603 * \u2603;
                        \u2603 = \u2603 + \u2603;
                        \u2603 = \u2603 + \u2603 * \u2603 - \u2603 * \u2603;
                        boolean bl = \u2603 < 0;
                        this.a.a(new cj(\u2603, \u2603, \u2603), bl ? afi.Z.Q() : afi.a.Q());
                    }
                }
            }
            pk22.b(n2, \u2603, \u2603, pk22.y, 0.0f);
            pk22.x = 0.0;
            pk22.w = 0.0;
            pk22.v = 0.0;
            return;
        }
        if (this.b(pk22, f)) {
            return;
        }
        this.a(pk22);
        this.b(pk22, f);
    }

    public boolean b(pk pk22, float f) {
        cj \u26036;
        int n2 = 128;
        double \u26032 = -1.0;
        \u2603 = ns.c(pk22.s);
        \u2603 = ns.c(pk22.u);
        boolean \u26033 = true;
        cj \u26034 = cj.a;
        long \u26035 = adg.a(\u2603, \u2603);
        if (this.c.b(\u26035)) {
            \u26036 = this.c.a(\u26035);
            \u26032 = 0.0;
            \u26034 = \u26036;
            ((a)\u26036).c = this.a.K();
            \u26033 = false;
        } else {
            pk pk22;
            \u26036 = new cj(pk22);
            for (int i = -128; i <= 128; ++i) {
                for (\u2603 = -128; \u2603 <= 128; ++\u2603) {
                    cj cj2 = \u26036.a(i, this.a.V() - 1 - \u26036.o(), \u2603);
                    while (cj2.o() >= 0) {
                        cj cj3;
                        cj3 = cj2.b();
                        if (this.a.p(cj2).c() == afi.aY) {
                            while (this.a.p(cj3 = cj2.b()).c() == afi.aY) {
                                cj2 = cj3;
                            }
                            double d = cj2.i(\u26036);
                            if (\u26032 < 0.0 || d < \u26032) {
                                \u26032 = d;
                                \u26034 = cj2;
                            }
                        }
                        cj2 = cj3;
                    }
                }
            }
        }
        if (\u26032 >= 0.0) {
            if (\u26033) {
                this.c.a(\u26035, new a(\u26034, this.a.K()));
                this.d.add((Object)\u26035);
            }
            double d = (double)\u26034.n() + 0.5;
            \u2603 = (double)\u26034.o() + 0.5;
            \u2603 = (double)\u26034.p() + 0.5;
            amd.b \u26037 = afi.aY.f(this.a, \u26034);
            boolean \u26038 = \u26037.b().e().c() == cq.b.b;
            \u2603 = \u26037.b().k() == cq.a.a ? (double)\u26037.a().p() : (double)\u26037.a().n();
            \u2603 = (double)(\u26037.a().o() + 1) - pk22.aG().b * (double)\u26037.e();
            if (\u26038) {
                \u2603 += 1.0;
            }
            if (\u26037.b().k() == cq.a.a) {
                \u2603 = \u2603 + (1.0 - pk22.aG().a) * (double)\u26037.d() * (double)\u26037.b().e().c().a();
            } else {
                d = \u2603 + (1.0 - pk22.aG().a) * (double)\u26037.d() * (double)\u26037.b().e().c().a();
            }
            float \u26039 = 0.0f;
            float \u260310 = 0.0f;
            float \u260311 = 0.0f;
            float \u260312 = 0.0f;
            if (\u26037.b().d() == pk22.aH()) {
                \u26039 = 1.0f;
                \u260310 = 1.0f;
            } else if (\u26037.b().d() == pk22.aH().d()) {
                \u26039 = -1.0f;
                \u260310 = -1.0f;
            } else if (\u26037.b().d() == pk22.aH().e()) {
                \u260311 = 1.0f;
                \u260312 = -1.0f;
            } else {
                \u260311 = -1.0f;
                \u260312 = 1.0f;
            }
            \u2603 = pk22.v;
            \u2603 = pk22.x;
            pk22.v = \u2603 * (double)\u26039 + \u2603 * (double)\u260312;
            pk22.x = \u2603 * (double)\u260311 + \u2603 * (double)\u260310;
            pk22.y = f - (float)(pk22.aH().d().b() * 90) + (float)(\u26037.b().b() * 90);
            pk22.b(d, \u2603, \u2603, pk22.y, pk22.z);
            return true;
        }
        return false;
    }

    public boolean a(pk pk2) {
        int n2;
        int \u26037;
        int \u26036;
        int \u26035;
        int \u26034;
        int n3;
        double d;
        int n4;
        double d2;
        int n5 = 16;
        double \u26032 = -1.0;
        \u2603 = ns.c(pk2.s);
        \u2603 = ns.c(pk2.t);
        \u2603 = ns.c(pk2.u);
        \u26034 = \u2603;
        \u26035 = \u2603;
        \u26036 = \u2603;
        \u26037 = 0;
        \u2603 = this.b.nextInt(4);
        cj.a \u26033 = new cj.a();
        for (n2 = \u2603 - n5; n2 <= \u2603 + n5; ++n2) {
            d2 = (double)n2 + 0.5 - pk2.s;
            for (n4 = \u2603 - n5; n4 <= \u2603 + n5; ++n4) {
                d = (double)n4 + 0.5 - pk2.u;
                block2: for (n3 = this.a.V() - 1; n3 >= 0; --n3) {
                    if (!this.a.d(\u26033.c(n2, n3, n4))) continue;
                    while (n3 > 0 && this.a.d(\u26033.c(n2, n3 - 1, n4))) {
                        --n3;
                    }
                    for (\u2603 = \u2603; \u2603 < \u2603 + 4; ++\u2603) {
                        i = \u2603 % 2;
                        \u2603 = 1 - i;
                        if (\u2603 % 4 >= 2) {
                            i = -i;
                            \u2603 = -\u2603;
                        }
                        for (\u2603 = 0; \u2603 < 3; ++\u2603) {
                            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                                for (\u2603 = -1; \u2603 < 4; ++\u2603) {
                                    \u2603 = n2 + (\u2603 - 1) * i + \u2603 * \u2603;
                                    \u2603 = n3 + \u2603;
                                    \u2603 = n4 + (\u2603 - 1) * \u2603 - \u2603 * i;
                                    \u26033.c(\u2603, \u2603, \u2603);
                                    if (\u2603 < 0 && !this.a.p(\u26033).c().t().a() || \u2603 >= 0 && !this.a.d(\u26033)) continue block2;
                                }
                            }
                        }
                        double d3 = (double)n3 + 0.5 - pk2.t;
                        \u2603 = d2 * d2 + d3 * d3 + d * d;
                        if (!(\u26032 < 0.0) && !(\u2603 < \u26032)) continue;
                        \u26032 = \u2603;
                        \u26034 = n2;
                        \u26035 = n3;
                        \u26036 = n4;
                        \u26037 = \u2603 % 4;
                    }
                }
            }
        }
        if (\u26032 < 0.0) {
            for (n2 = \u2603 - n5; n2 <= \u2603 + n5; ++n2) {
                d2 = (double)n2 + 0.5 - pk2.s;
                for (n4 = \u2603 - n5; n4 <= \u2603 + n5; ++n4) {
                    d = (double)n4 + 0.5 - pk2.u;
                    block10: for (n3 = this.a.V() - 1; n3 >= 0; --n3) {
                        if (!this.a.d(\u26033.c(n2, n3, n4))) continue;
                        while (n3 > 0 && this.a.d(\u26033.c(n2, n3 - 1, n4))) {
                            --n3;
                        }
                        for (\u2603 = \u2603; \u2603 < \u2603 + 2; ++\u2603) {
                            i = \u2603 % 2;
                            \u2603 = 1 - i;
                            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                                for (\u2603 = -1; \u2603 < 4; ++\u2603) {
                                    \u2603 = n2 + (\u2603 - 1) * i;
                                    \u2603 = n3 + \u2603;
                                    \u2603 = n4 + (\u2603 - 1) * \u2603;
                                    \u26033.c(\u2603, \u2603, \u2603);
                                    if (\u2603 < 0 && !this.a.p(\u26033).c().t().a() || \u2603 >= 0 && !this.a.d(\u26033)) continue block10;
                                }
                            }
                            double d4 = (double)n3 + 0.5 - pk2.t;
                            \u2603 = d2 * d2 + d4 * d4 + d * d;
                            if (!(\u26032 < 0.0) && !(\u2603 < \u26032)) continue;
                            \u26032 = \u2603;
                            \u26034 = n2;
                            \u26035 = n3;
                            \u26036 = n4;
                            \u26037 = \u2603 % 2;
                        }
                    }
                }
            }
        }
        n2 = \u26037;
        \u2603 = \u26034;
        \u2603 = \u26035;
        n4 = \u26036;
        \u2603 = n2 % 2;
        \u2603 = 1 - \u2603;
        if (n2 % 4 >= 2) {
            \u2603 = -\u2603;
            \u2603 = -\u2603;
        }
        if (\u26032 < 0.0) {
            \u2603 = \u26035 = ns.a(\u26035, 70, this.a.V() - 10);
            for (n3 = -1; n3 <= 1; ++n3) {
                for (\u2603 = 1; \u2603 < 3; ++\u2603) {
                    for (i = -1; i < 3; ++i) {
                        \u2603 = \u2603 + (\u2603 - 1) * \u2603 + n3 * \u2603;
                        \u2603 = \u2603 + i;
                        \u2603 = n4 + (\u2603 - 1) * \u2603 - n3 * \u2603;
                        \u2603 = i < 0 ? 1 : 0;
                        this.a.a(new cj(\u2603, \u2603, \u2603), \u2603 != 0 ? afi.Z.Q() : afi.a.Q());
                    }
                }
            }
        }
        alz \u26038 = afi.aY.Q().a(aip.a, \u2603 != 0 ? cq.a.a : cq.a.c);
        for (\u2603 = 0; \u2603 < 4; ++\u2603) {
            for (i = 0; i < 4; ++i) {
                for (\u2603 = -1; \u2603 < 4; ++\u2603) {
                    \u2603 = \u2603 + (i - 1) * \u2603;
                    \u2603 = \u2603 + \u2603;
                    \u2603 = n4 + (i - 1) * \u2603;
                    boolean bl = i == 0 || i == 3 || \u2603 == -1 || \u2603 == 3;
                    this.a.a(new cj(\u2603, \u2603, \u2603), bl ? afi.Z.Q() : \u26038, 2);
                }
            }
            for (int i = 0; i < 4; ++i) {
                for (\u2603 = -1; \u2603 < 4; ++\u2603) {
                    \u2603 = \u2603 + (i - 1) * \u2603;
                    \u2603 = \u2603 + \u2603;
                    \u2603 = n4 + (i - 1) * \u2603;
                    cj cj2 = new cj(\u2603, \u2603, \u2603);
                    this.a.c(cj2, this.a.p(cj2).c());
                }
            }
        }
        return true;
    }

    public void a(long l) {
        if (l % 100L == 0L) {
            Iterator iterator = this.d.iterator();
            long \u26032 = l - 300L;
            while (iterator.hasNext()) {
                Long l2 = (Long)iterator.next();
                a \u26033 = this.c.a(l2);
                if (\u26033 != null && \u26033.c >= \u26032) continue;
                iterator.remove();
                this.c.d(l2);
            }
        }
    }

    public class a
    extends cj {
        public long c;

        public a(cj cj2, long l) {
            super(cj2.n(), cj2.o(), cj2.p());
            this.c = l;
        }
    }
}
