/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class avd {
    public static synchronized int a(int n) {
        int n2;
        n2 = GL11.glGenLists((int)n);
        if (n2 == 0) {
            \u2603 = GL11.glGetError();
            String string = "No error code reported";
            if (\u2603 != 0) {
                string = GLU.gluErrorString((int)\u2603);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n + ", GL error (" + \u2603 + "): " + string);
        }
        return n2;
    }

    public static synchronized void a(int n, int n2) {
        GL11.glDeleteLists((int)n, (int)n2);
    }

    public static synchronized void b(int n) {
        GL11.glDeleteLists((int)n, (int)1);
    }

    public static synchronized ByteBuffer c(int n) {
        return ByteBuffer.allocateDirect((int)n).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer f(int n) {
        return avd.c(n << 2).asIntBuffer();
    }

    public static FloatBuffer h(int n) {
        return avd.c(n << 2).asFloatBuffer();
    }
}
