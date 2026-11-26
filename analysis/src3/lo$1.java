/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  java.lang.Exception
 *  java.lang.Object
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;

class lo.1
implements ChannelFutureListener {
    lo.1() {
    }

    public void a(ChannelFuture channelFuture) throws Exception {
        lo.this.a.a(lo.this.f.aK());
    }

    public /* synthetic */ void operationComplete(Future future) throws Exception {
        this.a((ChannelFuture)future);
    }
}
