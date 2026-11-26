/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class fz.a {
    private final short b;
    private final alz c;

    public fz.a(short s, alz alz2) {
        this.b = s;
        this.c = alz2;
    }

    public fz.a(short s, amy amy2) {
        this.b = s;
        this.c = amy2.g(this.a());
    }

    public cj a() {
        return new cj(fz.this.a.a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
    }

    public short b() {
        return this.b;
    }

    public alz c() {
        return this.c;
    }
}
