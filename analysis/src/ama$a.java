/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

static class ama.a
extends aly {
    private final afh a;
    private final ImmutableMap<amo, Comparable> b;
    private ImmutableTable<amo, Comparable, alz> c;

    private ama.a(afh afh2, ImmutableMap<amo, Comparable> immutableMap) {
        this.a = afh2;
        this.b = immutableMap;
    }

    @Override
    public Collection<amo> a() {
        return Collections.unmodifiableCollection((Collection)this.b.keySet());
    }

    @Override
    public <T extends Comparable<T>> T b(amo<T> amo2) {
        if (!this.b.containsKey(amo2)) {
            throw new IllegalArgumentException("Cannot get property " + amo2 + " as it does not exist in " + this.a.P());
        }
        return (T)((Comparable)amo2.b().cast(this.b.get(amo2)));
    }

    @Override
    public <T extends Comparable<T>, V extends T> alz a(amo<T> amo2, V v) {
        if (!this.b.containsKey(amo2)) {
            throw new IllegalArgumentException("Cannot set property " + amo2 + " as it does not exist in " + this.a.P());
        }
        if (!amo2.c().contains(v)) {
            throw new IllegalArgumentException("Cannot set property " + amo2 + " to " + v + " on block " + afh.c.c(this.a) + ", it is not an allowed value");
        }
        if (this.b.get(amo2) == v) {
            return this;
        }
        return (alz)this.c.get(amo2, v);
    }

    @Override
    public ImmutableMap<amo, Comparable> b() {
        return this.b;
    }

    @Override
    public afh c() {
        return this.a;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(Map<Map<amo, Comparable>, ama.a> map) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (amo amo2 : this.b.keySet()) {
            for (Comparable comparable : amo2.c()) {
                if (comparable == this.b.get((Object)amo2)) continue;
                hashBasedTable.put((Object)amo2, (Object)comparable, map.get(this.b(amo2, comparable)));
            }
        }
        this.c = ImmutableTable.copyOf((Table)hashBasedTable);
    }

    private Map<amo, Comparable> b(amo amo2, Comparable comparable) {
        HashMap hashMap = Maps.newHashMap(this.b);
        hashMap.put((Object)amo2, (Object)comparable);
        return hashMap;
    }
}
