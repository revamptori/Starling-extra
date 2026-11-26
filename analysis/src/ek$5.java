/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  java.lang.Exception
 *  java.lang.Object
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

static final class ek.5
extends ChannelInitializer<Channel> {
    final /* synthetic */ ek a;

    ek.5(ek ek2) {
        this.a = ek2;
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new eq()).addLast("decoder", (ChannelHandler)new en(fg.b)).addLast("prepender", (ChannelHandler)new er()).addLast("encoder", (ChannelHandler)new eo(fg.a)).addLast("packet_handler", (ChannelHandler)this.a);
    }
}
