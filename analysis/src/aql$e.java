/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class aql.e
implements aql.i {
    private aql.e() {
    }

    @Override
    public boolean a(aql.v v2) {
        return v2.c[cq.c.a()] && !v2.b[cq.c.a()].d;
    }

    @Override
    public aql.r a(cq cq2, aql.v v2, Random random) {
        aql.v v3 = v2;
        if (!v2.c[cq.c.a()] || v2.b[cq.c.a()].d) {
            v3 = v2.b[cq.d.a()];
        }
        v3.d = true;
        v3.b[cq.c.a()].d = true;
        return new aql.o(cq2, v3, random);
    }
}
