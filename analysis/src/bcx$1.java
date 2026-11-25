/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Void
 *  javax.crypto.SecretKey
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;

class bcx.1
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ SecretKey a;

    bcx.1(SecretKey secretKey) {
        this.a = secretKey;
    }

    public void operationComplete(Future<? super Void> future) throws Exception {
        bcx.this.d.a(this.a);
    }
}
