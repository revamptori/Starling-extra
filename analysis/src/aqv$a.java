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

public static class aqv.a
extends aqu {
    private boolean c;

    public aqv.a() {
    }

    public aqv.a(adm adm2, Random random, int n2, int n3, int n4) {
        super(n2, n3);
        int n5;
        List<aqw.e> list = aqw.a(random, n4);
        aqw.k \u26032 = new aqw.k(adm2.v(), 0, random, (n2 << 4) + 2, (n3 << 4) + 2, list, n4);
        this.a.add((Object)\u26032);
        \u26032.a(\u26032, (List<aqt>)this.a, random);
        List<aqt> \u26033 = \u26032.g;
        List<aqt> \u26034 = \u26032.f;
        while (!\u26033.isEmpty() || !\u26034.isEmpty()) {
            Object \u26035;
            if (\u26033.isEmpty()) {
                n5 = random.nextInt(\u26034.size());
                \u26035 = (aqt)\u26034.remove(n5);
                ((aqt)\u26035).a(\u26032, (List<aqt>)this.a, random);
                continue;
            }
            n5 = random.nextInt(\u26033.size());
            \u26035 = (aqt)\u26033.remove(n5);
            ((aqt)\u26035).a(\u26032, (List<aqt>)this.a, random);
        }
        this.c();
        n5 = 0;
        for (aqt aqt2 : this.a) {
            if (aqt2 instanceof aqw.o) continue;
            ++n5;
        }
        this.c = n5 > 2;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public void a(dn dn2) {
        super.a(dn2);
        dn2.a("Valid", this.c);
    }

    @Override
    public void b(dn dn2) {
        super.b(dn2);
        this.c = dn2.n("Valid");
    }
}
