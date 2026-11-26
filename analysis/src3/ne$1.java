/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 */
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;

class ne.1
implements Iterable<S> {
    final /* synthetic */ Class a;

    ne.1(Class clazz) {
        this.a = clazz;
    }

    public Iterator<S> iterator() {
        List list = (List)ne.this.b.get(ne.this.b(this.a));
        if (list == null) {
            return Iterators.emptyIterator();
        }
        Iterator \u26032 = list.iterator();
        return Iterators.filter((Iterator)\u26032, (Class)this.a);
    }
}
