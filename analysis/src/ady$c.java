/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
public static class ady.c
extends oa.a {
    public Class<? extends ps> b;
    public int c;
    public int d;

    public ady.c(Class<? extends ps> clazz, int n, int n2, int n3) {
        super(n);
        this.b = clazz;
        this.c = n2;
        this.d = n3;
    }

    public String toString() {
        return this.b.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.a;
    }
}
