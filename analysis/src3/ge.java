/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class ge
implements ff<fj> {
    private int a;
    private int b;
    private int c;

    public ge() {
    }

    public ge(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readUnsignedByte();
        this.b = em2.readShort();
        this.c = em2.readShort();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b);
        em2.writeShort(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}
