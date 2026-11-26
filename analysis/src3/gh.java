/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class gh
implements ff<fj> {
    private eu a;

    public gh() {
    }

    public gh(eu eu2) {
        this.a = eu2;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.d();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.a(this.a);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public eu a() {
        return this.a;
    }
}
