/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.nio.NioEventLoopGroup
 *  java.lang.Object
 *  java.lang.Override
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;

static final class ll.1
extends no<NioEventLoopGroup> {
    ll.1() {
    }

    protected NioEventLoopGroup a() {
        return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}
