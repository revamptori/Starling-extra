/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
public class abi {
    private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private zw[][] b = new zw[][]{{zy.aF, zy.j, zy.i, zy.k}, {zy.Q, zy.Y, zy.ac, zy.ag}, {zy.R, zy.Z, zy.ad, zy.ah}, {zy.S, zy.aa, zy.ae, zy.ai}, {zy.T, zy.ab, zy.af, zy.aj}};

    public void a(abt abt2) {
        for (int i = 0; i < this.b[0].length; ++i) {
            zw zw2 = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                zw zw3 = this.b[j + 1][i];
                abt2.a(new zx(zw3), this.a[j], Character.valueOf((char)'X'), zw2);
            }
        }
    }
}
