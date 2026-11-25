/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class axg
extends axu {
    private final axu a;
    private final bde f;
    private avw g;

    public axg(axu axu2, bde bde2) {
        this.a = axu2;
        this.f = bde2;
    }

    @Override
    public void e() {
        this.g.a();
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add((Object)new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bnq.a("selectServer.select", new Object[0])));
        this.n.add((Object)new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
        this.g = new avw(2, this.q, this.l / 2 - 100, 116, 200, 20);
        this.g.f(128);
        this.g.b(true);
        this.g.a(this.j.t.aF);
        ((avs)this.n.get((int)0)).l = this.g.b().length() > 0 && this.g.b().split(":").length > 0;
    }

    @Override
    public void m() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.j.t.aF = this.g.b();
        this.j.t.b();
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k == 1) {
            this.a.a(false, 0);
        } else if (avs2.k == 0) {
            this.f.b = this.g.b();
            this.a.a(true, 0);
        }
    }

    @Override
    protected void a(char c2, int n) {
        if (this.g.a(c2, n)) {
            ((avs)this.n.get((int)0)).l = this.g.b().length() > 0 && this.g.b().split(":").length > 0;
        } else if (n == 28 || n == 156) {
            this.a((avs)this.n.get(0));
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        this.g.a(n, n2, n3);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.a(this.q, bnq.a("selectServer.direct", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        this.c(this.q, bnq.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 0xA0A0A0);
        this.g.g();
        super.a(n, n2, f);
    }
}
