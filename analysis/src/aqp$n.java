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

public static class aqp.n
extends aqp.p {
    private boolean a;
    private boolean b;

    public aqp.n() {
    }

    public aqp.n(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
        this.a = random.nextInt(2) == 0;
        this.b = random.nextInt(2) == 0;
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Left", this.a);
        dn2.a("Right", this.b);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.a = dn2.n("Left");
        this.b = dn2.n("Right");
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqp.m)aqt2, list, random, 1, 1);
        if (this.a) {
            this.b((aqp.m)aqt2, list, random, 1, 2);
        }
        if (this.b) {
            this.c((aqp.m)aqt2, list, random, 1, 2);
        }
    }

    public static aqp.n a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, cq2);
        if (!aqp.n.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.n(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 4, 4, 6, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 1, 0);
        this.a(adm2, random, aqe2, aqp.p.a.a, 1, 1, 6);
        this.a(adm2, aqe2, random, 0.1f, 1, 2, 1, afi.aa.Q());
        this.a(adm2, aqe2, random, 0.1f, 3, 2, 1, afi.aa.Q());
        this.a(adm2, aqe2, random, 0.1f, 1, 2, 5, afi.aa.Q());
        this.a(adm2, aqe2, random, 0.1f, 3, 2, 5, afi.aa.Q());
        if (this.a) {
            this.a(adm2, aqe2, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
        }
        if (this.b) {
            this.a(adm2, aqe2, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
        }
        return true;
    }
}
