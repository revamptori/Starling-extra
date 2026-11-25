/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.common.util.concurrent.ListenableFuture;

class bhp.1
implements Runnable {
    final /* synthetic */ ListenableFuture a;

    bhp.1(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public void run() {
        this.a.cancel(false);
    }
}
