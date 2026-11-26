/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.NoSuchElementException
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class cw {
    public static <K, V> Map<K, V> b(Iterable<K> iterable, Iterable<V> iterable2) {
        return cw.a(iterable, iterable2, Maps.newLinkedHashMap());
    }

    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2, Map<K, V> map) {
        Iterator iterator = iterable2.iterator();
        for (Object object : iterable) {
            map.put(object, iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return map;
    }
}
