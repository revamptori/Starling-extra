/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class aql.g
implements aql.i {
    private aql.g() {
    }

    @Override
    public boolean a(aql.v v2) {
        return !v2.c[cq.e.a()] && !v2.c[cq.f.a()] && !v2.c[cq.c.a()] && !v2.c[cq.d.a()] && !v2.c[cq.b.a()];
    }

    @Override
    public aql.r a(cq cq2, aql.v v2, Random random) {
        v2.d = true;
        return new aql.t(cq2, v2, random);
    }
}
