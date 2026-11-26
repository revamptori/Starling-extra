/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Object
 */
public class abr {
    private Object[][] a = new Object[][]{{afi.R, new zx(zy.k, 9)}, {afi.S, new zx(zy.j, 9)}, {afi.ah, new zx(zy.i, 9)}, {afi.bT, new zx(zy.bO, 9)}, {afi.y, new zx(zy.aW, 9, zd.l.b())}, {afi.cn, new zx(zy.aC, 9)}, {afi.cA, new zx(zy.h, 9, 0)}, {afi.cx, new zx(zy.O, 9)}, {afi.cE, new zx(zy.aM, 9)}};

    public void a(abt abt2) {
        for (int i = 0; i < this.a.length; ++i) {
            afh afh2 = (afh)this.a[i][0];
            zx \u26032 = (zx)this.a[i][1];
            abt2.a(new zx(afh2), "###", "###", "###", Character.valueOf((char)'#'), \u26032);
            abt2.a(\u26032, "#", Character.valueOf((char)'#'), afh2);
        }
        abt2.a(new zx(zy.k), "###", "###", "###", Character.valueOf((char)'#'), zy.bx);
        abt2.a(new zx(zy.bx, 9), "#", Character.valueOf((char)'#'), zy.k);
    }
}
