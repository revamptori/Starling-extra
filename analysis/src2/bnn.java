/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnn
implements bng {
    private static final Logger a = LogManager.getLogger();
    private static final Joiner b = Joiner.on((String)", ");
    private final Map<String, bnb> c = Maps.newHashMap();
    private final List<bnj> d = Lists.newArrayList();
    private final Set<String> e = Sets.newLinkedHashSet();
    private final bny f;

    public bnn(bny bny2) {
        this.f = bny2;
    }

    public void a(bnk bnk2) {
        for (String string : bnk2.c()) {
            this.e.add((Object)string);
            bnb bnb2 = (bnb)this.c.get((Object)string);
            if (bnb2 == null) {
                bnb2 = new bnb(this.f);
                this.c.put((Object)string, (Object)bnb2);
            }
            bnb2.a(bnk2);
        }
    }

    @Override
    public Set<String> a() {
        return this.e;
    }

    @Override
    public bnh a(jy jy2) throws IOException {
        bni bni2 = (bni)this.c.get((Object)jy2.b());
        if (bni2 != null) {
            return bni2.a(jy2);
        }
        throw new FileNotFoundException(jy2.toString());
    }

    @Override
    public List<bnh> b(jy jy2) throws IOException {
        bni bni2 = (bni)this.c.get((Object)jy2.b());
        if (bni2 != null) {
            return bni2.b(jy2);
        }
        throw new FileNotFoundException(jy2.toString());
    }

    private void b() {
        this.c.clear();
        this.e.clear();
    }

    @Override
    public void a(List<bnk> list) {
        this.b();
        a.info("Reloading ResourceManager: " + b.join(Iterables.transform(list, (Function)new Function<bnk, String>(){

            public String a(bnk bnk2) {
                return bnk2.b();
            }

            public /* synthetic */ Object apply(Object object) {
                return this.a((bnk)object);
            }
        })));
        for (bnk bnk2 : list) {
            this.a(bnk2);
        }
        this.c();
    }

    @Override
    public void a(bnj bnj2) {
        this.d.add((Object)bnj2);
        bnj2.a(this);
    }

    private void c() {
        for (bnj bnj2 : this.d) {
            bnj2.a(this);
        }
    }
}
