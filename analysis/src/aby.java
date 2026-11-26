/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
public class aby {
    private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] b = new Object[][]{{afi.f, afi.e, zy.j, zy.i, zy.k}, {zy.o, zy.s, zy.b, zy.w, zy.D}, {zy.n, zy.r, zy.a, zy.v, zy.C}, {zy.p, zy.t, zy.c, zy.x, zy.E}, {zy.I, zy.J, zy.K, zy.L, zy.M}};

    public void a(abt abt22) {
        abt abt22;
        for (int i = 0; i < this.b[0].length; ++i) {
            Object object = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                zw zw2 = (zw)this.b[j + 1][i];
                abt22.a(new zx(zw2), this.a[j], Character.valueOf((char)'#'), zy.y, Character.valueOf((char)'X'), object);
            }
        }
        abt22.a(new zx(zy.be), " #", "# ", Character.valueOf((char)'#'), zy.j);
    }
}
