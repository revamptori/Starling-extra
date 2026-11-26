/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class ip.b
extends ip {
    public ip.b() {
        this.g = true;
        this.h = true;
    }

    public ip.b(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.e = f2;
        this.f = bl;
        this.h = true;
        this.g = true;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readDouble();
        this.b = em2.readDouble();
        this.c = em2.readDouble();
        this.d = em2.readFloat();
        this.e = em2.readFloat();
        super.a(em2);
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeDouble(this.a);
        em2.writeDouble(this.b);
        em2.writeDouble(this.c);
        em2.writeFloat(this.d);
        em2.writeFloat(this.e);
        super.b(em2);
    }
}
