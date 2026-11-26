/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class gv.a
extends gv {
    public gv.a() {
    }

    public gv.a(int n, byte by, byte by2, byte by3, boolean bl) {
        super(n);
        this.b = by;
        this.c = by2;
        this.d = by3;
        this.g = bl;
    }

    @Override
    public void a(em em2) throws IOException {
        super.a(em2);
        this.b = em2.readByte();
        this.c = em2.readByte();
        this.d = em2.readByte();
        this.g = em2.readBoolean();
    }

    @Override
    public void b(em em2) throws IOException {
        super.b(em2);
        em2.writeByte(this.b);
        em2.writeByte(this.c);
        em2.writeByte(this.d);
        em2.writeBoolean(this.g);
    }
}
