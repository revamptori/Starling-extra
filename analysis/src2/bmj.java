/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.Callable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmj
implements bmm,
bnj {
    private static final Logger a = LogManager.getLogger();
    private final Map<jy, bmk> b = Maps.newHashMap();
    private final List<bmm> c = Lists.newArrayList();
    private final Map<String, Integer> d = Maps.newHashMap();
    private bni e;

    public bmj(bni bni2) {
        this.e = bni2;
    }

    public void a(jy jy2) {
        bmk bmk2 = (bmk)this.b.get((Object)jy2);
        if (bmk2 == null) {
            bmk2 = new bme(jy2);
            this.a(jy2, bmk2);
        }
        bml.b(bmk2.b());
    }

    public boolean a(jy jy2, bmn bmn2) {
        if (this.a(jy2, (bmk)bmn2)) {
            this.c.add((Object)bmn2);
            return true;
        }
        return false;
    }

    public boolean a(jy jy2, bmk bmk22) {
        boolean \u26033 = true;
        try {
            bmk22.a(this.e);
        }
        catch (IOException \u26032) {
            a.warn("Failed to load texture: " + jy2, (Throwable)\u26032);
            bmk bmk22 = bml.a;
            this.b.put((Object)jy2, (Object)bmk22);
            \u26033 = false;
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Registering texture");
            c \u26034 = b2.a("Resource location being registered");
            final bmk \u26035 = bmk22;
            \u26034.a("Resource location", jy2);
            \u26034.a("Texture object class", new Callable<String>(){

                public String a() throws Exception {
                    return \u26035.getClass().getName();
                }

                public /* synthetic */ Object call() throws Exception {
                    return this.a();
                }
            });
            throw new e(b2);
        }
        this.b.put((Object)jy2, (Object)bmk22);
        return \u26033;
    }

    public bmk b(jy jy2) {
        return (bmk)this.b.get((Object)jy2);
    }

    public jy a(String string, blz blz2) {
        Integer n = (Integer)this.d.get((Object)string);
        if (n == null) {
            n = 1;
        } else {
            Integer n2 = n;
            Integer n3 = n = Integer.valueOf((int)(n + 1));
        }
        this.d.put((Object)string, (Object)n);
        jy \u26032 = new jy(String.format((String)"dynamic/%s_%d", (Object[])new Object[]{string, n}));
        this.a(\u26032, (bmk)blz2);
        return \u26032;
    }

    @Override
    public void e() {
        for (bmm bmm2 : this.c) {
            bmm2.e();
        }
    }

    public void c(jy jy2) {
        bmk bmk2 = this.b(jy2);
        if (bmk2 != null) {
            bml.a(bmk2.b());
        }
    }

    @Override
    public void a(bni bni2) {
        for (Map.Entry entry : this.b.entrySet()) {
            this.a((jy)entry.getKey(), (bmk)entry.getValue());
        }
    }
}
