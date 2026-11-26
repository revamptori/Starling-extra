/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bfd.a {
    private final int[] b;
    private final bmu c;

    public bfd.a(int[] nArray, bmu bmu2) {
        this.b = nArray;
        this.c = bmu2;
    }

    public int[] a() {
        return this.b;
    }

    public int b() {
        return this.b.length / this.c.f();
    }

    public bmu c() {
        return this.c;
    }
}
