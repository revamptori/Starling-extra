/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public static class aqg.c
extends aqt {
    private List<aqe> a = Lists.newLinkedList();

    public aqg.c() {
    }

    public aqg.c(int n, Random random, int n2, int n3) {
        super(n);
        this.l = new aqe(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }

    @Override
    public void a(aqt aqt2, List<aqt> list, Random random) {
        int n;
        aqe \u26032;
        aqt aqt3;
        int n2 = this.d();
        \u2603 = this.l.d() - 3 - 1;
        if (\u2603 <= 0) {
            \u2603 = 1;
        }
        for (n = 0; n < this.l.c() && (n += random.nextInt(this.l.c())) + 3 <= this.l.c(); n += 4) {
            aqt3 = aqg.b(aqt2, (List<aqt>)list, random, this.l.a + n, this.l.b + random.nextInt(\u2603) + 1, this.l.c - 1, cq.c, n2);
            if (aqt3 == null) continue;
            \u26032 = aqt3.c();
            this.a.add((Object)new aqe(\u26032.a, \u26032.b, this.l.c, \u26032.d, \u26032.e, this.l.c + 1));
        }
        for (n = 0; n < this.l.c() && (n += random.nextInt(this.l.c())) + 3 <= this.l.c(); n += 4) {
            aqt3 = aqg.b(aqt2, (List<aqt>)list, random, this.l.a + n, this.l.b + random.nextInt(\u2603) + 1, this.l.f + 1, cq.d, n2);
            if (aqt3 == null) continue;
            \u26032 = aqt3.c();
            this.a.add((Object)new aqe(\u26032.a, \u26032.b, this.l.f - 1, \u26032.d, \u26032.e, this.l.f));
        }
        for (n = 0; n < this.l.e() && (n += random.nextInt(this.l.e())) + 3 <= this.l.e(); n += 4) {
            aqt3 = aqg.b(aqt2, (List<aqt>)list, random, this.l.a - 1, this.l.b + random.nextInt(\u2603) + 1, this.l.c + n, cq.e, n2);
            if (aqt3 == null) continue;
            \u26032 = aqt3.c();
            this.a.add((Object)new aqe(this.l.a, \u26032.b, \u26032.c, this.l.a + 1, \u26032.e, \u26032.f));
        }
        for (n = 0; n < this.l.e() && (n += random.nextInt(this.l.e())) + 3 <= this.l.e(); n += 4) {
            aqt3 = aqg.b(aqt2, (List<aqt>)list, random, this.l.d + 1, this.l.b + random.nextInt(\u2603) + 1, this.l.c + n, cq.f, n2);
            if (aqt3 == null) continue;
            \u26032 = aqt3.c();
            this.a.add((Object)new aqe(this.l.d - 1, \u26032.b, \u26032.c, this.l.d, \u26032.e, \u26032.f));
        }
    }

    @Override
    public boolean a(adm adm2, Random random, aqe aqe2) {
        if (this.a(adm2, aqe2)) {
            return false;
        }
        this.a(adm2, aqe2, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
        this.a(adm2, aqe2, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min((int)(this.l.b + 3), (int)this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
        for (aqe aqe3 : this.a) {
            this.a(adm2, aqe2, aqe3.a, aqe3.e - 2, aqe3.c, aqe3.d, aqe3.e, aqe3.f, afi.a.Q(), afi.a.Q(), false);
        }
        this.a(adm2, aqe2, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
        return true;
    }

    @Override
    public void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        for (aqe aqe2 : this.a) {
            aqe2.a(n, n2, n3);
        }
    }

    @Override
    protected void a(dn dn22) {
        dn dn22;
        du du2 = new du();
        for (aqe aqe2 : this.a) {
            du2.a(aqe2.g());
        }
        dn22.a("Entrances", du2);
    }

    @Override
    protected void b(dn dn2) {
        du du2 = dn2.c("Entrances", 11);
        for (int i = 0; i < du2.c(); ++i) {
            this.a.add((Object)new aqe(du2.c(i)));
        }
    }
}
