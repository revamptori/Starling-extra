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

public static class aqp.d
extends aqp.p {
    public aqp.d() {
    }

    public aqp.d(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.d = this.a(random);
        this.l = aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        if (this.m == cq.c || this.m == cq.f) {
            this.b((aqp.m)aqt2, list, random, 1, 1);
        } else {
            this.c((aqp.m)aqt2, list, random, 1, 1);
        }
    }

    public static aqp.d a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, cq2);
        if (!aqp.d.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqp.d(n5, random, aqe2, cq2);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 4, 4, 4, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 1, 0);
        if (this.m == cq.c || this.m == cq.f) {
            this.a(adm2, aqe2, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
        } else {
            this.a(adm2, aqe2, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
        }
        return true;
    }
}
