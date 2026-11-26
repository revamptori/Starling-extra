/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class boa
implements bnw {
    private final List<bnz> a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public boa(List<bnz> list, int n, int n2, int n3, boolean bl) {
        this.a = list;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = bl;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a.size();
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    private bnz d(int n) {
        return (bnz)this.a.get(n);
    }

    public int a(int n) {
        bnz bnz2 = this.d(n);
        if (bnz2.a()) {
            return this.d;
        }
        return bnz2.b();
    }

    public boolean b(int n) {
        return !((bnz)this.a.get(n)).a();
    }

    public int c(int n) {
        return ((bnz)this.a.get(n)).c();
    }

    public Set<Integer> f() {
        HashSet hashSet = Sets.newHashSet();
        for (bnz bnz2 : this.a) {
            hashSet.add((Object)bnz2.c());
        }
        return hashSet;
    }
}
