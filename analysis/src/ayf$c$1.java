/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

class ayf.c.1
implements Comparator<mu> {
    final /* synthetic */ ayf a;

    ayf.c.1(ayf ayf2) {
        this.a = ayf2;
    }

    public int a(mu mu2, mu mu3) {
        int n = zw.b(mu2.a());
        \u2603 = zw.b(mu3.a());
        mw \u26032 = null;
        mw \u26033 = null;
        if (c.this.y == 0) {
            \u26032 = na.ae[n];
            \u26033 = na.ae[\u2603];
        } else if (c.this.y == 1) {
            \u26032 = na.ac[n];
            \u26033 = na.ac[\u2603];
        } else if (c.this.y == 2) {
            \u26032 = na.ad[n];
            \u26033 = na.ad[\u2603];
        }
        if (\u26032 != null || \u26033 != null) {
            if (\u26032 == null) {
                return 1;
            }
            if (\u26033 == null) {
                return -1;
            }
            \u2603 = c.this.u.s.a(\u26032);
            if (\u2603 != (\u2603 = c.this.u.s.a(\u26033))) {
                return (\u2603 - \u2603) * c.this.z;
            }
        }
        return n - \u2603;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((mu)object, (mu)object2);
    }
}
