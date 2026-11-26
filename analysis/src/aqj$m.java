/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

static abstract class aqj.m
extends aqt {
    protected static final List<ob> a = Lists.newArrayList((Object[])new ob[]{new ob(zy.i, 0, 1, 3, 5), new ob(zy.j, 0, 1, 5, 5), new ob(zy.k, 0, 1, 3, 15), new ob(zy.B, 0, 1, 1, 5), new ob(zy.ah, 0, 1, 1, 5), new ob(zy.d, 0, 1, 1, 5), new ob(zy.by, 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 8), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 3), new ob(zw.a(afi.Z), 0, 2, 4, 2)});

    public aqj.m() {
    }

    protected aqj.m(int n2) {
        super(n2);
    }

    @Override
    protected void b(dn dn2) {
    }

    @Override
    protected void a(dn dn2) {
    }

    private int a(List<aqj.n> list) {
        boolean bl = false;
        int \u26032 = 0;
        for (aqj.n n22 : list) {
            aqj.n n22;
            if (n22.d > 0 && n22.c < n22.d) {
                bl = true;
            }
            \u26032 += n22.b;
        }
        return bl ? \u26032 : -1;
    }

    private aqj.m a(aqj.q q2, List<aqj.n> list, List<aqt> list22, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        List<aqt> list22;
        \u2603 = this.a(list);
        boolean bl = \u2603 > 0 && n5 <= 30;
        int \u26032 = 0;
        block0: while (\u26032 < 5 && bl) {
            ++\u26032;
            int n6 = random.nextInt(\u2603);
            for (aqj.n n7 : list) {
                if ((n6 -= n7.b) >= 0) continue;
                if (!n7.a(n5) || n7 == q2.b && !n7.e) continue block0;
                aqj.m m2 = aqj.b(n7, (List<aqt>)list22, random, n2, n3, n4, cq2, n5);
                if (m2 == null) continue;
                ++n7.c;
                q2.b = n7;
                if (!n7.a()) {
                    list.remove((Object)n7);
                }
                return m2;
            }
        }
        return aqj.b.a(list22, random, n2, n3, n4, cq2, n5);
    }

    private aqt a(aqj.q q2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5, boolean bl) {
        if (Math.abs((int)(n2 - q2.c().a)) > 112 || Math.abs((int)(n4 - q2.c().c)) > 112) {
            return aqj.b.a(list, random, n2, n3, n4, cq2, n5);
        }
        List<aqj.n> list2 = q2.c;
        if (bl) {
            list2 = q2.d;
        }
        if ((\u2603 = this.a(q2, list2, list, random, n2, n3, n4, cq2, n5 + 1)) != null) {
            list.add((Object)\u2603);
            q2.e.add((Object)\u2603);
        }
        return \u2603;
    }

    protected aqt a(aqj.q q2, List<aqt> list, Random random, int n2, int n3, boolean bl) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return this.a(q2, list, random, this.l.a + n2, this.l.b + n3, this.l.c - 1, this.m, this.d(), bl);
                }
                case d: {
                    return this.a(q2, list, random, this.l.a + n2, this.l.b + n3, this.l.f + 1, this.m, this.d(), bl);
                }
                case e: {
                    return this.a(q2, list, random, this.l.a - 1, this.l.b + n3, this.l.c + n2, this.m, this.d(), bl);
                }
                case f: {
                    return this.a(q2, list, random, this.l.d + 1, this.l.b + n3, this.l.c + n2, this.m, this.d(), bl);
                }
            }
        }
        return null;
    }

    protected aqt b(aqj.q q2, List<aqt> list, Random random, int n2, int n3, boolean bl) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return this.a(q2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d(), bl);
                }
                case d: {
                    return this.a(q2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d(), bl);
                }
                case e: {
                    return this.a(q2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d(), bl);
                }
                case f: {
                    return this.a(q2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d(), bl);
                }
            }
        }
        return null;
    }

    protected aqt c(aqj.q q2, List<aqt> list, Random random, int n2, int n3, boolean bl) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return this.a(q2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d(), bl);
                }
                case d: {
                    return this.a(q2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d(), bl);
                }
                case e: {
                    return this.a(q2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d(), bl);
                }
                case f: {
                    return this.a(q2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d(), bl);
                }
            }
        }
        return null;
    }

    protected static boolean a(aqe aqe2) {
        return aqe2 != null && aqe2.b > 10;
    }
}
