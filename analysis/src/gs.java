/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.apache.commons.lang3.Validate
 */
import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class gs
implements ff<fj> {
    private String a;
    private int b;
    private int c = Integer.MAX_VALUE;
    private int d;
    private float e;
    private int f;

    public gs() {
    }

    public gs(String string, double d, double d2, double d3, float f, float f2) {
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[0]);
        this.a = string;
        this.b = (int)(d * 8.0);
        this.c = (int)(d2 * 8.0);
        this.d = (int)(d3 * 8.0);
        this.e = f;
        this.f = (int)(f2 * 63.0f);
        f2 = ns.a(f2, 0.0f, 255.0f);
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.c(256);
        this.b = em2.readInt();
        this.c = em2.readInt();
        this.d = em2.readInt();
        this.e = em2.readFloat();
        this.f = em2.readUnsignedByte();
    }

    @Override
    public void b(em em2) throws IOException {
        em2.a(this.a);
        em2.writeInt(this.b);
        em2.writeInt(this.c);
        em2.writeInt(this.d);
        em2.writeFloat(this.e);
        em2.writeByte(this.f);
    }

    public String a() {
        return this.a;
    }

    public double b() {
        return (float)this.b / 8.0f;
    }

    public double c() {
        return (float)this.c / 8.0f;
    }

    public double d() {
        return (float)this.d / 8.0f;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return (float)this.f / 63.0f;
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }
}
