/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.awt.Image
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmd
extends bly {
    private static final Logger g = LogManager.getLogger();
    public final List<String> f;

    public bmd(String ... stringArray) {
        this.f = Lists.newArrayList((Object[])stringArray);
    }

    @Override
    public void a(bni bni2) throws IOException {
        this.c();
        BufferedImage bufferedImage = null;
        try {
            for (String string : this.f) {
                if (string == null) continue;
                InputStream inputStream = bni2.a(new jy(string)).b();
                BufferedImage \u26032 = bml.a(inputStream);
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(\u26032.getWidth(), \u26032.getHeight(), 2);
                }
                bufferedImage.getGraphics().drawImage((Image)\u26032, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            g.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        bml.a(this.b(), bufferedImage);
    }
}
