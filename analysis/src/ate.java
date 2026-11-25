/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public abstract class ate {
    public final String a;
    private boolean b;

    public ate(String string) {
        this.a = string;
    }

    public abstract void a(dn var1);

    public abstract void b(dn var1);

    public void c() {
        this.a(true);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean d() {
        return this.b;
    }
}
