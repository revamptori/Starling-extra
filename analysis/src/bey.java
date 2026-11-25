/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
public class bey
implements ol {
    private String a;
    private eu b;

    public bey(String string, eu eu2) {
        this.a = string;
        this.b = eu2;
    }

    @Override
    public xi a(wm wm2, wn wn2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String e_() {
        return this.b.c();
    }

    @Override
    public boolean l_() {
        return true;
    }

    @Override
    public String k() {
        return this.a;
    }

    @Override
    public eu f_() {
        return this.b;
    }
}
