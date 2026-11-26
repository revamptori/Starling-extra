/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map$Entry
 *  java.util.TreeMap
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class axy
extends axu {
    private final axu a;
    private final avh f;
    private final List<String> g = Lists.newArrayList();
    private final List<String> h = Lists.newArrayList();
    private String i;
    private String[] r;
    private a s;
    private avs t;

    public axy(axu axu2, avh avh2) {
        this.a = axu2;
        this.f = avh2;
    }

    @Override
    public void b() {
        this.i = bnq.a("options.snooper.title", new Object[0]);
        String string = bnq.a("options.snooper.desc", new Object[0]);
        ArrayList \u26032 = Lists.newArrayList();
        for (String string2 : this.q.c(string, this.l - 30)) {
            \u26032.add((Object)string2);
        }
        this.r = (String[])\u26032.toArray((Object[])new String[\u26032.size()]);
        this.g.clear();
        this.h.clear();
        this.t = new avs(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(avh.a.u));
        this.n.add((Object)this.t);
        this.n.add((Object)new avs(2, this.l / 2 + 2, this.m - 30, 150, 20, bnq.a("gui.done", new Object[0])));
        boolean \u26033 = this.j.G() != null && this.j.G().av() != null;
        for (Map.Entry entry : new TreeMap(this.j.I().c()).entrySet()) {
            this.g.add((Object)((\u26033 ? "C " : "") + (String)entry.getKey()));
            this.h.add((Object)this.q.a((String)entry.getValue(), this.l - 220));
        }
        if (\u26033) {
            for (Map.Entry entry : new TreeMap(this.j.G().av().c()).entrySet()) {
                this.g.add((Object)("S " + (String)entry.getKey()));
                this.h.add((Object)this.q.a((String)entry.getValue(), this.l - 220));
            }
        }
        this.s = new a();
    }

    @Override
    public void k() {
        super.k();
        this.s.p();
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k == 2) {
            this.f.b();
            this.f.b();
            this.j.a(this.a);
        }
        if (avs2.k == 1) {
            this.f.a(avh.a.u, 1);
            this.t.j = this.f.c(avh.a.u);
        }
    }

    @Override
    public void a(int n22, int n3, float f) {
        int n22;
        this.c();
        this.s.a(n22, n3, f);
        this.a(this.q, this.i, this.l / 2, 8, 0xFFFFFF);
        int n4 = 22;
        for (String string : this.r) {
            this.a(this.q, string, this.l / 2, n4, 0x808080);
            n4 += this.q.a;
        }
        super.a(n22, n3, f);
    }

    class a
    extends awi {
        public a() {
            super(axy.this.j, axy.this.l, axy.this.m, 80, axy.this.m - 40, axy.this.q.a + 1);
        }

        @Override
        protected int b() {
            return axy.this.g.size();
        }

        @Override
        protected void a(int n, boolean bl, int n2, int n3) {
        }

        @Override
        protected boolean a(int n) {
            return false;
        }

        @Override
        protected void a() {
        }

        @Override
        protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
            axy.this.q.a((String)axy.this.g.get(n), 10, n3, 0xFFFFFF);
            axy.this.q.a((String)axy.this.h.get(n), 230, n3, 0xFFFFFF);
        }

        @Override
        protected int d() {
            return this.b - 10;
        }
    }
}
