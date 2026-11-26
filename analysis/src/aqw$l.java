/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public static class aqw.l
extends aqw.o {
    private int a;

    public aqw.l() {
    }

    public aqw.l(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
        this.a = Math.max((int)aqe2.c(), (int)aqe2.e());
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Length", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.f("Length");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random2) {
        Random random2;
        aqt aqt3;
        int n2;
        boolean \u26032 = false;
        for (n2 = random2.nextInt(5); n2 < this.a - 8; n2 += 2 + random2.nextInt(5)) {
            aqt3 = this.a((aqw.k)aqt2, list, random2, 0, n2);
            if (aqt3 == null) continue;
            n2 += Math.max((int)aqt3.l.c(), (int)aqt3.l.e());
            \u26032 = true;
        }
        for (n2 = random2.nextInt(5); n2 < this.a - 8; n2 += 2 + random2.nextInt(5)) {
            aqt3 = this.b((aqw.k)aqt2, list, random2, 0, n2);
            if (aqt3 == null) continue;
            n2 += Math.max((int)aqt3.l.c(), (int)aqt3.l.e());
            \u26032 = true;
        }
        if (\u26032 && random2.nextInt(3) > 0 && this.m != null) {
            switch (this.m) {
                case c: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.a - 1, this.l.b, this.l.c, cq.e, this.d());
                    break;
                }
                case d: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.a - 1, this.l.b, this.l.f - 2, cq.e, this.d());
                    break;
                }
                case f: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.d - 2, this.l.b, this.l.c - 1, cq.c, this.d());
                    break;
                }
                case e: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.a, this.l.b, this.l.c - 1, cq.c, this.d());
                }
            }
        }
        if (\u26032 && random2.nextInt(3) > 0 && this.m != null) {
            switch (this.m) {
                case c: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.d + 1, this.l.b, this.l.c, cq.f, this.d());
                    break;
                }
                case d: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.d + 1, this.l.b, this.l.f - 2, cq.f, this.d());
                    break;
                }
                case f: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.d - 2, this.l.b, this.l.f + 1, cq.d, this.d());
                    break;
                }
                case e: {
                    aqw.e((aqw.k)aqt2, (List<aqt>)list, random2, this.l.a, this.l.b, this.l.f + 1, cq.d, this.d());
                }
            }
        }
    }

    public static aqe a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2) {
        for (int i2 = 7 * ns.a(random, 3, 5); i2 >= 7; i2 -= 7) {
            aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 3, 3, i2, cq2);
            if (aqt.a(list, aqe2) != null) continue;
            return aqe2;
        }
        return null;
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        alz alz2 = this.a(afi.n.Q());
        \u2603 = this.a(afi.e.Q());
        for (int i2 = this.l.a; i2 <= this.l.d; ++i2) {
            for (\u2603 = this.l.c; \u2603 <= this.l.f; ++\u2603) {
                cj cj2 = new cj(i2, 64, \u2603);
                if (!aqe2.b(cj2)) continue;
                cj2 = adm2.r(cj2).b();
                adm2.a(cj2, alz2, 2);
                adm2.a(cj2.b(), \u2603, 2);
            }
        }
        return true;
    }
}
