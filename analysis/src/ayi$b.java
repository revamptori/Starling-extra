/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ayi.b
implements awd.a {
    private final avb b;
    private final String c;
    private final avs d;
    private final avs e;

    private ayi.b(avb avb2) {
        this.b = avb2;
        this.c = bnq.a(avb2.g(), new Object[0]);
        this.d = new avs(0, 0, 0, 75, 20, bnq.a(avb2.g(), new Object[0]));
        this.e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        boolean bl2;
        bl2 = ((ayi)ayi.this).u.f == this.b;
        ((ayi)ayi.this).v.k.a(this.c, n2 + 90 - ayi.this.x, n3 + n5 / 2 - ((ayi)ayi.this).v.k.a / 2, 0xFFFFFF);
        this.e.h = n2 + 190;
        this.e.i = n3;
        this.e.l = this.b.i() != this.b.h();
        this.e.a(ayi.this.v, n6, n7);
        this.d.h = n2 + 105;
        this.d.i = n3;
        this.d.j = avh.c(this.b.i());
        bl3 = false;
        if (this.b.i() != 0) {
            for (avb avb2 : ((ayi)ayi.this).v.t.ax) {
                if (avb2 == this.b || avb2.i() != this.b.i()) continue;
                boolean bl3 = true;
                break;
            }
        }
        if (bl2) {
            this.d.j = (Object)((Object)a.p) + "> " + (Object)((Object)a.o) + this.d.j + (Object)((Object)a.p) + " <";
        } else if (bl3) {
            this.d.j = (Object)((Object)a.m) + this.d.j;
        }
        this.d.a(ayi.this.v, n6, n7);
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.d.c(ayi.this.v, n2, n3)) {
            ((ayi)ayi.this).u.f = this.b;
            return true;
        }
        if (this.e.c(ayi.this.v, n2, n3)) {
            ((ayi)ayi.this).v.t.a(this.b, this.b.h());
            avb.b();
            return true;
        }
        return false;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.d.a(n2, n3);
        this.e.a(n2, n3);
    }

    @Override
    public void a(int n, int n2, int n3) {
    }
}
