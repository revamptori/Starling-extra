/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class ik
implements ff<ic> {
    private int a;
    private int b;
    private int c;
    private short d;
    private zx e;
    private int f;

    public ik() {
    }

    public ik(int n, int n2, int n3, int n4, zx zx2, short s) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.e = zx2 != null ? zx2.k() : null;
        this.d = s;
        this.f = n4;
    }

    @Override
    public void a(ic ic2) {
        ic2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readByte();
        this.b = em2.readShort();
        this.c = em2.readByte();
        this.d = em2.readShort();
        this.f = em2.readByte();
        this.e = em2.i();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b);
        em2.writeByte(this.c);
        em2.writeShort(this.d);
        em2.writeByte(this.f);
        em2.a(this.e);
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

    public short d() {
        return this.d;
    }

    public zx e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }
}
