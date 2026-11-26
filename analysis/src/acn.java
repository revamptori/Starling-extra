/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class acn
extends aci {
    protected acn(int n, jy jy2, int n2, acj acj2) {
        super(n, jy2, n2, acj2);
        this.c("fishingSpeed");
    }

    @Override
    public int a(int n) {
        return 15 + (n - 1) * 9;
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 3;
    }
}
