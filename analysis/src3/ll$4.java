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

class ll.4
extends ChannelInitializer<Channel> {
    ll.4() {
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new lj(ll.this)).addLast("splitter", (ChannelHandler)new eq()).addLast("decoder", (ChannelHandler)new en(fg.a)).addLast("prepender", (ChannelHandler)new er()).addLast("encoder", (ChannelHandler)new eo(fg.b));
        ek ek2 = new ek(fg.a);
        ll.this.h.add((Object)ek2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)ek2);
        ek2.a(new ln(ll.this.f, ek2));
    }
}
