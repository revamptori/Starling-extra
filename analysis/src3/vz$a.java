/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

static class vz.a
extends rz {
    private final vz a;
    private cq b;
    private boolean c;

    public vz.a(vz vz2) {
        super(vz2, 1.0, 10);
        this.a = vz2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.u() != null) {
            return false;
        }
        if (!this.a.s().m()) {
            return false;
        }
        Random random = this.a.bc();
        if (random.nextInt(10) == 0) {
            this.b = cq.a(random);
            cj cj2 = new cj(this.a.s, this.a.t + 0.5, this.a.u).a(this.b);
            alz \u26032 = this.a.o.p(cj2);
            if (ahz.d(\u26032)) {
                this.c = true;
                return true;
            }
        }
        this.c = false;
        return super.a();
    }

    @Override
    public boolean b() {
        if (this.c) {
            return false;
        }
        return super.b();
    }

    @Override
    public void c() {
        if (!this.c) {
            super.c();
            return;
        }
        adm adm2 = this.a.o;
        cj \u26032 = new cj(this.a.s, this.a.t + 0.5, this.a.u).a(this.b);
        alz \u26033 = adm2.p(\u26032);
        if (ahz.d(\u26033)) {
            adm2.a(\u26032, afi.be.Q().a(ahz.a, ahz.a.a(\u26033)), 3);
            this.a.y();
            this.a.J();
        }
    }
}
