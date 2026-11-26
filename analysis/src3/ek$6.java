/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  java.lang.Exception
 *  java.lang.Object
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;

static final class ek.6
extends ChannelInitializer<Channel> {
    final /* synthetic */ ek a;

    ek.6(ek ek2) {
        this.a = ek2;
    }

    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.a);
    }
}
