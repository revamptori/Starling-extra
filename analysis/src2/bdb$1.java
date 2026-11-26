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

class bdb.1
implements Callable<String> {
    bdb.1() {
    }

    public String a() {
        return bdb.this.c.size() + " total; " + bdb.this.c.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
