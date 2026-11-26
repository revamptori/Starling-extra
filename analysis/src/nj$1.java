/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.Proxy
 *  java.util.Map
 */
import java.io.File;
import java.net.Proxy;
import java.util.Map;

static final class nj.1
implements Runnable {
    final /* synthetic */ nu a;
    final /* synthetic */ String b;
    final /* synthetic */ Proxy c;
    final /* synthetic */ Map d;
    final /* synthetic */ File e;
    final /* synthetic */ int f;

    nj.1(nu nu2, String string, Proxy proxy, Map map, File file, int n) {
        this.a = nu2;
        this.b = string;
        this.c = proxy;
        this.d = map;
        this.e = file;
        this.f = n;
    }

    /*
     * Exception decompiling
     */
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 10[WHILELOOP]
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1425399)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:3007643)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:2355268)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:935200)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:420409)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:2100477)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1145698)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1131922)
         *     at java.lang.Throwable$FakeClass.fakeMethod(Throwable.java:1117704)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}
