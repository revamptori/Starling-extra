/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  org.apache.commons.io.IOUtils
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class bnm.a {
    private final File b;
    private bnk c;
    private boj d;
    private BufferedImage e;
    private jy f;

    private bnm.a(File file) {
        this.b = file;
    }

    public void a() throws IOException {
        this.c = this.b.isDirectory() ? new bnd(this.b) : new bnc(this.b);
        this.d = (boj)this.c.a(bnm.this.b, "pack");
        try {
            this.e = this.c.a();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (this.e == null) {
            this.e = bnm.this.a.a();
        }
        this.b();
    }

    public void a(bmj bmj2) {
        if (this.f == null) {
            this.f = bmj2.a("texturepackicon", new blz(this.e));
        }
        bmj2.a(this.f);
    }

    public void b() {
        if (this.c instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Closeable)this.c));
        }
    }

    public bnk c() {
        return this.c;
    }

    public String d() {
        return this.c.b();
    }

    public String e() {
        return this.d == null ? (Object)((Object)a.m) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.d.a().d();
    }

    public int f() {
        return this.d.b();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bnm.a) {
            return this.toString().equals((Object)object.toString());
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format((String)"%s:%s:%d", (Object[])new Object[]{this.b.getName(), this.b.isDirectory() ? "folder" : "zip", this.b.lastModified()});
    }
}
