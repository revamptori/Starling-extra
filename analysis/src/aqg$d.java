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

public static class aqg.d
extends aqt {
    public aqg.d() {
    }

    public aqg.d(int n, Random random, aqe aqe2, cq cq2) {
        super(n);
        this.m = cq2;
        this.l = aqe2;
    }

    @Override
    protected void a(dn dn2) {
    }

    @Override
    protected void b(dn dn2) {
    }

    public static aqe a(List<aqt> list, Random random, int n, int n2, int n3, cq cq2) {
        aqe aqe2 = new aqe(n, n2 - 5, n3, n, n2 + 2, n3);
        switch (cq2) {
            case c: {
                aqe2.d = n + 2;
                aqe2.c = n3 - 8;
                break;
            }
            case d: {
                aqe2.d = n + 2;
                aqe2.f = n3 + 8;
                break;
            }
            case e: {
                aqe2.a = n - 8;
                aqe2.f = n3 + 2;
                break;
            }
            case f: {
                aqe2.d = n + 8;
                aqe2.f = n3 + 2;
            }
        }
        if (aqt.a(list, aqe2) != null) {
            return null;
        }
        return aqe2;
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        int n = this.d();
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b, this.l.c - 1, cq.c, n);
                    break;
                }
                case d: {
                    aqg.b(aqt2, (List<aqt>)list, random, this.l.a, this.l.b, this.l.f + 1, cq.d, n);
                    break;
                }
                case e: {
                    aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b, this.l.c, cq.e, n);
                    break;
                }
                case f: {
                    aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b, this.l.c, cq.f, n);
                }
            }
        }
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 5, 0, 2, 7, 1, afi.a.Q(), afi.a.Q(), false);
        this.a(adm2, aqe2, 0, 0, 7, 2, 2, 8, afi.a.Q(), afi.a.Q(), false);
        for (int i = 0; i < 5; ++i) {
            this.a(adm2, aqe2, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, afi.a.Q(), afi.a.Q(), false);
        }
        return true;
    }
}
