/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class vt.a
extends rd {
    private vt a;
    private int b;

    public vt.a(vt vt2) {
        this.a = vt2;
        this.a(3);
    }

    @Override
    public boolean a() {
        pr pr2 = this.a.u();
        return pr2 != null && pr2.ai();
    }

    @Override
    public boolean b() {
        return super.b() && (this.a.cn() || this.a.h(this.a.u()) > 9.0);
    }

    @Override
    public void c() {
        this.b = -10;
        this.a.s().n();
        this.a.p().a(this.a.u(), 90.0f, 90.0f);
        this.a.ai = true;
    }

    @Override
    public void d() {
        this.a.b(0);
        this.a.d((pr)null);
        this.a.br.f();
    }

    @Override
    public void e() {
        pr pr2 = this.a.u();
        this.a.s().n();
        this.a.p().a(pr2, 90.0f, 90.0f);
        if (!this.a.t(pr2)) {
            this.a.d((pr)null);
            return;
        }
        ++this.b;
        if (this.b == 0) {
            this.a.b(this.a.u().F());
            this.a.o.a((pk)this.a, (byte)21);
        } else if (this.b >= this.a.cm()) {
            float f = 1.0f;
            if (this.a.o.aa() == oj.d) {
                f += 2.0f;
            }
            if (this.a.cn()) {
                f += 2.0f;
            }
            pr2.a(ow.b(this.a, this.a), f);
            pr2.a(ow.a(this.a), (float)this.a.a(vy.e).e());
            this.a.d((pr)null);
        } else if (this.b < 60 || this.b % 20 == 0) {
            // empty if block
        }
        super.e();
    }
}
