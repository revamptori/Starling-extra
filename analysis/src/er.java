/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class er
extends MessageToByteEncoder<ByteBuf> {
    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n = byteBuf.readableBytes();
        \u2603 = em.a(n);
        if (\u2603 > 3) {
            throw new IllegalArgumentException("unable to fit " + n + " into " + 3);
        }
        em \u26032 = new em(byteBuf2);
        \u26032.ensureWritable(\u2603 + n);
        \u26032.b(n);
        \u26032.writeBytes(byteBuf, byteBuf.readerIndex(), n);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}
