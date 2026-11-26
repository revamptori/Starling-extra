/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class ga
implements ff<fj> {
    private int a;
    private short b;
    private boolean c;

    public ga() {
    }

    public ga(int n, short s, boolean bl) {
        this.a = n;
        this.b = s;
        this.c = bl;
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readUnsignedByte();
        this.b = em2.readShort();
        this.c = em2.readBoolean();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b);
        em2.writeBoolean(this.c);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
