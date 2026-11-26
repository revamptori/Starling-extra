/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.zip.Deflater
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class ej
extends MessageToByteEncoder<ByteBuf> {
    private final byte[] a = new byte[8192];
    private final Deflater b;
    private int c;

    public ej(int n) {
        this.c = n;
        this.b = new Deflater();
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n = byteBuf.readableBytes();
        em \u26032 = new em(byteBuf2);
        if (n < this.c) {
            \u26032.b(0);
            \u26032.writeBytes(byteBuf);
        } else {
            byte[] byArray = new byte[n];
            byteBuf.readBytes(byArray);
            \u26032.b(byArray.length);
            this.b.setInput(byArray, 0, n);
            this.b.finish();
            while (!this.b.finished()) {
                int n2 = this.b.deflate(this.a);
                \u26032.writeBytes(this.a, 0, n2);
            }
            this.b.reset();
        }
    }

    public void a(int n) {
        this.c = n;
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}
