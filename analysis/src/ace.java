/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class ace
extends aci {
    public ace(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.k);
        this.c("arrowKnockback");
    }

    @Override
    public int a(int n) {
        return 12 + (n - 1) * 20;
    }

    @Override
    public int b(int n) {
        return this.a(n) + 25;
    }

    @Override
    public int b() {
        return 2;
    }
}
