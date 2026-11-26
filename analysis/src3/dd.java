/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dd<K, V>
implements db<K, V> {
    private static final Logger a = LogManager.getLogger();
    protected final Map<K, V> c = this.b();

    protected Map<K, V> b() {
        return Maps.newHashMap();
    }

    @Override
    public V a(K k) {
        return (V)this.c.get(k);
    }

    @Override
    public void a(K k, V v) {
        Validate.notNull(k);
        Validate.notNull(v);
        if (this.c.containsKey(k)) {
            a.debug("Adding duplicate key '" + k + "' to registry");
        }
        this.c.put(k, v);
    }

    public Set<K> c() {
        return Collections.unmodifiableSet((Set)this.c.keySet());
    }

    public boolean d(K k) {
        return this.c.containsKey(k);
    }

    public Iterator<V> iterator() {
        return this.c.values().iterator();
    }
}
