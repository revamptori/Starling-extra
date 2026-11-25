/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Void
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class ll.7
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ ek a;
    final /* synthetic */ fa b;

    ll.7(ek ek2, fa fa2) {
        this.a = ek2;
        this.b = fa2;
    }

    public void operationComplete(Future<? super Void> future) throws Exception {
        this.a.a(this.b);
    }
}
