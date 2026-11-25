/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class aww
extends awy {
    private final String r;
    private final String s;
    private final String t;
    private boolean u = true;

    public aww(awx awx2, String string, int n, boolean bl) {
        super(awx2, bnq.a(bl ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n);
        this.g = bnq.a(bl ? "chat.link.open" : "gui.yes", new Object[0]);
        this.h = bnq.a(bl ? "gui.cancel" : "gui.no", new Object[0]);
        this.s = bnq.a("chat.copy", new Object[0]);
        this.r = bnq.a("chat.link.warning", new Object[0]);
        this.t = string;
    }

    @Override
    public void b() {
        super.b();
        this.n.clear();
        this.n.add((Object)new avs(0, this.l / 2 - 50 - 105, this.m / 6 + 96, 100, 20, this.g));
        this.n.add((Object)new avs(2, this.l / 2 - 50, this.m / 6 + 96, 100, 20, this.s));
        this.n.add((Object)new avs(1, this.l / 2 - 50 + 105, this.m / 6 + 96, 100, 20, this.h));
    }

    @Override
    protected void a(avs avs2) {
        if (avs2.k == 2) {
            this.a();
        }
        this.a.a(avs2.k == 0, this.i);
    }

    public void a() {
        aww.e(this.t);
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        if (this.u) {
            this.a(this.q, this.r, this.l / 2, 110, 0xFFCCCC);
        }
    }

    public void f() {
        this.u = false;
    }
}
