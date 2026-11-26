/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 */
import java.io.File;
import java.io.FilenameFilter;

class atk.1
implements FilenameFilter {
    atk.1() {
    }

    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}
