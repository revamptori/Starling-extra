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

static abstract class aqp.p
extends aqt {
    protected a d = a.a;

    public aqp.p() {
    }

    protected aqp.p(int n2) {
        super(n2);
    }

    @Override
    protected void a(dn dn2) {
        dn2.a("EntryDoor", this.d.name());
    }

    @Override
    protected void b(dn dn2) {
        this.d = a.valueOf(dn2.j("EntryDoor"));
    }

    protected void a(adm adm2, Random random, aqe aqe2, a a2, int n2, int n3, int n4) {
        switch (a2) {
            default: {
                this.a(adm2, aqe2, n2, n3, n4, n2 + 3 - 1, n3 + 3 - 1, n4, afi.a.Q(), afi.a.Q(), false);
                break;
            }
            case b: {
                this.a(adm2, afi.bf.Q(), n2, n3, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 1, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3, n4, aqe2);
                this.a(adm2, afi.ao.Q(), n2 + 1, n3, n4, aqe2);
                this.a(adm2, afi.ao.a(8), n2 + 1, n3 + 1, n4, aqe2);
                break;
            }
            case c: {
                this.a(adm2, afi.a.Q(), n2 + 1, n3, n4, aqe2);
                this.a(adm2, afi.a.Q(), n2 + 1, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2, n3, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2 + 1, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2 + 2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2 + 2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bi.Q(), n2 + 2, n3, n4, aqe2);
                break;
            }
            case d: {
                this.a(adm2, afi.bf.Q(), n2, n3, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 1, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3 + 2, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3 + 1, n4, aqe2);
                this.a(adm2, afi.bf.Q(), n2 + 2, n3, n4, aqe2);
                this.a(adm2, afi.aA.Q(), n2 + 1, n3, n4, aqe2);
                this.a(adm2, afi.aA.a(8), n2 + 1, n3 + 1, n4, aqe2);
                this.a(adm2, afi.aG.a(this.a(afi.aG, 4)), n2 + 2, n3 + 1, n4 + 1, aqe2);
                this.a(adm2, afi.aG.a(this.a(afi.aG, 3)), n2 + 2, n3 + 1, n4 - 1, aqe2);
            }
        }
    }

    protected a a(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return a.a;
            }
            case 2: {
                return a.b;
            }
            case 3: {
                return a.c;
            }
            case 4: 
        }
        return a.d;
    }

    protected aqt a(aqp.m m2, List<aqt> list, Random random, int n2, int n3) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n2, this.l.b + n3, this.l.c - 1, this.m, this.d());
                }
                case d: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n2, this.l.b + n3, this.l.f + 1, this.m, this.d());
                }
                case e: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a - 1, this.l.b + n3, this.l.c + n2, this.m, this.d());
                }
                case f: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.d + 1, this.l.b + n3, this.l.c + n2, this.m, this.d());
                }
            }
        }
        return null;
    }

    protected aqt b(aqp.m m2, List<aqt> list, Random random, int n2, int n3) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d());
                }
                case d: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, cq.e, this.d());
                }
                case e: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d());
                }
                case f: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, cq.c, this.d());
                }
            }
        }
        return null;
    }

    protected aqt c(aqp.m m2, List<aqt> list, Random random, int n2, int n3) {
        if (this.m != null) {
            switch (this.m) {
                case c: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d());
                }
                case d: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, cq.f, this.d());
                }
                case e: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d());
                }
                case f: {
                    return aqp.c(m2, (List<aqt>)list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, cq.d, this.d());
                }
            }
        }
        return null;
    }

    protected static boolean a(aqe aqe2) {
        return aqe2 != null && aqe2.b > 10;
    }

    public static enum a {
        a,
        b,
        c,
        d;

    }
}
