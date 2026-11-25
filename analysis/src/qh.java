/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 *  java.util.UUID
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class qh
implements qc {
    private final qf a;
    private final qb b;
    private final Map<Integer, Set<qd>> c = Maps.newHashMap();
    private final Map<String, Set<qd>> d = Maps.newHashMap();
    private final Map<UUID, qd> e = Maps.newHashMap();
    private double f;
    private boolean g = true;
    private double h;

    public qh(qf qf2, qb qb2) {
        this.a = qf2;
        this.b = qb2;
        this.f = qb2.b();
        for (int i = 0; i < 3; ++i) {
            this.c.put((Object)i, (Object)Sets.newHashSet());
        }
    }

    @Override
    public qb a() {
        return this.b;
    }

    @Override
    public double b() {
        return this.f;
    }

    @Override
    public void a(double d) {
        if (d == this.b()) {
            return;
        }
        this.f = d;
        this.f();
    }

    @Override
    public Collection<qd> a(int n) {
        return (Collection)this.c.get((Object)n);
    }

    @Override
    public Collection<qd> c() {
        HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < 3; ++i) {
            hashSet.addAll(this.a(i));
        }
        return hashSet;
    }

    @Override
    public qd a(UUID uUID) {
        return (qd)this.e.get((Object)uUID);
    }

    @Override
    public boolean a(qd qd2) {
        return this.e.get((Object)qd2.a()) != null;
    }

    @Override
    public void b(qd qd2) {
        if (this.a(qd2.a()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set set = (Set)this.d.get((Object)qd2.b());
        if (set == null) {
            set = Sets.newHashSet();
            this.d.put((Object)qd2.b(), (Object)set);
        }
        ((Set)this.c.get((Object)qd2.c())).add((Object)qd2);
        set.add((Object)qd2);
        this.e.put((Object)qd2.a(), (Object)qd2);
        this.f();
    }

    protected void f() {
        this.g = true;
        this.a.a(this);
    }

    @Override
    public void c(qd qd22) {
        qd qd22;
        for (int i = 0; i < 3; ++i) {
            Set set = (Set)this.c.get((Object)i);
            set.remove((Object)qd22);
        }
        Set \u26032 = (Set)this.d.get((Object)qd22.b());
        if (\u26032 != null) {
            \u26032.remove((Object)qd22);
            if (\u26032.isEmpty()) {
                this.d.remove((Object)qd22.b());
            }
        }
        this.e.remove((Object)qd22.a());
        this.f();
    }

    @Override
    public void d() {
        ArrayList arrayList = this.c();
        if (arrayList == null) {
            return;
        }
        arrayList = Lists.newArrayList(arrayList);
        for (qd qd2 : arrayList) {
            this.c(qd2);
        }
    }

    @Override
    public double e() {
        if (this.g) {
            this.h = this.g();
            this.g = false;
        }
        return this.h;
    }

    private double g() {
        double d;
        double d2 = this.b();
        for (qd qd2 : this.b(0)) {
            d2 += qd2.d();
        }
        d = d2;
        for (qd qd3 : this.b(1)) {
            d += d2 * qd3.d();
        }
        for (qd qd3 : this.b(2)) {
            d *= 1.0 + qd3.d();
        }
        return this.b.a(d);
    }

    private Collection<qd> b(int n) {
        HashSet hashSet = Sets.newHashSet(this.a(n));
        for (qb qb2 = this.b.d(); qb2 != null; qb2 = qb2.d()) {
            qc qc2 = this.a.a(qb2);
            if (qc2 == null) continue;
            hashSet.addAll(qc2.a(n));
        }
        return hashSet;
    }
}
