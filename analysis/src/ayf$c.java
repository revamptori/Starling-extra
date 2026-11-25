/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Comparator
 */
import com.google.common.collect.Lists;
import java.util.Comparator;

class ayf.c
extends ayf.e {
    public ayf.c(ave ave2) {
        super(ayf.this, ave2);
        this.w = Lists.newArrayList();
        for (mu mu2 : na.d) {
            boolean bl = false;
            int \u26032 = zw.b(mu2.a());
            if (ayf.this.s.a(mu2) > 0) {
                bl = true;
            } else if (na.ae[\u26032] != null && ayf.this.s.a(na.ae[\u26032]) > 0) {
                bl = true;
            } else if (na.ac[\u26032] != null && ayf.this.s.a(na.ac[\u26032]) > 0) {
                bl = true;
            }
            if (!bl) continue;
            this.w.add((Object)mu2);
        }
        this.x = new Comparator<mu>(){

            public int a(mu mu2, mu mu3) {
                int n = zw.b(mu2.a());
                \u2603 = zw.b(mu3.a());
                mw \u26032 = null;
                mw \u26033 = null;
                if (c.this.y == 0) {
                    \u26032 = na.ae[n];
                    \u26033 = na.ae[\u2603];
                } else if (c.this.y == 1) {
                    \u26032 = na.ac[n];
                    \u26033 = na.ac[\u2603];
                } else if (c.this.y == 2) {
                    \u26032 = na.ad[n];
                    \u26033 = na.ad[\u2603];
                }
                if (\u26032 != null || \u26033 != null) {
                    if (\u26032 == null) {
                        return 1;
                    }
                    if (\u26033 == null) {
                        return -1;
                    }
                    \u2603 = ayf.this.s.a(\u26032);
                    if (\u2603 != (\u2603 = ayf.this.s.a(\u26033))) {
                        return (\u2603 - \u2603) * c.this.z;
                    }
                }
                return n - \u2603;
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((mu)object, (mu)object2);
            }
        };
    }

    @Override
    protected void a(int n, int n2, bfx bfx2) {
        super.a(n, n2, bfx2);
        if (this.v == 0) {
            ayf.this.c(n + 115 - 18 + 1, n2 + 1 + 1, 72, 18);
        } else {
            ayf.this.c(n + 115 - 18, n2 + 1, 72, 18);
        }
        if (this.v == 1) {
            ayf.this.c(n + 165 - 18 + 1, n2 + 1 + 1, 18, 18);
        } else {
            ayf.this.c(n + 165 - 18, n2 + 1, 18, 18);
        }
        if (this.v == 2) {
            ayf.this.c(n + 215 - 18 + 1, n2 + 1 + 1, 36, 18);
        } else {
            ayf.this.c(n + 215 - 18, n2 + 1, 36, 18);
        }
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        mu mu2 = this.c(n);
        zw \u26032 = mu2.a();
        ayf.this.a(n2 + 40, n3, \u26032);
        int \u26033 = zw.b(\u26032);
        this.a(na.ae[\u26033], n2 + 115, n3, n % 2 == 0);
        this.a(na.ac[\u26033], n2 + 165, n3, n % 2 == 0);
        this.a(mu2, n2 + 215, n3, n % 2 == 0);
    }

    @Override
    protected String b(int n) {
        if (n == 1) {
            return "stat.crafted";
        }
        if (n == 2) {
            return "stat.used";
        }
        return "stat.depleted";
    }
}
