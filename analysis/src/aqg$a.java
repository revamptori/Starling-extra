/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public static class aqg.a
extends aqt {
    private boolean a;
    private boolean b;
    private boolean c;
    private int d;

    public aqg.a() {
    }

    @Override
    protected void a(dn dn2) {
        dn2.a("hr", this.a);
        dn2.a("sc", this.b);
        dn2.a("hps", this.c);
        dn2.a("Num", this.d);
    }

    @Override
    protected void b(dn dn2) {
        this.a = dn2.n("hr");
        this.b = dn2.n("sc");
        this.c = dn2.n("hps");
        this.d = dn2.f("Num");
    }

    public aqg.a(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.l = aqe2;
        this.a = random.nextInt(3) == 0;
        this.b = !this.a && random.nextInt(23) == 0;
        this.d = this.m == cq.c || this.m == cq.d ? aqe2.e() / 5 : aqe2.c() / 5;
    }

    public static aqe a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2) {
        int n4;
        aqe aqe2 = new aqe(n, n2, n3, n, n2 + 2, n3);
        for (n4 = random.nextInt(3) + 2; n4 > 0; --n4) {
            \u2603 = n4 * 5;
            switch (cq2) {
                case c: {
                    aqe2.d = n + 2;
                    aqe2.c = n3 - (\u2603 - 1);
                    break;
                }
                case d: {
                    aqe2.d = n + 2;
                    aqe2.f = n3 + (\u2603 - 1);
                    break;
                }
                case e: {
                    aqe2.a = n - (\u2603 - 1);
                    aqe2.f = n3 + 2;
                    break;
                }
                case f: {
                    aqe2.d = n + (\u2603 - 1);
                    aqe2.f = n3 + 2;
                }
            }
            if (aqt.a(list, aqe2) == null) break;
        }
        if (n4 > 0) {
            return aqe2;
        }
        return null;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        block25: {
            int n = this.d();
            \u2603 = random.nextInt(4);
            if (this.m != null) {
                switch (this.m) {
                    case c: {
                        if (\u2603 <= 1) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, this.m, n);
                            break;
                        }
                        if (\u2603 == 2) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.e, n);
                            break;
                        }
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, cq.f, n);
                        break;
                    }
                    case d: {
                        if (\u2603 <= 1) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, this.m, n);
                            break;
                        }
                        if (\u2603 == 2) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.e, n);
                            break;
                        }
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, cq.f, n);
                        break;
                    }
                    case e: {
                        if (\u2603 <= 1) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, n);
                            break;
                        }
                        if (\u2603 == 2) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, n);
                            break;
                        }
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, n);
                        break;
                    }
                    case f: {
                        if (\u2603 <= 1) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, this.m, n);
                            break;
                        }
                        if (\u2603 == 2) {
                            aqg.b(aqt2, (List<aqt>)list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.c - 1, cq.c, n);
                            break;
                        }
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.f + 1, cq.d, n);
                    }
                }
            }
            if (n >= 8) break block25;
            if (this.m == cq.c || this.m == cq.d) {
                \u2603 = this.l.c + 3;
                while (\u2603 + 3 <= this.l.f) {
                    \u2603 = random.nextInt(5);
                    if (\u2603 == 0) {
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b, \u2603, cq.e, n + 1);
                    } else if (\u2603 == 1) {
                        aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b, \u2603, cq.f, n + 1);
                    }
                    \u2603 += 5;
                }
            } else {
                \u2603 = this.l.a + 3;
                while (\u2603 + 3 <= this.l.d) {
                    \u2603 = random.nextInt(5);
                    if (\u2603 == 0) {
                        aqg.b(aqt2, (List<aqt>)list, random, \u2603, this.l.b, this.l.c - 1, cq.c, n + 1);
                    } else if (\u2603 == 1) {
                        aqg.b(aqt2, (List<aqt>)list, random, \u2603, this.l.b, this.l.f + 1, cq.d, n + 1);
                    }
                    \u2603 += 5;
                }
            }
        }
    }

    @Override
    protected boolean a(adm adm2, aqe aqe2, Random random, int n2, int n3, int n4, List<ob> list, int n5) {
        cj cj2 = new cj(this.a(n2, n4), this.d(n3), this.b(n2, n4));
        if (aqe2.b(cj2) && adm2.p(cj2).c().t() == arm.a) {
            int n6 = random.nextBoolean() ? 1 : 0;
            adm2.a(cj2, afi.av.a(this.a(afi.av, n6)), 2);
            vb \u26032 = new vb(adm2, (float)cj2.n() + 0.5f, (float)cj2.o() + 0.5f, (float)cj2.p() + 0.5f);
            ob.a(random, list, \u26032, n5);
            adm2.d(\u26032);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n2;
        if (this.a(adm2, aqe2)) {
            return false;
        }
        boolean bl = false;
        int \u26032 = 2;
        \u2603 = false;
        int \u26033 = 2;
        int \u26034 = this.d * 5 - 1;
        this.a(adm2, aqe2, 0, 0, 0, 2, 1, \u26034, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, random, 0.8f, 0, 2, 0, 2, 2, \u26034, afi.a.Q(), afi.a.Q(), false);
        if (this.b) {
            this.a(adm2, aqe2, random, 0.6f, 0, 0, 0, 2, 1, \u26034, afi.G.Q(), afi.a.Q(), false);
        }
        for (n2 = 0; n2 < this.d; ++n2) {
            \u2603 = 2 + n2 * 5;
            this.a(adm2, aqe2, 0, 0, \u2603, 0, 1, \u2603, afi.aO.Q(), afi.a.Q(), false);
            this.a(adm2, aqe2, 2, 0, \u2603, 2, 1, \u2603, afi.aO.Q(), afi.a.Q(), false);
            if (random.nextInt(4) == 0) {
                this.a(adm2, aqe2, 0, 2, \u2603, 0, 2, \u2603, afi.f.Q(), afi.a.Q(), false);
                this.a(adm2, aqe2, 2, 2, \u2603, 2, 2, \u2603, afi.f.Q(), afi.a.Q(), false);
            } else {
                this.a(adm2, aqe2, 0, 2, \u2603, 2, 2, \u2603, afi.f.Q(), afi.a.Q(), false);
            }
            this.a(adm2, aqe2, random, 0.1f, 0, 2, \u2603 - 1, afi.G.Q());
            this.a(adm2, aqe2, random, 0.1f, 2, 2, \u2603 - 1, afi.G.Q());
            this.a(adm2, aqe2, random, 0.1f, 0, 2, \u2603 + 1, afi.G.Q());
            this.a(adm2, aqe2, random, 0.1f, 2, 2, \u2603 + 1, afi.G.Q());
            this.a(adm2, aqe2, random, 0.05f, 0, 2, \u2603 - 2, afi.G.Q());
            this.a(adm2, aqe2, random, 0.05f, 2, 2, \u2603 - 2, afi.G.Q());
            this.a(adm2, aqe2, random, 0.05f, 0, 2, \u2603 + 2, afi.G.Q());
            this.a(adm2, aqe2, random, 0.05f, 2, 2, \u2603 + 2, afi.G.Q());
            this.a(adm2, aqe2, random, 0.05f, 1, 2, \u2603 - 1, afi.aa.a(cq.b.a()));
            this.a(adm2, aqe2, random, 0.05f, 1, 2, \u2603 + 1, afi.aa.a(cq.b.a()));
            if (random.nextInt(100) == 0) {
                this.a(adm2, aqe2, random, 2, 0, \u2603 - 1, ob.a((List<ob>)a, zy.cd.b(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.a(adm2, aqe2, random, 0, 0, \u2603 + 1, ob.a((List<ob>)a, zy.cd.b(random)), 3 + random.nextInt(4));
            }
            if (!this.b || this.c) continue;
            \u2603 = this.d(0);
            \u2603 = \u2603 - 1 + random.nextInt(3);
            \u26036 = this.a(1, \u2603);
            cj cj2 = new cj(\u26036, \u2603, \u2603 = this.b(1, \u2603));
            if (!aqe2.b(cj2)) continue;
            this.c = true;
            adm2.a(cj2, afi.ac.Q(), 2);
            akw \u26035 = adm2.s(cj2);
            if (!(\u26035 instanceof all)) continue;
            ((all)\u26035).b().a("CaveSpider");
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (\u2603 = 0; \u2603 <= \u26034; ++\u2603) {
                \u2603 = -1;
                alz alz2 = this.a(adm2, n2, \u2603, \u2603, aqe2);
                if (alz2.c().t() != arm.a) continue;
                int \u26036 = -1;
                this.a(adm2, afi.f.Q(), n2, \u26036, \u2603, aqe2);
            }
        }
        if (this.a) {
            for (n2 = 0; n2 <= \u26034; ++n2) {
                alz alz3 = this.a(adm2, 1, -1, n2, aqe2);
                if (alz3.c().t() == arm.a || !alz3.c().o()) continue;
                this.a(adm2, aqe2, random, 0.7f, 1, 0, n2, afi.av.a(this.a(afi.av, 0)));
            }
        }
        return true;
    }
}
