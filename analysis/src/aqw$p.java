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

public static class aqw.p
extends aqw.n {
    public aqw.p() {
    }

    public aqw.p(aqw.k k2, int n2, Random random, int n3, int n4) {
        super(k2, n2);
        this.m = cq.c.a.a(random);
        switch (this.m) {
            case c: 
            case d: {
                this.l = new aqe(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
                break;
            }
            default: {
                this.l = new aqe(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
            }
        }
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        aqw.e((aqw.k)aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.e - 4, this.l.c + 1, cq.e, this.d());
        aqw.e((aqw.k)aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.e - 4, this.l.c + 1, cq.f, this.d());
        aqw.e((aqw.k)aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.e - 4, this.l.c - 1, cq.c, this.d());
        aqw.e((aqw.k)aqt2, (List<aqt>)list, random, this.l.a + 1, this.l.e - 4, this.l.f + 1, cq.d, this.d());
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.h < 0) {
            this.h = this.b(adm2, aqe2);
            if (this.h < 0) {
                return true;
            }
            this.l.a(0, this.h - this.l.e + 3, 0);
        }
        this.a(adm2, aqe2, 1, 0, 1, 4, 12, 4, afi.e.Q(), afi.i.Q(), false);
        this.a(adm2, afi.a.Q(), 2, 12, 2, aqe2);
        this.a(adm2, afi.a.Q(), 3, 12, 2, aqe2);
        this.a(adm2, afi.a.Q(), 2, 12, 3, aqe2);
        this.a(adm2, afi.a.Q(), 3, 12, 3, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 13, 1, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 14, 1, aqe2);
        this.a(adm2, afi.aO.Q(), 4, 13, 1, aqe2);
        this.a(adm2, afi.aO.Q(), 4, 14, 1, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 13, 4, aqe2);
        this.a(adm2, afi.aO.Q(), 1, 14, 4, aqe2);
        this.a(adm2, afi.aO.Q(), 4, 13, 4, aqe2);
        this.a(adm2, afi.aO.Q(), 4, 14, 4, aqe2);
        this.a(adm2, aqe2, 1, 15, 1, 4, 15, 4, afi.e.Q(), afi.e.Q(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (\u2603 = 0; \u2603 <= 5; ++\u2603) {
                if (\u2603 != 0 && \u2603 != 5 && i2 != 0 && i2 != 5) continue;
                this.a(adm2, afi.n.Q(), \u2603, 11, i2, aqe2);
                this.b(adm2, \u2603, 12, i2, aqe2);
            }
        }
        return true;
    }
}
