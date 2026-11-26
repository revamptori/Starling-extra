/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class biu {
    private Map<Class<? extends pk>, biv<? extends pk>> k = Maps.newHashMap();
    private Map<String, bln> l = Maps.newHashMap();
    private bln m;
    private avn n;
    private double o;
    private double p;
    private double q;
    public bmj a;
    public adm b;
    public pk c;
    public pk d;
    public float e;
    public float f;
    public avh g;
    public double h;
    public double i;
    public double j;
    private boolean r = false;
    private boolean s = true;
    private boolean t = false;

    public biu(bmj bmj2, bjh bjh2) {
        this.a = bmj2;
        this.k.put(vm.class, (Object)new bil(this));
        this.k.put(wc.class, new bka(this));
        this.k.put(tt.class, (Object)new bjs(this, new bbq(), 0.7f));
        this.k.put(tv.class, (Object)new bjv(this, new bbw(), 0.7f));
        this.k.put(to.class, (Object)new bin(this, new bbb(), 0.7f));
        this.k.put(tr.class, (Object)new bjp(this, new bbb(), 0.7f));
        this.k.put(ua.class, (Object)new bkl(this, new bcm(), 0.5f));
        this.k.put(tn.class, (Object)new bim(this, new bba(), 0.3f));
        this.k.put(ts.class, (Object)new bjq(this, new bbp(), 0.4f));
        this.k.put(tu.class, (Object)new bju(this, new bbu(), 0.3f));
        this.k.put(vz.class, (Object)new bjw(this));
        this.k.put(vp.class, (Object)new bit(this));
        this.k.put(vn.class, (Object)new bio(this));
        this.k.put(vo.class, (Object)new bis(this));
        this.k.put(tw.class, (Object)new bjz(this));
        this.k.put(wa.class, (Object)new bjx(this));
        this.k.put(wd.class, (Object)new bki(this));
        this.k.put(vl.class, (Object)new bij(this));
        this.k.put(vw.class, (Object)new bjt(this));
        this.k.put(we.class, (Object)new bkm(this));
        this.k.put(wb.class, (Object)new bjy(this, new bcc(16), 0.25f));
        this.k.put(vu.class, (Object)new bji(this));
        this.k.put(vs.class, (Object)new bjb(this, new bcn(), 0.5f, 6.0f));
        this.k.put(vr.class, (Object)new bja(this));
        this.k.put(tx.class, (Object)new bkb(this, new bcf(), 0.7f));
        this.k.put(wi.class, (Object)new bkh(this));
        this.k.put(ty.class, (Object)new bkg(this));
        this.k.put(tk.class, (Object)new bii(this));
        this.k.put(vt.class, (Object)new bjc(this));
        this.k.put(ug.class, (Object)new bir(this));
        this.k.put(uf.class, (Object)new biq(this));
        this.k.put(uk.class, (Object)new bkj(this));
        this.k.put(pk.class, (Object)new bip(this));
        this.k.put(uq.class, (Object)new bjr(this));
        this.k.put(uo.class, (Object)new bjg(this, bjh2));
        this.k.put(up.class, (Object)new bjj(this));
        this.k.put(wq.class, (Object)new bih(this));
        this.k.put(wx.class, new bkc(this, zy.aD, bjh2));
        this.k.put(xa.class, new bkc(this, zy.bu, bjh2));
        this.k.put(wr.class, new bkc(this, zy.bH, bjh2));
        this.k.put(wz.class, new bkc(this, zy.aP, bjh2));
        this.k.put(xc.class, (Object)new bkd(this, bjh2));
        this.k.put(xb.class, new bkc(this, zy.bK, bjh2));
        this.k.put(wt.class, new bkc(this, zy.cb, bjh2));
        this.k.put(wu.class, (Object)new biy(this, 2.0f));
        this.k.put(ww.class, (Object)new biy(this, 0.5f));
        this.k.put(xd.class, (Object)new bkk(this));
        this.k.put(uz.class, (Object)new bjf(this, bjh2));
        this.k.put(pp.class, (Object)new biw(this));
        this.k.put(vj.class, (Object)new bkf(this));
        this.k.put(uy.class, (Object)new bix(this));
        this.k.put(um.class, (Object)new big(this));
        this.k.put(vi.class, (Object)new bke(this));
        this.k.put(vh.class, (Object)new bjn(this));
        this.k.put(va.class, new bjm(this));
        this.k.put(ux.class, (Object)new bik(this));
        this.k.put(ur.class, (Object)new biz(this));
        this.k.put(tp.class, (Object)new bjd(this, new bbh(), 0.75f));
        this.k.put(uv.class, (Object)new bjk(this));
        this.m = new bln(this);
        this.l.put((Object)"default", (Object)this.m);
        this.l.put((Object)"slim", (Object)new bln(this, true));
    }

    public void a(double d, double d2, double d3) {
        this.o = d;
        this.p = d2;
        this.q = d3;
    }

    public <T extends pk> biv<T> a(Class<? extends pk> clazz) {
        biv<T> biv2 = (biv<T>)this.k.get(clazz);
        if (biv2 == null && clazz != pk.class) {
            biv2 = this.a((Class<? extends pk>)clazz.getSuperclass());
            this.k.put(clazz, biv2);
        }
        return biv2;
    }

    public <T extends pk> biv<T> a(pk pk2) {
        if (pk2 instanceof bet) {
            String string = ((bet)pk2).l();
            bln \u26032 = (bln)this.l.get((Object)string);
            if (\u26032 != null) {
                return \u26032;
            }
            return this.m;
        }
        return this.a((Class<? extends pk>)pk2.getClass());
    }

    public void a(adm adm2, avn avn2, pk pk22, pk pk3, avh avh22, float f) {
        avh avh22;
        this.b = adm2;
        this.g = avh22;
        this.c = pk22;
        this.d = pk3;
        this.n = avn2;
        if (pk22 instanceof pr && ((pr)pk22).bJ()) {
            alz alz2 = adm2.p(new cj(pk22));
            afh \u26032 = alz2.c();
            if (\u26032 == afi.C) {
                int n2 = alz2.b(afg.O).b();
                this.e = n2 * 90 + 180;
                this.f = 0.0f;
            }
        } else {
            pk pk22;
            this.e = pk22.A + (pk22.y - pk22.A) * f;
            this.f = pk22.B + (pk22.z - pk22.B) * f;
        }
        if (avh22.aB == 2) {
            this.e += 180.0f;
        }
        this.h = pk22.P + (pk22.s - pk22.P) * (double)f;
        this.i = pk22.Q + (pk22.t - pk22.Q) * (double)f;
        this.j = pk22.R + (pk22.u - pk22.R) * (double)f;
    }

    public void a(float f) {
        this.e = f;
    }

    public boolean a() {
        return this.s;
    }

    public void a(boolean bl) {
        this.s = bl;
    }

    public void b(boolean bl) {
        this.t = bl;
    }

    public boolean b() {
        return this.t;
    }

    public boolean a(pk pk2, float f) {
        return this.a(pk2, f, false);
    }

    public boolean a(pk pk2, bia bia2, double d, double d2, double d3) {
        biv<pk> biv2 = this.a(pk2);
        return biv2 != null && biv2.a(pk2, bia2, d, d2, d3);
    }

    public boolean a(pk pk2, float f2, boolean bl) {
        if (pk2.W == 0) {
            pk2.P = pk2.s;
            pk2.Q = pk2.t;
            pk2.R = pk2.u;
        }
        double d2 = pk2.P + (pk2.s - pk2.P) * (double)f2;
        \u2603 = pk2.Q + (pk2.t - pk2.Q) * (double)f2;
        \u2603 = pk2.R + (pk2.u - pk2.R) * (double)f2;
        float \u26032 = pk2.A + (pk2.y - pk2.A) * f2;
        int \u26033 = pk2.b(f2);
        if (pk2.at()) {
            \u26033 = 0xF000F0;
        }
        int \u26034 = \u26033 % 65536;
        int \u26035 = \u26033 / 65536;
        bqs.a(bqs.r, (float)\u26034 / 1.0f, (float)\u26035 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        return this.a(pk2, d2 - this.o, \u2603 - this.p, \u2603 - this.q, \u26032, f2, bl);
    }

    public void b(pk pk2, float f2) {
        double d2 = pk2.P + (pk2.s - pk2.P) * (double)f2;
        \u2603 = pk2.Q + (pk2.t - pk2.Q) * (double)f2;
        \u2603 = pk2.R + (pk2.u - pk2.R) * (double)f2;
        biv<pk> \u26032 = this.a(pk2);
        if (\u26032 != null && this.a != null) {
            int n2 = pk2.b(f2);
            \u2603 = n2 % 65536;
            \u2603 = n2 / 65536;
            bqs.a(bqs.r, (float)\u2603 / 1.0f, (float)\u2603 / 1.0f);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            \u26032.a(pk2, d2 - this.o, \u2603 - this.p, \u2603 - this.q);
        }
    }

    public boolean a(pk pk2, double d2, double d3, double d4, float f2, float f3) {
        return this.a(pk2, d2, d3, d4, f2, f3, false);
    }

    public boolean a(pk pk2, double d2, double d3, double d4, float f2, float f3, boolean bl) {
        block12: {
            biv<pk> biv2 = null;
            try {
                biv2 = this.a(pk2);
                if (biv2 != null && this.a != null) {
                    try {
                        if (biv2 instanceof bjl) {
                            ((bjl)biv2).a(this.r);
                        }
                        biv2.a(pk2, d2, d3, d4, f2, f3);
                    }
                    catch (Throwable throwable) {
                        throw new e(b.a(throwable, "Rendering entity in world"));
                    }
                    try {
                        if (!this.r) {
                            biv2.b(pk2, d2, d3, d4, f2, f3);
                        }
                    }
                    catch (Throwable throwable) {
                        throw new e(b.a(throwable, "Post-rendering entity in world"));
                    }
                    if (!this.t || pk2.ax() || bl) break block12;
                    try {
                        this.b(pk2, d2, d3, d4, f2, f3);
                        break block12;
                    }
                    catch (Throwable throwable) {
                        throw new e(b.a(throwable, "Rendering entity hitbox in world"));
                    }
                }
                if (this.a != null) {
                    return false;
                }
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Rendering entity in world");
                c \u26032 = b2.a("Entity being rendered");
                pk2.a(\u26032);
                c \u26033 = b2.a("Renderer details");
                \u26033.a("Assigned renderer", biv2);
                \u26033.a("Location", c.a(d2, d3, d4));
                \u26033.a("Rotation", Float.valueOf((float)f2));
                \u26033.a("Delta", Float.valueOf((float)f3));
                throw new e(b2);
            }
        }
        return true;
    }

    private void b(pk pk2, double d2, double d3, double d4, float f2, float f3) {
        bfl.a(false);
        bfl.x();
        bfl.f();
        bfl.p();
        bfl.k();
        \u2603 = pk2.J / 2.0f;
        aug aug2 = pk2.aR();
        \u2603 = new aug(aug2.a - pk2.s + d2, aug2.b - pk2.t + d3, aug2.c - pk2.u + d4, aug2.d - pk2.s + d2, aug2.e - pk2.t + d3, aug2.f - pk2.u + d4);
        bfr.a(\u2603, 255, 255, 255, 255);
        if (pk2 instanceof pr) {
            float f4 = 0.01f;
            bfr.a(new aug(d2 - (double)\u2603, d3 + (double)pk2.aS() - (double)0.01f, d4 - (double)\u2603, d2 + (double)\u2603, d3 + (double)pk2.aS() + (double)0.01f, d4 + (double)\u2603), 255, 0, 0, 255);
        }
        bfx bfx2 = bfx.a();
        bfd \u26032 = bfx2.c();
        aui \u26033 = pk2.d(f3);
        \u26032.a(3, bms.f);
        \u26032.b(d2, d3 + (double)pk2.aS(), d4).b(0, 0, 255, 255).d();
        \u26032.b(d2 + \u26033.a * 2.0, d3 + (double)pk2.aS() + \u26033.b * 2.0, d4 + \u26033.c * 2.0).b(0, 0, 255, 255).d();
        bfx2.b();
        bfl.w();
        bfl.e();
        bfl.o();
        bfl.k();
        bfl.a(true);
    }

    public void a(adm adm2) {
        this.b = adm2;
    }

    public double b(double d2, double d3, double d4) {
        \u2603 = d2 - this.h;
        \u2603 = d3 - this.i;
        \u2603 = d4 - this.j;
        return \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public avn c() {
        return this.n;
    }

    public void c(boolean bl) {
        this.r = bl;
    }
}
