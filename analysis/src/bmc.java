/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.Graphics
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmc
extends bly {
    private static final Logger f = LogManager.getLogger();
    private final jy g;
    private final List<String> h;
    private final List<zd> i;

    public bmc(jy jy2, List<String> list, List<zd> list2) {
        this.g = jy2;
        this.h = list;
        this.i = list2;
    }

    @Override
    public void a(bni bni2) throws IOException {
        this.c();
        try {
            BufferedImage bufferedImage = bml.a(bni2.a(this.g).b());
            int \u26032 = bufferedImage.getType();
            if (\u26032 == 0) {
                \u26032 = 6;
            }
            bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), \u26032);
            Graphics \u26033 = bufferedImage2.getGraphics();
            \u26033.drawImage((Image)bufferedImage, 0, 0, null);
            for (int i = 0; i < 17 && i < this.h.size() && i < this.i.size(); ++i) {
                BufferedImage bufferedImage2;
                String string = (String)this.h.get(i);
                arn \u26034 = ((zd)this.i.get(i)).e();
                if (string == null || (\u2603 = bml.a(\u2603 = bni2.a(new jy(string)).b())).getWidth() != bufferedImage2.getWidth() || \u2603.getHeight() != bufferedImage2.getHeight() || \u2603.getType() != 6) continue;
                for (int j = 0; j < \u2603.getHeight(); ++j) {
                    for (\u2603 = 0; \u2603 < \u2603.getWidth(); ++\u2603) {
                        \u2603 = \u2603.getRGB(\u2603, j);
                        if ((\u2603 & 0xFF000000) == 0) continue;
                        \u2603 = (\u2603 & 0xFF0000) << 8 & 0xFF000000;
                        \u2603 = bufferedImage.getRGB(\u2603, j);
                        \u2603 = ns.d(\u2603, \u26034.L) & 0xFFFFFF;
                        \u2603.setRGB(\u2603, j, \u2603 | \u2603);
                    }
                }
                bufferedImage2.getGraphics().drawImage((Image)\u2603, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            f.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        bml.a(this.b(), bufferedImage2);
    }
}
