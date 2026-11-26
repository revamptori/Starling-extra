/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.UnknownHostException
 *  java.util.concurrent.atomic.AtomicInteger
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class awz
extends axu {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final Logger f = LogManager.getLogger();
    private ek g;
    private boolean h;
    private final axu i;

    public awz(axu axu2, ave ave2, bde bde2) {
        this.j = ave2;
        this.i = axu2;
        bdd bdd2 = bdd.a(bde2.b);
        ave2.a((bdb)null);
        ave2.a(bde2);
        this.a(bdd2.a(), bdd2.b());
    }

    public awz(axu axu2, ave ave2, String string, int n) {
        this.j = ave2;
        this.i = axu2;
        ave2.a((bdb)null);
        this.a(string, n);
    }

    private void a(final String string, final int n) {
        f.info("Connecting to " + string + ", " + n);
        new Thread("Server Connector #" + a.incrementAndGet()){

            public void run() {
                InetAddress inetAddress = null;
                try {
                    if (awz.this.h) {
                        return;
                    }
                    inetAddress = InetAddress.getByName((String)string);
                    awz.this.g = ek.a(inetAddress, n, awz.this.j.t.f());
                    awz.this.g.a(new bcx(awz.this.g, awz.this.j, awz.this.i));
                    awz.this.g.a(new jc(47, string, n, el.d));
                    awz.this.g.a(new jl(awz.this.j.L().e()));
                }
                catch (UnknownHostException \u26032) {
                    if (awz.this.h) {
                        return;
                    }
                    f.error("Couldn't connect to server", (Throwable)\u26032);
                    awz.this.j.a(new axh(awz.this.i, "connect.failed", new fb("disconnect.genericReason", "Unknown host")));
                }
                catch (Exception \u26033) {
                    if (awz.this.h) {
                        return;
                    }
                    f.error("Couldn't connect to server", (Throwable)\u26033);
                    String string2 = \u26033.toString();
                    if (inetAddress != null) {
                        \u2603 = inetAddress.toString() + ":" + n;
                        string2 = string2.replaceAll(\u2603, "");
                    }
                    awz.this.j.a(new axh(awz.this.i, "connect.failed", new fb("disconnect.genericReason", string2)));
                }
            }
        }.start();
    }

    @Override
    public void e() {
        if (this.g != null) {
            if (this.g.g()) {
                this.g.a();
            } else {
                this.g.l();
            }
        }
    }

    @Override
    protected void a(char c2, int n) {
    }

    @Override
    public void b() {
        this.n.clear();
        this.n.add((Object)new avs(0, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(avs avs2) {
        if (avs2.k == 0) {
            this.h = true;
            if (this.g != null) {
                this.g.a(new fa("Aborted"));
            }
            this.j.a(this.i);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        if (this.g == null) {
            this.a(this.q, bnq.a("connect.connecting", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        } else {
            this.a(this.q, bnq.a("connect.authorizing", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        }
        super.a(n, n2, f);
    }
}
