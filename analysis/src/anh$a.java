/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.Object
 */
import java.io.ByteArrayOutputStream;

class anh.a
extends ByteArrayOutputStream {
    private int b;
    private int c;

    public anh.a(int n, int n2) {
        super(8096);
        this.b = n;
        this.c = n2;
    }

    public void close() {
        anh.this.a(this.b, this.c, this.buf, this.count);
    }
}
