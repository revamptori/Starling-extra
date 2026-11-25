/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class awu
extends axu {
    private static final avh.a[] a = new avh.a[]{avh.a.p, avh.a.q, avh.a.r, avh.a.s, avh.a.t, avh.a.z, avh.a.B, avh.a.C, avh.a.A, avh.a.Q};
    private final axu f;
    private final avh g;
    private String h;

    public awu(axu axu2, avh avh2) {
        this.f = axu2;
        this.g = avh2;
    }

    @Override
    public void b() {
        int n = 0;
        this.h = bnq.a("options.chat.title", new Object[0]);
        for (avh.a a2 : a) {
            if (a2.a()) {
                this.n.add((Object)new awj(a2.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a2));
            } else {
                this.n.add((Object)new awe(a2.c(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), a2, this.g.c(a2)));
            }
            ++n;
        }
        this.n.add((Object)new avs(200, this.l / 2 - 100, this.m / 6 + 120, bnq.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k < 100 && avs2 instanceof awe) {
            this.g.a(((awe)avs2).c(), 1);
            avs2.j = this.g.c(avh.a.a(avs2.k));
        }
        if (avs2.k == 200) {
            this.j.t.b();
            this.j.a(this.f);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.a(this.q, this.h, this.l / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }
}
