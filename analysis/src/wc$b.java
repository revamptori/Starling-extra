/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public static class wc.b
implements pu {
    public int a;

    public void a(Random random) {
        int n = random.nextInt(5);
        if (n <= 1) {
            this.a = pe.c.H;
        } else if (n <= 2) {
            this.a = pe.g.H;
        } else if (n <= 3) {
            this.a = pe.l.H;
        } else if (n <= 4) {
            this.a = pe.p.H;
        }
    }
}
