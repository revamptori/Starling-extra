/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.Object
 *  java.lang.Void
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

static class ek.a {
    private final ff a;
    private final GenericFutureListener<? extends Future<? super Void>>[] b;

    public ek.a(ff ff2, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        this.a = ff2;
        this.b = genericFutureListenerArray;
    }

    static /* synthetic */ ff a(ek.a a2) {
        return a2.a;
    }

    static /* synthetic */ GenericFutureListener[] b(ek.a a2) {
        return a2.b;
    }
}
