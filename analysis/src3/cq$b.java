/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum cq.b {
    a(1, "Towards positive"),
    b(-1, "Towards negative");

    private final int c;
    private final String d;

    private cq.b(int n2, String string2) {
        this.c = n2;
        this.d = string2;
    }

    public int a() {
        return this.c;
    }

    public String toString() {
        return this.d;
    }
}
