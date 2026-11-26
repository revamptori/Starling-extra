/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public static class aer.a
extends aem {
    public aer.a(int n, ady ady2) {
        super(n, ady2);
        this.as.A = 2;
        this.as.B = 2;
        this.as.C = 5;
    }

    @Override
    public void a(adm adm2, Random random, ans ans2, int n, int n2, double d) {
        this.ak = afi.c.Q();
        this.al = afi.d.Q();
        if (d > 1.75) {
            this.ak = afi.b.Q();
            this.al = afi.b.Q();
        } else if (d > -0.5) {
            this.ak = afi.d.Q().a(agf.a, agf.a.b);
        }
        this.b(adm2, random, ans2, n, n2, d);
    }

    @Override
    public void a(adm adm2, Random random, cj cj2) {
        this.as.a(adm2, random, this, cj2);
    }
}
