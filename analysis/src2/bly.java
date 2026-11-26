/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public abstract class bly
implements bmk {
    protected int a = -1;
    protected boolean b;
    protected boolean c;
    protected boolean d;
    protected boolean e;

    public void a(boolean bl, boolean bl2) {
        this.b = bl;
        this.c = bl2;
        int n = -1;
        \u2603 = -1;
        if (bl) {
            n = bl2 ? 9987 : 9729;
            \u2603 = 9729;
        } else {
            n = bl2 ? 9986 : 9728;
            \u2603 = 9728;
        }
        GL11.glTexParameteri((int)3553, (int)10241, (int)n);
        GL11.glTexParameteri((int)3553, (int)10240, (int)\u2603);
    }

    @Override
    public void b(boolean bl, boolean bl2) {
        this.d = this.b;
        this.e = this.c;
        this.a(bl, bl2);
    }

    @Override
    public void a() {
        this.a(this.d, this.e);
    }

    @Override
    public int b() {
        if (this.a == -1) {
            this.a = bml.a();
        }
        return this.a;
    }

    public void c() {
        if (this.a != -1) {
            bml.a(this.a);
            this.a = -1;
        }
    }
}
