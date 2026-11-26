/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

static class cm.b<T>
implements Iterable<T[]> {
    private final Class<T> a;
    private final Iterable<? extends T>[] b;

    private cm.b(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        this.a = clazz;
        this.b = iterableArray;
    }

    public Iterator<T[]> iterator() {
        if (this.b.length <= 0) {
            return Collections.singletonList((Object)cm.b(this.a, 0)).iterator();
        }
        return new a(this.a, this.b);
    }

    static class a<T>
    extends UnmodifiableIterator<T[]> {
        private int a = -2;
        private final Iterable<? extends T>[] b;
        private final Iterator<? extends T>[] c;
        private final T[] d;

        private a(Class<T> clazz2, Iterable<? extends T>[] iterableArray) {
            Class<T> clazz2;
            this.b = iterableArray;
            this.c = (Iterator[])cm.b(Iterator.class, this.b.length);
            for (int i = 0; i < this.b.length; ++i) {
                this.c[i] = iterableArray[i].iterator();
            }
            this.d = cm.b(clazz2, this.c.length);
        }

        private void b() {
            this.a = -1;
            Arrays.fill((Object[])this.c, null);
            Arrays.fill((Object[])this.d, null);
        }

        public boolean hasNext() {
            if (this.a == -2) {
                this.a = 0;
                for (Iterator<? extends T> iterator : this.c) {
                    if (iterator.hasNext()) continue;
                    this.b();
                    break;
                }
                return true;
            }
            if (this.a >= this.c.length) {
                Iterator iterator;
                this.a = this.c.length - 1;
                while (this.a >= 0 && !(iterator = this.c[this.a]).hasNext()) {
                    if (this.a == 0) {
                        this.b();
                        break;
                    }
                    this.c[this.a] = iterator = this.b[this.a].iterator();
                    if (!iterator.hasNext()) {
                        this.b();
                        break;
                    }
                    --this.a;
                }
            }
            return this.a >= 0;
        }

        public T[] a() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            while (this.a < this.c.length) {
                this.d[this.a] = this.c[this.a].next();
                ++this.a;
            }
            return (Object[])this.d.clone();
        }

        public /* synthetic */ Object next() {
            return this.a();
        }
    }
}
