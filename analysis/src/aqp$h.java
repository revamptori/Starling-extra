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

public static class aqp.h
extends aqp.p {
    public aqp.h() {
    }

    public aqp.h(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        this.a((aqp.m)aqt2, list, random, 1, 1);
    }

    public static aqp.h a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2, int n4) {
        aqe aqe2 = aqe.a(n, n2, n3, -1, -1, 0, 9, 5, 11, cq2);
        if (!aqp.h.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.h(n4, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 8, 4, 10, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 1, 0);
        this.a(adm2, aqe2, 1, 1, 10, 3, 3, 10, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 4, 1, 1, 4, 3, 1, false, random, e);
        this.a(adm2, aqe2, 4, 1, 3, 4, 3, 3, false, random, e);
        this.a(adm2, aqe2, 4, 1, 7, 4, 3, 7, false, random, e);
        this.a(adm2, aqe2, 4, 1, 9, 4, 3, 9, false, random, e);
        this.a(adm2, aqe2, 4, 1, 4, 4, 3, 6, afi.bi.Q(), afi.bi.Q(), false);
        this.a(adm2, aqe2, 5, 1, 5, 7, 3, 5, afi.bi.Q(), afi.bi.Q(), false);
        this.a(adm2, afi.bi.Q(), 4, 3, 2, aqe2);
        this.a(adm2, afi.bi.Q(), 4, 3, 8, aqe2);
        this.a(adm2, afi.aA.a(this.a(afi.aA, 3)), 4, 1, 2, aqe2);
        this.a(adm2, afi.aA.a(this.a(afi.aA, 3) + 8), 4, 2, 2, aqe2);
        this.a(adm2, afi.aA.a(this.a(afi.aA, 3)), 4, 1, 8, aqe2);
        this.a(adm2, afi.aA.a(this.a(afi.aA, 3) + 8), 4, 2, 8, aqe2);
        return true;
    }
}
