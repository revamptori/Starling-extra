/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.local.LocalEventLoopGroup
 *  java.lang.Object
 *  java.lang.Override
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;

static final class ek.3
extends no<LocalEventLoopGroup> {
    ek.3() {
    }

    protected LocalEventLoopGroup a() {
        return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}
