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

class ll.5
extends ChannelInitializer<Channel> {
    ll.5() {
    }

    protected void initChannel(Channel channel) throws Exception {
        ek ek2 = new ek(fg.a);
        ek2.a(new lk(ll.this.f, ek2));
        ll.this.h.add((Object)ek2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)ek2);
    }
}
