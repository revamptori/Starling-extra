/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class iw
implements ff<ic> {
    private int a;
    private zx b;

    public iw() {
    }

    public iw(int n, zx zx2) {
        this.a = n;
        this.b = zx2 != null ? zx2.k() : null;
    }

    @Override
    public void a(ic ic2) {
        ic2.a(this);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readShort();
        this.b = em2.i();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeShort(this.a);
        em2.a(this.b);
    }

    public int a() {
        return this.a;
    }

    public zx b() {
        return this.b;
    }
}
