/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public static class aqm.a
extends aqu {
    public aqm.a() {
    }

    public aqm.a(adm adm2, Random random, int n, int n2) {
        super(n, n2);
        ady ady2 = adm2.b(new cj(n * 16 + 8, 0, n2 * 16 + 8));
        if (ady2 == ady.K || ady2 == ady.L) {
            aqn.b b2 = new aqn.b(random, n * 16, n2 * 16);
            this.a.add((Object)b2);
        } else if (ady2 == ady.v) {
            aqn.d d2 = new aqn.d(random, n * 16, n2 * 16);
            this.a.add((Object)d2);
        } else if (ady2 == ady.r || ady2 == ady.G) {
            aqn.a a2 = new aqn.a(random, n * 16, n2 * 16);
            this.a.add((Object)a2);
        }
        this.c();
    }
}
