/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;

public class amn
extends amj<Integer> {
    private final ImmutableSet<Integer> a;

    protected amn(String string, int n, int n2) {
        super(string, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n2 <= n) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n + ")");
        }
        HashSet hashSet = Sets.newHashSet();
        for (int i = n; i <= n2; ++i) {
            hashSet.add((Object)i);
        }
        this.a = ImmutableSet.copyOf((Collection)hashSet);
    }

    @Override
    public Collection<Integer> c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        amn amn2 = (amn)object;
        return this.a.equals(amn2.a);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.a.hashCode();
        return n;
    }

    public static amn a(String string, int n, int n2) {
        return new amn(string, n, n2);
    }

    @Override
    public String a(Integer n) {
        return n.toString();
    }
}
