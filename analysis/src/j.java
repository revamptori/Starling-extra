/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j
implements l {
    private static final Logger a = LogManager.getLogger();
    private final Map<String, k> b = Maps.newHashMap();
    private final Set<k> c = Sets.newHashSet();

    @Override
    public int a(m m22, String string) {
        m m22;
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] stringArray = string.split(" ");
        String \u26032 = stringArray[0];
        stringArray = j.a(stringArray);
        k \u26033 = (k)this.b.get((Object)\u26032);
        int \u26034 = this.a(\u26033, stringArray);
        int \u26035 = 0;
        if (\u26033 == null) {
            fb fb2 = new fb("commands.generic.notFound", new Object[0]);
            fb2.b().a(a.m);
            m22.a(fb2);
        } else if (\u26033.a(m22)) {
            if (\u26034 > -1) {
                List<pk> list = o.b(m22, stringArray[\u26034], pk.class);
                String \u26036 = stringArray[\u26034];
                m22.a(n.a.c, list.size());
                for (pk pk2 : list) {
                    stringArray[\u26034] = pk2.aK().toString();
                    if (!this.a(m22, stringArray, \u26033, string)) continue;
                    ++\u26035;
                }
                stringArray[\u26034] = \u26036;
            } else {
                m22.a(n.a.c, 1);
                if (this.a(m22, stringArray, \u26033, string)) {
                    ++\u26035;
                }
            }
        } else {
            fb fb3 = new fb("commands.generic.permission", new Object[0]);
            fb3.b().a(a.m);
            m22.a(fb3);
        }
        m22.a(n.a.a, \u26035);
        return \u26035;
    }

    protected boolean a(m m2, String[] stringArray, k k2, String string) {
        try {
            k2.a(m2, stringArray);
            return true;
        }
        catch (cf cf2) {
            fb fb2 = new fb("commands.generic.usage", new fb(cf2.getMessage(), cf2.a()));
            fb2.b().a(a.m);
            m2.a(fb2);
        }
        catch (bz bz2) {
            fb fb3 = new fb(bz2.getMessage(), bz2.a());
            fb3.b().a(a.m);
            m2.a(fb3);
        }
        catch (Throwable throwable) {
            fb fb4 = new fb("commands.generic.exception", new Object[0]);
            fb4.b().a(a.m);
            m2.a(fb4);
            a.warn("Couldn't process command: '" + string + "'");
        }
        return false;
    }

    public k a(k k22) {
        k k22;
        this.b.put((Object)k22.c(), (Object)k22);
        this.c.add((Object)k22);
        for (String string : k22.b()) {
            k k3 = (k)this.b.get((Object)string);
            if (k3 != null && k3.c().equals((Object)string)) continue;
            this.b.put((Object)string, (Object)k22);
        }
        return k22;
    }

    private static String[] a(String[] stringArray) {
        \u2603 = new String[stringArray.length - 1];
        System.arraycopy((Object)stringArray, (int)1, (Object)\u2603, (int)0, (int)(stringArray.length - 1));
        return \u2603;
    }

    @Override
    public List<String> a(m m2, String string, cj cj2) {
        String[] stringArray = string.split(" ", -1);
        String \u26032 = stringArray[0];
        if (stringArray.length == 1) {
            ArrayList arrayList = Lists.newArrayList();
            for (Map.Entry entry : this.b.entrySet()) {
                if (!i.a(\u26032, (String)entry.getKey()) || !((k)entry.getValue()).a(m2)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (stringArray.length > 1 && (\u2603 = (k)this.b.get((Object)\u26032)) != null && \u2603.a(m2)) {
            return \u2603.a(m2, j.a(stringArray), cj2);
        }
        return null;
    }

    @Override
    public List<k> a(m m2) {
        ArrayList arrayList = Lists.newArrayList();
        for (k k2 : this.c) {
            if (!k2.a(m2)) continue;
            arrayList.add((Object)k2);
        }
        return arrayList;
    }

    @Override
    public Map<String, k> a() {
        return this.b;
    }

    private int a(k k2, String[] stringArray) {
        if (k2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!k2.b(stringArray, i2) || !o.a(stringArray[i2])) continue;
            return i2;
        }
        return -1;
    }
}
