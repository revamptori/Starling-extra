/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class wu
extends ws {
    public int e = 1;

    public wu(adm adm2) {
        super(adm2);
    }

    public wu(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2, d, d2, d3, d4, d5, d6);
    }

    public wu(adm adm2, pr pr2, double d, double d2, double d3) {
        super(adm2, pr2, d, d2, d3);
    }

    @Override
    protected void a(auh auh2) {
        if (!this.o.D) {
            if (auh2.d != null) {
                auh2.d.a(ow.a(this, (pk)this.a), 6.0f);
                this.a(this.a, auh2.d);
            }
            boolean bl = this.o.Q().b("mobGriefing");
            this.o.a(null, this.s, this.t, this.u, (float)this.e, bl, bl);
            this.J();
        }
    }

    @Override
    public void b(dn dn2) {
        super.b(dn2);
        dn2.a("ExplosionPower", this.e);
    }

    @Override
    public void a(dn dn2) {
        super.a(dn2);
        if (dn2.b("ExplosionPower", 99)) {
            this.e = dn2.f("ExplosionPower");
        }
    }
}
