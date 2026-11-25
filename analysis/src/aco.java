/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class aco
extends aci {
    protected aco(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.g);
        this.c("knockback");
    }

    @Override
    public int a(int n) {
        return 5 + 20 * (n - 1);
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 2;
    }
}
