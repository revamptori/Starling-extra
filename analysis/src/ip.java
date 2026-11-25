/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class ip
implements ff<ic> {
    protected double a;
    protected double b;
    protected double c;
    protected float d;
    protected float e;
    protected boolean f;
    protected boolean g;
    protected boolean h;

    public ip() {
    }

    public ip(boolean bl) {
        this.f = bl;
    }

    @Override
    public void a(ic ic2) {
        ic2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.f = em2.readUnsignedByte() != 0;
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.f ? 1 : 0);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    @Override
    public void a(boolean bl) {
        this.g = bl;
    }

    public static class c
    extends ip {
        public c() {
            this.h = true;
        }

        public c(float f, float f2, boolean bl) {
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

    public static class a
    extends ip {
        public a() {
            this.g = true;
        }

        public a(double d, double d2, double d3, boolean bl) {
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

    public static class b
    extends ip {
        public b() {
            this.g = true;
            this.h = true;
        }

        public b(double d, double d2, double d3, float f, float f2, boolean bl) {
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
}
