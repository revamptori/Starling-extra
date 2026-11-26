/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class aim
extends afh {
    public aim() {
        this(arm.e.r());
    }

    public aim(arn arn2) {
        super(arm.e, arn2);
        this.a(yz.b);
    }

    @Override
    public zw a(alz alz2, Random random, int n) {
        if (this == afi.q) {
            return zy.h;
        }
        if (this == afi.ag) {
            return zy.i;
        }
        if (this == afi.x) {
            return zy.aW;
        }
        if (this == afi.bP) {
            return zy.bO;
        }
        if (this == afi.co) {
            return zy.cg;
        }
        return zw.a(this);
    }

    @Override
    public int a(Random random) {
        if (this == afi.x) {
            return 4 + random.nextInt(5);
        }
        return 1;
    }

    @Override
    public int a(int n, Random random2) {
        Random random2;
        if (n > 0 && zw.a(this) != this.a((alz)this.P().a().iterator().next(), random2, n)) {
            int n2 = random2.nextInt(n + 2) - 1;
            if (n2 < 0) {
                n2 = 0;
            }
            return this.a(random2) * (n2 + 1);
        }
        return this.a(random2);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, float f, int n) {
        super.a(adm2, cj2, alz2, f, n);
        if (this.a(alz2, adm2.s, n) != zw.a(this)) {
            \u2603 = 0;
            if (this == afi.q) {
                \u2603 = ns.a(adm2.s, 0, 2);
            } else if (this == afi.ag) {
                \u2603 = ns.a(adm2.s, 3, 7);
            } else if (this == afi.bP) {
                \u2603 = ns.a(adm2.s, 3, 7);
            } else if (this == afi.x) {
                \u2603 = ns.a(adm2.s, 2, 5);
            } else if (this == afi.co) {
                \u2603 = ns.a(adm2.s, 2, 5);
            }
            this.b(adm2, cj2, \u2603);
        }
    }

    @Override
    public int j(adm adm2, cj cj2) {
        return 0;
    }

    @Override
    public int a(alz alz2) {
        if (this == afi.x) {
            return zd.l.b();
        }
        return 0;
    }
}
