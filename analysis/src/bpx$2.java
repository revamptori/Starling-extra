/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLStreamHandler
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

static final class bpx.2
extends URLStreamHandler {
    final /* synthetic */ jy a;

    bpx.2(jy jy2) {
        this.a = jy2;
    }

    protected URLConnection openConnection(URL uRL) {
        return new URLConnection(uRL){

            public void connect() throws IOException {
            }

            public InputStream getInputStream() throws IOException {
                return ave.A().Q().a(a).b();
            }
        };
    }
}
