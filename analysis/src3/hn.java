/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class hn
implements ff<fj> {
    private int a;
    private int b;
    private zx c;

    public hn() {
    }

    public hn(int n, int n2, zx zx2) {
        this.a = n;
        this.b = n2;
        this.c = zx2 == null ? null : zx2.k();
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.e();
        this.b = em2.readShort();
        this.c = em2.i();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a);
        em2.writeShort(this.b);
        em2.a(this.c);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public zx a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}
