/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.lang.Object
 *  java.lang.String
 */
import java.io.File;
import java.io.FileNotFoundException;

public class bnl
extends FileNotFoundException {
    public bnl(File file, String string) {
        super(String.format((String)"'%s' in ResourcePack '%s'", (Object[])new Object[]{string, file}));
    }
}
