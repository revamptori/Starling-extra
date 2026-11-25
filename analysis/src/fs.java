/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class fs
implements ff<fj> {
    private int a;
    private cj b;
    private int c;

    public fs() {
    }

    public fs(int n, cj cj2, int n2) {
        this.a = n;
        this.b = cj2;
        this.c = n2;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.e();
        this.b = em2.c();
        this.c = em2.readUnsignedByte();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a);
        em2.a(this.b);
        em2.writeByte(this.c);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }

    public cj b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}
