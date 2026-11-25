/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public static abstract class aql.r
extends aqt {
    protected static final alz a = afi.cI.a(aiu.b);
    protected static final alz b = afi.cI.a(aiu.N);
    protected static final alz c = afi.cI.a(aiu.O);
    protected static final alz d = b;
    protected static final alz e = afi.cJ.Q();
    protected static final alz f = afi.j.Q();
    protected static final int g = aql.r.b(2, 0, 0);
    protected static final int h = aql.r.b(2, 2, 0);
    protected static final int i = aql.r.b(0, 1, 0);
    protected static final int j = aql.r.b(4, 1, 0);
    protected aql.v k;

    protected static final int b(int n, int n2, int n3) {
        return n2 * 25 + n3 * 5 + n;
    }

    public aql.r() {
        super(0);
    }

    public aql.r(int n) {
        super(n);
    }

    public aql.r(cq cq2, aqe aqe2) {
        super(1);
        this.m = cq2;
        this.l = aqe2;
    }

    protected aql.r(int n, cq cq2, aql.v v2, int n2, int n3, int n4) {
        super(n);
        this.m = cq2;
        this.k = v2;
        \u2603 = v2.a;
        \u2603 = \u2603 % 5;
        \u2603 = \u2603 / 5 % 5;
        \u2603 = \u2603 / 25;
        this.l = cq2 == cq.c || cq2 == cq.d ? new aqe(0, 0, 0, n2 * 8 - 1, n3 * 4 - 1, n4 * 8 - 1) : new aqe(0, 0, 0, n4 * 8 - 1, n3 * 4 - 1, n2 * 8 - 1);
        switch (cq2) {
            case c: {
                this.l.a(\u2603 * 8, \u2603 * 4, -(\u2603 + n4) * 8 + 1);
                break;
            }
            case d: {
                this.l.a(\u2603 * 8, \u2603 * 4, \u2603 * 8);
                break;
            }
            case e: {
                this.l.a(-(\u2603 + n4) * 8 + 1, \u2603 * 4, \u2603 * 8);
                break;
            }
            default: {
                this.l.a(\u2603 * 8, \u2603 * 4, \u2603 * 8);
            }
        }
    }

    @Override
    protected void a(dn dn2) {
    }

    @Override
    protected void b(dn dn2) {
    }

    protected void a(adm adm2, aqe aqe2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (\u2603 = n2; \u2603 <= n5; ++\u2603) {
                for (\u2603 = n4; \u2603 <= n7; ++\u2603) {
                    if (bl && this.a(adm2, \u2603, i2, \u2603, aqe2).c().t() == arm.a) continue;
                    if (this.d(i2) >= adm2.F()) {
                        this.a(adm2, afi.a.Q(), \u2603, i2, \u2603, aqe2);
                        continue;
                    }
                    this.a(adm2, f, \u2603, i2, \u2603, aqe2);
                }
            }
        }
    }

    protected void a(adm adm2, aqe aqe2, int n2, int n3, boolean bl) {
        if (bl) {
            this.a(adm2, aqe2, n2 + 0, 0, n3 + 0, n2 + 2, 0, n3 + 8 - 1, a, a, false);
            this.a(adm2, aqe2, n2 + 5, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
            this.a(adm2, aqe2, n2 + 3, 0, n3 + 0, n2 + 4, 0, n3 + 2, a, a, false);
            this.a(adm2, aqe2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 8 - 1, a, a, false);
            this.a(adm2, aqe2, n2 + 3, 0, n3 + 2, n2 + 4, 0, n3 + 2, b, b, false);
            this.a(adm2, aqe2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 5, b, b, false);
            this.a(adm2, aqe2, n2 + 2, 0, n3 + 3, n2 + 2, 0, n3 + 4, b, b, false);
            this.a(adm2, aqe2, n2 + 5, 0, n3 + 3, n2 + 5, 0, n3 + 4, b, b, false);
        } else {
            this.a(adm2, aqe2, n2 + 0, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
        }
    }

    protected void a(adm adm2, aqe aqe2, int n2, int n3, int n4, int n5, int n6, int n7, alz alz2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (\u2603 = n2; \u2603 <= n5; ++\u2603) {
                for (\u2603 = n4; \u2603 <= n7; ++\u2603) {
                    if (this.a(adm2, \u2603, i2, \u2603, aqe2) != f) continue;
                    this.a(adm2, alz2, \u2603, i2, \u2603, aqe2);
                }
            }
        }
    }

    protected boolean a(aqe aqe2, int n2, int n3, int n4, int n5) {
        \u2603 = this.a(n2, n3);
        \u2603 = this.b(n2, n3);
        \u2603 = this.a(n4, n5);
        \u2603 = this.b(n4, n5);
        return aqe2.a(Math.min((int)\u2603, (int)\u2603), Math.min((int)\u2603, (int)\u2603), Math.max((int)\u2603, (int)\u2603), Math.max((int)\u2603, (int)\u2603));
    }

    protected boolean a(adm adm2, aqe aqe2, int n2, int n3, int n4) {
        \u2603 = this.a(n2, n4);
        if (aqe2.b(new cj(\u2603, \u2603 = this.d(n3), \u2603 = this.b(n2, n4)))) {
            vt vt2 = new vt(adm2);
            vt2.a(true);
            vt2.h(vt2.bu());
            vt2.b((double)\u2603 + 0.5, \u2603, (double)\u2603 + 0.5, 0.0f, 0.0f);
            vt2.a(adm2.E(new cj(vt2)), null);
            adm2.d(vt2);
            return true;
        }
        return false;
    }
}
