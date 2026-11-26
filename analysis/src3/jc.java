/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import java.io.IOException;

public class jc
implements ff<jd> {
    private int a;
    private String b;
    private int c;
    private el d;

    public jc() {
    }

    public jc(int n, String string, int n2, el el2) {
        this.a = n;
        this.b = string;
        this.c = n2;
        this.d = el2;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.e();
        this.b = em2.c(255);
        this.c = em2.readUnsignedShort();
        this.d = el.a(em2.e());
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a);
        em2.a(this.b);
        em2.writeShort(this.c);
        em2.b(this.d.a());
    }

    @Override
    public void a(jd jd2) {
        jd2.a(this);
    }

    public el a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }
}
