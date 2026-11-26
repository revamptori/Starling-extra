/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import java.io.IOException;

public class gg
implements ff<fj> {
    private String a;
    private em b;

    public gg() {
    }

    public gg(String string, em em2) {
        this.a = string;
        this.b = em2;
        if (em2.writerIndex() > 0x100000) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.c(20);
        int n = em2.readableBytes();
        if (n < 0 || n > 0x100000) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.b = new em(em2.readBytes(n));
    }

    @Override
    public void b(em em2) throws IOException {
        em2.a(this.a);
        em2.writeBytes(this.b);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public String a() {
        return this.a;
    }

    public em b() {
        return this.b;
    }
}
