/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  javax.imageio.ImageIO
 *  org.apache.commons.io.FileUtils
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

class bma.1
extends Thread {
    bma.1(String string) {
        super(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        HttpURLConnection httpURLConnection = null;
        g.debug("Downloading http texture from {} to {}", new Object[]{bma.this.j, bma.this.i});
        try {
            BufferedImage \u26032;
            httpURLConnection = (HttpURLConnection)new URL(bma.this.j).openConnection(ave.A().O());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                return;
            }
            if (bma.this.i != null) {
                FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)bma.this.i);
                \u26032 = ImageIO.read((File)bma.this.i);
            } else {
                \u26032 = bml.a(httpURLConnection.getInputStream());
            }
            if (bma.this.k != null) {
                \u26032 = bma.this.k.a(\u26032);
            }
            bma.this.a(\u26032);
        }
        catch (Exception exception) {
            g.error("Couldn't download http texture", (Throwable)exception);
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}
