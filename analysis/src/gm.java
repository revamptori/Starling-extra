/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import java.io.IOException;

public class gm
implements ff<fj> {
    public static final String[] a = new String[]{"tile.bed.notValid"};
    private int b;
    private float c;

    public gm() {
    }

    public gm(int n, float f) {
        this.b = n;
        this.c = f;
    }

    @Override
    public void a(em em2) throws IOException {
        this.b = em2.readUnsignedByte();
        this.c = em2.readFloat();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeByte(this.b);
        em2.writeFloat(this.c);
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}
