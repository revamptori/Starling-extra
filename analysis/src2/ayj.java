/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ayj
extends axu {
    private static final avh.a[] h = new avh.a[]{avh.a.a, avh.a.b, avh.a.y};
    private axu i;
    protected String a = "Controls";
    private avh r;
    public avb f = null;
    public long g;
    private ayi s;
    private avs t;

    public ayj(axu axu2, avh avh2) {
        this.i = axu2;
        this.r = avh2;
    }

    @Override
    public void b() {
        this.s = new ayi(this, this.j);
        this.n.add((Object)new avs(200, this.l / 2 - 155, this.m - 29, 150, 20, bnq.a("gui.done", new Object[0])));
        this.t = new avs(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, bnq.a("controls.resetAll", new Object[0]));
        this.n.add((Object)this.t);
        this.a = bnq.a("controls.title", new Object[0]);
        int n = 0;
        for (avh.a a2 : h) {
            if (a2.a()) {
                this.n.add((Object)new awj(a2.c(), this.l / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), a2));
            } else {
                this.n.add((Object)new awe(a2.c(), this.l / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), a2, this.r.c(a2)));
            }
            ++n;
        }
    }

    @Override
    public void k() {
        super.k();
        this.s.p();
    }

    @Override
    protected void a(avs avs22) {
        avs avs22;
        if (avs22.k == 200) {
            this.j.a(this.i);
        } else if (avs22.k == 201) {
            for (avb avb2 : this.j.t.ax) {
                avb2.b(avb2.h());
            }
            avb.b();
        } else if (avs22.k < 100 && avs22 instanceof awe) {
            this.r.a(((awe)avs22).c(), 1);
            avs22.j = this.r.c(avh.a.a(avs22.k));
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        if (this.f != null) {
            this.r.a(this.f, -100 + n3);
            this.f = null;
            avb.b();
        } else if (n3 != 0 || !this.s.b(n, n2, n3)) {
            super.a(n, n2, n3);
        }
    }

    @Override
    protected void b(int n, int n2, int n3) {
        if (n3 != 0 || !this.s.c(n, n2, n3)) {
            super.b(n, n2, n3);
        }
    }

    @Override
    protected void a(char c2, int n) {
        if (this.f != null) {
            if (n == 1) {
                this.r.a(this.f, 0);
            } else if (n != 0) {
                this.r.a(this.f, n);
            } else if (c2 > '\u0000') {
                this.r.a(this.f, c2 + 256);
            }
            this.f = null;
            this.g = ave.J();
            avb.b();
        } else {
            super.a(c2, n);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.s.a(n, n2, f);
        this.a(this.q, this.a, this.l / 2, 8, 0xFFFFFF);
        boolean bl = true;
        for (avb avb2 : this.r.ax) {
            if (avb2.i() == avb2.h()) continue;
            bl = false;
            break;
        }
        this.t.l = !bl;
        super.a(n, n2, f);
    }
}
