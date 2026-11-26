/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.util.Iterator
 */
import com.google.common.base.Function;
import java.util.Iterator;

static final class es.1
implements Function<eu, Iterator<eu>> {
    es.1() {
    }

    public Iterator<eu> a(eu eu2) {
        return eu2.iterator();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((eu)object);
    }
}
