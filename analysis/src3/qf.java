/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;

public abstract class qf {
    protected final Map<qb, qc> a = Maps.newHashMap();
    protected final Map<String, qc> b = new nk<qc>();
    protected final Multimap<qb, qb> c = HashMultimap.create();

    public qc a(qb qb2) {
        return (qc)this.a.get((Object)qb2);
    }

    public qc a(String string) {
        return (qc)this.b.get((Object)string);
    }

    public qc b(qb qb2) {
        if (this.b.containsKey((Object)qb2.a())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        qc qc2 = this.c(qb2);
        this.b.put((Object)qb2.a(), (Object)qc2);
        this.a.put((Object)qb2, (Object)qc2);
        for (qb qb3 = qb2.d(); qb3 != null; qb3 = qb3.d()) {
            this.c.put((Object)qb3, (Object)qb2);
        }
        return qc2;
    }

    protected abstract qc c(qb var1);

    public Collection<qc> a() {
        return this.b.values();
    }

    public void a(qc qc2) {
    }

    public void a(Multimap<String, qd> multimap) {
        for (Map.Entry entry : multimap.entries()) {
            qc qc2 = this.a((String)entry.getKey());
            if (qc2 == null) continue;
            qc2.c((qd)entry.getValue());
        }
    }

    public void b(Multimap<String, qd> multimap) {
        for (Map.Entry entry : multimap.entries()) {
            qc qc2 = this.a((String)entry.getKey());
            if (qc2 == null) continue;
            qc2.c((qd)entry.getValue());
            qc2.b((qd)entry.getValue());
        }
    }
}
