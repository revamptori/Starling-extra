/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Iterator
 *  java.util.Map
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class cx<K, V>
extends dd<K, V>
implements cs<V> {
    protected final ct<V> a = new ct();
    protected final Map<V, K> b = ((BiMap)this.c).inverse();

    public void a(int n, K k, V v) {
        this.a.a(v, n);
        this.a(k, v);
    }

    @Override
    protected Map<K, V> b() {
        return HashBiMap.create();
    }

    @Override
    public V a(K k) {
        return super.a(k);
    }

    public K c(V v) {
        return (K)this.b.get(v);
    }

    @Override
    public boolean d(K k) {
        return super.d(k);
    }

    public int b(V v) {
        return this.a.b(v);
    }

    @Override
    public V a(int n) {
        return this.a.a(n);
    }

    @Override
    public Iterator<V> iterator() {
        return this.a.iterator();
    }
}
