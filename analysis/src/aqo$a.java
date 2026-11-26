/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public static class aqo.a
extends aqu {
    public aqo.a() {
    }

    public aqo.a(adm adm2, Random random, int n2, int n3) {
        super(n2, n3);
        aqp.b();
        aqp.m m2 = new aqp.m(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add((Object)m2);
        m2.a(m2, (List<aqt>)this.a, random);
        List<aqt> \u26032 = m2.c;
        while (!\u26032.isEmpty()) {
            int n4 = random.nextInt(\u26032.size());
            aqt \u26033 = (aqt)\u26032.remove(n4);
            \u26033.a(m2, (List<aqt>)this.a, random);
        }
        this.c();
        this.a(adm2, random, 10);
    }
}
