/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Random
 */
import java.util.Collection;
import java.util.Random;

public class oa {
    public static int a(Collection<? extends a> collection) {
        int n = 0;
        for (a a2 : collection) {
            n += a2.a;
        }
        return n;
    }

    public static <T extends a> T a(Random random, Collection<T> collection, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        \u2603 = random.nextInt(n);
        return oa.a(collection, \u2603);
    }

    public static <T extends a> T a(Collection<T> collection, int n) {
        for (a a2 : collection) {
            if ((n -= a2.a) >= 0) continue;
            return (T)a2;
        }
        return null;
    }

    public static <T extends a> T a(Random random, Collection<T> collection) {
        return oa.a(random, collection, oa.a(collection));
    }

    public static class a {
        protected int a;

        public a(int n) {
            this.a = n;
        }
    }
}
