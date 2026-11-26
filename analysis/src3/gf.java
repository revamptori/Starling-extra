/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class gf
implements ff<fj> {
    private int a;
    private int b;
    private zx c;

    public gf() {
    }

    public gf(int n, int n2, zx zx2) {
        this.a = n;
        this.b = n2;
        this.c = zx2 == null ? null : zx2.k();
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readByte();
        this.b = em2.readShort();
        this.c = em2.i();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b);
        em2.a(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public zx c() {
        return this.c;
    }
}
