/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.Object
 *  java.lang.Runnable
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

class ek.4
implements Runnable {
    final /* synthetic */ el a;
    final /* synthetic */ el b;
    final /* synthetic */ ff c;
    final /* synthetic */ GenericFutureListener[] d;

    ek.4(el el2, el el3, ff ff2, GenericFutureListener[] genericFutureListenerArray) {
        this.a = el2;
        this.b = el3;
        this.c = ff2;
        this.d = genericFutureListenerArray;
    }

    public void run() {
        if (this.a != this.b) {
            ek.this.a(this.a);
        }
        ChannelFuture channelFuture = ek.this.k.writeAndFlush((Object)this.c);
        if (this.d != null) {
            channelFuture.addListeners(this.d);
        }
        channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}
