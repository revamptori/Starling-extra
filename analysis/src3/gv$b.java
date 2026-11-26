/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class gv.b
extends gv {
    public gv.b() {
        this.h = true;
    }

    public gv.b(int n, byte by, byte by2, byte by3, byte by4, byte by5, boolean bl) {
        super(n);
        this.b = by;
        this.c = by2;
        this.d = by3;
        this.e = by4;
        this.f = by5;
        this.g = bl;
        this.h = true;
    }

    @Override
    public void a(em em2) throws IOException {
        super.a(em2);
        this.b = em2.readByte();
        this.c = em2.readByte();
        this.d = em2.readByte();
        this.e = em2.readByte();
        this.f = em2.readByte();
        this.g = em2.readBoolean();
    }

    @Override
    public void b(em em2) throws IOException {
        super.b(em2);
        em2.writeByte(this.b);
        em2.writeByte(this.c);
        em2.writeByte(this.d);
        em2.writeByte(this.e);
        em2.writeByte(this.f);
        em2.writeBoolean(this.g);
    }
}
