/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class ii
implements ff<ic> {
    private int a;
    private short b;
    private boolean c;

    public ii() {
    }

    public ii(int n, short s, boolean bl) {
        this.a = n;
        this.b = s;
        this.c = bl;
    }

    @Override
    public void a(ic ic2) {
        ic2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readByte();
        this.b = em2.readShort();
        this.c = em2.readByte() != 0;
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b);
        em2.writeByte(this.c ? 1 : 0);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }
}
