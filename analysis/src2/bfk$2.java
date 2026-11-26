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

class bfk.2
implements Callable<String> {
    bfk.2() {
    }

    public String a() throws Exception {
        return ((bfk)bfk.this).h.m.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
