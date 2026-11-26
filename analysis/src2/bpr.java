/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.net.DatagramPacket
 *  java.net.DatagramSocket
 *  java.net.InetAddress
 *  java.util.concurrent.atomic.AtomicInteger
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpr
extends Thread {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final Logger b = LogManager.getLogger();
    private final String c;
    private final DatagramSocket d;
    private boolean e = true;
    private final String f;

    public bpr(String string, String string2) throws IOException {
        super("LanServerPinger #" + a.incrementAndGet());
        this.c = string;
        this.f = string2;
        this.setDaemon(true);
        this.d = new DatagramSocket();
    }

    public void run() {
        String string = bpr.a(this.c, this.f);
        byte[] \u26032 = string.getBytes();
        while (!this.isInterrupted() && this.e) {
            try {
                InetAddress inetAddress = InetAddress.getByName((String)"224.0.2.60");
                DatagramPacket \u26033 = new DatagramPacket(\u26032, \u26032.length, inetAddress, 4445);
                this.d.send(\u26033);
            }
            catch (IOException iOException) {
                b.warn("LanServerPinger: " + iOException.getMessage());
                break;
            }
            try {
                bpr.sleep((long)1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public void interrupt() {
        super.interrupt();
        this.e = false;
    }

    public static String a(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String a(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        \u2603 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        if (\u2603 < n) {
            return "missing no";
        }
        return string.substring(n + "[MOTD]".length(), \u2603);
    }

    public static String b(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        \u2603 = string.indexOf("[/MOTD]", n + "[/MOTD]".length());
        if (\u2603 >= 0) {
            return null;
        }
        \u2603 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (\u2603 < 0) {
            return null;
        }
        \u2603 = string.indexOf("[/AD]", \u2603 + "[AD]".length());
        if (\u2603 < \u2603) {
            return null;
        }
        return string.substring(\u2603 + "[AD]".length(), \u2603);
    }
}
