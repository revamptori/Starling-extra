/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 */
public static enum bpv.a {
    a(new jy("minecraft:music.menu"), 20, 600),
    b(new jy("minecraft:music.game"), 12000, 24000),
    c(new jy("minecraft:music.game.creative"), 1200, 3600),
    d(new jy("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE),
    e(new jy("minecraft:music.game.nether"), 1200, 3600),
    f(new jy("minecraft:music.game.end.dragon"), 0, 0),
    g(new jy("minecraft:music.game.end"), 6000, 24000);

    private final jy h;
    private final int i;
    private final int j;

    private bpv.a(jy jy2, int n2, int n3) {
        this.h = jy2;
        this.i = n2;
        this.j = n3;
    }

    public jy a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}
