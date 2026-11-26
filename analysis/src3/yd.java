/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class yd
extends oq {
    private alf a;

    public yd() {
        super("container.enderchest", false, 27);
    }

    public void a(alf alf2) {
        this.a = alf2;
    }

    public void a(du du2) {
        int n;
        for (n = 0; n < this.o_(); ++n) {
            this.a(n, null);
        }
        for (n = 0; n < du2.c(); ++n) {
            dn dn2 = du2.b(n);
            int \u26032 = dn2.d("Slot") & 0xFF;
            if (\u26032 < 0 || \u26032 >= this.o_()) continue;
            this.a(\u26032, zx.a(dn2));
        }
    }

    public du h() {
        du du2 = new du();
        for (int i = 0; i < this.o_(); ++i) {
            zx zx2 = this.a(i);
            if (zx2 == null) continue;
            dn \u26032 = new dn();
            \u26032.a("Slot", (byte)i);
            zx2.b(\u26032);
            du2.a(\u26032);
        }
        return du2;
    }

    @Override
    public boolean a(wn wn2) {
        if (this.a != null && !this.a.a(wn2)) {
            return false;
        }
        return super.a(wn2);
    }

    @Override
    public void b(wn wn2) {
        if (this.a != null) {
            this.a.b();
        }
        super.b(wn2);
    }

    @Override
    public void c(wn wn2) {
        if (this.a != null) {
            this.a.d();
        }
        super.c(wn2);
        this.a = null;
    }
}
