/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
class xk.2
extends yg {
    final /* synthetic */ adm a;
    final /* synthetic */ cj b;

    xk.2(og og2, int n, int n2, int n3, adm adm2, cj cj2) {
        this.a = adm2;
        this.b = cj2;
        super(og2, n, n2, n3);
    }

    @Override
    public boolean a(zx zx2) {
        return false;
    }

    @Override
    public boolean a(wn wn2) {
        return (wn2.bA.d || wn2.bB >= xk.this.a) && xk.this.a > 0 && this.e();
    }

    @Override
    public void a(wn wn2, zx zx2) {
        Object object;
        if (!wn2.bA.d) {
            wn2.a(-xk.this.a);
        }
        xk.this.h.a(0, null);
        if (xk.this.k > 0) {
            object = xk.this.h.a(1);
            if (object != null && ((zx)object).b > xk.this.k) {
                ((zx)object).b -= xk.this.k;
                xk.this.h.a(1, (zx)object);
            } else {
                xk.this.h.a(1, null);
            }
        } else {
            xk.this.h.a(1, null);
        }
        xk.this.a = 0;
        object = this.a.p(this.b);
        if (!wn2.bA.d && !this.a.D && object.c() == afi.cf && wn2.bc().nextFloat() < 0.12f) {
            int n2 = object.b(aez.b);
            if (++n2 > 2) {
                this.a.g(this.b);
                this.a.b(1020, this.b, 0);
            } else {
                this.a.a(this.b, object.a(aez.b, n2), 2);
                this.a.b(1021, this.b, 0);
            }
        } else if (!this.a.D) {
            this.a.b(1021, this.b, 0);
        }
    }
}
