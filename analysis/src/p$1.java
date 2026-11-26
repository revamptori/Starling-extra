/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 */
import com.google.common.base.Predicate;

class p.1
implements Predicate<mq> {
    final /* synthetic */ lf a;
    final /* synthetic */ mw b;

    p.1(lf lf2, mw mw2) {
        this.a = lf2;
        this.b = mw2;
    }

    public boolean a(mq mq2) {
        return this.a.A().a(mq2) && mq2 != this.b;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((mq)object);
    }
}
