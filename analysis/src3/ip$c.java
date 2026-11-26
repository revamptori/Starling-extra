/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public static class ip.c
extends ip {
    public ip.c() {
        this.h = true;
    }

    public ip.c(float f, float f2, boolean bl) {
        this.d = f;
        this.e = f2;
        this.f = bl;
        this.h = true;
    }

    @Override
    public void a(em em2) throws IOException {
        this.d = em2.readFloat();
        this.e = em2.readFloat();
        super.a(em2);
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeFloat(this.d);
        em2.writeFloat(this.e);
        super.b(em2);
    }
}
