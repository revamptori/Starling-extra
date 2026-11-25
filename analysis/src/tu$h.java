/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class tu.h
extends ro {
    private final tu c;
    private boolean d;
    private boolean e = false;

    public tu.h(tu tu2) {
        super(tu2, 0.7f, 16);
        this.c = tu2;
    }

    @Override
    public boolean a() {
        if (this.a <= 0) {
            if (!this.c.o.Q().b("mobGriefing")) {
                return false;
            }
            this.e = false;
            this.d = this.c.cx();
        }
        return super.a();
    }

    @Override
    public boolean b() {
        return this.e && super.b();
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
    }

    @Override
    public void e() {
        super.e();
        this.c.p().a((double)this.b.n() + 0.5, this.b.o() + 1, (double)this.b.p() + 0.5, 10.0f, this.c.bQ());
        if (this.f()) {
            adm adm2 = this.c.o;
            cj \u26032 = this.b.a();
            alz \u26033 = adm2.p(\u26032);
            afh \u26034 = \u26033.c();
            if (this.e && \u26034 instanceof afq && \u26033.b(afq.a) == 7) {
                adm2.a(\u26032, afi.a.Q(), 2);
                adm2.b(\u26032, true);
                this.c.cp();
            }
            this.e = false;
            this.a = 10;
        }
    }

    @Override
    protected boolean a(adm adm2, cj cj2) {
        afh afh2 = adm2.p(cj2).c();
        if (afh2 == afi.ak && (afh2 = (\u2603 = adm2.p(cj2 = cj2.a())).c()) instanceof afq && \u2603.b(afq.a) == 7 && this.d && !this.e) {
            this.e = true;
            return true;
        }
        return false;
    }
}
