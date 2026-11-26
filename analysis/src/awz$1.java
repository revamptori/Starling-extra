/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.UnknownHostException
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

class awz.1
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    awz.1(String string, String string2, int n) {
        this.a = string2;
        this.b = n;
        super(string);
    }

    public void run() {
        InetAddress inetAddress = null;
        try {
            if (awz.this.h) {
                return;
            }
            inetAddress = InetAddress.getByName((String)this.a);
            awz.this.g = ek.a(inetAddress, this.b, awz.this.j.t.f());
            awz.this.g.a(new bcx(awz.this.g, awz.this.j, awz.this.i));
            awz.this.g.a(new jc(47, this.a, this.b, el.d));
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
            String string = \u26033.toString();
            if (inetAddress != null) {
                \u2603 = inetAddress.toString() + ":" + this.b;
                string = string.replaceAll(\u2603, "");
            }
            awz.this.j.a(new axh(awz.this.i, "connect.failed", new fb("disconnect.genericReason", string)));
        }
    }
}
