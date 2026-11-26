/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.AbstractSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ne<T>
extends AbstractSet<T> {
    private static final Set<Class<?>> a = Sets.newHashSet();
    private final Map<Class<?>, List<T>> b = Maps.newHashMap();
    private final Set<Class<?>> c = Sets.newIdentityHashSet();
    private final Class<T> d;
    private final List<T> e = Lists.newArrayList();

    public ne(Class<T> clazz) {
        this.d = clazz;
        this.c.add(clazz);
        this.b.put(clazz, this.e);
        for (Class clazz2 : a) {
            this.a(clazz2);
        }
    }

    protected void a(Class<?> clazz2) {
        Class<?> clazz2;
        a.add(clazz2);
        for (Object object : this.e) {
            if (!clazz2.isAssignableFrom(object.getClass())) continue;
            this.a(object, clazz2);
        }
        this.c.add(clazz2);
    }

    protected Class<?> b(Class<?> clazz) {
        if (this.d.isAssignableFrom(clazz)) {
            if (!this.c.contains(clazz)) {
                this.a(clazz);
            }
            return clazz;
        }
        throw new IllegalArgumentException("Don't know how to search for " + clazz);
    }

    public boolean add(T t) {
        for (Class clazz : this.c) {
            if (!clazz.isAssignableFrom(t.getClass())) continue;
            this.a(t, clazz);
        }
        return true;
    }

    private void a(T t, Class<?> clazz) {
        List list = (List)this.b.get(clazz);
        if (list == null) {
            this.b.put(clazz, (Object)Lists.newArrayList((Object[])new Object[]{t}));
        } else {
            list.add(t);
        }
    }

    public boolean remove(Object object) {
        \u2603 = object;
        boolean bl = false;
        for (Class clazz : this.c) {
            if (!clazz.isAssignableFrom(\u2603.getClass()) || (\u2603 = (List)this.b.get((Object)clazz)) == null || !\u2603.remove(\u2603)) continue;
            bl = true;
        }
        return bl;
    }

    public boolean contains(Object object) {
        return Iterators.contains((Iterator)this.c(object.getClass()).iterator(), (Object)object);
    }

    public <S> Iterable<S> c(final Class<S> clazz) {
        return new Iterable<S>(){

            public Iterator<S> iterator() {
                List list = (List)ne.this.b.get(ne.this.b(clazz));
                if (list == null) {
                    return Iterators.emptyIterator();
                }
                Iterator \u26032 = list.iterator();
                return Iterators.filter((Iterator)\u26032, (Class)clazz);
            }
        };
    }

    public Iterator<T> iterator() {
        if (this.e.isEmpty()) {
            return Iterators.emptyIterator();
        }
        return Iterators.unmodifiableIterator((Iterator)this.e.iterator());
    }

    public int size() {
        return this.e.size();
    }
}
