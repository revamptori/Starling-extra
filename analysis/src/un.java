/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  org.apache.commons.lang3.Validate
 */
import java.util.List;
import org.apache.commons.lang3.Validate;

public abstract class un
extends pk {
    private int c;
    protected cj a;
    public cq b;

    public un(adm adm2) {
        super(adm2);
        this.a(0.5f, 0.5f);
    }

    public un(adm adm2, cj cj2) {
        this(adm2);
        this.a = cj2;
    }

    @Override
    protected void h() {
    }

    protected void a(cq cq2) {
        Validate.notNull((Object)cq2);
        Validate.isTrue((boolean)cq2.k().c());
        this.b = cq2;
        this.A = this.y = (float)(this.b.b() * 90);
        this.o();
    }

    private void o() {
        if (this.b == null) {
            return;
        }
        double d = (double)this.a.n() + 0.5;
        \u2603 = (double)this.a.o() + 0.5;
        \u2603 = (double)this.a.p() + 0.5;
        \u2603 = 0.46875;
        \u2603 = this.a(this.l());
        \u2603 = this.a(this.m());
        d -= (double)this.b.g() * 0.46875;
        \u2603 -= (double)this.b.i() * 0.46875;
        cq \u26032 = this.b.f();
        this.s = d += \u2603 * (double)\u26032.g();
        this.t = \u2603 += \u2603;
        this.u = \u2603 += \u2603 * (double)\u26032.i();
        \u2603 = this.l();
        \u2603 = this.m();
        \u2603 = this.l();
        if (this.b.k() == cq.a.c) {
            \u2603 = 1.0;
        } else {
            \u2603 = 1.0;
        }
        this.a(new aug(d - (\u2603 /= 32.0), \u2603 - (\u2603 /= 32.0), \u2603 - (\u2603 /= 32.0), d + \u2603, \u2603 + \u2603, \u2603 + \u2603));
    }

    private double a(int n2) {
        return n2 % 32 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.c++ == 100 && !this.o.D) {
            this.c = 0;
            if (!this.I && !this.j()) {
                this.J();
                this.b((pk)null);
            }
        }
    }

    public boolean j() {
        if (!this.o.a((pk)this, this.aR()).isEmpty()) {
            return false;
        }
        int n2 = Math.max((int)1, (int)(this.l() / 16));
        \u2603 = Math.max((int)1, (int)(this.m() / 16));
        cj \u26032 = this.a.a(this.b.d());
        cq \u26033 = this.b.f();
        for (\u2603 = 0; \u2603 < n2; ++\u2603) {
            for (\u2603 = 0; \u2603 < \u2603; ++\u2603) {
                Object object = \u26032.a(\u26033, \u2603).b(\u2603);
                afh \u26034 = this.o.p((cj)object).c();
                if (\u26034.t().a() || agd.d(\u26034)) continue;
                return false;
            }
        }
        List<pk> list = this.o.b(this, this.aR());
        for (Object object : list) {
            if (!(object instanceof un)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean ad() {
        return true;
    }

    @Override
    public boolean l(pk pk2) {
        if (pk2 instanceof wn) {
            return this.a(ow.a((wn)pk2), 0.0f);
        }
        return false;
    }

    @Override
    public cq aP() {
        return this.b;
    }

    @Override
    public boolean a(ow ow2, float f) {
        if (this.b(ow2)) {
            return false;
        }
        if (!this.I && !this.o.D) {
            this.J();
            this.ac();
            this.b(ow2.j());
        }
        return true;
    }

    @Override
    public void d(double d, double d2, double d3) {
        if (!this.o.D && !this.I && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.J();
            this.b((pk)null);
        }
    }

    @Override
    public void g(double d, double d2, double d3) {
        if (!this.o.D && !this.I && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.J();
            this.b((pk)null);
        }
    }

    @Override
    public void b(dn dn2) {
        dn2.a("Facing", (byte)this.b.b());
        dn2.a("TileX", this.n().n());
        dn2.a("TileY", this.n().o());
        dn2.a("TileZ", this.n().p());
    }

    @Override
    public void a(dn dn22) {
        cq \u26032;
        this.a = new cj(dn22.f("TileX"), dn22.f("TileY"), dn22.f("TileZ"));
        if (dn22.b("Direction", 99)) {
            \u26032 = cq.b(dn22.d("Direction"));
            this.a = this.a.a(\u26032);
        } else {
            dn dn22;
            \u26032 = dn22.b("Facing", 99) ? cq.b(dn22.d("Facing")) : cq.b(dn22.d("Dir"));
        }
        this.a(\u26032);
    }

    public abstract int l();

    public abstract int m();

    public abstract void b(pk var1);

    @Override
    protected boolean af() {
        return false;
    }

    @Override
    public void b(double d, double d2, double d3) {
        this.s = d;
        this.t = d2;
        this.u = d3;
        cj cj2 = this.a;
        this.a = new cj(d, d2, d3);
        if (!this.a.equals(cj2)) {
            this.o();
            this.ai = true;
        }
    }

    public cj n() {
        return this.a;
    }
}
