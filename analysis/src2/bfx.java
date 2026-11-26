/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bfx {
    private bfd a;
    private bfe b = new bfe();
    private static final bfx c = new bfx(0x200000);

    public static bfx a() {
        return c;
    }

    public bfx(int n) {
        this.a = new bfd(n);
    }

    public void b() {
        this.a.e();
        this.b.a(this.a);
    }

    public bfd c() {
        return this.a;
    }
}
