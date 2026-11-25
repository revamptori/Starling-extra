/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.util.concurrent.atomic.AtomicInteger
 *  javax.imageio.ImageIO
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bma
extends bme {
    private static final Logger g = LogManager.getLogger();
    private static final AtomicInteger h = new AtomicInteger(0);
    private final File i;
    private final String j;
    private final bfm k;
    private BufferedImage l;
    private Thread m;
    private boolean n;

    public bma(File file, String string, jy jy2, bfm bfm2) {
        super(jy2);
        this.i = file;
        this.j = string;
        this.k = bfm2;
    }

    private void g() {
        if (this.n) {
            return;
        }
        if (this.l != null) {
            if (this.f != null) {
                this.c();
            }
            bml.a(super.b(), this.l);
            this.n = true;
        }
    }

    @Override
    public int b() {
        this.g();
        return super.b();
    }

    public void a(BufferedImage bufferedImage) {
        this.l = bufferedImage;
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override
    public void a(bni bni2) throws IOException {
        if (this.l == null && this.f != null) {
            super.a(bni2);
        }
        if (this.m == null) {
            if (this.i != null && this.i.isFile()) {
                g.debug("Loading http texture from local cache ({})", new Object[]{this.i});
                try {
                    this.l = ImageIO.read((File)this.i);
                    if (this.k != null) {
                        this.a(this.k.a(this.l));
                    }
                }
                catch (IOException iOException) {
                    g.error("Couldn't load skin " + this.i, (Throwable)iOException);
                    this.d();
                }
            } else {
                this.d();
            }
        }
    }

    protected void d() {
        this.m = new Thread("Texture Downloader #" + h.incrementAndGet()){

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
        };
        this.m.setDaemon(true);
        this.m.start();
    }
}
