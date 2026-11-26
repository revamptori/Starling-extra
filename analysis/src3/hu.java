/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class hu
implements ff<fj> {
    private long a;
    private long b;

    public hu() {
    }

    public hu(long l, long l2, boolean bl) {
        this.a = l;
        this.b = l2;
        if (!bl) {
            this.b = -this.b;
            if (this.b == 0L) {
                this.b = -1L;
            }
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readLong();
        this.b = em2.readLong();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeLong(this.a);
        em2.writeLong(this.b);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}
