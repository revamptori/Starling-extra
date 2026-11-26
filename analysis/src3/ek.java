/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.net.InetAddress
 *  java.net.SocketAddress
 *  java.security.Key
 *  java.util.Queue
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 *  javax.crypto.SecretKey
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.security.Key;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ek
extends SimpleChannelInboundHandler<ff> {
    private static final Logger g = LogManager.getLogger();
    public static final Marker a = MarkerManager.getMarker((String)"NETWORK");
    public static final Marker b = MarkerManager.getMarker((String)"NETWORK_PACKETS", (Marker)a);
    public static final AttributeKey<el> c = AttributeKey.valueOf((String)"protocol");
    public static final no<NioEventLoopGroup> d = new no<NioEventLoopGroup>(){

        protected NioEventLoopGroup a() {
            return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
        }

        @Override
        protected /* synthetic */ Object b() {
            return this.a();
        }
    };
    public static final no<EpollEventLoopGroup> e = new no<EpollEventLoopGroup>(){

        protected EpollEventLoopGroup a() {
            return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
        }

        @Override
        protected /* synthetic */ Object b() {
            return this.a();
        }
    };
    public static final no<LocalEventLoopGroup> f = new no<LocalEventLoopGroup>(){

        protected LocalEventLoopGroup a() {
            return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
        }

        @Override
        protected /* synthetic */ Object b() {
            return this.a();
        }
    };
    private final fg h;
    private final Queue<a> i = Queues.newConcurrentLinkedQueue();
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private Channel k;
    private SocketAddress l;
    private ep m;
    private eu n;
    private boolean o;
    private boolean p;

    public ek(fg fg2) {
        this.h = fg2;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.k = channelHandlerContext.channel();
        this.l = this.k.remoteAddress();
        try {
            this.a(el.a);
        }
        catch (Throwable throwable) {
            g.fatal((Object)throwable);
        }
    }

    public void a(el el2) {
        this.k.attr(c).set((Object)el2);
        this.k.config().setAutoRead(true);
        g.debug("Enabled auto read");
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.a(new fb("disconnect.endOfStream", new Object[0]));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        fb fb2 = throwable instanceof TimeoutException ? new fb("disconnect.timeout", new Object[0]) : new fb("disconnect.genericReason", "Internal Exception: " + (Object)((Object)throwable));
        this.a(fb2);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ff ff2) throws Exception {
        if (this.k.isOpen()) {
            try {
                ff2.a(this.m);
            }
            catch (ki ki2) {
                // empty catch block
            }
        }
    }

    public void a(ep ep2) {
        Validate.notNull((Object)ep2, (String)"packetListener", (Object[])new Object[0]);
        g.debug("Set listener of {} to {}", new Object[]{this, ep2});
        this.m = ep2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ff ff2) {
        if (this.g()) {
            this.m();
            this.a(ff2, null);
        } else {
            this.j.writeLock().lock();
            try {
                this.i.add((Object)new a(ff2, null));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ff ff2, GenericFutureListener<? extends Future<? super Void>> genericFutureListener, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        if (this.g()) {
            this.m();
            this.a(ff2, (GenericFutureListener[])ArrayUtils.add((Object[])genericFutureListenerArray, (int)0, genericFutureListener));
        } else {
            this.j.writeLock().lock();
            try {
                this.i.add((Object)new a(ff2, (GenericFutureListener[])ArrayUtils.add((Object[])genericFutureListenerArray, (int)0, genericFutureListener)));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }

    private void a(final ff ff2, final GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray) {
        final el el2 = el.a(ff2);
        \u2603 = (el)((Object)this.k.attr(c).get());
        if (\u2603 != el2) {
            g.debug("Disabled auto read");
            this.k.config().setAutoRead(false);
        }
        if (this.k.eventLoop().inEventLoop()) {
            if (el2 != \u2603) {
                this.a(el2);
            }
            ChannelFuture channelFuture = this.k.writeAndFlush((Object)ff2);
            if (genericFutureListenerArray != null) {
                channelFuture.addListeners(genericFutureListenerArray);
            }
            channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.k.eventLoop().execute(new Runnable(){

                public void run() {
                    if (el2 != \u2603) {
                        ek.this.a(el2);
                    }
                    ChannelFuture channelFuture = ek.this.k.writeAndFlush((Object)ff2);
                    if (genericFutureListenerArray != null) {
                        channelFuture.addListeners(genericFutureListenerArray);
                    }
                    channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                }
            });
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void m() {
        if (this.k == null || !this.k.isOpen()) {
            return;
        }
        this.j.readLock().lock();
        try {
            while (!this.i.isEmpty()) {
                a a2 = (a)this.i.poll();
                this.a(a2.a, a2.b);
            }
        }
        finally {
            this.j.readLock().unlock();
        }
    }

    public void a() {
        this.m();
        if (this.m instanceof km) {
            ((km)((Object)this.m)).c();
        }
        this.k.flush();
    }

    public SocketAddress b() {
        return this.l;
    }

    public void a(eu eu2) {
        if (this.k.isOpen()) {
            this.k.close().awaitUninterruptibly();
            this.n = eu2;
        }
    }

    public boolean c() {
        return this.k instanceof LocalChannel || this.k instanceof LocalServerChannel;
    }

    public static ek a(InetAddress inetAddress, int n, boolean bl) {
        no<NioEventLoopGroup> \u26032;
        final ek ek2 = new ek(fg.b);
        if (Epoll.isAvailable() && bl) {
            Class<NioSocketChannel> clazz = EpollSocketChannel.class;
            \u26032 = e;
        } else {
            clazz = NioSocketChannel.class;
            \u26032 = d;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)\u26032.c())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) throws Exception {
                try {
                    channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
                }
                catch (ChannelException channelException) {
                    // empty catch block
                }
                channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new eq()).addLast("decoder", (ChannelHandler)new en(fg.b)).addLast("prepender", (ChannelHandler)new er()).addLast("encoder", (ChannelHandler)new eo(fg.a)).addLast("packet_handler", (ChannelHandler)ek2);
            }
        })).channel(clazz)).connect(inetAddress, n).syncUninterruptibly();
        return ek2;
    }

    public static ek a(SocketAddress socketAddress) {
        final ek ek2 = new ek(fg.b);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)f.c())).handler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) throws Exception {
                channel.pipeline().addLast("packet_handler", (ChannelHandler)ek2);
            }
        })).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return ek2;
    }

    public void a(SecretKey secretKey) {
        this.o = true;
        this.k.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new eg(ng.a(2, (Key)secretKey)));
        this.k.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new eh(ng.a(1, (Key)secretKey)));
    }

    public boolean f() {
        return this.o;
    }

    public boolean g() {
        return this.k != null && this.k.isOpen();
    }

    public boolean h() {
        return this.k == null;
    }

    public ep i() {
        return this.m;
    }

    public eu j() {
        return this.n;
    }

    public void k() {
        this.k.config().setAutoRead(false);
    }

    public void a(int n) {
        if (n >= 0) {
            if (this.k.pipeline().get("decompress") instanceof ei) {
                ((ei)this.k.pipeline().get("decompress")).a(n);
            } else {
                this.k.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new ei(n));
            }
            if (this.k.pipeline().get("compress") instanceof ej) {
                ((ej)this.k.pipeline().get("decompress")).a(n);
            } else {
                this.k.pipeline().addBefore("encoder", "compress", (ChannelHandler)new ej(n));
            }
        } else {
            if (this.k.pipeline().get("decompress") instanceof ei) {
                this.k.pipeline().remove("decompress");
            }
            if (this.k.pipeline().get("compress") instanceof ej) {
                this.k.pipeline().remove("compress");
            }
        }
    }

    public void l() {
        if (this.k == null || this.k.isOpen()) {
            return;
        }
        if (!this.p) {
            this.p = true;
            if (this.j() != null) {
                this.i().a(this.j());
            } else if (this.i() != null) {
                this.i().a(new fa("Disconnected"));
            }
        } else {
            g.warn("handleDisconnection() called twice");
        }
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.a(channelHandlerContext, (ff)object);
    }

    static class a {
        private final ff a;
        private final GenericFutureListener<? extends Future<? super Void>>[] b;

        public a(ff ff2, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
            this.a = ff2;
            this.b = genericFutureListenerArray;
        }
    }
}
