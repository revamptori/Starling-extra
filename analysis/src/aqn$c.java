/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static abstract class aqn.c
extends aqt {
    protected int a;
    protected int b;
    protected int c;
    protected int d = -1;

    public aqn.c() {
    }

    protected aqn.c(Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(0);
        this.a = n4;
        this.b = n5;
        this.c = n6;
        this.m = cq.c.a.a(random);
        switch (this.m) {
            case c: 
            case d: {
                this.l = new aqe(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1);
                break;
            }
            default: {
                this.l = new aqe(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
            }
        }
    }

    @Override
    protected void a(dn dn2) {
        dn2.a("Width", this.a);
        dn2.a("Height", this.b);
        dn2.a("Depth", this.c);
        dn2.a("HPos", this.d);
    }

    @Override
    protected void b(dn dn2) {
        this.a = dn2.f("Width");
        this.b = dn2.f("Height");
        this.c = dn2.f("Depth");
        this.d = dn2.f("HPos");
    }

    protected boolean a(adm adm2, aqe aqe2, int n) {
        int n2;
        if (this.d >= 0) {
            return true;
        }
        \u2603 = 0;
        n2 = 0;
        cj.a a2 = new cj.a();
        for (int i = this.l.c; i <= this.l.f; ++i) {
            for (\u2603 = this.l.a; \u2603 <= this.l.d; ++\u2603) {
                a2.c(\u2603, 64, i);
                if (!aqe2.b(a2)) continue;
                \u2603 += Math.max((int)adm2.r(a2).o(), (int)adm2.t.i());
                ++n2;
            }
        }
        if (n2 == 0) {
            return false;
        }
        this.d = \u2603 / n2;
        this.l.a(0, this.d - this.l.b + n, 0);
        return true;
    }
}
