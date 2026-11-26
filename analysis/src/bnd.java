/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  java.io.BufferedInputStream
 *  java.io.File
 *  java.io.FileFilter
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Set
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class bnd
extends bmx {
    public bnd(File file) {
        super(file);
    }

    @Override
    protected InputStream a(String string) throws IOException {
        return new BufferedInputStream((InputStream)new FileInputStream(new File(this.a, string)));
    }

    @Override
    protected boolean b(String string) {
        return new File(this.a, string).isFile();
    }

    @Override
    public Set<String> c() {
        HashSet hashSet = Sets.newHashSet();
        File \u26032 = new File(this.a, "assets/");
        if (\u26032.isDirectory()) {
            for (File file : \u26032.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string = bnd.a(\u26032, file);
                if (!string.equals((Object)string.toLowerCase())) {
                    this.c(string);
                    continue;
                }
                hashSet.add((Object)string.substring(0, string.length() - 1));
            }
        }
        return hashSet;
    }
}
