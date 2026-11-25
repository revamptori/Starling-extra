/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class hw
implements ff<fj> {
    private adm a;
    private cj b;
    private eu[] c;

    public hw() {
    }

    public hw(adm adm2, cj cj2, eu[] euArray) {
        this.a = adm2;
        this.b = cj2;
        this.c = new eu[]{euArray[0], euArray[1], euArray[2], euArray[3]};
    }

    @Override
    public void a(em em2) throws IOException {
        this.b = em2.c();
        this.c = new eu[4];
        for (int i = 0; i < 4; ++i) {
            this.c[i] = em2.d();
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.a(this.b);
        for (int i = 0; i < 4; ++i) {
            em2.a(this.c[i]);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public cj a() {
        return this.b;
    }

    public eu[] b() {
        return this.c;
    }
}
