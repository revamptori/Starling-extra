/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

class ayf.d
extends awi {
    private final List<pm.a> v;

    public ayf.d(ave ave2) {
        super(ave2, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, ((ayf)ayf.this).q.a * 4);
        this.v = Lists.newArrayList();
        this.b(false);
        for (pm.a a2 : pm.a.values()) {
            if (ayf.this.s.a(a2.d) <= 0 && ayf.this.s.a(a2.e) <= 0) continue;
            this.v.add((Object)a2);
        }
    }

    @Override
    protected int b() {
        return this.v.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean a(int n) {
        return false;
    }

    @Override
    protected int k() {
        return this.b() * ((ayf)ayf.this).q.a * 4;
    }

    @Override
    protected void a() {
        ayf.this.c();
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        pm.a a2 = (pm.a)this.v.get(n);
        String \u26032 = bnq.a("entity." + pm.b(a2.a) + ".name", new Object[0]);
        int \u26033 = ayf.this.s.a(a2.d);
        int \u26034 = ayf.this.s.a(a2.e);
        String \u26035 = bnq.a("stat.entityKills", \u26033, \u26032);
        String \u26036 = bnq.a("stat.entityKilledBy", \u26032, \u26034);
        if (\u26033 == 0) {
            \u26035 = bnq.a("stat.entityKills.none", \u26032);
        }
        if (\u26034 == 0) {
            \u26036 = bnq.a("stat.entityKilledBy.none", \u26032);
        }
        ayf.this.c(ayf.this.q, \u26032, n2 + 2 - 10, n3 + 1, 0xFFFFFF);
        ayf.this.c(ayf.this.q, \u26035, n2 + 2, n3 + 1 + ((ayf)ayf.this).q.a, \u26033 == 0 ? 0x606060 : 0x909090);
        ayf.this.c(ayf.this.q, \u26036, n2 + 2, n3 + 1 + ((ayf)ayf.this).q.a * 2, \u26034 == 0 ? 0x606060 : 0x909090);
    }
}
