/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
static final class aff.1
implements Runnable {
    final /* synthetic */ adm a;
    final /* synthetic */ cj b;

    aff.1(adm adm2, cj cj2) {
        this.a = adm2;
        this.b = cj2;
    }

    public void run() {
        amy amy2 = this.a.f(this.b);
        for (int i = this.b.o() - 1; i >= 0 && amy2.d(\u2603 = new cj(this.b.n(), i, this.b.p())); --i) {
            alz alz2 = this.a.p(\u2603);
            if (alz2.c() != afi.bY) continue;
            ((le)this.a).a(new Runnable(){

                public void run() {
                    akw akw2 = a.s(\u2603);
                    if (akw2 instanceof akv) {
                        ((akv)akw2).m();
                        a.c(\u2603, afi.bY, 1, 0);
                    }
                }
            });
        }
    }
}
