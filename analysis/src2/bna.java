/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  java.awt.image.BufferedImage
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 */
import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

public class bna
implements bnk {
    public static final Set<String> a = ImmutableSet.of((Object)"minecraft", (Object)"realms");
    private final Map<String, File> b;

    public bna(Map<String, File> map) {
        this.b = map;
    }

    @Override
    public InputStream a(jy jy2) throws IOException {
        InputStream inputStream = this.d(jy2);
        if (inputStream != null) {
            return inputStream;
        }
        \u2603 = this.c(jy2);
        if (\u2603 != null) {
            return \u2603;
        }
        throw new FileNotFoundException(jy2.a());
    }

    public InputStream c(jy jy2) throws FileNotFoundException {
        File file = (File)this.b.get((Object)jy2.toString());
        return file == null || !file.isFile() ? null : new FileInputStream(file);
    }

    private InputStream d(jy jy2) {
        return bna.class.getResourceAsStream("/assets/" + jy2.b() + "/" + jy2.a());
    }

    @Override
    public boolean b(jy jy2) {
        return this.d(jy2) != null || this.b.containsKey((Object)jy2.toString());
    }

    @Override
    public Set<String> c() {
        return a;
    }

    @Override
    public <T extends bnw> T a(bny bny2, String string) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream((File)this.b.get((Object)"pack.mcmeta"));
            return bmx.a(bny2, (InputStream)fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage a() throws IOException {
        return bml.a(bna.class.getResourceAsStream("/" + new jy("pack.png").a()));
    }

    @Override
    public String b() {
        return "Default";
    }
}
