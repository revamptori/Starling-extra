/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class axx
extends axu {
    private final axu a;
    private String f;

    public axx(axu axu2) {
        this.a = axu2;
    }

    @Override
    public void b() {
        int n = 0;
        this.f = bnq.a("options.skinCustomisation.title", new Object[0]);
        for (wo wo2 : wo.values()) {
            this.n.add((Object)new a(wo2.b(), this.l / 2 - 155 + n % 2 * 160, this.m / 6 + 24 * (n >> 1), 150, 20, wo2));
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.n.add((Object)new avs(200, this.l / 2 - 100, this.m / 6 + 24 * (n >> 1), bnq.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k == 200) {
            this.j.t.b();
            this.j.a(this.a);
        } else if (avs2 instanceof a) {
            wo wo2 = ((a)avs2).p;
            this.j.t.a(wo2);
            avs2.j = this.a(wo2);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.a(this.q, this.f, this.l / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }

    private String a(wo wo2) {
        String string = this.j.t.d().contains((Object)wo2) ? bnq.a("options.on", new Object[0]) : bnq.a("options.off", new Object[0]);
        return wo2.d().d() + ": " + string;
    }

    class a
    extends avs {
        private final wo p;

        private a(int n, int n2, int n3, int n4, int n5, wo wo2) {
            super(n, n2, n3, n4, n5, axx.this.a(wo2));
            this.p = wo2;
        }
    }
}
