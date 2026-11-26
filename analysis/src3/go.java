/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.System
 *  java.util.ArrayList
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;

public class go
implements ff<fj> {
    private int a;
    private int b;
    private a c;
    private boolean d;

    public go() {
    }

    public go(amy amy2, boolean bl, int n) {
        this.a = amy2.a;
        this.b = amy2.b;
        this.d = bl;
        this.c = go.a(amy2, bl, !amy2.p().t.o(), n);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readInt();
        this.b = em2.readInt();
        this.d = em2.readBoolean();
        this.c = new a();
        this.c.b = em2.readShort();
        this.c.a = em2.a();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeInt(this.a);
        em2.writeInt(this.b);
        em2.writeBoolean(this.d);
        em2.writeShort((short)(this.c.b & 0xFFFF));
        em2.a(this.c.a);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public byte[] a() {
        return this.c.a;
    }

    protected static int a(int n, boolean bl, boolean bl2) {
        int n2 = n * 2 * 16 * 16 * 16;
        \u2603 = n * 16 * 16 * 16 / 2;
        \u2603 = bl ? n * 16 * 16 * 16 / 2 : 0;
        \u2603 = bl2 ? 256 : 0;
        return n2 + \u2603 + \u2603 + \u2603;
    }

    public static a a(amy amy2, boolean bl3, boolean bl22, int n) {
        boolean bl3;
        boolean bl22;
        int \u26034;
        amz[] amzArray = amy2.h();
        a \u26032 = new a();
        ArrayList \u26033 = Lists.newArrayList();
        for (\u26034 = 0; \u26034 < amzArray.length; ++\u26034) {
            amz amz2 = amzArray[\u26034];
            if (amz2 == null || bl3 && amz2.a() || (n & 1 << \u26034) == 0) continue;
            \u26032.b |= 1 << \u26034;
            \u26033.add((Object)amz2);
        }
        \u26032.a = new byte[go.a(Integer.bitCount((int)\u26032.b), bl22, bl3)];
        \u26034 = 0;
        for (amz amz3 : \u26033) {
            for (char c2 : \u2603 = amz3.g()) {
                \u26032.a[\u26034++] = (byte)(c2 & 0xFF);
                \u26032.a[\u26034++] = (byte)(c2 >> 8 & 0xFF);
            }
        }
        for (amz amz3 : \u26033) {
            \u26034 = go.a(amz3.h().a(), \u26032.a, \u26034);
        }
        if (bl22) {
            for (amz amz3 : \u26033) {
                \u26034 = go.a(amz3.i().a(), \u26032.a, \u26034);
            }
        }
        if (bl3) {
            go.a(amy2.k(), \u26032.a, \u26034);
        }
        return \u26032;
    }

    private static int a(byte[] byArray, byte[] byArray2, int n) {
        System.arraycopy((Object)byArray, (int)0, (Object)byArray2, (int)n, (int)byArray.length);
        return n + byArray.length;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c.b;
    }

    public boolean e() {
        return this.d;
    }

    public static class a {
        public byte[] a;
        public int b;
    }
}
