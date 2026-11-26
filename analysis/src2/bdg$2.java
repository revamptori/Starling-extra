/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;

class bdg.2
extends ChannelInitializer<Channel> {
    final /* synthetic */ bdd a;
    final /* synthetic */ bde b;

    bdg.2(bdd bdd2, bde bde2) {
        this.a = bdd2;
        this.b = bde2;
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new SimpleChannelInboundHandler<ByteBuf>(){

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
                super.channelActive(channelHandlerContext);
                ByteBuf byteBuf = Unpooled.buffer();
                try {
                    byteBuf.writeByte(254);
                    byteBuf.writeByte(1);
                    byteBuf.writeByte(250);
                    char[] \u26032 = "MC|PingHost".toCharArray();
                    byteBuf.writeShort(\u26032.length);
                    for (char c : \u26032) {
                        byteBuf.writeChar((int)c);
                    }
                    byteBuf.writeShort(7 + 2 * a.a().length());
                    byteBuf.writeByte(127);
                    \u26032 = a.a().toCharArray();
                    byteBuf.writeShort(\u26032.length);
                    for (char c : \u26032) {
                        byteBuf.writeChar((int)c);
                    }
                    byteBuf.writeInt(a.b());
                    channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
                }
                finally {
                    byteBuf.release();
                }
            }

            protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
                short s = byteBuf.readUnsignedByte();
                if (s == 255) {
                    String string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
                    String[] \u26032 = (String[])Iterables.toArray((Iterable)a.split((CharSequence)string), String.class);
                    if ("\u00a71".equals((Object)\u26032[0])) {
                        int n = ns.a(\u26032[1], 0);
                        String \u26033 = \u26032[2];
                        String \u26034 = \u26032[3];
                        \u2603 = ns.a(\u26032[4], -1);
                        \u2603 = ns.a(\u26032[5], -1);
                        b.f = -1;
                        b.g = \u26033;
                        b.d = \u26034;
                        b.c = (Object)((Object)a.h) + "" + \u2603 + "" + (Object)((Object)a.i) + "/" + (Object)((Object)a.h) + \u2603;
                    }
                }
                channelHandlerContext.close();
            }

            public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
                channelHandlerContext.close();
            }

            protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
                this.a(channelHandlerContext, (ByteBuf)object);
            }
        }});
    }
}
