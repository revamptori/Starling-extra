/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lc {
    private static final Logger a = LogManager.getLogger();
    private final le b;
    private final List<lf> c = Lists.newArrayList();
    private final nq<a> d = new nq();
    private final List<a> e = Lists.newArrayList();
    private final List<a> f = Lists.newArrayList();
    private int g;
    private long h;
    private final int[][] i = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public lc(le le2) {
        this.b = le2;
        this.a(le2.r().ap().s());
    }

    public le a() {
        return this.b;
    }

    public void b() {
        anm anm2;
        int n2;
        long l2 = this.b.K();
        if (l2 - this.h > 8000L) {
            this.h = l2;
            for (n2 = 0; n2 < this.f.size(); ++n2) {
                a a2 = (a)this.f.get(n2);
                a2.b();
                a2.a();
            }
        } else {
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                a a3 = (a)this.e.get(n2);
                a3.b();
            }
        }
        this.e.clear();
        if (this.c.isEmpty() && !(anm2 = this.b.t).e()) {
            this.b.b.b();
        }
    }

    public boolean a(int n2, int n3) {
        long l2 = (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
        return this.d.a(l2) != null;
    }

    private a a(int n2, int n3, boolean bl) {
        long l2 = (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
        a \u26032 = this.d.a(l2);
        if (\u26032 == null && bl) {
            \u26032 = new a(n2, n3);
            this.d.a(l2, \u26032);
            this.f.add((Object)\u26032);
        }
        return \u26032;
    }

    public void a(cj cj2) {
        int n2 = cj2.n() >> 4;
        a \u26032 = this.a(n2, \u2603 = cj2.p() >> 4, false);
        if (\u26032 != null) {
            \u26032.a(cj2.n() & 0xF, cj2.o(), cj2.p() & 0xF);
        }
    }

    public void a(lf lf2) {
        int n2 = (int)lf2.s >> 4;
        \u2603 = (int)lf2.u >> 4;
        lf2.d = lf2.s;
        lf2.e = lf2.u;
        for (\u2603 = n2 - this.g; \u2603 <= n2 + this.g; ++\u2603) {
            for (\u2603 = \u2603 - this.g; \u2603 <= \u2603 + this.g; ++\u2603) {
                this.a(\u2603, \u2603, true).a(lf2);
            }
        }
        this.c.add((Object)lf2);
        this.b(lf2);
    }

    public void b(lf lf2) {
        int n2;
        ArrayList arrayList = Lists.newArrayList(lf2.f);
        int \u26032 = 0;
        int \u26033 = this.g;
        int \u26034 = (int)lf2.s >> 4;
        int \u26035 = (int)lf2.u >> 4;
        int \u26036 = 0;
        int \u26037 = 0;
        adg \u26038 = this.a(\u26034, \u26035, true).c;
        lf2.f.clear();
        if (arrayList.contains((Object)\u26038)) {
            lf2.f.add((Object)\u26038);
        }
        for (n2 = 1; n2 <= \u26033 * 2; ++n2) {
            for (\u2603 = 0; \u2603 < 2; ++\u2603) {
                int[] nArray = this.i[\u26032++ % 4];
                for (int i = 0; i < n2; ++i) {
                    \u26038 = this.a(\u26034 + (\u26036 += nArray[0]), \u26035 + (\u26037 += nArray[1]), true).c;
                    if (!arrayList.contains((Object)\u26038)) continue;
                    lf2.f.add((Object)\u26038);
                }
            }
        }
        \u26032 %= 4;
        for (n2 = 0; n2 < \u26033 * 2; ++n2) {
            \u26038 = this.a(\u26034 + (\u26036 += this.i[\u26032][0]), \u26035 + (\u26037 += this.i[\u26032][1]), true).c;
            if (!arrayList.contains((Object)\u26038)) continue;
            lf2.f.add((Object)\u26038);
        }
    }

    public void c(lf lf22) {
        lf lf22;
        int n2 = (int)lf22.d >> 4;
        \u2603 = (int)lf22.e >> 4;
        for (\u2603 = n2 - this.g; \u2603 <= n2 + this.g; ++\u2603) {
            for (\u2603 = \u2603 - this.g; \u2603 <= \u2603 + this.g; ++\u2603) {
                a a2 = this.a(\u2603, \u2603, false);
                if (a2 == null) continue;
                a2.b(lf22);
            }
        }
        this.c.remove((Object)lf22);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6) {
        \u2603 = n2 - n4;
        \u2603 = n3 - n5;
        if (\u2603 < -n6 || \u2603 > n6) {
            return false;
        }
        return \u2603 >= -n6 && \u2603 <= n6;
    }

    public void d(lf lf2) {
        int n2 = (int)lf2.s >> 4;
        \u2603 = (int)lf2.u >> 4;
        double \u26032 = lf2.d - lf2.s;
        double \u26033 = lf2.e - lf2.u;
        double \u26034 = \u26032 * \u26032 + \u26033 * \u26033;
        if (\u26034 < 64.0) {
            return;
        }
        \u2603 = (int)lf2.d >> 4;
        \u2603 = (int)lf2.e >> 4;
        \u2603 = this.g;
        \u2603 = n2 - \u2603;
        \u2603 = \u2603 - \u2603;
        if (\u2603 == 0 && \u2603 == 0) {
            return;
        }
        for (\u2603 = n2 - \u2603; \u2603 <= n2 + \u2603; ++\u2603) {
            for (\u2603 = \u2603 - \u2603; \u2603 <= \u2603 + \u2603; ++\u2603) {
                if (!this.a(\u2603, \u2603, \u2603, \u2603, \u2603)) {
                    this.a(\u2603, \u2603, true).a(lf2);
                }
                if (this.a(\u2603 - \u2603, \u2603 - \u2603, n2, \u2603, \u2603) || (\u2603 = this.a(\u2603 - \u2603, \u2603 - \u2603, false)) == null) continue;
                \u2603.b(lf2);
            }
        }
        this.b(lf2);
        lf2.d = lf2.s;
        lf2.e = lf2.u;
    }

    public boolean a(lf lf2, int n2, int n3) {
        a a2 = this.a(n2, n3, false);
        return a2 != null && a2.b.contains((Object)lf2) && !lf2.f.contains((Object)a2.c);
    }

    public void a(int n22) {
        int n22;
        if ((n22 = ns.a(n22, 3, 32)) == this.g) {
            return;
        }
        \u2603 = n22 - this.g;
        ArrayList arrayList = Lists.newArrayList(this.c);
        for (lf lf2 : arrayList) {
            int n3 = (int)lf2.s >> 4;
            \u2603 = (int)lf2.u >> 4;
            if (\u2603 > 0) {
                for (i = n3 - n22; i <= n3 + n22; ++i) {
                    for (\u2603 = \u2603 - n22; \u2603 <= \u2603 + n22; ++\u2603) {
                        a a2 = this.a(i, \u2603, true);
                        if (a2.b.contains((Object)lf2)) continue;
                        a2.a(lf2);
                    }
                }
                continue;
            }
            for (int i = n3 - this.g; i <= n3 + this.g; ++i) {
                for (\u2603 = \u2603 - this.g; \u2603 <= \u2603 + this.g; ++\u2603) {
                    if (this.a(i, \u2603, n3, \u2603, n22)) continue;
                    this.a(i, \u2603, true).b(lf2);
                }
            }
        }
        this.g = n22;
    }

    public static int b(int n2) {
        return n2 * 16 - 16;
    }

    class a {
        private final List<lf> b = Lists.newArrayList();
        private final adg c;
        private short[] d = new short[64];
        private int e;
        private int f;
        private long g;

        public a(int n, int n2) {
            this.c = new adg(n, n2);
            lc.this.a().b.c(n, n2);
        }

        public void a(lf lf2) {
            if (this.b.contains((Object)lf2)) {
                a.debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{lf2, this.c.a, this.c.b});
                return;
            }
            if (this.b.isEmpty()) {
                this.g = lc.this.b.K();
            }
            this.b.add((Object)lf2);
            lf2.f.add((Object)this.c);
        }

        public void b(lf lf2) {
            if (!this.b.contains((Object)lf2)) {
                return;
            }
            amy amy2 = lc.this.b.a(this.c.a, this.c.b);
            if (amy2.i()) {
                lf2.a.a(new go(amy2, true, 0));
            }
            this.b.remove((Object)lf2);
            lf2.f.remove((Object)this.c);
            if (this.b.isEmpty()) {
                long l = (long)this.c.a + Integer.MAX_VALUE | (long)this.c.b + Integer.MAX_VALUE << 32;
                this.a(amy2);
                lc.this.d.d(l);
                lc.this.f.remove((Object)this);
                if (this.e > 0) {
                    lc.this.e.remove((Object)this);
                }
                lc.this.a().b.b(this.c.a, this.c.b);
            }
        }

        public void a() {
            this.a(lc.this.b.a(this.c.a, this.c.b));
        }

        private void a(amy amy2) {
            amy2.c(amy2.w() + lc.this.b.K() - this.g);
            this.g = lc.this.b.K();
        }

        public void a(int n2, int n3, int n4) {
            if (this.e == 0) {
                lc.this.e.add((Object)this);
            }
            this.f |= 1 << (n3 >> 4);
            if (this.e < 64) {
                short s = (short)(n2 << 12 | n4 << 8 | n3);
                for (int i = 0; i < this.e; ++i) {
                    if (this.d[i] != s) continue;
                    return;
                }
                this.d[this.e++] = s;
            }
        }

        public void a(ff ff2) {
            for (int i = 0; i < this.b.size(); ++i) {
                lf lf2 = (lf)this.b.get(i);
                if (lf2.f.contains((Object)this.c)) continue;
                lf2.a.a(ff2);
            }
        }

        public void b() {
            if (this.e == 0) {
                return;
            }
            if (this.e == 1) {
                int n2 = (this.d[0] >> 12 & 0xF) + this.c.a * 16;
                \u2603 = this.d[0] & 0xFF;
                \u2603 = (this.d[0] >> 8 & 0xF) + this.c.b * 16;
                cj \u26032 = new cj(n2, \u2603, \u2603);
                this.a(new fv(lc.this.b, \u26032));
                if (lc.this.b.p(\u26032).c().z()) {
                    this.a(lc.this.b.s(\u26032));
                }
            } else if (this.e == 64) {
                \u2603 = this.c.a * 16;
                \u2603 = this.c.b * 16;
                this.a(new go(lc.this.b.a(this.c.a, this.c.b), false, this.f));
                for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                    if ((this.f & 1 << \u2603) == 0) continue;
                    \u2603 = \u2603 << 4;
                    List<akw> list = lc.this.b.a(\u2603, \u2603, \u2603, \u2603 + 16, \u2603 + 16, \u2603 + 16);
                    for (int i = 0; i < list.size(); ++i) {
                        this.a((akw)list.get(i));
                    }
                }
            } else {
                this.a(new fz(this.e, this.d, lc.this.b.a(this.c.a, this.c.b)));
                for (int i = 0; i < this.e; ++i) {
                    \u2603 = (this.d[i] >> 12 & 0xF) + this.c.a * 16;
                    \u2603 = this.d[i] & 0xFF;
                    \u2603 = (this.d[i] >> 8 & 0xF) + this.c.b * 16;
                    cj cj2 = new cj(\u2603, \u2603, \u2603);
                    if (!lc.this.b.p(cj2).c().z()) continue;
                    this.a(lc.this.b.s(cj2));
                }
            }
            this.e = 0;
            this.f = 0;
        }

        private void a(akw akw2) {
            if (akw2 != null && (\u2603 = akw2.y_()) != null) {
                this.a(\u2603);
            }
        }
    }
}
