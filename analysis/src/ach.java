/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class ach
extends aci {
    protected ach(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.h);
        this.c("digging");
    }

    @Override
    public int a(int n) {
        return 1 + 10 * (n - 1);
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 5;
    }

    @Override
    public boolean a(zx zx2) {
        if (zx2.b() == zy.be) {
            return true;
        }
        return super.a(zx2);
    }
}
