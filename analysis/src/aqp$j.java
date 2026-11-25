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

public static class aqp.j
extends aqp.p {
    private static final List<ob> b = Lists.newArrayList((Object[])new ob[]{new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1)});
    protected int a;

    public aqp.j() {
    }

    public aqp.j(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
        this.a = random.nextInt(5);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Type", this.a);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.f("Type");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqp.m)aqt2, list, random, 4, 1);
        this.b((aqp.m)aqt2, list, random, 1, 4);
        this.c((aqp.m)aqt2, list, random, 1, 4);
    }

    public static aqp.j a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -4, -1, 0, 11, 7, 11, cq2);
        if (!aqp.j.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.j(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm22, Random random, aqe aqe2) {
        if (this.a(adm22, aqe2)) {
            return false;
        }
        this.a(adm22, aqe2, 0, 0, 0, 10, 6, 10, true, random, e);
        this.a(adm22, random, aqe2, this.d, 4, 1, 0);
        this.a(adm22, aqe2, 4, 1, 10, 6, 3, 10, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 0, 1, 4, 0, 3, 6, afi.a.Q(), afi.a.Q(), false);
        this.a(adm22, aqe2, 10, 1, 4, 10, 3, 6, afi.a.Q(), afi.a.Q(), false);
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                this.a(adm22, afi.bf.Q(), 5, 1, 5, aqe2);
                this.a(adm22, afi.bf.Q(), 5, 2, 5, aqe2);
                this.a(adm22, afi.bf.Q(), 5, 3, 5, aqe2);
                this.a(adm22, afi.aa.Q(), 4, 3, 5, aqe2);
                this.a(adm22, afi.aa.Q(), 6, 3, 5, aqe2);
                this.a(adm22, afi.aa.Q(), 5, 3, 4, aqe2);
                this.a(adm22, afi.aa.Q(), 5, 3, 6, aqe2);
                this.a(adm22, afi.U.Q(), 4, 1, 4, aqe2);
                this.a(adm22, afi.U.Q(), 4, 1, 5, aqe2);
                this.a(adm22, afi.U.Q(), 4, 1, 6, aqe2);
                this.a(adm22, afi.U.Q(), 6, 1, 4, aqe2);
                this.a(adm22, afi.U.Q(), 6, 1, 5, aqe2);
                this.a(adm22, afi.U.Q(), 6, 1, 6, aqe2);
                this.a(adm22, afi.U.Q(), 5, 1, 4, aqe2);
                this.a(adm22, afi.U.Q(), 5, 1, 6, aqe2);
                break;
            }
            case 1: {
                adm adm22;
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.a(adm22, afi.bf.Q(), 3, 1, 3 + i2, aqe2);
                    this.a(adm22, afi.bf.Q(), 7, 1, 3 + i2, aqe2);
                    this.a(adm22, afi.bf.Q(), 3 + i2, 1, 3, aqe2);
                    this.a(adm22, afi.bf.Q(), 3 + i2, 1, 7, aqe2);
                }
                this.a(adm22, afi.bf.Q(), 5, 1, 5, aqe2);
                this.a(adm22, afi.bf.Q(), 5, 2, 5, aqe2);
                this.a(adm22, afi.bf.Q(), 5, 3, 5, aqe2);
                this.a(adm22, afi.i.Q(), 5, 4, 5, aqe2);
                break;
            }
            case 2: {
                int n2;
                adm adm22;
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(adm22, afi.e.Q(), 1, 3, n2, aqe2);
                    this.a(adm22, afi.e.Q(), 9, 3, n2, aqe2);
                }
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(adm22, afi.e.Q(), n2, 3, 1, aqe2);
                    this.a(adm22, afi.e.Q(), n2, 3, 9, aqe2);
                }
                this.a(adm22, afi.e.Q(), 5, 1, 4, aqe2);
                this.a(adm22, afi.e.Q(), 5, 1, 6, aqe2);
                this.a(adm22, afi.e.Q(), 5, 3, 4, aqe2);
                this.a(adm22, afi.e.Q(), 5, 3, 6, aqe2);
                this.a(adm22, afi.e.Q(), 4, 1, 5, aqe2);
                this.a(adm22, afi.e.Q(), 6, 1, 5, aqe2);
                this.a(adm22, afi.e.Q(), 4, 3, 5, aqe2);
                this.a(adm22, afi.e.Q(), 6, 3, 5, aqe2);
                for (n2 = 1; n2 <= 3; ++n2) {
                    this.a(adm22, afi.e.Q(), 4, n2, 4, aqe2);
                    this.a(adm22, afi.e.Q(), 6, n2, 4, aqe2);
                    this.a(adm22, afi.e.Q(), 4, n2, 6, aqe2);
                    this.a(adm22, afi.e.Q(), 6, n2, 6, aqe2);
                }
                this.a(adm22, afi.aa.Q(), 5, 3, 5, aqe2);
                for (n2 = 2; n2 <= 8; ++n2) {
                    this.a(adm22, afi.f.Q(), 2, 3, n2, aqe2);
                    this.a(adm22, afi.f.Q(), 3, 3, n2, aqe2);
                    if (n2 <= 3 || n2 >= 7) {
                        this.a(adm22, afi.f.Q(), 4, 3, n2, aqe2);
                        this.a(adm22, afi.f.Q(), 5, 3, n2, aqe2);
                        this.a(adm22, afi.f.Q(), 6, 3, n2, aqe2);
                    }
                    this.a(adm22, afi.f.Q(), 7, 3, n2, aqe2);
                    this.a(adm22, afi.f.Q(), 8, 3, n2, aqe2);
                }
                this.a(adm22, afi.au.a(this.a(afi.au, cq.e.a())), 9, 1, 3, aqe2);
                this.a(adm22, afi.au.a(this.a(afi.au, cq.e.a())), 9, 2, 3, aqe2);
                this.a(adm22, afi.au.a(this.a(afi.au, cq.e.a())), 9, 3, 3, aqe2);
                this.a(adm22, aqe2, random, 3, 4, 8, ob.a(b, zy.cd.b(random)), 1 + random.nextInt(4));
            }
        }
        return true;
    }
}
