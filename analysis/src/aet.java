/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aet
extends ady {
    protected aet(int n) {
        super(n);
        this.as.A = 2;
        this.as.B = 1;
        this.as.D = 1;
        this.as.E = 8;
        this.as.F = 10;
        this.as.J = 1;
        this.as.z = 4;
        this.as.I = 0;
        this.as.H = 0;
        this.as.C = 5;
        this.ar = 14745518;
        this.at.add((Object)new ady.c(wb.class, 1, 1, 1));
    }

    @Override
    public aoh a(Random random) {
        return this.aC;
    }

    @Override
    public int b(cj cj2) {
        double d = af.a((double)cj2.n() * 0.0225, (double)cj2.p() * 0.0225);
        if (d < -0.1) {
            return 5011004;
        }
        return 6975545;
    }

    @Override
    public int c(cj cj2) {
        return 6975545;
    }

    @Override
    public agw.a a(Random random, cj cj2) {
        return agw.a.c;
    }

    @Override
    public void a(adm adm22, Random random, ans ans2, int n, int n2, double d) {
        adm adm22;
        \u2603 = af.a((double)n * 0.25, (double)n2 * 0.25);
        if (\u2603 > 0.0) {
            int n3 = n & 0xF;
            \u2603 = n2 & 0xF;
            for (\u2603 = 255; \u2603 >= 0; --\u2603) {
                if (ans2.a(\u2603, \u2603, n3).c().t() == arm.a) continue;
                if (\u2603 != 62 || ans2.a(\u2603, \u2603, n3).c() == afi.j) break;
                ans2.a(\u2603, \u2603, n3, afi.j.Q());
                if (!(\u2603 < 0.12)) break;
                ans2.a(\u2603, \u2603 + 1, n3, afi.bx.Q());
                break;
            }
        }
        this.b(adm22, random, ans2, n, n2, d);
    }
}
