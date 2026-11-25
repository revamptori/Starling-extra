/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.net.UnknownHostException
 */
import java.net.UnknownHostException;

class azk.1
implements Runnable {
    azk.1() {
    }

    public void run() {
        try {
            azk.this.e.g().a(azk.this.g);
        }
        catch (UnknownHostException unknownHostException) {
            ((azk)azk.this).g.e = -1L;
            ((azk)azk.this).g.d = (Object)((Object)a.e) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            ((azk)azk.this).g.e = -1L;
            ((azk)azk.this).g.d = (Object)((Object)a.e) + "Can't connect to server.";
        }
    }
}
