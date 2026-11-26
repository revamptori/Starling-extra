/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class axs
extends axu {
    private bcy a;
    private int f;

    public axs(bcy bcy2) {
        this.a = bcy2;
    }

    @Override
    protected void a(char c, int n) {
    }

    @Override
    public void b() {
        this.n.clear();
    }

    @Override
    public void e() {
        ++this.f;
        if (this.f % 20 == 0) {
            this.a.a(new io());
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c(0);
        this.a(this.q, bnq.a("multiplayer.downloadingTerrain", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public boolean d() {
        return false;
    }
}
