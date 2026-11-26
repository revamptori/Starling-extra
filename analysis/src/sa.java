/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 */
public class sa
extends rd {
    private final ps a;
    private final vx b;
    private pr c;
    private int d = -1;
    private double e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;

    public sa(vx vx2, double d, int n, float f) {
        this(vx2, d, n, n, f);
    }

    public sa(vx vx2, double d, int n2, int n3, float f) {
        if (!(vx2 instanceof pr)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = vx2;
        this.a = (ps)((Object)vx2);
        this.e = d;
        this.g = n2;
        this.h = n3;
        this.i = f;
        this.j = f * f;
        this.a(3);
    }

    @Override
    public boolean a() {
        pr pr2 = this.a.u();
        if (pr2 == null) {
            return false;
        }
        this.c = pr2;
        return true;
    }

    @Override
    public boolean b() {
        return this.a() || !this.a.s().m();
    }

    @Override
    public void d() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }

    @Override
    public void e() {
        double d = this.a.e(this.c.s, this.c.aR().b, this.c.u);
        boolean \u26032 = this.a.t().a(this.c);
        this.f = \u26032 ? ++this.f : 0;
        if (d > (double)this.j || this.f < 20) {
            this.a.s().a(this.c, this.e);
        } else {
            this.a.s().n();
        }
        this.a.p().a(this.c, 30.0f, 30.0f);
        if (--this.d == 0) {
            if (d > (double)this.j || !\u26032) {
                return;
            }
            float f = \u2603 = ns.a(d) / this.i;
            f = ns.a(f, 0.1f, 1.0f);
            this.b.a(this.c, f);
            this.d = ns.d(\u2603 * (float)(this.h - this.g) + (float)this.g);
        } else if (this.d < 0) {
            float \u26033 = ns.a(d) / this.i;
            this.d = ns.d(\u26033 * (float)(this.h - this.g) + (float)this.g);
        }
    }
}
