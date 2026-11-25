/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public static class aql.h
extends aql.r {
    private aql.v o;
    private aql.v p;
    private List<aql.r> q = Lists.newArrayList();

    public aql.h() {
    }

    public aql.h(Random random, int n2, int n3, cq cq2) {
        super(0);
        Object object2;
        this.m = cq2;
        switch (this.m) {
            case c: 
            case d: {
                this.l = new aqe(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
                break;
            }
            default: {
                this.l = new aqe(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
            }
        }
        List<aql.v> list = this.a(random);
        this.o.d = true;
        this.q.add((Object)new aql.p(this.m, this.o));
        this.q.add((Object)new aql.j(this.m, this.p, random));
        ArrayList \u26032 = Lists.newArrayList();
        \u26032.add((Object)new aql.b(null));
        \u26032.add((Object)new aql.d(null));
        \u26032.add((Object)new aql.e(null));
        \u26032.add((Object)new aql.a(null));
        \u26032.add((Object)new aql.c(null));
        \u26032.add((Object)new aql.g(null));
        \u26032.add((Object)new aql.f(null));
        block3: for (aql.v v2 : list) {
            if (v2.d || v2.b()) continue;
            for (Object object2 : \u26032) {
                if (!object2.a(v2)) continue;
                this.q.add((Object)object2.a(this.m, v2, random));
                continue block3;
            }
        }
        int n4 = this.l.b;
        \u2603 = this.a(9, 22);
        \u2603 = this.b(9, 22);
        for (Object object3 : this.q) {
            ((aqt)object3).c().a(\u2603, n4, \u2603);
        }
        object2 = aqe.a(this.a(1, 1), this.d(1), this.b(1, 1), this.a(23, 21), this.d(8), this.b(23, 21));
        object3 = aqe.a(this.a(34, 1), this.d(1), this.b(34, 1), this.a(56, 21), this.d(8), this.b(56, 21));
        aqe \u26033 = aqe.a(this.a(22, 22), this.d(13), this.b(22, 22), this.a(35, 35), this.d(17), this.b(35, 35));
        int \u26034 = random.nextInt();
        this.q.add((Object)new aql.u(this.m, (aqe)object2, \u26034++));
        this.q.add((Object)new aql.u(this.m, (aqe)object3, \u26034++));
        this.q.add((Object)new aql.q(this.m, \u26033));
    }

    private List<aql.v> a(Random random) {
        int n2;
        aql.v[] vArray = new aql.v[75];
        for (int n22 = 0; n22 < 5; ++n22) {
            for (int i2 = 0; i2 < 4; ++i2) {
                \u2603 = 0;
                \u2603 = aql.h.b(n22, \u2603, i2);
                vArray[\u2603] = new aql.v(\u2603);
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            for (i2 = 0; i2 < 4; ++i2) {
                \u2603 = 1;
                \u2603 = aql.h.b(n2, \u2603, i2);
                vArray[\u2603] = new aql.v(\u2603);
            }
        }
        for (n2 = 1; n2 < 4; ++n2) {
            for (i2 = 0; i2 < 2; ++i2) {
                \u2603 = 2;
                \u2603 = aql.h.b(n2, \u2603, i2);
                vArray[\u2603] = new aql.v(\u2603);
            }
        }
        this.o = vArray[g];
        for (n2 = 0; n2 < 5; ++n2) {
            for (i2 = 0; i2 < 5; ++i2) {
                for (\u2603 = 0; \u2603 < 3; ++\u2603) {
                    \u2603 = aql.h.b(n2, \u2603, i2);
                    if (vArray[\u2603] == null) continue;
                    for (cq cq2 : cq.values()) {
                        int n3 = n2 + cq2.g();
                        \u2603 = \u2603 + cq2.h();
                        \u2603 = i2 + cq2.i();
                        if (n3 < 0 || n3 >= 5 || \u2603 < 0 || \u2603 >= 5 || \u2603 < 0 || \u2603 >= 3 || vArray[\u2603 = aql.h.b(n3, \u2603, \u2603)] == null) continue;
                        if (\u2603 != i2) {
                            vArray[\u2603].a(cq2.d(), vArray[\u2603]);
                            continue;
                        }
                        vArray[\u2603].a(cq2, vArray[\u2603]);
                    }
                }
            }
        }
        aql.v v2 = new aql.v(1003);
        vArray[h].a(cq.b, v2);
        aql.v v3 = new aql.v(1001);
        vArray[i].a(cq.d, v3);
        \u2603 = new aql.v(1002);
        vArray[j].a(cq.d, \u2603);
        v2.d = true;
        v3.d = true;
        \u2603.d = true;
        this.o.e = true;
        this.p = vArray[aql.h.b(random.nextInt(4), 0, 2)];
        this.p.d = true;
        this.p.b[cq.f.a()].d = true;
        this.p.b[cq.c.a()].d = true;
        this.p.b[cq.f.a()].b[cq.c.a()].d = true;
        this.p.b[cq.b.a()].d = true;
        this.p.b[cq.f.a()].b[cq.b.a()].d = true;
        this.p.b[cq.c.a()].b[cq.b.a()].d = true;
        this.p.b[cq.f.a()].b[cq.c.a()].b[cq.b.a()].d = true;
        ArrayList \u26032 = Lists.newArrayList();
        for (aql.v v4 : vArray) {
            if (v4 == null) continue;
            v4.a();
            \u26032.add((Object)v4);
        }
        v2.a();
        Collections.shuffle((List)\u26032, (Random)random);
        int \u26033 = 1;
        for (aql.v v32 : \u26032) {
            int n3 = 0;
            for (int i3 = 0; n3 < 2 && i3 < 5; ++i3) {
                \u2603 = random.nextInt(6);
                if (!v32.c[\u2603]) continue;
                \u2603 = cq.a(\u2603).d().a();
                v32.c[\u2603] = false;
                v32.b[\u2603].c[\u2603] = false;
                if (v32.a(\u26033++) && v32.b[\u2603].a(\u26033++)) {
                    ++n3;
                    continue;
                }
                v32.c[\u2603] = true;
                v32.b[\u2603].c[\u2603] = true;
            }
        }
        \u26032.add((Object)v2);
        \u26032.add((Object)v3);
        \u26032.add((Object)\u2603);
        return \u26032;
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n2 = Math.max((int)adm2.F(), (int)64) - this.l.b;
        this.a(adm2, aqe2, 0, 0, 0, 58, n2, 58, false);
        this.a(false, 0, adm2, random, aqe2);
        this.a(true, 33, adm2, random, aqe2);
        this.b(adm2, random, aqe2);
        this.c(adm2, random, aqe2);
        this.d(adm2, random, aqe2);
        this.e(adm2, random, aqe2);
        this.f(adm2, random, aqe2);
        this.g(adm2, random, aqe2);
        for (\u2603 = 0; \u2603 < 7; ++\u2603) {
            \u2603 = 0;
            while (\u2603 < 7) {
                if (\u2603 == 0 && \u2603 == 3) {
                    \u2603 = 6;
                }
                \u2603 = \u2603 * 9;
                \u2603 = \u2603 * 9;
                for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                    for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                        this.a(adm2, b, \u2603 + \u2603, 0, \u2603 + \u2603, aqe2);
                        this.b(adm2, b, \u2603 + \u2603, -1, \u2603 + \u2603, aqe2);
                    }
                }
                if (\u2603 == 0 || \u2603 == 6) {
                    ++\u2603;
                    continue;
                }
                \u2603 += 6;
            }
        }
        for (\u2603 = 0; \u2603 < 5; ++\u2603) {
            this.a(adm2, aqe2, -1 - \u2603, 0 + \u2603 * 2, -1 - \u2603, -1 - \u2603, 23, 58 + \u2603, false);
            this.a(adm2, aqe2, 58 + \u2603, 0 + \u2603 * 2, -1 - \u2603, 58 + \u2603, 23, 58 + \u2603, false);
            this.a(adm2, aqe2, 0 - \u2603, 0 + \u2603 * 2, -1 - \u2603, 57 + \u2603, 23, -1 - \u2603, false);
            this.a(adm2, aqe2, 0 - \u2603, 0 + \u2603 * 2, 58 + \u2603, 57 + \u2603, 23, 58 + \u2603, false);
        }
        for (aql.r r2 : this.q) {
            if (!r2.c().a(aqe2)) continue;
            r2.a(adm2, random, aqe2);
        }
        return true;
    }

    private void a(boolean bl, int n2, adm adm2, Random random, aqe aqe2) {
        int n3 = 24;
        if (this.a(aqe2, n2, 0, n2 + 23, 20)) {
            this.a(adm2, aqe2, n2 + 0, 0, 0, n2 + 24, 0, 20, a, a, false);
            this.a(adm2, aqe2, n2 + 0, 1, 0, n2 + 24, 10, 20, false);
            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                this.a(adm2, aqe2, n2 + \u2603, \u2603 + 1, \u2603, n2 + \u2603, \u2603 + 1, 20, b, b, false);
                this.a(adm2, aqe2, n2 + \u2603 + 7, \u2603 + 5, \u2603 + 7, n2 + \u2603 + 7, \u2603 + 5, 20, b, b, false);
                this.a(adm2, aqe2, n2 + 17 - \u2603, \u2603 + 5, \u2603 + 7, n2 + 17 - \u2603, \u2603 + 5, 20, b, b, false);
                this.a(adm2, aqe2, n2 + 24 - \u2603, \u2603 + 1, \u2603, n2 + 24 - \u2603, \u2603 + 1, 20, b, b, false);
                this.a(adm2, aqe2, n2 + \u2603 + 1, \u2603 + 1, \u2603, n2 + 23 - \u2603, \u2603 + 1, \u2603, b, b, false);
                this.a(adm2, aqe2, n2 + \u2603 + 8, \u2603 + 5, \u2603 + 7, n2 + 16 - \u2603, \u2603 + 5, \u2603 + 7, b, b, false);
            }
            this.a(adm2, aqe2, n2 + 4, 4, 4, n2 + 6, 4, 20, a, a, false);
            this.a(adm2, aqe2, n2 + 7, 4, 4, n2 + 17, 4, 6, a, a, false);
            this.a(adm2, aqe2, n2 + 18, 4, 4, n2 + 20, 4, 20, a, a, false);
            this.a(adm2, aqe2, n2 + 11, 8, 11, n2 + 13, 8, 20, a, a, false);
            this.a(adm2, d, n2 + 12, 9, 12, aqe2);
            this.a(adm2, d, n2 + 12, 9, 15, aqe2);
            this.a(adm2, d, n2 + 12, 9, 18, aqe2);
            \u2603 = bl ? n2 + 19 : n2 + 5;
            \u2603 = bl ? n2 + 5 : n2 + 19;
            for (\u2603 = 20; \u2603 >= 5; \u2603 -= 3) {
                this.a(adm2, d, \u2603, 5, \u2603, aqe2);
            }
            for (\u2603 = 19; \u2603 >= 7; \u2603 -= 3) {
                this.a(adm2, d, \u2603, 5, \u2603, aqe2);
            }
            for (\u2603 = 0; \u2603 < 4; ++\u2603) {
                \u2603 = bl ? n2 + (24 - (17 - \u2603 * 3)) : n2 + 17 - \u2603 * 3;
                this.a(adm2, d, \u2603, 5, 5, aqe2);
            }
            this.a(adm2, d, \u2603, 5, 5, aqe2);
            this.a(adm2, aqe2, n2 + 11, 1, 12, n2 + 13, 7, 12, a, a, false);
            this.a(adm2, aqe2, n2 + 12, 1, 11, n2 + 12, 7, 13, a, a, false);
        }
    }

    private void b(adm adm2, Random random, aqe aqe2) {
        if (this.a(aqe2, 22, 5, 35, 17)) {
            this.a(adm2, aqe2, 25, 0, 0, 32, 8, 20, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(adm2, aqe2, 24, 2, 5 + i2 * 4, 24, 4, 5 + i2 * 4, b, b, false);
                this.a(adm2, aqe2, 22, 4, 5 + i2 * 4, 23, 4, 5 + i2 * 4, b, b, false);
                this.a(adm2, b, 25, 5, 5 + i2 * 4, aqe2);
                this.a(adm2, b, 26, 6, 5 + i2 * 4, aqe2);
                this.a(adm2, e, 26, 5, 5 + i2 * 4, aqe2);
                this.a(adm2, aqe2, 33, 2, 5 + i2 * 4, 33, 4, 5 + i2 * 4, b, b, false);
                this.a(adm2, aqe2, 34, 4, 5 + i2 * 4, 35, 4, 5 + i2 * 4, b, b, false);
                this.a(adm2, b, 32, 5, 5 + i2 * 4, aqe2);
                this.a(adm2, b, 31, 6, 5 + i2 * 4, aqe2);
                this.a(adm2, e, 31, 5, 5 + i2 * 4, aqe2);
                this.a(adm2, aqe2, 27, 6, 5 + i2 * 4, 30, 6, 5 + i2 * 4, a, a, false);
            }
        }
    }

    private void c(adm adm22, Random random, aqe aqe2) {
        if (this.a(aqe2, 15, 20, 42, 21)) {
            adm adm22;
            int n2;
            this.a(adm22, aqe2, 15, 0, 21, 42, 0, 21, a, a, false);
            this.a(adm22, aqe2, 26, 1, 21, 31, 3, 21, false);
            this.a(adm22, aqe2, 21, 12, 21, 36, 12, 21, a, a, false);
            this.a(adm22, aqe2, 17, 11, 21, 40, 11, 21, a, a, false);
            this.a(adm22, aqe2, 16, 10, 21, 41, 10, 21, a, a, false);
            this.a(adm22, aqe2, 15, 7, 21, 42, 9, 21, a, a, false);
            this.a(adm22, aqe2, 16, 6, 21, 41, 6, 21, a, a, false);
            this.a(adm22, aqe2, 17, 5, 21, 40, 5, 21, a, a, false);
            this.a(adm22, aqe2, 21, 4, 21, 36, 4, 21, a, a, false);
            this.a(adm22, aqe2, 22, 3, 21, 26, 3, 21, a, a, false);
            this.a(adm22, aqe2, 31, 3, 21, 35, 3, 21, a, a, false);
            this.a(adm22, aqe2, 23, 2, 21, 25, 2, 21, a, a, false);
            this.a(adm22, aqe2, 32, 2, 21, 34, 2, 21, a, a, false);
            this.a(adm22, aqe2, 28, 4, 20, 29, 4, 21, b, b, false);
            this.a(adm22, b, 27, 3, 21, aqe2);
            this.a(adm22, b, 30, 3, 21, aqe2);
            this.a(adm22, b, 26, 2, 21, aqe2);
            this.a(adm22, b, 31, 2, 21, aqe2);
            this.a(adm22, b, 25, 1, 21, aqe2);
            this.a(adm22, b, 32, 1, 21, aqe2);
            for (n2 = 0; n2 < 7; ++n2) {
                this.a(adm22, c, 28 - n2, 6 + n2, 21, aqe2);
                this.a(adm22, c, 29 + n2, 6 + n2, 21, aqe2);
            }
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, c, 28 - n2, 9 + n2, 21, aqe2);
                this.a(adm22, c, 29 + n2, 9 + n2, 21, aqe2);
            }
            this.a(adm22, c, 28, 12, 21, aqe2);
            this.a(adm22, c, 29, 12, 21, aqe2);
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(adm22, c, 22 - n2 * 2, 8, 21, aqe2);
                this.a(adm22, c, 22 - n2 * 2, 9, 21, aqe2);
                this.a(adm22, c, 35 + n2 * 2, 8, 21, aqe2);
                this.a(adm22, c, 35 + n2 * 2, 9, 21, aqe2);
            }
            this.a(adm22, aqe2, 15, 13, 21, 42, 15, 21, false);
            this.a(adm22, aqe2, 15, 1, 21, 15, 6, 21, false);
            this.a(adm22, aqe2, 16, 1, 21, 16, 5, 21, false);
            this.a(adm22, aqe2, 17, 1, 21, 20, 4, 21, false);
            this.a(adm22, aqe2, 21, 1, 21, 21, 3, 21, false);
            this.a(adm22, aqe2, 22, 1, 21, 22, 2, 21, false);
            this.a(adm22, aqe2, 23, 1, 21, 24, 1, 21, false);
            this.a(adm22, aqe2, 42, 1, 21, 42, 6, 21, false);
            this.a(adm22, aqe2, 41, 1, 21, 41, 5, 21, false);
            this.a(adm22, aqe2, 37, 1, 21, 40, 4, 21, false);
            this.a(adm22, aqe2, 36, 1, 21, 36, 3, 21, false);
            this.a(adm22, aqe2, 33, 1, 21, 34, 1, 21, false);
            this.a(adm22, aqe2, 35, 1, 21, 35, 2, 21, false);
        }
    }

    private void d(adm adm22, Random random, aqe aqe2) {
        if (this.a(aqe2, 21, 21, 36, 36)) {
            adm adm22;
            this.a(adm22, aqe2, 21, 0, 22, 36, 0, 36, a, a, false);
            this.a(adm22, aqe2, 21, 1, 22, 36, 23, 36, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(adm22, aqe2, 21 + i2, 13 + i2, 21 + i2, 36 - i2, 13 + i2, 21 + i2, b, b, false);
                this.a(adm22, aqe2, 21 + i2, 13 + i2, 36 - i2, 36 - i2, 13 + i2, 36 - i2, b, b, false);
                this.a(adm22, aqe2, 21 + i2, 13 + i2, 22 + i2, 21 + i2, 13 + i2, 35 - i2, b, b, false);
                this.a(adm22, aqe2, 36 - i2, 13 + i2, 22 + i2, 36 - i2, 13 + i2, 35 - i2, b, b, false);
            }
            this.a(adm22, aqe2, 25, 16, 25, 32, 16, 32, a, a, false);
            this.a(adm22, aqe2, 25, 17, 25, 25, 19, 25, b, b, false);
            this.a(adm22, aqe2, 32, 17, 25, 32, 19, 25, b, b, false);
            this.a(adm22, aqe2, 25, 17, 32, 25, 19, 32, b, b, false);
            this.a(adm22, aqe2, 32, 17, 32, 32, 19, 32, b, b, false);
            this.a(adm22, b, 26, 20, 26, aqe2);
            this.a(adm22, b, 27, 21, 27, aqe2);
            this.a(adm22, e, 27, 20, 27, aqe2);
            this.a(adm22, b, 26, 20, 31, aqe2);
            this.a(adm22, b, 27, 21, 30, aqe2);
            this.a(adm22, e, 27, 20, 30, aqe2);
            this.a(adm22, b, 31, 20, 31, aqe2);
            this.a(adm22, b, 30, 21, 30, aqe2);
            this.a(adm22, e, 30, 20, 30, aqe2);
            this.a(adm22, b, 31, 20, 26, aqe2);
            this.a(adm22, b, 30, 21, 27, aqe2);
            this.a(adm22, e, 30, 20, 27, aqe2);
            this.a(adm22, aqe2, 28, 21, 27, 29, 21, 27, a, a, false);
            this.a(adm22, aqe2, 27, 21, 28, 27, 21, 29, a, a, false);
            this.a(adm22, aqe2, 28, 21, 30, 29, 21, 30, a, a, false);
            this.a(adm22, aqe2, 30, 21, 28, 30, 21, 29, a, a, false);
        }
    }

    private void e(adm adm22, Random random, aqe aqe22) {
        aqe aqe22;
        adm adm22;
        int n2;
        if (this.a(aqe22, 0, 21, 6, 58)) {
            this.a(adm22, aqe22, 0, 0, 21, 6, 0, 57, a, a, false);
            this.a(adm22, aqe22, 0, 1, 21, 6, 7, 57, false);
            this.a(adm22, aqe22, 4, 4, 21, 6, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, b, b, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(adm22, d, 5, 5, n2, aqe22);
            }
            this.a(adm22, d, 5, 5, 52, aqe22);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, b, b, false);
            }
            this.a(adm22, aqe22, 4, 1, 52, 6, 3, 52, a, a, false);
            this.a(adm22, aqe22, 5, 1, 51, 5, 3, 53, a, a, false);
        }
        if (this.a(aqe22, 51, 21, 58, 58)) {
            this.a(adm22, aqe22, 51, 0, 21, 57, 0, 57, a, a, false);
            this.a(adm22, aqe22, 51, 1, 21, 57, 7, 57, false);
            this.a(adm22, aqe22, 51, 4, 21, 53, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, 57 - n2, n2 + 1, 21, 57 - n2, n2 + 1, 57 - n2, b, b, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(adm22, d, 52, 5, n2, aqe22);
            }
            this.a(adm22, d, 52, 5, 52, aqe22);
            this.a(adm22, aqe22, 51, 1, 52, 53, 3, 52, a, a, false);
            this.a(adm22, aqe22, 52, 1, 51, 52, 3, 53, a, a, false);
        }
        if (this.a(aqe22, 0, 51, 57, 57)) {
            this.a(adm22, aqe22, 7, 0, 51, 50, 0, 57, a, a, false);
            this.a(adm22, aqe22, 7, 1, 51, 50, 10, 57, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, b, b, false);
            }
        }
    }

    private void f(adm adm22, Random random, aqe aqe22) {
        aqe aqe22;
        int n2;
        if (this.a(aqe22, 7, 21, 13, 50)) {
            this.a(adm22, aqe22, 7, 0, 21, 13, 0, 50, a, a, false);
            this.a(adm22, aqe22, 7, 1, 21, 13, 10, 50, false);
            this.a(adm22, aqe22, 11, 8, 21, 13, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, n2 + 7, n2 + 5, 21, n2 + 7, n2 + 5, 54, b, b, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(adm22, d, 12, 9, n2, aqe22);
            }
        }
        if (this.a(aqe22, 44, 21, 50, 54)) {
            this.a(adm22, aqe22, 44, 0, 21, 50, 0, 50, a, a, false);
            this.a(adm22, aqe22, 44, 1, 21, 50, 10, 50, false);
            this.a(adm22, aqe22, 44, 8, 21, 46, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm22, aqe22, 50 - n2, n2 + 5, 21, 50 - n2, n2 + 5, 54, b, b, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(adm22, d, 45, 9, n2, aqe22);
            }
        }
        if (this.a(aqe22, 8, 44, 49, 54)) {
            adm adm22;
            this.a(adm22, aqe22, 14, 0, 44, 43, 0, 50, a, a, false);
            this.a(adm22, aqe22, 14, 1, 44, 43, 10, 50, false);
            for (n2 = 12; n2 <= 45; n2 += 3) {
                this.a(adm22, d, n2, 9, 45, aqe22);
                this.a(adm22, d, n2, 9, 52, aqe22);
                if (n2 != 12 && n2 != 18 && n2 != 24 && n2 != 33 && n2 != 39 && n2 != 45) continue;
                this.a(adm22, d, n2, 9, 47, aqe22);
                this.a(adm22, d, n2, 9, 50, aqe22);
                this.a(adm22, d, n2, 10, 45, aqe22);
                this.a(adm22, d, n2, 10, 46, aqe22);
                this.a(adm22, d, n2, 10, 51, aqe22);
                this.a(adm22, d, n2, 10, 52, aqe22);
                this.a(adm22, d, n2, 11, 47, aqe22);
                this.a(adm22, d, n2, 11, 50, aqe22);
                this.a(adm22, d, n2, 12, 48, aqe22);
                this.a(adm22, d, n2, 12, 49, aqe22);
            }
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(adm22, aqe22, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, a, a, false);
            }
            this.a(adm22, aqe22, 11, 8, 54, 46, 8, 54, b, b, false);
            this.a(adm22, aqe22, 14, 8, 44, 43, 8, 53, a, a, false);
        }
    }

    private void g(adm adm2, Random random, aqe aqe22) {
        aqe aqe22;
        int n2;
        if (this.a(aqe22, 14, 21, 20, 43)) {
            this.a(adm2, aqe22, 14, 0, 21, 20, 0, 43, a, a, false);
            this.a(adm2, aqe22, 14, 1, 22, 20, 14, 43, false);
            this.a(adm2, aqe22, 18, 12, 22, 20, 12, 39, a, a, false);
            this.a(adm2, aqe22, 18, 12, 21, 20, 12, 21, b, b, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm2, aqe22, n2 + 14, n2 + 9, 21, n2 + 14, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(adm2, d, 19, 13, n2, aqe22);
            }
        }
        if (this.a(aqe22, 37, 21, 43, 43)) {
            this.a(adm2, aqe22, 37, 0, 21, 43, 0, 43, a, a, false);
            this.a(adm2, aqe22, 37, 1, 22, 43, 14, 43, false);
            this.a(adm2, aqe22, 37, 12, 22, 39, 12, 39, a, a, false);
            this.a(adm2, aqe22, 37, 12, 21, 39, 12, 21, b, b, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm2, aqe22, 43 - n2, n2 + 9, 21, 43 - n2, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(adm2, d, 38, 13, n2, aqe22);
            }
        }
        if (this.a(aqe22, 15, 37, 42, 43)) {
            this.a(adm2, aqe22, 21, 0, 37, 36, 0, 43, a, a, false);
            this.a(adm2, aqe22, 21, 1, 37, 36, 14, 43, false);
            this.a(adm2, aqe22, 21, 12, 37, 36, 12, 39, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(adm2, aqe22, 15 + n2, n2 + 9, 43 - n2, 42 - n2, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 21; n2 <= 36; n2 += 3) {
                this.a(adm2, d, n2, 13, 38, aqe22);
            }
        }
    }
}
