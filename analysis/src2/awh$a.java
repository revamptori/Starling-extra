/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.Comparator
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

static class awh.a
implements Comparator<bdc> {
    private awh.a() {
    }

    public int a(bdc bdc2, bdc bdc3) {
        aul aul2 = bdc2.i();
        \u2603 = bdc3.i();
        return ComparisonChain.start().compareTrueFirst(bdc2.b() != adp.a.e, bdc3.b() != adp.a.e).compare((Comparable)(aul2 != null ? aul2.b() : ""), (Comparable)(\u2603 != null ? \u2603.b() : "")).compare((Comparable)bdc2.a().getName(), (Comparable)bdc3.a().getName()).result();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bdc)object, (bdc)object2);
    }
}
