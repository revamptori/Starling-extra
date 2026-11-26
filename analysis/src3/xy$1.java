/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class xy.1
extends yg {
    final /* synthetic */ int a;

    xy.1(og og2, int n, int n2, int n3, int n4) {
        this.a = n4;
        super(og2, n, n2, n3);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean a(zx zx2) {
        if (zx2 == null) {
            return false;
        }
        if (zx2.b() instanceof yj) {
            return ((yj)zx2.b()).b == this.a;
        }
        if (zx2.b() == zw.a(afi.aU) || zx2.b() == zy.bX) {
            return this.a == 0;
        }
        return false;
    }

    @Override
    public String c() {
        return yj.a[this.a];
    }
}
