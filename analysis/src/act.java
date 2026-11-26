/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class act
extends aci {
    protected act(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.h);
        this.c("untouching");
    }

    @Override
    public int a(int n) {
        return 15;
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public boolean a(aci aci2) {
        return super.a(aci2) && aci2.B != act.u.B;
    }

    @Override
    public boolean a(zx zx2) {
        if (zx2.b() == zy.be) {
            return true;
        }
        return super.a(zx2);
    }
}
