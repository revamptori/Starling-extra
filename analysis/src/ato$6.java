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

class ato.6
implements Callable<String> {
    ato.6() {
    }

    public String a() throws Exception {
        return String.valueOf((int)ato.this.m);
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
