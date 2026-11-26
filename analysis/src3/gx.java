/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class gx
implements ff<fj> {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;

    public gx() {
    }

    public gx(wl wl2) {
        this.a(wl2.a);
        this.b(wl2.b);
        this.c(wl2.c);
        this.d(wl2.d);
        this.a(wl2.a());
        this.b(wl2.b());
    }

    @Override
    public void a(em em2) throws IOException {
        byte by = em2.readByte();
        this.a((by & 1) > 0);
        this.b((by & 2) > 0);
        this.c((by & 4) > 0);
        this.d((by & 8) > 0);
        this.a(em2.readFloat());
        this.b(em2.readFloat());
    }

    @Override
    public void b(em em2) throws IOException {
        byte by = 0;
        if (this.a()) {
            by = (byte)(by | 1);
        }
        if (this.b()) {
            by = (byte)(by | 2);
        }
        if (this.c()) {
            by = (byte)(by | 4);
        }
        if (this.d()) {
            by = (byte)(by | 8);
        }
        em2.writeByte(by);
        em2.writeFloat(this.e);
        em2.writeFloat(this.f);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public boolean a() {
        return this.a;
    }

    @Override
    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean b() {
        return this.b;
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    public boolean c() {
        return this.c;
    }

    public void c(boolean bl) {
        this.c = bl;
    }

    public boolean d() {
        return this.d;
    }

    public void d(boolean bl) {
        this.d = bl;
    }

    public float e() {
        return this.e;
    }

    @Override
    public void a(float f) {
        this.e = f;
    }

    public float f() {
        return this.f;
    }

    public void b(float f) {
        this.f = f;
    }
}
