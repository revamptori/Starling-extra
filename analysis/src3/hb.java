/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class hb
implements ff<fj> {
    private int[] a;

    public hb() {
    }

    public hb(int ... nArray) {
        this.a = nArray;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = new int[em2.e()];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = em2.e();
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a.length);
        for (int i = 0; i < this.a.length; ++i) {
            em2.b(this.a[i]);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int[] a() {
        return this.a;
    }
}
