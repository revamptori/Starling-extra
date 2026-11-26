/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bft
extends bfh {
    @Override
    public void a(adf adf2) {
        if (!this.b) {
            return;
        }
        for (bht bht2 : this.a) {
            bhs bhs2 = (bhs)bht2;
            bfl.E();
            this.a(bht2);
            GL11.glCallList((int)bhs2.a(adf2, bhs2.g()));
            bfl.F();
        }
        bfl.G();
        this.a.clear();
    }
}
