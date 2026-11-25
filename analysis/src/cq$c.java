/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  java.lang.Error
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Random
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;

public static enum cq.c implements Predicate<cq>,
Iterable<cq>
{
    a,
    b;


    public cq[] a() {
        switch (this) {
            case a: {
                return new cq[]{c, f, d, e};
            }
            case b: {
                return new cq[]{b, a};
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public cq a(Random random) {
        cq[] cqArray = this.a();
        return cqArray[random.nextInt(cqArray.length)];
    }

    public boolean a(cq cq2) {
        return cq2 != null && cq2.k().d() == this;
    }

    public Iterator<cq> iterator() {
        return Iterators.forArray((Object[])this.a());
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((cq)object);
    }
}
