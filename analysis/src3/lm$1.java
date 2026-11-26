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

class lm.1
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ fa a;

    lm.1(fa fa2) {
        this.a = fa2;
    }

    public void operationComplete(Future<? super Void> future) throws Exception {
        lm.this.a.a(this.a);
    }
}
