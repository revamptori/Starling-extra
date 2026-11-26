/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.IntBuffer
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  javax.imageio.ImageIO
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class avj {
    private static final Logger a = LogManager.getLogger();
    private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer c;
    private static int[] d;

    public static eu a(File file, int n, int n2, bfw bfw2) {
        return avj.a(file, null, n, n2, bfw2);
    }

    public static eu a(File file, String string, int n22, int n3, bfw bfw2) {
        try {
            int n22;
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            if (bqs.i()) {
                n22 = bfw2.a;
                n3 = bfw2.b;
            }
            \u2603 = n22 * n3;
            if (c == null || c.capacity() < \u2603) {
                c = BufferUtils.createIntBuffer((int)\u2603);
                d = new int[\u2603];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            c.clear();
            if (bqs.i()) {
                bfl.i(bfw2.g);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)c);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)n22, (int)n3, (int)32993, (int)33639, (IntBuffer)c);
            }
            c.get(d);
            bml.a(d, n22, n3);
            BufferedImage \u26032 = null;
            if (bqs.i()) {
                \u26032 = new BufferedImage(bfw2.c, bfw2.d, 1);
                for (\u2603 = \u2603 = bfw2.b - bfw2.d; \u2603 < bfw2.b; ++\u2603) {
                    for (\u2603 = 0; \u2603 < bfw2.c; ++\u2603) {
                        \u26032.setRGB(\u2603, \u2603 - \u2603, d[\u2603 * bfw2.a + \u2603]);
                    }
                }
            } else {
                \u26032 = new BufferedImage(n22, n3, 1);
                \u26032.setRGB(0, 0, n22, n3, d, 0, n22);
            }
            File \u26033 = string == null ? avj.a(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)\u26032, (String)"png", (File)\u26033);
            fa \u26034 = new fa(\u26033.getName());
            \u26034.b().a(new et(et.a.b, \u26033.getAbsolutePath()));
            \u26034.b().d(true);
            return new fb("screenshot.success", \u26034);
        }
        catch (Exception exception) {
            a.warn("Couldn't save screenshot", (Throwable)exception);
            return new fb("screenshot.failure", exception.getMessage());
        }
    }

    /*
     * Exception decompiling
     */
    private static File a(File file) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.util.NoSuchElementException
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:390457)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1662603)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:3853130)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:4117578)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:4117650)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:392514)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1207391)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:937501)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:420409)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}
