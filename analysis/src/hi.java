/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class hi
implements ff<fj> {
    private int a;

    public hi() {
    }

    public hi(int n) {
        this.a = n;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readByte();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }
}
