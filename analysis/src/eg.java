/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 *  javax.crypto.Cipher
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class eg
extends MessageToMessageDecoder<ByteBuf> {
    private final ef a;

    public eg(Cipher cipher) {
        this.a = new ef(cipher);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        list.add((Object)this.a.a(channelHandlerContext, byteBuf));
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, (List<Object>)list);
    }
}
