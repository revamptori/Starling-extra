/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.io.DataInputStream
 *  java.io.DataOutput
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class aua {
    private atp b;
    protected Map<String, ate> a = Maps.newHashMap();
    private List<ate> c = Lists.newArrayList();
    private Map<String, Short> d = Maps.newHashMap();

    public aua(atp atp2) {
        this.b = atp2;
        this.b();
    }

    public ate a(Class<? extends ate> clazz, String string) {
        ate ate2;
        block7: {
            ate2 = (ate)this.a.get((Object)string);
            if (ate2 != null) {
                return ate2;
            }
            if (this.b != null) {
                try {
                    File file = this.b.a(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        ate2 = (ate)clazz.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string});
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + clazz.toString(), (Throwable)exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    dn \u26032 = dx.a((InputStream)fileInputStream);
                    fileInputStream.close();
                    ate2.a(\u26032.m("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (ate2 != null) {
            this.a.put((Object)string, (Object)ate2);
            this.c.add((Object)ate2);
        }
        return ate2;
    }

    public void a(String string, ate ate2) {
        if (this.a.containsKey((Object)string)) {
            this.c.remove(this.a.remove((Object)string));
        }
        this.a.put((Object)string, (Object)ate2);
        this.c.add((Object)ate2);
    }

    public void a() {
        for (int i = 0; i < this.c.size(); ++i) {
            ate ate2 = (ate)this.c.get(i);
            if (!ate2.d()) continue;
            this.a(ate2);
            ate2.a(false);
        }
    }

    private void a(ate ate2) {
        if (this.b == null) {
            return;
        }
        try {
            File file = this.b.a(ate2.a);
            if (file != null) {
                dn dn2 = new dn();
                ate2.b(dn2);
                \u2603 = new dn();
                \u2603.a("data", dn2);
                FileOutputStream \u26032 = new FileOutputStream(file);
                dx.a(\u2603, (OutputStream)\u26032);
                \u26032.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void b() {
        try {
            this.d.clear();
            if (this.b == null) {
                return;
            }
            File file = this.b.a("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream((InputStream)new FileInputStream(file));
                dn \u26032 = dx.a(dataInputStream);
                dataInputStream.close();
                for (String string : \u26032.c()) {
                    eb eb2 = \u26032.a(string);
                    if (!(eb2 instanceof dz)) continue;
                    dz \u26033 = (dz)eb2;
                    String \u26034 = string;
                    short \u26035 = \u26033.e();
                    this.d.put((Object)\u26034, (Object)\u26035);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int a(String string) {
        Short s = (Short)this.d.get((Object)string);
        if (s == null) {
            s = 0;
        } else {
            Short s2 = s;
            Short s3 = s = Short.valueOf((short)((short)(s + 1)));
        }
        this.d.put((Object)string, (Object)s);
        if (this.b == null) {
            return s.shortValue();
        }
        try {
            File file = this.b.a("idcounts");
            if (file != null) {
                dn dn2 = new dn();
                for (String string2 : this.d.keySet()) {
                    short s4 = (Short)this.d.get((Object)string2);
                    dn2.a(string2, s4);
                }
                Iterator \u26032 = new DataOutputStream((OutputStream)new FileOutputStream(file));
                dx.a(dn2, (DataOutput)\u26032);
                \u26032.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s.shortValue();
    }
}
