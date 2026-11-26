/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.base.Objects
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ama {
    private static final Joiner a = Joiner.on((String)", ");
    private static final Function<amo, String> b = new Function<amo, String>(){

        public String a(amo amo2) {
            return amo2 == null ? "<NULL>" : amo2.a();
        }

        public /* synthetic */ Object apply(Object object) {
            return this.a((amo)object);
        }
    };
    private final afh c;
    private final ImmutableList<amo> d;
    private final ImmutableList<alz> e;

    public ama(afh afh2, amo ... amoArray) {
        this.c = afh2;
        Arrays.sort((Object[])amoArray, (Comparator)new Comparator<amo>(){

            public int a(amo amo2, amo amo3) {
                return amo2.a().compareTo(amo3.a());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((amo)object, (amo)object2);
            }
        });
        this.d = ImmutableList.copyOf((Object[])amoArray);
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        ArrayList \u26032 = Lists.newArrayList();
        Iterable<List<Comparable>> \u26033 = cm.a(this.e());
        for (Object object : \u26033) {
            Map map = cw.b(this.d, object);
            a \u26034 = new a(afh2, ImmutableMap.copyOf(map));
            linkedHashMap.put(map, (Object)\u26034);
            \u26032.add((Object)\u26034);
        }
        for (Object object : \u26032) {
            ((a)object).a((Map<Map<amo, Comparable>, a>)linkedHashMap);
        }
        this.e = ImmutableList.copyOf((Collection)\u26032);
    }

    public ImmutableList<alz> a() {
        return this.e;
    }

    private List<Iterable<Comparable>> e() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.d.size(); ++i) {
            arrayList.add(((amo)this.d.get(i)).c());
        }
        return arrayList;
    }

    public alz b() {
        return (alz)this.e.get(0);
    }

    public afh c() {
        return this.c;
    }

    public Collection<amo> d() {
        return this.d;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("block", afh.c.c(this.c)).add("properties", (Object)Iterables.transform(this.d, b)).toString();
    }

    static class a
    extends aly {
        private final afh a;
        private final ImmutableMap<amo, Comparable> b;
        private ImmutableTable<amo, Comparable, alz> c;

        private a(afh afh2, ImmutableMap<amo, Comparable> immutableMap) {
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

        public void a(Map<Map<amo, Comparable>, a> map) {
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
}
