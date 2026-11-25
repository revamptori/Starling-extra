/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 */
import java.util.Random;

public class any {
    protected int a = 8;
    protected Random b = new Random();
    protected adm c;

    public void a(amv amv2, adm adm2, int n, int n2, ans ans2) {
        int n3 = this.a;
        this.c = adm2;
        this.b.setSeed(adm2.J());
        long \u26032 = this.b.nextLong();
        long \u26033 = this.b.nextLong();
        for (\u2603 = n - n3; \u2603 <= n + n3; ++\u2603) {
            for (\u2603 = n2 - n3; \u2603 <= n2 + n3; ++\u2603) {
                long l = (long)\u2603 * \u26032;
                \u2603 = (long)\u2603 * \u26033;
                this.b.setSeed(l ^ \u2603 ^ adm2.J());
                this.a(adm2, \u2603, \u2603, n, n2, ans2);
            }
        }
    }

    protected void a(adm adm2, int n, int n2, int n3, int n4, ans ans2) {
    }
}
