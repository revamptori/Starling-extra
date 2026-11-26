/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class atf {
    private byte a;
    private byte b;
    private byte c;
    private byte d;

    public atf(byte by, byte by2, byte by3, byte by4) {
        this.a = by;
        this.b = by2;
        this.c = by3;
        this.d = by4;
    }

    public atf(atf atf2) {
        this.a = atf2.a;
        this.b = atf2.b;
        this.c = atf2.c;
        this.d = atf2.d;
    }

    public byte a() {
        return this.a;
    }

    public byte b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof atf)) {
            return false;
        }
        atf atf2 = (atf)object;
        if (this.a != atf2.a) {
            return false;
        }
        if (this.d != atf2.d) {
            return false;
        }
        if (this.b != atf2.b) {
            return false;
        }
        return this.c == atf2.c;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        n = 31 * n + this.c;
        n = 31 * n + this.d;
        return n;
    }
}
