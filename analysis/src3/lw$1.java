/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Predicate;

static final class lw.1
implements Predicate<String> {
    lw.1() {
    }

    public boolean a(String string) {
        return !nx.b(string);
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((String)object);
    }
}
