/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
public class abz {
    private String[][] a = new String[][]{{"X", "X", "#"}};
    private Object[][] b = new Object[][]{{afi.f, afi.e, zy.j, zy.i, zy.k}, {zy.m, zy.q, zy.l, zy.u, zy.B}};

    public void a(abt abt22) {
        abt abt22;
        for (int i = 0; i < this.b[0].length; ++i) {
            Object object = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                zw zw2 = (zw)this.b[j + 1][i];
                abt22.a(new zx(zw2), this.a[j], Character.valueOf((char)'#'), zy.y, Character.valueOf((char)'X'), object);
            }
        }
        abt22.a(new zx(zy.f, 1), " #X", "# X", " #X", Character.valueOf((char)'X'), zy.F, Character.valueOf((char)'#'), zy.y);
        abt22.a(new zx(zy.g, 4), "X", "#", "Y", Character.valueOf((char)'Y'), zy.G, Character.valueOf((char)'X'), zy.ak, Character.valueOf((char)'#'), zy.y);
    }
}
