/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ayb
extends axu {
    private axu f;
    protected String a = "Video Settings";
    private avh g;
    private awd h;
    private static final avh.a[] i = new avh.a[]{avh.a.l, avh.a.f, avh.a.m, avh.a.i, avh.a.h, avh.a.g, avh.a.n, avh.a.d, avh.a.k, avh.a.o, avh.a.v, avh.a.w, avh.a.D, avh.a.P, avh.a.x, avh.a.R};

    public ayb(axu axu2, avh avh2) {
        this.f = axu2;
        this.g = avh2;
    }

    @Override
    public void b() {
        this.a = bnq.a("options.videoTitle", new Object[0]);
        this.n.clear();
        this.n.add((Object)new avs(200, this.l / 2 - 100, this.m - 27, bnq.a("gui.done", new Object[0])));
        if (!bqs.P) {
            avh.a[] aArray = new avh.a[i.length - 1];
            int \u26032 = 0;
            for (avh.a a2 : i) {
                if (a2 == avh.a.x) break;
                aArray[\u26032] = a2;
                ++\u26032;
            }
            this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, aArray);
        } else {
            this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, i);
        }
    }

    @Override
    public void k() {
        super.k();
        this.h.p();
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k == 200) {
            this.j.t.b();
            this.j.a(this.f);
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        \u2603 = this.g.aL;
        super.a(n, n2, n3);
        this.h.b(n, n2, n3);
        if (this.g.aL != \u2603) {
            avr avr2 = new avr(this.j);
            int \u26032 = avr2.a();
            int \u26033 = avr2.b();
            this.a(this.j, \u26032, \u26033);
        }
    }

    @Override
    protected void b(int n, int n2, int n3) {
        \u2603 = this.g.aL;
        super.b(n, n2, n3);
        this.h.c(n, n2, n3);
        if (this.g.aL != \u2603) {
            avr avr2 = new avr(this.j);
            int \u26032 = avr2.a();
            int \u26033 = avr2.b();
            this.a(this.j, \u26032, \u26033);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.h.a(n, n2, f);
        this.a(this.q, this.a, this.l / 2, 5, 0xFFFFFF);
        super.a(n, n2, f);
    }
}
