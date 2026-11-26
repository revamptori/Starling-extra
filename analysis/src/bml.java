/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.IntBuffer
 *  javax.imageio.ImageIO
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bml {
    private static final Logger c = LogManager.getLogger();
    private static final IntBuffer d = avd.f(0x400000);
    public static final blz a = new blz(16, 16);
    public static final int[] b = a.e();
    private static final int[] e;

    public static int a() {
        return bfl.y();
    }

    public static void a(int n2) {
        bfl.h(n2);
    }

    public static int a(int n2, BufferedImage bufferedImage) {
        return bml.a(n2, bufferedImage, false, false);
    }

    public static void a(int n2, int[] nArray, int n3, int n4) {
        bml.b(n2);
        bml.a(0, nArray, n3, n4, 0, 0, false, false, false);
    }

    public static int[][] a(int n2, int n3, int[][] nArray) {
        int[][] nArrayArray = new int[n2 + 1][];
        nArrayArray[0] = nArray[0];
        if (n2 > 0) {
            int n4;
            boolean bl = false;
            for (n4 = 0; n4 < nArray.length; ++n4) {
                if (nArray[0][n4] >> 24 != 0) continue;
                bl = true;
                break;
            }
            for (n4 = 1; n4 <= n2; ++n4) {
                int[] nArray2;
                if (nArray[n4] != null) {
                    nArrayArray[n4] = nArray[n4];
                    continue;
                }
                int[] nArray3 = nArrayArray[n4 - 1];
                nArray2 = new int[nArray3.length >> 2];
                int \u26032 = n3 >> n4;
                int \u26033 = nArray2.length / \u26032;
                int \u26034 = \u26032 << 1;
                for (int i2 = 0; i2 < \u26032; ++i2) {
                    for (\u2603 = 0; \u2603 < \u26033; ++\u2603) {
                        \u2603 = 2 * (i2 + \u2603 * \u26034);
                        nArray2[i2 + \u2603 * \u26032] = bml.a(nArray3[\u2603 + 0], nArray3[\u2603 + 1], nArray3[\u2603 + 0 + \u26034], nArray3[\u2603 + 1 + \u26034], bl);
                    }
                }
                nArrayArray[n4] = nArray2;
            }
        }
        return nArrayArray;
    }

    private static int a(int n22, int n3, int n4, int n5, boolean bl) {
        int n22;
        if (!bl) {
            int n6 = bml.a(n22, n3, n4, n5, 24);
            \u2603 = bml.a(n22, n3, n4, n5, 16);
            \u2603 = bml.a(n22, n3, n4, n5, 8);
            \u2603 = bml.a(n22, n3, n4, n5, 0);
            return n6 << 24 | \u2603 << 16 | \u2603 << 8 | \u2603;
        }
        bml.e[0] = n22;
        bml.e[1] = n3;
        bml.e[2] = n4;
        bml.e[3] = n5;
        float \u26032 = 0.0f;
        float \u26033 = 0.0f;
        float \u26034 = 0.0f;
        float \u26035 = 0.0f;
        for (\u2603 = 0; \u2603 < 4; ++\u2603) {
            if (e[\u2603] >> 24 == 0) continue;
            \u26032 += (float)Math.pow((double)((float)(e[\u2603] >> 24 & 0xFF) / 255.0f), (double)2.2);
            \u26033 += (float)Math.pow((double)((float)(e[\u2603] >> 16 & 0xFF) / 255.0f), (double)2.2);
            \u26034 += (float)Math.pow((double)((float)(e[\u2603] >> 8 & 0xFF) / 255.0f), (double)2.2);
            \u26035 += (float)Math.pow((double)((float)(e[\u2603] >> 0 & 0xFF) / 255.0f), (double)2.2);
        }
        \u2603 = (int)(Math.pow((double)(\u26032 /= 4.0f), (double)0.45454545454545453) * 255.0);
        \u2603 = (int)(Math.pow((double)(\u26033 /= 4.0f), (double)0.45454545454545453) * 255.0);
        \u2603 = (int)(Math.pow((double)(\u26034 /= 4.0f), (double)0.45454545454545453) * 255.0);
        \u2603 = (int)(Math.pow((double)(\u26035 /= 4.0f), (double)0.45454545454545453) * 255.0);
        if (\u2603 < 96) {
            \u2603 = 0;
        }
        return \u2603 << 24 | \u2603 << 16 | \u2603 << 8 | \u2603;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        float f2 = (float)Math.pow((double)((float)(n2 >> n6 & 0xFF) / 255.0f), (double)2.2);
        \u2603 = (float)Math.pow((double)((float)(n3 >> n6 & 0xFF) / 255.0f), (double)2.2);
        \u2603 = (float)Math.pow((double)((float)(n4 >> n6 & 0xFF) / 255.0f), (double)2.2);
        \u2603 = (float)Math.pow((double)((float)(n5 >> n6 & 0xFF) / 255.0f), (double)2.2);
        \u2603 = (float)Math.pow((double)((double)(f2 + \u2603 + \u2603 + \u2603) * 0.25), (double)0.45454545454545453);
        return (int)((double)\u2603 * 255.0);
    }

    public static void a(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            bml.a(i2, nArray2, n2 >> i2, n3 >> i2, n4 >> i2, n5 >> i2, bl, bl2, nArray.length > 1);
        }
    }

    private static void a(int n2, int[] nArray, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        int n7 = 0x400000 / n3;
        bml.a(bl, bl3);
        bml.a(bl2);
        for (\u2603 = 0; \u2603 < n3 * n4; \u2603 += n3 * \u2603) {
            \u2603 = \u2603 / n3;
            \u2603 = Math.min((int)n7, (int)(n4 - \u2603));
            \u2603 = n3 * \u2603;
            bml.b(nArray, \u2603, \u2603);
            GL11.glTexSubImage2D((int)3553, (int)n2, (int)n5, (int)(n6 + \u2603), (int)n3, (int)\u2603, (int)32993, (int)33639, (IntBuffer)d);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        bml.a(n2, bufferedImage.getWidth(), bufferedImage.getHeight());
        return bml.a(n2, bufferedImage, 0, 0, bl, bl2);
    }

    public static void a(int n2, int n3, int n4) {
        bml.a(n2, 0, n3, n4);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        bml.a(n2);
        bml.b(n2);
        if (n3 >= 0) {
            GL11.glTexParameteri((int)3553, (int)33085, (int)n3);
            GL11.glTexParameterf((int)3553, (int)33082, (float)0.0f);
            GL11.glTexParameterf((int)3553, (int)33083, (float)n3);
            GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
        }
        for (\u2603 = 0; \u2603 <= n3; ++\u2603) {
            GL11.glTexImage2D((int)3553, (int)\u2603, (int)6408, (int)(n4 >> \u2603), (int)(n5 >> \u2603), (int)0, (int)32993, (int)33639, (IntBuffer)null);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl, boolean bl2) {
        bml.b(n2);
        bml.a(bufferedImage, n3, n4, bl, bl2);
        return n2;
    }

    private static void a(BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        int n4 = bufferedImage.getWidth();
        \u2603 = bufferedImage.getHeight();
        \u2603 = 0x400000 / n4;
        int[] \u26032 = new int[\u2603 * n4];
        bml.b(bl);
        bml.a(bl2);
        for (\u2603 = 0; \u2603 < n4 * \u2603; \u2603 += n4 * \u2603) {
            \u2603 = \u2603 / n4;
            \u2603 = Math.min((int)\u2603, (int)(\u2603 - \u2603));
            \u2603 = n4 * \u2603;
            bufferedImage.getRGB(0, \u2603, n4, \u2603, \u26032, 0, n4);
            bml.a(\u26032, \u2603);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n2, (int)(n3 + \u2603), (int)n4, (int)\u2603, (int)32993, (int)33639, (IntBuffer)d);
        }
    }

    private static void a(boolean bl) {
        if (bl) {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        } else {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        }
    }

    private static void b(boolean bl) {
        bml.a(bl, false);
    }

    private static void a(boolean bl, boolean bl2) {
        if (bl) {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl2 ? 9987 : 9729));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        } else {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl2 ? 9986 : 9728));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        }
    }

    private static void a(int[] nArray, int n2) {
        bml.b(nArray, 0, n2);
    }

    private static void b(int[] nArray, int n2, int n3) {
        int[] nArray2 = nArray;
        if (ave.A().t.e) {
            nArray2 = bml.a(nArray);
        }
        d.clear();
        d.put(nArray2, n2, n3);
        d.position(0).limit(n3);
    }

    static void b(int n2) {
        bfl.i(n2);
    }

    public static int[] a(bni bni2, jy jy2) throws IOException {
        BufferedImage bufferedImage = bml.a(bni2.a(jy2).b());
        int \u26032 = bufferedImage.getWidth();
        int \u26033 = bufferedImage.getHeight();
        int[] \u26034 = new int[\u26032 * \u26033];
        bufferedImage.getRGB(0, 0, \u26032, \u26033, \u26034, 0, \u26032);
        return \u26034;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BufferedImage a(InputStream inputStream) throws IOException {
        try {
            BufferedImage bufferedImage = ImageIO.read((InputStream)inputStream);
            return bufferedImage;
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    public static int[] a(int[] nArray) {
        int[] nArray2;
        nArray2 = new int[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray2[i2] = bml.c(nArray[i2]);
        }
        return nArray2;
    }

    public static int c(int n2) {
        \u2603 = n2 >> 24 & 0xFF;
        \u2603 = n2 >> 16 & 0xFF;
        \u2603 = n2 >> 8 & 0xFF;
        \u2603 = n2 & 0xFF;
        \u2603 = (\u2603 * 30 + \u2603 * 59 + \u2603 * 11) / 100;
        \u2603 = (\u2603 * 30 + \u2603 * 70) / 100;
        \u2603 = (\u2603 * 30 + \u2603 * 70) / 100;
        return \u2603 << 24 | \u2603 << 16 | \u2603 << 8 | \u2603;
    }

    public static void a(int[] nArray, int n2, int n3) {
        int[] nArray2 = new int[n2];
        int \u26032 = n3 / 2;
        for (int i2 = 0; i2 < \u26032; ++i2) {
            System.arraycopy((Object)nArray, (int)(i2 * n2), (Object)nArray2, (int)0, (int)n2);
            System.arraycopy((Object)nArray, (int)((n3 - 1 - i2) * n2), (Object)nArray, (int)(i2 * n2), (int)n2);
            System.arraycopy((Object)nArray2, (int)0, (Object)nArray, (int)((n3 - 1 - i2) * n2), (int)n2);
        }
    }

    static {
        int n2 = -16777216;
        \u2603 = -524040;
        int[] \u26032 = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] \u26033 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        \u2603 = \u26032.length;
        for (\u2603 = 0; \u2603 < 16; ++\u2603) {
            System.arraycopy((Object)(\u2603 < \u2603 ? \u26032 : \u26033), (int)0, (Object)b, (int)(16 * \u2603), (int)\u2603);
            System.arraycopy((Object)(\u2603 < \u2603 ? \u26033 : \u26032), (int)0, (Object)b, (int)(16 * \u2603 + \u2603), (int)\u2603);
        }
        a.d();
        e = new int[4];
    }
}
