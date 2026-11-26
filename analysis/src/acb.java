/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class acb
extends aci {
    public acb(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.k);
        this.c("arrowDamage");
    }

    @Override
    public int a(int n) {
        return 1 + (n - 1) * 10;
    }

    @Override
    public int b(int n) {
        return this.a(n) + 15;
    }

    @Override
    public int b() {
        return 5;
    }
}
