/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class axz.a
extends avs {
    private final bpg r;
    private final String s;
    public float o;
    public boolean p;

    public axz.a(int n, int n2, int n3, bpg bpg2, boolean bl) {
        super(n, n2, n3, bl ? 310 : 150, 20, "");
        this.o = 1.0f;
        this.r = bpg2;
        this.s = bnq.a("soundCategory." + bpg2.a(), new Object[0]);
        this.j = this.s + ": " + axz.this.a(bpg2);
        this.o = axz.this.g.a(bpg2);
    }

    @Override
    protected int a(boolean bl) {
        return 0;
    }

    @Override
    protected void b(ave ave2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        if (this.p) {
            this.o = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            this.o = ns.a(this.o, 0.0f, 1.0f);
            ave2.t.a(this.r, this.o);
            ave2.t.b();
            this.j = this.s + ": " + axz.this.a(this.r);
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b(this.h + (int)(this.o * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
        this.b(this.h + (int)(this.o * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
    }

    @Override
    public boolean c(ave ave2, int n2, int n3) {
        if (super.c(ave2, n2, n3)) {
            this.o = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            this.o = ns.a(this.o, 0.0f, 1.0f);
            ave2.t.a(this.r, this.o);
            ave2.t.b();
            this.j = this.s + ": " + axz.this.a(this.r);
            this.p = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(bpz bpz2) {
    }

    @Override
    public void a(int n2, int n3) {
        if (this.p) {
            float f2 = this.r == bpg.a ? 1.0f : axz.this.g.a(this.r);
            axz.this.j.W().a(bpf.a(new jy("gui.button.press"), 1.0f));
        }
        this.p = false;
    }
}
