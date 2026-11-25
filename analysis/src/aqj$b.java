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

public static class aqj.b
extends aqj.m {
    private int b;

    public aqj.b() {
    }

    public aqj.b(int n2, Random random, aqe aqe2, cq cq2) {
        super(n2);
        this.m = cq2;
        this.l = aqe2;
        this.b = random.nextInt();
    }

    public static aqj.b a(List<aqt> list, Random random, int n2, int n3, int n4, cq cq2, int n5) {
        aqe aqe2 = aqe.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, cq2);
        if (!aqj.b.a(aqe2) || aqt.a(list, aqe2) != null) {
            return null;
        }
        return new aqj.b(n5, random, aqe2, cq2);
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        this.b = dn2.f("Seed");
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        dn2.a("Seed", this.b);
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        int n2;
        int \u26032;
        Random random2 = new Random((long)this.b);
        for (\u26032 = 0; \u26032 <= 4; ++\u26032) {
            for (n2 = 3; n2 <= 4; ++n2) {
                \u2603 = random2.nextInt(8);
                this.a(adm2, aqe2, \u26032, n2, 0, \u26032, n2, \u2603, afi.by.Q(), afi.by.Q(), false);
            }
        }
        \u26032 = random2.nextInt(8);
        this.a(adm2, aqe2, 0, 5, 0, 0, 5, \u26032, afi.by.Q(), afi.by.Q(), false);
        \u26032 = random2.nextInt(8);
        this.a(adm2, aqe2, 4, 5, 0, 4, 5, \u26032, afi.by.Q(), afi.by.Q(), false);
        for (\u26032 = 0; \u26032 <= 4; ++\u26032) {
            n2 = random2.nextInt(5);
            this.a(adm2, aqe2, \u26032, 2, 0, \u26032, 2, n2, afi.by.Q(), afi.by.Q(), false);
        }
        for (\u26032 = 0; \u26032 <= 4; ++\u26032) {
            for (n2 = 0; n2 <= 1; ++n2) {
                \u2603 = random2.nextInt(3);
                this.a(adm2, aqe2, \u26032, n2, 0, \u26032, n2, \u2603, afi.by.Q(), afi.by.Q(), false);
            }
        }
        return true;
    }
}
