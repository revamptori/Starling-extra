/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 *  java.util.concurrent.locks.ReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 */
import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class np<T> {
    private final T[] a;
    private final Class<? extends T> b;
    private final ReadWriteLock c = new ReentrantReadWriteLock();
    private int d;
    private int e;

    public np(Class<? extends T> clazz, int n) {
        this.b = clazz;
        this.a = (Object[])Array.newInstance(clazz, (int)n);
    }

    public T a(T t) {
        this.c.writeLock().lock();
        this.a[this.e] = t;
        this.e = (this.e + 1) % this.b();
        if (this.d < this.b()) {
            ++this.d;
        }
        this.c.writeLock().unlock();
        return t;
    }

    public int b() {
        this.c.readLock().lock();
        int n = this.a.length;
        this.c.readLock().unlock();
        return n;
    }

    public T[] c() {
        Object[] objectArray = (Object[])Array.newInstance(this.b, (int)this.d);
        this.c.readLock().lock();
        for (int i = 0; i < this.d; ++i) {
            \u2603 = (this.e - this.d + i) % this.b();
            if (\u2603 < 0) {
                \u2603 += this.b();
            }
            objectArray[i] = this.a[\u2603];
        }
        this.c.readLock().unlock();
        return objectArray;
    }
}
