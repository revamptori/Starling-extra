/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class wm.1
implements Callable<String> {
    final /* synthetic */ zx a;

    wm.1(zx zx2) {
        this.a = zx2;
    }

    public String a() throws Exception {
        return this.a.q();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
