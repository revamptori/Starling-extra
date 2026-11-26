/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.io.IOException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.SortedSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bns
implements bnj {
    private static final Logger b = LogManager.getLogger();
    private final bny c;
    private String d;
    protected static final bnt a = new bnt();
    private Map<String, bnr> e = Maps.newHashMap();

    public bns(bny bny2, String string) {
        this.c = bny2;
        this.d = string;
        bnq.a(a);
    }

    public void a(List<bnk> list) {
        this.e.clear();
        for (bnk bnk2 : list) {
            try {
                bog bog2 = (bog)bnk2.a(this.c, "language");
                if (bog2 == null) continue;
                for (bnr bnr2 : bog2.a()) {
                    if (this.e.containsKey((Object)bnr2.a())) continue;
                    this.e.put((Object)bnr2.a(), (Object)bnr2);
                }
            }
            catch (RuntimeException runtimeException) {
                b.warn("Unable to parse metadata section of resourcepack: " + bnk2.b(), (Throwable)runtimeException);
            }
            catch (IOException iOException) {
                b.warn("Unable to parse metadata section of resourcepack: " + bnk2.b(), (Throwable)iOException);
            }
        }
    }

    @Override
    public void a(bni bni2) {
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"en_US"});
        if (!"en_US".equals((Object)this.d)) {
            arrayList.add((Object)this.d);
        }
        a.a(bni2, (List<String>)arrayList);
        dj.a(bns.a.a);
    }

    public boolean a() {
        return a.a();
    }

    public boolean b() {
        return this.c() != null && this.c().b();
    }

    public void a(bnr bnr2) {
        this.d = bnr2.a();
    }

    public bnr c() {
        return this.e.containsKey((Object)this.d) ? (bnr)this.e.get((Object)this.d) : (bnr)this.e.get((Object)"en_US");
    }

    public SortedSet<bnr> d() {
        return Sets.newTreeSet((Iterable)this.e.values());
    }
}
