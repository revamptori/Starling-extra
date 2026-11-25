/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum aju.b implements nw
{
    a("straight"),
    b("inner_left"),
    c("inner_right"),
    d("outer_left"),
    e("outer_right");

    private final String f;

    private aju.b(String string2) {
        this.f = string2;
    }

    public String toString() {
        return this.f;
    }

    @Override
    public String l() {
        return this.f;
    }
}
