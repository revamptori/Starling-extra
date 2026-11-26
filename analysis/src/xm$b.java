/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class xm.b
extends yg {
    private wn a;

    public xm.b(wn wn2, og og2, int n, int n2, int n3) {
        super(og2, n, n2, n3);
        this.a = wn2;
    }

    @Override
    public boolean a(zx zx2) {
        return xm.b.b_(zx2);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(wn wn2, zx zx2) {
        if (zx2.b() == zy.bz && zx2.i() > 0) {
            this.a.b(mr.B);
        }
        super.a(wn2, zx2);
    }

    public static boolean b_(zx zx2) {
        return zx2 != null && (zx2.b() == zy.bz || zx2.b() == zy.bA);
    }
}
