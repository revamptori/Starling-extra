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

public static class aqp.b
extends aqp.p {
    private int a;

    public aqp.b() {
    }

    public aqp.b(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.l = aqe2;
        this.a = cq2 == cq.c || cq2 == cq.d ? aqe2.e() : aqe2.c();
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Steps", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.f("Steps");
    }

    public static aqe a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2) {
        int n5 = 3;
        aqe \u26032 = aqe.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, cq2);
        aqt \u26033 = aqt.a(list, \u26032);
        if (\u26033 == null) {
            return null;
        }
        if (\u26033.c().b == \u26032.b) {
            for (\u2603 = 3; \u2603 >= 1; --\u2603) {
                \u26032 = aqe.a(n2, n3, n4, -1, -1, 0, 5, 5, \u2603 - 1, cq2);
                if (\u26033.c().a(\u26032)) continue;
                return aqe.a(n2, n3, n4, -1, -1, 0, 5, 5, \u2603, cq2);
            }
        }
        return null;
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.a(adm2, afi.bf.Q(), 0, 0, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 1, 0, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 2, 0, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 3, 0, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 4, 0, i2, aqe2);
            for (\u2603 = 1; \u2603 <= 3; ++\u2603) {
                this.a(adm2, afi.bf.Q(), 0, \u2603, i2, aqe2);
                this.a(adm2, afi.a.Q(), 1, \u2603, i2, aqe2);
                this.a(adm2, afi.a.Q(), 2, \u2603, i2, aqe2);
                this.a(adm2, afi.a.Q(), 3, \u2603, i2, aqe2);
                this.a(adm2, afi.bf.Q(), 4, \u2603, i2, aqe2);
            }
            this.a(adm2, afi.bf.Q(), 0, 4, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 1, 4, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 2, 4, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 3, 4, i2, aqe2);
            this.a(adm2, afi.bf.Q(), 4, 4, i2, aqe2);
        }
        return true;
    }
}
