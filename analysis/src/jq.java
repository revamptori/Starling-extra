/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class jq
implements ff<jp> {
    private long a;

    public jq() {
    }

    public jq(long l) {
        this.a = l;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readLong();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeLong(this.a);
    }

    @Override
    public void a(jp jp2) {
        jp2.a(this);
    }
}
