/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum bmv.b {
    a("Position"),
    b("Normal"),
    c("Vertex Color"),
    d("UV"),
    e("Bone Matrix"),
    f("Blend Weight"),
    g("Padding");

    private final String h;

    private bmv.b(String string2) {
        this.h = string2;
    }

    public String a() {
        return this.h;
    }
}
