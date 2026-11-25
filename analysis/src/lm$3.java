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

class lm.3
implements Callable<String> {
    final /* synthetic */ ff a;

    lm.3(ff ff2) {
        this.a = ff2;
    }

    public String a() throws Exception {
        return this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
