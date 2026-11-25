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

public static class aqp.i
extends aqp.d {
    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        if (this.m == cq.c || this.m == cq.f) {
            this.c((aqp.m)aqt2, list, random, 1, 1);
        } else {
            this.b((aqp.m)aqt2, list, random, 1, 1);
        }
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, 0, 0, 0, 4, 4, 4, true, random, e);
        this.a(adm2, random, aqe2, this.d, 1, 1, 0);
        if (this.m == cq.c || this.m == cq.f) {
            this.a(adm2, aqe2, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
        } else {
            this.a(adm2, aqe2, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
        }
        return true;
    }
}
