/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class acg
extends aci {
    protected acg(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.j);
        this.c("durability");
    }

    @Override
    public int a(int n) {
        return 5 + (n - 1) * 8;
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(zx zx2) {
        if (zx2.e()) {
            return true;
        }
        return super.a(zx2);
    }

    public static boolean a(zx zx2, int n, Random random) {
        if (zx2.b() instanceof yj && random.nextFloat() < 0.6f) {
            return false;
        }
        return random.nextInt(n + 1) > 0;
    }
}
