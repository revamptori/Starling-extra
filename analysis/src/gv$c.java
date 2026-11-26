/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class gv.c
extends gv {
    public gv.c() {
        this.h = true;
    }

    public gv.c(int n, byte by, byte by2, boolean bl) {
        super(n);
        this.e = by;
        this.f = by2;
        this.h = true;
        this.g = bl;
    }

    @Override
    public void a(em em2) throws IOException {
        super.a(em2);
        this.e = em2.readByte();
        this.f = em2.readByte();
        this.g = em2.readBoolean();
    }

    @Override
    public void b(em em2) throws IOException {
        super.b(em2);
        em2.writeByte(this.e);
        em2.writeByte(this.f);
        em2.writeBoolean(this.g);
    }
}
