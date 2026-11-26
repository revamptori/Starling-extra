/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import java.io.IOException;
import java.util.List;

public class gp
implements ff<fj> {
    private int[] a;
    private int[] b;
    private go.a[] c;
    private boolean d;

    public gp() {
    }

    public gp(List<amy> list) {
        int n = list.size();
        this.a = new int[n];
        this.b = new int[n];
        this.c = new go.a[n];
        this.d = !((amy)list.get((int)0)).p().t.o();
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            amy amy2 = (amy)list.get(\u2603);
            go.a \u26032 = go.a(amy2, true, this.d, 65535);
            this.a[\u2603] = amy2.a;
            this.b[\u2603] = amy2.b;
            this.c[\u2603] = \u26032;
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.d = em2.readBoolean();
        int n = em2.e();
        this.a = new int[n];
        this.b = new int[n];
        this.c = new go.a[n];
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            this.a[\u2603] = em2.readInt();
            this.b[\u2603] = em2.readInt();
            this.c[\u2603] = new go.a();
            this.c[\u2603].b = em2.readShort() & 0xFFFF;
            this.c[\u2603].a = new byte[go.a(Integer.bitCount((int)this.c[\u2603].b), this.d, true)];
        }
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            em2.readBytes(this.c[\u2603].a);
        }
    }

    @Override
    public void b(em em2) throws IOException {
        int n;
        em2.writeBoolean(this.d);
        em2.b(this.c.length);
        for (n = 0; n < this.a.length; ++n) {
            em2.writeInt(this.a[n]);
            em2.writeInt(this.b[n]);
            em2.writeShort((short)(this.c[n].b & 0xFFFF));
        }
        for (n = 0; n < this.a.length; ++n) {
            em2.writeBytes(this.c[n].a);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a(int n) {
        return this.a[n];
    }

    public int b(int n) {
        return this.b[n];
    }

    public int a() {
        return this.a.length;
    }

    public byte[] c(int n) {
        return this.c[n].a;
    }

    public int d(int n) {
        return this.c[n].b;
    }
}
