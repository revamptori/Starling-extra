/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import java.util.List;

public abstract class ws
extends pk {
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private afh h;
    private boolean i;
    public pr a;
    private int ar;
    private int as;
    public double b;
    public double c;
    public double d;

    public ws(adm adm2) {
        super(adm2);
        this.a(1.0f, 1.0f);
    }

    @Override
    protected void h() {
    }

    @Override
    public boolean a(double d) {
        \u2603 = this.aR().a() * 4.0;
        if (Double.isNaN((double)\u2603)) {
            \u2603 = 4.0;
        }
        return d < (\u2603 *= 64.0) * \u2603;
    }

    public ws(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2);
        this.a(1.0f, 1.0f);
        this.b(d, d2, d3, this.y, this.z);
        this.b(d, d2, d3);
        \u2603 = ns.a(d4 * d4 + d5 * d5 + d6 * d6);
        this.b = d4 / \u2603 * 0.1;
        this.c = d5 / \u2603 * 0.1;
        this.d = d6 / \u2603 * 0.1;
    }

    public ws(adm adm2, pr pr2, double d, double d2, double d3) {
        super(adm2);
        this.a = pr2;
        this.a(1.0f, 1.0f);
        this.b(pr2.s, pr2.t, pr2.u, pr2.y, pr2.z);
        this.b(this.s, this.t, this.u);
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
        \u2603 = ns.a((d += this.V.nextGaussian() * 0.4) * d + (d2 += this.V.nextGaussian() * 0.4) * d2 + (d3 += this.V.nextGaussian() * 0.4) * d3);
        this.b = d / \u2603 * 0.1;
        this.c = d2 / \u2603 * 0.1;
        this.d = d3 / \u2603 * 0.1;
    }

    @Override
    public void t_() {
        float f;
        if (!this.o.D && (this.a != null && this.a.I || !this.o.e(new cj(this)))) {
            this.J();
            return;
        }
        super.t_();
        this.e(1);
        if (this.i) {
            if (this.o.p(new cj(this.e, this.f, this.g)).c() == this.h) {
                ++this.ar;
                if (this.ar == 600) {
                    this.J();
                }
                return;
            }
            this.i = false;
            this.v *= (double)(this.V.nextFloat() * 0.2f);
            this.w *= (double)(this.V.nextFloat() * 0.2f);
            this.x *= (double)(this.V.nextFloat() * 0.2f);
            this.ar = 0;
            this.as = 0;
        } else {
            ++this.as;
        }
        aui aui2 = new aui(this.s, this.t, this.u);
        \u2603 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        auh \u26032 = this.o.a(aui2, \u2603);
        aui2 = new aui(this.s, this.t, this.u);
        \u2603 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        if (\u26032 != null) {
            \u2603 = new aui(\u26032.c.a, \u26032.c.b, \u26032.c.c);
        }
        pk \u26033 = null;
        List<pk> \u26034 = this.o.b(this, this.aR().a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double \u26035 = 0.0;
        for (int i = 0; i < \u26034.size(); ++i) {
            pk pk2 = (pk)\u26034.get(i);
            if (!pk2.ad() || pk2.k(this.a) && this.as < 25) continue;
            float \u26036 = 0.3f;
            aug \u26037 = pk2.aR().b(\u26036, \u26036, \u26036);
            auh \u26038 = \u26037.a(aui2, \u2603);
            if (\u26038 == null || !((\u2603 = aui2.g(\u26038.c)) < \u26035) && \u26035 != 0.0) continue;
            \u26033 = pk2;
            \u26035 = \u2603;
        }
        if (\u26033 != null) {
            \u26032 = new auh(\u26033);
        }
        if (\u26032 != null) {
            this.a(\u26032);
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        float f2 = ns.a(this.v * this.v + this.x * this.x);
        this.y = (float)(ns.b(this.x, this.v) * 180.0 / 3.1415927410125732) + 90.0f;
        this.z = (float)(ns.b(f2, this.w) * 180.0 / 3.1415927410125732) - 90.0f;
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        this.z = this.B + (this.z - this.B) * 0.2f;
        this.y = this.A + (this.y - this.A) * 0.2f;
        f = this.j();
        if (this.V()) {
            for (int i = 0; i < 4; ++i) {
                float f3 = 0.25f;
                this.o.a(cy.e, this.s - this.v * (double)f3, this.t - this.w * (double)f3, this.u - this.x * (double)f3, this.v, this.w, this.x, new int[0]);
            }
            f = 0.8f;
        }
        this.v += this.b;
        this.w += this.c;
        this.x += this.d;
        this.v *= (double)f;
        this.w *= (double)f;
        this.x *= (double)f;
        this.o.a(cy.l, this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0, new int[0]);
        this.b(this.s, this.t, this.u);
    }

    protected float j() {
        return 0.95f;
    }

    protected abstract void a(auh var1);

    @Override
    public void b(dn dn2) {
        dn2.a("xTile", (short)this.e);
        dn2.a("yTile", (short)this.f);
        dn2.a("zTile", (short)this.g);
        jy jy2 = (jy)afh.c.c(this.h);
        dn2.a("inTile", jy2 == null ? "" : jy2.toString());
        dn2.a("inGround", (byte)(this.i ? 1 : 0));
        dn2.a("direction", this.a(new double[]{this.v, this.w, this.x}));
    }

    @Override
    public void a(dn dn2) {
        this.e = dn2.e("xTile");
        this.f = dn2.e("yTile");
        this.g = dn2.e("zTile");
        this.h = dn2.b("inTile", 8) ? afh.b(dn2.j("inTile")) : afh.c(dn2.d("inTile") & 0xFF);
        boolean bl = this.i = dn2.d("inGround") == 1;
        if (dn2.b("direction", 9)) {
            du du2 = dn2.c("direction", 6);
            this.v = du2.d(0);
            this.w = du2.d(1);
            this.x = du2.d(2);
        } else {
            this.J();
        }
    }

    @Override
    public boolean ad() {
        return true;
    }

    @Override
    public float ao() {
        return 1.0f;
    }

    @Override
    public boolean a(ow ow2, float f) {
        if (this.b(ow2)) {
            return false;
        }
        this.ac();
        if (ow2.j() != null) {
            aui aui2 = ow2.j().ap();
            if (aui2 != null) {
                this.v = aui2.a;
                this.w = aui2.b;
                this.x = aui2.c;
                this.b = this.v * 0.1;
                this.c = this.w * 0.1;
                this.d = this.x * 0.1;
            }
            if (ow2.j() instanceof pr) {
                this.a = (pr)ow2.j();
            }
            return true;
        }
        return false;
    }

    @Override
    public float c(float f) {
        return 1.0f;
    }

    @Override
    public int b(float f) {
        return 0xF000F0;
    }
}
