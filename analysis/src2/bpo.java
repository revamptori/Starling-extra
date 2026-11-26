/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.Futures
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Queue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpo
extends MinecraftServer {
    private static final Logger k = LogManager.getLogger();
    private final ave l;
    private final adp m;
    private boolean n;
    private boolean o;
    private bpr p;

    public bpo(ave ave2) {
        super(ave2.O(), new File(ave2.v, a.getName()));
        this.l = ave2;
        this.m = null;
    }

    public bpo(ave ave2, String string, String string2, adp adp2) {
        super(new File(ave2.v, "saves"), ave2.O(), new File(ave2.v, a.getName()));
        this.i(ave2.L().c());
        this.j(string);
        this.k(string2);
        this.b(ave2.t());
        this.c(adp2.c());
        this.c(256);
        this.a(new bpn(this));
        this.l = ave2;
        this.m = this.X() ? kx.a : adp2;
    }

    @Override
    protected bd h() {
        return new bpp();
    }

    @Override
    protected void a(String string, String string2, long l2, adr adr2, String string3) {
        this.a(string);
        this.d = new le[3];
        this.i = new long[this.d.length][100];
        atp atp2 = this.Y().a(string, true);
        this.a(this.U(), atp2);
        ato \u26032 = atp2.d();
        if (\u26032 == null) {
            \u26032 = new ato(this.m, string2);
        } else {
            \u26032.a(string2);
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
                this.d[i].a(this.m);
            } else {
                this.d[i] = (le)new kz((MinecraftServer)this, atp2, \u2603, this.d[0], this.c).b();
            }
            this.d[i].a(new lb(this, this.d[i]));
        }
        this.ap().a(this.d);
        if (this.d[0].P().y() == null) {
            this.a(this.l.t.az);
        }
        this.k();
    }

    @Override
    protected boolean i() throws IOException {
        k.info("Starting integrated minecraft server version 1.8.9");
        this.d(true);
        this.e(true);
        this.f(true);
        this.g(true);
        this.h(true);
        k.info("Generating keypair");
        this.a(ng.b());
        this.a(this.U(), this.V(), this.m.d(), this.m.h(), this.m.j());
        this.l(this.S() + " - " + this.d[0].P().k());
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void A() {
        boolean bl = this.n;
        boolean bl2 = this.n = ave.A().u() != null && ave.A().V();
        if (!bl && this.n) {
            k.info("Saving and pausing game...");
            this.ap().j();
            this.a(false);
        }
        if (this.n) {
            Queue queue = this.j;
            synchronized (queue) {
                while (!this.j.isEmpty()) {
                    g.a((FutureTask)this.j.poll(), k);
                }
            }
        } else {
            super.A();
            if (this.l.t.c != this.ap().s()) {
                k.info("Changing view distance to {}, from {}", new Object[]{this.l.t.c, this.ap().s()});
                this.ap().a(this.l.t.c);
            }
            if (this.l.f != null) {
                ato ato2 = this.d[0].P();
                \u2603 = this.l.f.P();
                if (!ato2.z() && \u2603.y() != ato2.y()) {
                    k.info("Changing difficulty to {}, from {}", new Object[]{\u2603.y(), ato2.y()});
                    this.a(\u2603.y());
                } else if (\u2603.z() && !ato2.z()) {
                    k.info("Locking difficulty to {}", new Object[]{\u2603.y()});
                    for (le le2 : this.d) {
                        if (le2 == null) continue;
                        le2.P().e(true);
                    }
                }
            }
        }
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public adp.a m() {
        return this.m.e();
    }

    @Override
    public oj n() {
        return this.l.f.P().y();
    }

    @Override
    public boolean o() {
        return this.m.f();
    }

    @Override
    public boolean q() {
        return true;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public File y() {
        return this.l.v;
    }

    @Override
    public boolean ae() {
        return false;
    }

    @Override
    public boolean ai() {
        return false;
    }

    @Override
    protected void a(b b2) {
        this.l.a(b2);
    }

    @Override
    public b b(b b2) {
        b2 = super.b(b2);
        b2.g().a("Type", new Callable<String>(){

            public String a() throws Exception {
                return "Integrated Server (map_client.txt)";
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        b2.g().a("Is Modded", new Callable<String>(){

            public String a() throws Exception {
                String string = ClientBrandRetriever.getClientModName();
                if (!string.equals((Object)"vanilla")) {
                    return "Definitely; Client brand changed to '" + string + "'";
                }
                string = bpo.this.getServerModName();
                if (!string.equals((Object)"vanilla")) {
                    return "Definitely; Server brand changed to '" + string + "'";
                }
                if (ave.class.getSigners() == null) {
                    return "Very likely; Jar signature invalidated";
                }
                return "Probably not. Jar signature remains and both client + server brands are untouched.";
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        return b2;
    }

    @Override
    public void a(oj oj2) {
        super.a(oj2);
        if (this.l.f != null) {
            this.l.f.P().a(oj2);
        }
    }

    @Override
    public void a(or or2) {
        super.a(or2);
        or2.a("snooper_partner", this.l.I().f());
    }

    @Override
    public boolean ad() {
        return ave.A().ad();
    }

    @Override
    public String a(adp.a a2, boolean bl) {
        try {
            int n2 = -1;
            try {
                n2 = nj.a();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n2 <= 0) {
                n2 = 25564;
            }
            this.aq().a(null, n2);
            k.info("Started on " + n2);
            this.o = true;
            this.p = new bpr(this.am(), n2 + "");
            this.p.start();
            this.ap().a(a2);
            this.ap().c(bl);
            return n2 + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void t() {
        super.t();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    @Override
    public void w() {
        Futures.getUnchecked(this.a(new Runnable(){

            public void run() {
                ArrayList arrayList = Lists.newArrayList(bpo.this.ap().v());
                for (lf lf2 : arrayList) {
                    bpo.this.ap().e(lf2);
                }
            }
        }));
        super.w();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    public void a() {
        this.x();
    }

    public boolean b() {
        return this.o;
    }

    @Override
    public void a(adp.a a2) {
        this.ap().a(a2);
    }

    @Override
    public boolean al() {
        return true;
    }

    @Override
    public int p() {
        return 4;
    }
}
