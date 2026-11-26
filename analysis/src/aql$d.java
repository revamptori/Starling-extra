/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class aql.d
implements aql.i {
    private aql.d() {
    }

    @Override
    public boolean a(aql.v v2) {
        if (v2.c[cq.c.a()] && !v2.b[cq.c.a()].d && v2.c[cq.b.a()] && !v2.b[cq.b.a()].d) {
            \u2603 = v2.b[cq.c.a()];
            return \u2603.c[cq.b.a()] && !\u2603.b[cq.b.a()].d;
        }
        return false;
    }

    @Override
    public aql.r a(cq cq2, aql.v v2, Random random) {
        v2.d = true;
        v2.b[cq.c.a()].d = true;
        v2.b[cq.b.a()].d = true;
        v2.b[cq.c.a()].b[cq.b.a()].d = true;
        return new aql.n(cq2, v2, random);
    }
}
