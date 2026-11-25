/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class aql.c
implements aql.i {
    private aql.c() {
    }

    @Override
    public boolean a(aql.v v2) {
        return v2.c[cq.b.a()] && !v2.b[cq.b.a()].d;
    }

    @Override
    public aql.r a(cq cq2, aql.v v2, Random random) {
        aql.v v3 = v2;
        v3.d = true;
        v3.b[cq.b.a()].d = true;
        return new aql.m(cq2, v3, random);
    }
}
