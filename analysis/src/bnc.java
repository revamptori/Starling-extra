/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Enumeration
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class bnc
extends bmx
implements Closeable {
    public static final Splitter b = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private ZipFile c;

    public bnc(File file) {
        super(file);
    }

    private ZipFile d() throws IOException {
        if (this.c == null) {
            this.c = new ZipFile(this.a);
        }
        return this.c;
    }

    @Override
    protected InputStream a(String string) throws IOException {
        ZipFile zipFile = this.d();
        ZipEntry \u26032 = zipFile.getEntry(string);
        if (\u26032 == null) {
            throw new bnl(this.a, string);
        }
        return zipFile.getInputStream(\u26032);
    }

    @Override
    public boolean b(String string) {
        try {
            return this.d().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public Set<String> c() {
        try {
            ZipFile zipFile = this.d();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration enumeration = zipFile.entries();
        HashSet \u26032 = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry)enumeration.nextElement();
            String \u26033 = zipEntry.getName();
            if (!\u26033.startsWith("assets/") || (\u2603 = Lists.newArrayList((Iterable)b.split((CharSequence)\u26033))).size() <= 1) continue;
            String \u26034 = (String)\u2603.get(1);
            if (!\u26034.equals((Object)\u26034.toLowerCase())) {
                this.c(\u26034);
                continue;
            }
            \u26032.add((Object)\u26034);
        }
        return \u26032;
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

    public void close() throws IOException {
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }
}
