/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class afe.a {
    private final adm b;
    private final cj c;
    private final afe d;
    private alz e;
    private final boolean f;
    private final List<cj> g = Lists.newArrayList();

    public afe.a(adm adm2, cj cj2, alz alz2) {
        this.b = adm2;
        this.c = cj2;
        this.e = alz2;
        this.d = (afe)alz2.c();
        afe.b b2 = alz2.b(afe.this.n());
        this.f = this.d.a;
        this.a(b2);
    }

    private void a(afe.b b2) {
        this.g.clear();
        switch (b2) {
            case a: {
                this.g.add((Object)this.c.c());
                this.g.add((Object)this.c.d());
                break;
            }
            case b: {
                this.g.add((Object)this.c.e());
                this.g.add((Object)this.c.f());
                break;
            }
            case c: {
                this.g.add((Object)this.c.e());
                this.g.add((Object)this.c.f().a());
                break;
            }
            case d: {
                this.g.add((Object)this.c.e().a());
                this.g.add((Object)this.c.f());
                break;
            }
            case e: {
                this.g.add((Object)this.c.c().a());
                this.g.add((Object)this.c.d());
                break;
            }
            case f: {
                this.g.add((Object)this.c.c());
                this.g.add((Object)this.c.d().a());
                break;
            }
            case g: {
                this.g.add((Object)this.c.f());
                this.g.add((Object)this.c.d());
                break;
            }
            case h: {
                this.g.add((Object)this.c.e());
                this.g.add((Object)this.c.d());
                break;
            }
            case i: {
                this.g.add((Object)this.c.e());
                this.g.add((Object)this.c.c());
                break;
            }
            case j: {
                this.g.add((Object)this.c.f());
                this.g.add((Object)this.c.c());
            }
        }
    }

    private void c() {
        for (int i = 0; i < this.g.size(); ++i) {
            afe.a a2 = this.b((cj)this.g.get(i));
            if (a2 == null || !a2.a(this)) {
                this.g.remove(i--);
                continue;
            }
            this.g.set(i, (Object)a2.c);
        }
    }

    private boolean a(cj cj2) {
        return afe.e(this.b, cj2) || afe.e(this.b, cj2.a()) || afe.e(this.b, cj2.b());
    }

    private afe.a b(cj cj2) {
        \u26032 = cj2;
        alz alz2 = this.b.p(\u26032);
        if (afe.d(alz2)) {
            return new afe.a(this.b, \u26032, alz2);
        }
        cj \u26032 = cj2.a();
        alz2 = this.b.p(\u26032);
        if (afe.d(alz2)) {
            return new afe.a(this.b, \u26032, alz2);
        }
        \u26032 = cj2.b();
        alz2 = this.b.p(\u26032);
        if (afe.d(alz2)) {
            return new afe.a(this.b, \u26032, alz2);
        }
        return null;
    }

    private boolean a(afe.a a2) {
        return this.c(a2.c);
    }

    private boolean c(cj cj2) {
        for (int i = 0; i < this.g.size(); ++i) {
            cj cj3 = (cj)this.g.get(i);
            if (cj3.n() != cj2.n() || cj3.p() != cj2.p()) continue;
            return true;
        }
        return false;
    }

    protected int a() {
        int n = 0;
        for (cq cq2 : cq.c.a) {
            if (!this.a(this.c.a(cq2))) continue;
            ++n;
        }
        return n;
    }

    private boolean b(afe.a a2) {
        return this.a(a2) || this.g.size() != 2;
    }

    private void c(afe.a a2) {
        this.g.add((Object)a2.c);
        cj cj2 = this.c.c();
        \u2603 = this.c.d();
        \u2603 = this.c.e();
        \u2603 = this.c.f();
        boolean \u26032 = this.c(cj2);
        boolean \u26033 = this.c(\u2603);
        boolean \u26034 = this.c(\u2603);
        boolean \u26035 = this.c(\u2603);
        afe.b \u26036 = null;
        if (\u26032 || \u26033) {
            \u26036 = afe.b.a;
        }
        if (\u26034 || \u26035) {
            \u26036 = afe.b.b;
        }
        if (!this.f) {
            if (\u26033 && \u26035 && !\u26032 && !\u26034) {
                \u26036 = afe.b.g;
            }
            if (\u26033 && \u26034 && !\u26032 && !\u26035) {
                \u26036 = afe.b.h;
            }
            if (\u26032 && \u26034 && !\u26033 && !\u26035) {
                \u26036 = afe.b.i;
            }
            if (\u26032 && \u26035 && !\u26033 && !\u26034) {
                \u26036 = afe.b.j;
            }
        }
        if (\u26036 == afe.b.a) {
            if (afe.e(this.b, cj2.a())) {
                \u26036 = afe.b.e;
            }
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.f;
            }
        }
        if (\u26036 == afe.b.b) {
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.c;
            }
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.d;
            }
        }
        if (\u26036 == null) {
            \u26036 = afe.b.a;
        }
        this.e = this.e.a(this.d.n(), \u26036);
        this.b.a(this.c, this.e, 3);
    }

    private boolean d(cj cj2) {
        afe.a a2 = this.b(cj2);
        if (a2 == null) {
            return false;
        }
        a2.c();
        return a2.b(this);
    }

    public afe.a a(boolean bl, boolean bl2) {
        cj cj2 = this.c.c();
        \u2603 = this.c.d();
        \u2603 = this.c.e();
        \u2603 = this.c.f();
        boolean \u26032 = this.d(cj2);
        boolean \u26033 = this.d(\u2603);
        boolean \u26034 = this.d(\u2603);
        boolean \u26035 = this.d(\u2603);
        afe.b \u26036 = null;
        if ((\u26032 || \u26033) && !\u26034 && !\u26035) {
            \u26036 = afe.b.a;
        }
        if ((\u26034 || \u26035) && !\u26032 && !\u26033) {
            \u26036 = afe.b.b;
        }
        if (!this.f) {
            if (\u26033 && \u26035 && !\u26032 && !\u26034) {
                \u26036 = afe.b.g;
            }
            if (\u26033 && \u26034 && !\u26032 && !\u26035) {
                \u26036 = afe.b.h;
            }
            if (\u26032 && \u26034 && !\u26033 && !\u26035) {
                \u26036 = afe.b.i;
            }
            if (\u26032 && \u26035 && !\u26033 && !\u26034) {
                \u26036 = afe.b.j;
            }
        }
        if (\u26036 == null) {
            if (\u26032 || \u26033) {
                \u26036 = afe.b.a;
            }
            if (\u26034 || \u26035) {
                \u26036 = afe.b.b;
            }
            if (!this.f) {
                if (bl) {
                    if (\u26033 && \u26035) {
                        \u26036 = afe.b.g;
                    }
                    if (\u26034 && \u26033) {
                        \u26036 = afe.b.h;
                    }
                    if (\u26035 && \u26032) {
                        \u26036 = afe.b.j;
                    }
                    if (\u26032 && \u26034) {
                        \u26036 = afe.b.i;
                    }
                } else {
                    if (\u26032 && \u26034) {
                        \u26036 = afe.b.i;
                    }
                    if (\u26035 && \u26032) {
                        \u26036 = afe.b.j;
                    }
                    if (\u26034 && \u26033) {
                        \u26036 = afe.b.h;
                    }
                    if (\u26033 && \u26035) {
                        \u26036 = afe.b.g;
                    }
                }
            }
        }
        if (\u26036 == afe.b.a) {
            if (afe.e(this.b, cj2.a())) {
                \u26036 = afe.b.e;
            }
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.f;
            }
        }
        if (\u26036 == afe.b.b) {
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.c;
            }
            if (afe.e(this.b, \u2603.a())) {
                \u26036 = afe.b.d;
            }
        }
        if (\u26036 == null) {
            \u26036 = afe.b.a;
        }
        this.a(\u26036);
        this.e = this.e.a(this.d.n(), \u26036);
        if (bl2 || this.b.p(this.c) != this.e) {
            this.b.a(this.c, this.e, 3);
            for (int i = 0; i < this.g.size(); ++i) {
                afe.a a2 = this.b((cj)this.g.get(i));
                if (a2 == null) continue;
                a2.c();
                if (!a2.b(this)) continue;
                a2.c(this);
            }
        }
        return this;
    }

    public alz b() {
        return this.e;
    }
}
