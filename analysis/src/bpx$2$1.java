/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.net.URL
 *  java.net.URLConnection
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class bpx.1
extends URLConnection {
    bpx.1(URL uRL) {
        super(uRL);
    }

    public void connect() throws IOException {
    }

    public InputStream getInputStream() throws IOException {
        return ave.A().Q().a(a).b();
    }
}
