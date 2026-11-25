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

public static class aqi.a
extends aqu {
    public aqi.a() {
    }

    public aqi.a(adm adm2, Random random, int n2, int n3) {
        super(n2, n3);
        aqj.q q2 = new aqj.q(random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add((Object)q2);
        q2.a(q2, (List<aqt>)this.a, random);
        List<aqt> \u26032 = q2.e;
        while (!\u26032.isEmpty()) {
            int n4 = random.nextInt(\u26032.size());
            aqt \u26033 = (aqt)\u26032.remove(n4);
            \u26033.a(q2, (List<aqt>)this.a, random);
        }
        this.c();
        this.a(adm2, random, 48, 70);
    }
}
