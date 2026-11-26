/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class en
extends ByteToMessageDecoder {
    private static final Logger a = LogManager.getLogger();
    private static final Marker b = MarkerManager.getMarker((String)"PACKET_RECEIVED", (Marker)ek.b);
    private final fg c;

    public en(fg fg2) {
        this.c = fg2;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() == 0) {
            return;
        }
        em em2 = new em(byteBuf);
        int \u26032 = em2.e();
        ff \u26033 = ((el)((Object)channelHandlerContext.channel().attr(ek.c).get())).a(this.c, \u26032);
        if (\u26033 == null) {
            throw new IOException("Bad packet id " + \u26032);
        }
        \u26033.a(em2);
        if (em2.readableBytes() > 0) {
            throw new IOException("Packet " + ((el)((Object)channelHandlerContext.channel().attr(ek.c).get())).a() + "/" + \u26032 + " (" + \u26033.getClass().getSimpleName() + ") was larger than I expected, found " + em2.readableBytes() + " bytes extra whilst reading packet " + \u26032);
        }
        list.add((Object)\u26033);
        if (a.isDebugEnabled()) {
            a.debug(b, " IN: [{}:{}] {}", new Object[]{channelHandlerContext.channel().attr(ek.c).get(), \u26032, \u26033.getClass().getName()});
        }
    }
}
