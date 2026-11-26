/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

static final class agw.a.1
implements Predicate<agw.a> {
    final /* synthetic */ agw.b a;

    agw.a.1(agw.b b2) {
        this.a = b2;
    }

    public boolean a(agw.a a2) {
        return a2.a() == this.a;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((agw.a)object);
    }
}
