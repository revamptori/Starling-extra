/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  java.awt.GraphicsEnvironment
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.io.File
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.Proxy
 *  java.security.KeyPair
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Date
 *  java.util.List
 *  java.util.Queue
 *  java.util.Random
 *  java.util.UUID
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executors
 *  java.util.concurrent.FutureTask
 *  javax.imageio.ImageIO
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer
implements Runnable,
m,
od,
os {
    private static final Logger k = LogManager.getLogger();
    public static final File a = new File("usercache.json");
    private static MinecraftServer l;
    private final atr m;
    private final or n = new or("server", this, MinecraftServer.az());
    private final File o;
    private final List<km> p = Lists.newArrayList();
    protected final l b;
    public final nt c = new nt();
    private final ll q;
    private final js r = new js();
    private final Random s = new Random();
    private int u = -1;
    public le[] d;
    private lx v;
    private boolean w = true;
    private boolean x;
    private int y;
    protected final Proxy e;
    public String f;
    public int g;
    private boolean z;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private String E;
    private int F;
    private int G = 0;
    public final long[] h = new long[100];
    public long[][] i;
    private KeyPair H;
    private String I;
    private String J;
    private String K;
    private boolean L;
    private boolean M;
    private boolean N;
    private String O = "";
    private String P = "";
    private boolean Q;
    private long R;
    private String S;
    private boolean T;
    private boolean U;
    private final YggdrasilAuthenticationService V;
    private final MinecraftSessionService W;
    private long X = 0L;
    private final GameProfileRepository Y;
    private final lt Z;
    protected final Queue<FutureTask<?>> j = Queues.newArrayDeque();
    private Thread aa;
    private long ab = MinecraftServer.az();

    public MinecraftServer(Proxy proxy, File file) {
        this.e = proxy;
        l = this;
        this.o = null;
        this.q = null;
        this.Z = new lt(this, file);
        this.b = null;
        this.m = null;
        this.V = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.W = this.V.createMinecraftSessionService();
        this.Y = this.V.createProfileRepository();
    }

    public MinecraftServer(File file, Proxy proxy, File file2) {
        this.e = proxy;
        l = this;
        this.o = file;
        this.q = new ll(this);
        this.Z = new lt(this, file2);
        this.b = this.h();
        this.m = new atk(file);
        this.V = new YggdrasilAuthenticationService(proxy, UUID.randomUUID().toString());
        this.W = this.V.createMinecraftSessionService();
        this.Y = this.V.createProfileRepository();
    }

    protected bd h() {
        return new bd();
    }

    protected abstract boolean i() throws IOException;

    protected void a(String string) {
        if (this.Y().b(string)) {
            k.info("Converting map!");
            this.b("menu.convertingLevel");
            this.Y().a(string, new nu(){
                private long b = MinecraftServer.az();

                @Override
                public void a(String string) {
                }

                @Override
                public void b(String string) {
                }

                @Override
                public void a(int n2) {
                    if (MinecraftServer.az() - this.b >= 1000L) {
                        this.b = MinecraftServer.az();
                        k.info("Converting... " + n2 + "%");
                    }
                }

                @Override
                public void a() {
                }

                @Override
                public void c(String string) {
                }
            });
        }
    }

    protected synchronized void b(String string) {
        this.S = string;
    }

    public synchronized String j() {
        return this.S;
    }

    protected void a(String string, String string2, long l22, adr adr2, String string3) {
        adp \u26033;
        this.a(string);
        this.b("menu.loadingLevel");
        this.d = new le[3];
        this.i = new long[this.d.length][100];
        atp atp2 = this.m.a(string, true);
        this.a(this.U(), atp2);
        ato \u26032 = atp2.d();
        if (\u26032 == null) {
            if (this.X()) {
                \u26033 = kx.a;
            } else {
                long l22;
                \u26033 = new adp(l22, this.m(), this.l(), this.o(), adr2);
                \u26033.a(string3);
                if (this.M) {
                    \u26033.a();
                }
            }
            \u26032 = new ato(\u26033, string2);
        } else {
            \u26032.a(string2);
            \u26033 = new adp(\u26032);
        }
        for (int i = 0; i < this.d.length; ++i) {
            \u2603 = 0;
            if (i == 1) {
                \u2603 = -1;
            }
            if (i == 2) {
                \u2603 = 1;
            }
            if (i == 0) {
                this.d[i] = this.X() ? (le)new kx(this, atp2, \u26032, \u2603, this.c).b() : (le)new le(this, atp2, \u26032, \u2603, this.c).b();
                this.d[i].a(\u26033);
            } else {
                this.d[i] = (le)new kz(this, atp2, \u2603, this.d[0], this.c).b();
            }
            this.d[i].a(new lb(this, this.d[i]));
            if (this.T()) continue;
            this.d[i].P().a(this.m());
        }
        this.v.a(this.d);
        this.a(this.n());
        this.k();
    }

    protected void k() {
        int n2 = 16;
        \u2603 = 4;
        \u2603 = 192;
        \u2603 = 625;
        \u2603 = 0;
        this.b("menu.generatingTerrain");
        \u2603 = 0;
        k.info("Preparing start region for level " + \u2603);
        le \u26032 = this.d[\u2603];
        cj \u26033 = \u26032.M();
        long \u26034 = MinecraftServer.az();
        for (\u2603 = -192; \u2603 <= 192 && this.v(); \u2603 += 16) {
            for (\u2603 = -192; \u2603 <= 192 && this.v(); \u2603 += 16) {
                long l2 = MinecraftServer.az();
                if (l2 - \u26034 > 1000L) {
                    this.a_("Preparing spawn area", \u2603 * 100 / 625);
                    \u26034 = l2;
                }
                ++\u2603;
                \u26032.b.c(\u26033.n() + \u2603 >> 4, \u26033.p() + \u2603 >> 4);
            }
        }
        this.s();
    }

    protected void a(String string, atp atp2) {
        File file = new File(atp2.b(), "resources.zip");
        if (file.isFile()) {
            this.a_("level://" + string + "/" + file.getName(), "");
        }
    }

    public abstract boolean l();

    public abstract adp.a m();

    public abstract oj n();

    public abstract boolean o();

    public abstract int p();

    public abstract boolean q();

    public abstract boolean r();

    protected void a_(String string, int n2) {
        this.f = string;
        this.g = n2;
        k.info(string + ": " + n2 + "%");
    }

    protected void s() {
        this.f = null;
        this.g = 0;
    }

    protected void a(boolean bl) {
        if (this.N) {
            return;
        }
        for (le le2 : this.d) {
            if (le2 == null) continue;
            if (!bl) {
                k.info("Saving chunks for level '" + le2.P().k() + "'/" + le2.t.k());
            }
            try {
                le2.a(true, null);
            }
            catch (adn adn2) {
                k.warn(adn2.getMessage());
            }
        }
    }

    public void t() {
        if (this.N) {
            return;
        }
        k.info("Stopping server");
        if (this.aq() != null) {
            this.aq().b();
        }
        if (this.v != null) {
            k.info("Saving players");
            this.v.j();
            this.v.u();
        }
        if (this.d != null) {
            k.info("Saving worlds");
            this.a(false);
            for (int i = 0; i < this.d.length; ++i) {
                le le2 = this.d[i];
                le2.o();
            }
        }
        if (this.n.d()) {
            this.n.e();
        }
    }

    public boolean v() {
        return this.w;
    }

    public void w() {
        this.w = false;
    }

    protected void x() {
        l = this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        try {
            if (this.i()) {
                this.ab = MinecraftServer.az();
                long l2 = 0L;
                this.r.a(new fa(this.E));
                this.r.a(new js.c("1.8.9", 47));
                this.a(this.r);
                while (this.w) {
                    \u2603 = MinecraftServer.az();
                    \u2603 = \u2603 - this.ab;
                    if (\u2603 > 2000L && this.ab - this.R >= 15000L) {
                        k.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{\u2603, \u2603 / 50L});
                        \u2603 = 2000L;
                        this.R = this.ab;
                    }
                    if (\u2603 < 0L) {
                        k.warn("Time ran backwards! Did the system time change?");
                        \u2603 = 0L;
                    }
                    l2 += \u2603;
                    this.ab = \u2603;
                    if (this.d[0].f()) {
                        this.A();
                        l2 = 0L;
                    } else {
                        while (l2 > 50L) {
                            l2 -= 50L;
                            this.A();
                        }
                    }
                    Thread.sleep((long)Math.max((long)1L, (long)(50L - l2)));
                    this.Q = true;
                }
            } else {
                this.a((b)null);
            }
        }
        catch (Throwable throwable) {
            k.error("Encountered an unexpected exception", throwable);
            b b2 = null;
            b2 = throwable instanceof e ? this.b(((e)((Object)throwable)).a()) : this.b(new b("Exception in server tick loop", throwable));
            File \u26032 = new File(new File(this.y(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (b2.a(\u26032)) {
                k.error("This crash report has been saved to: " + \u26032.getAbsolutePath());
            } else {
                k.error("We were unable to save this crash report to disk.");
            }
            this.a(b2);
        }
        finally {
            try {
                this.x = true;
                this.t();
            }
            catch (Throwable \u26033) {
                k.error("Exception stopping the server", \u26033);
            }
            finally {
                this.z();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(js js2) {
        File file = this.d("server-icon.png");
        if (file.isFile()) {
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                BufferedImage bufferedImage = ImageIO.read((File)file);
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                ImageIO.write((RenderedImage)bufferedImage, (String)"PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
                ByteBuf \u26032 = Base64.encode((ByteBuf)byteBuf);
                js2.a("data:image/png;base64," + \u26032.toString(Charsets.UTF_8));
            }
            catch (Exception exception) {
                k.error("Couldn't load server icon", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public File y() {
        return new File(".");
    }

    protected void a(b b2) {
    }

    protected void z() {
    }

    public void A() {
        long l2 = System.nanoTime();
        ++this.y;
        if (this.T) {
            this.T = false;
            this.c.a = true;
            this.c.a();
        }
        this.c.a("root");
        this.B();
        if (l2 - this.X >= 5000000000L) {
            this.X = l2;
            this.r.a(new js.a(this.J(), this.I()));
            Object[] objectArray = new GameProfile[Math.min((int)this.I(), (int)12)];
            int \u26032 = ns.a(this.s, 0, this.I() - objectArray.length);
            for (int i = 0; i < objectArray.length; ++i) {
                objectArray[i] = ((lf)this.v.v().get(\u26032 + i)).cd();
            }
            Collections.shuffle((List)Arrays.asList((Object[])objectArray));
            this.r.b().a((GameProfile[])objectArray);
        }
        if (this.y % 900 == 0) {
            this.c.a("save");
            this.v.j();
            this.a(true);
            this.c.b();
        }
        this.c.a("tallying");
        this.h[this.y % 100] = System.nanoTime() - l2;
        this.c.b();
        this.c.a("snooper");
        if (!this.n.d() && this.y > 100) {
            this.n.a();
        }
        if (this.y % 6000 == 0) {
            this.n.b();
        }
        this.c.b();
        this.c.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void B() {
        int n2;
        this.c.a("jobs");
        Queue<FutureTask<?>> queue = this.j;
        synchronized (queue) {
            while (!this.j.isEmpty()) {
                g.a((FutureTask)this.j.poll(), k);
            }
        }
        this.c.c("levels");
        for (n2 = 0; n2 < this.d.length; ++n2) {
            long l2 = System.nanoTime();
            if (n2 == 0 || this.C()) {
                le le2 = this.d[n2];
                this.c.a(le2.P().k());
                if (this.y % 20 == 0) {
                    this.c.a("timeSync");
                    this.v.a(new hu(le2.K(), le2.L(), le2.Q().b("doDaylightCycle")), le2.t.q());
                    this.c.b();
                }
                this.c.a("tick");
                try {
                    le2.c();
                }
                catch (Throwable \u26032) {
                    b b2 = b.a(\u26032, "Exception ticking world");
                    le2.a(b2);
                    throw new e(b2);
                }
                try {
                    le2.i();
                }
                catch (Throwable throwable) {
                    b b3 = b.a(throwable, "Exception ticking world entities");
                    le2.a(b3);
                    throw new e(b3);
                }
                this.c.b();
                this.c.a("tracker");
                le2.s().a();
                this.c.b();
                this.c.b();
            }
            this.i[n2][this.y % 100] = System.nanoTime() - l2;
        }
        this.c.c("connection");
        this.aq().c();
        this.c.c("players");
        this.v.e();
        this.c.c("tickables");
        for (n2 = 0; n2 < this.p.size(); ++n2) {
            ((km)this.p.get(n2)).c();
        }
        this.c.b();
    }

    public boolean C() {
        return true;
    }

    public void D() {
        this.aa = new Thread((Runnable)this, "Server thread");
        this.aa.start();
    }

    public File d(String string) {
        return new File(this.y(), string);
    }

    public void f(String string) {
        k.warn(string);
    }

    public le a(int n2) {
        if (n2 == -1) {
            return this.d[1];
        }
        if (n2 == 1) {
            return this.d[2];
        }
        return this.d[0];
    }

    public String H() {
        return "1.8.9";
    }

    public int I() {
        return this.v.o();
    }

    public int J() {
        return this.v.p();
    }

    public String[] K() {
        return this.v.f();
    }

    public GameProfile[] L() {
        return this.v.g();
    }

    public String getServerModName() {
        return "vanilla";
    }

    public b b(b b2) {
        b2.g().a("Profiler Position", new Callable<String>(){

            public String a() throws Exception {
                return MinecraftServer.this.c.a ? MinecraftServer.this.c.c() : "N/A (disabled)";
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        if (this.v != null) {
            b2.g().a("Player Count", new Callable<String>(){

                public String a() {
                    return MinecraftServer.this.v.o() + " / " + MinecraftServer.this.v.p() + "; " + MinecraftServer.this.v.v();
                }

                public /* synthetic */ Object call() throws Exception {
                    return this.a();
                }
            });
        }
        return b2;
    }

    public List<String> a(m m2, String string2, cj cj2) {
        String string2;
        ArrayList arrayList = Lists.newArrayList();
        if (string2.startsWith("/")) {
            boolean bl = !(string2 = string2.substring(1)).contains((CharSequence)" ");
            List<String> \u26032 = this.b.a(m2, string2, cj2);
            if (\u26032 != null) {
                for (String string3 : \u26032) {
                    if (bl) {
                        arrayList.add((Object)("/" + string3));
                        continue;
                    }
                    arrayList.add((Object)string3);
                }
            }
            return arrayList;
        }
        String[] \u26033 = string2.split(" ", -1);
        \u2603 = \u26033[\u26033.length - 1];
        for (String string4 : this.v.f()) {
            if (!i.a(\u2603, string4)) continue;
            arrayList.add((Object)string4);
        }
        return arrayList;
    }

    public static MinecraftServer N() {
        return l;
    }

    public boolean O() {
        return this.o != null;
    }

    @Override
    public String e_() {
        return "Server";
    }

    @Override
    public void a(eu eu2) {
        k.info(eu2.c());
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    public l P() {
        return this.b;
    }

    public KeyPair Q() {
        return this.H;
    }

    public String S() {
        return this.I;
    }

    public void i(String string) {
        this.I = string;
    }

    public boolean T() {
        return this.I != null;
    }

    public String U() {
        return this.J;
    }

    public void j(String string) {
        this.J = string;
    }

    public void k(String string) {
        this.K = string;
    }

    public String V() {
        return this.K;
    }

    public void a(KeyPair keyPair) {
        this.H = keyPair;
    }

    public void a(oj oj2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            le le2 = this.d[i2];
            if (le2 == null) continue;
            if (le2.P().t()) {
                le2.P().a(oj.d);
                le2.a(true, true);
                continue;
            }
            if (this.T()) {
                le2.P().a(oj2);
                le2.a(le2.aa() != oj.a, true);
                continue;
            }
            le2.P().a(oj2);
            le2.a(this.W(), this.A);
        }
    }

    protected boolean W() {
        return true;
    }

    public boolean X() {
        return this.L;
    }

    public void b(boolean bl) {
        this.L = bl;
    }

    public void c(boolean bl) {
        this.M = bl;
    }

    public atr Y() {
        return this.m;
    }

    public void aa() {
        this.N = true;
        this.Y().d();
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            le le2 = this.d[i2];
            if (le2 == null) continue;
            le2.o();
        }
        this.Y().e(this.d[0].O().g());
        this.w();
    }

    public String ab() {
        return this.O;
    }

    public String ac() {
        return this.P;
    }

    public void a_(String string, String string2) {
        this.O = string;
        this.P = string2;
    }

    @Override
    public void a(or or2) {
        or2.a("whitelist_enabled", false);
        or2.a("whitelist_count", 0);
        if (this.v != null) {
            or2.a("players_current", this.I());
            or2.a("players_max", this.J());
            or2.a("players_seen", this.v.q().length);
        }
        or2.a("uses_auth", this.z);
        or2.a("gui_state", this.as() ? "enabled" : "disabled");
        or2.a("run_time", (MinecraftServer.az() - or2.g()) / 60L * 1000L);
        or2.a("avg_tick_ms", (int)(ns.a(this.h) * 1.0E-6));
        int n2 = 0;
        if (this.d != null) {
            for (\u2603 = 0; \u2603 < this.d.length; ++\u2603) {
                if (this.d[\u2603] == null) continue;
                le le2 = this.d[\u2603];
                ato \u26032 = le2.P();
                or2.a("world[" + n2 + "][dimension]", le2.t.q());
                or2.a("world[" + n2 + "][mode]", (Object)\u26032.r());
                or2.a("world[" + n2 + "][difficulty]", (Object)le2.aa());
                or2.a("world[" + n2 + "][hardcore]", \u26032.t());
                or2.a("world[" + n2 + "][generator_name]", \u26032.u().a());
                or2.a("world[" + n2 + "][generator_version]", \u26032.u().d());
                or2.a("world[" + n2 + "][height]", this.F);
                or2.a("world[" + n2 + "][chunks_loaded]", le2.N().g());
                ++n2;
            }
        }
        or2.a("worlds", n2);
    }

    @Override
    public void b(or or2) {
        or2.b("singleplayer", this.T());
        or2.b("server_brand", this.getServerModName());
        or2.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        or2.b("dedicated", this.ae());
    }

    @Override
    public boolean ad() {
        return true;
    }

    public abstract boolean ae();

    public boolean af() {
        return this.z;
    }

    public void d(boolean bl) {
        this.z = bl;
    }

    public boolean ag() {
        return this.A;
    }

    public void e(boolean bl) {
        this.A = bl;
    }

    public boolean ah() {
        return this.B;
    }

    public abstract boolean ai();

    public void f(boolean bl) {
        this.B = bl;
    }

    public boolean aj() {
        return this.C;
    }

    public void g(boolean bl) {
        this.C = bl;
    }

    public boolean ak() {
        return this.D;
    }

    public void h(boolean bl) {
        this.D = bl;
    }

    public abstract boolean al();

    public String am() {
        return this.E;
    }

    public void l(String string) {
        this.E = string;
    }

    public int an() {
        return this.F;
    }

    public void c(int n2) {
        this.F = n2;
    }

    public boolean ao() {
        return this.x;
    }

    public lx ap() {
        return this.v;
    }

    public void a(lx lx2) {
        this.v = lx2;
    }

    public void a(adp.a a2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            MinecraftServer.N().d[i2].P().a(a2);
        }
    }

    public ll aq() {
        return this.q;
    }

    public boolean ar() {
        return this.Q;
    }

    public boolean as() {
        return false;
    }

    public abstract String a(adp.a var1, boolean var2);

    public int at() {
        return this.y;
    }

    public void au() {
        this.T = true;
    }

    public or av() {
        return this.n;
    }

    @Override
    public cj c() {
        return cj.a;
    }

    @Override
    public aui d() {
        return new aui(0.0, 0.0, 0.0);
    }

    @Override
    public adm e() {
        return this.d[0];
    }

    @Override
    public pk f() {
        return null;
    }

    public int aw() {
        return 16;
    }

    public boolean a(adm adm2, cj cj2, wn wn2) {
        return false;
    }

    public boolean ax() {
        return this.U;
    }

    public Proxy ay() {
        return this.e;
    }

    public static long az() {
        return System.currentTimeMillis();
    }

    public int aA() {
        return this.G;
    }

    public void d(int n2) {
        this.G = n2;
    }

    @Override
    public eu f_() {
        return new fa(this.e_());
    }

    public boolean aB() {
        return true;
    }

    public MinecraftSessionService aD() {
        return this.W;
    }

    public GameProfileRepository aE() {
        return this.Y;
    }

    public lt aF() {
        return this.Z;
    }

    public js aG() {
        return this.r;
    }

    public void aH() {
        this.X = 0L;
    }

    public pk a(UUID uUID) {
        for (le le2 : this.d) {
            if (le2 == null || (\u2603 = le2.a(uUID)) == null) continue;
            return \u2603;
        }
        return null;
    }

    @Override
    public boolean u_() {
        return MinecraftServer.N().d[0].Q().b("sendCommandFeedback");
    }

    @Override
    public void a(n.a a2, int n2) {
    }

    public int aI() {
        return 29999984;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <V> ListenableFuture<V> a(Callable<V> callable2) {
        Validate.notNull(callable2);
        if (!this.aJ() && !this.ao()) {
            ListenableFutureTask listenableFutureTask = ListenableFutureTask.create(callable2);
            Queue<FutureTask<?>> queue = this.j;
            synchronized (queue) {
                this.j.add((Object)listenableFutureTask);
            }
            return listenableFutureTask;
        }
        try {
            Callable<V> callable2;
            return Futures.immediateFuture((Object)callable2.call());
        }
        catch (Exception exception) {
            return Futures.immediateFailedCheckedFuture((Exception)exception);
        }
    }

    @Override
    public ListenableFuture<Object> a(Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.a(Executors.callable((Runnable)runnable));
    }

    @Override
    public boolean aJ() {
        return Thread.currentThread() == this.aa;
    }

    public int aK() {
        return 256;
    }
}
