/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class aqs
extends ate {
    private dn b = new dn();

    public aqs(String string) {
        super(string);
    }

    @Override
    public void a(dn dn2) {
        this.b = dn2.m("Features");
    }

    @Override
    public void b(dn dn2) {
        dn2.a("Features", this.b);
    }

    public void a(dn dn2, int n, int n2) {
        this.b.a(aqs.b(n, n2), dn2);
    }

    public static String b(int n, int n2) {
        return "[" + n + "," + n2 + "]";
    }

    public dn a() {
        return this.b;
    }
}
