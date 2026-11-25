/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bfy
extends bfh {
    @Override
    public void a(adf adf2) {
        if (!this.b) {
            return;
        }
        for (bht bht2 : this.a) {
            bmt bmt2 = bht2.b(adf2.ordinal());
            bfl.E();
            this.a(bht2);
            bht2.f();
            bmt2.a();
            this.a();
            bmt2.a(7);
            bfl.F();
        }
        bqs.g(bqs.R, 0);
        bfl.G();
        this.a.clear();
    }

    private void a() {
        GL11.glVertexPointer((int)3, (int)5126, (int)28, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)28, (long)12L);
        GL11.glTexCoordPointer((int)2, (int)5126, (int)28, (long)16L);
        bqs.l(bqs.r);
        GL11.glTexCoordPointer((int)2, (int)5122, (int)28, (long)24L);
        bqs.l(bqs.q);
    }
}
