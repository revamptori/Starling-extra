/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class eq
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        byte[] byArray = new byte[3];
        for (int i = 0; i < byArray.length; ++i) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            byArray[i] = byteBuf.readByte();
            if (byArray[i] < 0) continue;
            em em2 = new em(Unpooled.wrappedBuffer((byte[])byArray));
            try {
                int n = em2.e();
                if (byteBuf.readableBytes() < n) {
                    byteBuf.resetReaderIndex();
                    return;
                }
                list.add((Object)byteBuf.readBytes(n));
                return;
            }
            finally {
                em2.release();
            }
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}
