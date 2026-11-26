/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class aan
extends zs {
    private afh b;
    private afh c;

    public aan(int n, float f, afh afh2, afh afh3) {
        super(n, f, false);
        this.b = afh2;
        this.c = afh3;
    }

    @Override
    public boolean a(zx zx2, wn wn2, adm adm2, cj cj2, cq cq2, float f, float f2, float f3) {
        if (cq2 != cq.b) {
            return false;
        }
        if (!wn2.a(cj2.a(cq2), cq2, zx2)) {
            return false;
        }
        if (adm2.p(cj2).c() == this.c && adm2.d(cj2.a())) {
            adm2.a(cj2.a(), this.b.Q());
            --zx2.b;
            return true;
        }
        return false;
    }
}
