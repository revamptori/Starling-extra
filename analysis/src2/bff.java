/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Arrays
 */
import java.util.Arrays;

public class bff
extends adv {
    private static final alz f = afi.a.Q();
    private final cj g;
    private int[] h;
    private alz[] i;

    public bff(adm adm2, cj cj2, cj cj3, int n) {
        super(adm2, cj2, cj3, n);
        this.g = cj2.b(new df(n, n, n));
        \u2603 = 8000;
        this.h = new int[8000];
        Arrays.fill((int[])this.h, (int)-1);
        this.i = new alz[8000];
    }

    @Override
    public akw s(cj cj2) {
        int n = (cj2.n() >> 4) - this.a;
        \u2603 = (cj2.p() >> 4) - this.b;
        return this.c[n][\u2603].a(cj2, amy.a.b);
    }

    @Override
    public int b(cj cj2, int n) {
        \u2603 = this.e(cj2);
        \u2603 = this.h[\u2603];
        if (\u2603 == -1) {
            this.h[\u2603] = \u2603 = super.b(cj2, n);
        }
        return \u2603;
    }

    @Override
    public alz p(cj cj2) {
        int n = this.e(cj2);
        alz \u26032 = this.i[n];
        if (\u26032 == null) {
            this.i[n] = \u26032 = this.c(cj2);
        }
        return \u26032;
    }

    private alz c(cj cj2) {
        if (cj2.o() >= 0 && cj2.o() < 256) {
            int n = (cj2.n() >> 4) - this.a;
            \u2603 = (cj2.p() >> 4) - this.b;
            return this.c[n][\u2603].g(cj2);
        }
        return f;
    }

    private int e(cj cj2) {
        int n = cj2.n() - this.g.n();
        \u2603 = cj2.o() - this.g.o();
        \u2603 = cj2.p() - this.g.p();
        return n * 400 + \u2603 * 20 + \u2603;
    }
}
