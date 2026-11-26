/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.util.Collections
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public static class bpq.c {
    private List<bpq.a> b = Lists.newArrayList();
    boolean a;

    public synchronized boolean a() {
        return this.a;
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized List<bpq.a> c() {
        return Collections.unmodifiableList(this.b);
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = bpr.a(string);
        \u2603 = bpr.b(string);
        if (\u2603 == null) {
            return;
        }
        \u2603 = inetAddress.getHostAddress() + ":" + \u2603;
        boolean \u26032 = false;
        for (bpq.a a2 : this.b) {
            if (!a2.b().equals((Object)\u2603)) continue;
            a2.c();
            \u26032 = true;
            break;
        }
        if (!\u26032) {
            this.b.add((Object)new bpq.a(string2, \u2603));
            this.a = true;
        }
    }
}
