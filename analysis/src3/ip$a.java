/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class ip.a
extends ip {
    public ip.a() {
        this.g = true;
    }

    public ip.a(double d, double d2, double d3, boolean bl) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.f = bl;
        this.g = true;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readDouble();
        this.b = em2.readDouble();
        this.c = em2.readDouble();
        super.a(em2);
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeDouble(this.a);
        em2.writeDouble(this.b);
        em2.writeDouble(this.c);
        super.b(em2);
    }
}
