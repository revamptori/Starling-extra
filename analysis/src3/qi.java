/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class qi
extends qf {
    private final Set<qc> e = Sets.newHashSet();
    protected final Map<String, qc> d = new nk<qc>();

    public qh e(qb qb2) {
        return (qh)super.a(qb2);
    }

    public qh b(String string) {
        qc qc2 = super.a(string);
        if (qc2 == null) {
            qc2 = (qc)this.d.get((Object)string);
        }
        return (qh)qc2;
    }

    @Override
    public qc b(qb qb2) {
        qc qc2 = super.b(qb2);
        if (qb2 instanceof qj && ((qj)qb2).g() != null) {
            this.d.put((Object)((qj)qb2).g(), (Object)qc2);
        }
        return qc2;
    }

    @Override
    protected qc c(qb qb2) {
        return new qh(this, qb2);
    }

    @Override
    public void a(qc qc2) {
        if (qc2.a().c()) {
            this.e.add((Object)qc2);
        }
        for (qb qb2 : this.c.get((Object)qc2.a())) {
            qh qh2 = this.e(qb2);
            if (qh2 == null) continue;
            qh2.f();
        }
    }

    public Set<qc> b() {
        return this.e;
    }

    public Collection<qc> c() {
        HashSet hashSet = Sets.newHashSet();
        for (qc qc2 : this.a()) {
            if (!qc2.a().c()) continue;
            hashSet.add((Object)qc2);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ qc a(String string) {
        return this.b(string);
    }

    @Override
    public /* synthetic */ qc a(qb qb2) {
        return this.e(qb2);
    }
}
