/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class awe
extends avs {
    private final avh.a o;

    public awe(int n, int n2, int n3, String string) {
        this(n, n2, n3, null, string);
    }

    public awe(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
        this.o = null;
    }

    public awe(int n, int n2, int n3, avh.a a2, String string) {
        super(n, n2, n3, 150, 20, string);
        this.o = a2;
    }

    public avh.a c() {
        return this.o;
    }
}
