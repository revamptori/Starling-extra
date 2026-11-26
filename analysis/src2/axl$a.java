/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

class axl.a
extends awi {
    private final List<String> v;
    private final Map<String, bnr> w;

    public axl.a(ave ave2) {
        super(ave2, axl.this.l, axl.this.m, 32, axl.this.m - 65 + 4, 18);
        this.v = Lists.newArrayList();
        this.w = Maps.newHashMap();
        for (bnr bnr2 : axl.this.h.d()) {
            this.w.put((Object)bnr2.a(), (Object)bnr2);
            this.v.add((Object)bnr2.a());
        }
    }

    @Override
    protected int b() {
        return this.v.size();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        bnr bnr2 = (bnr)this.w.get(this.v.get(n));
        axl.this.h.a(bnr2);
        ((axl)axl.this).g.aN = bnr2.a();
        this.a.e();
        axl.this.q.a(axl.this.h.a() || ((axl)axl.this).g.aO);
        axl.this.q.b(axl.this.h.b());
        ((axl)axl.this).r.j = bnq.a("gui.done", new Object[0]);
        ((axl)axl.this).i.j = axl.this.g.c(avh.a.E);
        axl.this.g.b();
    }

    @Override
    protected boolean a(int n) {
        return ((String)this.v.get(n)).equals((Object)axl.this.h.c().a());
    }

    @Override
    protected int k() {
        return this.b() * 18;
    }

    @Override
    protected void a() {
        axl.this.c();
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        axl.this.q.b(true);
        axl.this.a(axl.this.q, ((bnr)this.w.get(this.v.get(n))).toString(), this.b / 2, n3 + 1, 0xFFFFFF);
        axl.this.q.b(axl.this.h.c().b());
    }
}
