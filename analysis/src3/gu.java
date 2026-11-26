/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collection
 */
import java.io.IOException;
import java.util.Collection;

public class gu
implements ff<fj> {
    private int a;
    private byte b;
    private atf[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private byte[] h;

    public gu() {
    }

    public gu(int n, byte by, Collection<atf> collection, byte[] byArray, int n2, int n3, int n4, int n5) {
        this.a = n;
        this.b = by;
        this.c = (atf[])collection.toArray((Object[])new atf[collection.size()]);
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.h = new byte[n4 * n5];
        for (\u2603 = 0; \u2603 < n4; ++\u2603) {
            for (\u2603 = 0; \u2603 < n5; ++\u2603) {
                this.h[\u2603 + \u2603 * n4] = byArray[n2 + \u2603 + (n3 + \u2603) * 128];
            }
        }
    }

    @Override
    public void a(em em22) throws IOException {
        em em22;
        this.a = em22.e();
        this.b = em22.readByte();
        this.c = new atf[em22.e()];
        for (int i = 0; i < this.c.length; ++i) {
            short s = em22.readByte();
            this.c[i] = new atf((byte)(s >> 4 & 0xF), em22.readByte(), em22.readByte(), (byte)(s & 0xF));
        }
        this.f = em22.readUnsignedByte();
        if (this.f > 0) {
            this.g = em22.readUnsignedByte();
            this.d = em22.readUnsignedByte();
            this.e = em22.readUnsignedByte();
            this.h = em22.a();
        }
    }

    @Override
    public void b(em em22) throws IOException {
        em em22;
        em22.b(this.a);
        em22.writeByte(this.b);
        em22.b(this.c.length);
        for (atf atf2 : this.c) {
            em22.writeByte((atf2.a() & 0xF) << 4 | atf2.d() & 0xF);
            em22.writeByte(atf2.b());
            em22.writeByte(atf2.c());
        }
        em22.writeByte(this.f);
        if (this.f > 0) {
            em22.writeByte(this.g);
            em22.writeByte(this.d);
            em22.writeByte(this.e);
            em22.a(this.h);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }

    @Override
    public void a(atg atg2) {
        int n;
        atg2.e = this.b;
        atg2.h.clear();
        for (n = 0; n < this.c.length; ++n) {
            atf atf2 = this.c[n];
            atg2.h.put((Object)("icon-" + n), (Object)atf2);
        }
        for (n = 0; n < this.f; ++n) {
            for (\u2603 = 0; \u2603 < this.g; ++\u2603) {
                atg2.f[this.d + n + (this.e + \u2603) * 128] = this.h[n + \u2603 * this.f];
            }
        }
    }
}
