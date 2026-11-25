/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

static class bnb.a
extends InputStream {
    private final InputStream a;
    private final String b;
    private boolean c = false;

    public bnb.a(InputStream inputStream, jy jy2, String string) {
        this.a = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream((OutputStream)byteArrayOutputStream));
        this.b = "Leaked resource: '" + jy2 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream.toString();
    }

    public void close() throws IOException {
        this.a.close();
        this.c = true;
    }

    protected void finalize() throws Throwable {
        if (!this.c) {
            b.warn(this.b);
        }
        super.finalize();
    }

    public int read() throws IOException {
        return this.a.read();
    }
}
