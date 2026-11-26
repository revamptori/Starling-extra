/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Queue
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bho {
    private static final Logger a = LogManager.getLogger();
    private static final ThreadFactory b = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
    private final List<bhp> c = Lists.newArrayList();
    private final BlockingQueue<bhn> d = Queues.newArrayBlockingQueue((int)100);
    private final BlockingQueue<bfg> e = Queues.newArrayBlockingQueue((int)5);
    private final bfe f = new bfe();
    private final bfz g = new bfz();
    private final Queue<ListenableFutureTask<?>> h = Queues.newArrayDeque();
    private final bhp i;

    public bho() {
        int n;
        for (n = 0; n < 2; ++n) {
            bhp bhp2 = new bhp(this);
            Thread \u26032 = b.newThread((Runnable)bhp2);
            \u26032.start();
            this.c.add((Object)bhp2);
        }
        for (n = 0; n < 5; ++n) {
            this.e.add((Object)new bfg());
        }
        this.i = new bhp(this, new bfg());
    }

    public String a() {
        return String.format((String)"pC: %03d, pU: %1d, aB: %1d", (Object[])new Object[]{this.d.size(), this.h.size(), this.e.size()});
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l) {
        boolean bl = false;
        do {
            \u2603 = false;
            Queue<ListenableFutureTask<?>> queue = this.h;
            synchronized (queue) {
                if (!this.h.isEmpty()) {
                    ((ListenableFutureTask)this.h.poll()).run();
                    \u2603 = true;
                    bl = true;
                }
            }
        } while (l != 0L && \u2603 && (\u2603 = l - System.nanoTime()) >= 0L);
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(bht bht2) {
        bht2.c().lock();
        try {
            final bhn bhn2 = bht2.d();
            bhn2.a(new Runnable(){

                public void run() {
                    bho.this.d.remove((Object)bhn2);
                }
            });
            boolean \u26032 = this.d.offer((Object)bhn2);
            if (!\u26032) {
                bhn2.e();
            }
            boolean bl = \u26032;
            return bl;
        }
        finally {
            bht2.c().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(bht bht22) {
        bht22.c().lock();
        try {
            bhn bhn2 = bht22.d();
            try {
                this.i.a(bhn2);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            boolean bl = true;
            return bl;
        }
        finally {
            bht bht22;
            bht22.c().unlock();
        }
    }

    public void b() {
        this.e();
        while (this.a(0L)) {
        }
        ArrayList arrayList = Lists.newArrayList();
        while (arrayList.size() != 5) {
            try {
                arrayList.add((Object)this.c());
            }
            catch (InterruptedException interruptedException) {}
        }
        this.e.addAll((Collection)arrayList);
    }

    public void a(bfg bfg2) {
        this.e.add((Object)bfg2);
    }

    public bfg c() throws InterruptedException {
        return (bfg)this.e.take();
    }

    public bhn d() throws InterruptedException {
        return (bhn)this.d.take();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(bht bht22) {
        bht22.c().lock();
        try {
            final bhn bhn2 = bht22.e();
            if (bhn2 != null) {
                bhn2.a(new Runnable(){

                    public void run() {
                        bho.this.d.remove((Object)bhn2);
                    }
                });
                boolean bl = this.d.offer((Object)bhn2);
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            bht bht22;
            bht22.c().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture<Object> a(final adf adf2, final bfd bfd2, final bht bht2, final bhq bhq2) {
        if (ave.A().aJ()) {
            if (bqs.f()) {
                this.a(bfd2, bht2.b(adf2.ordinal()));
            } else {
                this.a(bfd2, ((bhs)bht2).a(adf2, bhq2), bht2);
            }
            bfd2.c(0.0, 0.0, 0.0);
            return Futures.immediateFuture(null);
        }
        ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Runnable)new Runnable(){

            public void run() {
                bho.this.a(adf2, bfd2, bht2, bhq2);
            }
        }, null);
        Queue<ListenableFutureTask<?>> queue = this.h;
        synchronized (queue) {
            this.h.add((Object)listenableFutureTask);
        }
        return listenableFutureTask;
    }

    private void a(bfd bfd2, int n2, bht bht2) {
        GL11.glNewList((int)n2, (int)4864);
        bfl.E();
        bht2.f();
        this.f.a(bfd2);
        bfl.F();
        GL11.glEndList();
    }

    private void a(bfd bfd2, bmt bmt2) {
        this.g.a(bmt2);
        this.g.a(bfd2);
    }

    public void e() {
        while (!this.d.isEmpty()) {
            bhn bhn2 = (bhn)this.d.poll();
            if (bhn2 == null) continue;
            bhn2.e();
        }
    }
}
