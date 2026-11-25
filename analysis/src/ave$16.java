/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 *  org.lwjgl.opengl.GL11
 */
import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

class ave.16
implements Callable<String> {
    ave.16() {
    }

    public String a() {
        return GL11.glGetString((int)7937) + " GL version " + GL11.glGetString((int)7938) + ", " + GL11.glGetString((int)7936);
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
