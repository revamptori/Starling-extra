/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Object
 *  java.lang.Override
 */
import io.netty.buffer.ByteBuf;

class vc.1
extends adc {
    vc.1() {
    }

    @Override
    public void h() {
        vc.this.H().b(23, this.l());
        vc.this.H().b(24, eu.a.a(this.k()));
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public void a(ByteBuf byteBuf) {
        byteBuf.writeInt(vc.this.F());
    }

    @Override
    public cj c() {
        return new cj(vc.this.s, vc.this.t + 0.5, vc.this.u);
    }

    @Override
    public aui d() {
        return new aui(vc.this.s, vc.this.t, vc.this.u);
    }

    @Override
    public adm e() {
        return vc.this.o;
    }

    @Override
    public pk f() {
        return vc.this;
    }
}
