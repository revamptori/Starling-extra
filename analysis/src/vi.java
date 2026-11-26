/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class vi
extends va {
    private int a = -1;

    public vi(adm adm2) {
        super(adm2);
    }

    public vi(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
    }

    @Override
    public va.a s() {
        return va.a.d;
    }

    @Override
    public alz u() {
        return afi.W.Q();
    }

    @Override
    public void t_() {
        double d;
        super.t_();
        if (this.a > 0) {
            --this.a;
            this.o.a(cy.l, this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.a == 0) {
            this.b(this.v * this.v + this.x * this.x);
        }
        if (this.D && (d = this.v * this.v + this.x * this.x) >= (double)0.01f) {
            this.b(d);
        }
    }

    @Override
    public boolean a(ow ow2, float f) {
        pk pk2 = ow2.i();
        if (pk2 instanceof wq && (\u2603 = (wq)pk2).at()) {
            this.b(\u2603.v * \u2603.v + \u2603.w * \u2603.w + \u2603.x * \u2603.x);
        }
        return super.a(ow2, f);
    }

    @Override
    public void a(ow ow2) {
        super.a(ow2);
        double d = this.v * this.v + this.x * this.x;
        if (!ow2.c() && this.o.Q().b("doEntityDrops")) {
            this.a(new zx(afi.W, 1), 0.0f);
        }
        if (ow2.o() || ow2.c() || d >= (double)0.01f) {
            this.b(d);
        }
    }

    protected void b(double d) {
        if (!this.o.D) {
            \u2603 = Math.sqrt((double)d);
            if (\u2603 > 5.0) {
                \u2603 = 5.0;
            }
            this.o.a(this, this.s, this.t, this.u, (float)(4.0 + this.V.nextDouble() * 1.5 * \u2603), true);
            this.J();
        }
    }

    @Override
    public void e(float f, float f2) {
        if (f >= 3.0f) {
            \u2603 = f / 10.0f;
            this.b((double)(\u2603 * \u2603));
        }
        super.e(f, f2);
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl) {
        if (bl && this.a < 0) {
            this.j();
        }
    }

    @Override
    public void a(byte by) {
        if (by == 10) {
            this.j();
        } else {
            super.a(by);
        }
    }

    public void j() {
        this.a = 80;
        if (!this.o.D) {
            this.o.a((pk)this, (byte)10);
            if (!this.R()) {
                this.o.a(this, "game.tnt.primed", 1.0f, 1.0f);
            }
        }
    }

    public int l() {
        return this.a;
    }

    public boolean y() {
        return this.a > -1;
    }

    @Override
    public float a(adi adi2, adm adm2, cj cj2, alz alz2) {
        if (this.y() && (afe.d(alz2) || afe.e(adm2, cj2.a()))) {
            return 0.0f;
        }
        return super.a(adi2, adm2, cj2, alz2);
    }

    @Override
    public boolean a(adi adi2, adm adm2, cj cj2, alz alz2, float f) {
        if (this.y() && (afe.d(alz2) || afe.e(adm2, cj2.a()))) {
            return false;
        }
        return super.a(adi2, adm2, cj2, alz2, f);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
        if (dn2.b("TNTFuse", 99)) {
            this.a = dn2.f("TNTFuse");
        }
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
        dn2.a("TNTFuse", this.a);
    }
}
