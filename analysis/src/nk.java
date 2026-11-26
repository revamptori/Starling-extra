/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class nk<V>
implements Map<String, V> {
    private final Map<String, V> a = Maps.newLinkedHashMap();

    public int size() {
        return this.a.size();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public boolean containsKey(Object object) {
        return this.a.containsKey((Object)object.toString().toLowerCase());
    }

    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    public V get(Object object) {
        return (V)this.a.get((Object)object.toString().toLowerCase());
    }

    public V a(String string, V v) {
        return (V)this.a.put((Object)string.toLowerCase(), v);
    }

    public V remove(Object object) {
        return (V)this.a.remove((Object)object.toString().toLowerCase());
    }

    public void putAll(Map<? extends String, ? extends V> map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a((String)entry.getKey(), entry.getValue());
        }
    }

    public void clear() {
        this.a.clear();
    }

    public Set<String> keySet() {
        return this.a.keySet();
    }

    public Collection<V> values() {
        return this.a.values();
    }

    public Set<Map.Entry<String, V>> entrySet() {
        return this.a.entrySet();
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((String)object, object2);
    }
}
