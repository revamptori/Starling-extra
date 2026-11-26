/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileFilter
 *  java.lang.Object
 */
import java.io.File;
import java.io.FileFilter;

static final class bnm.1
implements FileFilter {
    bnm.1() {
    }

    public boolean accept(File file) {
        boolean bl = file.isFile() && file.getName().endsWith(".zip");
        \u2603 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl || \u2603;
    }
}
