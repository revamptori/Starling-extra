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

class bdb.2
implements Callable<String> {
    bdb.2() {
    }

    public String a() {
        return bdb.this.d.size() + " total; " + bdb.this.d.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
