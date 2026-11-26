/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.ByteBufProcessor
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  java.io.DataInput
 *  java.io.DataOutput
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.channels.GatheringByteChannel
 *  java.nio.channels.ScatteringByteChannel
 *  java.nio.charset.Charset
 *  java.util.UUID
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public class em
extends ByteBuf {
    private final ByteBuf a;

    public em(ByteBuf byteBuf) {
        this.a = byteBuf;
    }

    public static int a(int n) {
        for (\u2603 = 1; \u2603 < 5; ++\u2603) {
            if ((n & -1 << \u2603 * 7) != 0) continue;
            return \u2603;
        }
        return 5;
    }

    public void a(byte[] byArray) {
        this.b(byArray.length);
        this.writeBytes(byArray);
    }

    public byte[] a() {
        byte[] byArray = new byte[this.e()];
        this.readBytes(byArray);
        return byArray;
    }

    public cj c() {
        return cj.a(this.readLong());
    }

    public void a(cj cj2) {
        this.writeLong(cj2.g());
    }

    public eu d() throws IOException {
        return eu.a.a(this.c(Short.MAX_VALUE));
    }

    public void a(eu eu2) throws IOException {
        this.a(eu.a.a(eu2));
    }

    public <T extends Enum<T>> T a(Class<T> clazz) {
        return (T)((Enum[])clazz.getEnumConstants())[this.e()];
    }

    public void a(Enum<?> enum_) {
        this.b(enum_.ordinal());
    }

    public int e() {
        int n = 0;
        \u2603 = 0;
        do {
            byte by = this.readByte();
            n |= (by & 0x7F) << \u2603++ * 7;
            if (\u2603 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & 0x80) == 128);
        return n;
    }

    public long f() {
        long l = 0L;
        int \u26032 = 0;
        do {
            byte by = this.readByte();
            l |= (long)(by & 0x7F) << \u26032++ * 7;
            if (\u26032 <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while ((by & 0x80) == 128);
        return l;
    }

    public void a(UUID uUID) {
        this.writeLong(uUID.getMostSignificantBits());
        this.writeLong(uUID.getLeastSignificantBits());
    }

    public UUID g() {
        return new UUID(this.readLong(), this.readLong());
    }

    public void b(int n) {
        while (true) {
            if ((n & 0xFFFFFF80) == 0) {
                this.writeByte(n);
                return;
            }
            this.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
    }

    public void b(long l) {
        while (true) {
            if ((l & 0xFFFFFFFFFFFFFF80L) == 0L) {
                this.writeByte((int)l);
                return;
            }
            this.writeByte((int)(l & 0x7FL) | 0x80);
            l >>>= 7;
        }
    }

    public void a(dn dn2) {
        if (dn2 == null) {
            this.writeByte(0);
        } else {
            try {
                dx.a(dn2, (DataOutput)new ByteBufOutputStream((ByteBuf)this));
            }
            catch (IOException iOException) {
                throw new EncoderException((Throwable)iOException);
            }
        }
    }

    public dn h() throws IOException {
        int n = this.readerIndex();
        byte \u26032 = this.readByte();
        if (\u26032 == 0) {
            return null;
        }
        this.readerIndex(n);
        return dx.a((DataInput)new ByteBufInputStream((ByteBuf)this), new dw(0x200000L));
    }

    public void a(zx zx2) {
        if (zx2 == null) {
            this.writeShort(-1);
        } else {
            this.writeShort(zw.b(zx2.b()));
            this.writeByte(zx2.b);
            this.writeShort(zx2.i());
            dn dn2 = null;
            if (zx2.b().m() || zx2.b().p()) {
                dn2 = zx2.o();
            }
            this.a(dn2);
        }
    }

    public zx i() throws IOException {
        zx \u26034 = null;
        short \u26032 = this.readShort();
        if (\u26032 >= 0) {
            byte by = this.readByte();
            short \u26033 = this.readShort();
            \u26034 = new zx(zw.b(\u26032), (int)by, (int)\u26033);
            \u26034.d(this.h());
        }
        return \u26034;
    }

    public String c(int n) {
        \u2603 = this.e();
        if (\u2603 > n * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + \u2603 + " > " + n * 4 + ")");
        }
        if (\u2603 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.readBytes(\u2603).array(), Charsets.UTF_8);
        if (string.length() > n) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + \u2603 + " > " + n + ")");
        }
        return string;
    }

    public em a(String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        if (byArray.length > Short.MAX_VALUE) {
            throw new EncoderException("String too big (was " + string.length() + " bytes encoded, max " + Short.MAX_VALUE + ")");
        }
        this.b(byArray.length);
        this.writeBytes(byArray);
        return this;
    }

    public int capacity() {
        return this.a.capacity();
    }

    public ByteBuf capacity(int n) {
        return this.a.capacity(n);
    }

    public int maxCapacity() {
        return this.a.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.a.alloc();
    }

    public ByteOrder order() {
        return this.a.order();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.a.order(byteOrder);
    }

    public ByteBuf unwrap() {
        return this.a.unwrap();
    }

    public boolean isDirect() {
        return this.a.isDirect();
    }

    public int readerIndex() {
        return this.a.readerIndex();
    }

    public ByteBuf readerIndex(int n) {
        return this.a.readerIndex(n);
    }

    public int writerIndex() {
        return this.a.writerIndex();
    }

    public ByteBuf writerIndex(int n) {
        return this.a.writerIndex(n);
    }

    public ByteBuf setIndex(int n, int n2) {
        return this.a.setIndex(n, n2);
    }

    public int readableBytes() {
        return this.a.readableBytes();
    }

    public int writableBytes() {
        return this.a.writableBytes();
    }

    public int maxWritableBytes() {
        return this.a.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.a.isReadable();
    }

    public boolean isReadable(int n) {
        return this.a.isReadable(n);
    }

    public boolean isWritable() {
        return this.a.isWritable();
    }

    public boolean isWritable(int n) {
        return this.a.isWritable(n);
    }

    public ByteBuf clear() {
        return this.a.clear();
    }

    public ByteBuf markReaderIndex() {
        return this.a.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.a.resetReaderIndex();
    }

    public ByteBuf markWriterIndex() {
        return this.a.markWriterIndex();
    }

    public ByteBuf resetWriterIndex() {
        return this.a.resetWriterIndex();
    }

    public ByteBuf discardReadBytes() {
        return this.a.discardReadBytes();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.a.discardSomeReadBytes();
    }

    public ByteBuf ensureWritable(int n) {
        return this.a.ensureWritable(n);
    }

    public int ensureWritable(int n, boolean bl) {
        return this.a.ensureWritable(n, bl);
    }

    public boolean getBoolean(int n) {
        return this.a.getBoolean(n);
    }

    public byte getByte(int n) {
        return this.a.getByte(n);
    }

    public short getUnsignedByte(int n) {
        return this.a.getUnsignedByte(n);
    }

    public short getShort(int n) {
        return this.a.getShort(n);
    }

    public int getUnsignedShort(int n) {
        return this.a.getUnsignedShort(n);
    }

    public int getMedium(int n) {
        return this.a.getMedium(n);
    }

    public int getUnsignedMedium(int n) {
        return this.a.getUnsignedMedium(n);
    }

    public int getInt(int n) {
        return this.a.getInt(n);
    }

    public long getUnsignedInt(int n) {
        return this.a.getUnsignedInt(n);
    }

    public long getLong(int n) {
        return this.a.getLong(n);
    }

    public char getChar(int n) {
        return this.a.getChar(n);
    }

    public float getFloat(int n) {
        return this.a.getFloat(n);
    }

    public double getDouble(int n) {
        return this.a.getDouble(n);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf) {
        return this.a.getBytes(n, byteBuf);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2) {
        return this.a.getBytes(n, byteBuf, n2);
    }

    public ByteBuf getBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.a.getBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf getBytes(int n, byte[] byArray) {
        return this.a.getBytes(n, byArray);
    }

    public ByteBuf getBytes(int n, byte[] byArray, int n2, int n3) {
        return this.a.getBytes(n, byArray, n2, n3);
    }

    public ByteBuf getBytes(int n, ByteBuffer byteBuffer) {
        return this.a.getBytes(n, byteBuffer);
    }

    public ByteBuf getBytes(int n, OutputStream outputStream, int n2) throws IOException {
        return this.a.getBytes(n, outputStream, n2);
    }

    public int getBytes(int n, GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        return this.a.getBytes(n, gatheringByteChannel, n2);
    }

    public ByteBuf setBoolean(int n, boolean bl) {
        return this.a.setBoolean(n, bl);
    }

    public ByteBuf setByte(int n, int n2) {
        return this.a.setByte(n, n2);
    }

    public ByteBuf setShort(int n, int n2) {
        return this.a.setShort(n, n2);
    }

    public ByteBuf setMedium(int n, int n2) {
        return this.a.setMedium(n, n2);
    }

    public ByteBuf setInt(int n, int n2) {
        return this.a.setInt(n, n2);
    }

    public ByteBuf setLong(int n, long l) {
        return this.a.setLong(n, l);
    }

    public ByteBuf setChar(int n, int n2) {
        return this.a.setChar(n, n2);
    }

    public ByteBuf setFloat(int n, float f) {
        return this.a.setFloat(n, f);
    }

    public ByteBuf setDouble(int n, double d) {
        return this.a.setDouble(n, d);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf) {
        return this.a.setBytes(n, byteBuf);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2) {
        return this.a.setBytes(n, byteBuf, n2);
    }

    public ByteBuf setBytes(int n, ByteBuf byteBuf, int n2, int n3) {
        return this.a.setBytes(n, byteBuf, n2, n3);
    }

    public ByteBuf setBytes(int n, byte[] byArray) {
        return this.a.setBytes(n, byArray);
    }

    public ByteBuf setBytes(int n, byte[] byArray, int n2, int n3) {
        return this.a.setBytes(n, byArray, n2, n3);
    }

    public ByteBuf setBytes(int n, ByteBuffer byteBuffer) {
        return this.a.setBytes(n, byteBuffer);
    }

    public int setBytes(int n, InputStream inputStream, int n2) throws IOException {
        return this.a.setBytes(n, inputStream, n2);
    }

    public int setBytes(int n, ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        return this.a.setBytes(n, scatteringByteChannel, n2);
    }

    public ByteBuf setZero(int n, int n2) {
        return this.a.setZero(n, n2);
    }

    public boolean readBoolean() {
        return this.a.readBoolean();
    }

    public byte readByte() {
        return this.a.readByte();
    }

    public short readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    public short readShort() {
        return this.a.readShort();
    }

    public int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }

    public int readMedium() {
        return this.a.readMedium();
    }

    public int readUnsignedMedium() {
        return this.a.readUnsignedMedium();
    }

    public int readInt() {
        return this.a.readInt();
    }

    public long readUnsignedInt() {
        return this.a.readUnsignedInt();
    }

    public long readLong() {
        return this.a.readLong();
    }

    public char readChar() {
        return this.a.readChar();
    }

    public float readFloat() {
        return this.a.readFloat();
    }

    public double readDouble() {
        return this.a.readDouble();
    }

    public ByteBuf readBytes(int n) {
        return this.a.readBytes(n);
    }

    public ByteBuf readSlice(int n) {
        return this.a.readSlice(n);
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.a.readBytes(byteBuf);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n) {
        return this.a.readBytes(byteBuf, n);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n, int n2) {
        return this.a.readBytes(byteBuf, n, n2);
    }

    public ByteBuf readBytes(byte[] byArray) {
        return this.a.readBytes(byArray);
    }

    public ByteBuf readBytes(byte[] byArray, int n, int n2) {
        return this.a.readBytes(byArray, n, n2);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.a.readBytes(byteBuffer);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n) throws IOException {
        return this.a.readBytes(outputStream, n);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n) throws IOException {
        return this.a.readBytes(gatheringByteChannel, n);
    }

    public ByteBuf skipBytes(int n) {
        return this.a.skipBytes(n);
    }

    public ByteBuf writeBoolean(boolean bl) {
        return this.a.writeBoolean(bl);
    }

    public ByteBuf writeByte(int n) {
        return this.a.writeByte(n);
    }

    public ByteBuf writeShort(int n) {
        return this.a.writeShort(n);
    }

    public ByteBuf writeMedium(int n) {
        return this.a.writeMedium(n);
    }

    public ByteBuf writeInt(int n) {
        return this.a.writeInt(n);
    }

    public ByteBuf writeLong(long l) {
        return this.a.writeLong(l);
    }

    public ByteBuf writeChar(int n) {
        return this.a.writeChar(n);
    }

    public ByteBuf writeFloat(float f) {
        return this.a.writeFloat(f);
    }

    public ByteBuf writeDouble(double d) {
        return this.a.writeDouble(d);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.a.writeBytes(byteBuf);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n) {
        return this.a.writeBytes(byteBuf, n);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n, int n2) {
        return this.a.writeBytes(byteBuf, n, n2);
    }

    public ByteBuf writeBytes(byte[] byArray) {
        return this.a.writeBytes(byArray);
    }

    public ByteBuf writeBytes(byte[] byArray, int n, int n2) {
        return this.a.writeBytes(byArray, n, n2);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.a.writeBytes(byteBuffer);
    }

    public int writeBytes(InputStream inputStream, int n) throws IOException {
        return this.a.writeBytes(inputStream, n);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n) throws IOException {
        return this.a.writeBytes(scatteringByteChannel, n);
    }

    public ByteBuf writeZero(int n) {
        return this.a.writeZero(n);
    }

    public int indexOf(int n, int n2, byte by) {
        return this.a.indexOf(n, n2, by);
    }

    public int bytesBefore(byte by) {
        return this.a.bytesBefore(by);
    }

    public int bytesBefore(int n, byte by) {
        return this.a.bytesBefore(n, by);
    }

    public int bytesBefore(int n, int n2, byte by) {
        return this.a.bytesBefore(n, n2, by);
    }

    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(byteBufProcessor);
    }

    public int forEachByte(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(n, n2, byteBufProcessor);
    }

    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(byteBufProcessor);
    }

    public int forEachByteDesc(int n, int n2, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(n, n2, byteBufProcessor);
    }

    public ByteBuf copy() {
        return this.a.copy();
    }

    public ByteBuf copy(int n, int n2) {
        return this.a.copy(n, n2);
    }

    public ByteBuf slice() {
        return this.a.slice();
    }

    public ByteBuf slice(int n, int n2) {
        return this.a.slice(n, n2);
    }

    public ByteBuf duplicate() {
        return this.a.duplicate();
    }

    public int nioBufferCount() {
        return this.a.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.a.nioBuffer();
    }

    public ByteBuffer nioBuffer(int n, int n2) {
        return this.a.nioBuffer(n, n2);
    }

    public ByteBuffer internalNioBuffer(int n, int n2) {
        return this.a.internalNioBuffer(n, n2);
    }

    public ByteBuffer[] nioBuffers() {
        return this.a.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int n, int n2) {
        return this.a.nioBuffers(n, n2);
    }

    public boolean hasArray() {
        return this.a.hasArray();
    }

    public byte[] array() {
        return this.a.array();
    }

    public int arrayOffset() {
        return this.a.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.a.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.a.memoryAddress();
    }

    public String toString(Charset charset) {
        return this.a.toString(charset);
    }

    public String toString(int n, int n2, Charset charset) {
        return this.a.toString(n, n2, charset);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.a.compareTo(byteBuf);
    }

    public String toString() {
        return this.a.toString();
    }

    public ByteBuf retain(int n) {
        return this.a.retain(n);
    }

    public ByteBuf retain() {
        return this.a.retain();
    }

    public int refCnt() {
        return this.a.refCnt();
    }

    public boolean release() {
        return this.a.release();
    }

    public boolean release(int n) {
        return this.a.release(n);
    }
}
