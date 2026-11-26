/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

static class wi.g
extends nz<Integer, Integer> {
    public wi.g(int n, int n2) {
        super(n, n2);
    }

    public int a(Random random) {
        if ((Integer)this.a() >= (Integer)this.b()) {
            return (Integer)this.a();
        }
        return (Integer)this.a() + random.nextInt((Integer)this.b() - (Integer)this.a() + 1);
    }
}
