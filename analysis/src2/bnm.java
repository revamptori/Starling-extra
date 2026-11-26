/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.hash.Hashing
 *  com.google.common.io.Files
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 *  java.awt.image.BufferedImage
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileFilter
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.locks.ReentrantLock
 *  org.apache.commons.io.FileUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.io.comparator.LastModifiedFileComparator
 *  org.apache.commons.io.filefilter.IOFileFilter
 *  org.apache.commons.io.filefilter.TrueFileFilter
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnm {
    private static final Logger c = LogManager.getLogger();
    private static final FileFilter d = new FileFilter(){

        public boolean accept(File file) {
            boolean bl = file.isFile() && file.getName().endsWith(".zip");
            \u2603 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
            return bl || \u2603;
        }
    };
    private final File e;
    public final bnk a;
    private final File f;
    public final bny b;
    private bnk g;
    private final ReentrantLock h = new ReentrantLock();
    private ListenableFuture<Object> i;
    private List<a> j = Lists.newArrayList();
    private List<a> k = Lists.newArrayList();

    public bnm(File file, File file2, bnk bnk2, bny bny2, avh avh2) {
        this.e = file;
        this.f = file2;
        this.a = bnk2;
        this.b = bny2;
        this.g();
        this.a();
        Iterator iterator = avh2.k.iterator();
        block0: while (iterator.hasNext()) {
            String string = (String)iterator.next();
            for (a a2 : this.j) {
                if (!a2.d().equals((Object)string)) continue;
                if (a2.f() == 1 || avh2.l.contains((Object)a2.d())) {
                    this.k.add((Object)a2);
                    continue block0;
                }
                iterator.remove();
                c.warn("Removed selected resource pack {} because it's no longer compatible", new Object[]{a2.d()});
            }
        }
    }

    private void g() {
        if (this.e.exists()) {
            if (!(this.e.isDirectory() || this.e.delete() && this.e.mkdirs())) {
                c.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + this.e);
            }
        } else if (!this.e.mkdirs()) {
            c.warn("Unable to create resourcepack folder: " + this.e);
        }
    }

    private List<File> h() {
        if (this.e.isDirectory()) {
            return Arrays.asList((Object[])this.e.listFiles(d));
        }
        return Collections.emptyList();
    }

    public void a() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.h()) {
            a a2 = new a((File)object);
            if (!this.j.contains((Object)a2)) {
                try {
                    a2.a();
                    arrayList.add((Object)a2);
                }
                catch (Exception exception) {
                    arrayList.remove((Object)a2);
                }
                continue;
            }
            int \u26032 = this.j.indexOf((Object)a2);
            if (\u26032 <= -1 || \u26032 >= this.j.size()) continue;
            arrayList.add(this.j.get(\u26032));
        }
        this.j.removeAll((Collection)arrayList);
        for (Object object : this.j) {
            ((a)object).b();
        }
        this.j = arrayList;
    }

    public List<a> b() {
        return ImmutableList.copyOf(this.j);
    }

    public List<a> c() {
        return ImmutableList.copyOf(this.k);
    }

    public void a(List<a> list) {
        this.k.clear();
        this.k.addAll(list);
    }

    public File d() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> a(String string, String string2) {
        \u2603 = string2.matches("^[a-f0-9]{40}$") ? string2 : "legacy";
        final File file = new File(this.f, \u2603);
        this.h.lock();
        try {
            Object object;
            this.f();
            if (file.exists() && string2.length() == 40) {
                block8: {
                    object = Hashing.sha1().hashBytes(Files.toByteArray((File)file)).toString();
                    if (!object.equals((Object)string2)) break block8;
                    ListenableFuture<Object> listenableFuture = this.a(file);
                    return listenableFuture;
                }
                try {
                    c.warn("File " + file + " had wrong hash (expected " + string2 + ", found " + (String)object + "). Deleting it.");
                    FileUtils.deleteQuietly((File)file);
                }
                catch (IOException iOException) {
                    c.warn("File " + file + " couldn't be hashed. Deleting it.", (Throwable)iOException);
                    FileUtils.deleteQuietly((File)file);
                }
            }
            this.i();
            object = new axr();
            Map<String, String> \u26032 = ave.ak();
            final ave \u26033 = ave.A();
            Futures.getUnchecked(\u26033.a(new Runnable((axr)object){
                final /* synthetic */ axr b;
                {
                    this.b = axr2;
                }

                public void run() {
                    \u26033.a(this.b);
                }
            }));
            final SettableFuture \u26034 = SettableFuture.create();
            this.i = nj.a(file, string, \u26032, 0x3200000, (nu)object, \u26033.O());
            Futures.addCallback(this.i, (FutureCallback)new FutureCallback<Object>(){

                public void onSuccess(Object object) {
                    bnm.this.a(file);
                    \u26034.set(null);
                }

                public void onFailure(Throwable throwable) {
                    \u26034.setException(throwable);
                }
            });
            ListenableFuture<Object> listenableFuture = this.i;
            return listenableFuture;
        }
        finally {
            this.h.unlock();
        }
    }

    private void i() {
        ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles((File)this.f, (IOFileFilter)TrueFileFilter.TRUE, null));
        Collections.sort((List)arrayList, (Comparator)LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int \u26032 = 0;
        for (File file : arrayList) {
            if (\u26032++ < 10) continue;
            c.info("Deleting old server resource pack " + file.getName());
            FileUtils.deleteQuietly((File)file);
        }
    }

    public ListenableFuture<Object> a(File file) {
        this.g = new bnc(file);
        return ave.A().B();
    }

    public bnk e() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        this.h.lock();
        try {
            if (this.i != null) {
                this.i.cancel(true);
            }
            this.i = null;
            if (this.g != null) {
                this.g = null;
                ave.A().B();
            }
        }
        finally {
            this.h.unlock();
        }
    }

    public class a {
        private final File b;
        private bnk c;
        private boj d;
        private BufferedImage e;
        private jy f;

        private a(File file) {
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
            if (object instanceof a) {
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
}
