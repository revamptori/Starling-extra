/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.DatagramPacket
 *  java.net.InetAddress
 *  java.net.MulticastSocket
 *  java.net.SocketTimeoutException
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public static class bpq.b
extends Thread {
    private final bpq.c a;
    private final InetAddress b;
    private final MulticastSocket c;

    public bpq.b(bpq.c c2) throws IOException {
        super("LanServerDetector #" + a.incrementAndGet());
        this.a = c2;
        this.setDaemon(true);
        this.c = new MulticastSocket(4445);
        this.b = InetAddress.getByName((String)"224.0.2.60");
        this.c.setSoTimeout(5000);
        this.c.joinGroup(this.b);
    }

    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.c.receive(datagramPacket);
            }
            catch (SocketTimeoutException \u26032) {
                continue;
            }
            catch (IOException \u26033) {
                b.error("Couldn't ping server", (Throwable)\u26033);
                break;
            }
            String \u26034 = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            b.debug(datagramPacket.getAddress() + ": " + \u26034);
            this.a.a(\u26034, datagramPacket.getAddress());
        }
        try {
            this.c.leaveGroup(this.b);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.c.close();
    }
}
