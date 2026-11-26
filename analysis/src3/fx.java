/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 */
import java.io.IOException;

public class fx
implements ff<fj> {
    private String[] a;

    public fx() {
    }

    public fx(String[] stringArray) {
        this.a = stringArray;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = new String[em2.e()];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = em2.c(Short.MAX_VALUE);
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a.length);
        for (String string : this.a) {
            em2.a(string);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public String[] a() {
        return this.a;
    }
}
