/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

class lc.a {
    private final List<lf> b = Lists.newArrayList();
    private final adg c;
    private short[] d = new short[64];
    private int e;
    private int f;
    private long g;

    public lc.a(int n, int n2) {
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

    static /* synthetic */ adg a(lc.a a2) {
        return a2.c;
    }

    static /* synthetic */ List b(lc.a a2) {
        return a2.b;
    }
}
