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
package net.minecraft.realms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.realms.DisconnectedRealmsScreen;
import net.minecraft.realms.Realms;

class RealmsConnect.1
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    RealmsConnect.1(String string, String string2, int n) {
        this.a = string2;
        this.b = n;
        super(string);
    }

    public void run() {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName((String)this.a);
            if (RealmsConnect.this.aborted) {
                return;
            }
            RealmsConnect.this.connection = ek.a(inetAddress, this.b, ave.A().t.f());
            if (RealmsConnect.this.aborted) {
                return;
            }
            RealmsConnect.this.connection.a(new bcx(RealmsConnect.this.connection, ave.A(), RealmsConnect.this.onlineScreen.getProxy()));
            if (RealmsConnect.this.aborted) {
                return;
            }
            RealmsConnect.this.connection.a(new jc(47, this.a, this.b, el.d));
            if (RealmsConnect.this.aborted) {
                return;
            }
            RealmsConnect.this.connection.a(new jl(ave.A().L().e()));
        }
        catch (UnknownHostException \u26032) {
            Realms.clearResourcePack();
            if (RealmsConnect.this.aborted) {
                return;
            }
            LOGGER.error("Couldn't connect to world", (Throwable)\u26032);
            ave.A().R().f();
            Realms.setScreen(new DisconnectedRealmsScreen(RealmsConnect.this.onlineScreen, "connect.failed", new fb("disconnect.genericReason", "Unknown host '" + this.a + "'")));
        }
        catch (Exception \u26033) {
            Realms.clearResourcePack();
            if (RealmsConnect.this.aborted) {
                return;
            }
            LOGGER.error("Couldn't connect to world", (Throwable)\u26033);
            String string = \u26033.toString();
            if (inetAddress != null) {
                \u2603 = inetAddress.toString() + ":" + this.b;
                string = string.replaceAll(\u2603, "");
            }
            Realms.setScreen(new DisconnectedRealmsScreen(RealmsConnect.this.onlineScreen, "connect.failed", new fb("disconnect.genericReason", string)));
        }
    }
}
