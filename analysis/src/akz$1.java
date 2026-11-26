/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import io.netty.buffer.ByteBuf;

class akz.1
extends adc {
    akz.1() {
    }

    @Override
    public cj c() {
        return akz.this.c;
    }

    @Override
    public aui d() {
        return new aui((double)akz.this.c.n() + 0.5, (double)akz.this.c.o() + 0.5, (double)akz.this.c.p() + 0.5);
    }

    @Override
    public adm e() {
        return akz.this.z();
    }

    @Override
    public void a(String string) {
        super.a(string);
        akz.this.p_();
    }

    @Override
    public void h() {
        akz.this.z().h(akz.this.c);
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(akz.this.c.n());
        byteBuf.writeInt(akz.this.c.o());
        byteBuf.writeInt(akz.this.c.p());
    }

    @Override
    public pk f() {
        return null;
    }
}
