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

public static class aqw.d
extends aqw.n {
    public aqw.d() {
    }

    public aqw.d(aqw.k k2, int n2, Random random, aqe aqe2, cq cq2) {
        super(k2, n2);
        this.m = cq2;
        this.l = aqe2;
    }

    public static aqe a(aqw.k k2, List<aqt> list, Random random, int n2, int n3, int n4, cq cq2) {
        aqe aqe2 = aqe.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, cq2);
        if (aqt.a(list, aqe2) != null) {
            return null;
        }
        return aqe2;
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 4 - 1, 0);
        }
        this.a(adm2, aqe2, 0, 0, 0, 2, 3, 1, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, afi.aO.Q(), 1, 0, 0, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 1, 0, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 2, 0, aqe2);
        this.a(adm2, afi.L.a(zd.a.b()), 1, 3, 0, aqe2);
        boolean bl = this.m == cq.f || this.m == cq.c;
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.e()), bl ? 2 : 0, 3, 0, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m), 1, 3, 1, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.f()), bl ? 0 : 2, 3, 0, aqe2);
        this.a(adm2, afi.aa.Q().a(akf.a, this.m.d()), 1, 3, -1, aqe2);
        return true;
    }
}
