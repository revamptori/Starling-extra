/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.List
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class ct<T>
implements cs<T> {
    private final IdentityHashMap<T, Integer> a = new IdentityHashMap(512);
    private final List<T> b = Lists.newArrayList();

    public void a(T t, int n) {
        this.a.put(t, (Object)n);
        while (this.b.size() <= n) {
            this.b.add(null);
        }
        this.b.set(n, t);
    }

    public int b(T t) {
        Integer n = (Integer)this.a.get(t);
        return n == null ? -1 : n;
    }

    public final T a(int n) {
        if (n >= 0 && n < this.b.size()) {
            return (T)this.b.get(n);
        }
        return null;
    }

    public Iterator<T> iterator() {
        return Iterators.filter((Iterator)this.b.iterator(), (Predicate)Predicates.notNull());
    }
}
