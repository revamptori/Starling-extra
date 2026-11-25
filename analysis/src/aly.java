/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 *  java.lang.Comparable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map$Entry
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class aly
implements alz {
    private static final Joiner a = Joiner.on((char)',');
    private static final Function<Map.Entry<amo, Comparable>, String> b = new Function<Map.Entry<amo, Comparable>, String>(){

        public String a(Map.Entry<amo, Comparable> entry) {
            if (entry == null) {
                return "<NULL>";
            }
            amo amo2 = (amo)entry.getKey();
            return amo2.a() + "=" + amo2.a((Comparable)entry.getValue());
        }

        public /* synthetic */ Object apply(Object object) {
            return this.a((Map.Entry<amo, Comparable>)((Map.Entry)object));
        }
    };

    @Override
    public <T extends Comparable<T>> alz a(amo<T> amo2) {
        return this.a(amo2, aly.a(amo2.c(), this.b(amo2)));
    }

    protected static <T> T a(Collection<T> collection, T t) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(t)) continue;
            if (iterator.hasNext()) {
                return (T)iterator.next();
            }
            return (T)collection.iterator().next();
        }
        return (T)iterator.next();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(afh.c.c(this.c()));
        if (!this.b().isEmpty()) {
            stringBuilder.append("[");
            a.appendTo(stringBuilder, Iterables.transform((Iterable)this.b().entrySet(), b));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
