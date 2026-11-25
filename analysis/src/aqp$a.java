/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public static class aqp.a
extends aqp.p {
    private static final List<ob> a = Lists.newArrayList((Object[])new ob[]{new ob(zy.bu, 0, 1, 1, 10), new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aA, 0, 1, 1, 1), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1)});
    private boolean b;

    public aqp.a() {
    }

    public aqp.a(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Chest", this.b);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.n("Chest");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqp.m)aqt2, list, random, 1, 1);
    }

    public static aqp.a a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -1, -1, 0, 5, 5, 7, cq2);
        if (!aqp.a.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.a(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe22) {
        aqe aqe22;
        if (this.a(adm2, aqe22)) {
            return false;
        }
        this.a(adm2, aqe22, 0, 0, 0, 4, 4, 6, true, random, e);
        this.a(adm2, random, aqe22, this.d, 1, 1, 0);
        this.a(adm2, random, aqe22, aqp.p.a.a, 1, 1, 6);
        this.a(adm2, aqe22, 3, 1, 2, 3, 1, 4, afi.bf.Q(), afi.bf.Q(), false);
        this.a(adm2, afi.U.a(akb.a.f.a()), 3, 1, 1, aqe22);
        this.a(adm2, afi.U.a(akb.a.f.a()), 3, 1, 5, aqe22);
        this.a(adm2, afi.U.a(akb.a.f.a()), 3, 2, 2, aqe22);
        this.a(adm2, afi.U.a(akb.a.f.a()), 3, 2, 4, aqe22);
        for (int i2 = 2; i2 <= 4; ++i2) {
            this.a(adm2, afi.U.a(akb.a.f.a()), 2, 1, i2, aqe22);
        }
        if (!this.b && aqe22.b(new cj(this.a(3, 3), this.d(2), this.b(3, 3)))) {
            this.b = true;
            this.a(adm2, aqe22, random, 3, 2, 3, ob.a(a, zy.cd.b(random)), 2 + random.nextInt(2));
        }
        return true;
    }
}
