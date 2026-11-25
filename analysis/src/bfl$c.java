/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

static class bfl.c {
    private final int a;
    private boolean b = false;

    public bfl.c(int n) {
        this.a = n;
    }

    public void a() {
        this.a(false);
    }

    public void b() {
        this.a(true);
    }

    public void a(boolean bl) {
        if (bl != this.b) {
            this.b = bl;
            if (bl) {
                GL11.glEnable((int)this.a);
            } else {
                GL11.glDisable((int)this.a);
            }
        }
    }
}
