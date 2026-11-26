/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aeo
extends ady {
    protected boolean aD;

    protected aeo(int n) {
        super(n);
        this.a(0.8f, 0.4f);
        this.a(e);
        this.au.add((Object)new ady.c(tp.class, 5, 2, 6));
        this.as.A = -999;
        this.as.B = 4;
        this.as.C = 10;
    }

    @Override
    public agw.a a(Random random2, cj cj2) {
        Random random2;
        double d = af.a((double)cj2.n() / 200.0, (double)cj2.p() / 200.0);
        if (d < -0.8) {
            int n = random2.nextInt(4);
            switch (n) {
                case 0: {
                    return agw.a.g;
                }
                case 1: {
                    return agw.a.f;
                }
                case 2: {
                    return agw.a.i;
                }
            }
            return agw.a.h;
        }
        if (random2.nextInt(3) > 0) {
            int n = random2.nextInt(3);
            if (n == 0) {
                return agw.a.b;
            }
            if (n == 1) {
                return agw.a.e;
            }
            return agw.a.j;
        }
        return agw.a.a;
    }

    @Override
    public void a(adm adm22, Random random, cj cj2) {
        adm adm22;
        int n;
        double d = af.a((double)(cj2.n() + 8) / 200.0, (double)(cj2.p() + 8) / 200.0);
        if (d < -0.8) {
            this.as.B = 15;
            this.as.C = 5;
        } else {
            this.as.B = 4;
            this.as.C = 10;
            ag.a(agi.b.c);
            for (n = 0; n < 7; ++n) {
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(adm22.m(cj2.a(\u2603, 0, \u2603)).o() + 32);
                ag.b(adm22, random, cj2.a(\u2603, \u2603, \u2603));
            }
        }
        if (this.aD) {
            ag.a(agi.b.a);
            for (n = 0; n < 10; ++n) {
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(adm22.m(cj2.a(\u2603, 0, \u2603)).o() + 32);
                ag.b(adm22, random, cj2.a(\u2603, \u2603, \u2603));
            }
        }
        super.a(adm22, random, cj2);
    }

    @Override
    protected ady d(int n) {
        aeo aeo2 = new aeo(n);
        aeo2.a("Sunflower Plains");
        aeo2.aD = true;
        aeo2.b(9286496);
        aeo2.aj = 14273354;
        return aeo2;
    }
}
