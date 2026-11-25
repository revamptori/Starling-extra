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

public static class aqp.l
extends aqp.p {
    private boolean a;

    public aqp.l() {
    }

    public aqp.l(int n, Random random, int n2, int n3) {
        super(n);
        this.a = true;
        this.m = cq.c.a.a(random);
        this.d = aqp.p.a.a;
        switch (this.m) {
            case c: 
            case d: {
                this.l = new aqe(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
                break;
            }
            default: {
                this.l = new aqe(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
            }
        }
    }

    public aqp.l(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.a = false;
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Source", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.n("Source");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        if (this.a) {
            d = aqp.c.class;
        }
        this.a((aqp.m)aqt2, list, random, 1, 1);
    }

    public static aqp.l a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, cq2);
        if (!aqp.l.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.l(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 4, 10, 4, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 7, 0);
        this.a(adm2, random, aqe2, aqp.p.a.a, 1, 1, 4);
        this.a(adm2, afi.bf.Q(), 2, 6, 1, aqe2);
        this.a(adm2, afi.bf.Q(), 1, 5, 1, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 1, 6, 1, aqe2);
        this.a(adm2, afi.bf.Q(), 1, 5, 2, aqe2);
        this.a(adm2, afi.bf.Q(), 1, 4, 3, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 1, 5, 3, aqe2);
        this.a(adm2, afi.bf.Q(), 2, 4, 3, aqe2);
        this.a(adm2, afi.bf.Q(), 3, 3, 3, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 3, 4, 3, aqe2);
        this.a(adm2, afi.bf.Q(), 3, 3, 2, aqe2);
        this.a(adm2, afi.bf.Q(), 3, 2, 1, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 3, 3, 1, aqe2);
        this.a(adm2, afi.bf.Q(), 2, 2, 1, aqe2);
        this.a(adm2, afi.bf.Q(), 1, 1, 1, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 1, 2, 1, aqe2);
        this.a(adm2, afi.bf.Q(), 1, 1, 2, aqe2);
        this.a(adm2, afi.U.a(akb.a.a.a()), 1, 1, 3, aqe2);
        return true;
    }
}
