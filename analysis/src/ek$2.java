/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  java.lang.Object
 *  java.lang.Override
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;

static final class ek.2
extends no<EpollEventLoopGroup> {
    ek.2() {
    }

    protected EpollEventLoopGroup a() {
        return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}
