/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aei
extends ady {
    private boolean aD;
    private apb aE = new apb();
    private apa aF = new apa(4);

    public aei(int n, boolean bl) {
        super(n);
        this.aD = bl;
        if (bl) {
            this.ak = afi.aJ.Q();
        }
        this.au.clear();
    }

    @Override
    public void a(adm adm22, Random random, cj cj2) {
        adm adm22;
        if (this.aD) {
            int n;
            for (n = 0; n < 3; ++n) {
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(16) + 8;
                this.aE.b(adm22, random, adm22.m(cj2.a(\u2603, 0, \u2603)));
            }
            for (n = 0; n < 2; ++n) {
                \u2603 = random.nextInt(16) + 8;
                \u2603 = random.nextInt(16) + 8;
                this.aF.b(adm22, random, adm22.m(cj2.a(\u2603, 0, \u2603)));
            }
        }
        super.a(adm22, random, cj2);
    }

    @Override
    public aoh a(Random random) {
        return new aps(false);
    }

    @Override
    protected ady d(int n) {
        ady ady2 = new aei(n, true).a(0xD2FFFF, true).a(this.ah + " Spikes").c().a(0.0f, 0.5f).a(new ady.a(this.an + 0.1f, this.ao + 0.1f));
        ady2.an = this.an + 0.3f;
        ady2.ao = this.ao + 0.4f;
        return ady2;
    }
}
