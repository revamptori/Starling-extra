/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class gt
implements ff<fj> {
    private int a;
    private boolean b;
    private adp.a c;
    private int d;
    private oj e;
    private int f;
    private adr g;
    private boolean h;

    public gt() {
    }

    public gt(int n, adp.a a2, boolean bl, int n2, oj oj2, int n3, adr adr2, boolean bl2) {
        this.a = n;
        this.d = n2;
        this.e = oj2;
        this.c = a2;
        this.f = n3;
        this.b = bl;
        this.g = adr2;
        this.h = bl2;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readInt();
        int n = em2.readUnsignedByte();
        this.b = (n & 8) == 8;
        this.c = adp.a.a(n &= 0xFFFFFFF7);
        this.d = em2.readByte();
        this.e = oj.a(em2.readUnsignedByte());
        this.f = em2.readUnsignedByte();
        this.g = adr.a(em2.c(16));
        if (this.g == null) {
            this.g = adr.b;
        }
        this.h = em2.readBoolean();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeInt(this.a);
        int n = this.c.a();
        if (this.b) {
            n |= 8;
        }
        em2.writeByte(n);
        em2.writeByte(this.d);
        em2.writeByte(this.e.a());
        em2.writeByte(this.f);
        em2.a(this.g.a());
        em2.writeBoolean(this.h);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public adp.a c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public oj e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public adr g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }
}
