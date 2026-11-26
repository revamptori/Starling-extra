/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
public class bz
extends Exception {
    private final Object[] a;

    public bz(String string, Object ... objectArray) {
        super(string);
        this.a = objectArray;
    }

    public Object[] a() {
        return this.a;
    }
}
