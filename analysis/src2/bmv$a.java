/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum bmv.a {
    a(4, "Float", 5126),
    b(1, "Unsigned Byte", 5121),
    c(1, "Byte", 5120),
    d(2, "Unsigned Short", 5123),
    e(2, "Short", 5122),
    f(4, "Unsigned Int", 5125),
    g(4, "Int", 5124);

    private final int h;
    private final String i;
    private final int j;

    private bmv.a(int n2, String string2, int n3) {
        this.h = n2;
        this.i = string2;
        this.j = n3;
    }

    public int a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }
}
