/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class atn
implements atr {
    private static final Logger b = LogManager.getLogger();
    protected final File a;

    public atn(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.a = file;
    }

    @Override
    public String a() {
        return "Old Format";
    }

    @Override
    public List<ats> b() throws atq {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 5; ++i) {
            String string = "World" + (i + 1);
            ato \u26032 = this.c(string);
            if (\u26032 == null) continue;
            arrayList.add((Object)new ats(string, "", \u26032.m(), \u26032.h(), \u26032.r(), false, \u26032.t(), \u26032.v()));
        }
        return arrayList;
    }

    @Override
    public void d() {
    }

    @Override
    public ato c(String string) {
        File file;
        File file2 = new File(this.a, string);
        if (!file2.exists()) {
            return null;
        }
        file = new File(file2, "level.dat");
        if (file.exists()) {
            try {
                dn dn2 = dx.a((InputStream)new FileInputStream(file));
                \u2603 = dn2.m("Data");
                return new ato(\u2603);
            }
            catch (Exception exception) {
                b.error("Exception reading " + file, (Throwable)exception);
            }
        }
        if ((file = new File(file2, "level.dat_old")).exists()) {
            try {
                dn dn3 = dx.a((InputStream)new FileInputStream(file));
                \u2603 = dn3.m("Data");
                return new ato(\u2603);
            }
            catch (Exception exception) {
                b.error("Exception reading " + file, (Throwable)exception);
            }
        }
        return null;
    }

    @Override
    public void a(String string, String string2) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return;
        }
        \u2603 = new File(file, "level.dat");
        if (\u2603.exists()) {
            try {
                dn dn2 = dx.a((InputStream)new FileInputStream(\u2603));
                \u2603 = dn2.m("Data");
                \u2603.a("LevelName", string2);
                dx.a(dn2, (OutputStream)new FileOutputStream(\u2603));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean d(String string) {
        File file = new File(this.a, string);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
        }
        catch (Throwable \u26032) {
            b.warn("Couldn't make new level", \u26032);
            return false;
        }
        return true;
    }

    @Override
    public boolean e(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return true;
        }
        b.info("Deleting level " + string);
        for (int i = 1; i <= 5; ++i) {
            b.info("Attempt " + i + "...");
            if (atn.a(file.listFiles())) break;
            b.warn("Unsuccessful in deleting contents.");
            if (i >= 5) continue;
            try {
                Thread.sleep((long)500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    protected static boolean a(File[] fileArray) {
        for (int i = 0; i < fileArray.length; ++i) {
            File file = fileArray[i];
            b.debug("Deleting " + file);
            if (file.isDirectory() && !atn.a(file.listFiles())) {
                b.warn("Couldn't delete directory " + file);
                return false;
            }
            if (file.delete()) continue;
            b.warn("Couldn't delete file " + file);
            return false;
        }
        return true;
    }

    @Override
    public atp a(String string, boolean bl) {
        return new atm(this.a, string, bl);
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public boolean b(String string) {
        return false;
    }

    @Override
    public boolean a(String string, nu nu2) {
        return false;
    }

    @Override
    public boolean f(String string) {
        File file = new File(this.a, string);
        return file.isDirectory();
    }
}
