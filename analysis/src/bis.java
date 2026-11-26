/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class bis
extends bjo<vo> {
    private static final jy a = new jy("textures/entity/enderman/enderman.png");
    private bbd e;
    private Random j = new Random();

    public bis(biu biu2) {
        super(biu2, new bbd(0.0f), 0.5f);
        this.e = (bbd)this.f;
        this.a(new bkw(this));
        this.a(new bkq(this));
    }

    @Override
    public void a(vo vo22, double d, double d2, double d3, float f, float f2) {
        vo vo22;
        this.e.a = vo22.cm().c().t() != arm.a;
        this.e.b = vo22.co();
        if (vo22.co()) {
            double d4 = 0.02;
            d += this.j.nextGaussian() * d4;
            d3 += this.j.nextGaussian() * d4;
        }
        super.a(vo22, d, d2, d3, f, f2);
    }

    @Override
    protected jy a(vo vo2) {
        return a;
    }
}
