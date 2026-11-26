/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  java.lang.Object
 *  java.util.Comparator
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

static final class o.4
implements Comparator<pk> {
    final /* synthetic */ cj a;

    o.4(cj cj2) {
        this.a = cj2;
    }

    public int a(pk pk2, pk pk3) {
        return ComparisonChain.start().compare(pk2.b(this.a), pk3.b(this.a)).result();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((pk)object, (pk)object2);
    }
}
