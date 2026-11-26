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

static final class bak.1
implements Comparator<bdc> {
    bak.1() {
    }

    public int a(bdc bdc2, bdc bdc3) {
        return ComparisonChain.start().compare((Comparable)bdc2.a().getId(), (Comparable)bdc3.a().getId()).result();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bdc)object, (bdc)object2);
    }
}
