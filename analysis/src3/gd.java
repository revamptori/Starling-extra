/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import java.io.IOException;
import java.util.List;

public class gd
implements ff<fj> {
    private int a;
    private zx[] b;

    public gd() {
    }

    public gd(int n, List<zx> list) {
        this.a = n;
        this.b = new zx[list.size()];
        for (int i = 0; i < this.b.length; ++i) {
            zx zx2 = (zx)list.get(i);
            this.b[i] = zx2 == null ? null : zx2.k();
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readUnsignedByte();
        int n = em2.readShort();
        this.b = new zx[n];
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            this.b[\u2603] = em2.i();
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.a);
        em2.writeShort(this.b.length);
        for (zx zx2 : this.b) {
            em2.a(zx2);
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }

    public zx[] b() {
        return this.b;
    }
}
