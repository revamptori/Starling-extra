/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aee
extends ady {
    private aot aD = new apj(afi.be.Q().a(ahz.a, ahz.a.a), 9);
    private aps aE = new aps(false);
    private int aF = 0;
    private int aG = 1;
    private int aH = 2;
    private int aI = this.aF;

    protected aee(int n, boolean bl) {
        super(n);
        if (bl) {
            this.as.A = 3;
            this.aI = this.aG;
        }
    }

    @Override
    public aoh a(Random random) {
        if (random.nextInt(3) > 0) {
            return this.aE;
        }
        return super.a(random);
    }

    @Override
    public void a(adm adm2, Random random, cj cj2) {
        super.a(adm2, random, cj2);
        int n = 3 + random.nextInt(6);
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            \u2603 = random.nextInt(16);
            cj cj3 = cj2.a(\u2603, \u2603 = random.nextInt(28) + 4, \u2603 = random.nextInt(16));
            if (adm2.p(cj3).c() != afi.b) continue;
            adm2.a(cj3, afi.bP.Q(), 2);
        }
        for (n = 0; n < 7; ++n) {
            \u2603 = random.nextInt(16);
            \u2603 = random.nextInt(64);
            \u2603 = random.nextInt(16);
            this.aD.b(adm2, random, cj2.a(\u2603, \u2603, \u2603));
        }
    }

    @Override
    public void a(adm adm2, Random random, ans ans2, int n, int n2, double d) {
        this.ak = afi.c.Q();
        this.al = afi.d.Q();
        if ((d < -1.0 || d > 2.0) && this.aI == this.aH) {
            this.ak = afi.n.Q();
            this.al = afi.n.Q();
        } else if (d > 1.0 && this.aI != this.aG) {
            this.ak = afi.b.Q();
            this.al = afi.b.Q();
        }
        this.b(adm2, random, ans2, n, n2, d);
    }

    private aee b(ady ady2) {
        this.aI = this.aH;
        this.a(ady2.ai, true);
        this.a(ady2.ah + " M");
        this.a(new ady.a(ady2.an, ady2.ao));
        this.a(ady2.ap, ady2.aq);
        return this;
    }

    @Override
    protected ady d(int n) {
        return new aee(n, false).b(this);
    }
}
