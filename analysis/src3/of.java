/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class of
implements oo {
    private String a;
    private oo b;
    private oo c;

    public of(String string, oo oo2, oo oo3) {
        this.a = string;
        if (oo2 == null) {
            oo2 = oo3;
        }
        if (oo3 == null) {
            oo3 = oo2;
        }
        this.b = oo2;
        this.c = oo3;
        if (oo2.r_()) {
            oo3.a(oo2.i());
        } else if (oo3.r_()) {
            oo2.a(oo3.i());
        }
    }

    @Override
    public int o_() {
        return this.b.o_() + this.c.o_();
    }

    public boolean a(og og2) {
        return this.b == og2 || this.c == og2;
    }

    @Override
    public String e_() {
        if (this.b.l_()) {
            return this.b.e_();
        }
        if (this.c.l_()) {
            return this.c.e_();
        }
        return this.a;
    }

    @Override
    public boolean l_() {
        return this.b.l_() || this.c.l_();
    }

    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }

    @Override
    public zx a(int n) {
        if (n >= this.b.o_()) {
            return this.c.a(n - this.b.o_());
        }
        return this.b.a(n);
    }

    @Override
    public zx a(int n, int n2) {
        if (n >= this.b.o_()) {
            return this.c.a(n - this.b.o_(), n2);
        }
        return this.b.a(n, n2);
    }

    @Override
    public zx b(int n) {
        if (n >= this.b.o_()) {
            return this.c.b(n - this.b.o_());
        }
        return this.b.b(n);
    }

    @Override
    public void a(int n, zx zx2) {
        if (n >= this.b.o_()) {
            this.c.a(n - this.b.o_(), zx2);
        } else {
            this.b.a(n, zx2);
        }
    }

    @Override
    public int q_() {
        return this.b.q_();
    }

    @Override
    public void p_() {
        this.b.p_();
        this.c.p_();
    }

    @Override
    public boolean a(wn wn2) {
        return this.b.a(wn2) && this.c.a(wn2);
    }

    @Override
    public void b(wn wn2) {
        this.b.b(wn2);
        this.c.b(wn2);
    }

    @Override
    public void c(wn wn2) {
        this.b.c(wn2);
        this.c.c(wn2);
    }

    @Override
    public boolean b(int n, zx zx2) {
        return true;
    }

    @Override
    public int a_(int n) {
        return 0;
    }

    @Override
    public void b(int n, int n2) {
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public boolean r_() {
        return this.b.r_() || this.c.r_();
    }

    @Override
    public void a(on on2) {
        this.b.a(on2);
        this.c.a(on2);
    }

    @Override
    public on i() {
        return this.b.i();
    }

    @Override
    public String k() {
        return this.b.k();
    }

    @Override
    public xi a(wm wm2, wn wn2) {
        return new xo(wm2, this, wn2);
    }

    @Override
    public void l() {
        this.b.l();
        this.c.l();
    }
}
